package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import o.AbstractC0351Cp;
import o.AbstractC1674hK;
import o.AbstractC2144m60;
import o.C0702Qd;
import o.C1266d60;
import o.C1755i60;
import o.C2161mK;
import o.C2258nK;
import o.C2355oK;
import o.C2549qK;
import o.C2645rK;
import o.InterfaceC1657h60;
import o.Pu0;
import o.W50;
import o.X50;
import o.Y50;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends X50 implements InterfaceC1657h60 {
    public final C2161mK A;
    public final C2258nK B;
    public int C;
    public final int[] D;
    public int p;
    public C2355oK q;
    public AbstractC0351Cp r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public C2549qK z;

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C2161mK();
        this.B = new C2258nK();
        this.C = 2;
        this.D = new int[2];
        v1(i);
        c(null);
        if (this.t) {
            this.t = false;
            E0();
        }
    }

    @Override // o.X50
    public int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (this.p == 1) {
            return 0;
        }
        return u1(i, c1266d60, c1755i60);
    }

    @Override // o.X50
    public final void H0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        C2549qK c2549qK = this.z;
        if (c2549qK != null) {
            c2549qK.l = -1;
        }
        E0();
    }

    @Override // o.X50
    public int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (this.p == 0) {
            return 0;
        }
        return u1(i, c1266d60, c1755i60);
    }

    @Override // o.X50
    public final boolean Q0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iX = x();
        for (int i = 0; i < iX; i++) {
            ViewGroup.LayoutParams layoutParams = w(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // o.X50
    public final boolean S() {
        return true;
    }

    @Override // o.X50
    public void S0(int i, RecyclerView recyclerView) {
        C2645rK c2645rK = new C2645rK(recyclerView.getContext());
        c2645rK.a = i;
        T0(c2645rK);
    }

    @Override // o.X50
    public boolean U0() {
        return this.z == null && this.s == this.v;
    }

    public void V0(C1755i60 c1755i60, int[] iArr) {
        int i;
        int iL = c1755i60.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void W0(C1755i60 c1755i60, C2355oK c2355oK, C0702Qd c0702Qd) {
        int i = c2355oK.d;
        if (i < 0 || i >= c1755i60.b()) {
            return;
        }
        c0702Qd.a(i, Math.max(0, c2355oK.g));
    }

    public final int X0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        b1();
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = !this.w;
        return Pu0.e(c1755i60, abstractC0351Cp, e1(z), d1(z), this, this.w);
    }

    public final int Y0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        b1();
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = !this.w;
        return Pu0.f(c1755i60, abstractC0351Cp, e1(z), d1(z), this, this.w, this.u);
    }

    public final int Z0(C1755i60 c1755i60) {
        if (x() == 0) {
            return 0;
        }
        b1();
        AbstractC0351Cp abstractC0351Cp = this.r;
        boolean z = !this.w;
        return Pu0.g(c1755i60, abstractC0351Cp, e1(z), d1(z), this, this.w);
    }

    @Override // o.InterfaceC1657h60
    public final PointF a(int i) {
        if (x() == 0) {
            return null;
        }
        int i2 = (i < X50.N(w(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int a1(int i) {
        if (i == 1) {
            return (this.p != 1 && o1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && o1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void b1() {
        if (this.q == null) {
            C2355oK c2355oK = new C2355oK();
            c2355oK.a = true;
            c2355oK.h = 0;
            c2355oK.i = 0;
            c2355oK.k = null;
            this.q = c2355oK;
        }
    }

    @Override // o.X50
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    @Override // o.X50
    public View c0(View view, int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        int iA1;
        View viewH1;
        t1();
        if (x() == 0 || (iA1 = a1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        b1();
        x1(iA1, (int) (this.r.l() * 0.33333334f), false, c1755i60);
        C2355oK c2355oK = this.q;
        c2355oK.g = Integer.MIN_VALUE;
        c2355oK.a = false;
        c1(c1266d60, c2355oK, c1755i60, true);
        if (iA1 == -1) {
            viewH1 = this.u ? h1(x() - 1, -1) : h1(0, x());
        } else {
            viewH1 = this.u ? h1(0, x()) : h1(x() - 1, -1);
        }
        View viewN1 = iA1 == -1 ? n1() : m1();
        if (!viewN1.hasFocusable()) {
            return viewH1;
        }
        if (viewH1 == null) {
            return null;
        }
        return viewN1;
    }

    public final int c1(C1266d60 c1266d60, C2355oK c2355oK, C1755i60 c1755i60, boolean z) {
        int i;
        int i2 = c2355oK.c;
        int i3 = c2355oK.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2355oK.g = i3 + i2;
            }
            r1(c1266d60, c2355oK);
        }
        int i4 = c2355oK.c + c2355oK.h;
        while (true) {
            if ((!c2355oK.l && i4 <= 0) || (i = c2355oK.d) < 0 || i >= c1755i60.b()) {
                break;
            }
            C2258nK c2258nK = this.B;
            c2258nK.a = 0;
            c2258nK.b = false;
            c2258nK.c = false;
            c2258nK.d = false;
            p1(c1266d60, c1755i60, c2355oK, c2258nK);
            if (!c2258nK.b) {
                int i5 = c2355oK.b;
                int i6 = c2258nK.a;
                c2355oK.b = (c2355oK.f * i6) + i5;
                if (!c2258nK.c || c2355oK.k != null || !c1755i60.g) {
                    c2355oK.c -= i6;
                    i4 -= i6;
                }
                int i7 = c2355oK.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2355oK.g = i8;
                    int i9 = c2355oK.c;
                    if (i9 < 0) {
                        c2355oK.g = i8 + i9;
                    }
                    r1(c1266d60, c2355oK);
                }
                if (z && c2258nK.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2355oK.c;
    }

    @Override // o.X50
    public final void d0(AccessibilityEvent accessibilityEvent) {
        super.d0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(f1());
            accessibilityEvent.setToIndex(g1());
        }
    }

    public final View d1(boolean z) {
        return this.u ? i1(0, x(), z) : i1(x() - 1, -1, z);
    }

    @Override // o.X50
    public final boolean e() {
        return this.p == 0;
    }

    public final View e1(boolean z) {
        return this.u ? i1(x() - 1, -1, z) : i1(0, x(), z);
    }

    @Override // o.X50
    public final boolean f() {
        return this.p == 1;
    }

    public final int f1() {
        View viewI1 = i1(0, x(), false);
        if (viewI1 == null) {
            return -1;
        }
        return X50.N(viewI1);
    }

    public final int g1() {
        View viewI1 = i1(x() - 1, -1, false);
        if (viewI1 == null) {
            return -1;
        }
        return X50.N(viewI1);
    }

    public final View h1(int i, int i2) {
        int i3;
        int i4;
        b1();
        if (i2 <= i && i2 >= i) {
            return w(i);
        }
        if (this.r.e(w(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.d(i, i2, i3, i4) : this.d.d(i, i2, i3, i4);
    }

    @Override // o.X50
    public final void i(int i, int i2, C1755i60 c1755i60, C0702Qd c0702Qd) {
        if (this.p != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        b1();
        x1(i > 0 ? 1 : -1, Math.abs(i), true, c1755i60);
        W0(c1755i60, this.q, c0702Qd);
    }

    public final View i1(int i, int i2, boolean z) {
        b1();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.d(i, i2, i3, 320) : this.d.d(i, i2, i3, 320);
    }

    @Override // o.X50
    public final void j(int i, C0702Qd c0702Qd) {
        boolean z;
        int i2;
        C2549qK c2549qK = this.z;
        if (c2549qK == null || (i2 = c2549qK.l) < 0) {
            t1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c2549qK.n;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            c0702Qd.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View j1(C1266d60 c1266d60, C1755i60 c1755i60, boolean z, boolean z2) {
        int i;
        int iX;
        int i2;
        b1();
        int iX2 = x();
        if (z2) {
            iX = x() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iX2;
            iX = 0;
            i2 = 1;
        }
        int iB = c1755i60.b();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iX != i) {
            View viewW = w(iX);
            int iN = X50.N(viewW);
            int iE = this.r.e(viewW);
            int iB2 = this.r.b(viewW);
            if (iN >= 0 && iN < iB) {
                if (!((Y50) viewW.getLayoutParams()).a.l()) {
                    boolean z3 = iB2 <= iK && iE < iK;
                    boolean z4 = iE >= iG && iB2 > iG;
                    if (!z3 && !z4) {
                        return viewW;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewW;
                        } else if (view == null) {
                            view = viewW;
                        }
                    } else if (z3) {
                        view2 = viewW;
                    } else if (view == null) {
                        view = viewW;
                    }
                } else if (view3 == null) {
                    view3 = viewW;
                }
            }
            iX += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // o.X50
    public final int k(C1755i60 c1755i60) {
        return X0(c1755i60);
    }

    public final int k1(int i, C1266d60 c1266d60, C1755i60 c1755i60, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -u1(-iG2, c1266d60, c1755i60);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.p(iG);
        return iG + i2;
    }

    @Override // o.X50
    public int l(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    public final int l1(int i, C1266d60 c1266d60, C1755i60 c1755i60, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -u1(iK2, c1266d60, c1755i60);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.p(-iK);
        return i2 - iK;
    }

    @Override // o.X50
    public int m(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    public final View m1() {
        return w(this.u ? 0 : x() - 1);
    }

    @Override // o.X50
    public final int n(C1755i60 c1755i60) {
        return X0(c1755i60);
    }

    public final View n1() {
        return w(this.u ? x() - 1 : 0);
    }

    @Override // o.X50
    public int o(C1755i60 c1755i60) {
        return Y0(c1755i60);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:118:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0207  */
    /* JADX WARN: Code duplicated, block: B:122:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x0217  */
    /* JADX WARN: Code duplicated, block: B:131:0x021b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:134:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    @Override // o.X50
    public void o0(C1266d60 c1266d60, C1755i60 c1755i60) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewJ1;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z3;
        boolean z4;
        Y50 y50;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iK1;
        int i6;
        View viewS;
        int iE2;
        int iG2;
        int i7;
        int i8 = -1;
        if (!(this.z == null && this.x == -1) && c1755i60.b() == 0) {
            x0(c1266d60);
            return;
        }
        C2549qK c2549qK = this.z;
        if (c2549qK != null && (i7 = c2549qK.l) >= 0) {
            this.x = i7;
        }
        b1();
        this.q.a = false;
        t1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.L(focusedChild)) {
            focusedChild = null;
        }
        C2161mK c2161mK = this.A;
        if (!c2161mK.d || this.x != -1 || this.z != null) {
            c2161mK.f();
            c2161mK.c = this.u ^ this.v;
            if (c1755i60.g || (i = this.x) == -1) {
                if (x() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.L(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        y50 = (Y50) focusedChild2.getLayoutParams();
                        if (!y50.a.l() || y50.a.e() < 0 || y50.a.e() >= c1755i60.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewJ1 = j1(c1266d60, c1755i60, c2161mK.c, z2)) == null) {
                                c2161mK.b();
                                if (this.v) {
                                    iB = c1755i60.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c2161mK.b = iB;
                            } else {
                                c2161mK.c(viewJ1, X50.N(viewJ1));
                                if (!c1755i60.g && U0()) {
                                    iE = this.r.e(viewJ1);
                                    iB2 = this.r.b(viewJ1);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 || z4) {
                                        if (c2161mK.c) {
                                            iK = iG;
                                        }
                                        c2161mK.e = iK;
                                    }
                                }
                            }
                        } else {
                            c2161mK.d(focusedChild2, X50.N(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            c2161mK.b();
                            if (this.v) {
                                iB = c1755i60.b() - 1;
                            } else {
                                iB = 0;
                            }
                            c2161mK.b = iB;
                        } else {
                            c2161mK.c(viewJ1, X50.N(viewJ1));
                            if (!c1755i60.g) {
                                iE = this.r.e(viewJ1);
                                iB2 = this.r.b(viewJ1);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iE >= iG) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c2161mK.c) {
                                        iK = iG;
                                    }
                                    c2161mK.e = iK;
                                } else {
                                    if (c2161mK.c) {
                                        iK = iG;
                                    }
                                    c2161mK.e = iK;
                                }
                            }
                        }
                    }
                } else {
                    c2161mK.b();
                    if (this.v) {
                        iB = c1755i60.b() - 1;
                    } else {
                        iB = 0;
                    }
                    c2161mK.b = iB;
                }
            } else if (i < 0 || i >= c1755i60.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (x() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        y50 = (Y50) focusedChild2.getLayoutParams();
                        if (y50.a.l()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                c2161mK.b();
                                if (this.v) {
                                    iB = c1755i60.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c2161mK.b = iB;
                            } else {
                                c2161mK.c(viewJ1, X50.N(viewJ1));
                                if (!c1755i60.g) {
                                    iE = this.r.e(viewJ1);
                                    iB2 = this.r.b(viewJ1);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iE >= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c2161mK.c) {
                                            iK = iG;
                                        }
                                        c2161mK.e = iK;
                                    } else {
                                        if (c2161mK.c) {
                                            iK = iG;
                                        }
                                        c2161mK.e = iK;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                c2161mK.b();
                                if (this.v) {
                                    iB = c1755i60.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c2161mK.b = iB;
                            } else {
                                c2161mK.c(viewJ1, X50.N(viewJ1));
                                if (!c1755i60.g) {
                                    iE = this.r.e(viewJ1);
                                    iB2 = this.r.b(viewJ1);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iE >= iG) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c2161mK.c) {
                                            iK = iG;
                                        }
                                        c2161mK.e = iK;
                                    } else {
                                        if (c2161mK.c) {
                                            iK = iG;
                                        }
                                        c2161mK.e = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            c2161mK.b();
                            if (this.v) {
                                iB = c1755i60.b() - 1;
                            } else {
                                iB = 0;
                            }
                            c2161mK.b = iB;
                        } else {
                            c2161mK.c(viewJ1, X50.N(viewJ1));
                            if (!c1755i60.g) {
                                iE = this.r.e(viewJ1);
                                iB2 = this.r.b(viewJ1);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iE >= iG) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c2161mK.c) {
                                        iK = iG;
                                    }
                                    c2161mK.e = iK;
                                } else {
                                    if (c2161mK.c) {
                                        iK = iG;
                                    }
                                    c2161mK.e = iK;
                                }
                            }
                        }
                    }
                } else {
                    c2161mK.b();
                    if (this.v) {
                        iB = c1755i60.b() - 1;
                    } else {
                        iB = 0;
                    }
                    c2161mK.b = iB;
                }
            } else {
                int i9 = this.x;
                c2161mK.b = i9;
                C2549qK c2549qK2 = this.z;
                if (c2549qK2 != null && c2549qK2.l >= 0) {
                    boolean z5 = c2549qK2.n;
                    c2161mK.c = z5;
                    if (z5) {
                        c2161mK.e = this.r.g() - this.z.m;
                    } else {
                        c2161mK.e = this.r.k() + this.z.m;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewS2 = s(i9);
                    if (viewS2 == null) {
                        if (x() > 0) {
                            c2161mK.c = (this.x < X50.N(w(0))) == this.u;
                        }
                        c2161mK.b();
                    } else if (this.r.c(viewS2) > this.r.l()) {
                        c2161mK.b();
                    } else if (this.r.e(viewS2) - this.r.k() < 0) {
                        c2161mK.e = this.r.k();
                        c2161mK.c = false;
                    } else if (this.r.g() - this.r.b(viewS2) < 0) {
                        c2161mK.e = this.r.g();
                        c2161mK.c = true;
                    } else {
                        c2161mK.e = c2161mK.c ? this.r.m() + this.r.b(viewS2) : this.r.e(viewS2);
                    }
                } else {
                    boolean z6 = this.u;
                    c2161mK.c = z6;
                    if (z6) {
                        c2161mK.e = this.r.g() - this.y;
                    } else {
                        c2161mK.e = this.r.k() + this.y;
                    }
                }
            }
            c2161mK.d = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            c2161mK.d(focusedChild, X50.N(focusedChild));
        }
        C2355oK c2355oK = this.q;
        c2355oK.f = c2355oK.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        V0(c1755i60, iArr);
        int iK2 = this.r.k() + Math.max(0, iArr[0]);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (c1755i60.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewS = s(i6)) != null) {
            if (this.u) {
                iG2 = this.r.g() - this.r.b(viewS);
                iE2 = this.y;
            } else {
                iE2 = this.r.e(viewS) - this.r.k();
                iG2 = this.y;
            }
            int i10 = iG2 - iE2;
            if (i10 > 0) {
                iK2 += i10;
            } else {
                iH -= i10;
            }
        }
        if (!c2161mK.c ? !this.u : this.u) {
            i8 = 1;
        }
        q1(c1266d60, c1755i60, c2161mK, i8);
        q(c1266d60);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (c2161mK.c) {
            z1(c2161mK.b, c2161mK.e);
            C2355oK c2355oK2 = this.q;
            c2355oK2.h = iK2;
            c1(c1266d60, c2355oK2, c1755i60, false);
            C2355oK c2355oK3 = this.q;
            i3 = c2355oK3.b;
            int i11 = c2355oK3.d;
            int i12 = c2355oK3.c;
            if (i12 > 0) {
                iH += i12;
            }
            y1(c2161mK.b, c2161mK.e);
            C2355oK c2355oK4 = this.q;
            c2355oK4.h = iH;
            c2355oK4.d += c2355oK4.e;
            c1(c1266d60, c2355oK4, c1755i60, false);
            C2355oK c2355oK5 = this.q;
            i2 = c2355oK5.b;
            int i13 = c2355oK5.c;
            if (i13 > 0) {
                z1(i11, i3);
                C2355oK c2355oK6 = this.q;
                c2355oK6.h = i13;
                c1(c1266d60, c2355oK6, c1755i60, false);
                i3 = this.q.b;
            }
        } else {
            y1(c2161mK.b, c2161mK.e);
            C2355oK c2355oK7 = this.q;
            c2355oK7.h = iH;
            c1(c1266d60, c2355oK7, c1755i60, false);
            C2355oK c2355oK8 = this.q;
            i2 = c2355oK8.b;
            int i14 = c2355oK8.d;
            int i15 = c2355oK8.c;
            if (i15 > 0) {
                iK2 += i15;
            }
            z1(c2161mK.b, c2161mK.e);
            C2355oK c2355oK9 = this.q;
            c2355oK9.h = iK2;
            c2355oK9.d += c2355oK9.e;
            c1(c1266d60, c2355oK9, c1755i60, false);
            C2355oK c2355oK10 = this.q;
            int i16 = c2355oK10.b;
            int i17 = c2355oK10.c;
            if (i17 > 0) {
                y1(i14, i2);
                C2355oK c2355oK11 = this.q;
                c2355oK11.h = i17;
                c1(c1266d60, c2355oK11, c1755i60, false);
                i2 = this.q.b;
            }
            i3 = i16;
        }
        if (x() > 0) {
            if (this.u ^ this.v) {
                int iK3 = k1(i2, c1266d60, c1755i60, true);
                i4 = i3 + iK3;
                i5 = i2 + iK3;
                iK1 = l1(i4, c1266d60, c1755i60, false);
            } else {
                int iL1 = l1(i3, c1266d60, c1755i60, true);
                i4 = i3 + iL1;
                i5 = i2 + iL1;
                iK1 = k1(i5, c1266d60, c1755i60, false);
            }
            i3 = i4 + iK1;
            i2 = i5 + iK1;
        }
        if (c1755i60.k && x() != 0 && !c1755i60.g && U0()) {
            List list2 = c1266d60.d;
            int size = list2.size();
            int iN = X50.N(w(0));
            int iC = 0;
            int iC2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) list2.get(i18);
                if (!abstractC2144m60.l()) {
                    boolean z7 = abstractC2144m60.e() < iN;
                    boolean z8 = this.u;
                    View view = abstractC2144m60.a;
                    if (z7 != z8) {
                        iC += this.r.c(view);
                    } else {
                        iC2 += this.r.c(view);
                    }
                }
            }
            this.q.k = list2;
            if (iC > 0) {
                z1(X50.N(n1()), i3);
                C2355oK c2355oK12 = this.q;
                c2355oK12.h = iC;
                c2355oK12.c = 0;
                c2355oK12.a(null);
                c1(c1266d60, this.q, c1755i60, false);
            }
            if (iC2 > 0) {
                y1(X50.N(m1()), i2);
                C2355oK c2355oK13 = this.q;
                c2355oK13.h = iC2;
                c2355oK13.c = 0;
                list = null;
                c2355oK13.a(null);
                c1(c1266d60, this.q, c1755i60, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (c1755i60.g) {
            c2161mK.f();
        } else {
            AbstractC0351Cp abstractC0351Cp = this.r;
            abstractC0351Cp.a = abstractC0351Cp.l();
        }
        this.s = this.v;
    }

    public final boolean o1() {
        return I() == 1;
    }

    @Override // o.X50
    public int p(C1755i60 c1755i60) {
        return Z0(c1755i60);
    }

    @Override // o.X50
    public void p0(C1755i60 c1755i60) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.f();
    }

    public void p1(C1266d60 c1266d60, C1755i60 c1755i60, C2355oK c2355oK, C2258nK c2258nK) {
        int iK;
        int i;
        int i2;
        int iD;
        View viewB = c2355oK.b(c1266d60);
        if (viewB == null) {
            c2258nK.b = true;
            return;
        }
        Y50 y50 = (Y50) viewB.getLayoutParams();
        if (c2355oK.k == null) {
            if (this.u == (c2355oK.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.u == (c2355oK.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        Y50 y51 = (Y50) viewB.getLayoutParams();
        Rect rectM = this.b.M(viewB);
        int i3 = rectM.left + rectM.right;
        int i4 = rectM.top + rectM.bottom;
        int iY = X50.y(e(), this.n, this.l, L() + K() + ((ViewGroup.MarginLayoutParams) y51).leftMargin + ((ViewGroup.MarginLayoutParams) y51).rightMargin + i3, ((ViewGroup.MarginLayoutParams) y51).width);
        int iY2 = X50.y(f(), this.f613o, this.m, J() + M() + ((ViewGroup.MarginLayoutParams) y51).topMargin + ((ViewGroup.MarginLayoutParams) y51).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) y51).height);
        if (P0(viewB, iY, iY2, y51)) {
            viewB.measure(iY, iY2);
        }
        c2258nK.a = this.r.c(viewB);
        if (this.p == 1) {
            if (o1()) {
                iD = this.n - L();
                iK = iD - this.r.d(viewB);
            } else {
                iK = K();
                iD = this.r.d(viewB) + iK;
            }
            if (c2355oK.f == -1) {
                i = c2355oK.b;
                i2 = i - c2258nK.a;
            } else {
                i2 = c2355oK.b;
                i = c2258nK.a + i2;
            }
        } else {
            int iM = M();
            int iD2 = this.r.d(viewB) + iM;
            if (c2355oK.f == -1) {
                int i5 = c2355oK.b;
                int i6 = i5 - c2258nK.a;
                iD = i5;
                i = iD2;
                iK = i6;
                i2 = iM;
            } else {
                int i7 = c2355oK.b;
                int i8 = c2258nK.a + i7;
                iK = i7;
                i = iD2;
                i2 = iM;
                iD = i8;
            }
        }
        X50.V(viewB, iK, i2, iD, i);
        if (y50.a.l() || y50.a.o()) {
            c2258nK.c = true;
        }
        c2258nK.d = viewB.hasFocusable();
    }

    public final void r1(C1266d60 c1266d60, C2355oK c2355oK) {
        if (!c2355oK.a || c2355oK.l) {
            return;
        }
        int i = c2355oK.g;
        int i2 = c2355oK.i;
        if (c2355oK.f == -1) {
            int iX = x();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iX; i3++) {
                    View viewW = w(i3);
                    if (this.r.e(viewW) < iF || this.r.o(viewW) < iF) {
                        s1(c1266d60, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iX - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewW2 = w(i5);
                if (this.r.e(viewW2) < iF || this.r.o(viewW2) < iF) {
                    s1(c1266d60, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iX2 = x();
        if (!this.u) {
            for (int i7 = 0; i7 < iX2; i7++) {
                View viewW3 = w(i7);
                if (this.r.b(viewW3) > i6 || this.r.n(viewW3) > i6) {
                    s1(c1266d60, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iX2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewW4 = w(i9);
            if (this.r.b(viewW4) > i6 || this.r.n(viewW4) > i6) {
                s1(c1266d60, i8, i9);
                return;
            }
        }
    }

    @Override // o.X50
    public final View s(int i) {
        int iX = x();
        if (iX == 0) {
            return null;
        }
        int iN = i - X50.N(w(0));
        if (iN >= 0 && iN < iX) {
            View viewW = w(iN);
            if (X50.N(viewW) == i) {
                return viewW;
            }
        }
        return super.s(i);
    }

    @Override // o.X50
    public final void s0(Parcelable parcelable) {
        if (parcelable instanceof C2549qK) {
            C2549qK c2549qK = (C2549qK) parcelable;
            this.z = c2549qK;
            if (this.x != -1) {
                c2549qK.l = -1;
            }
            E0();
        }
    }

    public final void s1(C1266d60 c1266d60, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                A0(i, c1266d60);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A0(i3, c1266d60);
            }
        }
    }

    @Override // o.X50
    public Y50 t() {
        return new Y50(-2, -2);
    }

    @Override // o.X50
    public final Parcelable t0() {
        C2549qK c2549qK = this.z;
        if (c2549qK != null) {
            C2549qK c2549qK2 = new C2549qK();
            c2549qK2.l = c2549qK.l;
            c2549qK2.m = c2549qK.m;
            c2549qK2.n = c2549qK.n;
            return c2549qK2;
        }
        C2549qK c2549qK3 = new C2549qK();
        if (x() > 0) {
            b1();
            boolean z = this.s ^ this.u;
            c2549qK3.n = z;
            if (z) {
                View viewM1 = m1();
                c2549qK3.m = this.r.g() - this.r.b(viewM1);
                c2549qK3.l = X50.N(viewM1);
            } else {
                View viewN1 = n1();
                c2549qK3.l = X50.N(viewN1);
                c2549qK3.m = this.r.e(viewN1) - this.r.k();
            }
        } else {
            c2549qK3.l = -1;
        }
        return c2549qK3;
    }

    public final void t1() {
        if (this.p == 1 || !o1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int u1(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        b1();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        x1(i2, iAbs, true, c1755i60);
        C2355oK c2355oK = this.q;
        int iC1 = c1(c1266d60, c2355oK, c1755i60, false) + c2355oK.g;
        if (iC1 < 0) {
            return 0;
        }
        if (iAbs > iC1) {
            i = i2 * iC1;
        }
        this.r.p(-i);
        this.q.j = i;
        return i;
    }

    public final void v1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            AbstractC0351Cp abstractC0351CpA = AbstractC0351Cp.a(this, i);
            this.r = abstractC0351CpA;
            this.A.f = abstractC0351CpA;
            this.p = i;
            E0();
        }
    }

    public void w1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        E0();
    }

    public final void x1(int i, int i2, boolean z, C1755i60 c1755i60) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        V0(c1755i60, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C2355oK c2355oK = this.q;
        int i3 = z2 ? iMax2 : iMax;
        c2355oK.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2355oK.i = iMax;
        if (z2) {
            c2355oK.h = this.r.h() + i3;
            View viewM1 = m1();
            C2355oK c2355oK2 = this.q;
            c2355oK2.e = this.u ? -1 : 1;
            int iN = X50.N(viewM1);
            C2355oK c2355oK3 = this.q;
            c2355oK2.d = iN + c2355oK3.e;
            c2355oK3.b = this.r.b(viewM1);
            iK = this.r.b(viewM1) - this.r.g();
        } else {
            View viewN1 = n1();
            C2355oK c2355oK4 = this.q;
            c2355oK4.h = this.r.k() + c2355oK4.h;
            C2355oK c2355oK5 = this.q;
            c2355oK5.e = this.u ? 1 : -1;
            int iN2 = X50.N(viewN1);
            C2355oK c2355oK6 = this.q;
            c2355oK5.d = iN2 + c2355oK6.e;
            c2355oK6.b = this.r.e(viewN1);
            iK = (-this.r.e(viewN1)) + this.r.k();
        }
        C2355oK c2355oK7 = this.q;
        c2355oK7.c = i2;
        if (z) {
            c2355oK7.c = i2 - iK;
        }
        c2355oK7.g = iK;
    }

    public final void y1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        C2355oK c2355oK = this.q;
        c2355oK.e = this.u ? -1 : 1;
        c2355oK.d = i;
        c2355oK.f = 1;
        c2355oK.b = i2;
        c2355oK.g = Integer.MIN_VALUE;
    }

    public final void z1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        C2355oK c2355oK = this.q;
        c2355oK.d = i;
        c2355oK.e = this.u ? 1 : -1;
        c2355oK.f = -1;
        c2355oK.b = i2;
        c2355oK.g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C2161mK();
        this.B = new C2258nK();
        this.C = 2;
        this.D = new int[2];
        W50 w50O = X50.O(context, attributeSet, i, i2);
        v1(w50O.a);
        boolean z = w50O.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            E0();
        }
        w1(w50O.d);
    }

    @Override // o.X50
    public final void b0(RecyclerView recyclerView) {
    }

    public void q1(C1266d60 c1266d60, C1755i60 c1755i60, C2161mK c2161mK, int i) {
    }
}
