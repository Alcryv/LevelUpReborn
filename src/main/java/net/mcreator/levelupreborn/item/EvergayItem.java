package net.mcreator.levelupreborn.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.levelupreborn.procedures.EvergayRightclickedProcedure;

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