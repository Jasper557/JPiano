package de.jaspy;

import de.jaspy.init.BlockEntities;
import de.jaspy.init.Blocks;
import de.jaspy.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPiano implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("jpiano");
	public static final String MOD_ID = "jpiano";

	@Override
	public void onInitialize() {
		Blocks.initialize();
		BlockEntities.initialize();
		//ModItemGroups.registerItemGroups();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
	}
}