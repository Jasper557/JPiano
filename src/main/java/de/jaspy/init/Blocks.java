package de.jaspy.init;

import de.jaspy.JPiano;
import de.jaspy.block.PianoBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Blocks {

    public static final PianoBlock PIANO_BLOCK =
            register("piano", new PianoBlock(AbstractBlock.Settings.create()
                    .nonOpaque()),
                    new BlockItemData(new Item.Settings(),
                            List.of(ItemGroups.BUILDING_BLOCKS, ItemGroups.FUNCTIONAL)));

    private static <T extends Block> T register(String name, T block, @Nullable BlockItemData blockItemData) {
        if (blockItemData != null) {
            BlockItem blockItem = new BlockItem(block, blockItemData.itemSettings());
            Registry.register(Registries.ITEM, Identifier.of(JPiano.MOD_ID,name), blockItem);
            Items.addToItemGroups(blockItem, blockItemData.itemGroups());
        }
        return Registry.register(Registries.BLOCK, Identifier.of(JPiano.MOD_ID,name), block);
    }

    private record BlockItemData(Item.Settings itemSettings, List<RegistryKey<ItemGroup>> itemGroups){}

    public static void initialize() {
        System.out.println("initialized blocks");
    }

}
