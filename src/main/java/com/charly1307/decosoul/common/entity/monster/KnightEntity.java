package com.charly1307.decosoul.common.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class KnightEntity extends ZombieEntity {

	public KnightEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 40.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35D)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0D)
				.createMutableAttribute(Attributes.FOLLOW_RANGE, 10.0D)
				.createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS);
	}

}
