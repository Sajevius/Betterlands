package com.sajevius.betterlands.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.sajevius.betterlands.entity.GilaMonsterEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GilaMonsterModel<T extends GilaMonsterEntity> extends EntityModel<T> {
    private final ModelRenderer gila_monster;
    private final ModelRenderer body_front;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer tongue;
    private final ModelRenderer upperjaw;
    private final ModelRenderer body;
    private final ModelRenderer leg2;
    private final ModelRenderer leg2rot;
    private final ModelRenderer leg3;
    private final ModelRenderer leg3rot;
    private final ModelRenderer body_back;
    private final ModelRenderer leg0;
    private final ModelRenderer leg0rot;
    private final ModelRenderer leg1;
    private final ModelRenderer leg1rot;
    private final ModelRenderer tail;
    private final ModelRenderer segment0;
    private final ModelRenderer segment1;

    public GilaMonsterModel() {
        texWidth = 64;
        texHeight = 64;

        gila_monster = new ModelRenderer(this);
        gila_monster.setPos(0.0F, 24.0F, -5.0F);


        body_front = new ModelRenderer(this);
        body_front.setPos(0.0F, -5.0F, 5.0F);
        gila_monster.addChild(body_front);


        neck = new ModelRenderer(this);
        neck.setPos(0.0F, 1.0F, -10.0F);
        body_front.addChild(neck);
        neck.texOffs(0, 10).addBox(-2.5F, -3.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.5F, -5.0F);
        neck.addChild(head);
        head.texOffs(24, 2).addBox(-2.5F, 0.5F, -7.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);

        tongue = new ModelRenderer(this);
        tongue.setPos(0.0F, 1.5F, 4.0F);
        head.addChild(tongue);
        tongue.texOffs(48, 3).addBox(-0.5F, -1.0F, -11.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        upperjaw = new ModelRenderer(this);
        upperjaw.setPos(0.0F, -0.0625F, -0.1875F);
        head.addChild(upperjaw);
        upperjaw.texOffs(0, 0).addBox(-2.5F, -2.4375F, -6.8125F, 5.0F, 3.0F, 7.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 4.0F, -8.0F);
        body_front.addChild(body);
        body.texOffs(0, 20).addBox(-3.5F, -6.0F, -2.0F, 7.0F, 5.0F, 10.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setPos(-2.0F, 1.0F, -8.5F);
        body_front.addChild(leg2);


        leg2rot = new ModelRenderer(this);
        leg2rot.setPos(-1.0F, -1.0F, 0.0F);
        leg2.addChild(leg2rot);
        setRotationAngle(leg2rot, -0.6109F, 0.0F, 0.7854F);
        leg2rot.texOffs(34, 26).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

        leg3 = new ModelRenderer(this);
        leg3.setPos(2.0F, 1.0F, -8.5F);
        body_front.addChild(leg3);


        leg3rot = new ModelRenderer(this);
        leg3rot.setPos(1.0F, -1.0F, 0.0F);
        leg3.addChild(leg3rot);
        setRotationAngle(leg3rot, -0.6109F, 0.0F, -0.7854F);
        leg3rot.texOffs(34, 26).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        body_back = new ModelRenderer(this);
        body_back.setPos(0.0F, -4.5F, 5.0F);
        gila_monster.addChild(body_back);
        body_back.texOffs(0, 35).addBox(-3.5F, -2.5F, 0.0F, 7.0F, 5.0F, 10.0F, 0.0F, false);

        leg0 = new ModelRenderer(this);
        leg0.setPos(-2.0F, 0.5F, 7.5F);
        body_back.addChild(leg0);


        leg0rot = new ModelRenderer(this);
        leg0rot.setPos(-1.4056F, -0.5944F, -0.8192F);
        leg0.addChild(leg0rot);
        setRotationAngle(leg0rot, 0.6109F, 0.0F, 0.7854F);
        leg0rot.texOffs(34, 26).addBox(-1.0944F, -0.4056F, -0.6808F, 3.0F, 6.0F, 3.0F, 0.0F, true);

        leg1 = new ModelRenderer(this);
        leg1.setPos(2.0F, 0.5F, 7.5F);
        body_back.addChild(leg1);


        leg1rot = new ModelRenderer(this);
        leg1rot.setPos(1.4056F, -0.5944F, -0.8192F);
        leg1.addChild(leg1rot);
        setRotationAngle(leg1rot, 0.6109F, 0.0F, -0.7854F);
        leg1rot.texOffs(34, 26).addBox(-1.9056F, -0.4056F, -0.6808F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.5F, 10.0F);
        body_back.addChild(tail);


        segment0 = new ModelRenderer(this);
        segment0.setPos(0.0F, 0.0F, 0.0F);
        tail.addChild(segment0);
        segment0.texOffs(34, 35).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 4.0F, 10.0F, 0.0F, false);

        segment1 = new ModelRenderer(this);
        segment1.setPos(0.0F, 0.0F, 10.0F);
        segment0.addChild(segment1);
        segment1.texOffs(42, 49).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(GilaMonsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.body_back.yRot = MathHelper.cos(limbSwing * 0.3F + (float) Math.PI) * (limbSwingAmount * 0.3F);
        this.body_front.yRot = MathHelper.cos(limbSwing * 0.3F) * (limbSwingAmount * 0.3F);
        this.segment0.yRot = MathHelper.cos(limbSwing * 0.2F) * (limbSwingAmount * 0.3F);
        this.segment1.yRot = MathHelper.cos(limbSwing * 0.2F) * (limbSwingAmount * 0.3F);
        this.neck.yRot = headPitch / (180F / (float) Math.PI);
        this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
        this.head.xRot = headPitch / (180F / (float) Math.PI);
        this.leg0.yRot = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
        this.leg1.yRot = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
        this.leg2.yRot = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
        this.leg3.yRot = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        gila_monster.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
