package com.natamus.bottledair.forge.events;

import com.natamus.bottledair.events.AirEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeAirEvent {
	@SubscribeEvent
	public void onBottleClick(PlayerInteractEvent.RightClickItem e) {
		if (AirEvent.onBottleClick(e.getPlayer(), e.getWorld(), e.getHand()).getResult().equals(InteractionResult.FAIL)) {
			e.setCanceled(true);
		}
	}
}
