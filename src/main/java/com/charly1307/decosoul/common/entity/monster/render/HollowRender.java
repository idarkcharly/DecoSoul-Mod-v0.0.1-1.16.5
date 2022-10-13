package com.charly1307.decosoul.common.entity.monster.render;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.monster.HollowEntity;
import com.charly1307.decosoul.common.entity.monster.model.HollowModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HollowRender extends MobRenderer<HollowEntity, HollowModel<HollowEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(DecoSoulM.MOD_ID,
			"textures/entity/hollow.png");

	public HollowRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new HollowModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(HollowEntity entity) {
		return TEXTURE;
	}
}
