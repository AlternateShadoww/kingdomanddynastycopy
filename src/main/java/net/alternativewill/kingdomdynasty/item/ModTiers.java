package net.alternativewill.kingdomdynasty.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TAMAHAGANE = new ForgeTier(3, 1250, 1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TAMAHAGANE.get()));

    public static final ForgeTier BAMBOO = new ForgeTier(1, 531, 1.5f,
            2f, 22, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.BAMBOO_STICK.get()));
}
