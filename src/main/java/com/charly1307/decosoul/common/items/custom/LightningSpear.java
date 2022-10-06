package com.charly1307.decosoul.common.items.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LightningSpear extends Item {

	public LightningSpear(Properties properties) {
		super(properties);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

		ItemStack item = playerIn.getHeldItem(handIn);
	//	Vector3d look = playerIn.getLookVec();
	//	FireballEntity fireball = new FireballEntity(worldIn, playerIn, 0.5D, 0.5D, 0.5D);

		return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);

	}

}
