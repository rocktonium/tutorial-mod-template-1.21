package dvsns.dvsnry.item;

import dvsns.dvsnry.Dvsnry;
import dvsns.dvsnry.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DVSNRY_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Dvsnry.MOD_ID,"dvsnry_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JADE_GEM))
                    .displayName(Text.translatable("itemgroup.dvsnry.dvsnry_items"))
                            .entries((displayContext, entries) -> {
                                entries.add(ModItems.JADE_GEM);
                                entries.add(ModItems.CRYSTALLINE_JADE);
                                entries.add(ModBlocks.JADE_BLOCK);
                                entries.add(ModBlocks.RAW_JADE_BLOCK);
                                entries.add(ModBlocks.COBALT_BLOCK);
                                entries.add(ModBlocks.RAW_COBALT_BLOCK);
                                entries.add(ModItems.COBALT_SHARD);
                                entries.add(ModItems.COBALT_METAL);
                            })
                    .build());







    public static void registerItemGroups() {
        Dvsnry.LOGGER.info("Registering Item Groups for " + Dvsnry.MOD_ID);
    }

}
