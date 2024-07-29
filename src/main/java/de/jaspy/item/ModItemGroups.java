package de.jaspy.item;

import de.jaspy.JPiano;
import de.jaspy.init.Blocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PIANO_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(JPiano.MOD_ID, "piano_group"),
            FabricItemGroup.builder().displayName(Text.translatable("Piano"))
                    .icon(() -> new ItemStack(Blocks.PIANO_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(Blocks.PIANO_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        System.out.println("Registering ModItemGroups for " + JPiano.MOD_ID);
    }
}
