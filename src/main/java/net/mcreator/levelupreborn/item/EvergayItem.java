package net.mcreator.levelupreborn.item;

public class EvergayItem extends Item {
	public EvergayItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		EvergayRightclickedProcedure.execute(world, entity);
		return ar;
	}
}