# Star Wars Galactic Craft (SWGC) — Minecraft 26.2 Port

Fabric port of **Star Wars Galactic Craft** from the original 1.20.1 release to **Minecraft 26.2** (Java 25).

## Original Source

- **Original JAR:** `libs/swgc-fabric-1.20.1-1.0.1.1.jar` (copied from the 1.20.1 Fabric release)
- **Port version:** `1.0.2.0` (see `gradle.properties`)

## Decompile Pipeline

Reproducible decompile/remap workflow lives under `scripts/`:

```bash
python scripts/run_pipeline.py
```

Pipeline steps: `extract_jar.py` → `decompile.py` → `remap_pipeline.py` → `fix_26_2_mappings.py` → `split_modules.py`

- **164 classes** inventoried in `CLASS_INVENTORY.md`
- Inventory diff is printed at the end of `run_pipeline.py`
- Item model definitions for 26.2: `python scripts/generate_item_definitions.py`

Place the original JAR at `libs/swgc-fabric-1.20.1-1.0.1.1.jar` before running the pipeline.

## Build Requirements

| Requirement | Version |
|-------------|---------|
| Java | **25** |
| Gradle | Wrapper included (`./gradlew`) |
| Minecraft | 26.2 |
| Fabric Loader | 0.19.3 |
| Fabric API | 0.154.2+26.2 |

## Build & Run

```bash
# Full build (common + fabric)
./gradlew build

# Compile checks
./gradlew :common:compileJava :fabric:compileJava :fabric:compileClientJava

# Dev client
./gradlew :fabric:runClient

# Dedicated server smoke test
./gradlew :fabric:runServer
```

Release JAR output: `fabric/build/libs/swgc-fabric-26.2-1.0.2.0.jar`

## Feature Checklist

### Compiles & loads (verified)

- [x] Common + fabric + client compile (0 errors)
- [x] Full `./gradlew build` passes
- [x] All 164 original classes accounted for (+ platform stubs)
- [x] Entity renderers registered (14 entity types + gas harvester BER)
- [x] Item special renderers wired via `SpecialModelRenderers` (26.2 API)
- [x] Worn armor renderers via `ArmorRenderer`
- [x] Force system, networking (7 packets), registries
- [x] Mixins enabled (16)
- [x] Assets restored (133 PNG, 97 OGG, 7 NBT structure templates)
- [x] ObeseWan entity registered
- [x] Dedicated-server-safe common/client split (bridge pattern)

### Needs manual in-game testing

- [ ] Force secondary actions (block, push, telekinesis, jump, unlimited power)
- [ ] Lightsaber activation, blade VFX, dual-wield animations
- [ ] Blaster charge HUD + scope/zoom (Amban)
- [ ] 3D item rendering in all display contexts (GUI vs hand)
- [ ] Clone/droid command screen + team inheritance from owner
- [ ] Vehicle riding (AT-RT, AT-ST, Delta-7B)
- [ ] Droideka shield layer
- [ ] Ewok village structure generation in forest biomes
- [ ] Gas harvester tibanna collection loop
- [ ] Lightsaber hum / starfighter engine sounds
- [ ] Custom title screen splash
- [ ] Side-by-side parity vs 1.20.1 JAR

## Known Gaps

1. **Item display context** — special item renderer uses `ItemDisplayContext.NONE`; GUI blade VFX suppression may differ from 1.20.1.
2. **Compat shims** — `client/compat/animation` and `client/compat/model` remain (required by entity animations/models); only unused `compat/render/MultiBufferSource` was removed.
3. **Dark saber blade VFX** — stubbed for 26.2 submit pipeline (hilt renders).
4. **No automated gameplay tests** — parity matrix requires manual playtesting.

## Project Layout

```
common/          Server-safe game logic, items, entities, assets
fabric/          Fabric loader entrypoints + client rendering
scripts/         Decompile/remap pipeline + codegen
libs/            Original 1.20.1 JAR (not committed)
CLASS_INVENTORY.md  Authoritative 164-class checklist
```

## License

See `LICENSE`.
