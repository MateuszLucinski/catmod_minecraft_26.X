package com.mateusz.catmod.datagen;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.item.ModItems;
import com.mateusz.catmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, CatMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.CATANIUM_REPAIRABLE)
                .add(ModItems.CATANIUM_SLAB.get());

        tag(ItemTags.SWORDS).add(ModItems.CATANIUM_SWORD.get());
        tag(ItemTags.PICKAXES).add(ModItems.CATANIUM_PICKAXE.get());
        tag(ItemTags.AXES).add(ModItems.CATANIUM_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.CATANIUM_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.CATANIUM_HOE.get());

    }
}
