package com.charly1307.decosoul.common.items.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.entity.projectile.FireballEntity;;

public class LingeringFlame extends Item {

	public LingeringFlame(Properties properties) {
		super(properties);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

		ItemStack item = playerIn.getHeldItem(handIn);
		Vector3d look = playerIn.getLookVec();

		FireballEntity fireball = new FireballEntity(worldIn, playerIn, 0.5D, 0.5D, 0.5D);

		fireball.setPosition(playerIn.getPosX() + look.x * 1.5D, playerIn.getPosY() + look.y * 1.5D,
				playerIn.getPosZ() + look.z * 1.5D);

		fireball.accelerationX = look.x * 0.1D;
		fireball.accelerationY = look.y * 0.1D;
		fireball.accelerationZ = look.z * 0.1D;
		fireball.explosionPower = 1;

		playerIn.getCooldownTracker().setCooldown(this, 30);

		worldIn.addEntity(fireball);

		return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
	}
}
