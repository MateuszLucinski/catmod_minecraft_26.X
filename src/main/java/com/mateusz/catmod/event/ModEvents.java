package com.mateusz.catmod.event;

import com.mateusz.catmod.CatMod;
import com.mateusz.catmod.item.ModItems;
import com.mateusz.catmod.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.feline.Cat;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = CatMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof Cat cat
                && event.getItemStack().is(ModItems.CAT_MINT.get())) {

            if (!event.getLevel().isClientSide()) {
                event.getLevel().playSound(
                        null,
                        cat.getX(), cat.getY(), cat.getZ(),
                        ModSounds.CAT_USE_SOUND.value(),
                        SoundSource.NEUTRAL,
                        1.0f,
                        1.0f
                );
            }
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }
    }
}
