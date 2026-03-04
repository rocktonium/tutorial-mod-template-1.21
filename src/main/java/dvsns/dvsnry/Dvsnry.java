package dvsns.dvsnry;

import dvsns.dvsnry.block.ModBlocks;
import dvsns.dvsnry.item.ModItemGroups;
import dvsns.dvsnry.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dvsnry implements ModInitializer {
	public static final String MOD_ID = "dvsnry";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}