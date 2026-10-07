package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: o.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2667rd extends C2068lO implements Drawable.Callback, Hi0 {
    public static final int[] R0 = {R.attr.state_enabled};
    public static final ShapeDrawable S0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E0;
    public ColorFilter F0;
    public PorterDuffColorFilter G0;
    public ColorStateList H0;
    public ColorStateList I;
    public PorterDuff.Mode I0;
    public ColorStateList J;
    public int[] J0;
    public float K;
    public boolean K0;
    public float L;
    public ColorStateList L0;
    public ColorStateList M;
    public WeakReference M0;
    public float N;
    public TextUtils.TruncateAt N0;
    public ColorStateList O;
    public boolean O0;
    public CharSequence P;
    public int P0;
    public boolean Q;
    public boolean Q0;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public RippleDrawable X;
    public ColorStateList Y;
    public float Z;
    public SpannableStringBuilder a0;
    public boolean b0;
    public boolean c0;
    public Drawable d0;
    public ColorStateList e0;
    public C1192cR f0;
    public C1192cR g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public final Context p0;
    public final Paint q0;
    public final Paint.FontMetrics r0;
    public final RectF s0;
    public final PointF t0;
    public final Path u0;
    public final Ii0 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public C2667rd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = -1.0f;
        this.q0 = new Paint(1);
        this.r0 = new Paint.FontMetrics();
        this.s0 = new RectF();
        this.t0 = new PointF();
        this.u0 = new Path();
        this.E0 = 255;
        this.I0 = PorterDuff.Mode.SRC_IN;
        this.M0 = new WeakReference(null);
        j(context);
        this.p0 = context;
        Ii0 ii0 = new Ii0(this);
        this.v0 = ii0;
        this.P = "";
        ii0.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = R0;
        setState(iArr);
        if (!Arrays.equals(this.J0, iArr)) {
            this.J0 = iArr;
            if (U()) {
                x(getState(), iArr);
            }
        }
        this.O0 = true;
        S0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            if (this.c0 && (drawable = this.d0) != null && this.b0) {
                AbstractC2205mo.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z) {
        if (this.c0 != z) {
            boolean zS = S();
            this.c0 = z;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    p(this.d0);
                } else {
                    V(this.d0);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void C(float f) {
        if (this.L != f) {
            this.L = f;
            C1795id0 c1795id0E = this.l.a.e();
            c1795id0E.e = new C2421p(f);
            c1795id0E.f = new C2421p(f);
            c1795id0E.g = new C2421p(f);
            c1795id0E.h = new C2421p(f);
            setShapeAppearanceModel(c1795id0E.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void D(Drawable drawable) {
        ?? r0;
        Object obj = this.R;
        if (obj == null) {
            r0 = 0;
        } else if (obj instanceof Tw0) {
            r0 = obj;
            r0 = ((Uw0) ((Tw0) obj)).q;
        }
        if (r0 != drawable) {
            float fR = r();
            this.R = drawable != null ? AbstractC3045vW.R(drawable).mutate() : null;
            float fR2 = r();
            V(r0);
            if (T()) {
                p(this.R);
            }
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void E(float f) {
        if (this.T != f) {
            float fR = r();
            this.T = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        this.U = true;
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (T()) {
                AbstractC2205mo.h(this.R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.Q != z) {
            boolean zT = T();
            this.Q = z;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    p(this.R);
                } else {
                    V(this.R);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (this.Q0) {
                C1970kO c1970kO = this.l;
                if (c1970kO.d != colorStateList) {
                    c1970kO.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void I(float f) {
        if (this.N != f) {
            this.N = f;
            this.q0.setStrokeWidth(f);
            if (this.Q0) {
                this.l.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void J(Drawable drawable) {
        ?? r0;
        Object obj = this.W;
        if (obj == null) {
            r0 = 0;
        } else if (obj instanceof Tw0) {
            r0 = obj;
            r0 = ((Uw0) ((Tw0) obj)).q;
        }
        if (r0 != drawable) {
            float fS = s();
            this.W = drawable != null ? AbstractC3045vW.R(drawable).mutate() : null;
            this.X = new RippleDrawable(AbstractC1376eG.D(this.O), this.W, S0);
            float fS2 = s();
            V(r0);
            if (U()) {
                p(this.W);
            }
            invalidateSelf();
            if (fS != fS2) {
                w();
            }
        }
    }

    public final void K(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void L(float f) {
        if (this.Z != f) {
            this.Z = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void M(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (U()) {
                AbstractC2205mo.h(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.V != z) {
            boolean zU = U();
            this.V = z;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    p(this.W);
                } else {
                    V(this.W);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void P(float f) {
        if (this.j0 != f) {
            float fR = r();
            this.j0 = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void Q(float f) {
        if (this.i0 != f) {
            float fR = r();
            this.i0 = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            this.L0 = this.K0 ? AbstractC1376eG.D(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean S() {
        return this.c0 && this.d0 != null && this.C0;
    }

    public final boolean T() {
        return this.Q && this.R != null;
    }

    public final boolean U() {
        return this.V && this.W != null;
    }

    @Override // o.Hi0
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        float f;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.E0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.Q0;
        Paint paint = this.q0;
        RectF rectF3 = this.s0;
        if (!z) {
            paint.setColor(this.w0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (!this.Q0) {
            paint.setColor(this.x0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.F0;
            if (colorFilter == null) {
                colorFilter = this.G0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (this.Q0) {
            super.draw(canvas);
        }
        if (this.N > 0.0f && !this.Q0) {
            paint.setColor(this.z0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.Q0) {
                ColorFilter colorFilter2 = this.F0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.G0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.N / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.L - (this.N / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.A0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.Q0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.u0;
            C1970kO c1970kO = this.l;
            this.C.b(c1970kO.a, c1970kO.j, rectF4, this.B, path);
            f(canvas, paint, path, this.l.a, h());
        } else {
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (T()) {
            q(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.R.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.R.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (S()) {
            q(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.d0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.d0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.O0 || this.P == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 255;
            i4 = 0;
        } else {
            PointF pointF = this.t0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.P;
            Ii0 ii0 = this.v0;
            if (charSequence != null) {
                float fR = r() + this.h0 + this.k0;
                if (AbstractC3045vW.p(this) == 0) {
                    pointF.x = bounds.left + fR;
                } else {
                    pointF.x = bounds.right - fR;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = ii0.a;
                Paint.FontMetrics fontMetrics = this.r0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.P != null) {
                float fR2 = r() + this.h0 + this.k0;
                float fS = s() + this.o0 + this.l0;
                if (AbstractC3045vW.p(this) == 0) {
                    rectF3.left = bounds.left + fR2;
                    rectF3.right = bounds.right - fS;
                } else {
                    rectF3.left = bounds.left + fS;
                    rectF3.right = bounds.right - fR2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            Fi0 fi0 = ii0.g;
            TextPaint textPaint2 = ii0.a;
            if (fi0 != null) {
                textPaint2.drawableState = getState();
                ii0.g.e(this.p0, textPaint2, ii0.b);
            }
            textPaint2.setTextAlign(align);
            String string = this.P.toString();
            if (ii0.e) {
                ii0.a(string);
                f = ii0.c;
            } else {
                f = ii0.c;
            }
            boolean z2 = Math.round(f) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.P;
            if (z2 && this.N0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.N0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i4 = 0;
            i3 = 255;
            canvas.drawText(charSequence2, 0, length, f9, f10, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f11 = this.o0 + this.n0;
                if (AbstractC3045vW.p(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.Z;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.Z;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f14 = this.Z;
                float f15 = fExactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.W.setBounds(i4, i4, (int) rectF2.width(), (int) rectF2.height());
            this.X.setBounds(this.W.getBounds());
            this.X.jumpToCurrentState();
            this.X.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.E0 < i3) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        float fR = r() + this.h0 + this.k0;
        String string = this.P.toString();
        Ii0 ii0 = this.v0;
        if (ii0.e) {
            ii0.a(string);
            f = ii0.c;
        } else {
            f = ii0.c;
        }
        return Math.min(Math.round(s() + f + fR + this.l0 + this.o0), this.P0);
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.Q0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K, this.L);
        } else {
            outline.setRoundRect(bounds, this.L);
        }
        outline.setAlpha(this.E0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Fi0 fi0;
        ColorStateList colorStateList;
        return u(this.I) || u(this.J) || u(this.M) || (this.K0 && u(this.L0)) || (!((fi0 = this.v0.g) == null || (colorStateList = fi0.j) == null || !colorStateList.isStateful()) || ((this.c0 && this.d0 != null && this.b0) || v(this.R) || v(this.d0) || u(this.H0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (T()) {
            zOnLayoutDirectionChanged |= AbstractC3045vW.J(this.R, i);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= AbstractC3045vW.J(this.d0, i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= AbstractC3045vW.J(this.W, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (T()) {
            zOnLevelChange |= this.R.setLevel(i);
        }
        if (S()) {
            zOnLevelChange |= this.d0.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.Q0) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.J0);
    }

    public final void p(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC3045vW.J(drawable, AbstractC3045vW.p(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.W) {
            if (drawable.isStateful()) {
                drawable.setState(this.J0);
            }
            AbstractC2205mo.h(drawable, this.Y);
            return;
        }
        Drawable drawable2 = this.R;
        if (drawable == drawable2 && this.U) {
            AbstractC2205mo.h(drawable2, this.S);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f = this.h0 + this.i0;
            Drawable drawable = this.C0 ? this.d0 : this.R;
            float intrinsicWidth = this.T;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC3045vW.p(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.C0 ? this.d0 : this.R;
            float fCeil = this.T;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.p0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float r() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f = this.i0;
        Drawable drawable = this.C0 ? this.d0 : this.R;
        float intrinsicWidth = this.T;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.j0;
    }

    public final float s() {
        if (U()) {
            return this.m0 + this.Z + this.n0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            invalidateSelf();
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F0 != colorFilter) {
            this.F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.I0 != mode) {
            this.I0 = mode;
            ColorStateList colorStateList = this.H0;
            this.G0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (T()) {
            visible |= this.R.setVisible(z, z2);
        }
        if (S()) {
            visible |= this.d0.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.Q0 ? this.l.a.e.a(h()) : this.L;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        InterfaceC2571qd interfaceC2571qd = (InterfaceC2571qd) this.M0.get();
        if (interfaceC2571qd != null) {
            Chip chip = (Chip) interfaceC2571qd;
            chip.b(chip.A);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean x(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.I;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.w0) : 0);
        boolean state = true;
        if (this.w0 != iD) {
            this.w0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.J;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.x0) : 0);
        if (this.x0 != iD2) {
            this.x0 = iD2;
            zOnStateChange = true;
        }
        int iD3 = AbstractC1894jf.d(iD2, iD);
        if ((this.y0 != iD3) | (this.l.c == null)) {
            this.y0 = iD3;
            l(ColorStateList.valueOf(iD3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.M;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.z0) : 0;
        if (this.z0 != colorForState) {
            this.z0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.L0 == null || !AbstractC1376eG.E(iArr)) ? 0 : this.L0.getColorForState(iArr, this.A0);
        if (this.A0 != colorForState2) {
            this.A0 = colorForState2;
            if (this.K0) {
                zOnStateChange = true;
            }
        }
        Fi0 fi0 = this.v0.g;
        int colorForState3 = (fi0 == null || (colorStateList = fi0.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState3) {
            this.B0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.b0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.C0 == z || this.d0 == null) {
            z2 = false;
        } else {
            float fR = r();
            this.C0 = z;
            if (fR != r()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.H0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.D0) : 0;
        if (this.D0 != colorForState4) {
            this.D0 = colorForState4;
            ColorStateList colorStateList6 = this.H0;
            PorterDuff.Mode mode = this.I0;
            this.G0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (v(this.R)) {
            state |= this.R.setState(iArr);
        }
        if (v(this.d0)) {
            state |= this.d0.setState(iArr);
        }
        if (v(this.W)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.W.setState(iArr3);
        }
        if (v(this.X)) {
            state |= this.X.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            w();
        }
        return state;
    }

    public final void y(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            float fR = r();
            if (!z && this.C0) {
                this.C0 = false;
            }
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void z(Drawable drawable) {
        if (this.d0 != drawable) {
            float fR = r();
            this.d0 = drawable;
            float fR2 = r();
            V(this.d0);
            p(this.d0);
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }
}
