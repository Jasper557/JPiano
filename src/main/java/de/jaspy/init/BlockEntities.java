package de.jaspy.init;

import de.jaspy.JPiano;
import de.jaspy.block.PianoBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEntities {

    public static final BlockEntityType<PianoBlockEntity> PIANO_BLOCK_ENTITY =
            register("piano", PianoBlockEntity::new, Blocks.PIANO_BLOCK);

    private static <T extends BlockEntity> BlockEntityType<T> register(String name,
                                                                       BlockEntityType.BlockEntityFactory<? extends T> entityFactory,
                                                                       Block... blocks) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(JPiano.MOD_ID, name),
                BlockEntityType.Builder.<T>create(entityFactory, blocks).build());
    }


    public static void initialize() {
        System.out.println("initialized BlockEntities");
    }
}
