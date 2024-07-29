package de.jaspy.block.entity.client;

import de.jaspy.JPiano;
import de.jaspy.block.PianoBlockEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

import java.util.ArrayList;
import java.util.List;

public class PianoBlockEntityRenderer<T extends PianoBlockEntity> implements BlockEntityRenderer<T> {
    private final List<ModelPart> modelParts = new ArrayList<>();
    private static final Identifier TEXTURE = Identifier.of(JPiano.MOD_ID, "textures/block/piano.png");

    private final ModelPart piano;
    private final ModelPart body;
    private final ModelPart pedals;
    private final ModelPart keys;
    private final ModelPart white;
    private final ModelPart black;

    public PianoBlockEntityRenderer(ModelPart root) {
        this.piano = root.getChild("piano");
        this.body = piano.getChild("body");
        this.pedals = piano.getChild("pedals");
        this.keys = piano.getChild("keys");
        this.white = keys.getChild("white");
        this.black = keys.getChild("black");
        this.modelParts.addAll(List.of(piano, body, pedals, keys, white, black));
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData piano = modelPartData.addChild("piano", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

        ModelPartData body = piano.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-26.0F, -21.0F, -1.0F, 48.0F, 21.0F, 10.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-24.0F, -9.25F, -7.0F, 44.0F, 1.25F, 0.25F, new Dilation(0.0F))
                .uv(0, 31).cuboid(-24.0F, -8.05F, -7.0F, 44.0F, 0.45F, 5.35F, new Dilation(0.0F))
                .uv(98, 31).cuboid(-24.0F, -10.675F, -2.0F, 44.0F, 1.575F, 1.0F, new Dilation(0.0F))
                .uv(68, 95).cuboid(18.8F, -10.35F, -7.0F, 1.2F, 1.1F, 5.0F, new Dilation(0.0F))
                .uv(56, 95).cuboid(-24.0F, -10.35F, -7.0F, 1.2F, 1.1F, 5.0F, new Dilation(0.0F))
                .uv(104, 36).cuboid(20.0F, -11.3F, -7.0F, 2.0F, 11.3F, 6.0F, new Dilation(0.0F))
                .uv(88, 36).cuboid(-26.0F, -11.3F, -7.0F, 2.0F, 11.3F, 6.0F, new Dilation(0.0F))
                .uv(86, 110).cuboid(-26.0F, -12.5F, -2.5F, 2.0F, 1.2F, 1.5F, new Dilation(0.0F))
                .uv(78, 110).cuboid(20.0F, -12.5F, -2.5F, 2.0F, 1.2F, 1.5F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 8.0F, -1.0F));

        ModelPartData pedals = piano.addChild("pedals", ModelPartBuilder.create().uv(62, 110).cuboid(1.65F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F))
                .uv(54, 110).cuboid(0.15F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F))
                .uv(70, 110).cuboid(-1.35F, 6.7F, -4.5F, 0.8F, 0.4F, 2.9F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData keys = piano.addChild("keys", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData white = keys.addChild("white", ModelPartBuilder.create().uv(42, 95).cuboid(-16.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 95).cuboid(-15.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 95).cuboid(-11.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 95).cuboid(-11.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 88).cuboid(-7.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 88).cuboid(-6.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 88).cuboid(-2.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 88).cuboid(-3.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 88).cuboid(-3.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 88).cuboid(-0.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 88).cuboid(0.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 88).cuboid(4.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 81).cuboid(5.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 81).cuboid(8.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 81).cuboid(9.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 81).cuboid(8.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 81).cuboid(12.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 81).cuboid(12.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 81).cuboid(13.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 81).cuboid(14.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 74).cuboid(16.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 74).cuboid(20.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 74).cuboid(18.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 74).cuboid(19.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 74).cuboid(16.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 74).cuboid(17.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 74).cuboid(15.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 74).cuboid(11.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 67).cuboid(10.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 67).cuboid(7.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 67).cuboid(6.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 67).cuboid(4.825F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 67).cuboid(3.225F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 67).cuboid(2.425F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 67).cuboid(1.625F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 67).cuboid(0.025F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 60).cuboid(-1.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 60).cuboid(-5.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 60).cuboid(-4.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 60).cuboid(-7.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 60).cuboid(-8.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 60).cuboid(-10.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 60).cuboid(-9.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 60).cuboid(-12.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(98, 53).cuboid(-13.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(84, 53).cuboid(-15.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(70, 53).cuboid(-14.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(56, 53).cuboid(-17.575F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(42, 53).cuboid(-18.375F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(28, 53).cuboid(-19.975F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(14, 53).cuboid(-19.175F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F))
                .uv(0, 53).cuboid(-20.775F, -2.0F, -7.75F, 0.75F, 0.75F, 5.75F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Black = keys.addChild("black", ModelPartBuilder.create().uv(40, 110).cuboid(-20.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(32, 110).cuboid(-18.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(24, 110).cuboid(-17.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(16, 110).cuboid(-16.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(8, 110).cuboid(-15.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 110).cuboid(-14.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(96, 106).cuboid(-13.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(88, 106).cuboid(-4.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(80, 106).cuboid(3.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(72, 106).cuboid(4.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(64, 106).cuboid(7.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(56, 106).cuboid(6.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(48, 106).cuboid(12.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(40, 106).cuboid(14.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(48, 110).cuboid(15.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(32, 106).cuboid(18.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(24, 106).cuboid(17.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(16, 106).cuboid(18.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(8, 106).cuboid(11.775F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 106).cuboid(13.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(96, 102).cuboid(10.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(88, 102).cuboid(9.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(80, 102).cuboid(6.975F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(72, 102).cuboid(-1.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(64, 102).cuboid(-1.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(56, 102).cuboid(2.175F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(48, 102).cuboid(0.575F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(40, 102).cuboid(1.375F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(32, 102).cuboid(-5.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(24, 102).cuboid(-3.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(16, 102).cuboid(-6.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(8, 102).cuboid(-7.425F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(0, 102).cuboid(-12.225F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(96, 95).cuboid(-9.025F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(88, 95).cuboid(-10.625F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F))
                .uv(80, 95).cuboid(-9.825F, -2.25F, -6.25F, 0.5F, 0.75F, 3.25F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 192, 192);
    }
    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.translate(0.5, 1.5, 0.5);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));

        if (entity.getCachedState().contains(Properties.HORIZONTAL_FACING)) {
            int deg = 0;
            switch (entity.getCachedState().get(Properties.HORIZONTAL_FACING).getOpposite()) {
                case EAST -> deg = 90;
                case SOUTH -> deg = 180;
                case WEST -> deg = 270;
            }
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(deg));
        }


       piano.render(matrices, vertexConsumers.getBuffer(getRenderLayer(entity)), light, overlay);

       matrices.pop();

    }

    private RenderLayer getRenderLayer(T blockEntity) {
        String texturePath;
        texturePath = "textures/block/piano.png";
        return RenderLayer.getEntityCutout(Identifier.of(JPiano.MOD_ID,texturePath));
    }


    public static Identifier getTEXTURE() {
        return TEXTURE;
    }
}
