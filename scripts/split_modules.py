#!/usr/bin/env python3
"""Split decompiled SWGC sources into common + fabric Gradle modules."""
import shutil
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
DECOMPILED = ROOT / "remapped" / "che" / "swgc"

COMMON_JAVA = ROOT / "common" / "src" / "main" / "java" / "che" / "swgc"
FABRIC_JAVA = ROOT / "fabric" / "src" / "main" / "java" / "che" / "swgc"
FABRIC_CLIENT = ROOT / "fabric" / "src" / "client" / "java" / "che" / "swgc"
COMMON_RES = ROOT / "common" / "src" / "main" / "resources"
FABRIC_RES = ROOT / "fabric" / "src" / "main" / "resources"

# Packages/files that stay in common
COMMON_PACKAGES = {
    "block", "block/entity", "entity", "force", "item", "levelgen/structure",
    "network", "platform/services", "reg",
}
COMMON_ROOT_FILES = {
    "CommonClass.java", "Constants.java", "SuperGodDangLightsaberSoundizer.java",
    "SwgcComponents.java", "SwgcHooks.java", "SwgcUtils.java",
}
COMMON_MIXINS = {"MixinLivingEntity.java", "MixinPlayer.java"}

# Packages that go to fabric main
FABRIC_PACKAGES = {"platform"}
FABRIC_ROOT_FILES = {
    "FabricCommonClass.java", "FabricClientClass.java", "FabricNetworking.java",
}

# Client-only packages (fabric client source set)
CLIENT_PACKAGES = {
    "client", "client/animation", "client/gui", "client/model",
    "client/model/armor", "client/model/entity", "client/model/item",
    "client/renderer/blockentity", "client/renderer/entity",
    "client/renderer/entity/layer", "client/renderer/item", "client/sound",
}

# Client mixins in fabric client
CLIENT_MIXINS = {
    "MixinCapeLayer.java", "MixinMinecraft.java", "MixinMouseHandler.java",
    "MixinPlayerModel.java", "MixinTitleScreen.java",
    "FabricMixinAbstractClientPlayer.java", "FabricMixinGameRenderer.java",
    "FabricMixinItemInHandRenderer.java", "FabricMixinLivingEntityRenderer.java",
    "FabricMixinMinecraft.java", "FabricMixinMouseHandler.java",
    "FabricMixinPlayerRenderer.java", "FabricMixinVideoSettingsScreen.java",
}

# Fabric main mixins
FABRIC_MIXINS = {"FabricMixinPlayer.java"}


def clean_dir(d: Path):
    if d.exists():
        shutil.rmtree(d)
    d.mkdir(parents=True, exist_ok=True)


def copy_tree(src: Path, dst: Path):
    if src.is_dir():
        shutil.copytree(src, dst, dirs_exist_ok=True)
    elif src.is_file():
        dst.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(src, dst)


def main():
    # Clean target dirs
    for d in [COMMON_JAVA, FABRIC_JAVA, FABRIC_CLIENT, COMMON_RES, FABRIC_RES]:
        if d.exists() and d.name != "resources":
            clean_dir(d)
        elif "resources" in str(d):
            if d.exists():
                shutil.rmtree(d)
            d.mkdir(parents=True, exist_ok=True)

    # Copy common packages
    for pkg in COMMON_PACKAGES:
        src = DECOMPILED / pkg.replace("/", "\\") if "/" not in pkg else DECOMPILED / Path(*pkg.split("/"))
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            dst = COMMON_JAVA / Path(*pkg.split("/"))
            copy_tree(src, dst)

    # Common root files
    for f in COMMON_ROOT_FILES:
        src = DECOMPILED / f
        if src.exists():
            copy_tree(src, COMMON_JAVA / f)

    # Common mixins
    mixin_src = DECOMPILED / "mixin"
    common_mixin_dst = COMMON_JAVA / "mixin"
    common_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in COMMON_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, common_mixin_dst / f)

    # Fabric packages
    for pkg in FABRIC_PACKAGES:
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            dst = FABRIC_JAVA / Path(*pkg.split("/"))
            copy_tree(src, dst)

    # Fabric root files
    for f in FABRIC_ROOT_FILES:
        src = DECOMPILED / f
        if src.exists():
            copy_tree(src, FABRIC_JAVA / f)

    # Fabric main mixins
    fabric_mixin_dst = FABRIC_JAVA / "mixin"
    fabric_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in FABRIC_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, fabric_mixin_dst / f)

    # Client packages
    for pkg in CLIENT_PACKAGES:
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            dst = FABRIC_CLIENT / Path(*pkg.split("/"))
            copy_tree(src, dst)

    # Client mixins
    client_mixin_dst = FABRIC_CLIENT / "mixin"
    client_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in CLIENT_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, client_mixin_dst / f)

    # Copy shared resources to common
    for subdir in ["assets", "data"]:
        src = ROOT / subdir
        if src.exists():
            copy_tree(src, COMMON_RES / subdir)

    if (ROOT / "pack.mcmeta").exists():
        copy_tree(ROOT / "pack.mcmeta", COMMON_RES / "pack.mcmeta")

    # Fabric-specific resources
    for fname in ["fabric.mod.json", "swgc.mixins.json", "swgc.fabric.mixins.json", "swgc.refmap.json"]:
        src = ROOT / fname
        if src.exists():
            copy_tree(src, FABRIC_RES / fname)

    # Copy META-INF services to fabric
    services_src = ROOT / "META-INF" / "services"
    if services_src.exists():
        copy_tree(services_src, FABRIC_RES / "META-INF" / "services")

    # Common Services stub (implementation loaded via SPI in fabric)
    services_stub = COMMON_JAVA / "platform" / "Services.java"
    services_stub.parent.mkdir(parents=True, exist_ok=True)
    services_stub.write_text("""package che.swgc.platform;

import che.swgc.platform.services.IItems;
import che.swgc.platform.services.IPlatformHelper;
import che.swgc.platform.services.IRegisters;
import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IRegisters REGISTERS = load(IRegisters.class);
    public static final IItems ITEMS = load(IItems.class);

    private Services() {}

    public static <T> T load(Class<T> clazz) {
        return ServiceLoader.load(clazz).findFirst()
            .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
    }
}
""", encoding="utf-8")

    # Common client stub (not in decompiled jar)
    stub = COMMON_JAVA / "client" / "SwgcClientUtils.java"
    stub.parent.mkdir(parents=True, exist_ok=True)
    stub.write_text("""package che.swgc.client;

import che.swgc.entity.CommandableMob;
import che.swgc.entity.StarFighter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;

public final class SwgcClientUtils {
    private SwgcClientUtils() {}
    public static void tryStartLightsaberHum(LivingEntity entity, SoundEvent sound) {}
    public static void startStarFighterNoise(StarFighter fighter) {}
    public static void openDroidScreen(CommandableMob mob) {}
}
""", encoding="utf-8")

    # Count files
    common_java = list(COMMON_JAVA.rglob("*.java"))
    fabric_java = list(FABRIC_JAVA.rglob("*.java"))
    client_java = list(FABRIC_CLIENT.rglob("*.java"))
    print(f"Common: {len(common_java)} Java files")
    print(f"Fabric main: {len(fabric_java)} Java files")
    print(f"Fabric client: {len(client_java)} Java files")
    print(f"Total: {len(common_java) + len(fabric_java) + len(client_java)}")


if __name__ == "__main__":
    main()
