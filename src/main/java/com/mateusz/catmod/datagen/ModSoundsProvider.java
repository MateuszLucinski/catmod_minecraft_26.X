package com.mateusz.catmod.datagen;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.sound.ModSounds;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class ModSoundsProvider extends SoundDefinitionsProvider {

    public ModSoundsProvider(PackOutput output) {
        super(output, CatMod.MOD_ID);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.CAT_USE_SOUND, SoundDefinition.definition()
                .subtitle("sound.catmod.cat_mint_use_sound")
                .with(
                        sound("catmod:cat_use")
                                .volume(1.0f)
                                .pitch(1.0f)
                )
        );
    }
}
