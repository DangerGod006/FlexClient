package com.github.weisj.jsvg.util;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/BlittableImage.class */
public final class BlittableImage {

    @NotNull
    private final BufferedImage image;

    @NotNull
    private final RenderContext context;

    @NotNull
    private final Rectangle2D boundsInUserSpace;

    @NotNull
    private final UnitType contentUnits;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/BlittableImage$BufferSurfaceSupplier.class */
    @FunctionalInterface
    public interface BufferSurfaceSupplier {
        @NotNull
        BufferedImage createBufferSurface(@Nullable AffineTransform affineTransform, double d, double d2);
    }

    private BlittableImage(@NotNull BufferedImage image, @NotNull RenderContext context, @NotNull Rectangle2D boundsInUserSpace, @NotNull UnitType contentUnits) {
        this.image = image;
        this.context = context;
        this.boundsInUserSpace = boundsInUserSpace;
        this.contentUnits = contentUnits;
    }

    @NotNull
    public static BlittableImage create(@NotNull BufferSurfaceSupplier bufferSurfaceSupplier, @NotNull RenderContext context, @Nullable Rectangle2D clipBounds, @NotNull Rectangle2D bounds, @NotNull Rectangle2D objectBounds, @NotNull UnitType contentUnits) {
        Rectangle2D boundsInUserSpace = GeometryUtil.containingBoundsAfterTransform(context.userSpaceTransform(), bounds);
        Rectangle2D boundsInRootSpace = GeometryUtil.containingBoundsAfterTransform(context.rootTransform(), boundsInUserSpace);
        if (clipBounds != null) {
            Rectangle2D clipBoundsInUserSpace = GeometryUtil.containingBoundsAfterTransform(context.userSpaceTransform(), clipBounds);
            Rectangle2D clipBoundsInRootSpace = GeometryUtil.containingBoundsAfterTransform(context.rootTransform(), clipBoundsInUserSpace);
            Rectangle2D.intersect(clipBoundsInRootSpace, boundsInRootSpace, boundsInRootSpace);
        }
        int imgX = (int) Math.floor(boundsInRootSpace.getX());
        int imgY = (int) Math.floor(boundsInRootSpace.getY());
        int imgWidth = ((int) Math.ceil(boundsInRootSpace.getX() + boundsInRootSpace.getWidth())) - imgX;
        int imgHeight = ((int) Math.ceil(boundsInRootSpace.getY() + boundsInRootSpace.getHeight())) - imgY;
        try {
            Rectangle2D adjustedUserSpaceBounds = GeometryUtil.containingBoundsAfterTransform(context.rootTransform().createInverse(), new Rectangle2D.Double(imgX, imgY, imgWidth, imgHeight));
            BufferedImage img = bufferSurfaceSupplier.createBufferSurface(null, imgWidth, imgHeight);
            RenderContext imageContext = RenderContext.createInitial(context.platformSupport(), contentUnits.deriveMeasure(context.measureContext()));
            AffineTransform rootTransform = new AffineTransform();
            rootTransform.translate(boundsInRootSpace.getX() - ((double) imgX), boundsInRootSpace.getY() - ((double) imgY));
            if (contentUnits == UnitType.ObjectBoundingBox) {
                rootTransform.scale((objectBounds.getWidth() * ((double) img.getWidth())) / adjustedUserSpaceBounds.getWidth(), (objectBounds.getWidth() * ((double) img.getHeight())) / adjustedUserSpaceBounds.getHeight());
            } else {
                rootTransform.scale(((double) img.getWidth()) / adjustedUserSpaceBounds.getWidth(), ((double) img.getHeight()) / adjustedUserSpaceBounds.getHeight());
                rootTransform.translate(-adjustedUserSpaceBounds.getX(), -adjustedUserSpaceBounds.getY());
            }
            imageContext.setRootTransform(rootTransform, context.userSpaceTransform());
            return new BlittableImage(img, imageContext, adjustedUserSpaceBounds, contentUnits);
        } catch (NoninvertibleTransformException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    @NotNull
    public Rectangle2D boundsInUserSpace() {
        return this.boundsInUserSpace;
    }

    @NotNull
    public BufferedImage image() {
        return this.image;
    }

    @NotNull
    public Graphics2D createGraphics() {
        Graphics2D g = GraphicsUtil.createGraphics(this.image);
        g.transform(this.context.rootTransform());
        if (this.contentUnits == UnitType.UserSpaceOnUse) {
            g.transform(this.context.userSpaceTransform());
        } else {
            this.context.setRootTransform(this.context.rootTransform(), new AffineTransform());
        }
        return g;
    }

    public void renderNode(@NotNull Output parentOutput, @NotNull SVGNode node, @NotNull Instantiator instantiator) {
        Graphics2D imgGraphics = createGraphics();
        Output imgOutput = new Graphics2DOutput(imgGraphics);
        imgGraphics.setRenderingHints(parentOutput.renderingHints());
        NodeRenderer.Info info = NodeRenderer.createRenderInfo(node, this.context, imgOutput, instantiator);
        if (info != null) {
            try {
                info.renderable.render(info.context, info.output());
            } catch (Throwable th) {
                if (info != null) {
                    try {
                        info.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (info != null) {
            info.close();
        }
        imgGraphics.dispose();
    }

    public void render(@NotNull Output output, @NotNull Consumer<Graphics2D> painter) {
        Graphics2D imgGraphics = createGraphics();
        imgGraphics.setRenderingHints(output.renderingHints());
        painter.accept(imgGraphics);
        imgGraphics.dispose();
    }

    public void prepareForBlitting(@NotNull Output output, @NotNull RenderContext parentContext) {
        output.setTransform(parentContext.rootTransform());
        output.translate(this.boundsInUserSpace.getX(), this.boundsInUserSpace.getY());
        output.scale(this.boundsInUserSpace.getWidth() / ((double) this.image.getWidth()), this.boundsInUserSpace.getHeight() / ((double) this.image.getHeight()));
    }

    public void blitTo(@NotNull Output output, @NotNull RenderContext parentContext) {
        Output out = output.createChild();
        prepareForBlitting(out, parentContext);
        out.drawImage(this.image);
        out.dispose();
    }
}
