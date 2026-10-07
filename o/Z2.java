package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 extends AbstractC1921js0 implements Animatable {
    public static final /* synthetic */ int r = 0;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0962a1 f649o = null;
    public ArrayList p = null;
    public final W2 q = new W2(this);
    public final X2 m = new X2();

    public Z2(Context context) {
        this.n = context;
    }

    @Override // o.AbstractC1921js0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC2205mo.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return AbstractC2205mo.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        X2 x2 = this.m;
        x2.a.draw(canvas);
        if (x2.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getAlpha() : this.m.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.m.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.l;
        return drawable != null ? AbstractC2205mo.c(drawable) : this.m.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.l == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new Y2(0, this.l.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getIntrinsicHeight() : this.m.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getIntrinsicWidth() : this.m.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getOpacity() : this.m.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        X2 x2;
        Animator animatorI;
        C2795ss0 c2795ss0;
        int next;
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC2205mo.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            x2 = this.m;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser animation = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayG = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.e);
                    int resourceId = typedArrayG.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C2795ss0.u;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c2795ss0 = new C2795ss0();
                            ThreadLocal threadLocal = AbstractC1465f80.a;
                            c2795ss0.l = AbstractC0977a80.a(resources, resourceId, theme);
                            new C2698rs0(c2795ss0.l.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c2795ss0 = new C2795ss0();
                                c2795ss0.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException | XmlPullParserException unused) {
                                c2795ss0 = null;
                            }
                        }
                        c2795ss0.q = false;
                        c2795ss0.setCallback(this.q);
                        C2795ss0 c2795ss1 = x2.a;
                        if (c2795ss1 != null) {
                            c2795ss1.setCallback(null);
                        }
                        x2.a = c2795ss0;
                    }
                    typedArrayG.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1370eA.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.n;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorI = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                        animatorI = Nr0.i(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (XmlPullParserException e) {
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    }
                                } catch (IOException e2) {
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e2);
                                    throw notFoundException2;
                                }
                            } catch (Throwable th) {
                                if (animation != null) {
                                    animation.close();
                                }
                                throw th;
                            }
                        }
                        animatorI.setTarget(x2.a.m.b.f982o.get(string));
                        if (x2.c == null) {
                            x2.c = new ArrayList();
                            x2.d = new S5(0);
                        }
                        x2.c.add(animatorI);
                        x2.d.put(animatorI, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (x2.b == null) {
            x2.b = new AnimatorSet();
        }
        x2.b.playTogether(x2.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.isAutoMirrored() : this.m.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.l;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.m.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.isStateful() : this.m.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.m.a.setBounds(rect);
        }
    }

    @Override // o.AbstractC1921js0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.l;
        return drawable != null ? drawable.setLevel(i) : this.m.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.l;
        return drawable != null ? drawable.setState(iArr) : this.m.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.m.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.m.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.m.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC3045vW.M(drawable, i);
        } else {
            this.m.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC3045vW.N(drawable, colorStateList);
        } else {
            this.m.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC3045vW.O(drawable, mode);
        } else {
            this.m.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.m.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.l;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        X2 x2 = this.m;
        if (x2.b.isStarted()) {
            return;
        }
        x2.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.l;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.m.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
