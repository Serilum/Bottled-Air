package com.natamus.bottledair.neoforge.events;

import com.natamus.bottledair.events.AirEvent;
import net.minecraft.world.InteractionResult;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeAirEvent {
	@SubscribeEvent
	public static void onBottleClick(PlayerInteractEvent.RightClickItem e) {
		if (AirEvent.onBottleClick(e.getEntity(), e.getLevel(), e.getHand()).equals(InteractionResult.FAIL)) {
			e.setCanceled(true);
		}
	}
}
