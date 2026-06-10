package net.mcreator.levelupreborn.item;

public class AmethystAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 800, 7f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("levelupreborn:amethyst_axe_repair_items")));

	public AmethystAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -3.5f, properties.fireResistant());
	}
}