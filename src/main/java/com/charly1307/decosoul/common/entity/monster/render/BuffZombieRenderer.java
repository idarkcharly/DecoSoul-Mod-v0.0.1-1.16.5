package com.charly1307.decosoul.common.entity.monster.render;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.monster.BuffZombieEntity;
import com.charly1307.decosoul.common.entity.monster.model.BuffZombieModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BuffZombieRenderer extends MobRenderer<BuffZombieEntity, BuffZombieModel<BuffZombieEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(DecoSoulM.MOD_ID,
			"textures/entity/buff_zombie.png");

	public BuffZombieRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new BuffZombieModel<>(), 0.7F);
	}

	@Override
	public ResourceLocation getEntityTexture(BuffZombieEntity entity) {
		return TEXTURE;
	}
}