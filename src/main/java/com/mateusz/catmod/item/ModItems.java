package com.mateusz.catmod.item;

import com.mateusz.catmod.CatMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CatMod.MOD_ID);

    public static final DeferredItem<Item> CAT_MINT = ITEMS.registerSimpleItem("cat_mint");
    public static final DeferredItem<Item> CATANIUM_SLAB = ITEMS.registerSimpleItem("catanium_slab");


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
