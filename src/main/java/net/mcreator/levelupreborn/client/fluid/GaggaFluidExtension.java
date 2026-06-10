package net.mcreator.levelupreborn.client.fluid;

@EventBusSubscriber(Dist.CLIENT)
public class GaggaFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("minecraft:block/blue_wool");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("minecraft:block/bamboo_large_leaves");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, LeveluprebornModFluidTypes.GAGGA_TYPE.get());
	}
}