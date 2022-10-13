package com.charly1307.decosoul.common.entity.monster.render;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.monster.KnightEntity;
import com.charly1307.decosoul.common.entity.monster.model.KnightModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KnightRender extends MobRenderer<KnightEntity, KnightModel<KnightEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(DecoSoulM.MOD_ID,
			"textures/entity/knight.png");

	public KnightRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new KnightModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(KnightEntity entity) {
		return TEXTURE;
	}
}
