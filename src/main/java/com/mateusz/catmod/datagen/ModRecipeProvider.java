package com.mateusz.catmod.datagen;

import com.mateusz.catmod.block.ModBlocks;
import com.mateusz.catmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;


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
        /*BLOCKS*/
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


        /*TOOLS*/
        shaped(RecipeCategory.COMBAT, ModItems.CATANIUM_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("catanium")
                .save(output);


        shaped(RecipeCategory.TOOLS, ModItems.CATANIUM_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);


        shaped(RecipeCategory.TOOLS, ModItems.CATANIUM_AXE.get())
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("catanium")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.CATANIUM_SHOVEL.get())
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.CATANIUM_HOE.get())
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);


        /*ARMOR*/
        shaped(RecipeCategory.MISC, ModItems.CATANIUM_HEMLET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.CATANIUM_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.CATANIUM_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.CATANIUM_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.CATANIUM_SLAB.get())
                .unlockedBy(getHasName(ModItems.CATANIUM_SLAB.get()), has(ModItems.CATANIUM_SLAB))
                .group("catanium")
                .save(output);


    }
}
