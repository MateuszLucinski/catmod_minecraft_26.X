package com.mateusz.catmod.datagen;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.block.ModBlocks;
import com.mateusz.catmod.item.ModArmorMaterials;
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

        itemModels.generateFlatItem(ModItems.CATANIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CATANIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CATANIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CATANIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CATANIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(ModItems.CATANIUM_HEMLET.get(), ModArmorMaterials.CATANIUM_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET,false);
        itemModels.generateTrimmableItem(ModItems.CATANIUM_CHESTPLATE.get(), ModArmorMaterials.CATANIUM_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE,false);
        itemModels.generateTrimmableItem(ModItems.CATANIUM_LEGGINGS.get(), ModArmorMaterials.CATANIUM_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS,false);
        itemModels.generateTrimmableItem(ModItems.CATANIUM_BOOTS.get(), ModArmorMaterials.CATANIUM_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS,false);


        /*BLOCKS*/
        blockModels.createTrivialCube(ModBlocks.CATANIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CATANIUM_ORE.get());
    }

}


