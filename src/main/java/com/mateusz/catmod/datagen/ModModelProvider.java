package com.mateusz.catmod.datagen;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.block.ModBlocks;
import com.mateusz.catmod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, CatMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels){
        itemModels.generateFlatItem(ModItems.CAT_MINT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CATANIUM_SLAB.get(), ModelTemplates.FLAT_ITEM);

        /*BLOCKS*/
        blockModels.createTrivialCube(ModBlocks.CATANIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CATANIUM_ORE.get());
    }

}


