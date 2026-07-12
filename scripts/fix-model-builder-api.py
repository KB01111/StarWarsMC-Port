#!/usr/bin/env python3
"""Fix MC 26.2 model builder API renames in fabric client sources."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    (".uv(", ".texOffs("),
    (".mirrored()", ".mirror()"),
    (".mirrored(false)", ".mirror(false)"),
    (".mirrored(true)", ".mirror(true)"),
    ("PartPose.pivot(", "PartPose.offset("),
    (".cuboid(", ".addBox("),
    (".addChild(", ".addOrReplaceChild("),
    ("PartPose.of(", "PartPose.offsetAndRotation("),
    ("PartPose.NONE", "PartPose.ZERO"),
    ("LayerDefinition.of(", "LayerDefinition.create("),
    ("resetTransform", "resetPose"),
    (".rotate(poseStack)", ".translateAndRotate(poseStack)"),
)

for path in ROOT.rglob("*.java"):
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)
    if updated != text:
        path.write_text(updated, encoding="utf-8")
        print(path.relative_to(ROOT.parent.parent))
