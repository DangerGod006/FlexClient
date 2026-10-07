package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.parser.SeparatorMode;
import java.awt.geom.AffineTransform;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PreserveAspectRatio.class */
public final class PreserveAspectRatio {

    @NotNull
    public final Align align;

    @NotNull
    public final MeetOrSlice meetOrSlice;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PreserveAspectRatio$AlignType.class */
    private enum AlignType {
        Min { // from class: com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType.1
            @Override // com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType
            float align(float size1, float size2) {
                return 0.0f;
            }
        },
        Mid { // from class: com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType.2
            @Override // com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType
            float align(float size1, float size2) {
                return (size1 - size2) / 2.0f;
            }
        },
        Max { // from class: com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType.3
            @Override // com.github.weisj.jsvg.attributes.PreserveAspectRatio.AlignType
            float align(float size1, float size2) {
                return size1 - size2;
            }
        };

        abstract float align(float f, float f2);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PreserveAspectRatio$MeetOrSlice.class */
    public enum MeetOrSlice {
        Meet,
        Slice
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PreserveAspectRatio$Align.class */
    public enum Align {
        None(AlignType.Min, AlignType.Min),
        xMinYMin(AlignType.Min, AlignType.Min),
        xMidYMin(AlignType.Mid, AlignType.Min),
        xMaxYMin(AlignType.Max, AlignType.Min),
        xMinYMid(AlignType.Min, AlignType.Mid),
        xMidYMid(AlignType.Mid, AlignType.Mid),
        xMaxYMid(AlignType.Max, AlignType.Mid),
        xMinYMax(AlignType.Min, AlignType.Max),
        xMidYMax(AlignType.Mid, AlignType.Max),
        xMaxYMax(AlignType.Max, AlignType.Max);


        @NotNull
        private final AlignType xAlign;

        @NotNull
        private final AlignType yAlign;

        Align(@NotNull AlignType xAlign, @NotNull AlignType yAlign) {
            this.xAlign = xAlign;
            this.yAlign = yAlign;
        }

        @Override // java.lang.Enum
        public String toString() {
            return name() + "{" + this.xAlign + ", " + this.yAlign + "}";
        }
    }

    private PreserveAspectRatio(@NotNull Align align, @NotNull MeetOrSlice meetOrSlice) {
        this.align = align;
        this.meetOrSlice = meetOrSlice;
    }

    @NotNull
    public static PreserveAspectRatio none() {
        return new PreserveAspectRatio(Align.None, MeetOrSlice.Meet);
    }

    @NotNull
    public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @NotNull AttributeParser parser) {
        return parse(preserveAspectRation, null, parser);
    }

    @NotNull
    public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @Nullable PreserveAspectRatio fallback, @NotNull AttributeParser parser) {
        Align align = Align.xMidYMid;
        MeetOrSlice meetOrSlice = MeetOrSlice.Meet;
        if (preserveAspectRation == null) {
            return fallback != null ? fallback : new PreserveAspectRatio(align, meetOrSlice);
        }
        String[] components = parser.parseStringList(preserveAspectRation, SeparatorMode.COMMA_AND_WHITESPACE);
        if (components.length < 1 || components.length > 2) {
            throw new IllegalArgumentException("Too many arguments specified: " + preserveAspectRation);
        }
        Align align2 = (Align) parser.parseEnum(components[0], align);
        if (components.length > 1) {
            meetOrSlice = (MeetOrSlice) parser.parseEnum(components[1], meetOrSlice);
        }
        return new PreserveAspectRatio(align2, meetOrSlice);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreserveAspectRatio)) {
            return false;
        }
        PreserveAspectRatio that = (PreserveAspectRatio) o;
        return this.align == that.align && this.meetOrSlice == that.meetOrSlice;
    }

    public int hashCode() {
        return Objects.hash(this.align, this.meetOrSlice);
    }

    @NotNull
    public AffineTransform computeViewPortTransform(@NotNull FloatSize size, @NotNull ViewBox viewBox) {
        float yScale;
        float xScale;
        AffineTransform viewTransform = new AffineTransform();
        if (this.align == Align.None) {
            viewTransform.scale(size.width / viewBox.width, size.height / viewBox.height);
        } else {
            float xScale2 = size.width / viewBox.width;
            float yScale2 = size.height / viewBox.height;
            switch (this.meetOrSlice) {
                case Meet:
                    float fMin = Math.min(xScale2, yScale2);
                    yScale = fMin;
                    xScale = fMin;
                    break;
                case Slice:
                    float fMax = Math.max(xScale2, yScale2);
                    yScale = fMax;
                    xScale = fMax;
                    break;
                default:
                    throw new IllegalStateException();
            }
            viewTransform.translate(this.align.xAlign.align(size.width, viewBox.width * xScale), this.align.yAlign.align(size.height, viewBox.height * yScale));
            viewTransform.scale(xScale, yScale);
        }
        viewTransform.translate(-viewBox.x, -viewBox.y);
        return viewTransform;
    }

    public String toString() {
        return "PreserveAspectRatio{align=" + this.align + ", meetOrSlice=" + this.meetOrSlice + '}';
    }
}
