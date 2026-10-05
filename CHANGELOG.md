## Changelog

All notable changes to this project will be documented in this file.  
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

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
- open/close sounds for the `Vintage Cash Register`
- on/off sounds for the `Seaglass Lamp` and the `Copper Light` (all variants)
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