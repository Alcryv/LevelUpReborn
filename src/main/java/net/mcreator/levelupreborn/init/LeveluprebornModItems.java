/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.levelupreborn.item.*;
import net.mcreator.levelupreborn.LeveluprebornMod;

import java.util.function.Function;

public class LeveluprebornModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LeveluprebornMod.MODID);
	public static final DeferredItem<Item> REINFORCED_AMETHYST;
	public static final DeferredItem<Item> AMETHYST_SWORD;
	public static final DeferredItem<Item> EVERGAY;
	public static final DeferredItem<Item> AMETHYST_PICKAXE;
	public static final DeferredItem<Item> AMETHYST_SHOVEL;
	public static final DeferredItem<Item> AMETHYST_AXE;
	public static final DeferredItem<Item> AMETHYST_BLOCK;
	static {
		REINFORCED_AMETHYST = register("reinforced_amethyst", ReinforcedAmethystItem::new);
		AMETHYST_SWORD = register("amethyst_sword", AmethystSwordItem::new);
		EVERGAY = register("evergay", EvergayItem::new);
		AMETHYST_PICKAXE = register("amethyst_pickaxe", AmethystPickaxeItem::new);
		AMETHYST_SHOVEL = register("amethyst_shovel", AmethystShovelItem::new);
		AMETHYST_AXE = register("amethyst_axe", AmethystAxeItem::new);
		AMETHYST_BLOCK = block(LeveluprebornModBlocks.AMETHYST_BLOCK, new Item.Properties().fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}