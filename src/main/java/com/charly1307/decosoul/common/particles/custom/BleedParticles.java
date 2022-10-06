package com.charly1307.decosoul.common.particles.custom;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BleedParticles extends SpriteTexturedParticle {

	protected BleedParticles(ClientWorld world, double x, double y, double z, IAnimatedSprite sprite, double motionX,
			double motionY, double motionZ) {
		super(world, x, y, z, motionX, motionY, motionZ);

		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;
		this.particleScale *= 0.85F;
		this.maxAge = 30;
		this.selectSpriteWithAge(sprite);

		this.particleRed = 1f;
		this.particleGreen = 1f;
		this.particleBlue = 1f;

	}

	@Override
	public void tick() {
		super.tick();
		fadeOut();
	}

	private void fadeOut() {
		this.particleAlpha = (-(1 / (float) maxAge) * age + 1);

	}

	@Override
	public IParticleRenderType getRenderType() {
		return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@OnlyIn(Dist.CLIENT)
	public static class Factory implements IParticleFactory<BasicParticleType> {

		private final IAnimatedSprite sprites;

		public Factory(IAnimatedSprite sprite) {
			this.sprites = sprite;
		}

		@Override
		public Particle makeParticle(BasicParticleType particleTypeIn, ClientWorld worldIn, double x, double y,
				double z, double xSpeed, double ySpeed, double zSpeed) {

			return new BleedParticles(worldIn, x, y, z, this.sprites, xSpeed, ySpeed, zSpeed);
		}

	}

}
