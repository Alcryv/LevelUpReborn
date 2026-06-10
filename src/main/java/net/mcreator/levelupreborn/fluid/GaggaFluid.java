package net.mcreator.levelupreborn.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.levelupreborn.init.LeveluprebornModItems;
import net.mcreator.levelupreborn.init.LeveluprebornModFluids;
import net.mcreator.levelupreborn.init.LeveluprebornModFluidTypes;
import net.mcreator.levelupreborn.init.LeveluprebornModBlocks;

public abstract class GaggaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> LeveluprebornModFluidTypes.GAGGA_TYPE.get(), () -> LeveluprebornModFluids.GAGGA.get(), () -> LeveluprebornModFluids.FLOWING_GAGGA.get())
			.explosionResistance(100f).bucket(() -> LeveluprebornModItems.GAGGA_BUCKET.get()).block(() -> (LiquidBlock) LeveluprebornModBlocks.GAGGA.get());

	private GaggaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GaggaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GaggaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}