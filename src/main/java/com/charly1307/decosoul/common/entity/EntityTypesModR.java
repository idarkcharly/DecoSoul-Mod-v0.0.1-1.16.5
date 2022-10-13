package com.charly1307.decosoul.common.entity;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.merchant.MelentiaEntity;
import com.charly1307.decosoul.common.entity.monster.BuffZombieEntity;
import com.charly1307.decosoul.common.entity.monster.HollowEntity;
import com.charly1307.decosoul.common.entity.monster.KnightEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesModR {

	public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			DecoSoulM.MOD_ID);

	public static final RegistryObject<EntityType<BuffZombieEntity>> BUFF_ZOMBIE = ENTITY_TYPES.register("buff_zombie",
			() -> EntityType.Builder.create(BuffZombieEntity::new, EntityClassification.MONSTER).size(1f, 3f)
					.build(new ResourceLocation(DecoSoulM.MOD_ID, "buff_zombie").toString()));

	public static final RegistryObject<EntityType<MelentiaEntity>> MELENTIA = ENTITY_TYPES.register("melentia",
			() -> EntityType.Builder.create(MelentiaEntity::new, EntityClassification.CREATURE).size(1f, 2f)
					.build(new ResourceLocation(DecoSoulM.MOD_ID, "melentia").toString()));

	public static final RegistryObject<EntityType<HollowEntity>> HOLLOW = ENTITY_TYPES.register("hollow",
			() -> EntityType.Builder.create(HollowEntity::new, EntityClassification.MONSTER).size(1f, 3f)
					.build(new ResourceLocation(DecoSoulM.MOD_ID, "hollow").toString()));

	public static final RegistryObject<EntityType<KnightEntity>> KNIGHT = ENTITY_TYPES.register("knight",
			() -> EntityType.Builder.create(KnightEntity::new, EntityClassification.MONSTER).size(1f, 3f)
					.build(new ResourceLocation(DecoSoulM.MOD_ID, "knight").toString()));

	public static void register(IEventBus eventBus) {
		ENTITY_TYPES.register(eventBus);
	}
}