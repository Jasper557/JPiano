package de.jaspy;

import de.jaspy.block.entity.client.PianoBlockEntityRenderer;
import de.jaspy.init.BlockEntities;
import de.jaspy.init.Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class JPianoClient implements ClientModInitializer {

    public static final EntityModelLayer PIANO_ENTITY_LAYER =
            new EntityModelLayer(Identifier.of("piano_entity_layer"), "main");

    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(BlockEntities.PIANO_BLOCK_ENTITY, context ->
                new PianoBlockEntityRenderer<>(context.getLayerModelPart(JPianoClient.PIANO_ENTITY_LAYER)));
        EntityModelLayerRegistry.registerModelLayer(PIANO_ENTITY_LAYER, PianoBlockEntityRenderer::getTexturedModelData);

    }
}
