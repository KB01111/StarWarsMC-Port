#!/usr/bin/env python3
"""Apply MC 26.2 SubmitNodeCollector render API bulk fixes."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java"

REPLACEMENTS = [
    ("net.minecraft.client.renderer.MultiBufferSource", "net.minecraft.client.renderer.SubmitNodeCollector"),
    ("setupTransforms(", "setupRotations("),
    ("net.minecraft.client.renderer.entity.layers.FeatureRenderer", "net.minecraft.client.renderer.entity.layers.RenderLayer"),
    ("net.minecraft.client.renderer.entity.layers.CapeFeatureRenderer", "net.minecraft.client.renderer.entity.layers.CapeLayer"),
    ("net.minecraft.client.renderer.BufferBuilder", "com.mojang.blaze3d.vertex.BufferBuilder"),
    ("net.minecraft.client.renderer.Tessellator", "com.mojang.blaze3d.vertex.Tessellator"),
    ("net.minecraft.client.renderer.VertexFormats", "com.mojang.blaze3d.vertex.DefaultVertexFormat"),
    ("net.minecraft.client.renderer.VertexFormat.DrawMode", "com.mojang.blaze3d.vertex.VertexFormat.Mode"),
    ("net.minecraft.client.Mouse", "net.minecraft.client.MouseHandler"),
    ("extends che.swgc.client.render.SwgcMobRenderer<", "extends che.swgc.client.render.SwgcMobRenderer<"),
]

SETUP_OLD = re.compile(
    r"public void setupAnim\(che\.swgc\.client\.render\.SwgcMobRenderState state, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch\) \{\n"
    r"(?:      [^\n]+\n)?",
    re.MULTILINE,
)


def convert_setup_anim(text: str) -> str:
    marker = "public void setupAnim(che.swgc.client.render.SwgcMobRenderState state, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {"
    if marker not in text:
        return text
    return text.replace(
        marker,
        "public void setupAnim(che.swgc.client.render.SwgcMobRenderState state) {\n"
        "      super.setupAnim(state);\n"
        "      float limbSwing = state.walkAnimationPos;\n"
        "      float limbSwingAmount = state.walkAnimationSpeed;\n"
        "      float ageInTicks = state.ageInTicks;\n"
        "      float netHeadYaw = state.yRot;\n"
        "      float headPitch = state.xRot;\n",
    )


def remove_prepare_mob_model(text: str) -> str:
    pattern = r"\n   public void prepareMobModel\(T entity[^\)]*\) \{"
    match = re.search(pattern, text)
    if not match:
        return text

    start_pos = match.start()
    brace_pos = match.end()
    depth = 1
    i = brace_pos

    while i < len(text) and depth > 0:
        if text[i] == '{':
            depth += 1
        elif text[i] == '}':
            depth -= 1
        i += 1

    if depth == 0:
        end_pos = i
        while end_pos < len(text) and text[end_pos] in ' \t':
            end_pos += 1
        if end_pos < len(text) and text[end_pos] == '\n':
            end_pos += 1
        return text[:start_pos] + "\n" + text[end_pos:]

    return text


def fix_renderer_generics(text: str) -> str:
    text = re.sub(
        r"extends che\.swgc\.client\.render\.SwgcMobRenderer<(\w+),\s*(\w+Model)(?:<\w+>)?>",
        r"extends che.swgc.client.render.SwgcMobRenderer<\1, \2>",
        text,
    )
    return text


def main() -> None:
    n = 0
    for path in sorted(ROOT.rglob("*.java")):
        text = path.read_text(encoding="utf-8")
        original = text
        for old, new in REPLACEMENTS:
            text = text.replace(old, new)
        if "/model/" in path.as_posix():
            text = convert_setup_anim(text)
            text = remove_prepare_mob_model(text)
        if "/renderer/" in path.as_posix():
            text = fix_renderer_generics(text)
        if text != original:
            path.write_text(text, encoding="utf-8")
            print(path.relative_to(ROOT))
            n += 1
    print(f"Total: {n}")


if __name__ == "__main__":
    main()
