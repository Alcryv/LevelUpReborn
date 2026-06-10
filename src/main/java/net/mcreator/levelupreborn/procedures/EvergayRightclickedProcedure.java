package net.mcreator.levelupreborn.procedures;

import net.neoforged.bus.api.Event;

public class EvergayRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon minecraft:lightning_bolt");
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Dont use me").withColor(0xff0033).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.UNDERLINE), false);
		}
	}
}