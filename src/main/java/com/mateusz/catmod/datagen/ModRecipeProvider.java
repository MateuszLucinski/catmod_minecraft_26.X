package com.mateusz.catmod.datagen;

import com.mateusz.catmod.block.ModBlocks;
import com.mateusz.catmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider,recipeOutput);
        }

        @Override
        public String getName() {
            return "Cat Mod Recipes";
        }
    }


    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.MISC, ModBlocks.CATANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output, "catmod:catanium_block_from_slabs");

        shapeless(RecipeCategory.MISC, ModItems.CATANIUM_SLAB.get(),9)
                .requires(ModBlocks.CATANIUM_BLOCK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output, "catmod:catanium_slabs_from_block");
    }
}
