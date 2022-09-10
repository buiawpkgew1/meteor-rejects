<div align="center">
  <!-- Logo and Title -->
  <img src="/src/main/resources/assets/rejects/icon.png" alt="图标" width="20%"/>
  <h1>Meteor拒绝</h1>
  <p>Meteor客户端的附加组件，不会被添加到Meteor，因为它们被拒绝或是其他客户端的端口。</p>

  <!-- Fancy badges -->
  <a href="https://anticope.ml/pages/MeteorAddons.html"><img src="https://img.shields.io/badge/Verified%20Addon-Yes-blueviolet" alt="已验证的附加组件"></a>
  <a href="https://github.com/AntiCope/meteor-rejects/releases"><img src="https://img.shields.io/badge/Version-v0.1-orange" alt="版本"></a>
  <img src="https://img.shields.io/badge/spaghetti%20code-yes-success?logo=java" alt="Spagetti 代码：是">
  <img src="https://img.shields.io/badge/Minecraft%20Version-1.19-blue" alt="Minecraft 版本">
  <a href="https://github.com/AntiCope/meteor-rejects/commits/master"><img src="https://img.shields.io/github/last-commit/AntiCope/meteor-rejects?logo=git" alt="最后提交"></a>
  <img src="https://img.shields.io/github/workflow/status/AntiCope/meteor-rejects/Java%20CI%20with%20Gradle?logo=github" alt="构建状态">
  <img src="https://img.shields.io/github/languages/code-size/AntiCope/meteor-rejects" alt="代码大小">
  <img src="https://img.shields.io/github/repo-size/AntiCope/meteor-rejects" alt="仓库大小">
  <img src="https://img.shields.io/github/issues/AntiCope/meteor-rejects" alt="问题">
  <img src="https://img.shields.io/github/stars/AntiCope/meteor-rejects" alt="星标">
</div>

<hr />

<div align="center">
  <a href="https://discord.gg/9mrRPGKYU3"><img src="https://invidget.switchblade.xyz/9mrRPGKYU3"></a>
</div>

# 语言
- English|[中文](./READMEzh.md)
# 如何使用
- 从发布选项卡下载最新的 [版本](/../../releases) 模组。
- 将其放入您已安装Meteor的 `.minecraft/mods` 文件夹中。

