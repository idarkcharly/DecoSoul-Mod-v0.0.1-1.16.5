package com.charly1307.decosoul.common.entity.monster;

import com.charly1307.decosoul.common.items.ItemsModR;
import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class HollowEntity extends ZombieEntity {

	public HollowEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 40.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35D)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0D)
				.createMutableAttribute(Attributes.FOLLOW_RANGE, 10.0D)
				.createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS);
	}

	@Override
	protected void registerGoals() {
		this.applyEntityAI();

	}

	protected void applyEntityAI() {
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
		this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
	}

	protected boolean shouldBurnInDay() {
		return false;
	}

	public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
		return null;
	}

	public boolean canDespawn(double distanceToClosestPlayer) {
		return false;
	}

	protected void setEquipment(DifficultyInstance difficulty) {
		if (this.world.getDifficulty() == Difficulty.NORMAL && this.world.getDifficulty() == Difficulty.HARD) {
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemsModR.LIGHTNING_BROKEN_SWORD.get()));
		}
		super.setEquipmentBasedOnDifficulty(difficulty);
	}

	protected SoundEvent getAmbientSound() {
		return DecoSoulSoundEvents.ENTITY_HOLLOW_AMBIENT.get();
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return DecoSoulSoundEvents.ENTITY_HOLLOW_HURT.get();
	}

	protected SoundEvent getDeathSound() {
		return DecoSoulSoundEvents.ENTITY_HOLLOW_DEATH.get();
	}

	protected SoundEvent getStepSound() {
		return SoundEvents.ENTITY_ZOMBIE_STEP;
	}

	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}

}