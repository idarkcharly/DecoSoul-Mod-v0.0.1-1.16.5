package com.charly1307.decosoul.common.blocks.custom;

import java.util.Random;

import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BonfireBlock extends Block {
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.5D, 0.0D, 0.5D, 15.5D, 4.0D, 15.5D);
	public static final BooleanProperty CLICKED = BooleanProperty.create("clicked");
	private final int fireDamage;

	public BonfireBlock(Properties properties, int fireDamage) {
		super(properties);
		this.fireDamage = fireDamage;
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {

		if (!worldIn.isRemote() && handIn == Hand.MAIN_HAND) {
			boolean currentState = state.get(CLICKED);
			worldIn.setBlockState(pos, state.with(CLICKED, !currentState), 3);
		}
		if (!state.get(CLICKED)) {
			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 500, 1, true, true));
			player.playSound(DecoSoulSoundEvents.BONFIRE_CLICKED.get(), SoundCategory.BLOCKS, 1, 1);

			for (int i = 0; i < 15; ++i) {
				worldIn.addParticle(ParticleTypes.FLAME, pos.getX() + Math.random(), pos.getY() + 0.6D,
						pos.getZ() + Math.random(), 0, 0.025, 0);
			}
			for (int i = 0; i < 50; ++i) {
				worldIn.addParticle(ParticleTypes.SMOKE, pos.getX() + Math.random(), pos.getY() + 0.3D,
						pos.getZ() + Math.random(), 0, 0.035, 0);
			}
		}
		/*
		 * Optional:
		 * 
		 * worldIn.setBlockState(pos, state.with(CLICKED, Boolean.valueOf(false)), 3);
		 */

		return ActionResultType.SUCCESS;
	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (stateIn.get(CLICKED)) {
			for (int i = 0; i < rand.nextInt(1) + 1; ++i) {
				worldIn.addParticle(ParticleTypes.LAVA, (double) pos.getX() + 0.3D, (double) pos.getY() + 0.3D,
						(double) pos.getZ() + 0.3D, (double) (rand.nextFloat() / 2.0F), 5.0E-5D,
						(double) (rand.nextFloat() / 2.0F));
			}

		}
	}

	@SuppressWarnings("deprecation")
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		if (!entityIn.isImmuneToFire() && state.get(CLICKED) && entityIn instanceof LivingEntity
				&& !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
			entityIn.attackEntityFrom(DamageSource.IN_FIRE, (float) this.fireDamage);

		}

		super.onEntityCollision(state, worldIn, pos, entityIn);
	}

	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(CLICKED);
	}
}
