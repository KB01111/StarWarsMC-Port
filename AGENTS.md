## Learned User Preferences

- Keep the multi-loader SPI architecture with common and fabric modules for future Forge/NeoForge support.
- Test mod builds by deploying JARs to the GDLauncher Carbon Fabric instance before in-game verification.
- Use background subagents for large port, debug, and deploy workflows.
- Only create git commits when explicitly requested.
- Keep mixins disabled during compile-fix passes unless a specific runtime crash requires targeted player mixins.

## Learned Workspace Facts

- SWGC (Star Wars: Galaxy in a Cube) mod port workspace at C:\Users\kevin\Projekt\StarWarsMC-Port.
- Target Minecraft 26.2 Fabric; pinned versions in gradle.properties: loader 0.19.3, loom 1.17-SNAPSHOT, fabric-api 0.154.2+26.2, mod_version 1.0.2.0.
- Project structure: common module (SPI + core logic) and fabric module (entrypoints, platform implementations, client code).
- GDLauncher test mods folder: C:\Users\kevin\AppData\Roaming\gdlauncher_carbon\data\instances\fabric 26.21\instance\mods (Minecraft 26.2; "26.21" is the instance label).
- Build command: .\gradlew.bat :fabric:build --no-daemon; output JAR: fabric/build/libs/swgc-fabric-26.2-1.0.2.0.jar.
- fabric.mod.json must depend on fabric-api, not the legacy fabric mod id removed in Fabric API for 26.2.
- Java 25+ is required at runtime for Fabric API 0.154.2+26.2 on MC 26.2.
- MC 26.2 game rule IDs must use snake_case (e.g. force_obtainment, not camelCase).
- Port tooling uses scripts/remap_pipeline.py, scripts/split_modules.py, and scripts/fix_26_2_mappings.py for decompiled source migration.
- Port is partial (~50% feature parity vs 1.20.1): client rendering and most mixins remain excluded or disabled.
