package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import o.AJ;
import o.AbstractC0351Cp;
import o.AbstractC1701hf0;
import o.C0702Qd;
import o.C1214cg0;
import o.C1266d60;
import o.C1312dg0;
import o.C1507fg0;
import o.C1755i60;
import o.C2645rK;
import o.C2841tM;
import o.C2994uv;
import o.InterfaceC1657h60;
import o.It0;
import o.O50;
import o.Pu0;
import o.RunnableC3102w1;
import o.W50;
import o.X50;
import o.Y50;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends X50 implements InterfaceC1657h60 {
    public final C2994uv B;
    public final int C;
    public boolean D;
    public boolean E;
    public C1507fg0 F;
    public final Rect G;
    public final C1214cg0 H;
    public final boolean I;
    public int[] J;
    public final RunnableC3102w1 K;
    public final int p;
    public final C2841tM[] q;
    public final AbstractC0351Cp r;
    public final AbstractC0351Cp s;
    public final int t;
    public int u;
    public final AJ v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        C2994uv c2994uv = new C2994uv(26, false);
        this.B = c2994uv;
        this.C = 2;
        this.G = new Rect();
        this.H = new C1214cg0(this);
        this.I = true;
        this.K = new RunnableC3102w1(23, this);
        W50 w50O = X50.O(context, attributeSet, i, i2);
        int i3 = w50O.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            AbstractC0351Cp abstractC0351Cp = this.r;
            this.r = this.s;
            this.s = abstractC0351Cp;
            E0();
        }
        int i4 = w50O.b;
        c(null);
        if (i4 != this.p) {
            c2994uv.u();
            E0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new C2841tM[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new C2841tM(this, i5);
            }
            E0();
        }
        boolean z = w50O.c;
        c(null);
        C1507fg0 c1507fg0 = this.F;
        if (c1507fg0 != null && c1507fg0.s != z) {
            c1507fg0.s = z;
        }
        this.w = z;
        E0();
        AJ aj = new AJ();
        aj.a = true;
        aj.f = 0;
        aj.g = 0;
        this.v = aj;
        this.r = AbstractC0351Cp.a(this, this.t);
        this.s = AbstractC0351Cp.a(this, 1 - this.t);
    }

    public static int y1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // o.X50
    public final int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        return u1(i, c1266d60, c1755i60);
    }

    @Override // o.X50
    public final void H0(int i) {
        C1507fg0 c1507fg0 = this.F;
        if (c1507fg0 != null && c1507fg0.l != i) {
            c1507fg0.f778o = null;
            c1507fg0.n = 0;
            c1507fg0.l = -1;
            c1507fg0.m = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        E0();
    }

    @Override // o.X50
    public final int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        return u1(i, c1266d60, c1755i60);
    }

    @Override // o.X50
    public final void M0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        int i3 = this.p;
        int iL = L() + K();
        int iJ = J() + M();
        if (this.t == 1) {
            int iHeight = rect.height() + iJ;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = It0.a;
            iH2 = X50.h(i2, iHeight, recyclerView.getMinimumHeight());
            iH = X50.h(i, (this.u * i3) + iL, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iL;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = It0.a;
            iH = X50.h(i, iWidth, recyclerView2.getMinimumWidth());
            iH2 = X50.h(i2, (this.u * i3) + iJ, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // o.X50
    public final boolean S() {
        return this.C != 0;
    }

    @Override // o.X50
    public final void S0(int i, RecyclerView recyclerView) {
        C2645rK c2645rK = new C2645rK(recyclerView.getContext());
        c2645rK.a = i;
        T0(c2645rK);
    }

    @Override // o.X50
    public final boolean U0() {
        return this.F == null;
    }

    public final int V0(int i) {
        if (x() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < f1()) != this.x ? -1 : 1;
    }

    @Override // o.X50
    public final void W(int i) {
        super.W(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C2841tM c2841tM = this.q[i2];
            int i3 = c2841tM.b;
            if (i3 != Integer.MIN_VALUE) {
                c2841tM.b = i3 + i;
            }
            int i4 = c2841tM.c;
            if (i4 != Integer.MIN_VALUE) {
                c2841tM.c = i4 + i;
            }
        }
    }

    public final boolean W0() {
        int iF1;
        if (x() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iF1 = g1();
                f1();
            } else {
                iF1 = f1();
                g1();
            }
            C2994uv c2994uv = this.B;
            if (iF1 == 0 && k1() != null) {
                c2994uv.u();
                this.f = true;
                E0();
                return true;
            }
        }
        return false;
    }

    @Override // o.X50
    public final void X(int i) {
        super.X(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C2841tM c2841tM = this.q[i2];
            int i3 = c2841tM.b;
            if (i3 != Integer.MIN_VALUE) {
                c2841tM.b = i3 + i;
            }
            int i4 = c2841tM.c;
            if (i4 != Integer.MIN_VALUE) {
                c2841tM.c = i4 + i;
            }
        }
    }

    public final int X0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = this.I;
        return Pu0.e(c1755i60, abstractC0351Cp, c1(!z), b1(!z), this, this.I);
    }

    @Override // o.X50
    public final void Y(O50 o50) {
        this.B.u();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final int Y0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = this.I;
        return Pu0.f(c1755i60, abstractC0351Cp, c1(!z), b1(!z), this, this.I, this.x);
    }

    public final int Z0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = this.I;
        return Pu0.g(c1755i60, abstractC0351Cp, c1(!z), b1(!z), this, this.I);
    }

    @Override // o.InterfaceC1657h60
    public final PointF a(int i) {
        int iV0 = V0(i);
        PointF pointF = new PointF();
        if (iV0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = iV0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV0;
        }
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int a1(C1266d60 c1266d60, AJ aj, C1755i60 c1755i60) {
        C2841tM c2841tM;
        ?? r6;
        int i;
        int i2;
        int iC;
        int iK;
        int iC2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        this.y.set(0, this.p, true);
        AJ aj2 = this.v;
        int i7 = aj2.i ? aj.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : aj.e == 1 ? aj.g + aj.b : aj.f - aj.b;
        int i8 = aj.e;
        for (int i9 = 0; i9 < this.p; i9++) {
            if (!((ArrayList) this.q[i9].f).isEmpty()) {
                x1(this.q[i9], i8, i7);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i10 = aj.c;
            if (!(i10 >= 0 && i10 < c1755i60.b()) || (!aj2.i && this.y.isEmpty())) {
                break;
            }
            View viewD = c1266d60.d(aj.c);
            aj.c += aj.d;
            C1312dg0 c1312dg0 = (C1312dg0) viewD.getLayoutParams();
            int iE = c1312dg0.a.e();
            C2994uv c2994uv = this.B;
            int[] iArr = (int[]) c2994uv.m;
            int i11 = (iArr == null || iE >= iArr.length) ? -1 : iArr[iE];
            if (i11 == -1) {
                if (o1(aj.e)) {
                    i4 = this.p - i6;
                    i3 = -1;
                    i5 = -1;
                } else {
                    i3 = this.p;
                    i4 = 0;
                    i5 = 1;
                }
                C2841tM c2841tM2 = null;
                if (aj.e == i6) {
                    int iK2 = this.r.k();
                    int i12 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        C2841tM c2841tM3 = this.q[i4];
                        int iG2 = c2841tM3.g(iK2);
                        if (iG2 < i12) {
                            i12 = iG2;
                            c2841tM2 = c2841tM3;
                        }
                        i4 += i5;
                    }
                } else {
                    int iG3 = this.r.g();
                    int i13 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        C2841tM c2841tM4 = this.q[i4];
                        int i14 = c2841tM4.i(iG3);
                        if (i14 > i13) {
                            c2841tM2 = c2841tM4;
                            i13 = i14;
                        }
                        i4 += i5;
                    }
                }
                c2841tM = c2841tM2;
                c2994uv.U(iE);
                ((int[]) c2994uv.m)[iE] = c2841tM.e;
            } else {
                c2841tM = this.q[i11];
            }
            c1312dg0.e = c2841tM;
            if (aj.e == 1) {
                r6 = 0;
                b(viewD, -1, false);
            } else {
                r6 = 0;
                b(viewD, 0, false);
            }
            if (this.t == 1) {
                i = 1;
                m1(viewD, X50.y(r6, this.u, this.l, r6, ((ViewGroup.MarginLayoutParams) c1312dg0).width), X50.y(true, this.f613o, this.m, J() + M(), ((ViewGroup.MarginLayoutParams) c1312dg0).height));
            } else {
                i = 1;
                m1(viewD, X50.y(true, this.n, this.l, L() + K(), ((ViewGroup.MarginLayoutParams) c1312dg0).width), X50.y(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) c1312dg0).height));
            }
            if (aj.e == i) {
                iC = c2841tM.g(iG);
                i2 = this.r.c(viewD) + iC;
            } else {
                i2 = c2841tM.i(iG);
                iC = i2 - this.r.c(viewD);
            }
            if (aj.e == 1) {
                C2841tM c2841tM5 = c1312dg0.e;
                c2841tM5.getClass();
                C1312dg0 c1312dg1 = (C1312dg0) viewD.getLayoutParams();
                c1312dg1.e = c2841tM5;
                ArrayList arrayList = (ArrayList) c2841tM5.f;
                arrayList.add(viewD);
                c2841tM5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c2841tM5.b = Integer.MIN_VALUE;
                }
                if (c1312dg1.a.l() || c1312dg1.a.o()) {
                    c2841tM5.d = ((StaggeredGridLayoutManager) c2841tM5.g).r.c(viewD) + c2841tM5.d;
                }
            } else {
                C2841tM c2841tM6 = c1312dg0.e;
                c2841tM6.getClass();
                C1312dg0 c1312dg2 = (C1312dg0) viewD.getLayoutParams();
                c1312dg2.e = c2841tM6;
                ArrayList arrayList2 = (ArrayList) c2841tM6.f;
                arrayList2.add(0, viewD);
                c2841tM6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c2841tM6.c = Integer.MIN_VALUE;
                }
                if (c1312dg2.a.l() || c1312dg2.a.o()) {
                    c2841tM6.d = ((StaggeredGridLayoutManager) c2841tM6.g).r.c(viewD) + c2841tM6.d;
                }
            }
            if (l1() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - c2841tM.e) * this.u);
                iK = iC2 - this.s.c(viewD);
            } else {
                iK = this.s.k() + (c2841tM.e * this.u);
                iC2 = this.s.c(viewD) + iK;
            }
            if (this.t == 1) {
                X50.V(viewD, iK, iC, iC2, i2);
            } else {
                X50.V(viewD, iC, iK, i2, iC2);
            }
            x1(c2841tM, aj2.e, i7);
            q1(c1266d60, aj2);
            if (aj2.h && viewD.hasFocusable()) {
                this.y.set(c2841tM.e, false);
            }
            i6 = 1;
            z = true;
        }
        if (!z) {
            q1(c1266d60, aj2);
        }
        int iK3 = aj2.e == -1 ? this.r.k() - i1(this.r.k()) : h1(this.r.g()) - this.r.g();
        if (iK3 > 0) {
            return Math.min(aj.b, iK3);
        }
        return 0;
    }

    @Override // o.X50
    public final void b0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final View b1(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            int iE = this.r.e(viewW);
            int iB = this.r.b(viewW);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    @Override // o.X50
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0046  */
    /* JADX WARN: Code duplicated, block: B:38:0x004e  */
    @Override // o.X50
    public final View c0(View view, int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        View viewR;
        int i2;
        if (x() == 0 || (viewR = r(view)) == null) {
            return null;
        }
        t1();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.t == 0 : !(i != 130 || this.t != 1)) {
                            i2 = 1;
                        }
                    } else if (this.t == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.t == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.t != 1 && l1()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.t != 1 && l1()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C1312dg0 c1312dg0 = (C1312dg0) viewR.getLayoutParams();
        c1312dg0.getClass();
        C2841tM c2841tM = c1312dg0.e;
        int iG1 = i2 == 1 ? g1() : f1();
        w1(iG1, c1755i60);
        v1(i2);
        AJ aj = this.v;
        aj.c = aj.d + iG1;
        aj.b = (int) (this.r.l() * 0.33333334f);
        aj.h = true;
        aj.a = false;
        a1(c1266d60, aj, c1755i60);
        this.D = this.x;
        View viewH = c2841tM.h(iG1, i2);
        if (viewH != null && viewH != viewR) {
            return viewH;
        }
        if (o1(i2)) {
            for (int i3 = this.p - 1; i3 >= 0; i3--) {
                View viewH2 = this.q[i3].h(iG1, i2);
                if (viewH2 != null && viewH2 != viewR) {
                    return viewH2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.p; i4++) {
                View viewH3 = this.q[i4].h(iG1, i2);
                if (viewH3 != null && viewH3 != viewR) {
                    return viewH3;
                }
            }
        }
        boolean z = (this.w ^ true) == (i2 == -1);
        View viewS = s(z ? c2841tM.c() : c2841tM.d());
        if (viewS != null && viewS != viewR) {
            return viewS;
        }
        if (o1(i2)) {
            for (int i5 = this.p - 1; i5 >= 0; i5--) {
                if (i5 != c2841tM.e) {
                    View viewS2 = s(z ? this.q[i5].c() : this.q[i5].d());
                    if (viewS2 != null && viewS2 != viewR) {
                        return viewS2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.p; i6++) {
                View viewS3 = s(z ? this.q[i6].c() : this.q[i6].d());
                if (viewS3 != null && viewS3 != viewR) {
                    return viewS3;
                }
            }
        }
        return null;
    }

    public final View c1(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iX = x();
        View view = null;
        for (int i = 0; i < iX; i++) {
            View viewW = w(i);
            int iE = this.r.e(viewW);
            if (this.r.b(viewW) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    @Override // o.X50
    public final void d0(AccessibilityEvent accessibilityEvent) {
        super.d0(accessibilityEvent);
        if (x() > 0) {
            View viewC1 = c1(false);
            View viewB1 = b1(false);
            if (viewC1 == null || viewB1 == null) {
                return;
            }
            int iN = X50.N(viewC1);
            int iN2 = X50.N(viewB1);
            if (iN < iN2) {
                accessibilityEvent.setFromIndex(iN);
                accessibilityEvent.setToIndex(iN2);
            } else {
                accessibilityEvent.setFromIndex(iN2);
                accessibilityEvent.setToIndex(iN);
            }
        }
    }

    public final void d1(C1266d60 c1266d60, C1755i60 c1755i60, boolean z) {
        int iG;
        int iH1 = h1(Integer.MIN_VALUE);
        if (iH1 != Integer.MIN_VALUE && (iG = this.r.g() - iH1) > 0) {
            int i = iG - (-u1(-iG, c1266d60, c1755i60));
            if (!z || i <= 0) {
                return;
            }
            this.r.p(i);
        }
    }

    @Override // o.X50
    public final boolean e() {
        return this.t == 0;
    }

    public final void e1(C1266d60 c1266d60, C1755i60 c1755i60, boolean z) {
        int iK;
        int iI1 = i1(Integer.MAX_VALUE);
        if (iI1 != Integer.MAX_VALUE && (iK = iI1 - this.r.k()) > 0) {
            int iU1 = iK - u1(iK, c1266d60, c1755i60);
            if (!z || iU1 <= 0) {
                return;
            }
            this.r.p(-iU1);
        }
    }

    @Override // o.X50
    public final boolean f() {
        return this.t == 1;
    }

    public final int f1() {
        if (x() == 0) {
            return 0;
        }
        return X50.N(w(0));
    }

    @Override // o.X50
    public final boolean g(Y50 y50) {
        return y50 instanceof C1312dg0;
    }

    public final int g1() {
        int iX = x();
        if (iX == 0) {
            return 0;
        }
        return X50.N(w(iX - 1));
    }

    public final int h1(int i) {
        int iG = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iG2 = this.q[i2].g(i);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    @Override // o.X50
    public final void i(int i, int i2, C1755i60 c1755i60, C0702Qd c0702Qd) {
        AJ aj;
        int iG;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        p1(i, c1755i60);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.p;
            aj = this.v;
            if (i4 >= i6) {
                break;
            }
            if (aj.d == -1) {
                iG = aj.f;
                i3 = this.q[i4].i(iG);
            } else {
                iG = this.q[i4].g(aj.g);
                i3 = aj.g;
            }
            int i7 = iG - i3;
            if (i7 >= 0) {
                this.J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = aj.c;
            if (i9 < 0 || i9 >= c1755i60.b()) {
                return;
            }
            c0702Qd.a(aj.c, this.J[i8]);
            aj.c += aj.d;
        }
    }

    @Override // o.X50
    public final void i0(int i, int i2) {
        j1(i, i2, 1);
    }

    public final int i1(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // o.X50
    public final void j0() {
        this.B.u();
        E0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void j1(int i, int i2, int i3) {
        int i4;
        int i5;
        C2994uv c2994uv;
        int iG1;
        int iG2 = this.x ? g1() : f1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c2994uv = this.B;
            c2994uv.e0(i5);
            if (i3 != 1) {
                c2994uv.f0(i, i2);
            } else if (i3 != 2) {
                c2994uv.g0(i, i2);
            } else if (i3 == 8) {
                c2994uv.g0(i, 1);
                c2994uv.f0(i2, 1);
            }
            if (i4 <= iG2) {
                return;
            }
            if (this.x) {
                iG1 = f1();
            } else {
                iG1 = g1();
            }
            if (i5 <= iG1) {
                E0();
            }
        }
        i4 = i + i2;
        i5 = i;
        c2994uv = this.B;
        c2994uv.e0(i5);
        if (i3 != 1) {
            c2994uv.f0(i, i2);
        } else if (i3 != 2) {
            c2994uv.g0(i, i2);
        } else if (i3 == 8) {
            c2994uv.g0(i, 1);
            c2994uv.f0(i2, 1);
        }
        if (i4 <= iG2) {
            return;
        }
        if (this.x) {
            iG1 = f1();
        } else {
            iG1 = g1();
        }
        if (i5 <= iG1) {
            E0();
        }
    }

    @Override // o.X50
    public final int k(C1755i60 c1755i60) {
        return X0(c1755i60);
    }

    @Override // o.X50
    public final void k0(int i, int i2) {
        j1(i, i2, 8);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002c A[SYNTHETIC] */
    public final View k1() {
        boolean z;
        boolean z2;
        int iX = x();
        int i = iX - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        byte b = (this.t == 1 && l1()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iX = -1;
        } else {
            i = 0;
        }
        int i2 = i < iX ? 1 : -1;
        while (i != iX) {
            View viewW = w(i);
            C1312dg0 c1312dg0 = (C1312dg0) viewW.getLayoutParams();
            if (bitSet.get(c1312dg0.e.e)) {
                C2841tM c2841tM = c1312dg0.e;
                if (this.x) {
                    int i3 = c2841tM.c;
                    if (i3 == Integer.MIN_VALUE) {
                        c2841tM.a();
                        i3 = c2841tM.c;
                    }
                    if (i3 < this.r.g()) {
                        ((C1312dg0) ((View) AbstractC1701hf0.c(1, (ArrayList) c2841tM.f)).getLayoutParams()).getClass();
                        return viewW;
                    }
                    bitSet.clear(c1312dg0.e.e);
                } else {
                    int i4 = c2841tM.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) c2841tM.f).get(0);
                        C1312dg0 c1312dg1 = (C1312dg0) view.getLayoutParams();
                        c2841tM.b = ((StaggeredGridLayoutManager) c2841tM.g).r.e(view);
                        c1312dg1.getClass();
                        i4 = c2841tM.b;
                    }
                    if (i4 > this.r.k()) {
                        ((C1312dg0) ((View) ((ArrayList) c2841tM.f).get(0)).getLayoutParams()).getClass();
                        return viewW;
                    }
                    bitSet.clear(c1312dg0.e.e);
                }
            }
            i += i2;
            if (i != iX) {
                View viewW2 = w(i);
                if (this.x) {
                    int iB = this.r.b(viewW);
                    int iB2 = this.r.b(viewW2);
                    if (iB < iB2) {
                        return viewW;
                    }
                    if (iB == iB2) {
                        if (c1312dg0.e.e - ((C1312dg0) viewW2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewW;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iE = this.r.e(viewW);
                    int iE2 = this.r.e(viewW2);
                    if (iE > iE2) {
                        return viewW;
                    }
                    if (iE == iE2) {
                        if (c1312dg0.e.e - ((C1312dg0) viewW2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewW;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // o.X50
    public final int l(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    @Override // o.X50
    public final void l0(int i, int i2) {
        j1(i, i2, 2);
    }

    public final boolean l1() {
        return I() == 1;
    }

    @Override // o.X50
    public final int m(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    public final void m1(View view, int i, int i2) {
        Rect rect = this.G;
        d(view, rect);
        C1312dg0 c1312dg0 = (C1312dg0) view.getLayoutParams();
        int iY1 = y1(i, ((ViewGroup.MarginLayoutParams) c1312dg0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1312dg0).rightMargin + rect.right);
        int iY2 = y1(i2, ((ViewGroup.MarginLayoutParams) c1312dg0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1312dg0).bottomMargin + rect.bottom);
        if (P0(view, iY1, iY2, c1312dg0)) {
            view.measure(iY1, iY2);
        }
    }

    @Override // o.X50
    public final int n(C1755i60 c1755i60) {
        return X0(c1755i60);
    }

    @Override // o.X50
    public final void n0(RecyclerView recyclerView, int i, int i2) {
        j1(i, i2, 4);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:246:0x040c  */
    /* JADX WARN: Code duplicated, block: B:257:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01ea A[SYNTHETIC] */
    public final void n1(C1266d60 c1266d60, C1755i60 c1755i60, boolean z) {
        boolean z2;
        C1507fg0 c1507fg0;
        int iX;
        int i;
        int iN;
        int iN2;
        int iX2;
        int i2;
        C1507fg0 c1507fg1 = this.F;
        C1214cg0 c1214cg0 = this.H;
        if (!(c1507fg1 == null && this.z == -1) && c1755i60.b() == 0) {
            x0(c1266d60);
            c1214cg0.a();
            return;
        }
        boolean z3 = (c1214cg0.e && this.z == -1 && this.F == null) ? false : true;
        C2994uv c2994uv = this.B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1214cg0.g;
        if (z3) {
            c1214cg0.a();
            C1507fg0 c1507fg2 = this.F;
            if (c1507fg2 != null) {
                int i3 = c1507fg2.n;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].b();
                            C1507fg0 c1507fg3 = this.F;
                            int iG = c1507fg3.f778o[i4];
                            if (iG != Integer.MIN_VALUE) {
                                iG += c1507fg3.t ? this.r.g() : this.r.k();
                            }
                            C2841tM c2841tM = this.q[i4];
                            c2841tM.b = iG;
                            c2841tM.c = iG;
                        }
                    } else {
                        c1507fg2.f778o = null;
                        c1507fg2.n = 0;
                        c1507fg2.p = 0;
                        c1507fg2.q = null;
                        c1507fg2.r = null;
                        c1507fg2.l = c1507fg2.m;
                    }
                }
                C1507fg0 c1507fg4 = this.F;
                this.E = c1507fg4.u;
                boolean z4 = c1507fg4.s;
                c(null);
                C1507fg0 c1507fg5 = this.F;
                if (c1507fg5 != null && c1507fg5.s != z4) {
                    c1507fg5.s = z4;
                }
                this.w = z4;
                E0();
                t1();
                C1507fg0 c1507fg6 = this.F;
                int i5 = c1507fg6.l;
                if (i5 != -1) {
                    this.z = i5;
                    c1214cg0.c = c1507fg6.t;
                } else {
                    c1214cg0.c = this.x;
                }
                if (c1507fg6.p > 1) {
                    c2994uv.m = c1507fg6.q;
                    c2994uv.n = c1507fg6.r;
                }
            } else {
                t1();
                c1214cg0.c = this.x;
            }
            if (c1755i60.g || (i2 = this.z) == -1) {
                if (this.D) {
                    int iB = c1755i60.b();
                    iX2 = x() - 1;
                    while (true) {
                        if (iX2 < 0) {
                            iN2 = 0;
                            break;
                        }
                        iN2 = X50.N(w(iX2));
                        if (iN2 < 0 && iN2 < iB) {
                            break;
                        } else {
                            iX2--;
                        }
                    }
                } else {
                    int iB2 = c1755i60.b();
                    iX = x();
                    i = 0;
                    while (true) {
                        if (i >= iX) {
                            iN2 = 0;
                            break;
                        }
                        iN = X50.N(w(i));
                        if (iN < 0 && iN < iB2) {
                            iN2 = iN;
                            break;
                        }
                        i++;
                    }
                }
                c1214cg0.a = iN2;
                c1214cg0.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c1755i60.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = c1755i60.b();
                    iX2 = x() - 1;
                    while (true) {
                        if (iX2 < 0) {
                            iN2 = 0;
                            break;
                        } else {
                            iN2 = X50.N(w(iX2));
                            if (iN2 < 0) {
                            }
                            iX2--;
                        }
                    }
                } else {
                    int iB4 = c1755i60.b();
                    iX = x();
                    i = 0;
                    while (true) {
                        if (i >= iX) {
                            iN2 = 0;
                            break;
                        } else {
                            iN = X50.N(w(i));
                            if (iN < 0) {
                            }
                            i++;
                        }
                    }
                }
                c1214cg0.a = iN2;
                c1214cg0.b = Integer.MIN_VALUE;
            } else {
                C1507fg0 c1507fg7 = this.F;
                if (c1507fg7 == null || c1507fg7.l == -1 || c1507fg7.n < 1) {
                    View viewS = s(this.z);
                    if (viewS != null) {
                        c1214cg0.a = this.x ? g1() : f1();
                        if (this.A != Integer.MIN_VALUE) {
                            if (c1214cg0.c) {
                                c1214cg0.b = (this.r.g() - this.A) - this.r.b(viewS);
                            } else {
                                c1214cg0.b = (this.r.k() + this.A) - this.r.e(viewS);
                            }
                        } else if (this.r.c(viewS) > this.r.l()) {
                            c1214cg0.b = c1214cg0.c ? this.r.g() : this.r.k();
                        } else {
                            int iE = this.r.e(viewS) - this.r.k();
                            if (iE < 0) {
                                c1214cg0.b = -iE;
                            } else {
                                int iG2 = this.r.g() - this.r.b(viewS);
                                if (iG2 < 0) {
                                    c1214cg0.b = iG2;
                                } else {
                                    c1214cg0.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.z;
                        c1214cg0.a = i6;
                        int i7 = this.A;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z5 = V0(i6) == 1;
                            c1214cg0.c = z5;
                            c1214cg0.b = z5 ? staggeredGridLayoutManager.r.g() : staggeredGridLayoutManager.r.k();
                        } else if (c1214cg0.c) {
                            c1214cg0.b = staggeredGridLayoutManager.r.g() - i7;
                        } else {
                            c1214cg0.b = staggeredGridLayoutManager.r.k() + i7;
                        }
                        c1214cg0.d = true;
                    }
                } else {
                    c1214cg0.b = Integer.MIN_VALUE;
                    c1214cg0.a = this.z;
                }
            }
            c1214cg0.e = true;
        }
        if (this.F == null && this.z == -1 && (c1214cg0.c != this.D || l1() != this.E)) {
            c2994uv.u();
            c1214cg0.d = true;
        }
        if (x() > 0 && ((c1507fg0 = this.F) == null || c1507fg0.n < 1)) {
            if (c1214cg0.d) {
                for (int i8 = 0; i8 < this.p; i8++) {
                    this.q[i8].b();
                    int i9 = c1214cg0.b;
                    if (i9 != Integer.MIN_VALUE) {
                        C2841tM c2841tM2 = this.q[i8];
                        c2841tM2.b = i9;
                        c2841tM2.c = i9;
                    }
                }
            } else if (z3 || c1214cg0.f == null) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    C2841tM c2841tM3 = this.q[i10];
                    boolean z6 = this.x;
                    int i11 = c1214cg0.b;
                    int iG3 = z6 ? c2841tM3.g(Integer.MIN_VALUE) : c2841tM3.i(Integer.MIN_VALUE);
                    c2841tM3.b();
                    if (iG3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c2841tM3.g;
                        if ((!z6 || iG3 >= staggeredGridLayoutManager2.r.g()) && (z6 || iG3 <= staggeredGridLayoutManager2.r.k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iG3 += i11;
                            }
                            c2841tM3.c = iG3;
                            c2841tM3.b = iG3;
                        }
                    }
                }
                C2841tM[] c2841tMArr = this.q;
                int length = c2841tMArr.length;
                int[] iArr = c1214cg0.f;
                if (iArr == null || iArr.length < length) {
                    c1214cg0.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c1214cg0.f[i12] = c2841tMArr[i12].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.p; i13++) {
                    C2841tM c2841tM4 = this.q[i13];
                    c2841tM4.b();
                    int i14 = c1214cg0.f[i13];
                    c2841tM4.b = i14;
                    c2841tM4.c = i14;
                }
            }
        }
        q(c1266d60);
        AJ aj = this.v;
        aj.a = false;
        int iL = this.s.l();
        this.u = iL / this.p;
        View.MeasureSpec.makeMeasureSpec(iL, this.s.i());
        w1(c1214cg0.a, c1755i60);
        if (c1214cg0.c) {
            v1(-1);
            a1(c1266d60, aj, c1755i60);
            v1(1);
            aj.c = c1214cg0.a + aj.d;
            a1(c1266d60, aj, c1755i60);
        } else {
            v1(1);
            a1(c1266d60, aj, c1755i60);
            v1(-1);
            aj.c = c1214cg0.a + aj.d;
            a1(c1266d60, aj, c1755i60);
        }
        if (this.s.i() != 1073741824) {
            int iX3 = x();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iX3; i15++) {
                View viewW = w(i15);
                float fC = this.s.c(viewW);
                if (fC >= fMax) {
                    ((C1312dg0) viewW.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i16 = this.u;
            int iRound = Math.round(fMax * this.p);
            if (this.s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.s.l());
            }
            this.u = iRound / this.p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.s.i());
            if (this.u != i16) {
                for (int i17 = 0; i17 < iX3; i17++) {
                    View viewW2 = w(i17);
                    C1312dg0 c1312dg0 = (C1312dg0) viewW2.getLayoutParams();
                    c1312dg0.getClass();
                    if (l1() && this.t == 1) {
                        int i18 = -((this.p - 1) - c1312dg0.e.e);
                        viewW2.offsetLeftAndRight((this.u * i18) - (i18 * i16));
                    } else {
                        int i19 = c1312dg0.e.e;
                        int i20 = this.u * i19;
                        int i21 = i19 * i16;
                        if (this.t == 1) {
                            viewW2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewW2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (x() > 0) {
            if (this.x) {
                d1(c1266d60, c1755i60, true);
                e1(c1266d60, c1755i60, false);
            } else {
                e1(c1266d60, c1755i60, true);
                d1(c1266d60, c1755i60, false);
            }
        }
        if (z && !c1755i60.g && this.C != 0 && x() > 0 && k1() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z2 = W0();
        }
        if (c1755i60.g) {
            c1214cg0.a();
        }
        this.D = c1214cg0.c;
        this.E = l1();
        if (z2) {
            c1214cg0.a();
            n1(c1266d60, c1755i60, false);
        }
    }

    @Override // o.X50
    public final int o(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    @Override // o.X50
    public final void o0(C1266d60 c1266d60, C1755i60 c1755i60) {
        n1(c1266d60, c1755i60, true);
    }

    public final boolean o1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == l1();
    }

    @Override // o.X50
    public final int p(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    @Override // o.X50
    public final void p0(C1755i60 c1755i60) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void p1(int i, C1755i60 c1755i60) {
        int iF1;
        int i2;
        if (i > 0) {
            iF1 = g1();
            i2 = 1;
        } else {
            iF1 = f1();
            i2 = -1;
        }
        AJ aj = this.v;
        aj.a = true;
        w1(iF1, c1755i60);
        v1(i2);
        aj.c = iF1 + aj.d;
        aj.b = Math.abs(i);
    }

    public final void q1(C1266d60 c1266d60, AJ aj) {
        int iMin;
        if (!aj.a || aj.i) {
            return;
        }
        if (aj.b == 0) {
            if (aj.e == -1) {
                r1(aj.g, c1266d60);
                return;
            } else {
                s1(aj.f, c1266d60);
                return;
            }
        }
        int i = 1;
        if (aj.e == -1) {
            int i2 = aj.f;
            int i3 = this.q[0].i(i2);
            while (i < this.p) {
                int i4 = this.q[i].i(i2);
                if (i4 > i3) {
                    i3 = i4;
                }
                i++;
            }
            int i5 = i2 - i3;
            r1(i5 < 0 ? aj.g : aj.g - Math.min(i5, aj.b), c1266d60);
            return;
        }
        int i6 = aj.g;
        int iG = this.q[0].g(i6);
        while (i < this.p) {
            int iG2 = this.q[i].g(i6);
            if (iG2 < iG) {
                iG = iG2;
            }
            i++;
        }
        int i7 = iG - aj.g;
        if (i7 < 0) {
            iMin = aj.f;
        } else {
            iMin = Math.min(i7, aj.b) + aj.f;
        }
        s1(iMin, c1266d60);
    }

    public final void r1(int i, C1266d60 c1266d60) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            if (this.r.e(viewW) < i || this.r.o(viewW) < i) {
                return;
            }
            C1312dg0 c1312dg0 = (C1312dg0) viewW.getLayoutParams();
            c1312dg0.getClass();
            if (((ArrayList) c1312dg0.e.f).size() == 1) {
                return;
            }
            C2841tM c2841tM = c1312dg0.e;
            ArrayList arrayList = (ArrayList) c2841tM.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1312dg0 c1312dg1 = (C1312dg0) view.getLayoutParams();
            c1312dg1.e = null;
            if (c1312dg1.a.l() || c1312dg1.a.o()) {
                c2841tM.d -= ((StaggeredGridLayoutManager) c2841tM.g).r.c(view);
            }
            if (size == 1) {
                c2841tM.b = Integer.MIN_VALUE;
            }
            c2841tM.c = Integer.MIN_VALUE;
            z0(viewW, c1266d60);
        }
    }

    @Override // o.X50
    public final void s0(Parcelable parcelable) {
        if (parcelable instanceof C1507fg0) {
            C1507fg0 c1507fg0 = (C1507fg0) parcelable;
            this.F = c1507fg0;
            if (this.z != -1) {
                c1507fg0.f778o = null;
                c1507fg0.n = 0;
                c1507fg0.l = -1;
                c1507fg0.m = -1;
                c1507fg0.f778o = null;
                c1507fg0.n = 0;
                c1507fg0.p = 0;
                c1507fg0.q = null;
                c1507fg0.r = null;
            }
            E0();
        }
    }

    public final void s1(int i, C1266d60 c1266d60) {
        while (x() > 0) {
            View viewW = w(0);
            if (this.r.b(viewW) > i || this.r.n(viewW) > i) {
                return;
            }
            C1312dg0 c1312dg0 = (C1312dg0) viewW.getLayoutParams();
            c1312dg0.getClass();
            if (((ArrayList) c1312dg0.e.f).size() == 1) {
                return;
            }
            C2841tM c2841tM = c1312dg0.e;
            ArrayList arrayList = (ArrayList) c2841tM.f;
            View view = (View) arrayList.remove(0);
            C1312dg0 c1312dg1 = (C1312dg0) view.getLayoutParams();
            c1312dg1.e = null;
            if (arrayList.size() == 0) {
                c2841tM.c = Integer.MIN_VALUE;
            }
            if (c1312dg1.a.l() || c1312dg1.a.o()) {
                c2841tM.d -= ((StaggeredGridLayoutManager) c2841tM.g).r.c(view);
            }
            c2841tM.b = Integer.MIN_VALUE;
            z0(viewW, c1266d60);
        }
    }

    @Override // o.X50
    public final Y50 t() {
        return this.t == 0 ? new C1312dg0(-2, -1) : new C1312dg0(-1, -2);
    }

    @Override // o.X50
    public final Parcelable t0() {
        int i;
        int iK;
        int[] iArr;
        C1507fg0 c1507fg0 = this.F;
        if (c1507fg0 != null) {
            C1507fg0 c1507fg1 = new C1507fg0();
            c1507fg1.n = c1507fg0.n;
            c1507fg1.l = c1507fg0.l;
            c1507fg1.m = c1507fg0.m;
            c1507fg1.f778o = c1507fg0.f778o;
            c1507fg1.p = c1507fg0.p;
            c1507fg1.q = c1507fg0.q;
            c1507fg1.s = c1507fg0.s;
            c1507fg1.t = c1507fg0.t;
            c1507fg1.u = c1507fg0.u;
            c1507fg1.r = c1507fg0.r;
            return c1507fg1;
        }
        C1507fg0 c1507fg2 = new C1507fg0();
        c1507fg2.s = this.w;
        c1507fg2.t = this.D;
        c1507fg2.u = this.E;
        C2994uv c2994uv = this.B;
        if (c2994uv == null || (iArr = (int[]) c2994uv.m) == null) {
            c1507fg2.p = 0;
        } else {
            c1507fg2.q = iArr;
            c1507fg2.p = iArr.length;
            c1507fg2.r = (List) c2994uv.n;
        }
        if (x() > 0) {
            c1507fg2.l = this.D ? g1() : f1();
            View viewB1 = this.x ? b1(true) : c1(true);
            c1507fg2.m = viewB1 != null ? X50.N(viewB1) : -1;
            int i2 = this.p;
            c1507fg2.n = i2;
            c1507fg2.f778o = new int[i2];
            for (int i3 = 0; i3 < this.p; i3++) {
                if (this.D) {
                    i = this.q[i3].g(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        iK = this.r.g();
                        i -= iK;
                    }
                } else {
                    i = this.q[i3].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        iK = this.r.k();
                        i -= iK;
                    }
                }
                c1507fg2.f778o[i3] = i;
            }
        } else {
            c1507fg2.l = -1;
            c1507fg2.m = -1;
            c1507fg2.n = 0;
        }
        return c1507fg2;
    }

    public final void t1() {
        if (this.t == 1 || !l1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // o.X50
    public final Y50 u(Context context, AttributeSet attributeSet) {
        return new C1312dg0(context, attributeSet);
    }

    @Override // o.X50
    public final void u0(int i) {
        if (i == 0) {
            W0();
        }
    }

    public final int u1(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        p1(i, c1755i60);
        AJ aj = this.v;
        int iA1 = a1(c1266d60, aj, c1755i60);
        if (aj.b >= iA1) {
            i = i < 0 ? -iA1 : iA1;
        }
        this.r.p(-i);
        this.D = this.x;
        aj.b = 0;
        q1(c1266d60, aj);
        return i;
    }

    @Override // o.X50
    public final Y50 v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1312dg0((ViewGroup.MarginLayoutParams) layoutParams) : new C1312dg0(layoutParams);
    }

    public final void v1(int i) {
        AJ aj = this.v;
        aj.e = i;
        aj.d = this.x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public final void w1(int i, C1755i60 c1755i60) {
        int iL;
        int iL2;
        RecyclerView recyclerView;
        int i2;
        AJ aj = this.v;
        boolean z = false;
        aj.b = 0;
        aj.c = i;
        if (U() && (i2 = c1755i60.a) != -1) {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
            recyclerView = this.b;
            if (recyclerView == null && recyclerView.s) {
                aj.f = this.r.k() - iL2;
                aj.g = this.r.g() + iL;
            } else {
                aj.g = this.r.f() + iL;
                aj.f = -iL2;
            }
            aj.h = false;
            aj.a = true;
            if (this.r.i() == 0 && this.r.f() == 0) {
                z = true;
            }
            aj.i = z;
        }
        iL = 0;
        iL2 = 0;
        recyclerView = this.b;
        if (recyclerView == null) {
            aj.g = this.r.f() + iL;
            aj.f = -iL2;
        } else {
            aj.g = this.r.f() + iL;
            aj.f = -iL2;
        }
        aj.h = false;
        aj.a = true;
        if (this.r.i() == 0) {
            z = true;
        }
        aj.i = z;
    }

    public final void x1(C2841tM c2841tM, int i, int i2) {
        int i3 = c2841tM.d;
        int i4 = c2841tM.e;
        if (i != -1) {
            int i5 = c2841tM.c;
            if (i5 == Integer.MIN_VALUE) {
                c2841tM.a();
                i5 = c2841tM.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c2841tM.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c2841tM.f).get(0);
            C1312dg0 c1312dg0 = (C1312dg0) view.getLayoutParams();
            c2841tM.b = ((StaggeredGridLayoutManager) c2841tM.g).r.e(view);
            c1312dg0.getClass();
            i6 = c2841tM.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }
}
