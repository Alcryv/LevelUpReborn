package net.mcreator.levelupreborn.fluid;

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