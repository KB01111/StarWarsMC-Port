#!/usr/bin/env python3
"""Generate MC 26.2 assets/swgc/items/*.json definitions for 3D-rendered items."""
from __future__ import annotations

import json
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / "common" / "src" / "main" / "resources" / "assets" / "swgc" / "items"

BASE_BY_ITEM = {
    "lightsaber": "swgc:item/lightsaber",
    "darksaber": "swgc:item/lightsaber",
    "force_pike": "swgc:item/force_pike",
    "ewok_spear": "swgc:item/ewok_spear",
    "ewok_staff": "swgc:item/ewok_staff",
    "clone": "swgc:item/entity_model_helmet",
}

BLASTERS = ["dc15a", "dc15s", "dc17", "dh17", "e5", "tl50", "jawa_blaster"]

ARMOR_SUFFIXES = ["helmet", "chestplate", "leggings", "boots"]
CLONE_ARMOR_PREFIXES = [
    "clone_phase_2",
    "clone_7th_legion",
    "clone_13th_battalion",
    "clone_31st_legion",
    "clone_41st_elite_corps",
    "clone_87th_sentinel_corps",
    "clone_91st_recon_corps",
    "clone_104th_battalion",
    "clone_187th_legion",
    "clone_212th_battalion",
    "clone_305th_legion",
    "clone_332nd_company",
    "clone_442nd_battalion",
    "clone_497th_battalion",
    "clone_501st_legion",
    "clone_615th_legion",
    "clone_coruscant_guard",
]
OTHER_ARMOR_PREFIXES = [
    ("jedi_female", False),
    ("jedi_male", False),
    ("jedi_male_2", True),
    ("sith_female", True),
    ("sith_male", False),
    ("sith_male_2", True),
    ("royal_guard", True),
]


def special_item(item_id: str, base: str) -> dict:
    return {
        "model": {
            "type": "minecraft:special",
            "base": base,
            "model": {
                "type": "swgc:builtin_item",
                "renderer": f"swgc:{item_id}",
            },
            "transformation": {
                "translation": [0.0, 0.0, 0.0],
                "left_rotation": [0.0, 0.0, 0.0, 1.0],
                "right_rotation": [0.0, 0.0, 0.0, 1.0],
                "scale": [1.0, -1.0, -1.0],
            },
        }
    }


def write_item(item_id: str, base: str) -> None:
    path = OUT / f"{item_id}.json"
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(special_item(item_id, base), indent=2) + "\n", encoding="utf-8")


def model_item(item_id: str) -> dict:
    return {
        "model": {
            "type": "minecraft:model",
            "model": f"swgc:item/{item_id}",
        }
    }


def write_model_item(item_id: str) -> None:
    path = OUT / f"{item_id}.json"
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(model_item(item_id), indent=2) + "\n", encoding="utf-8")


def main() -> None:
    special_ids: set[str] = set()

    for item_id, base in BASE_BY_ITEM.items():
        write_item(item_id, base)
        special_ids.add(item_id)

    for blaster in BLASTERS:
        write_item(blaster, f"swgc:item/{blaster}")
        special_ids.add(blaster)

    for prefix in CLONE_ARMOR_PREFIXES:
        for suffix in ARMOR_SUFFIXES:
            item_id = f"{prefix}_{suffix}"
            base = "swgc:item/entity_model_helmet" if suffix == "helmet" else f"swgc:item/{item_id}"
            write_item(item_id, base)
            special_ids.add(item_id)

    for prefix, include_helmet in OTHER_ARMOR_PREFIXES:
        for suffix in ARMOR_SUFFIXES:
            if suffix == "helmet" and not include_helmet:
                continue
            item_id = f"{prefix}_{suffix}"
            base = "swgc:item/entity_model_helmet" if suffix == "helmet" else f"swgc:item/{item_id}"
            write_item(item_id, base)
            special_ids.add(item_id)

    models_dir = ROOT / "common" / "src" / "main" / "resources" / "assets" / "swgc" / "models" / "item"
    template_ids = {"entity_model_boots", "entity_model_chestplate", "entity_model_helmet", "entity_model_leggings"}
    for model_path in sorted(models_dir.glob("*.json")):
        item_id = model_path.stem
        if item_id in special_ids or item_id in template_ids:
            continue
        write_model_item(item_id)

    print(f"Wrote item definitions under {OUT}")


if __name__ == "__main__":
    main()
