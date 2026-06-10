/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.levelupreborn.fluid.types.GaggaFluidType;
import net.mcreator.levelupreborn.LeveluprebornMod;

public class LeveluprebornModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LeveluprebornMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> GAGGA_TYPE = REGISTRY.register("gagga", () -> new GaggaFluidType());
}