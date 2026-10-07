package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: renamed from: o.lO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2068lO extends Drawable implements Pj0, InterfaceC2862td0 {
    public static final Paint H;
    public final C1697hd0 A;
    public final C0334By B;
    public final QP C;
    public PorterDuffColorFilter D;
    public PorterDuffColorFilter E;
    public final RectF F;
    public final boolean G;
    public C1970kO l;
    public final AbstractC2668rd0[] m;
    public final AbstractC2668rd0[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BitSet f895o;
    public boolean p;
    public final Matrix q;
    public final Path r;
    public final Path s;
    public final RectF t;
    public final RectF u;
    public final Region v;
    public final Region w;
    public C1891jd0 x;
    public final Paint y;
    public final Paint z;

    static {
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2068lO() {
        this(new C1891jd0());
    }

    public final void b(RectF rectF, Path path) {
        C1970kO c1970kO = this.l;
        this.C.b(c1970kO.a, c1970kO.j, rectF, this.B, path);
        if (this.l.i != 1.0f) {
            Matrix matrix = this.q;
            matrix.reset();
            float f = this.l.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.F, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            return (!z || (iD = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        C1970kO c1970kO = this.l;
        float f = c1970kO.n + c1970kO.f865o + c1970kO.m;
        C3467zp c3467zp = c1970kO.b;
        return c3467zp != null ? c3467zp.a(i, f) : i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        Paint paint = this.y;
        paint.setColorFilter(this.D);
        int alpha = paint.getAlpha();
        int i = this.l.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.z;
        paint2.setColorFilter(this.E);
        paint2.setStrokeWidth(this.l.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.l.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.p;
        Path path = this.r;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C1891jd0 c1891jd0 = this.l.a;
            C1795id0 c1795id0E = c1891jd0.e();
            InterfaceC0888Xh c1257d2 = c1891jd0.e;
            if (!(c1257d2 instanceof T60)) {
                c1257d2 = new C1257d2(f, c1257d2);
            }
            c1795id0E.e = c1257d2;
            InterfaceC0888Xh c1257d3 = c1891jd0.f;
            if (!(c1257d3 instanceof T60)) {
                c1257d3 = new C1257d2(f, c1257d3);
            }
            c1795id0E.f = c1257d3;
            InterfaceC0888Xh c1257d4 = c1891jd0.h;
            if (!(c1257d4 instanceof T60)) {
                c1257d4 = new C1257d2(f, c1257d4);
            }
            c1795id0E.h = c1257d4;
            InterfaceC0888Xh c1257d5 = c1891jd0.g;
            if (!(c1257d5 instanceof T60)) {
                c1257d5 = new C1257d2(f, c1257d5);
            }
            c1795id0E.g = c1257d5;
            C1891jd0 c1891jd0A = c1795id0E.a();
            this.x = c1891jd0A;
            float f2 = this.l.j;
            RectF rectF = this.u;
            rectF.set(h());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.C.b(c1891jd0A, f2, rectF, null, this.s);
            b(h(), path);
            this.p = false;
        }
        C1970kO c1970kO = this.l;
        int i3 = c1970kO.p;
        if (i3 != 1 && c1970kO.q > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!c1970kO.a.d(h()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    C1970kO c1970kO2 = this.l;
                    int iSin = (int) (Math.sin(Math.toRadians(c1970kO2.s)) * ((double) c1970kO2.r));
                    C1970kO c1970kO3 = this.l;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(c1970kO3.s)) * ((double) c1970kO3.r)));
                    if (!this.G) {
                        RectF rectF2 = this.F;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.l.q * 2) + ((int) rectF2.width()) + iWidth, (this.l.q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.l.q) - iWidth;
                        float f4 = (getBounds().top - this.l.q) - iHeight;
                        canvas2.translate(-f3, -f4);
                        e(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        e(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                C1970kO c1970kO4 = this.l;
                int iSin2 = (int) (Math.sin(Math.toRadians(c1970kO4.s)) * ((double) c1970kO4.r));
                C1970kO c1970kO5 = this.l;
                canvas.translate(iSin2, (int) (Math.cos(Math.toRadians(c1970kO5.s)) * ((double) c1970kO5.r)));
                if (!this.G) {
                    RectF rectF3 = this.F;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                e(canvas);
                canvas.restore();
            }
        }
        C1970kO c1970kO6 = this.l;
        Paint.Style style = c1970kO6.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, c1970kO6.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.f895o.cardinality();
        int i = this.l.r;
        Path path = this.r;
        C1697hd0 c1697hd0 = this.A;
        if (i != 0) {
            canvas.drawPath(path, c1697hd0.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC2668rd0 abstractC2668rd0 = this.m[i2];
            int i3 = this.l.q;
            Matrix matrix = AbstractC2668rd0.b;
            abstractC2668rd0.a(matrix, c1697hd0, i3, canvas);
            this.n[i2].a(matrix, c1697hd0, this.l.q, canvas);
        }
        if (this.G) {
            C1970kO c1970kO = this.l;
            int iSin = (int) (Math.sin(Math.toRadians(c1970kO.s)) * ((double) c1970kO.r));
            C1970kO c1970kO2 = this.l;
            int iCos = (int) (Math.cos(Math.toRadians(c1970kO2.s)) * ((double) c1970kO2.r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, H);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, C1891jd0 c1891jd0, RectF rectF) {
        if (!c1891jd0.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c1891jd0.f.a(rectF) * this.l.j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.z;
        Path path = this.s;
        C1891jd0 c1891jd0 = this.x;
        RectF rectF = this.u;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, c1891jd0, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.l.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C1970kO c1970kO = this.l;
        if (c1970kO.p == 2) {
            return;
        }
        if (c1970kO.a.d(h())) {
            outline.setRoundRect(getBounds(), this.l.a.e.a(h()) * this.l.j);
            return;
        }
        RectF rectFH = h();
        Path path = this.r;
        b(rectFH, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2980uo.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC2883to.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC2883to.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.l.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.v;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.r;
        b(rectFH, path);
        Region region2 = this.w;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.t;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.l.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.z.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.p = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.l.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.l.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.l.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.l.c) != null && colorStateList4.isStateful())));
    }

    public final void j(Context context) {
        this.l.b = new C3467zp(context);
        o();
    }

    public final void k(float f) {
        C1970kO c1970kO = this.l;
        if (c1970kO.n != f) {
            c1970kO.n = f;
            o();
        }
    }

    public final void l(ColorStateList colorStateList) {
        C1970kO c1970kO = this.l;
        if (c1970kO.c != colorStateList) {
            c1970kO.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.l.c == null || color2 == (colorForState2 = this.l.c.getColorForState(iArr, (color2 = (paint2 = this.y).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.l.d == null || color == (colorForState = this.l.d.getColorForState(iArr, (color = (paint = this.z).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.l = new C1970kO(this.l);
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter = this.D;
        PorterDuffColorFilter porterDuffColorFilter2 = this.E;
        C1970kO c1970kO = this.l;
        this.D = c(c1970kO.f, c1970kO.g, this.y, true);
        C1970kO c1970kO2 = this.l;
        this.E = c(c1970kO2.e, c1970kO2.g, this.z, false);
        C1970kO c1970kO3 = this.l;
        if (c1970kO3.t) {
            int colorForState = c1970kO3.f.getColorForState(getState(), 0);
            C1697hd0 c1697hd0 = this.A;
            c1697hd0.getClass();
            c1697hd0.d = AbstractC1894jf.f(colorForState, 68);
            c1697hd0.e = AbstractC1894jf.f(colorForState, 20);
            c1697hd0.f = AbstractC1894jf.f(colorForState, 0);
            c1697hd0.a.setColor(c1697hd0.d);
        }
        return (Objects.equals(porterDuffColorFilter, this.D) && Objects.equals(porterDuffColorFilter2, this.E)) ? false : true;
    }

    public final void o() {
        C1970kO c1970kO = this.l;
        float f = c1970kO.n + c1970kO.f865o;
        c1970kO.q = (int) Math.ceil(0.75f * f);
        this.l.r = (int) Math.ceil(f * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.p = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m(iArr) || n();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1970kO c1970kO = this.l;
        if (c1970kO.l != i) {
            c1970kO.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.l.getClass();
        super.invalidateSelf();
    }

    @Override // o.InterfaceC2862td0
    public final void setShapeAppearanceModel(C1891jd0 c1891jd0) {
        this.l.a = c1891jd0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.l.f = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1970kO c1970kO = this.l;
        if (c1970kO.g != mode) {
            c1970kO.g = mode;
            n();
            super.invalidateSelf();
        }
    }

    public C2068lO(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1891jd0.b(context, attributeSet, i, i2).a());
    }

    public C2068lO(C1891jd0 c1891jd0) {
        this(new C1970kO(c1891jd0));
    }

    public C2068lO(C1970kO c1970kO) {
        QP qp;
        this.m = new AbstractC2668rd0[4];
        this.n = new AbstractC2668rd0[4];
        this.f895o = new BitSet(8);
        this.q = new Matrix();
        this.r = new Path();
        this.s = new Path();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new Region();
        this.w = new Region();
        Paint paint = new Paint(1);
        this.y = paint;
        Paint paint2 = new Paint(1);
        this.z = paint2;
        this.A = new C1697hd0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qp = AbstractC1989kd0.a;
        } else {
            qp = new QP();
        }
        this.C = qp;
        this.F = new RectF();
        this.G = true;
        this.l = c1970kO;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        m(getState());
        this.B = new C0334By(12, this);
    }
}
