/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.levelupreborn.block.TestBlock;
import net.mcreator.levelupreborn.block.GaggaBlock;
import net.mcreator.levelupreborn.LeveluprebornMod;

import java.util.function.Function;

public class LeveluprebornModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LeveluprebornMod.MODID);
	public static final DeferredBlock<Block> TEST;
	public static final DeferredBlock<Block> GAGGA;
	static {
		TEST = register("test", TestBlock::new);
		GAGGA = register("gagga", GaggaBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}