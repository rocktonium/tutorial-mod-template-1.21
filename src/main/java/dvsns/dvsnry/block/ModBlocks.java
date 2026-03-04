package dvsns.dvsnry.block;
import dvsns.dvsnry.Dvsnry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
// Block creation
    public static final Block JADE_BLOCK = registerBlock("jade_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(4f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_JADE_BLOCK = registerBlock("raw_jade_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create()
                    .strength(4.5F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create()
                            .strength(4.5F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));


// Block register function
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dvsnry.MOD_ID, name), block);
    }
// Block inventory item register function
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dvsnry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
// Register all mod blocks function + add to creative tab
    public static void registerModBlocks() {
        Dvsnry.LOGGER.info("Registering Mod Blocks for " + Dvsnry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.JADE_BLOCK);
            entries.add(ModBlocks.RAW_JADE_BLOCK);
        });
    }

}
