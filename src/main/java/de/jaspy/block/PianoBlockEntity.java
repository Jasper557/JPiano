package de.jaspy.block;

import de.jaspy.init.BlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class PianoBlockEntity extends BlockEntity {
    public PianoBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.PIANO_BLOCK_ENTITY, pos, state);
    }
}
