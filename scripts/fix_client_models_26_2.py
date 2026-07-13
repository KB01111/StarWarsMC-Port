#!/usr/bin/env python3
"""Bulk-fix MC 26.2 client model builder API in compiled client sources."""
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port\fabric\src\client\java\che\swgc\client")

DIRS = [
    ROOT / "model" / "item",
    ROOT / "model" / "armor",
    ROOT / "model",
    ROOT / "renderer" / "item",
    ROOT / "compat",
]

REPLACEMENTS = [
    ("net.minecraft.client.player.AbstractLocalPlayer", "net.minecraft.client.player.LocalPlayer"),
    ("net.minecraft.client.renderer.VertexConsumer", "com.mojang.blaze3d.vertex.VertexConsumer"),
    ("RenderType::getEntityCutoutNoCull", "RenderTypes::entityCutout"),
    ("RenderType.getEntityCutoutNoCull(", "RenderTypes.entityCutout("),
    ("RenderType.getArmorCutoutNoCull(", "RenderTypes.armorCutoutNoCull("),
    ("RenderType.getEntitySolid(", "RenderTypes.entitySolid("),
    ("RenderType.getEntityTranslucentEmissive(", "RenderTypes.entityTranslucentEmissive("),
    ("RenderType.getBeaconBeam(", "RenderTypes.beaconBeam("),
    ("RenderType.getLightning()", "RenderTypes.lightning()"),
    ("RenderType.getDebugQuads()", "RenderTypes.debugQuads()"),
    (".mirrored(false)", ".mirror(false)"),
    (".mirrored()", ".mirror()"),
    ("PartPose.of(", "PartPose.offsetAndRotation("),
    ("PartPose.pivot(", "PartPose.offset("),
    (".uv(", ".texOffs("),
    ("LayerDefinition.of(", "LayerDefinition.create("),
    (".addChild(", ".addOrReplaceChild("),

def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    original = text
    for old, new in REPLACEMENTS:
        text = text.replace(old, new)
    if text != original:
        path.write_text(text, encoding="utf-8")
        return True
    return False

def main() -> None:
    changed = 0
    for base in DIRS:
        if not base.exists():
            continue
        for path in base.rglob("*.java"):
            if fix_file(path):
                print(f"fixed: {path.relative_to(ROOT.parent.parent.parent.parent)}")
                changed += 1
    print(f"done, {changed} files updated")

if __name__ == "__main__":
    main()
