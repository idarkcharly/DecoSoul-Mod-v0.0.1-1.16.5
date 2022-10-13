package com.charly1307.decosoul.core.util;

import com.charly1307.decosoul.DecoSoulM;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DecoSoulSoundEvents {

	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DecoSoulM.MOD_ID);

	public static final RegistryObject<SoundEvent> LIFEGEM_SOUND = registerSoundEvent("lifegem_sound");
	public static final RegistryObject<SoundEvent> TUNDER_SOUND = registerSoundEvent("tunder_sound");
	public static final RegistryObject<SoundEvent> UNDEAD_FOOTSTEP = registerSoundEvent("undead_footstep");
	public static final RegistryObject<SoundEvent> BONFIRE_CLICKED = registerSoundEvent("bonfire_clicked");

	// HOLLOW ENTITY
	public static final RegistryObject<SoundEvent> ENTITY_HOLLOW_AMBIENT = registerSoundEvent("entity_hollow_ambient");
	public static final RegistryObject<SoundEvent> ENTITY_HOLLOW_HURT = registerSoundEvent("entity_hollow_hurt");
	public static final RegistryObject<SoundEvent> ENTITY_HOLLOW_DEATH = registerSoundEvent("entity_hollow_death");

	private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(DecoSoulM.MOD_ID, name)));
	}

	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
}