*注意：建议使用最新的 [版本的 metor 版本的](https://meteorclient.com/download?devBuild=latest)*

# 功能
## 模块
- AntiBot(在 [166fc](https://github.com/MeteorDevelopment/meteor-client/commit/166fccc73e53de6cfdbe41ea58dc593a2f5011f6#diff-05896d5a7f735a14ee8da5d12fbd24585862ca68efdf32b9401b3f4329d17c73) 中从Meteor 中删除)
- 安装地雷(在 [62cd0](https://github.com/MeteorDevelopment/meteor-client/commit/62cd0461e48a6c50f040bf48de25be1fa4eba77e) 中从Meteor 中删除)
- AntiSpawnpoint
- 防消失
- AutoBedTrap (从 [BleachHack-CupEdition](https://github.com/CUPZYY/BleachHack-CupEdition/blob/master/CupEdition-1.17/src/main/java/bleach/hack/module/mods/AutoBedtrap.java) 移植)
- AutoCraft (来自orion的更普遍版本 [AutoBedCraft](https://github.com/Anticope/orion/blob/main/src/main/java/me/ghosttypes/orion/modules/main/AutoBedCraft.java))
- AutoExtinguish
- AutoPot(来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/274))
- AutoTNT
- 自动Wither (来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/1070))
- BlockIn
- BonemealAura (从 [JexClient](https://github.com/DustinRepo/JexClient/blob/main/src/main/java/me/dustin/jex/feature/mod/impl/world/BonemealAura.java) 移植)
- 飞船Glitch & 飞船阶段 (来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/814))
- 提升(从 [Cornos](https://github.com/cornos/Cornos/blob/master/src/main/java/me/zeroX150/cornos/features/module/impl/movement/Boost.java) 移植)
- 聊天室
- ChorusExploit (来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/1727))
- 彩色标志
- 暈眩
- Coord 日志(来自 [JexClient](https://github.com/DustinRepo/JexClient-main/blob/main/src/main/java/me/dustin/jex/feature/mod/impl/misc/CoordFinder.java) 的世界事件)
- 自定义数据包
- 幽灵模式 (来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/1932))
- Glide (从 [Wurst](https://github.com/Wurst-Imperium/Wurst7/tree) 移植)
- 交互菜单(从 [BleachHack 移植到](https://github.com/BleachDrinker420/BleachHack/pull/211))
- Lavacast
- NewChunks (从 [BleackHack](https://github.com/BleachDrinker420/BleachHack/blob/master/BleachHack-Fabric-1.17/src/main/java/bleach/hack/module/mods/NewChunks.java) 移植)
- 黑暗农场(来自 [Meteor ObbiranFarm Addon](https://github.com/VoidCyborg/meteor-obsidian-farm))
- 矿石(从 [Atomic](https://gitlab.com/0x151/atomic) 移植)
- PacketFly (来自 [未合并的 PR](https://github.com/MeteorDevelopment/meteor-client/pull/813))
- 涂料
- Rendering
- SkeletonESP (Ported from [JexClient](https://github.com/DustinRepo/JexClient-main/blob/main/src/main/java/me/dustin/jex/feature/mod/impl/render/Skeletons.java))
- SoundLocator
- TreeAura (Taken from an [unmerged PR](https://github.com/MeteorDevelopment/meteor-client/pull/2138))

### Modifications
- NoRender
  - `noCommandSuggestions` (Taken from an [unmerged PR](https://github.com/MeteorDevelopment/meteor-client/pull/1347))
  - `disableToasts`
- Flight
  - `stopMomentum`

## Commands
- `.center`
- `.clear-chat` (Removed from meteor in [9aebf](https://github.com/MeteorDevelopment/meteor-client/commit/9aebf6a0e4ffa739d901c8b8d7f48d07af2fe839))
- `.ghost` (Ported from [AntiGhost](https://github.com/gbl/AntiGhost/blob/fabric_1_16/src/main/java/de/guntram/mcmod/antighost/AntiGhost.java))
- `.save-skin`
- `.heads`
- `.seed` (Taken from an [unmerged PR](https://github.com/MeteorDevelopment/meteor-client/pull/1300))
- `.setblock`
- `.panic` (Removed from meteor in [dd5f8](https://github.com/MeteorDevelopment/meteor-client/commit/dd5f88a0dbb2753372bf37c58461b886104dc990))
- `.set-velocity`
- `.teleport`
- `.terrain-export` (Ported from [BleachHack](https://github.com/BleachDrinker420/BleachHack/blob/master/BleachHack-Fabric-1.17/src/main/java/bleach/hack/command/commands/CmdTerrain.java))
- `.kick` (Ported from [LiquidBounce](https://github.com/CCBlueX/LiquidBounce/blob/nextgen/src/main/kotlin/net/ccbluex/liquidbounce/features/module/modules/exploit/ModuleKick.kt))

### Modifications
- `.server`
  - `ports` (Ported from [Cornos](https://github.com/cornos/Cornos/blob/master/src/main/java/me/zeroX150/cornos/features/command/impl/Scan.java))
- `.locate`
  - rewrite (Taken from an [unmerged PR](https://github.com/MeteorDevelopment/meteor-client/pull/1300))
- `.give`
  - presets (Some presets were taken from [BleachHack](https://github.com/BleachDrinker420/BleachHack/blob/master/BleachHack-Fabric-1.17/src/main/java/bleach/hack/command/commands/CmdGive.java))

## Themes
- "Meteor Rounded" theme (Taken from an [unmerged PR](https://github.com/MeteorDevelopment/meteor-client/pull/619))

## HUD
- Radar HUD

## Config
- `Http Allowed` - modify what http requests can be made with Meteor's http api
- `Hidden Modules` - hide modules from module gui. **requires restart when unhiding**
