package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.EnumSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/VectorEffect.class */
public enum VectorEffect implements HasMatchName {
    None(0),
    NonScalingStroke("non-scaling-stroke", 0),
    NonScalingSize("non-scaling-size", 1),
    NonRotation("non-rotation", 2),
    FixedPosition("fixed-position", 4);


    @NotNull
    private final String matchName;
    private final int flag;

    VectorEffect(int flag) {
        this.matchName = name();
        this.flag = flag;
    }

    VectorEffect(@NotNull String matchName, int flag) {
        this.matchName = matchName;
        this.flag = flag;
    }

    @NotNull
    public static Set<VectorEffect> parse(@NotNull AttributeNode attributeNode) {
        String[] vectorEffectsRaw = attributeNode.getStringList("vector-effect");
        EnumSet<VectorEffect> vectorEffects = EnumSet.noneOf(VectorEffect.class);
        for (String effect : vectorEffectsRaw) {
            vectorEffects.add((VectorEffect) attributeNode.parser().parseEnum(effect, None));
        }
        return vectorEffects;
    }

    @Override // com.github.weisj.jsvg.attributes.HasMatchName
    @NotNull
    public String matchName() {
        return this.matchName;
    }

    private static int flags(@NotNull Set<VectorEffect> effects) {
        int flag = 0;
        for (VectorEffect effect : effects) {
            flag |= effect.flag;
        }
        return flag;
    }

    public static void applyEffects(@NotNull Set<VectorEffect> effects, @NotNull Output output, @NotNull RenderContext context, @Nullable AffineTransform elementTransform) {
        int flags = flags(effects);
        if (flags == 0) {
            return;
        }
        AffineTransform shapeTransform = new AffineTransform(context.userSpaceTransform());
        double x0 = elementTransform != null ? elementTransform.getTranslateX() : 0.0d;
        double y0 = elementTransform != null ? elementTransform.getTranslateY() : 0.0d;
        updateTransformForFlags(flags, shapeTransform, x0, y0);
        output.setTransform(context.rootTransform());
        output.applyTransform(shapeTransform);
    }

    @NotNull
    public static Shape applyNonScalingStroke(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape) {
        output.setTransform(context.rootTransform());
        return context.userSpaceTransform().createTransformedShape(shape);
    }

    private static void updateTransformForFlags(int flags, @NotNull AffineTransform transform, double x0, double y0) {
        switch (flags) {
            case 1:
                double detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
                if (detRoot != 0.0d) {
                    double detRootInv = 1.0d / detRoot;
                    transform.setTransform(transform.getScaleX() * detRootInv, transform.getShearY() * detRootInv, transform.getShearX() * detRootInv, transform.getScaleY() * detRootInv, transform.getTranslateX(), transform.getTranslateY());
                    break;
                }
                break;
            case 2:
                double detRoot2 = Math.sqrt(Math.abs(transform.getDeterminant()));
                transform.setTransform(detRoot2, 0.0d, 0.0d, detRoot2, transform.getTranslateX(), transform.getTranslateY());
                break;
            case 3:
                transform.setTransform(1.0d, 0.0d, 0.0d, 1.0d, transform.getTranslateX(), transform.getTranslateY());
                break;
            case 4:
                transform.setTransform(transform.getScaleX(), transform.getShearY(), transform.getShearX(), transform.getScaleY(), x0, y0);
                break;
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                double detRoot3 = Math.sqrt(Math.abs(transform.getDeterminant()));
                if (detRoot3 != 0.0d) {
                    double detRootInv2 = 1.0d / detRoot3;
                    transform.setTransform(transform.getScaleX() * detRootInv2, transform.getShearY() * detRootInv2, transform.getShearX() * detRootInv2, transform.getScaleY() * detRootInv2, x0, y0);
                    break;
                }
                break;
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                double detRoot4 = Math.sqrt(Math.abs(transform.getDeterminant()));
                transform.setTransform(detRoot4, 0.0d, 0.0d, detRoot4, x0, y0);
                break;
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                transform.setTransform(1.0d, 0.0d, 0.0d, 1.0d, x0, y0);
                break;
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/VectorEffect$Flags.class */
    private static final class Flags {
        private static final int NON_SCALING_SIZE = 1;
        private static final int NON_ROTATING = 2;
        private static final int FIXED_POSITION = 4;

        private Flags() {
        }
    }
}
