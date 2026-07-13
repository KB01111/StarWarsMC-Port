#!/usr/bin/env python3
from __future__ import annotations

import json
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
MODELS = ROOT / "common" / "src" / "main" / "resources" / "assets" / "swgc" / "models" / "item"
ITEMS = ROOT / "common" / "src" / "main" / "resources" / "assets" / "swgc" / "items"

SPECIAL_TRANSFORM = {
    "left_rotation": [0.0, 0.0, 0.0, 1.0],
    "right_rotation": [0.0, 0.0, 0.0, 1.0],
    "scale": [1.0, -1.0, -1.0],
    "translation": [0.0, 0.0, 0.0],
}


def load_model(path: Path) -> dict:
    return json.loads(path.read_text(encoding="utf-8"))


def item_definition(model_path: Path) -> dict:
    data = load_model(model_path)
    parent = data.get("parent", "")

    if parent == "minecraft:item/template_spawn_egg":
        return {"model": {"type": "minecraft:model", "model": "minecraft:item/template_spawn_egg"}}

    if parent == "item/generated":
        return {"model": {"type": "minecraft:model", "model": f"swgc:item/{model_path.stem}"}}

    if parent.startswith("swgc:block/"):
        return {"model": {"type": "minecraft:model", "model": parent}}

    if parent == "builtin/entity" or parent.endswith("/entity_model_helmet") or "entity_model" in model_path.stem:
        return {
            "model": {
                "type": "minecraft:special",
                "base": "minecraft:item/iron_sword",
                "model": {"type": "swgc:item"},
                "transformation": SPECIAL_TRANSFORM,
            }
        }

    if parent.startswith("item/") or parent.startswith("minecraft:item/"):
        return {"model": {"type": "minecraft:model", "model": f"swgc:item/{model_path.stem}"}}

    return {"model": {"type": "minecraft:model", "model": f"swgc:item/{model_path.stem}"}}


def main() -> None:
    ITEMS.mkdir(parents=True, exist_ok=True)
    count = 0
    for model_path in sorted(MODELS.glob("*.json")):
        out = ITEMS / f"{model_path.stem}.json"
        out.write_text(json.dumps(item_definition(model_path), indent=2) + "\n", encoding="utf-8")
        count += 1
    print(f"Wrote {count} item definitions to {ITEMS}")


if __name__ == "__main__":
    main()
