package com.charly1307.decosoul.common.items.custom;

import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class LifeGem extends Item {

	public LifeGem(Properties properties) {
		super(properties);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		// Consume Item
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.addStat(Stats.ITEM_USED.get(this));
		if (!playerIn.abilities.isCreativeMode) {
			itemstack.shrink(1);
		}
		// Particles
		for (int i = 0; i <= 45; i++) {
			worldIn.addOptionalParticle(ParticleTypes.HAPPY_VILLAGER, playerIn.getPosXRandom(1.6),
					playerIn.getPosYRandom() + 0.2, playerIn.getPosZRandom(1.3), 0, 1d, 0);
		}
		// SoundEffects
		playerIn.playSound(DecoSoulSoundEvents.LIFEGEM_SOUND.get(), SoundCategory.BLOCKS, 1, 1);
		// PotionEffects
		playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 1, true, false));

		// Add Cooldown
		// playerIn.getCooldownTracker().setCooldown(this, 300);

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}