package com.charly1307.decosoul.core.util.events;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.EntityTypesModR;
import com.charly1307.decosoul.common.entity.merchant.MelentiaEntity;
import com.charly1307.decosoul.common.entity.monster.BuffZombieEntity;
import com.charly1307.decosoul.common.entity.monster.HollowEntity;
import com.charly1307.decosoul.common.entity.monster.KnightEntity;
import com.charly1307.decosoul.common.items.custom.ModSpawnEggItem;
import com.charly1307.decosoul.common.particles.ParticlesMod;
import com.charly1307.decosoul.common.particles.custom.BleedParticles;
import com.charly1307.decosoul.common.particles.custom.LightningBoltParticles;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecoSoulM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBus {
	@SubscribeEvent
	public static void addEntityAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityTypesModR.BUFF_ZOMBIE.get(), BuffZombieEntity.setCustomAttributes().create());
		event.put(EntityTypesModR.MELENTIA.get(), MelentiaEntity.setCustomAttributes().create());
		event.put(EntityTypesModR.HOLLOW.get(), HollowEntity.setCustomAttributes().create());
		event.put(EntityTypesModR.KNIGHT.get(), KnightEntity.setCustomAttributes().create());

	}

	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		ModSpawnEggItem.initSpawnEggs();
	}

	@SubscribeEvent
	public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particles.registerFactory(ParticlesMod.BLEED_PARTICLES.get(),
				BleedParticles.Factory::new);

		Minecraft.getInstance().particles.registerFactory(ParticlesMod.LIGHTNING_BOLT.get(),
				LightningBoltParticles.Factory::new);
	}

}