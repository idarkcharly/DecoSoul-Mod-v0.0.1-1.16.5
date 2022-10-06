package com.charly1307.decosoul.common.entity.merchant.model;

import com.charly1307.decosoul.common.entity.merchant.MelentiaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MelentiaModel<T extends MelentiaEntity> extends EntityModel<T> {
	private final ModelRenderer Comerciante;
	private final ModelRenderer Cabeza;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Capucha;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Torso;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Brazo_D;
	private final ModelRenderer Mano_D;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Brazo_I;
	private final ModelRenderer Mano_I;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Pierna_D;
	private final ModelRenderer Pie_D;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Pierna_I;
	private final ModelRenderer Pie_I;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Mochila;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public MelentiaModel() {
		textureWidth = 128;
		textureHeight = 128;

		Comerciante = new ModelRenderer(this);
		Comerciante.setRotationPoint(0.0F, 17.0F, 2.0F);

		Cabeza = new ModelRenderer(this);
		Cabeza.setRotationPoint(0.0F, -8.2164F, -1.0237F);
		Comerciante.addChild(Cabeza);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 0.2164F, -0.9763F);
		Cabeza.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(30, 0).addBox(-7.0F, -4.5F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Capucha = new ModelRenderer(this);
		Capucha.setRotationPoint(0.0F, -2.3555F, -4.7762F);
		Cabeza.addChild(Capucha);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 3.5719F, -0.7001F);
		Capucha.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(33, 0).addBox(0.5F, -3.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(32, 1).addBox(-1.5F, -4.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(32, 2).addBox(-2.5F, -3.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(34, 2).addBox(-0.5F, -4.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(32, 0).addBox(1.5F, -1.0F, 1.2F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(33, 0).addBox(-3.5F, -1.0F, 1.2F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(3.0F, -11.0F, -5.0F);
		Comerciante.addChild(Torso);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.0F, 12.0F, 6.0F);
		Torso.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(37, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		Brazo_D = new ModelRenderer(this);
		Brazo_D.setRotationPoint(-6.0F, -5.0F, 0.0F);
		Comerciante.addChild(Brazo_D);
		setRotationAngle(Brazo_D, -0.5334F, 0.3133F, 0.481F);
		Brazo_D.setTextureOffset(54, 26).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Mano_D = new ModelRenderer(this);
		Mano_D.setRotationPoint(0.0F, 6.0F, 0.0F);
		Brazo_D.addChild(Mano_D);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mano_D.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.9599F);
		cube_r4.setTextureOffset(30, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Brazo_I = new ModelRenderer(this);
		Brazo_I.setRotationPoint(6.0F, -5.0F, 0.0F);
		Comerciante.addChild(Brazo_I);
		setRotationAngle(Brazo_I, -0.5742F, -0.2213F, -0.3271F);
		Brazo_I.setTextureOffset(54, 26).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Mano_I = new ModelRenderer(this);
		Mano_I.setRotationPoint(0.0F, 6.0F, -5.0F);
		Brazo_I.addChild(Mano_I);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 5.0F);
		Mano_I.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.9599F);
		cube_r5.setTextureOffset(54, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Pierna_D = new ModelRenderer(this);
		Pierna_D.setRotationPoint(-2.0F, 5.0F, -2.0F);
		Comerciante.addChild(Pierna_D);
		setRotationAngle(Pierna_D, -1.5708F, 0.6109F, 0.0F);
		Pierna_D.setTextureOffset(37, 0).addBox(-3.1472F, -1.6383F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Pie_D = new ModelRenderer(this);
		Pie_D.setRotationPoint(0.0F, 6.0F, 0.0F);
		Pierna_D.addChild(Pie_D);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pie_D.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.215F, 0.0376F, -2.0031F);
		cube_r6.setTextureOffset(57, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Pierna_I = new ModelRenderer(this);
		Pierna_I.setRotationPoint(2.0F, 6.0F, 0.0F);
		Comerciante.addChild(Pierna_I);
		setRotationAngle(Pierna_I, -1.5708F, -0.6109F, 0.0F);
		Pierna_I.setTextureOffset(62, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Pie_I = new ModelRenderer(this);
		Pie_I.setRotationPoint(0.0F, 6.0F, 0.0F);
		Pierna_I.addChild(Pie_I);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pie_I.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2559F, 0.056F, 1.5636F);
		cube_r7.setTextureOffset(70, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		Mochila = new ModelRenderer(this);
		Mochila.setRotationPoint(0.0F, 23.0F, 0.0F);
		setRotationAngle(Mochila, 0.0436F, 0.0F, 0.0F);
		Mochila.setTextureOffset(56, 104).addBox(7.0F, -29.5F, 6.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(7.0F, -29.5F, 11.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(7.0F, -29.5F, 22.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(7.0F, -29.5F, 17.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(-8.0F, -29.5F, 6.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(-8.0F, -29.5F, 11.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(-8.0F, -29.5F, 17.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(56, 104).addBox(-8.0F, -29.5F, 22.66F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -39.0F, 23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -37.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -39.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -37.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -39.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -37.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -39.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -37.0F, 23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(66, 101).addBox(-0.5F, -38.0F, 22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Mochila.setTextureOffset(29, 4).addBox(-7.0F, -17.0F, 8.0F, 13.0F, 13.0F, 15.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
		Mochila.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(85, 97).addBox(-5.0F, -10.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-5.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(93, 98).addBox(-5.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(82, 100).addBox(-5.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(90, 99).addBox(-5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(84, 102).addBox(-5.0F, -15.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(87, 98).addBox(-5.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(89, 99).addBox(-5.0F, -16.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(100, 99).addBox(-5.0F, -17.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(100, 99).addBox(-5.0F, -17.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(100, 99).addBox(4.0F, -17.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(85, 97).addBox(4.0F, -10.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(4.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(93, 98).addBox(4.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(82, 100).addBox(4.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(90, 99).addBox(4.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(84, 102).addBox(4.0F, -15.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(87, 98).addBox(4.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(89, 99).addBox(4.0F, -16.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(100, 99).addBox(4.0F, -17.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(6.5F, -30.0F, 7.16F);
		Mochila.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.9599F);
		cube_r9.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-6.5F, -30.0F, 7.16F);
		Mochila.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.9599F);
		cube_r10.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -30.0F, 7.16F);
		Mochila.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
		cube_r11.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(56, 104).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-6.5F, -31.0F, 15.0F);
		Mochila.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -1.5708F, -0.6109F);
		cube_r12.setTextureOffset(62, 105).addBox(-9.5F, -0.5F, -7.5F, 19.0F, 1.0F, 14.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(6.5F, -31.0F, 15.0F);
		Mochila.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -1.5708F, 0.6109F);
		cube_r13.setTextureOffset(62, 105).addBox(-9.5F, -0.5F, -6.5F, 19.0F, 1.0F, 14.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.5F, -26.0F, 0.16F);
		Mochila.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.7409F, 1.5708F);
		cube_r14.setTextureOffset(56, 104).addBox(1.5F, -6.5F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(7.5F, -23.0F, 3.16F);
		Mochila.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.7418F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(56, 104).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r15.setTextureOffset(56, 104).addBox(-15.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(8.5F, -26.5F, 19.3F);
		Mochila.addChild(cube_r16);
		setRotationAngle(cube_r16, -3.1416F, 0.0F, -1.5708F);
		cube_r16.setTextureOffset(62, 105).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(8.5F, -21.5F, 14.3F);
		Mochila.addChild(cube_r17);
		setRotationAngle(cube_r17, -3.1416F, 0.0F, -1.5708F);
		cube_r17.setTextureOffset(62, 105).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 13.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-8.5F, -26.5F, 19.3F);
		Mochila.addChild(cube_r18);
		setRotationAngle(cube_r18, -3.1416F, 0.0F, -1.5708F);
		cube_r18.setTextureOffset(62, 105).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-8.5F, -21.5F, 19.3F);
		Mochila.addChild(cube_r19);
		setRotationAngle(cube_r19, -3.1416F, 0.0F, -1.5708F);
		cube_r19.setTextureOffset(62, 105).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 13.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -35.5243F, 17.5099F);
		Mochila.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.5708F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(56, 104).addBox(-0.5F, -12.0F, -0.5F, 1.0F, 19.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -4.0F, 24.0F);
		Mochila.addChild(cube_r21);
		setRotationAngle(cube_r21, -1.5708F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(58, 101).addBox(-5.0F, -0.5F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r21.setTextureOffset(58, 101).addBox(4.0F, -0.5F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r21.setTextureOffset(58, 101).addBox(-5.0F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r21.setTextureOffset(58, 101).addBox(4.0F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(12.5F, -2.5F, 16.0F);
		Mochila.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.5708F, 0.0F, 1.5708F);
		cube_r22.setTextureOffset(58, 101).addBox(-12.5F, -8.5F, 5.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);
		cube_r22.setTextureOffset(58, 101).addBox(-8.5F, -8.5F, 5.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);
		cube_r22.setTextureOffset(58, 101).addBox(-2.5F, -8.5F, 5.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.5F, -10.5F, 16.15F);
		Mochila.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.5708F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(62, 105).addBox(-2.45F, -9.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r23.setTextureOffset(62, 105).addBox(3.65F, -9.5F, -8.0F, 4.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r23.setTextureOffset(62, 105).addBox(-8.65F, -9.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(7.5F, -10.5F, 29.0F);
		Mochila.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -1.5708F, 1.5708F);
		cube_r24.setTextureOffset(62, 105).addBox(-15.3F, 14.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r24.setTextureOffset(62, 105).addBox(-9.2F, -0.5F, -8.0F, 4.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r24.setTextureOffset(62, 105).addBox(-15.3F, -0.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r24.setTextureOffset(62, 105).addBox(-9.2F, 14.5F, -8.0F, 4.0F, 1.0F, 16.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(7.5F, -10.5F, 23.0F);
		Mochila.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -1.5708F, 1.5708F);
		cube_r25.setTextureOffset(62, 105).addBox(-15.5F, 14.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);
		cube_r25.setTextureOffset(62, 105).addBox(-15.5F, -0.5F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-5.5F, -2.5F, 15.0F);
		Mochila.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.2618F, 0.0F);
		cube_r26.setTextureOffset(58, 101).addBox(-1.5F, -0.5F, -7.0F, 3.0F, 1.0F, 16.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.0F, -2.5F, 15.0F);
		Mochila.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.2618F, 0.0F);
		cube_r27.setTextureOffset(54, 101).addBox(-1.5F, -0.5F, -7.0F, 3.0F, 1.0F, 16.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(5.5F, -2.5F, 15.0F);
		Mochila.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, -0.2618F, 0.0F);
		cube_r28.setTextureOffset(58, 101).addBox(-1.5F, -0.5F, -7.0F, 3.0F, 1.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Cabeza.rotateAngleX = headPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Comerciante.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Mochila.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
