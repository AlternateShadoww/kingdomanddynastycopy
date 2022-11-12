package net.alternativewill.kingdomdynasty.item;

import net.alternativewill.kingdomdynasty.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab KINGDOMDYNASTYESSENTIAL_TAB = new CreativeModeTab("kingdomdynastyessential") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CUT_ADOBE.get());
        }
    };

    public static final CreativeModeTab KINGDOMDYNASTYJAPAN_TAB = new CreativeModeTab("kingdomdynastyjapan") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TAMAHAGANE.get());
        }
    };
    public static final CreativeModeTab KINGDOMDYNASTYARMOR_TAB = new CreativeModeTab("kingdomdynastyarmor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NAGINATA.get());
        }
    };
    public static final CreativeModeTab KINGDOMDYNASTYWEAPONS_TAB = new CreativeModeTab("kingdomdynastyweapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.KATANA.get());
        }
    };
}