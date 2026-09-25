package com.mateusz.catmod.item;

import com.mateusz.catmod.CatMod;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CatMod.MOD_ID);

    public static final DeferredItem<Item> CAT_MINT = ITEMS.registerSimpleItem("cat_mint");
    public static final DeferredItem<Item> CATANIUM_SLAB = ITEMS.registerSimpleItem("catanium_slab");


    public static final DeferredItem<Item> CATANIUM_SWORD = ITEMS.registerItem("catanium_sword",
            properties -> new Item(properties.sword(ModToolTiers.CATANIUM, 3,-2.4f)));
    public static final DeferredItem<Item> CATANIUM_PICKAXE = ITEMS.registerItem("catanium_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.CATANIUM, 1,-2.8f)));
    public static final DeferredItem<Item> CATANIUM_AXE = ITEMS.registerItem("catanium_axe",
            properties -> new AxeItem(ModToolTiers.CATANIUM, 6,-3.2f,properties));
    public static final DeferredItem<Item> CATANIUM_SHOVEL = ITEMS.registerItem("catanium_shovel",
            properties -> new ShovelItem(ModToolTiers.CATANIUM, 1.5f,-3.0f,properties));
    public static final DeferredItem<Item> CATANIUM_HOE = ITEMS.registerItem("catanium_hoe",
            properties -> new HoeItem(ModToolTiers.CATANIUM, 0,-3.0f,properties));


    public static final DeferredItem<Item> CATANIUM_HEMLET = ITEMS.registerItem("catanium_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CATANIUM_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> CATANIUM_CHESTPLATE = ITEMS.registerItem("catanium_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CATANIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> CATANIUM_LEGGINGS = ITEMS.registerItem("catanium_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CATANIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> CATANIUM_BOOTS = ITEMS.registerItem("catanium_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CATANIUM_ARMOR_MATERIAL, ArmorType.BOOTS)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
