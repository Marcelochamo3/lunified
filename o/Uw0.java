package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Uw0 extends Drawable implements Drawable.Callback, Tw0, Pj0 {
    public static final PorterDuff.Mode r = PorterDuff.Mode.SRC_IN;
    public static Method s;
    public int l;
    public PorterDuff.Mode m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Vw0 f562o;
    public boolean p;
    public Drawable q;

    public final Vw0 a() {
        Vw0 vw0 = this.f562o;
        Vw0 vw1 = new Vw0();
        vw1.c = null;
        vw1.d = r;
        if (vw0 != null) {
            vw1.a = vw0.a;
            vw1.b = vw0.b;
            vw1.c = vw0.c;
            vw1.d = vw0.d;
        }
        return vw1;
    }

    public final boolean b(int[] iArr) {
        return d(iArr) || this.q.setState(iArr);
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            Vw0 vw0 = this.f562o;
            if (vw0 != null) {
                vw0.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean d(int[] iArr) {
        if (!(!(this instanceof Uw0))) {
            return false;
        }
        Vw0 vw0 = this.f562o;
        ColorStateList colorStateList = vw0.c;
        PorterDuff.Mode mode = vw0.d;
        if (colorStateList == null || mode == null) {
            this.n = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.n || colorForState != this.l || mode != this.m) {
                setColorFilter(colorForState, mode);
                this.l = colorForState;
                this.m = mode;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.q.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        Vw0 vw0 = this.f562o;
        return changingConfigurations | (vw0 != null ? vw0.getChangingConfigurations() : 0) | this.q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Vw0 vw0 = this.f562o;
        if (vw0 == null || vw0.b == null) {
            return null;
        }
        vw0.a = getChangingConfigurations();
        return this.f562o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.q.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.q.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.q.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.q.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC3045vW.p(this.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.q.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.q.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.q.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.q.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.q.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.q.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.q.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.q.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.q;
        if (drawable == null || (method = s) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Vw0 vw0;
        ColorStateList colorStateList = (!((this instanceof Uw0) ^ true) || (vw0 = this.f562o) == null) ? null : vw0.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.q.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.q.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.p && super.mutate() == this) {
            this.f562o = a();
            Drawable drawable = this.q;
            if (drawable != null) {
                drawable.mutate();
            }
            Vw0 vw0 = this.f562o;
            if (vw0 != null) {
                Drawable drawable2 = this.q;
                vw0.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.p = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return AbstractC3045vW.J(this.q, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.q.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.q.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.q.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.q.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.q.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.q.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.q.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!b(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.q.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.q.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.q.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.q.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
