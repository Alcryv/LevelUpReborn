package net.mcreator.levelupreborn.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GaggaBlock extends LiquidBlock {
	public GaggaBlock(BlockBehaviour.Properties properties) {
		super(LeveluprebornModFluids.GAGGA.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}