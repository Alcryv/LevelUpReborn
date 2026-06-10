/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.levelupreborn.block.AmethystOreBlock;
import net.mcreator.levelupreborn.LeveluprebornMod;

import java.util.function.Function;

public class LeveluprebornModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LeveluprebornMod.MODID);
	public static final DeferredBlock<Block> AMETHYST_BLOCK;
	static {
		AMETHYST_BLOCK = register("amethyst_block", AmethystOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}