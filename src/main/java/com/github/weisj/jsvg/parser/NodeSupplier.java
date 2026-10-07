package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.Circle;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Defs;
import com.github.weisj.jsvg.nodes.Desc;
import com.github.weisj.jsvg.nodes.Ellipse;
import com.github.weisj.jsvg.nodes.Group;
import com.github.weisj.jsvg.nodes.Image;
import com.github.weisj.jsvg.nodes.Line;
import com.github.weisj.jsvg.nodes.LinearGradient;
import com.github.weisj.jsvg.nodes.Marker;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.Metadata;
import com.github.weisj.jsvg.nodes.Path;
import com.github.weisj.jsvg.nodes.Pattern;
import com.github.weisj.jsvg.nodes.Polygon;
import com.github.weisj.jsvg.nodes.Polyline;
import com.github.weisj.jsvg.nodes.RadialGradient;
import com.github.weisj.jsvg.nodes.Rect;
import com.github.weisj.jsvg.nodes.SVG;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.SolidColor;
import com.github.weisj.jsvg.nodes.Stop;
import com.github.weisj.jsvg.nodes.Style;
import com.github.weisj.jsvg.nodes.Symbol;
import com.github.weisj.jsvg.nodes.Title;
import com.github.weisj.jsvg.nodes.Use;
import com.github.weisj.jsvg.nodes.View;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.filter.DummyFilterPrimitive;
import com.github.weisj.jsvg.nodes.filter.FeBlend;
import com.github.weisj.jsvg.nodes.filter.FeColorMatrix;
import com.github.weisj.jsvg.nodes.filter.FeComposite;
import com.github.weisj.jsvg.nodes.filter.FeDisplacementMap;
import com.github.weisj.jsvg.nodes.filter.FeFlood;
import com.github.weisj.jsvg.nodes.filter.FeGaussianBlur;
import com.github.weisj.jsvg.nodes.filter.FeMerge;
import com.github.weisj.jsvg.nodes.filter.FeMergeNode;
import com.github.weisj.jsvg.nodes.filter.FeOffset;
import com.github.weisj.jsvg.nodes.filter.FeTurbulence;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.mesh.MeshGradient;
import com.github.weisj.jsvg.nodes.mesh.MeshPatch;
import com.github.weisj.jsvg.nodes.mesh.MeshRow;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.nodes.text.TextPath;
import com.github.weisj.jsvg.nodes.text.TextSpan;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/NodeSupplier.class */
public final class NodeSupplier {
    private final Map<String, Supplier<SVGNode>> constructorMap;

    public NodeSupplier() {
        this(new TreeMap(String.CASE_INSENSITIVE_ORDER));
    }

    public NodeSupplier(@NotNull Map<String, Supplier<SVGNode>> mapImpl) {
        mapImpl.clear();
        this.constructorMap = mapImpl;
        this.constructorMap.put(Anchor.TAG, () -> {
            return new Anchor();
        });
        this.constructorMap.put(ClipPath.TAG, () -> {
            return new ClipPath();
        });
        this.constructorMap.put(Defs.TAG, () -> {
            return new Defs();
        });
        this.constructorMap.put(Group.TAG, () -> {
            return new Group();
        });
        this.constructorMap.put(Image.TAG, () -> {
            return new Image();
        });
        this.constructorMap.put(Marker.TAG, () -> {
            return new Marker();
        });
        this.constructorMap.put(Mask.TAG, () -> {
            return new Mask();
        });
        this.constructorMap.put(SVG.TAG, () -> {
            return new SVG();
        });
        this.constructorMap.put(Style.TAG, () -> {
            return new Style();
        });
        this.constructorMap.put(Symbol.TAG, () -> {
            return new Symbol();
        });
        this.constructorMap.put(Use.TAG, () -> {
            return new Use();
        });
        this.constructorMap.put(View.TAG, () -> {
            return new View();
        });
        populateShapeNodeConstructors();
        populatePaintNodeConstructors();
        populateTextNodeConstructors();
        populateFilterNodeConstructors();
        populateAnimationNodeConstructors();
        populateMetaNodeConstructors();
        populateDummyNodeConstructors();
    }

