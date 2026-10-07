package com.github.weisj.jsvg.attributes.font;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/PredefinedFontWeight.class */
@Immutable
public enum PredefinedFontWeight implements FontWeight {
    Normal { // from class: com.github.weisj.jsvg.attributes.font.PredefinedFontWeight.1
        @Override // com.github.weisj.jsvg.attributes.font.FontWeight
        public int weight(int parentWeight) {
            return PredefinedFontWeight.NORMAL_WEIGHT;
        }
    },
    Bold { // from class: com.github.weisj.jsvg.attributes.font.PredefinedFontWeight.2
        @Override // com.github.weisj.jsvg.attributes.font.FontWeight
        public int weight(int parentWeight) {
            return PredefinedFontWeight.BOLD_WEIGHT;
        }
    },
    Bolder { // from class: com.github.weisj.jsvg.attributes.font.PredefinedFontWeight.3
        @Override // com.github.weisj.jsvg.attributes.font.FontWeight
        public int weight(int parentWeight) {
            if (parentWeight < 400) {
                return PredefinedFontWeight.NORMAL_WEIGHT;
            }
            if (parentWeight < 600) {
                return 600;
            }
            return Math.max(parentWeight, 900);
        }
    },
    Lighter { // from class: com.github.weisj.jsvg.attributes.font.PredefinedFontWeight.4
        @Override // com.github.weisj.jsvg.attributes.font.FontWeight
        public int weight(int parentWeight) {
            return parentWeight > 700 ? PredefinedFontWeight.BOLD_WEIGHT : parentWeight > 500 ? PredefinedFontWeight.NORMAL_WEIGHT : Math.min(parentWeight, 100);
        }
    },
    Number { // from class: com.github.weisj.jsvg.attributes.font.PredefinedFontWeight.5
        @Override // com.github.weisj.jsvg.attributes.font.FontWeight
        public int weight(int parentWeight) {
            throw new UnsupportedOperationException("Number needs to be parsed explicitly");
        }
    };

    public static final int NORMAL_WEIGHT = 400;
    public static final int BOLD_WEIGHT = 700;
}
