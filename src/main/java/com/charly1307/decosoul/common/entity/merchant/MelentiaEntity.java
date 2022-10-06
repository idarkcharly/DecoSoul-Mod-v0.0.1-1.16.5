package com.charly1307.decosoul.common.entity.merchant;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MelentiaEntity extends WanderingTraderEntity {
	private boolean invulnerable;

	public MelentiaEntity(EntityType<? extends WanderingTraderEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 1024.0D);
	}

	protected void registerGoals() {
		return;
	}

	protected SoundEvent getAmbientSound() {
		return this.hasCustomer() ? SoundEvents.ENTITY_WANDERING_TRADER_TRADE
				: SoundEvents.ENTITY_WANDERING_TRADER_AMBIENT;
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_WANDERING_TRADER_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_WANDERING_TRADER_DEATH;
	}

	protected SoundEvent getVillagerYesNoSound(boolean getYesSound) {
		return getYesSound ? SoundEvents.ENTITY_WANDERING_TRADER_YES : SoundEvents.ENTITY_WANDERING_TRADER_NO;
	}

	public SoundEvent getYesSound() {
		return SoundEvents.ENTITY_WANDERING_TRADER_YES;
	}

	@Override
	protected void onVillagerTrade(MerchantOffer offer) {

	}

	public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
		ItemStack itemstack = playerIn.getHeldItem(hand);
		if (itemstack.getItem() != Items.VILLAGER_SPAWN_EGG && this.isAlive() && !this.hasCustomer()
				&& !this.isChild()) {
			if (hand == Hand.MAIN_HAND) {
				playerIn.addStat(Stats.TALKED_TO_VILLAGER);
			}

			if (this.getOffers().isEmpty()) {
				return ActionResultType.func_233537_a_(this.world.isRemote);
			} else {
				if (!this.world.isRemote) {
					this.setCustomer(playerIn);
					this.openMerchantContainer(playerIn, this.getDisplayName(), 1);
				}

				return ActionResultType.func_233537_a_(this.world.isRemote);
			}
		} else {
			return super.getEntityInteractionResult(playerIn, hand);
		}
	}

	protected void populateTradeData() {
		VillagerTrades.ITrade[] avillagertrades$itrade = VillagerTrades.field_221240_b.get(1);
		VillagerTrades.ITrade[] avillagertrades$itrade1 = VillagerTrades.field_221240_b.get(2);
		if (avillagertrades$itrade != null && avillagertrades$itrade1 != null) {
			MerchantOffers merchantoffers = this.getOffers();
			this.addTrades(merchantoffers, avillagertrades$itrade, 5);
			int i = this.rand.nextInt(avillagertrades$itrade1.length);
			VillagerTrades.ITrade villagertrades$itrade = avillagertrades$itrade1[i];
			MerchantOffer merchantoffer = villagertrades$itrade.getOffer(this, this.rand);
			if (merchantoffer != null) {
				merchantoffers.add(merchantoffer);
			}

		}
	}

	/**
	 * Returns whether this Entity is invulnerable to the given DamageSource.
	 */
	public boolean isInvulnerableTo(DamageSource source) {
		return this.invulnerable && source != DamageSource.OUT_OF_WORLD && !source.isCreativePlayer();
	}

	public boolean isInvulnerable() {
		return this.invulnerable;
	}

	/**
	 * Sets whether this Entity is invulnerable.
	 */
	public void setInvulnerable(boolean isInvulnerable) {
		this.invulnerable = isInvulnerable;
	}

	@Override
	public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
		return null;
	}

}
