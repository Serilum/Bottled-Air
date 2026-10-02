package com.serilum.bottledair;

import com.serilum.bottledair.events.AirEvent;
import com.serilum.bottledair.util.Reference;
import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.check.ShouldLoadCheck;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		UseItemCallback.EVENT.register((player, world, hand) -> {
			return AirEvent.onBottleClick(player, world, hand);
		});
	}

	private static void setGlobalConstants() {

	}
}
