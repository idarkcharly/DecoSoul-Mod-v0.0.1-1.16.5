package com.charly1307.decosoul.common.items.custom;

import java.util.List;

import javax.annotation.Nullable;

import com.charly1307.decosoul.common.effect.EffectsMod;

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

public class PoisonSwords extends SwordItem {

	public PoisonSwords(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
		super(tier, attackDamageIn, attackSpeedIn, builderIn);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add(new TranslationTextComponent("tooltip.decosoul.poison_sword"));

		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		target.addPotionEffect(new EffectInstance(Effects.POISON, 40, 3));
		attacker.addPotionEffect(new EffectInstance(EffectsMod.BLEEDING.get(), 50, 1));
		return super.hitEntity(stack, target, attacker);

	}
}