    @Nullable
    public SVGNode create(@NotNull String tagName) {
        Supplier<SVGNode> supplier = this.constructorMap.get(tagName);
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    private void populateShapeNodeConstructors() {
        this.constructorMap.put(Circle.TAG, () -> {
            return new Circle();
        });
        this.constructorMap.put(Ellipse.TAG, () -> {
            return new Ellipse();
        });
        this.constructorMap.put(Line.TAG, () -> {
            return new Line();
        });
        this.constructorMap.put(Path.TAG, () -> {
            return new Path();
        });
        this.constructorMap.put(Polygon.TAG, () -> {
            return new Polygon();
        });
        this.constructorMap.put(Polyline.TAG, () -> {
            return new Polyline();
        });
        this.constructorMap.put(Rect.TAG, () -> {
            return new Rect();
        });
    }

    private void populatePaintNodeConstructors() {
        this.constructorMap.put(LinearGradient.TAG, () -> {
            return new LinearGradient();
        });
        this.constructorMap.put(MeshGradient.TAG, () -> {
            return new MeshGradient();
        });
        this.constructorMap.put(MeshPatch.TAG, () -> {
            return new MeshPatch();
        });
        this.constructorMap.put(MeshRow.TAG, () -> {
            return new MeshRow();
        });
        this.constructorMap.put(Pattern.TAG, () -> {
            return new Pattern();
        });
        this.constructorMap.put(RadialGradient.TAG, () -> {
            return new RadialGradient();
        });
        this.constructorMap.put(SolidColor.TAG, () -> {
            return new SolidColor();
        });
        this.constructorMap.put(Stop.TAG, () -> {
            return new Stop();
        });
    }

    private void populateTextNodeConstructors() {
        this.constructorMap.put(Text.TAG, () -> {
            return new Text();
        });
        this.constructorMap.put(TextPath.TAG, () -> {
            return new TextPath();
        });
        this.constructorMap.put(TextSpan.TAG, () -> {
            return new TextSpan();
        });
    }

    private void populateFilterNodeConstructors() {
        this.constructorMap.put(Filter.TAG, () -> {
            return new Filter();
        });
        this.constructorMap.put(FeBlend.TAG, () -> {
            return new FeBlend();
        });
        this.constructorMap.put(FeColorMatrix.TAG, () -> {
            return new FeColorMatrix();
        });
        this.constructorMap.put(FeComposite.TAG, () -> {
            return new FeComposite();
        });
        this.constructorMap.put(FeDisplacementMap.TAG, () -> {
            return new FeDisplacementMap();
        });
        this.constructorMap.put(FeFlood.TAG, () -> {
            return new FeFlood();
        });
        this.constructorMap.put(FeGaussianBlur.TAG, () -> {
            return new FeGaussianBlur();
        });
        this.constructorMap.put(FeMerge.TAG, () -> {
            return new FeMerge();
        });
        this.constructorMap.put(FeMergeNode.TAG, () -> {
            return new FeMergeNode();
        });
        this.constructorMap.put(FeTurbulence.TAG, () -> {
            return new FeTurbulence();
        });
        this.constructorMap.put(FeOffset.TAG, () -> {
            return new FeOffset();
        });
    }

    private void populateAnimationNodeConstructors() {
        this.constructorMap.put(Animate.TAG, () -> {
            return new Animate();
        });
        this.constructorMap.put(AnimateTransform.TAG, () -> {
            return new AnimateTransform();
        });
        this.constructorMap.put(Set.TAG, () -> {
            return new Set();
        });
    }

    private void populateMetaNodeConstructors() {
        this.constructorMap.put(Desc.TAG, () -> {
            return new Desc();
        });
        this.constructorMap.put(Metadata.TAG, () -> {
            return new Metadata();
        });
        this.constructorMap.put(Title.TAG, () -> {
            return new Title();
        });
    }

    private void populateDummyNodeConstructors() {
        this.constructorMap.put("feComponentTransfer", () -> {
            return new DummyFilterPrimitive("feComponentTransfer");
        });
        this.constructorMap.put("feConvolveMatrix", () -> {
            return new DummyFilterPrimitive("feConvolveMatrix");
        });
        this.constructorMap.put("feDiffuseLightning", () -> {
            return new DummyFilterPrimitive("feDiffuseLightning");
        });
        this.constructorMap.put("feDisplacementMap", () -> {
            return new DummyFilterPrimitive("feDisplacementMap");
        });
        this.constructorMap.put("feDropShadow", () -> {
            return new DummyFilterPrimitive("feDropShadow");
        });
        this.constructorMap.put("feFuncA", () -> {
            return new DummyFilterPrimitive("feFuncA");
        });
        this.constructorMap.put("feFuncB", () -> {
            return new DummyFilterPrimitive("feFuncB");
        });
        this.constructorMap.put("feFuncG", () -> {
            return new DummyFilterPrimitive("feFuncG");
        });
        this.constructorMap.put("feFuncR", () -> {
            return new DummyFilterPrimitive("feFuncR");
        });
        this.constructorMap.put("feImage", () -> {
            return new DummyFilterPrimitive("feImage");
        });
        this.constructorMap.put("feMorphology", () -> {
            return new DummyFilterPrimitive("feMorphology");
        });
        this.constructorMap.put("feSpecularLighting", () -> {
            return new DummyFilterPrimitive("feSpecularLighting");
        });
        this.constructorMap.put("feTile", () -> {
            return new DummyFilterPrimitive("feTile");
        });
    }
}
