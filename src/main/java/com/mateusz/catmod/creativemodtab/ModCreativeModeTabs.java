package com.mateusz.catmod.creativemodtab;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.block.ModBlocks;
import com.mateusz.catmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
     public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
             DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CatMod.MOD_ID);

     public static final Supplier<CreativeModeTab> CATANIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("catanium_items_tab",
             () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CATANIUM_SLAB.get()))
                     .title(Component.translatable("creativetab.catmod.catanium_items"))
                     .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                     .displayItems((itemDisplayParameters, output) -> {
                         output.accept(ModItems.CATANIUM_SLAB);
                         output.accept(ModBlocks.CATANIUM_BLOCK);
                         output.accept(ModBlocks.CATANIUM_ORE);

                     })
                     .build());

     public static void register(IEventBus eventBus){
         CREATIVE_MODE_TABS.register(eventBus);
     }
}
