package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.skidush.clonex.R;
import java.util.List;
import o.AbstractC1674hK;
import o.AbstractC2837tI;
import o.AbstractC3015v6;
import o.C0571Lb;
import o.C0596Mb;
import o.C0622Nb;
import o.C0648Ob;
import o.C1266d60;
import o.C1755i60;
import o.C2207mp;
import o.C3285xv;
import o.H40;
import o.InterfaceC1657h60;
import o.X50;
import o.Y50;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends X50 implements InterfaceC1657h60 {
    public final C2207mp p;
    public AbstractC3015v6 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        C2207mp c2207mp = new C2207mp();
        new C0596Mb();
        this.r = new View.OnLayoutChangeListener() { // from class: o.Kb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.l;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new Jj0(4, carouselLayoutManager));
            }
        };
        this.p = c2207mp;
        E0();
        a1(0);
    }

    public static C0622Nb X0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC2837tI) list.get(i5)).getClass();
            float fAbs = Math.abs(0.0f - f);
            if (0.0f <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (0.0f > f && fAbs <= f3) {
                i3 = i5;
                f3 = fAbs;
            }
            if (0.0f <= f4) {
                i2 = i5;
                f4 = 0.0f;
            }
            if (0.0f > f5) {
                i4 = i5;
                f5 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C0622Nb((AbstractC2837tI) list.get(i), (AbstractC2837tI) list.get(i3));
    }

    @Override // o.X50
    public final void B(View view, Rect rect) {
        super.B(view, rect);
        rect.centerY();
        if (Y0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // o.X50
    public final boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // o.X50
    public final int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (!Y0() || x() == 0 || i == 0) {
            return 0;
        }
        c1266d60.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // o.X50
    public final void H0(int i) {
    }

    @Override // o.X50
    public final int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (!f() || x() == 0 || i == 0) {
            return 0;
        }
        c1266d60.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // o.X50
    public final boolean S() {
        return true;
    }

    @Override // o.X50
    public final void S0(int i, RecyclerView recyclerView) {
        C0571Lb c0571Lb = new C0571Lb(this, recyclerView.getContext(), 0);
        c0571Lb.a = i;
        T0(c0571Lb);
    }

    public final float V0(int i) {
        this.q.o();
        throw null;
    }

    public final int W0() {
        return Y0() ? this.n : this.f613o;
    }

    public final boolean Y0() {
        return this.q.m == 0;
    }

    public final boolean Z0() {
        return Y0() && I() == 1;
    }

    @Override // o.InterfaceC1657h60
    public final PointF a(int i) {
        return null;
    }

    @Override // o.X50
    public final void a0(RecyclerView recyclerView) {
        C2207mp c2207mp = this.p;
        Context context = recyclerView.getContext();
        float dimension = c2207mp.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c2207mp.a = dimension;
        float dimension2 = c2207mp.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c2207mp.b = dimension2;
        w0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    public final void a1(int i) {
        C0648Ob c0648Ob;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "invalid orientation:"));
        }
        c(null);
        AbstractC3015v6 abstractC3015v6 = this.q;
        if (abstractC3015v6 == null || i != abstractC3015v6.m) {
            if (i == 0) {
                c0648Ob = new C0648Ob(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0648Ob = new C0648Ob(this, 0);
            }
            this.q = c0648Ob;
            E0();
        }
    }

    @Override // o.X50
    public final void b0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:29:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0041  */
    @Override // o.X50
    public final View c0(View view, int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        byte b;
        if (x() == 0) {
            return null;
        }
        int i2 = this.q.m;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && i2 == 1) {
                        b = 1;
                    } else {
                        b = C3285xv.b;
                    }
                } else if (i2 != 0) {
                    b = C3285xv.b;
                } else if (Z0()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i2 == 1) {
                b = -1;
            } else {
                b = C3285xv.b;
            }
        } else if (i2 != 0) {
            b = C3285xv.b;
        } else if (Z0()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (X50.N(view) == 0) {
                return null;
            }
            int iN = X50.N(w(0)) - 1;
            if (iN < 0 || iN >= H()) {
                return w(Z0() ? x() - 1 : 0);
            }
            V0(iN);
            c1266d60.d(iN);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        if (X50.N(view) == H() - 1) {
            return null;
        }
        int iN2 = X50.N(w(x() - 1)) + 1;
        if (iN2 < 0 || iN2 >= H()) {
            return w(Z0() ? 0 : x() - 1);
        }
        V0(iN2);
        c1266d60.d(iN2);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // o.X50
    public final void d0(AccessibilityEvent accessibilityEvent) {
        super.d0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(X50.N(w(0)));
            accessibilityEvent.setToIndex(X50.N(w(x() - 1)));
        }
    }

    @Override // o.X50
    public final boolean e() {
        return Y0();
    }

    @Override // o.X50
    public final boolean f() {
        return !Y0();
    }

    @Override // o.X50
    public final void i0(int i, int i2) {
        H();
    }

    @Override // o.X50
    public final int k(C1755i60 c1755i60) {
        x();
        return 0;
    }

    @Override // o.X50
    public final int l(C1755i60 c1755i60) {
        return 0;
    }

    @Override // o.X50
    public final void l0(int i, int i2) {
        H();
    }

    @Override // o.X50
    public final int m(C1755i60 c1755i60) {
        return 0;
    }

    @Override // o.X50
    public final int n(C1755i60 c1755i60) {
        x();
        return 0;
    }

    @Override // o.X50
    public final int o(C1755i60 c1755i60) {
        return 0;
    }

    @Override // o.X50
    public final void o0(C1266d60 c1266d60, C1755i60 c1755i60) {
        if (c1755i60.b() <= 0 || W0() <= 0.0f) {
            x0(c1266d60);
        } else {
            Z0();
            c1266d60.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // o.X50
    public final int p(C1755i60 c1755i60) {
        return 0;
    }

    @Override // o.X50
    public final void p0(C1755i60 c1755i60) {
        if (x() == 0) {
            return;
        }
        X50.N(w(0));
    }

    @Override // o.X50
    public final Y50 t() {
        return new Y50(-2, -2);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0596Mb();
        this.r = new View.OnLayoutChangeListener() { // from class: o.Kb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                CarouselLayoutManager carouselLayoutManager = this.l;
                carouselLayoutManager.getClass();
                if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new Jj0(4, carouselLayoutManager));
            }
        };
        this.p = new C2207mp();
        E0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            E0();
            a1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
