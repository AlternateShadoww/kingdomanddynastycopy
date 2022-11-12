package net.alternativewill.kingdomdynasty.item;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KingdomDynasty.MOD_ID);

    public static final RegistryObject<Item> TAMAHAGANE = ITEMS.register("tamahagane",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB)));

    public static final RegistryObject<Item> BAMBOO_STICK = ITEMS.register("bamboo_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB)));


    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 4,-1.76f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 2,-1.3f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KAMA = ITEMS.register("kama",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 3,-1.5f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MASAKARI = ITEMS.register("masakari",
            () -> new AxeItem(ModTiers.TAMAHAGANE, 7,-3.5f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NAGINATA = ITEMS.register("naginata",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 6,-3.3f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SHINAI = ITEMS.register("shinai",
            () -> new SwordItem(ModTiers.BAMBOO, -2,-1.76f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO = ITEMS.register("karuta_kabuto",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO = ITEMS.register("karuta_do",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI = ITEMS.register("karuta_kusazuri",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA = ITEMS.register("karuta_geta",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));






    public static void register(IEventBus eventBus){
     ITEMS.register(eventBus);
    }
}
