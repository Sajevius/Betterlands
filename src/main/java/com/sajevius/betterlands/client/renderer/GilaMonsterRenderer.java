package com.sajevius.betterlands.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.client.model.GilaMonsterModel;
import com.sajevius.betterlands.entity.GilaMonsterEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GilaMonsterRenderer extends MobRenderer<GilaMonsterEntity, GilaMonsterModel<GilaMonsterEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Betterlands.MODID, "textures/entity/gila_monster.png");

    public GilaMonsterRenderer(EntityRendererManager manager) {
        super(manager, new GilaMonsterModel<>(), 0.7f);
    }

    @Override
    public void render(GilaMonsterEntity entity, float yaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        super.render(entity, yaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(GilaMonsterEntity entity) {
        return TEXTURE;
    }
}
