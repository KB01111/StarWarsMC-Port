#!/usr/bin/env python3
"""Fix entity model render-state generics and setupAnim signatures."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java" / "che" / "swgc" / "client" / "model"

CLASS_RE = re.compile(
    r"public class (\w+)<T extends ([^>]+)> extends (che\.swgc\.client\.(?:compat\.model\.SinglePartEntityModel|render\.SwgcEntityModel))<T>"
)
JAWA_RE = re.compile(
    r"public class JawaModel<T extends net\.minecraft\.world\.entity\.LivingEntity> extends net\.minecraft\.client\.model\.player\.PlayerModel"
)
SETUP_RE = re.compile(
    r"(public void setupAnim\(che\.swgc\.client\.render\.SwgcMobRenderState state, float [^\)]+\) \{\n)",
    re.MULTILINE,
)


def fix_models() -> int:
    n = 0
    for path in sorted(ROOT.rglob("*.java")):
        text = path.read_text(encoding="utf-8")
        original = text
        entity_type = None
        m = CLASS_RE.search(text)
        if m:
            entity_type = m.group(2).strip()
            text = CLASS_RE.sub(
                r"public class \1 extends \3<che.swgc.client.render.SwgcMobRenderState>",
                text,
            )
        text = JAWA_RE.sub(
            "public class JawaModel extends net.minecraft.client.model.player.PlayerModel",
            text,
        )
        text = text.replace(
            "setupAnim(S state, float limbSwing",
            "setupAnim(che.swgc.client.render.SwgcMobRenderState state, float limbSwing",
        )
        text = text.replace(
            "setupAnim(S state, float limbAngle",
            "setupAnim(che.swgc.client.render.SwgcMobRenderState state, float limbAngle",
        )
        if entity_type and "setupAnim(che.swgc.client.render.SwgcMobRenderState state" in text:
            cast = f"      {entity_type} entity = ({entity_type})state.entity;\n"
            if cast.strip() not in text:
                text = SETUP_RE.sub(r"\1" + cast, text, count=1)
        if text != original:
            path.write_text(text, encoding="utf-8")
            print(f"updated {path.name}")
            n += 1
    return n


def fix_gui_and_mixins() -> int:
    root = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java"
    n = 0
    reps = [
        ("net.minecraft.client.gui.GuiGraphics", "net.minecraft.client.gui.GuiGraphicsExtractor"),
        ("net.minecraft.client.gui.components.CommonComponents", "net.minecraft.network.chat.CommonComponents"),
    ]
    for path in root.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        original = text
        for a, b in reps:
            text = text.replace(a, b)
        if text != original:
            path.write_text(text, encoding="utf-8")
            print(f"updated {path.relative_to(root)}")
            n += 1
    return n


if __name__ == "__main__":
    print(f"models: {fix_models()}")
    print(f"gui/mixins: {fix_gui_and_mixins()}")
