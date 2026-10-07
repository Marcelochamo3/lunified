package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: renamed from: o.oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2399oo extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int x = 0;
    public S2 l;
    public Rect m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f952o;
    public int p;
    public boolean q;
    public int r;
    public boolean s;
    public RunnableC3102w1 t;
    public long u;
    public long v;
    public W2 w;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.q = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            long j2 = this.u;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.p);
                    this.u = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.l.y)) * this.p) / 255);
                    z2 = true;
                }
            }
            drawable = this.f952o;
            if (drawable != null) {
                j = this.v;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f952o = null;
                        this.v = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.l.z) * this.p) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.t, jUptimeMillis + 16);
                return;
            }
            this.v = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.u = 0L;
        z2 = false;
        drawable = this.f952o;
        if (drawable != null) {
            j = this.v;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f952o = null;
                    this.v = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.l.z) * this.p) / 255);
                }
            }
            if (z) {
            }
        }
        this.v = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        S2 s2 = this.l;
        if (theme == null) {
            s2.getClass();
            return;
        }
        s2.c();
        int i = s2.h;
        Drawable[] drawableArr = s2.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && AbstractC2205mo.b(drawable)) {
                AbstractC2205mo.a(drawableArr[i2], theme);
                s2.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            s2.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = s2.c;
            s2.c = i3;
            if (i4 != i3) {
                s2.m = false;
                s2.j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.w == null) {
            this.w = new W2();
        }
        W2 w2 = this.w;
        w2.m = drawable.getCallback();
        drawable.setCallback(w2);
        try {
            if (this.l.y <= 0 && this.q) {
                drawable.setAlpha(this.p);
            }
            S2 s2 = this.l;
            if (s2.C) {
                drawable.setColorFilter(s2.B);
            } else {
                if (s2.F) {
                    AbstractC2205mo.h(drawable, s2.D);
                }
                S2 s3 = this.l;
                if (s3.G) {
                    AbstractC2205mo.i(drawable, s3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.l.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC3045vW.J(drawable, AbstractC3045vW.p(this));
            }
            drawable.setAutoMirrored(this.l.A);
            Rect rect = this.m;
            if (rect != null) {
                AbstractC2205mo.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            W2 w3 = this.w;
            Drawable.Callback callback = (Drawable.Callback) w3.m;
            w3.m = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean c(int i) {
        if (i == this.r) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.l.z > 0) {
            Drawable drawable = this.f952o;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                this.f952o = drawable2;
                this.v = ((long) this.l.z) + jUptimeMillis;
            } else {
                this.f952o = null;
                this.v = 0L;
            }
        } else {
            Drawable drawable3 = this.n;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            S2 s2 = this.l;
            if (i < s2.h) {
                Drawable drawableD = s2.d(i);
                this.n = drawableD;
                this.r = i;
                if (drawableD != null) {
                    int i2 = this.l.y;
                    if (i2 > 0) {
                        this.u = jUptimeMillis + ((long) i2);
                    }
                    b(drawableD);
                }
            } else {
                this.n = null;
                this.r = -1;
            }
        } else {
            this.n = null;
            this.r = -1;
        }
        if (this.u != 0 || this.v != 0) {
            RunnableC3102w1 runnableC3102w1 = this.t;
            if (runnableC3102w1 == null) {
                this.t = new RunnableC3102w1(6, (V2) this);
            } else {
                unscheduleSelf(runnableC3102w1);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.l.canApplyTheme();
    }

    public abstract void d(S2 s2);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f952o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        S2 s2 = this.l;
        if (!s2.u) {
            s2.c();
            s2.u = true;
            int i = s2.h;
            Drawable[] drawableArr = s2.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    s2.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    s2.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = s2.v;
        }
        if (!z) {
            return null;
        }
        this.l.d = getChangingConfigurations();
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.m;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        S2 s2 = this.l;
        if (s2.l) {
            if (!s2.m) {
                s2.b();
            }
            return s2.f502o;
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        S2 s2 = this.l;
        if (s2.l) {
            if (!s2.m) {
                s2.b();
            }
            return s2.n;
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        S2 s2 = this.l;
        if (s2.l) {
            if (!s2.m) {
                s2.b();
            }
            return s2.q;
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        S2 s2 = this.l;
        if (s2.l) {
            if (!s2.m) {
                s2.b();
            }
            return s2.p;
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        S2 s2 = this.l;
        if (s2.r) {
            return s2.s;
        }
        s2.c();
        int i = s2.h;
        Drawable[] drawableArr = s2.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        s2.s = opacity;
        s2.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        S2 s2 = this.l;
        boolean padding = false;
        Rect rect2 = null;
        if (!s2.i) {
            Rect rect3 = s2.k;
            if (rect3 != null || s2.j) {
                rect2 = rect3;
            } else {
                s2.c();
                Rect rect4 = new Rect();
                int i = s2.h;
                Drawable[] drawableArr = s2.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                s2.j = true;
                s2.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.n;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.l.A && AbstractC3045vW.p(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        S2 s2 = this.l;
        if (s2 != null) {
            s2.r = false;
            s2.t = false;
        }
        if (drawable != this.n || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.l.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f952o;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f952o = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.q) {
                this.n.setAlpha(this.p);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z = true;
        }
        if (this.u != 0) {
            this.u = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            V2 v2 = (V2) this;
            S2 s2 = new S2(v2.A, v2, null);
            s2.I = s2.I.clone();
            s2.J = s2.J.clone();
            d(s2);
            this.s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f952o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        S2 s2 = this.l;
        int i2 = this.r;
        int i3 = s2.h;
        Drawable[] drawableArr = s2.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zJ = Build.VERSION.SDK_INT >= 23 ? AbstractC3045vW.J(drawable, i) : false;
                if (i4 == i2) {
                    z = zJ;
                }
            }
        }
        s2.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f952o;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.n || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.q && this.p == i) {
            return;
        }
        this.q = true;
        this.p = i;
        Drawable drawable = this.n;
        if (drawable != null) {
            if (this.u == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        S2 s2 = this.l;
        if (s2.A != z) {
            s2.A = z;
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        S2 s2 = this.l;
        s2.C = true;
        if (s2.B != colorFilter) {
            s2.B = colorFilter;
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        S2 s2 = this.l;
        if (s2.w != z) {
            s2.w = z;
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.n;
        if (drawable != null) {
            AbstractC2205mo.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.m;
        if (rect == null) {
            this.m = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            AbstractC2205mo.f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        S2 s2 = this.l;
        s2.F = true;
        if (s2.D != colorStateList) {
            s2.D = colorStateList;
            AbstractC3045vW.N(this.n, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        S2 s2 = this.l;
        s2.G = true;
        if (s2.E != mode) {
            s2.E = mode;
            AbstractC3045vW.O(this.n, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f952o;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.n || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
