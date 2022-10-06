package com.charly1307.decosoul.common.entity.merchant.render;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.merchant.MelentiaEntity;
import com.charly1307.decosoul.common.entity.merchant.model.MelentiaModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MelentiaRenderer extends MobRenderer<MelentiaEntity, MelentiaModel<MelentiaEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(DecoSoulM.MOD_ID,
			"textures/entity/melentia.png");

	public MelentiaRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new MelentiaModel<>(), 0.7F);
	}

	@Override
	public ResourceLocation getEntityTexture(MelentiaEntity entity) {
		return TEXTURE;
	}
}