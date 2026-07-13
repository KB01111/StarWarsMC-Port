from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java"

REPLACEMENTS = [
    ("import net.minecraft.client.renderer.VertexConsumer;", "import com.mojang.blaze3d.vertex.VertexConsumer;"),
    ("net.minecraft.client.renderer.VertexConsumer", "com.mojang.blaze3d.vertex.VertexConsumer"),
    ("net.minecraft.core.ColorHelper.Argb", "net.minecraft.util.ARGB"),
    (".next();", ";"),
    ("super(renderType);", "super(root, renderType);"),
]

for path in ROOT.rglob("*.java"):
    if "compat/animation" in path.as_posix():
        continue
    text = path.read_text(encoding="utf-8")
    original = text
    for old, new in REPLACEMENTS:
        text = text.replace(old, new)
    if "FrogSaberModel.java" in path.name:
        text = text.replace("import che.swgc.client.animation.FrogSaberAnimation;\n", "")
        text = text.replace(
            "this.animateMovement(this.activation > 0.0F ? FrogSaberAnimation.WORK : FrogSaberAnimation.IDLE, ageInTicks, 1.0F, 1.0F, 1.0F);\n",
            "",
        )
    if path.name == "PlasmaRodModel.java":
        text = text.replace(
            "int layers = (Integer)SwgcOptions.getInstance().lightsaberDetailing.getValue();",
            "int layers = 3;",
        )
        text = text.replace(
            ", red, green, blue, alpha)",
            ", net.minecraft.util.ARGB.color((int)(alpha * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F)))",
        )
        text = text.replace(
            ", red, green, blue, alpha / (float)i)",
            ", net.minecraft.util.ARGB.color((int)(alpha / (float)i * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F)))",
        )
    if path.name in {"BlasterModel.java", "EwokSpearModel.java", "EwokStaffModel.java", "ForcePikeModel.java"}:
        text = text.replace(
            "this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);",
            "this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, net.minecraft.util.ARGB.color((int)(alpha * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F)));",
        )
    if text != original:
        path.write_text(text, encoding="utf-8")
        print(f"updated {path.relative_to(ROOT)}")
