package com.charly1307.decosoul.common.entity.monster.model;

import com.charly1307.decosoul.common.entity.monster.KnightEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class KnightModel<T extends KnightEntity> extends EntityModel<T> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer body;
	private final ModelRenderer leftHand;
	private final ModelRenderer leftHand_r1;
	private final ModelRenderer rightHand;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;

	public KnightModel() {
		textureWidth = 64;
		textureHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, -0.1745F, -0.0873F, -0.0873F);
		leftLeg.setTextureOffset(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0873F);
		rightLeg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 12.0F, 0.0F);
		setRotationAngle(body, 0.3491F, 0.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		leftHand = new ModelRenderer(this);
		leftHand.setRotationPoint(6.0F, 1.0F, -4.0F);
		setRotationAngle(leftHand, -0.0873F, 0.0F, 0.0F);

		leftHand_r1 = new ModelRenderer(this);
		leftHand_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftHand.addChild(leftHand_r1);
		setRotationAngle(leftHand_r1, -0.0873F, 0.0F, 0.0F);
		leftHand_r1.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightHand = new ModelRenderer(this);
		rightHand.setRotationPoint(-6.0F, 0.5F, -3.5F);
		setRotationAngle(rightHand, 0.829F, 0.0F, 0.0F);
		rightHand.setTextureOffset(24, 16).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -2.0F);
		setRotationAngle(head, 0.2618F, 0.0F, 0.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
		this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.6F * limbSwingAmount;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
		this.rightHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.6F * limbSwingAmount;
		this.leftHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftHand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightHand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}