package com.charly1307.decosoul.common.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.world.World;

public class BleedingEffect extends Effect {

	protected BleedingEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}

	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier, World worldIn) {
		/*
		 * if (!entityLivingBaseIn.world.isRemote() && entityLivingBaseIn.getHealth() >
		 * 3.0F) { entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, 1F); }
		 */
		if (!entityLivingBaseIn.world.isRemote()) {
			Double x = entityLivingBaseIn.getPosX();
			Double y = entityLivingBaseIn.getPosY();
			Double z = entityLivingBaseIn.getPosZ();

			entityLivingBaseIn.setPositionAndUpdate(x, y, z);
			entityLivingBaseIn.setMotion(0, 0, 0);
		}
		super.performEffect(entityLivingBaseIn, amplifier);
	}

	@Override
	public boolean isReady(int duration, int amplifier) {

		return true;
	}
}