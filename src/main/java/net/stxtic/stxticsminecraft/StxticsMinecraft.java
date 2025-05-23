package net.stxtic.stxticsminecraft;

import net.fabricmc.api.ModInitializer;

import net.stxtic.stxticsminecraft.block.ModBlocks;
import net.stxtic.stxticsminecraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StxticsMinecraft implements ModInitializer {
	public static final String MOD_ID = "stxtics-minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}