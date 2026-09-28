package com.mateusz.catmod.sound;

import com.mateusz.catmod.CatMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, CatMod.MOD_ID);

    public static final Holder<SoundEvent> CAT_USE_SOUND = SOUND_EVENTS.register(
            "cat_mint_use_sound",
            SoundEvent::createVariableRangeEvent
    );
}
