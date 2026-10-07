package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;
import o.AbstractC1163c4;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;
import o.C0702Qd;
import o.C1266d60;
import o.C1755i60;
import o.C2161mK;
import o.C2258nK;
import o.C2355oK;
import o.C2635rA;
import o.C2829tA;
import o.It0;
import o.M0;
import o.N0;
import o.X50;
import o.Y50;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public AbstractC1163c4 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C2635rA();
        this.L = new Rect();
        H1(X50.O(context, attributeSet, i, i2).b);
    }

    public final void A1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void B1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int C1(int i, int i2) {
        if (this.p != 1 || !o1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int D1(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (!c1755i60.g) {
            return this.K.g(i, this.F);
        }
        int iB = c1266d60.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.K.g(iB, this.F);
    }

    public final int E1(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (!c1755i60.g) {
            return this.K.h(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = c1266d60.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.K.h(iB, this.F);
    }

    public final int F1(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (!c1755i60.g) {
            return this.K.i(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = c1266d60.b(i);
        if (iB == -1) {
            return 1;
        }
        return this.K.i(iB);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        I1();
        B1();
        return super.G0(i, c1266d60, c1755i60);
    }

    public final void G1(View view, int i, boolean z) {
        int iY;
        int iY2;
        C2829tA c2829tA = (C2829tA) view.getLayoutParams();
        Rect rect = c2829tA.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2829tA).topMargin + ((ViewGroup.MarginLayoutParams) c2829tA).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2829tA).leftMargin + ((ViewGroup.MarginLayoutParams) c2829tA).rightMargin;
        int iC1 = C1(c2829tA.e, c2829tA.f);
        if (this.p == 1) {
            iY2 = X50.y(false, iC1, i, i3, ((ViewGroup.MarginLayoutParams) c2829tA).width);
            iY = X50.y(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) c2829tA).height);
        } else {
            int iY3 = X50.y(false, iC1, i, i2, ((ViewGroup.MarginLayoutParams) c2829tA).height);
            int iY4 = X50.y(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) c2829tA).width);
            iY = iY3;
            iY2 = iY4;
        }
        Y50 y50 = (Y50) view.getLayoutParams();
        if (z ? R0(view, iY2, iY, y50) : P0(view, iY2, iY, y50)) {
            view.measure(iY2, iY);
        }
    }

    public final void H1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.j();
        E0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        I1();
        B1();
        return super.I0(i, c1266d60, c1755i60);
    }

    public final void I1() {
        int iJ;
        int iM;
        if (this.p == 1) {
            iJ = this.n - L();
            iM = K();
        } else {
            iJ = this.f613o - J();
            iM = M();
        }
        A1(iJ - iM);
    }

    @Override // o.X50
    public final void M0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        if (this.G == null) {
            super.M0(rect, i, i2);
        }
        int iL = L() + K();
        int iJ = J() + M();
        if (this.p == 1) {
            int iHeight = rect.height() + iJ;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = It0.a;
            iH2 = X50.h(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iH = X50.h(i, iArr[iArr.length - 1] + iL, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iL;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = It0.a;
            iH = X50.h(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iH2 = X50.h(i2, iArr2[iArr2.length - 1] + iJ, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // o.X50
    public final int P(C1266d60 c1266d60, C1755i60 c1755i60) {
        if (this.p == 0) {
            return this.F;
        }
        if (c1755i60.b() < 1) {
            return 0;
        }
        return D1(c1755i60.b() - 1, c1266d60, c1755i60) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final boolean U0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(C1755i60 c1755i60, C2355oK c2355oK, C0702Qd c0702Qd) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c2355oK.d) >= 0 && i < c1755i60.b() && i2 > 0; i3++) {
            int i4 = c2355oK.d;
            c0702Qd.a(i4, Math.max(0, c2355oK.g));
            i2 -= this.K.i(i4);
            c2355oK.d += c2355oK.e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        if (r13 == (r2 > r15)) goto L46;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View c0(android.view.View r23, int r24, o.C1266d60 r25, o.C1755i60 r26) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c0(android.view.View, int, o.d60, o.i60):android.view.View");
    }

    @Override // o.X50
    public final void e0(C1266d60 c1266d60, C1755i60 c1755i60, N0 n0) {
        super.e0(c1266d60, c1755i60, n0);
        n0.i(GridView.class.getName());
    }

    @Override // o.X50
    public final boolean g(Y50 y50) {
        return y50 instanceof C2829tA;
    }

    @Override // o.X50
    public final void g0(C1266d60 c1266d60, C1755i60 c1755i60, View view, N0 n0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2829tA)) {
            f0(view, n0);
            return;
        }
        C2829tA c2829tA = (C2829tA) layoutParams;
        int iD1 = D1(c2829tA.a.e(), c1266d60, c1755i60);
        if (this.p == 0) {
            n0.k(M0.a(false, c2829tA.e, c2829tA.f, iD1, 1));
        } else {
            n0.k(M0.a(false, iD1, 1, c2829tA.e, c2829tA.f));
        }
    }

    @Override // o.X50
    public final void i0(int i, int i2) {
        this.K.j();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // o.X50
    public final void j0() {
        this.K.j();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View j1(C1266d60 c1266d60, C1755i60 c1755i60, boolean z, boolean z2) {
        int i;
        int iX;
        int iX2 = x();
        int i2 = 1;
        if (z2) {
            iX = x() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iX2;
            iX = 0;
        }
        int iB = c1755i60.b();
        b1();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iX != i) {
            View viewW = w(iX);
            int iN = X50.N(viewW);
            if (iN >= 0 && iN < iB && E1(iN, c1266d60, c1755i60) == 0) {
                if (((Y50) viewW.getLayoutParams()).a.l()) {
                    if (view2 == null) {
                        view2 = viewW;
                    }
                } else {
                    if (this.r.e(viewW) < iG && this.r.b(viewW) >= iK) {
                        return viewW;
                    }
                    if (view == null) {
                        view = viewW;
                    }
                }
            }
            iX += i2;
        }
        return view != null ? view : view2;
    }

    @Override // o.X50
    public final void k0(int i, int i2) {
        this.K.j();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int l(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    @Override // o.X50
    public final void l0(int i, int i2) {
        this.K.j();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int m(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    @Override // o.X50
    public final void n0(RecyclerView recyclerView, int i, int i2) {
        this.K.j();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int o(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final void o0(C1266d60 c1266d60, C1755i60 c1755i60) {
        boolean z = c1755i60.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iX = x();
            for (int i = 0; i < iX; i++) {
                C2829tA c2829tA = (C2829tA) w(i).getLayoutParams();
                int iE = c2829tA.a.e();
                sparseIntArray2.put(iE, c2829tA.f);
                sparseIntArray.put(iE, c2829tA.e);
            }
        }
        super.o0(c1266d60, c1755i60);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final int p(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final void p0(C1755i60 c1755i60) {
        super.p0(c1755i60);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void p1(C1266d60 c1266d60, C1755i60 c1755i60, C2355oK c2355oK, C2258nK c2258nK) {
        int i;
        int i2;
        int i3;
        int iD;
        int iK;
        int iM;
        int iD2;
        int iY;
        int iY2;
        boolean z;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z2 = iJ != 1073741824;
        int i5 = x() > 0 ? this.G[this.F] : 0;
        if (z2) {
            I1();
        }
        boolean z3 = c2355oK.e == 1;
        int iE1 = this.F;
        if (!z3) {
            iE1 = E1(c2355oK.d, c1266d60, c1755i60) + F1(c2355oK.d, c1266d60, c1755i60);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = c2355oK.d) >= 0 && i4 < c1755i60.b() && iE1 > 0) {
            int i7 = c2355oK.d;
            int iF1 = F1(i7, c1266d60, c1755i60);
            if (iF1 > this.F) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iF1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC1701hf0.g(sb, this.F, " spans."));
            }
            iE1 -= iF1;
            if (iE1 < 0 || (viewB = c2355oK.b(c1266d60)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            c2258nK.b = true;
            return;
        }
        if (z3) {
            i2 = i6;
            i = 0;
            i3 = 1;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            C2829tA c2829tA = (C2829tA) view.getLayoutParams();
            int iF2 = F1(X50.N(view), c1266d60, c1755i60);
            c2829tA.f = iF2;
            c2829tA.e = i8;
            i8 += iF2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (c2355oK.k != null) {
                z = false;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                b(view2, -1, false);
            } else {
                z = false;
                b(view2, 0, false);
            }
            d(view2, this.L);
            G1(view2, iJ, z);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((C2829tA) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z2) {
            A1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                G1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                C2829tA c2829tA2 = (C2829tA) view4.getLayoutParams();
                Rect rect = c2829tA2.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2829tA2).topMargin + ((ViewGroup.MarginLayoutParams) c2829tA2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2829tA2).leftMargin + ((ViewGroup.MarginLayoutParams) c2829tA2).rightMargin;
                int iC1 = C1(c2829tA2.e, c2829tA2.f);
                if (this.p == 1) {
                    iY2 = X50.y(false, iC1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c2829tA2).width);
                    iY = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iY = X50.y(false, iC1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c2829tA2).height);
                    iY2 = iMakeMeasureSpec;
                }
                if (R0(view4, iY2, iY, (Y50) view4.getLayoutParams())) {
                    view4.measure(iY2, iY);
                }
            }
        }
        c2258nK.a = i9;
        if (this.p != 1) {
            if (c2355oK.f == -1) {
                int i15 = c2355oK.b;
                iK = i15 - i9;
                iD = i15;
            } else {
                int i16 = c2355oK.b;
                iD = i16 + i9;
                iK = i16;
            }
            iM = 0;
            iD2 = 0;
        } else if (c2355oK.f == -1) {
            iD2 = c2355oK.b;
            iM = iD2 - i9;
            iK = 0;
            iD = 0;
        } else {
            int i17 = c2355oK.b;
            iM = i17;
            iD = 0;
            iD2 = i17 + i9;
            iK = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            C2829tA c2829tA3 = (C2829tA) view5.getLayoutParams();
            if (this.p != 1) {
                iM = M() + this.G[c2829tA3.e];
                iD2 = this.r.d(view5) + iM;
            } else if (o1()) {
                int iK2 = K() + this.G[this.F - c2829tA3.e];
                iD = iK2;
                iK = iK2 - this.r.d(view5);
            } else {
                iK = K() + this.G[c2829tA3.e];
                iD = this.r.d(view5) + iK;
            }
            X50.V(view5, iK, iM, iD, iD2);
            if (c2829tA3.a.l() || c2829tA3.a.o()) {
                c2258nK.c = true;
            }
            c2258nK.d = view5.hasFocusable() | c2258nK.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(C1266d60 c1266d60, C1755i60 c1755i60, C2161mK c2161mK, int i) {
        I1();
        if (c1755i60.b() > 0 && !c1755i60.g) {
            boolean z = i == 1;
            int iE1 = E1(c2161mK.b, c1266d60, c1755i60);
            if (z) {
                while (iE1 > 0) {
                    int i2 = c2161mK.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c2161mK.b = i3;
                    iE1 = E1(i3, c1266d60, c1755i60);
                }
            } else {
                int iB = c1755i60.b() - 1;
                int i4 = c2161mK.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iE2 = E1(i5, c1266d60, c1755i60);
                    if (iE2 <= iE1) {
                        break;
                    }
                    i4 = i5;
                    iE1 = iE2;
                }
                c2161mK.b = i4;
            }
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final Y50 t() {
        return this.p == 0 ? new C2829tA(-2, -1) : new C2829tA(-1, -2);
    }

    @Override // o.X50
    public final Y50 u(Context context, AttributeSet attributeSet) {
        C2829tA c2829tA = new C2829tA(context, attributeSet);
        c2829tA.e = -1;
        c2829tA.f = 0;
        return c2829tA;
    }

    @Override // o.X50
    public final Y50 v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C2829tA c2829tA = new C2829tA((ViewGroup.MarginLayoutParams) layoutParams);
            c2829tA.e = -1;
            c2829tA.f = 0;
            return c2829tA;
        }
        C2829tA c2829tA2 = new C2829tA(layoutParams);
        c2829tA2.e = -1;
        c2829tA2.f = 0;
        return c2829tA2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.w1(false);
    }

    @Override // o.X50
    public final int z(C1266d60 c1266d60, C1755i60 c1755i60) {
        if (this.p == 1) {
            return this.F;
        }
        if (c1755i60.b() < 1) {
            return 0;
        }
        return D1(c1755i60.b() - 1, c1266d60, c1755i60) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C2635rA();
        this.L = new Rect();
        H1(i);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C2635rA();
        this.L = new Rect();
        H1(3);
    }
}
