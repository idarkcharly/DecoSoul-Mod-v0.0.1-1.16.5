package com.charly1307.decosoul.common.particles;

import com.charly1307.decosoul.DecoSoulM;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticlesMod {
	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DecoSoulM.MOD_ID);

	public static final RegistryObject<BasicParticleType> BLEED_PARTICLES = PARTICLE_TYPES.register("bleed_particles",
			() -> new BasicParticleType(true));

	public static final RegistryObject<BasicParticleType> LIGHTNING_BOLT = PARTICLE_TYPES.register("lightning_bolt",
			() -> new BasicParticleType(true));

	public static void register(IEventBus eventBus) {
		PARTICLE_TYPES.register(eventBus);
	}
}
