#!/usr/bin/env python3
"""Split decompiled SWGC sources into common + fabric Gradle modules."""
import argparse
import shutil
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
DECOMPILED = ROOT / "remapped" / "che" / "swgc"

COMMON_JAVA = ROOT / "common" / "src" / "main" / "java" / "che" / "swgc"
FABRIC_JAVA = ROOT / "fabric" / "src" / "main" / "java" / "che" / "swgc"
FABRIC_CLIENT = ROOT / "fabric" / "src" / "client" / "java" / "che" / "swgc"
COMMON_RES = ROOT / "common" / "src" / "main" / "resources"
FABRIC_RES = ROOT / "fabric" / "src" / "main" / "resources"

COMMON_PACKAGES = {
    "block",
    "block/entity",
    "entity",
    "force",
    "item",
    "levelgen/structure",
    "network",
    "platform/services",
    "reg",
}
COMMON_ROOT_FILES = {
    "CommonClass.java",
    "Constants.java",
    "SuperGodDangLightsaberSoundizer.java",
    "SwgcComponents.java",
    "SwgcHooks.java",
    "SwgcUtils.java",
}
COMMON_MIXINS = {"MixinLivingEntity.java", "MixinPlayer.java"}

FABRIC_PACKAGES = {"platform"}
FABRIC_ROOT_FILES = {
    "FabricCommonClass.java",
    "FabricNetworking.java",
}

CLIENT_PACKAGES = {
    "client",
    "client/animation",
    "client/gui",
    "client/model",
    "client/model/armor",
    "client/model/entity",
    "client/model/item",
    "client/renderer/blockentity",
    "client/renderer/entity",
    "client/renderer/entity/layer",
    "client/renderer/item",
    "client/sound",
}

CLIENT_MIXINS = {
    "MixinCapeLayer.java",
    "MixinMinecraft.java",
    "MixinMouseHandler.java",
    "MixinPlayerModel.java",
    "MixinTitleScreen.java",
    "FabricMixinAbstractClientPlayer.java",
    "FabricMixinGameRenderer.java",
    "FabricMixinItemInHandRenderer.java",
    "FabricMixinLivingEntityRenderer.java",
    "FabricMixinMinecraft.java",
    "FabricMixinMouseHandler.java",
    "FabricMixinPlayerRenderer.java",
    "FabricMixinVideoSettingsScreen.java",
}

FABRIC_MIXINS = {"FabricMixinPlayer.java"}


def parse_args():
    parser = argparse.ArgumentParser(description="Split remapped sources into Gradle modules.")
    parser.add_argument(
        "--merge-only",
        action="store_true",
        help="Only copy files that do not already exist in the port tree",
    )
    parser.add_argument(
        "--full-replace",
        action="store_true",
        help="Wipe module source dirs before copying (destructive)",
    )
    return parser.parse_args()


def clean_dir(d: Path):
    if d.exists():
        shutil.rmtree(d)
    d.mkdir(parents=True, exist_ok=True)


def copy_tree(src: Path, dst: Path, merge_only: bool = False):
    if src.is_dir():
        for item in src.rglob("*"):
            rel = item.relative_to(src)
            target = dst / rel
            if item.is_dir():
                target.mkdir(parents=True, exist_ok=True)
            elif not merge_only or not target.exists():
                target.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(item, target)
    elif src.is_file() and (not merge_only or not dst.exists()):
        dst.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(src, dst)


def main():
    args = parse_args()
    merge_only = args.merge_only or not args.full_replace

    if args.full_replace:
        for d in [COMMON_JAVA, FABRIC_JAVA, FABRIC_CLIENT]:
            clean_dir(d)
        if COMMON_RES.exists():
            shutil.rmtree(COMMON_RES)
        COMMON_RES.mkdir(parents=True, exist_ok=True)
        if FABRIC_RES.exists():
            shutil.rmtree(FABRIC_RES)
        FABRIC_RES.mkdir(parents=True, exist_ok=True)

    for pkg in COMMON_PACKAGES:
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            copy_tree(src, COMMON_JAVA / Path(*pkg.split("/")), merge_only)

    for f in COMMON_ROOT_FILES:
        src = DECOMPILED / f
        if src.exists():
            copy_tree(src, COMMON_JAVA / f, merge_only)

    mixin_src = DECOMPILED / "mixin"
    common_mixin_dst = COMMON_JAVA / "mixin"
    common_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in COMMON_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, common_mixin_dst / f, merge_only)

    for pkg in FABRIC_PACKAGES:
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            copy_tree(src, FABRIC_JAVA / Path(*pkg.split("/")), merge_only)

    for f in FABRIC_ROOT_FILES:
        src = DECOMPILED / f
        if src.exists():
            copy_tree(src, FABRIC_JAVA / f, merge_only)

    fabric_mixin_dst = FABRIC_JAVA / "mixin"
    fabric_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in FABRIC_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, fabric_mixin_dst / f, merge_only)

    for pkg in CLIENT_PACKAGES:
        src = DECOMPILED / Path(*pkg.split("/"))
        if src.exists():
            copy_tree(src, FABRIC_CLIENT / Path(*pkg.split("/")), merge_only)

    client_mixin_dst = FABRIC_CLIENT / "mixin"
    client_mixin_dst.mkdir(parents=True, exist_ok=True)
    for f in CLIENT_MIXINS:
        if (mixin_src / f).exists():
            copy_tree(mixin_src / f, client_mixin_dst / f, merge_only)

    for subdir in ["assets", "data"]:
        src = ROOT / subdir
        if src.exists():
            copy_tree(src, COMMON_RES / subdir, merge_only=True)

    if (ROOT / "pack.mcmeta").exists():
        dst = COMMON_RES / "pack.mcmeta"
        if not merge_only or not dst.exists():
            copy_tree(ROOT / "pack.mcmeta", dst, merge_only=False)

    for fname in ["fabric.mod.json", "swgc.mixins.json", "swgc.fabric.mixins.json", "swgc.refmap.json"]:
        src = ROOT / fname
        if src.exists():
            copy_tree(src, FABRIC_RES / fname, merge_only=True)

    services_src = ROOT / "META-INF" / "services"
    if services_src.exists():
        copy_tree(services_src, FABRIC_RES / "META-INF" / "services", merge_only=True)

    common_java = list(COMMON_JAVA.rglob("*.java"))
    fabric_java = list(FABRIC_JAVA.rglob("*.java"))
    client_java = list(FABRIC_CLIENT.rglob("*.java"))
    print(f"Common: {len(common_java)} Java files")
    print(f"Fabric main: {len(fabric_java)} Java files")
    print(f"Fabric client: {len(client_java)} Java files")
    print(f"Total: {len(common_java) + len(fabric_java) + len(client_java)}")
    print(f"Mode: {'merge-only' if merge_only else 'full-replace'}")


if __name__ == "__main__":
    main()
