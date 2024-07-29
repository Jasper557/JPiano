package de.jaspy.block.entity.client;

import de.jaspy.block.PianoBlockEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;

import java.util.ArrayList;
import java.util.List;

public class PianoBlockEntityRenderer<T extends PianoBlockEntity> implements BlockEntityRenderer<T> {
    private final List<ModelPart> modelParts = new ArrayList<>();
    private final ModelPart Piano, PianoBody, Pedals, Keys, White, Black;

    public PianoBlockEntityRenderer(ModelPart root) {
        this.Piano = root.getChild("Piano");
        this.PianoBody = root.getChild("PianoBody");
        this.Pedals = root.getChild("Pedals");
        this.Keys = root.getChild("Keys");
        this.White = root.getChild("White");
        this.Black = root.getChild("Black");
        this.modelParts.addAll(List.of(Piano, PianoBody, Pedals, Keys, White, Black));
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Piano = modelPartData.addChild("Piano", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

        ModelPartData PianoBody = Piano.addChild("PianoBody", ModelPartBuilder.create().uv(0, 0).cuboid(-26.0F, -21.0F, -1.0F, 48.0F, 21.0F, 10.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -9.25F, -7.0F, 44.0F, 1.25F, 0.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -8.05F, -7.0F, 44.0F, 0.45F, 5.35F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -10.675F, -2.0F, 44.0F, 1.575F, 1.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(18.8F, -10.35F, -7.0F, 1.2F, 1.1F, 5.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -10.35F, -7.0F, 1.2F, 1.1F, 5.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(20.0F, -11.3F, -7.0F, 2.0F, 11.3F, 6.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-26.0F, -11.3F, -7.0F, 2.0F, 11.3F, 6.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-26.0F, -12.5F, -2.5F, 2.0F, 1.2F, 1.5F, new Dilation(0.0F))
                .uv(0, 0).cuboid(20.0F, -12.5F, -2.5F, 2.0F, 1.2F, 1.5F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 8.0F, -1.0F));

        ModelPartData Pedals = Piano.addChild("Pedals", ModelPartBuilder.create().uv(0, 0).cuboid(1.65F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F))
                .uv(0, 0).cuboid(0.15F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.35F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Keys = Piano.addChild("Keys", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData White = Keys.addChild("White", ModelPartBuilder.create().uv(0, 0).cuboid(-16.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-15.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-11.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-11.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-7.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-6.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-2.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-3.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-3.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-0.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(0.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(4.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(5.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(8.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(9.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(8.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(12.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(12.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(13.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(14.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(16.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(20.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(18.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(19.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(16.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(17.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(15.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(11.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(10.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(7.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(6.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(4.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(3.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(2.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(1.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(0.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-4.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-7.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-8.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-10.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-9.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-12.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-13.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-15.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-14.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-17.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-18.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-19.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-19.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-20.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Black = Keys.addChild("Black", ModelPartBuilder.create().uv(0, 0).cuboid(-20.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-18.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-17.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-16.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-15.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-14.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-13.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-4.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(3.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(4.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(7.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(6.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(12.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(14.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(15.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(18.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(17.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(18.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(11.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(13.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(10.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(9.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(6.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(2.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(0.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(1.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-3.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-6.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-7.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-12.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-9.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-10.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-9.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }


    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        
    }
}
