package net.mcreator.levelupreborn.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TestBlock extends Block {
	public TestBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}