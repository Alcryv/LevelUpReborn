package net.mcreator.levelupreborn.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.levelupreborn.init.LeveluprebornModFluids;

public class GaggaItem extends BucketItem {
	public GaggaItem(Item.Properties properties) {
		super(LeveluprebornModFluids.GAGGA.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}