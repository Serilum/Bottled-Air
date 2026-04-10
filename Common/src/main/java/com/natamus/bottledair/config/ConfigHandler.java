package com.natamus.bottledair.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.bottledair.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean disableWaterConsumptionUnderwater = true;
	@Entry public static boolean holdFireTypeItemInOffhandToPreventWaterBottleCreation = true;
	@Entry(min = 0, max = 1.0) public static double chanceGlassBottleBreaksWithFireTypeInOffhand = 0.5;
	@Entry(min = 0, max = 1000) public static int amountOfAirInBottles = 150;

	public static void initConfig() {
		configMetaData.put("disableWaterConsumptionUnderwater", Arrays.asList(
			"If enabled, players will be unable to drink water bottles underwater to prevent getting unlimited oxygen."
		));
		configMetaData.put("holdFireTypeItemInOffhandToPreventWaterBottleCreation", Arrays.asList(
			"Whether the creation of water bottles should be prevented (evaporated) when holding a fire type block in the offhand."
		));
		configMetaData.put("chanceGlassBottleBreaksWithFireTypeInOffhand", Arrays.asList(
			"The chance a glass bottle breaks when the item in the offhand evaporates the water, giving back an empty (air) bottle."
		));
		configMetaData.put("amountOfAirInBottles", Arrays.asList(
			"The amount of air an empty bottle contains. In vanilla Minecraft, 300 is the maximum air supply."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}