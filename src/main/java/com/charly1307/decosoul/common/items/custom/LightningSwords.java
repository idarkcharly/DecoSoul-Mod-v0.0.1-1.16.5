package com.charly1307.decosoul.common.items.custom;

import java.util.List;

import javax.annotation.Nullable;

import com.charly1307.decosoul.common.particles.ParticlesMod;
import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class LightningSwords extends SwordItem {

	public LightningSwords(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
		super(tier, attackDamageIn, attackSpeedIn, builderIn);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add(new TranslationTextComponent("tooltip.decosoul.lightning_sword"));

		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {

		for (int i = 0; i <= 60; i++) {
			target.world.addOptionalParticle(ParticlesMod.LIGHTNING_BOLT.get(), target.getPosXRandom(1.6),
					target.getPosYRandom() + 0.2, target.getPosZRandom(1.3), 0d, 0d, 0d);
		}

		attacker.playSound(DecoSoulSoundEvents.TUNDER_SOUND.get(), 1, 1);
		target.playSound(DecoSoulSoundEvents.TUNDER_SOUND.get(), 1, 1);
		target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 25, 3, true, false));
		
		return super.hitEntity(stack, target, attacker);

	}

}