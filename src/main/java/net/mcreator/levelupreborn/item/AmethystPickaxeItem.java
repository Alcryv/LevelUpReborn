package net.mcreator.levelupreborn.item;

public class AmethystPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 7f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("levelupreborn:amethyst_pickaxe_repair_items")));

	public AmethystPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 4f, -2.5f).fireResistant());
	}
}