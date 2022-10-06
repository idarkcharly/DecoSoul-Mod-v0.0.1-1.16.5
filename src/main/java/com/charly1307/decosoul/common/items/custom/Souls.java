package com.charly1307.decosoul.common.items.custom;

import com.charly1307.decosoul.common.items.ItemsModR;
import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Souls extends Item {

	public Souls(Properties properties) {
		super(properties);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

		// Consume Item
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (playerIn != null) {
			playerIn.addStat(Stats.ITEM_USED.get(this));
			if (!playerIn.abilities.isCreativeMode) {
				itemstack.shrink(1);
			}
			if (itemstack.isEmpty()) {
				return new ActionResult<ItemStack>(ActionResultType.SUCCESS, new ItemStack(ItemsModR.SOUL.get(), 4));
			}

		}
		// Particles
		worldIn.addOptionalParticle(ParticleTypes.HAPPY_VILLAGER, playerIn.getPosXRandom(1.6),
				playerIn.getPosYRandom() + 0.2, playerIn.getPosZRandom(1.3), 0, 1d, 0);
		// SoundEffects
		worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
				DecoSoulSoundEvents.LIFEGEM_SOUND.get(), SoundCategory.BLOCKS, 1, 1);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
