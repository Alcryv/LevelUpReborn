/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.levelupreborn.fluid.GaggaFluid;
import net.mcreator.levelupreborn.LeveluprebornMod;

public class LeveluprebornModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, LeveluprebornMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> GAGGA = REGISTRY.register("gagga", () -> new GaggaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GAGGA = REGISTRY.register("flowing_gagga", () -> new GaggaFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GAGGA.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GAGGA.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}