package net.mcreator.levelupreborn.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AmethystSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 1f, 0, 4, TagKey.create(Registries.ITEM, ResourceLocation.parse("levelupreborn:amethyst_sword_repair_items")));

	public AmethystSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -3.2f).fireResistant());
	}
}