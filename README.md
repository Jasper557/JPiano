[03:46:41] [main/INFO] (FabricLoader/Mixin) SpongePowered MIXIN Subsystem Version=0.8.5 Source=file:/C:/Users/jaspe/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.13.3+mixin.0.8.5/9527e6b0d2449408958fd1302594dc65ec5ade9c/sponge-mixin-0.13.3+mixin.0.8.5.jar Service=Knot/Fabric Env=CLIENT
[03:46:41] [main/INFO] (FabricLoader/Mixin) Loaded Fabric development mappings for mixin remapper!
[03:46:41] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_17
[03:46:41] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_21
[03:46:44] [main/INFO] (FabricLoader/MixinExtras|Service) Initializing MixinExtras via com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.3.5).
[03:46:46] [Datafixer Bootstrap/INFO] (Minecraft) 226 Datafixer optimizations took 608 milliseconds
[03:46:57] [Render thread/INFO] (Minecraft) Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[03:46:57] [Render thread/INFO] (Minecraft) Setting user: Player909
[03:46:58] [Render thread/INFO] (Minecraft) [STDOUT]: initialized blocks
[03:46:58] [Render thread/INFO] (Minecraft) [STDOUT]: initialized BlockEntities
[03:46:58] [Render thread/INFO] (jpiano) Hello Fabric world!
[03:46:58] [Render thread/INFO] (Indigo) [Indigo] Registering Indigo renderer!
[03:46:59] [Render thread/INFO] (Minecraft) Backend library: LWJGL version 3.3.3-snapshot
[03:47:14] [Render thread/INFO] (Minecraft) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, jpiano
[03:47:14] [Worker-Main-13/INFO] (Minecraft) Found unifont_all_no_pua-15.1.05.hex, loading
[03:47:14] [Worker-Main-15/INFO] (Minecraft) Found unifont_jp_patch-15.1.05.hex, loading
[03:47:15] [Worker-Main-14/WARN] (Minecraft) Exception loading blockstate definition: 'jpiano:blockstates/piano.json' missing model for variant: 'jpiano:piano#'
[03:47:15] [Worker-Main-14/WARN] (Minecraft) Unable to load model: 'jpiano:item/piano' referenced from: jpiano:item/piano: java.io.FileNotFoundException: jpiano:models/item/piano.json
[03:47:16] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:item.goat_horn.play
[03:47:16] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[03:47:16] [Render thread/INFO] (Minecraft) OpenAL initialized on device OpenAL Soft on Kopfhörer (HyperX Virtual Surround Sound)
[03:47:16] [Render thread/INFO] (Minecraft) Sound engine started
[03:47:16] [Render thread/INFO] (Minecraft) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[03:47:16] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[03:47:17] [Render thread/INFO] (Minecraft) Caught error loading resourcepacks, removing all selected resourcepacks
 java.util.concurrent.CompletionException: java.lang.IllegalStateException: Failed to create model for jpiano:piano
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:315) ~[?:?]
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:320) ~[?:?]
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:791) ~[?:?]
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482) ~[?:?]
	at net.minecraft.resource.SimpleResourceReload.method_18365(SimpleResourceReload.java:98) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.executeTask(ThreadExecutor.java:140) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.util.thread.ReentrantThreadExecutor.executeTask(ReentrantThreadExecutor.java:24) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.runTask(ThreadExecutor.java:114) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.runTasks(ThreadExecutor.java:103) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.client.MinecraftClient.render(MinecraftClient.java:1233) [minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.client.MinecraftClient.run(MinecraftClient.java:885) [minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:228) [minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:470) [fabric-loader-0.15.11.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) [fabric-loader-0.15.11.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) [fabric-loader-0.15.11.jar:?]
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86) [dev-launch-injector-0.2.1+build.8.jar:?]
Caused by: java.lang.IllegalStateException: Failed to create model for jpiano:piano
	at net.minecraft.client.render.block.entity.BlockEntityRendererFactories.method_32145(BlockEntityRendererFactories.java:27) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at java.base/java.util.HashMap.forEach(HashMap.java:1429) ~[?:?]
	at net.minecraft.client.render.block.entity.BlockEntityRendererFactories.reload(BlockEntityRendererFactories.java:23) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.reload(BlockEntityRenderDispatcher.java:133) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.resource.SynchronousResourceReloader.method_29490(SynchronousResourceReloader.java:31) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787) ~[?:?]
	... 13 more
Caused by: java.util.NoSuchElementException: Can't find part PianoBody
	at net.minecraft.client.model.ModelPart.getChild(ModelPart.java:88) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at de.jaspy.block.entity.client.PianoBlockEntityRenderer.<init>(PianoBlockEntityRenderer.java:18) ~[main/:?]
	at de.jaspy.JPianoClient.lambda$onInitializeClient$0(JPianoClient.java:21) ~[main/:?]
	at net.minecraft.client.render.block.entity.BlockEntityRendererFactories.method_32145(BlockEntityRendererFactories.java:25) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at java.base/java.util.HashMap.forEach(HashMap.java:1429) ~[?:?]
	at net.minecraft.client.render.block.entity.BlockEntityRendererFactories.reload(BlockEntityRendererFactories.java:23) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.reload(BlockEntityRenderDispatcher.java:133) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at net.minecraft.resource.SynchronousResourceReloader.method_29490(SynchronousResourceReloader.java:31) ~[minecraft-merged-fb838c10a7-1.21-net.fabricmc.yarn.1_21.1.21+build.9-v2.jar:?]
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787) ~[?:?]
	... 13 more
[03:47:17] [Render thread/INFO] (Minecraft) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, jpiano
[03:47:17] [Worker-Main-13/INFO] (Minecraft) Found unifont_all_no_pua-15.1.05.hex, loading
[03:47:17] [Worker-Main-8/INFO] (Minecraft) Found unifont_jp_patch-15.1.05.hex, loading
[03:47:17] [Worker-Main-4/WARN] (Minecraft) Exception loading blockstate definition: 'jpiano:blockstates/piano.json' missing model for variant: 'jpiano:piano#'
[03:47:18] [Worker-Main-4/WARN] (Minecraft) Unable to load model: 'jpiano:item/piano' referenced from: jpiano:item/piano: java.io.FileNotFoundException: jpiano:models/item/piano.json
[03:47:18] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:item.goat_horn.play
[03:47:18] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[03:47:18] [Render thread/INFO] (Minecraft) OpenAL initialized on device OpenAL Soft on Kopfhörer (HyperX Virtual Surround Sound)
[03:47:18] [Render thread/INFO] (Minecraft) Sound engine started
[03:47:18] [Render thread/INFO] (Minecraft) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[03:47:18] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[03:47:40] [Render thread/INFO] (Minecraft) Stopping!
