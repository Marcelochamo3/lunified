package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class J7 extends Drawable implements Hi0 {
    public final WeakReference l;
    public final C2068lO m;
    public final Ii0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f336o;
    public final L7 p;
    public float q;
    public float r;
    public final int s;
    public float t;
    public float u;
    public float v;
    public WeakReference w;
    public WeakReference x;

    public J7(Context context, K7 k7) {
        Fi0 fi0;
        WeakReference weakReference = new WeakReference(context);
        this.l = weakReference;
        AbstractC1923jt0.h(context, AbstractC1923jt0.d, "Theme.MaterialComponents");
        this.f336o = new Rect();
        Ii0 ii0 = new Ii0(this);
        this.n = ii0;
        TextPaint textPaint = ii0.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        L7 l7 = new L7(context, k7);
        this.p = l7;
        boolean zE = e();
        K7 k8 = l7.b;
        C2068lO c2068lO = new C2068lO(C1891jd0.a(context, zE ? k8.r.intValue() : k8.p.intValue(), e() ? k8.s.intValue() : k8.q.intValue(), new C2421p(0)).a());
        this.m = c2068lO;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && ii0.g != (fi0 = new Fi0(context2, k8.f356o.intValue()))) {
            ii0.b(fi0, context2);
            textPaint.setColor(k8.n.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = k8.w;
        if (i != -2) {
            this.s = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.s = k8.x;
        }
        ii0.e = true;
        i();
        invalidateSelf();
        ii0.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(k8.m.intValue());
        if (c2068lO.l.c != colorStateListValueOf) {
            c2068lO.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(k8.n.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.w;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.w.get();
            WeakReference weakReference3 = this.x;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(k8.E.booleanValue(), false);
    }

    @Override // o.Hi0
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int i = this.s;
        L7 l7 = this.p;
        K7 k7 = l7.b;
        String str = k7.u;
        boolean z = str != null;
        WeakReference weakReference = this.l;
        if (!z) {
            if (!f()) {
                return null;
            }
            K7 k8 = l7.b;
            if (i == -2 || d() <= i) {
                return NumberFormat.getInstance(k8.y).format(d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(k8.y, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = k7.w;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.x;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.p.b.v;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.m.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        Ii0 ii0 = this.n;
        ii0.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.r - rect.exactCenterY();
        canvas.drawText(strB, this.q, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), ii0.a);
    }

    public final boolean e() {
        return this.p.b.u != null || f();
    }

    public final boolean f() {
        K7 k7 = this.p.b;
        return k7.u == null && k7.v != -1;
    }

    public final void g() {
        Context context = (Context) this.l.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        L7 l7 = this.p;
        this.m.setShapeAppearanceModel(C1891jd0.a(context, zE ? l7.b.r.intValue() : l7.b.p.intValue(), e() ? l7.b.s.intValue() : l7.b.q.intValue(), new C2421p(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p.b.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f336o.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f336o.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.w = new WeakReference(view);
        this.x = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    public final void i() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        float f2;
        WeakReference weakReference = this.l;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.w;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f336o;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.x;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zE = e();
        L7 l7 = this.p;
        float f3 = zE ? l7.d : l7.c;
        this.t = f3;
        if (f3 != -1.0f) {
            this.u = f3;
            this.v = f3;
        } else {
            this.u = Math.round((e() ? l7.g : l7.e) / 2.0f);
            this.v = Math.round((e() ? l7.h : l7.f) / 2.0f);
        }
        if (e()) {
            String strB = b();
            float f4 = this.u;
            Ii0 ii0 = this.n;
            if (ii0.e) {
                ii0.a(strB);
                f = ii0.c;
            } else {
                f = ii0.c;
            }
            this.u = Math.max(f4, (f / 2.0f) + l7.b.F.intValue());
            float f5 = this.v;
            if (ii0.e) {
                ii0.a(strB);
                f2 = ii0.d;
            } else {
                f2 = ii0.d;
            }
            float fMax = Math.max(f5, (f2 / 2.0f) + l7.b.G.intValue());
            this.v = fMax;
            this.u = Math.max(this.u, fMax);
        }
        int iIntValue = l7.b.I.intValue();
        boolean zE2 = e();
        K7 k7 = l7.b;
        if (zE2) {
            iIntValue = k7.K.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC1161c3.c(iIntValue, AbstractC1161c3.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - k7.N.intValue());
            }
        }
        int i = l7.k;
        if (i == 0) {
            iIntValue -= Math.round(this.v);
        }
        int iIntValue2 = k7.M.intValue() + iIntValue;
        int iIntValue3 = k7.D.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.r = rect3.bottom - iIntValue2;
        } else {
            this.r = rect3.top + iIntValue2;
        }
        int iIntValue4 = e() ? k7.J.intValue() : k7.H.intValue();
        if (i == 1) {
            iIntValue4 += e() ? l7.j : l7.i;
        }
        int iIntValue5 = k7.L.intValue() + iIntValue4;
        int iIntValue6 = k7.D.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = It0.a;
            this.q = view.getLayoutDirection() == 0 ? (rect3.left - this.u) + iIntValue5 : (rect3.right + this.u) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = It0.a;
            this.q = view.getLayoutDirection() == 0 ? (rect3.right + this.u) - iIntValue5 : (rect3.left - this.u) + iIntValue5;
        }
        if (k7.O.booleanValue()) {
            View viewC = c();
            if (viewC != null) {
                FrameLayout frameLayoutC = c();
                if (frameLayoutC == null || frameLayoutC.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewC.getParent() instanceof View) {
                    y = viewC.getY();
                    x = viewC.getX();
                    viewC = (View) viewC.getParent();
                }
                y2 = viewC.getY() + (this.r - this.v) + y;
                x2 = viewC.getX() + (this.q - this.u) + x;
                if (viewC.getParent() instanceof View) {
                    height = ((this.r + this.v) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.q + this.u) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.r = Math.abs(y2) + this.r;
                }
                if (x2 < 0.0f) {
                    this.q = Math.abs(x2) + this.q;
                }
                if (height > 0.0f) {
                    this.r -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.q -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewC = view2;
                y2 = viewC.getY() + (this.r - this.v) + y;
                x2 = viewC.getX() + (this.q - this.u) + x;
                if (viewC.getParent() instanceof View) {
                    height = ((this.r + this.v) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.q + this.u) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.r = Math.abs(y2) + this.r;
                }
                if (x2 < 0.0f) {
                    this.q = Math.abs(x2) + this.q;
                }
                if (height > 0.0f) {
                    this.r -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.q -= Math.abs(width);
                }
            }
        }
        float f6 = this.q;
        float f7 = this.r;
        float f8 = this.u;
        float f9 = this.v;
        rect2.set((int) (f6 - f8), (int) (f7 - f9), (int) (f6 + f8), (int) (f7 + f9));
        float f10 = this.t;
        C2068lO c2068lO = this.m;
        if (f10 != -1.0f) {
            C1795id0 c1795id0E = c2068lO.l.a.e();
            c1795id0E.e = new C2421p(f10);
            c1795id0E.f = new C2421p(f10);
            c1795id0E.g = new C2421p(f10);
            c1795id0E.h = new C2421p(f10);
            c2068lO.setShapeAppearanceModel(c1795id0E.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c2068lO.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, o.Hi0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        L7 l7 = this.p;
        l7.a.t = i;
        l7.b.t = i;
        this.n.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
