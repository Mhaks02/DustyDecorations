## Changelog

All notable changes to this project will be documented in this file.  
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

___
## 2.3.0 – _2026.10.13_
### Added
- `copper_nugget` item to `#c:nuggets/copper` tag
- `#c:nuggets/copper` to `#c:nuggets` tag
- `Forge Config API Port` is now a required dependency on `Fabric`
- The mod will now show a Warning Screen when launching the game if it detects a Dusty Decorations 1.x config file, urging players to **make backups** of their worlds
### Fixed
- Missing `crafting` and `cooking recipes` for `Raw Bratwurst`, `Smoked Bratwurst`, and `Bratwurst Hot Dog`
- `camera_quadropod_top.geo.json` having no `bones` array at all, causing issue for the `AzureLib Armor` mod
  - Fixes [Issue #6](https://github.com/Mhaks02/DustyDecorations/issues/6) and probably issues [#3](https://github.com/Mhaks02/DustyDecorations/issues/3) and [#4](https://github.com/Mhaks02/DustyDecorations/issues/4) as well
- `Cowhide Rug` and `Mooshroom Cowhide Rug` broken model and wrong block state
  - Fixes [Issue #5](https://github.com/Mhaks02/DustyDecorations/issues/5)
- Wrong ingredient in `Paper Lantern` recipes
- `Wooden Buoys` culling the block behind them when they shouldn't
### Changed
- `Bratwurst Hot Dog` `nutrition` and `saturation` values from `5` and `0.6` to `6` and `1.0` respectively
- All `Barrel` recipes now require `8` of the `"ingredient"` item instead of `1`
- All recipes that require a `copper_nugget` item now require any item with the `#c:nuggets/copper` tag instead, making them compatible with any other mods
- Removed duplicated element in `Equine Skull` model, doesn't change anything visually

___
## 2.2.0 – _2026.10.05_
### Added
- `fr_fr` localisation
### Fixed
- Errors in `en_us` (details in commit [0e1bfb9](https://github.com/Mhaks02/DustyDecorations/commit/0e1bfb92bc3921146a36fc8981ab44e89fa6c7a7)), and added missing entry for the `Nautilus Golem Entity`

___
## 2.1.1 <sub><sup>(hotfix for Fabric)</sup></sub> – _2026.10.02_
### Fixed
- Wrong semantic for Geckolib version range in `fabric.mod.json`
  - Fixes [Issue #2](https://github.com/Mhaks02/DustyDecorations/issues/2)

___
## 2.1.0 – _2026.10.02_
### Added
- Open/close sounds for the `Vintage Cash Register`
- On/off sounds for the `Seaglass Lamp` and the `Copper Light` (all variants)
- tinkling sounds for the `Nautilus Wind Chime`
### Changed
- `Posters` now behave like other blocks of the same type (e.g., `Scattered Papers`): textures are randomised every time the block is placed instead of them being bound to its position in the world
- Additionally, pressing shift and right-clicking on `Posters` will cycle through its texture variants
- Geckolib 4.9.x works fine now
### Fixed
- Moved `addBlocksToBlockEntityType` and `registerAttributes` methods to neoforge's common events bus subscriber instead of client: fixes server crash on world generation and nautilus golem throwing an error on spawn 
- Broken `Nautilus Wind Chime` animation with Geckolib 4.9

___
## 2.0.1 – _2026.09.23_
### Changed
- `Corrugated Metal Pressure Plate`, `Corrugated Metal Button`, `Rusted Corrugated Metal Pressure Plate`, and `Rusted Corrugated Metal Button` were removed from `#needs_iron_tool` tag
### Fixed
- `Raw Bratwurst Sausage`, `Smoked Bratwurst Sausage`, and `Bratwurst Hot Dog` not being actual foods
- `Waxed Corrugated Metal Fence` and `Waxed Rusted Corrugated Metal Fence` missing from `#fences` tag
- `Waxed Corrugated Metal Fence Gate` and `Waxed Rusted Corrugated Metal Fence Gate` missing from `#fence_gates` tag
- All waxed corrugated metal block variants missing from `#mineable_with_pickaxe` and `#needs_iron_tool` tags
- `Waxed Corrugated Stairs`, `Waxed Corrugated Slab`, `Waxed Rusted Corrugated Stairs`, `Waxed Rusted Corrugated Slab`, `Waxed Corrugated Fence Gate`, and `Waxed Rusted Corrugated Fence Gate` broken block and item models

___
## 2.0 is here 🎉 – _2026.09.22_
Re-made the whole mod from scratch, it is no longer a MCreator project!  
If you intend on updating from an older version of the mod, please **make backups** of your worlds, as the 2.0 version is game-breaking and will make most if not all of your blocks and items disappear