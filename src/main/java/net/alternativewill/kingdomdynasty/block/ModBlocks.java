package net.alternativewill.kingdomdynasty.block;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.ModCreativeModTab;
import net.alternativewill.kingdomdynasty.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KingdomDynasty.MOD_ID);

    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> ADOBE_STAIRS = registerBlock("adobe_stairs",
            () -> new StairBlock(() -> ModBlocks.ADOBE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> ADOBE_SLAB = registerBlock("adobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> SMOOTH_ADOBE_STAIRS = registerBlock("smoothadobe_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_ADOBE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> SMOOTH_ADOBE_SLAB = registerBlock("smoothadobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> CUT_ADOBE = registerBlock("cutadobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> SMOOTH_ADOBE = registerBlock("smoothadobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> BAMBOO_PLANKS = registerBlock("bamboo_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.BAMBOO)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            () -> new StairBlock(() -> ModBlocks.BAMBOO_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(3f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> BAMBOO_SLAB = registerBlock("bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);

    public static final RegistryObject<Block> IRON_SAND = registerBlock("iron_sand",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f)), ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
