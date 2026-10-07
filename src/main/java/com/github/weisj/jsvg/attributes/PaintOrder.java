package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PaintOrder.class */
public final class PaintOrder {
    public static final PaintOrder NORMAL = new PaintOrder(Phase.FILL, Phase.STROKE, Phase.MARKERS);

    @NotNull
    private final Phase[] phases;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/PaintOrder$Phase.class */
    public enum Phase {
        FILL,
        STROKE,
        MARKERS
    }

    public PaintOrder(@NotNull Phase... phases) {
        this.phases = phases;
    }

    @NotNull
    public Phase[] phases() {
        return this.phases;
    }

    @NotNull
    public static PaintOrder parse(@NotNull AttributeNode attributeNode) {
        String value = attributeNode.getValue("paint-order");
        AttributeParser parser = attributeNode.parser();
        if (value == null || "normal".equals(value)) {
            return NORMAL;
        }
        String[] rawPhases = parser.parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
        Phase[] phases = new Phase[3];
        int length = Math.min(phases.length, rawPhases.length);
        int i = 0;
        while (i < length) {
            phases[i] = (Phase) parser.parseEnum(rawPhases[i], Phase.class);
            if (phases[i] != null) {
                i++;
            }
        }
        while (i < 3) {
            phases[i] = findNextInNormalOrder(phases, i);
            i++;
        }
        return new PaintOrder(phases);
    }

    @NotNull
    private static Phase findNextInNormalOrder(@NotNull Phase[] phases, int maxIndex) {
        for (Phase phase : NORMAL.phases()) {
            boolean found = false;
            int i = 0;
            while (true) {
                if (i >= maxIndex) {
                    break;
                }
                if (phases[i] != phase) {
                    i++;
                } else {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return phase;
            }
        }
        throw new IllegalStateException();
    }
}
