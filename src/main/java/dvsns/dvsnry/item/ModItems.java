package dvsns.dvsnry.item;

import dvsns.dvsnry.Dvsnry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

public static final Item JADE_GEM = registerItem("jade_gem", new Item(new Item.Settings()));
public static final Item CRYSTALLINE_JADE = registerItem("crystalline_jade", new Item(new Item.Settings()));
public static final Item COBALT_SHARD = registerItem("cobalt_shard", new Item(new Item.Settings()));
public static final Item COBALT_METAL = registerItem("cobalt_metal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Dvsnry.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Dvsnry.LOGGER.info("Registering Mod Items for " + Dvsnry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(JADE_GEM);
            fabricItemGroupEntries.add(CRYSTALLINE_JADE);
            fabricItemGroupEntries.add(COBALT_SHARD);
            fabricItemGroupEntries.add(COBALT_METAL);
        });
    }
}
