package net.mcreator.levelupreborn.item;

public class AmethystSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 1f, 0, 4, TagKey.create(Registries.ITEM, ResourceLocation.parse("levelupreborn:amethyst_sword_repair_items")));

	public AmethystSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -3.2f));
	}
}