package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.UIFuture;
import com.github.weisj.jsvg.parser.ValueUIFuture;
import com.github.weisj.jsvg.parser.resources.MissingImageResource;
import com.github.weisj.jsvg.parser.resources.RenderableResource;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Image.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.Graphic, Category.GraphicsReferencing})
public final class Image extends RenderableSVGNode {
    private static final Logger LOGGER = Logger.getLogger(Image.class.getName());
    public static final String TAG = "image";
    private Length x;
    private Length y;
    private Length width;
    private Length height;
    private PreserveAspectRatio preserveAspectRatio;
    private Overflow overflow;
    private UIFuture<RenderableResource> imgResource;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.RenderableSVGNode, com.github.weisj.jsvg.nodes.prototype.Renderable
    public boolean isVisible(@NotNull RenderContext context) {
        return this.imgResource != null && super.isVisible(context);
    }

    @Override // com.github.weisj.jsvg.nodes.RenderableSVGNode, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.x = attributeNode.getLength("x", 0.0f);
        this.y = attributeNode.getLength("y", 0.0f);
        this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
        this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
        this.preserveAspectRatio = PreserveAspectRatio.parse(attributeNode.getValue("preserveAspectRatio"), attributeNode.parser());
        this.overflow = (Overflow) attributeNode.getEnum("overflow", Overflow.Hidden);
        String url = attributeNode.parser().parseUrl(attributeNode.getHref());
        if (url != null) {
            try {
                this.imgResource = attributeNode.resourceLoader().loadImage(new URI(url));
            } catch (IOException | URISyntaxException e) {
                LOGGER.log(Level.INFO, e.getMessage(), (Throwable) e);
                this.imgResource = null;
            }
        }
    }

    @Nullable
    private RenderableResource fetchImage(@NotNull RenderContext context) {
        if (this.imgResource == null) {
            return null;
        }
        if (this.imgResource instanceof ValueUIFuture) {
            return this.imgResource.get();
        }
        if (!this.imgResource.checkIfReady(context.platformSupport())) {
            return null;
        }
        RenderableResource resource = this.imgResource.get();
        if (resource != null) {
            this.imgResource = new ValueUIFuture(resource);
        }
        return resource;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Renderable
    public void render(@NotNull RenderContext context, @NotNull Output output) {
        RenderableResource resource = fetchImage(context);
        if (resource == null) {
            resource = new MissingImageResource();
        }
        MeasureContext measure = context.measureContext();
        FloatSize intrinsicResourceSize = resource.intrinsicSize(context);
        float resourceWidth = intrinsicResourceSize.width;
        float resourceHeight = intrinsicResourceSize.height;
        if (resourceWidth == 0.0f || resourceHeight == 0.0f) {
            return;
        }
        float viewWidth = this.width.orElseIfUnspecified(resourceWidth).resolveWidth(measure);
        float viewHeight = this.height.orElseIfUnspecified(resourceHeight).resolveHeight(measure);
        output.translate(this.x.resolveWidth(measure), this.y.resolveHeight(measure));
        if (this.overflow.establishesClip()) {
            output.applyClip(new ViewBox(viewWidth, viewHeight));
        }
        AffineTransform imgTransform = this.preserveAspectRatio.computeViewPortTransform(new FloatSize(viewWidth, viewHeight), new ViewBox(resourceWidth, resourceHeight));
        resource.render(output, context, imgTransform);
    }
}
