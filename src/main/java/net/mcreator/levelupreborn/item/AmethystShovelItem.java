package net.mcreator.levelupreborn.item;

public class AmethystShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 800, 7f, 0, 4, TagKey.create(Registries.ITEM, ResourceLocation.parse("levelupreborn:amethyst_shovel_repair_items")));

	public AmethystShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -3.1f, properties.fireResistant());
	}
}