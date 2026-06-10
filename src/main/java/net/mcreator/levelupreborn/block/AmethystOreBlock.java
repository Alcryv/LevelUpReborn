package net.mcreator.levelupreborn.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AmethystOreBlock extends Block {
	public AmethystOreBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.AMETHYST).strength(1.75f, 10f).lightLevel(s -> 1).instrument(NoteBlockInstrument.CHIME));
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return ARGB.opaque(-458497);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}