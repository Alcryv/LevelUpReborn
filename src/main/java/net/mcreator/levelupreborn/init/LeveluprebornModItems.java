/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.levelupreborn.item.ReinforcedAmethystItem;
import net.mcreator.levelupreborn.item.EvergayItem;
import net.mcreator.levelupreborn.item.AmethystSwordItem;
import net.mcreator.levelupreborn.LeveluprebornMod;

import java.util.function.Function;

public class LeveluprebornModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LeveluprebornMod.MODID);
	public static final DeferredItem<Item> AMETHYST_SWORD;
	public static final DeferredItem<Item> REINFORCED_AMETHYST;
	public static final DeferredItem<Item> EVERGAY;
	static {
		AMETHYST_SWORD = register("amethyst_sword", AmethystSwordItem::new);
		REINFORCED_AMETHYST = register("reinforced_amethyst", ReinforcedAmethystItem::new);
		EVERGAY = register("evergay", EvergayItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}