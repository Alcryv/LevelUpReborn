package net.mcreator.levelupreborn.item;

import net.minecraft.network.chat.Component;

public class GaggaItem extends BucketItem {

	public GaggaItem(Item.Properties properties) {
		super(LeveluprebornModFluids.GAGGA.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

}