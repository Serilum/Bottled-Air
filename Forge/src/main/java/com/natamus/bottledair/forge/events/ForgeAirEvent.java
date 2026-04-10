package com.natamus.bottledair.forge.events;

import com.natamus.bottledair.events.AirEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeAirEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeAirEvent.class);

		PlayerInteractEvent.RightClickItem.BUS.addListener(ForgeAirEvent::onBottleClick);
	}

	@SubscribeEvent
	public static boolean onBottleClick(PlayerInteractEvent.RightClickItem e) {
		if (AirEvent.onBottleClick(e.getEntity(), e.getLevel(), e.getHand()).equals(InteractionResult.FAIL)) {
			return true;
		}
		return false;
	}
}
