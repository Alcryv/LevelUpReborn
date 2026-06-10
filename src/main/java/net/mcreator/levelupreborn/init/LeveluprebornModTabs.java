/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelupreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.levelupreborn.LeveluprebornMod;

@EventBusSubscriber
public class LeveluprebornModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LeveluprebornMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEVEL_UP_REBORN = REGISTRY.register("level_up_reborn",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.levelupreborn.level_up_reborn")).icon(() -> new ItemStack(Items.EXPERIENCE_BOTTLE)).displayItems((parameters, tabData) -> {
				tabData.accept(LeveluprebornModItems.REINFORCED_AMETHYST.get());
				tabData.accept(LeveluprebornModItems.AMETHYST_SWORD.get());
				tabData.accept(LeveluprebornModItems.EVERGAY.get());
				tabData.accept(LeveluprebornModItems.AMETHYST_PICKAXE.get());
				tabData.accept(LeveluprebornModItems.AMETHYST_AXE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LeveluprebornModItems.AMETHYST_SHOVEL.get());
		}
	}
}