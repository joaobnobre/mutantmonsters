# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog].

## [v4.0.6-1.19.2] - 2023-06-06
### Fixed
- Fixed mutant creatures over-spawning in modded biomes using vanilla's spawn costs system

## [v4.0.5-1.19.2] - 2023-05-25
### Fixed
- Fixed mutant snow golem cannot be created from using chemical x on a snow golem
- Fixed mutant snow golem being unable to find a new target after killing an existing target

## [v4.0.4-1.19.2] - 2023-05-24
### Fixed
- Fixed chemical x conversions being incorrectly read from the config file, resulting in only the default mutations being available always

## [v4.0.3-1.19.2] - 2023-05-24
### Fixed
- Fixed being in negative y-coordinates breaking the mutant endermans teleport abilities

## [v4.0.2-1.19.2] - 2023-05-24
Thanks a lot to everyone reporting all the bugs and making suggestions!
### Changed
- Mutations from splashing an entity with mutant x are now configurable, add your own custom mutations from any mob to another! 
- Restored the original chemical x texture
- Item drops from mutant skeleton body parts on the ground are now defined by loot tables
### Fixed
- Fixed hulk hammer seismic wave starting away from the player
- Fixed mutant enderman teleports failing
- Fixed mutant enderman always showing four arms, even when it doesn't have a target
- Fixed skeleton leggings and boots applying effects simply by being in the player inventory, when they must normally be equipped
- Fixed mutant snow golems not being immune to freezing
- Fixed using a name tag on a mutant zombie giving the burn zombie burn advancement
- Fixed skeleton armor parts missing from Forge armor tags

## [v4.0.1-1.19.2] - 2023-04-20
## Fixed
- Fixed a bunch of behaviors not running correctly due some ticks being skipped during execution which are required for certain behaviors to be initiated though (thanks to KaratFeng for pointing this out)

## [v4.0.0-1.19.2] - 2022-08-25
- Initial release

[Keep a Changelog]: https://keepachangelog.com/en/1.0.0/
