package com.charly1307.decosoul.common.items.custom;

import com.charly1307.decosoul.common.items.ItemsModR;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class EstusFlask extends Item {

	public EstusFlask(Properties properties) {
		super(properties);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		PlayerEntity playerentity = entityLiving instanceof PlayerEntity ? (PlayerEntity) entityLiving : null;

		if (!worldIn.isRemote) {
			for (EffectInstance effectinstance : PotionUtils.getEffectsFromStack(stack)) {
				if (effectinstance.getPotion().isInstant()) {
					effectinstance.getPotion().affectEntity(playerentity, playerentity, entityLiving,
							effectinstance.getAmplifier(), 1.0D);
				}
			}
		}
		for (int i = 0; i <= 60; i++) {
			worldIn.addOptionalParticle(ParticleTypes.FLAME, entityLiving.getPosXRandom(1.6),
					entityLiving.getPosYRandom() + 0.2, entityLiving.getPosZRandom(1.3), 0, 0d, 0);

		}

		entityLiving.addPotionEffect(new EffectInstance(Effects.REGENERATION, 200, 2, true, true));
		entityLiving.addPotionEffect(new EffectInstance(Effects.SATURATION, 200, 1, true, true));
		entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 200, 1, true, true));

		// JETT VALORANT
		// entityLiving.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 20, 5,
		// true, true));
		// entityLiving.addVelocity(0F, 1F, 0F);

		if (playerentity != null) {
			playerentity.addStat(Stats.ITEM_USED.get(this));
			if (!playerentity.abilities.isCreativeMode) {
				stack.damageItem(1, playerentity, (player) -> {
					player.sendBreakAnimation(playerentity.getActiveHand());
				});
			}
		}

		if (playerentity == null || !playerentity.abilities.isCreativeMode) {
			if (stack.isEmpty()) {
				return new ItemStack(ItemsModR.EMPTY_ESTUS_FLASK.get());
			}
		}

		return stack;
	}

	public int getUseDuration(ItemStack stack) {
		return 42;
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
	}
}
