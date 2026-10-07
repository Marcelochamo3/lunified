package o;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.xA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3217xA extends X50 {
    public static final Rect g0 = new Rect();
    public static final int[] h0 = new int[2];
    public C1266d60 A;
    public AbstractC2732sA F;
    public C3023vA G;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int U;
    public AbstractC2442pA W;
    public int a0;
    public int b0;
    public final FV d0;
    public final RunnableC3102w1 e0;
    public final C0334By f0;
    public final AbstractC0976a8 r;
    public int u;
    public C1755i60 v;
    public int w;
    public int x;
    public int[] z;
    public float p = 1.0f;
    public int q = 10;
    public int s = 0;
    public AbstractC0351Cp t = new IW(this, 0);
    public final SparseIntArray y = new SparseIntArray();
    public int B = 221696;
    public ArrayList C = null;
    public int D = -1;
    public int E = 0;
    public int H = 0;
    public int T = 8388659;
    public int V = 1;
    public int X = 0;
    public final C2303no0 Y = new C2303no0(14);
    public final Na0 Z = new Na0(29);
    public final int[] c0 = new int[2];

    public C3217xA(AbstractC0976a8 abstractC0976a8) {
        FV fv = new FV();
        fv.l = 0;
        fv.m = 100;
        this.d0 = fv;
        this.e0 = new RunnableC3102w1(12, this);
        this.f0 = new C0334By(2, this);
        this.r = abstractC0976a8;
        this.J = -1;
        K0(false);
    }

    public static int Y0(View view) {
        C2926uA c2926uA;
        if (view == null || (c2926uA = (C2926uA) view.getLayoutParams()) == null || c2926uA.a.l()) {
            return -1;
        }
        return c2926uA.a.c();
    }

    public static int Z0(View view) {
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        return X50.D(view) + ((ViewGroup.MarginLayoutParams) c2926uA).topMargin + ((ViewGroup.MarginLayoutParams) c2926uA).bottomMargin;
    }

    public static int a1(View view) {
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        return X50.E(view) + ((ViewGroup.MarginLayoutParams) c2926uA).leftMargin + ((ViewGroup.MarginLayoutParams) c2926uA).rightMargin;
    }

    @Override // o.X50
    public final int A(View view) {
        return super.A(view) - ((C2926uA) view.getLayoutParams()).h;
    }

    public final void A1(int i, boolean z) {
        if ((this.D == i || i == -1) && this.E == 0 && this.I == 0) {
            return;
        }
        v1(i, 0, 0, z);
    }

    @Override // o.X50
    public final void B(View view, Rect rect) {
        super.B(view, rect);
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        rect.left += c2926uA.e;
        rect.top += c2926uA.f;
        rect.right -= c2926uA.g;
        rect.bottom -= c2926uA.h;
    }

    public final void B1() {
        int iX = x();
        for (int i = 0; i < iX; i++) {
            C1(w(i));
        }
    }

    @Override // o.X50
    public final int C(View view) {
        return super.C(view) + ((C2926uA) view.getLayoutParams()).e;
    }

    @Override // o.X50
    public final boolean C0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    public final void C1(View view) {
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        c2926uA.getClass();
        Na0 na0 = this.Z;
        C2641rG c2641rG = (C2641rG) na0.n;
        c2926uA.i = AbstractC2738sG.a(view, c2641rG, c2641rG.e);
        C2641rG c2641rG2 = (C2641rG) na0.m;
        c2926uA.j = AbstractC2738sG.a(view, c2641rG2, c2641rG2.e);
    }

    public final void D1() {
        if (x() <= 0) {
            this.w = 0;
        } else {
            this.w = this.W.f - ((C2926uA) w(0).getLayoutParams()).a.e();
        }
    }

    public final void E1() {
        int i = (this.B & (-1025)) | (o1(false) ? 1024 : 0);
        this.B = i;
        if ((i & 1024) != 0) {
            WeakHashMap weakHashMap = It0.a;
            this.r.postOnAnimation(this.e0);
        }
    }

    @Override // o.X50
    public final int F(View view) {
        return super.F(view) - ((C2926uA) view.getLayoutParams()).g;
    }

    public final void F1() {
        int i;
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int top;
        int i6;
        int top2;
        int i7;
        if (this.v.b() == 0) {
            return;
        }
        if ((this.B & 262144) == 0) {
            i3 = this.W.g;
            int iB2 = this.v.b() - 1;
            i = this.W.f;
            i2 = iB2;
            iB = 0;
        } else {
            AbstractC2442pA abstractC2442pA = this.W;
            int i8 = abstractC2442pA.f;
            i = abstractC2442pA.g;
            i2 = 0;
            iB = this.v.b() - 1;
            i3 = i8;
        }
        if (i3 < 0 || i < 0) {
            return;
        }
        boolean z = i3 == i2;
        boolean z2 = i == iB;
        int i9 = Integer.MIN_VALUE;
        int iG = Integer.MAX_VALUE;
        C2303no0 c2303no0 = this.Y;
        if (!z) {
            C1735hw0 c1735hw0 = (C1735hw0) c2303no0.f941o;
            if (c1735hw0.a == Integer.MAX_VALUE && !z2 && c1735hw0.b == Integer.MIN_VALUE) {
                return;
            }
        }
        int[] iArr = h0;
        if (z) {
            iG = this.W.g(true, iArr);
            View viewS = s(iArr[1]);
            if (this.s == 0) {
                C2926uA c2926uA = (C2926uA) viewS.getLayoutParams();
                c2926uA.getClass();
                top2 = viewS.getLeft() + c2926uA.e;
                i7 = c2926uA.i;
            } else {
                C2926uA c2926uA2 = (C2926uA) viewS.getLayoutParams();
                c2926uA2.getClass();
                top2 = viewS.getTop() + c2926uA2.f;
                i7 = c2926uA2.j;
            }
            i4 = top2 + i7;
            ((C2926uA) viewS.getLayoutParams()).getClass();
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (z2) {
            i9 = this.W.i(false, iArr);
            View viewS2 = s(iArr[1]);
            if (this.s == 0) {
                C2926uA c2926uA3 = (C2926uA) viewS2.getLayoutParams();
                c2926uA3.getClass();
                top = viewS2.getLeft() + c2926uA3.e;
                i6 = c2926uA3.i;
            } else {
                C2926uA c2926uA4 = (C2926uA) viewS2.getLayoutParams();
                c2926uA4.getClass();
                top = viewS2.getTop() + c2926uA4.f;
                i6 = c2926uA4.j;
            }
            i5 = top + i6;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        ((C1735hw0) c2303no0.f941o).c(i9, iG, i5, i4);
    }

    @Override // o.X50
    public final int G(View view) {
        return super.G(view) + ((C2926uA) view.getLayoutParams()).f;
    }

    @Override // o.X50
    public final int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        if ((this.B & 512) == 0 || this.W == null) {
            return 0;
        }
        s1(c1266d60, c1755i60);
        this.B = (this.B & (-4)) | 2;
        int iT1 = this.s == 0 ? t1(i) : u1(i);
        k1();
        this.B &= -4;
        return iT1;
    }

    public final void G1() {
        C1735hw0 c1735hw0 = (C1735hw0) this.Y.p;
        int i = c1735hw0.j - this.K;
        int iF1 = f1() + i;
        c1735hw0.c(i, iF1, i, iF1);
    }

    @Override // o.X50
    public final void H0(int i) {
        A1(i, false);
    }

    @Override // o.X50
    public final int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        int i2 = this.B;
        if ((i2 & 512) == 0 || this.W == null) {
            return 0;
        }
        this.B = (i2 & (-4)) | 2;
        s1(c1266d60, c1755i60);
        int iT1 = this.s == 1 ? t1(i) : u1(i);
        k1();
        this.B &= -4;
        return iT1;
    }

    @Override // o.X50
    public final int P(C1266d60 c1266d60, C1755i60 c1755i60) {
        AbstractC2442pA abstractC2442pA;
        if (this.s != 0 || (abstractC2442pA = this.W) == null) {
            return -1;
        }
        return abstractC2442pA.e;
    }

    @Override // o.X50
    public final void S0(int i, RecyclerView recyclerView) {
        A1(i, true);
    }

    @Override // o.X50
    public final void T0(C2645rK c2645rK) {
        AbstractC2732sA abstractC2732sA = this.F;
        if (abstractC2732sA != null) {
            abstractC2732sA.p = true;
        }
        super.T0(c2645rK);
        if (!c2645rK.e || !(c2645rK instanceof AbstractC2732sA)) {
            this.F = null;
            this.G = null;
            return;
        }
        AbstractC2732sA abstractC2732sA2 = (AbstractC2732sA) c2645rK;
        this.F = abstractC2732sA2;
        if (abstractC2732sA2 instanceof C3023vA) {
            this.G = (C3023vA) abstractC2732sA2;
        } else {
            this.G = null;
        }
    }

    public final void V0() {
        this.W.b((this.B & 262144) != 0 ? (-this.b0) - this.x : this.a0 + this.b0 + this.x, false);
    }

    public final void W0() {
        ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i = this.D;
        View viewS = i == -1 ? null : s(i);
        AbstractC0976a8 abstractC0976a8 = this.r;
        if (viewS != null) {
            AbstractC2144m60 abstractC2144m60K = abstractC0976a8.K(viewS);
            int i2 = this.D;
            ArrayList arrayList2 = this.C;
            if (arrayList2 != null) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    ((AbstractC1880jW) this.C.get(size)).a(abstractC0976a8, abstractC2144m60K, i2);
                }
            }
        } else {
            ArrayList arrayList3 = this.C;
            if (arrayList3 != null) {
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC1880jW) this.C.get(size2)).a(abstractC0976a8, null, -1);
                }
            }
        }
        if ((this.B & 3) == 1 || abstractC0976a8.isLayoutRequested()) {
            return;
        }
        int iX = x();
        for (int i3 = 0; i3 < iX; i3++) {
            if (w(i3).isLayoutRequested()) {
                WeakHashMap weakHashMap = It0.a;
                abstractC0976a8.postOnAnimation(this.e0);
                return;
            }
        }
    }

    public final void X0() {
        ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i = this.D;
        View viewS = i == -1 ? null : s(i);
        if (viewS == null) {
            ArrayList arrayList2 = this.C;
            if (arrayList2 == null) {
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((AbstractC1880jW) this.C.get(size)).b(null, -1);
            }
            return;
        }
        AbstractC2144m60 abstractC2144m60K = this.r.K(viewS);
        int i2 = this.D;
        ArrayList arrayList3 = this.C;
        if (arrayList3 == null) {
            return;
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ((AbstractC1880jW) this.C.get(size2)).b(abstractC2144m60K, i2);
        }
    }

    @Override // o.X50
    public final void Y(O50 o50) {
        if (o50 != null) {
            this.W = null;
            this.N = null;
            this.B &= -1025;
            this.D = -1;
            this.H = 0;
            C2841tM c2841tM = (C2841tM) this.d0.n;
            if (c2841tM != null) {
                c2841tM.n(-1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    @Override // o.X50
    public final boolean Z(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        int i3;
        View viewW;
        AbstractC0976a8 abstractC0976a8;
        View viewR;
        if ((this.B & 32768) != 0) {
            return true;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            if (this.X != 0) {
                C1735hw0 c1735hw0 = (C1735hw0) this.Y.f941o;
                int i4 = c1735hw0.j;
                int i5 = ((c1735hw0.i - i4) - c1735hw0.k) + i4;
                int iX = x();
                for (int i6 = 0; i6 < iX; i6++) {
                    View viewW2 = w(i6);
                    if (viewW2.getVisibility() == 0 && this.t.e(viewW2) >= i4 && this.t.b(viewW2) <= i5) {
                        viewW2.addFocusables(arrayList, i, i2);
                    }
                }
                if (arrayList.size() == size) {
                    int iX2 = x();
                    for (int i7 = 0; i7 < iX2; i7++) {
                        View viewW3 = w(i7);
                        if (viewW3.getVisibility() == 0) {
                            viewW3.addFocusables(arrayList, i, i2);
                        }
                    }
                }
            } else {
                View viewS = s(this.D);
                if (viewS != null) {
                    viewS.addFocusables(arrayList, i, i2);
                }
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList.add(recyclerView);
            }
        } else {
            if (this.G != null) {
                return true;
            }
            int iB1 = b1(i);
            View viewFindFocus = recyclerView.findFocus();
            if (viewFindFocus == null || (abstractC0976a8 = this.r) == null || viewFindFocus == abstractC0976a8 || (viewR = r(viewFindFocus)) == null) {
                i3 = -1;
                break;
            }
            int iX3 = x();
            i3 = 0;
            while (true) {
                if (i3 >= iX3) {
                    i3 = -1;
                    break;
                }
                if (w(i3) == viewR) {
                    break;
                }
                i3++;
            }
            int iY0 = Y0(w(i3));
            View viewS2 = iY0 == -1 ? null : s(iY0);
            if (viewS2 != null) {
                viewS2.addFocusables(arrayList, i, i2);
            }
            if (this.W == null || x() == 0) {
                return true;
            }
            if ((iB1 == 3 || iB1 == 2) && this.W.e <= 1) {
                return true;
            }
            AbstractC2442pA abstractC2442pA = this.W;
            int i8 = (abstractC2442pA == null || viewS2 == null) ? -1 : abstractC2442pA.k(iY0).l;
            int size2 = arrayList.size();
            int i9 = (iB1 == 1 || iB1 == 3) ? 1 : -1;
            int iX4 = i9 > 0 ? x() - 1 : 0;
            int iX5 = i3 == -1 ? i9 > 0 ? 0 : x() - 1 : i3 + i9;
            while (true) {
                if (i9 <= 0) {
                    if (iX5 < iX4) {
                        break;
                    }
                    viewW = w(iX5);
                    if (viewW.getVisibility() != 0) {
                    }
                    iX5 += i9;
                } else {
                    if (iX5 > iX4) {
                        break;
                    }
                    viewW = w(iX5);
                    if (viewW.getVisibility() != 0 && viewW.hasFocusable()) {
                        if (viewS2 == null) {
                            viewW.addFocusables(arrayList, i, i2);
                            if (arrayList.size() > size2) {
                                break;
                            }
                        } else {
                            int iY1 = Y0(w(iX5));
                            C2102ll c2102llK = this.W.k(iY1);
                            if (c2102llK != null) {
                                int i10 = c2102llK.l;
                                if (iB1 == 1) {
                                    if (i10 == i8 && iY1 > iY0) {
                                        viewW.addFocusables(arrayList, i, i2);
                                        if (arrayList.size() > size2) {
                                            break;
                                        }
                                    }
                                } else if (iB1 == 0) {
                                    if (i10 == i8 && iY1 < iY0) {
                                        viewW.addFocusables(arrayList, i, i2);
                                        if (arrayList.size() > size2) {
                                            break;
                                        }
                                    }
                                } else if (iB1 == 3) {
                                    if (i10 != i8) {
                                        if (i10 < i8) {
                                            break;
                                        }
                                        viewW.addFocusables(arrayList, i, i2);
                                    }
                                } else if (iB1 == 2 && i10 != i8) {
                                    if (i10 > i8) {
                                        break;
                                    }
                                    viewW.addFocusables(arrayList, i, i2);
                                }
                            }
                        }
                    }
                    iX5 += i9;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public final int b1(int i) {
        int i2 = this.s;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i != 17) {
                    if (i == 33) {
                        return 0;
                    }
                    if (i != 66) {
                        if (i == 130) {
                            return 1;
                        }
                    } else if ((this.B & 524288) == 0) {
                        i3 = 3;
                    }
                } else if ((this.B & 524288) != 0) {
                    i3 = 3;
                }
            }
            return 17;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        i3 = 17;
                    } else {
                        i3 = 3;
                    }
                } else if ((this.B & 262144) == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
        } else if ((this.B & 262144) == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        return i3;
    }

    public final int c1(int i) {
        int i2 = this.M;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.N;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    public final int d1(int i) {
        int iC1 = 0;
        if ((this.B & 524288) != 0) {
            for (int i2 = this.U - 1; i2 > i; i2--) {
                iC1 += c1(i2) + this.S;
            }
            return iC1;
        }
        int iC2 = 0;
        while (iC1 < i) {
            iC2 += c1(iC1) + this.S;
            iC1++;
        }
        return iC2;
    }

    @Override // o.X50
    public final boolean e() {
        return this.s == 0 || this.U > 1;
    }

    @Override // o.X50
    public final void e0(C1266d60 c1266d60, C1755i60 c1755i60, N0 n0) {
        s1(c1266d60, c1755i60);
        int iB = c1755i60.b();
        int i = this.B;
        boolean z = (262144 & i) != 0;
        if ((i & C1672hI.a.g) == 0 || (iB > 1 && !i1(0))) {
            if (Build.VERSION.SDK_INT < 23) {
                n0.a(C1672hI.a.e);
            } else if (this.s == 0) {
                n0.b(z ? F0.n : F0.l);
            } else {
                n0.b(F0.k);
            }
            n0.m(true);
        }
        if ((this.B & C1672hI.a.f) == 0 || (iB > 1 && !i1(iB - 1))) {
            if (Build.VERSION.SDK_INT < 23) {
                n0.a(C1672hI.a.f);
            } else if (this.s == 0) {
                n0.b(z ? F0.l : F0.n);
            } else {
                n0.b(F0.m);
            }
            n0.m(true);
        }
        n0.j(L0.d(P(c1266d60, c1755i60), z(c1266d60, c1755i60), 0));
        k1();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    public final boolean e1(View view, View view2, int[] iArr) {
        View viewS;
        int i;
        int iB;
        int left;
        int i2;
        int iB2;
        int top;
        int i3;
        int left2;
        int i4;
        int i5 = this.X;
        C2303no0 c2303no0 = this.Y;
        if (i5 != 1 && i5 != 2) {
            C1735hw0 c1735hw0 = (C1735hw0) c2303no0.f941o;
            if (this.s == 0) {
                C2926uA c2926uA = (C2926uA) view.getLayoutParams();
                c2926uA.getClass();
                top = view.getLeft() + c2926uA.e;
                i3 = c2926uA.i;
            } else {
                C2926uA c2926uA2 = (C2926uA) view.getLayoutParams();
                c2926uA2.getClass();
                top = view.getTop() + c2926uA2.f;
                i3 = c2926uA2.j;
            }
            int iB3 = c1735hw0.b(top + i3);
            if (view2 != null) {
                ((C2926uA) view.getLayoutParams()).getClass();
            }
            if (this.s == 0) {
                C2926uA c2926uA3 = (C2926uA) view.getLayoutParams();
                c2926uA3.getClass();
                left2 = view.getTop() + c2926uA3.f;
                i4 = c2926uA3.j;
            } else {
                C2926uA c2926uA4 = (C2926uA) view.getLayoutParams();
                c2926uA4.getClass();
                left2 = view.getLeft() + c2926uA4.e;
                i4 = c2926uA4.i;
            }
            int iB4 = ((C1735hw0) c2303no0.p).b(left2 + i4);
            int i6 = iB3 + this.I;
            if (i6 == 0 && iB4 == 0) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            iArr[0] = i6;
            iArr[1] = iB4;
            return true;
        }
        int iY0 = Y0(view);
        int iE = this.t.e(view);
        int iB5 = this.t.b(view);
        C1735hw0 c1735hw1 = (C1735hw0) c2303no0.f941o;
        int i7 = c1735hw1.j;
        int i8 = (c1735hw1.i - i7) - c1735hw1.k;
        C2102ll c2102llK = this.W.k(iY0);
        int i9 = c2102llK == null ? -1 : c2102llK.l;
        View viewS2 = null;
        if (iE < i7) {
            if (this.X == 2) {
                View view3 = view;
                while (true) {
                    AbstractC2442pA abstractC2442pA = this.W;
                    if (!abstractC2442pA.m(abstractC2442pA.c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true)) {
                        viewS = null;
                        viewS2 = view3;
                        break;
                    }
                    AbstractC2442pA abstractC2442pA2 = this.W;
                    FV fv = abstractC2442pA2.j(abstractC2442pA2.f, iY0)[i9];
                    View viewS3 = s(fv.f(0));
                    if (iB5 - this.t.e(viewS3) > i8) {
                        if ((fv.l & fv.m) <= 2) {
                            viewS = null;
                            viewS2 = viewS3;
                            break;
                        }
                        viewS = null;
                        viewS2 = s(fv.f(2));
                        break;
                    }
                    view3 = viewS3;
                }
            } else {
                viewS = null;
                viewS2 = view;
            }
        } else if (iB5 <= i8 + i7) {
            viewS = null;
        } else if (this.X == 2) {
            do {
                AbstractC2442pA abstractC2442pA3 = this.W;
                FV fv2 = abstractC2442pA3.j(iY0, abstractC2442pA3.g)[i9];
                viewS = s(fv2.f((fv2.l & fv2.m) - 1));
                if (this.t.b(viewS) - iE > i8) {
                    viewS = null;
                    break;
                }
            } while (this.W.a());
            if (viewS == null) {
                viewS2 = view;
            }
        } else {
            viewS = view;
        }
        if (viewS2 == null) {
            if (viewS != null) {
                iB = this.t.b(viewS);
                i7 += i8;
            } else {
                i = 0;
            }
            if (viewS2 != null) {
                view = viewS2;
            } else if (viewS != null) {
                view = viewS;
            }
            if (this.s == 0) {
                C2926uA c2926uA5 = (C2926uA) view.getLayoutParams();
                c2926uA5.getClass();
                left = view.getTop() + c2926uA5.f;
                i2 = c2926uA5.j;
            } else {
                C2926uA c2926uA6 = (C2926uA) view.getLayoutParams();
                c2926uA6.getClass();
                left = view.getLeft() + c2926uA6.e;
                i2 = c2926uA6.i;
            }
            iB2 = ((C1735hw0) c2303no0.p).b(left + i2);
            if (i != 0 && iB2 == 0) {
                return false;
            }
            iArr[0] = i;
            iArr[1] = iB2;
            return true;
        }
        iB = this.t.e(viewS2);
        i = iB - i7;
        if (viewS2 != null) {
            view = viewS2;
        } else if (viewS != null) {
            view = viewS;
        }
        if (this.s == 0) {
            C2926uA c2926uA7 = (C2926uA) view.getLayoutParams();
            c2926uA7.getClass();
            left = view.getTop() + c2926uA7.f;
            i2 = c2926uA7.j;
        } else {
            C2926uA c2926uA8 = (C2926uA) view.getLayoutParams();
            c2926uA8.getClass();
            left = view.getLeft() + c2926uA8.e;
            i2 = c2926uA8.i;
        }
        iB2 = ((C1735hw0) c2303no0.p).b(left + i2);
        if (i != 0) {
        }
        iArr[0] = i;
        iArr[1] = iB2;
        return true;
    }

    @Override // o.X50
    public final boolean f() {
        return this.s == 1 || this.U > 1;
    }

    public final int f1() {
        int i = (this.B & 524288) != 0 ? 0 : this.U - 1;
        return c1(i) + d1(i);
    }

    @Override // o.X50
    public final void g0(C1266d60 c1266d60, C1755i60 c1755i60, View view, N0 n0) {
        C2102ll c2102llK;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.W == null || !(layoutParams instanceof C2926uA)) {
            return;
        }
        int iC = ((C2926uA) layoutParams).a.c();
        int i = -1;
        if (iC >= 0 && (c2102llK = this.W.k(iC)) != null) {
            i = c2102llK.l;
        }
        if (i < 0) {
            return;
        }
        int i2 = iC / this.W.e;
        if (this.s == 0) {
            n0.k(M0.a(false, i, 1, i2, 1));
        } else {
            n0.k(M0.a(false, i2, 1, i, 1));
        }
    }

    public final boolean g1() {
        return H() == 0 || this.r.G(0) != null;
    }

    @Override // o.X50
    public final View h0(View view, int i) {
        View viewFindNextFocus;
        View viewFindNextFocus2;
        if ((this.B & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        AbstractC0976a8 abstractC0976a8 = this.r;
        if (i == 2 || i == 1) {
            if (f()) {
                viewFindNextFocus = focusFinder.findNextFocus(abstractC0976a8, view, i == 2 ? Yu0.b.m0 : 33);
            } else {
                viewFindNextFocus = null;
            }
            if (e()) {
                viewFindNextFocus2 = focusFinder.findNextFocus(abstractC0976a8, view, (I() == 1) ^ (i == 2) ? 66 : 17);
            } else {
                viewFindNextFocus2 = viewFindNextFocus;
            }
        } else {
            viewFindNextFocus2 = focusFinder.findNextFocus(abstractC0976a8, view, i);
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        if (abstractC0976a8.getDescendantFocusability() == 393216) {
            return abstractC0976a8.getParent().focusSearch(view, i);
        }
        int iB1 = b1(i);
        boolean z = abstractC0976a8.getScrollState() != 0;
        if (iB1 == 1) {
            if (z || (this.B & C1672hI.a.f) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.B & 131072) != 0 && !h1()) {
                n1(true);
                viewFindNextFocus2 = view;
            }
        } else if (iB1 == 0) {
            if (z || (this.B & C1672hI.a.g) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.B & 131072) != 0 && !g1()) {
                n1(false);
                viewFindNextFocus2 = view;
            }
        } else if (iB1 == 3) {
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        View viewFocusSearch = abstractC0976a8.getParent().focusSearch(view, i);
        if (viewFocusSearch != null) {
            return viewFocusSearch;
        }
        return view != null ? view : abstractC0976a8;
    }

    public final boolean h1() {
        int iH = H();
        return iH == 0 || this.r.G(iH - 1) != null;
    }

    @Override // o.X50
    public final void i(int i, int i2, C1755i60 c1755i60, C0702Qd c0702Qd) {
        try {
            s1(null, c1755i60);
            if (this.s != 0) {
                i = i2;
            }
            if (x() != 0 && i != 0) {
                this.W.e(i < 0 ? -this.b0 : this.a0 + this.b0, i, c0702Qd);
            }
        } finally {
            k1();
        }
    }

    @Override // o.X50
    public final void i0(int i, int i2) {
        AbstractC2442pA abstractC2442pA;
        int i3;
        int i4 = this.D;
        if (i4 != -1 && (abstractC2442pA = this.W) != null && abstractC2442pA.f >= 0 && (i3 = this.H) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.H = i3 + i2;
        }
        C2841tM c2841tM = (C2841tM) this.d0.n;
        if (c2841tM != null) {
            c2841tM.n(-1);
        }
    }

    public final boolean i1(int i) {
        AbstractC0976a8 abstractC0976a8 = this.r;
        AbstractC2144m60 abstractC2144m60G = abstractC0976a8.G(i);
        if (abstractC2144m60G == null) {
            return false;
        }
        View view = abstractC2144m60G.a;
        return view.getLeft() >= 0 && view.getRight() <= abstractC0976a8.getWidth() && view.getTop() >= 0 && view.getBottom() <= abstractC0976a8.getHeight();
    }

    @Override // o.X50
    public final void j(int i, C0702Qd c0702Qd) {
        int i2 = this.r.Z0;
        if (i == 0 || i2 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.D - ((i2 - 1) / 2), i - i2));
        for (int i3 = iMax; i3 < i && i3 < iMax + i2; i3++) {
            c0702Qd.a(i3, 0);
        }
    }

    @Override // o.X50
    public final void j0() {
        this.H = 0;
        C2841tM c2841tM = (C2841tM) this.d0.n;
        if (c2841tM != null) {
            c2841tM.n(-1);
        }
    }

    public final void j1(View view, int i, int i2, int i3, int i4) {
        int iC1;
        int i5;
        int iZ0 = this.s == 0 ? Z0(view) : a1(view);
        int i6 = this.M;
        if (i6 > 0) {
            iZ0 = Math.min(iZ0, i6);
        }
        int i7 = this.T;
        int i8 = i7 & 112;
        int absoluteGravity = (this.B & 786432) != 0 ? Gravity.getAbsoluteGravity(i7 & 8388615, 1) : i7 & 7;
        int i9 = this.s;
        if ((i9 != 0 || i8 != 48) && (i9 != 1 || absoluteGravity != 3)) {
            if ((i9 == 0 && i8 == 80) || (i9 == 1 && absoluteGravity == 5)) {
                iC1 = c1(i) - iZ0;
            } else if ((i9 == 0 && i8 == 16) || (i9 == 1 && absoluteGravity == 1)) {
                iC1 = (c1(i) - iZ0) / 2;
            }
            i4 += iC1;
        }
        if (this.s == 0) {
            i5 = iZ0 + i4;
        } else {
            int i10 = iZ0 + i4;
            int i11 = i4;
            i4 = i2;
            i2 = i11;
            i5 = i3;
            i3 = i10;
        }
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        X50.V(view, i2, i4, i3, i5);
        Rect rect = g0;
        super.B(view, rect);
        int i12 = i2 - rect.left;
        int i13 = i4 - rect.top;
        int i14 = rect.right - i3;
        int i15 = rect.bottom - i5;
        c2926uA.e = i12;
        c2926uA.f = i13;
        c2926uA.g = i14;
        c2926uA.h = i15;
        C1(view);
    }

    @Override // o.X50
    public final void k0(int i, int i2) {
        int i3;
        int i4 = this.D;
        if (i4 != -1 && (i3 = this.H) != Integer.MIN_VALUE) {
            int i5 = i4 + i3;
            if (i <= i5 && i5 < i + 1) {
                this.H = (i2 - i) + i3;
            } else if (i < i5 && i2 > i5 - 1) {
                this.H = i3 - 1;
            } else if (i > i5 && i2 < i5) {
                this.H = i3 + 1;
            }
        }
        C2841tM c2841tM = (C2841tM) this.d0.n;
        if (c2841tM != null) {
            c2841tM.n(-1);
        }
    }

    public final void k1() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            this.A = null;
            this.v = null;
            this.w = 0;
            this.x = 0;
        }
    }

    @Override // o.X50
    public final void l0(int i, int i2) {
        AbstractC2442pA abstractC2442pA;
        int i3;
        int i4;
        int i5 = this.D;
        if (i5 != -1 && (abstractC2442pA = this.W) != null && abstractC2442pA.f >= 0 && (i3 = this.H) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.D = (i - i4) + i3 + i5;
                this.H = Integer.MIN_VALUE;
            } else {
                this.H = i3 - i2;
            }
        }
        C2841tM c2841tM = (C2841tM) this.d0.n;
        if (c2841tM != null) {
            c2841tM.n(-1);
        }
    }

    public final void l1(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        Rect rect = g0;
        d(view, rect);
        int i = ((ViewGroup.MarginLayoutParams) c2926uA).leftMargin + ((ViewGroup.MarginLayoutParams) c2926uA).rightMargin + rect.left + rect.right;
        int i2 = ((ViewGroup.MarginLayoutParams) c2926uA).topMargin + ((ViewGroup.MarginLayoutParams) c2926uA).bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.L == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.M, 1073741824);
        if (this.s == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i, ((ViewGroup.MarginLayoutParams) c2926uA).width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, ((ViewGroup.MarginLayoutParams) c2926uA).height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, ((ViewGroup.MarginLayoutParams) c2926uA).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i, ((ViewGroup.MarginLayoutParams) c2926uA).width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // o.X50
    public final void m0(int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            FV fv = this.d0;
            C2841tM c2841tM = (C2841tM) fv.n;
            if (c2841tM != null && c2841tM.m() != 0) {
                ((C2841tM) fv.n).l(Integer.toString(i));
            }
            i++;
        }
    }

    public final void m1() {
        this.W.m((this.B & 262144) != 0 ? this.a0 + this.b0 + this.x : (-this.b0) - this.x, false);
    }

    public final void n1(boolean z) {
        if (z) {
            if (h1()) {
                return;
            }
        } else if (g1()) {
            return;
        }
        C3023vA c3023vA = this.G;
        if (c3023vA == null) {
            C3023vA c3023vA2 = new C3023vA(this, z ? 1 : -1, this.U > 1);
            this.H = 0;
            T0(c3023vA2);
            return;
        }
        C3217xA c3217xA = c3023vA.t;
        if (z) {
            int i = c3023vA.s;
            if (i < c3217xA.q) {
                c3023vA.s = i + 1;
                return;
            }
            return;
        }
        int i2 = c3023vA.s;
        if (i2 > (-c3217xA.q)) {
            c3023vA.s = i2 - 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x035d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0362  */
    /* JADX WARN: Code duplicated, block: B:162:0x0368  */
    /* JADX WARN: Code duplicated, block: B:164:0x037b  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:326:0x066a A[PHI: r0 r1
  0x066a: PHI (r0v43 int) = (r0v39 int), (r0v46 int) binds: [B:325:0x0668, B:313:0x0639] A[DONT_GENERATE, DONT_INLINE]
  0x066a: PHI (r1v47 int) = (r1v42 int), (r1v51 int) binds: [B:325:0x0668, B:313:0x0639] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:162:0x0368, please report this as an issue */
    @Override // o.X50
    public final void o0(C1266d60 c1266d60, C1755i60 c1755i60) {
        int i;
        int i2;
        int i3;
        AbstractC0976a8 abstractC0976a8;
        SparseIntArray sparseIntArray;
        View view;
        int i4;
        int i5;
        int i6;
        int i7;
        AbstractC2442pA xd0;
        boolean z;
        int i8;
        AbstractC0976a8 abstractC0976a9;
        AbstractC2442pA abstractC2442pA;
        int i9;
        int left;
        int right;
        int i10;
        List list;
        int size;
        SparseIntArray sparseIntArray2;
        AbstractC2442pA abstractC2442pA2;
        int i11;
        int i12;
        C2102ll c2102llK;
        int i13;
        C2102ll c2102llK2;
        if (this.U != 0 && c1755i60.b() >= 0) {
            if ((this.B & 64) != 0 && x() > 0) {
                this.B |= 128;
                return;
            }
            int i14 = this.B;
            if ((i14 & 512) == 0) {
                this.W = null;
                this.N = null;
                this.B = i14 & (-1025);
                x0(c1266d60);
                return;
            }
            this.B = (i14 & (-4)) | 1;
            s1(c1266d60, c1755i60);
            boolean z2 = c1755i60.g;
            AbstractC0976a8 abstractC0976a10 = this.r;
            int iMax = Integer.MIN_VALUE;
            if (z2) {
                D1();
                int iX = x();
                if (this.W != null && iX > 0) {
                    int i15 = abstractC0976a10.K(w(0)).d;
                    int i16 = abstractC0976a10.K(w(iX - 1)).d;
                    int iMin = Integer.MAX_VALUE;
                    for (int i17 = 0; i17 < iX; i17++) {
                        View viewW = w(i17);
                        C2926uA c2926uA = (C2926uA) viewW.getLayoutParams();
                        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(viewW);
                        int iC = abstractC2144m60L != null ? abstractC2144m60L.c() : -1;
                        if (c2926uA.a.o() || c2926uA.a.l() || viewW.isLayoutRequested() || ((!viewW.hasFocus() && this.D == c2926uA.a.c()) || ((viewW.hasFocus() && this.D != c2926uA.a.c()) || iC < i15 || iC > i16))) {
                            iMin = Math.min(iMin, this.t.e(viewW));
                            iMax = Math.max(iMax, this.t.b(viewW));
                        }
                    }
                    if (iMax > iMin) {
                        this.x = iMax - iMin;
                    }
                    V0();
                    m1();
                }
                this.B &= -4;
                k1();
                return;
            }
            boolean z3 = c1755i60.k;
            SparseIntArray sparseIntArray3 = this.y;
            if (z3) {
                sparseIntArray3.clear();
                int iX2 = x();
                for (int i18 = 0; i18 < iX2; i18++) {
                    int i19 = abstractC0976a10.K(w(i18)).d;
                    if (i19 >= 0 && (c2102llK2 = this.W.k(i19)) != null) {
                        sparseIntArray3.put(i19, c2102llK2.l);
                    }
                }
            }
            boolean z4 = !U() && this.X == 0;
            int i20 = this.D;
            if (i20 != -1 && (i13 = this.H) != Integer.MIN_VALUE) {
                this.D = i20 + i13;
                this.E = 0;
            }
            this.H = 0;
            View viewS = s(this.D);
            int i21 = this.D;
            int i22 = this.E;
            boolean zHasFocus = abstractC0976a10.hasFocus();
            AbstractC2442pA abstractC2442pA3 = this.W;
            int i23 = abstractC2442pA3 != null ? abstractC2442pA3.f : -1;
            int i24 = abstractC2442pA3 != null ? abstractC2442pA3.g : -1;
            if (this.s == 0) {
                i2 = c1755i60.f825o;
                i = c1755i60.p;
            } else {
                i = c1755i60.f825o;
                i2 = c1755i60.p;
            }
            int i25 = i2;
            int i26 = i;
            int i27 = i25;
            int iB = this.v.b();
            if (iB == 0) {
                this.D = -1;
                this.E = 0;
            } else {
                int i28 = this.D;
                if (i28 >= iB) {
                    this.D = iB - 1;
                    this.E = 0;
                } else if (i28 == -1 && iB > 0) {
                    this.D = 0;
                    this.E = 0;
                }
            }
            boolean z5 = this.v.f;
            C2303no0 c2303no0 = this.Y;
            if (z5 || (abstractC2442pA2 = this.W) == null || abstractC2442pA2.f < 0 || (this.B & 256) != 0 || abstractC2442pA2.e != this.U) {
                i3 = i26;
                abstractC0976a8 = abstractC0976a10;
                sparseIntArray = sparseIntArray3;
                view = viewS;
                i4 = i21;
                i5 = i22;
                i6 = i27;
                int i29 = this.B;
                this.B = i29 & (-257);
                AbstractC2442pA abstractC2442pA4 = this.W;
                if (abstractC2442pA4 == null || this.U != abstractC2442pA4.e) {
                    i7 = this.U;
                    if (i7 == 1) {
                        xd0 = new Xd0();
                    } else {
                        C1117bg0 c1117bg0 = new C1117bg0();
                        C0702Qd c0702Qd = new C0702Qd();
                        int iHighestOneBit = Integer.bitCount(64) != 1 ? Integer.highestOneBit(63) << 1 : 64;
                        c0702Qd.c = iHighestOneBit - 1;
                        c0702Qd.d = new Object[iHighestOneBit];
                        c1117bg0.j = c0702Qd;
                        c1117bg0.k = -1;
                        c1117bg0.n(i7);
                        xd0 = c1117bg0;
                    }
                    this.W = xd0;
                    xd0.b = this.f0;
                    if ((this.B & 262144) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xd0.c = z;
                } else if (((i29 & 262144) != 0) != abstractC2442pA4.c) {
                    i7 = this.U;
                    if (i7 == 1) {
                        xd0 = new Xd0();
                    } else {
                        C1117bg0 c1117bg1 = new C1117bg0();
                        C0702Qd c0702Qd2 = new C0702Qd();
                        if (Integer.bitCount(64) != 1) {
                        }
                        c0702Qd2.c = iHighestOneBit - 1;
                        c0702Qd2.d = new Object[iHighestOneBit];
                        c1117bg1.j = c0702Qd2;
                        c1117bg1.k = -1;
                        c1117bg1.n(i7);
                        xd0 = c1117bg1;
                    }
                    this.W = xd0;
                    xd0.b = this.f0;
                    if ((this.B & 262144) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xd0.c = z;
                }
                C1735hw0 c1735hw0 = (C1735hw0) c2303no0.f941o;
                c1735hw0.b = Integer.MIN_VALUE;
                c1735hw0.a = Integer.MAX_VALUE;
                int i30 = this.n;
                C1735hw0 c1735hw1 = (C1735hw0) c2303no0.n;
                c1735hw1.i = i30;
                int i31 = this.f613o;
                C1735hw0 c1735hw2 = (C1735hw0) c2303no0.m;
                c1735hw2.i = i31;
                int iK = K();
                int iL = L();
                c1735hw1.j = iK;
                c1735hw1.k = iL;
                int iM = M();
                int iJ = J();
                c1735hw2.j = iM;
                c1735hw2.k = iJ;
                this.a0 = ((C1735hw0) c2303no0.f941o).i;
                this.K = 0;
                G1();
                this.W.d = this.R;
                q(this.A);
                AbstractC2442pA abstractC2442pA5 = this.W;
                abstractC2442pA5.g = -1;
                abstractC2442pA5.f = -1;
                C1735hw0 c1735hw3 = (C1735hw0) c2303no0.f941o;
                c1735hw3.b = Integer.MIN_VALUE;
                c1735hw3.d = Integer.MIN_VALUE;
                c1735hw3.a = Integer.MAX_VALUE;
                c1735hw3.c = Integer.MAX_VALUE;
                int i32 = this.B;
                this.B = i32 & (-5);
                this.B = (i32 & (-21)) | (z4 ? 16 : 0);
                if (z4 && (i23 < 0 || (i8 = this.D) > i24 || i8 < i23)) {
                    i23 = this.D;
                    i24 = i23;
                }
                abstractC2442pA5.i = i23;
                if (i24 != -1) {
                    while (this.W.a() && s(i24) == null) {
                    }
                }
            } else {
                C1735hw0 c1735hw4 = (C1735hw0) c2303no0.n;
                c1735hw4.i = this.n;
                int i33 = this.f613o;
                C1735hw0 c1735hw5 = (C1735hw0) c2303no0.m;
                c1735hw5.i = i33;
                int iK2 = K();
                int iL2 = L();
                c1735hw4.j = iK2;
                c1735hw4.k = iL2;
                int iM2 = M();
                int iJ2 = J();
                c1735hw5.j = iM2;
                c1735hw5.k = iJ2;
                this.a0 = ((C1735hw0) c2303no0.f941o).i;
                G1();
                AbstractC2442pA abstractC2442pA6 = this.W;
                abstractC2442pA6.d = this.R;
                this.B |= 4;
                abstractC2442pA6.i = this.D;
                int iX3 = x();
                int i34 = this.W.f;
                this.B &= -9;
                int i35 = i34;
                int i36 = 0;
                while (true) {
                    if (i36 < iX3) {
                        View viewW2 = w(i36);
                        if (i35 == Y0(viewW2) && (c2102llK = this.W.k(i35)) != null) {
                            int i37 = i27;
                            int i38 = i26;
                            int iD1 = (d1(c2102llK.l) + ((C1735hw0) c2303no0.p).j) - this.K;
                            int iE = this.t.e(viewW2);
                            Rect rect = g0;
                            B(viewW2, rect);
                            C2303no0 c2303no1 = c2303no0;
                            int iWidth = this.s == 0 ? rect.width() : rect.height();
                            if ((((C2926uA) viewW2.getLayoutParams()).a.j & 2) != 0) {
                                this.B |= 8;
                                F0(this.A, this.a.J(viewW2), viewW2);
                                viewW2 = this.A.d(i35);
                                C2926uA c2926uA2 = (C2926uA) viewW2.getLayoutParams();
                                abstractC0976a10.K(viewW2);
                                c2926uA2.getClass();
                                b(viewW2, i36, false);
                            }
                            View view2 = viewW2;
                            l1(view2);
                            int iA1 = this.s == 0 ? a1(view2) : Z0(view2);
                            int i39 = iE + iA1;
                            int i40 = iA1;
                            int i41 = c2102llK.l;
                            view = viewS;
                            i11 = i36;
                            i5 = i22;
                            i6 = i37;
                            i3 = i38;
                            sparseIntArray = sparseIntArray3;
                            i4 = i21;
                            abstractC0976a8 = abstractC0976a10;
                            i12 = i35;
                            j1(view2, i41, iE, i39, iD1);
                            if (iWidth == i40) {
                                i36 = i11 + 1;
                                i35 = i12 + 1;
                                i26 = i3;
                                c2303no0 = c2303no1;
                                i27 = i6;
                                i21 = i4;
                                sparseIntArray3 = sparseIntArray;
                                abstractC0976a10 = abstractC0976a8;
                                viewS = view;
                                i22 = i5;
                            }
                        } else {
                            i3 = i26;
                            abstractC0976a8 = abstractC0976a10;
                            sparseIntArray = sparseIntArray3;
                            view = viewS;
                            i4 = i21;
                            i5 = i22;
                            i11 = i36;
                            i6 = i27;
                            i12 = i35;
                        }
                        int i42 = this.W.g;
                        for (int i43 = iX3 - 1; i43 >= i11; i43--) {
                            View viewW3 = w(i43);
                            F0(this.A, this.a.J(viewW3), viewW3);
                        }
                        this.W.l(i12);
                        if ((this.B & 65536) != 0) {
                            V0();
                            int i44 = this.D;
                            if (i44 >= 0 && i44 <= i42) {
                                while (true) {
                                    AbstractC2442pA abstractC2442pA7 = this.W;
                                    if (abstractC2442pA7.g >= this.D) {
                                        break;
                                    } else {
                                        abstractC2442pA7.a();
                                    }
                                }
                            }
                        } else {
                            while (this.W.a() && this.W.g < i42) {
                            }
                        }
                    } else {
                        i3 = i26;
                        abstractC0976a8 = abstractC0976a10;
                        sparseIntArray = sparseIntArray3;
                        view = viewS;
                        i4 = i21;
                        i5 = i22;
                        i6 = i27;
                    }
                    F1();
                    G1();
                }
            }
            while (true) {
                F1();
                AbstractC2442pA abstractC2442pA8 = this.W;
                int i45 = abstractC2442pA8.f;
                int i46 = abstractC2442pA8.g;
                int i47 = -i6;
                int i48 = -i3;
                View viewS2 = s(this.D);
                if (viewS2 != null && z4) {
                    w1(viewS2, viewS2.findFocus(), false, i47, i48);
                }
                if (viewS2 == null || !zHasFocus || viewS2.hasFocus()) {
                    if (!zHasFocus && !abstractC0976a8.hasFocus()) {
                        if (viewS2 == null || !viewS2.hasFocusable()) {
                            abstractC0976a9 = abstractC0976a8;
                            int iX4 = x();
                            for (int i49 = 0; i49 < iX4; i49++) {
                                viewS2 = w(i49);
                                if (viewS2 != null && viewS2.hasFocusable()) {
                                    abstractC0976a9.focusableViewAvailable(viewS2);
                                    break;
                                }
                            }
                        } else {
                            abstractC0976a9 = abstractC0976a8;
                            abstractC0976a9.focusableViewAvailable(viewS2);
                        }
                        View view3 = viewS2;
                        if (z4 && view3 != null && view3.hasFocus()) {
                            w1(view3, view3.findFocus(), false, i47, i48);
                        }
                    }
                    V0();
                    m1();
                    abstractC2442pA = this.W;
                    if (abstractC2442pA.f != i45 && abstractC2442pA.g == i46) {
                        break;
                    } else {
                        abstractC0976a8 = abstractC0976a9;
                    }
                } else {
                    viewS2.requestFocus();
                }
                abstractC0976a9 = abstractC0976a8;
                V0();
                m1();
                abstractC2442pA = this.W;
                if (abstractC2442pA.f != i45) {
                }
                abstractC0976a8 = abstractC0976a9;
            }
            r1();
            q1();
            if (c1755i60.k && (size = (list = this.A.d).size()) != 0) {
                int[] iArr = this.z;
                if (iArr == null || size > iArr.length) {
                    int length = iArr == null ? 16 : iArr.length;
                    while (length < size) {
                        length <<= 1;
                    }
                    this.z = new int[length];
                }
                int i50 = 0;
                for (int i51 = 0; i51 < size; i51++) {
                    int iC2 = ((AbstractC2144m60) list.get(i51)).c();
                    if (iC2 >= 0) {
                        this.z[i50] = iC2;
                        i50++;
                    }
                }
                if (i50 > 0) {
                    Arrays.sort(this.z, 0, i50);
                    AbstractC2442pA abstractC2442pA9 = this.W;
                    int[] iArr2 = this.z;
                    int i52 = abstractC2442pA9.g;
                    int iBinarySearch = i52 >= 0 ? Arrays.binarySearch(iArr2, 0, i50, i52) : 0;
                    Object[] objArr = abstractC2442pA9.a;
                    if (iBinarySearch < 0) {
                        int i53 = (-iBinarySearch) - 1;
                        int iO = abstractC2442pA9.c ? (abstractC2442pA9.b.o(i52) - abstractC2442pA9.b.q(i52)) - abstractC2442pA9.d : abstractC2442pA9.d + abstractC2442pA9.b.q(i52) + abstractC2442pA9.b.o(i52);
                        while (i53 < i50) {
                            int i54 = iArr2[i53];
                            SparseIntArray sparseIntArray4 = sparseIntArray;
                            int i55 = sparseIntArray4.get(i54);
                            int i56 = i55 < 0 ? 0 : i55;
                            int iK3 = abstractC2442pA9.b.k(i54, true, objArr, true);
                            abstractC2442pA9.b.i(objArr[0], i54, iK3, i56, iO);
                            iO = abstractC2442pA9.c ? (iO - iK3) - abstractC2442pA9.d : iO + iK3 + abstractC2442pA9.d;
                            i53++;
                            sparseIntArray = sparseIntArray4;
                        }
                    }
                    sparseIntArray2 = sparseIntArray;
                    int i57 = abstractC2442pA9.f;
                    int iBinarySearch2 = i57 >= 0 ? Arrays.binarySearch(iArr2, 0, i50, i57) : 0;
                    if (iBinarySearch2 < 0) {
                        int iO2 = abstractC2442pA9.c ? abstractC2442pA9.b.o(i57) : abstractC2442pA9.b.o(i57);
                        for (int i58 = (-iBinarySearch2) - 2; i58 >= 0; i58--) {
                            int i59 = iArr2[i58];
                            int i60 = sparseIntArray2.get(i59);
                            int i61 = i60 < 0 ? 0 : i60;
                            int iK4 = abstractC2442pA9.b.k(i59, false, objArr, true);
                            iO2 = abstractC2442pA9.c ? iO2 + abstractC2442pA9.d + iK4 : (iO2 - abstractC2442pA9.d) - iK4;
                            abstractC2442pA9.b.i(objArr[0], i59, iK4, i61, iO2);
                        }
                    }
                } else {
                    sparseIntArray2 = sparseIntArray;
                }
                sparseIntArray2.clear();
            }
            int i62 = this.B;
            if ((i62 & 1024) != 0) {
                this.B = i62 & (-1025);
            } else {
                E1();
            }
            if (((this.B & 4) != 0 && ((i10 = this.D) != i4 || this.E != i5 || s(i10) != view || (this.B & 8) != 0)) || (this.B & 20) == 16) {
                W0();
            }
            X0();
            int i63 = this.B;
            if ((i63 & 64) != 0) {
                if (this.s == 1) {
                    i9 = -this.f613o;
                    if (x() > 0 && (left = w(0).getTop()) < 0) {
                        i9 += left;
                    }
                } else if ((i63 & 262144) != 0) {
                    i9 = this.n;
                    if (x() > 0 && (right = w(0).getRight()) > i9) {
                        i9 = right;
                    }
                } else {
                    i9 = -this.n;
                    if (x() > 0 && (left = w(0).getLeft()) < 0) {
                        i9 += left;
                    }
                }
                t1(i9);
            }
            this.B &= -4;
            k1();
        }
    }

    public final boolean o1(boolean z) {
        if (this.M != 0 || this.N == null) {
            return false;
        }
        AbstractC2442pA abstractC2442pA = this.W;
        FV[] fvArrJ = abstractC2442pA == null ? null : abstractC2442pA.j(abstractC2442pA.f, abstractC2442pA.g);
        boolean z2 = false;
        int i = -1;
        for (int i2 = 0; i2 < this.U; i2++) {
            FV fv = fvArrJ == null ? null : fvArrJ[i2];
            int i3 = fv == null ? 0 : fv.l & fv.m;
            int i4 = -1;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                int iF = fv.f(i5 + 1);
                for (int iF2 = fv.f(i5); iF2 <= iF; iF2++) {
                    View viewS = s(iF2 - this.w);
                    if (viewS != null) {
                        if (z) {
                            l1(viewS);
                        }
                        int iZ0 = this.s == 0 ? Z0(viewS) : a1(viewS);
                        if (iZ0 > i4) {
                            i4 = iZ0;
                        }
                    }
                }
            }
            int iB = this.v.b();
            AbstractC0976a8 abstractC0976a8 = this.r;
            if (!abstractC0976a8.F && z && i4 < 0 && iB > 0) {
                if (i < 0) {
                    int i6 = this.D;
                    if (i6 < 0) {
                        i6 = 0;
                    } else if (i6 >= iB) {
                        i6 = iB - 1;
                    }
                    if (x() > 0) {
                        int iE = abstractC0976a8.K(w(0)).e();
                        int iE2 = abstractC0976a8.K(w(x() - 1)).e();
                        if (i6 >= iE && i6 <= iE2) {
                            i6 = i6 - iE <= iE2 - i6 ? iE - 1 : iE2 + 1;
                            if (i6 < 0 && iE2 < iB - 1) {
                                i6 = iE2 + 1;
                            } else if (i6 >= iB && iE > 0) {
                                i6 = iE - 1;
                            }
                        }
                    }
                    if (i6 >= 0 && i6 < iB) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        View viewD = this.A.d(i6);
                        int[] iArr = this.c0;
                        if (viewD != null) {
                            C2926uA c2926uA = (C2926uA) viewD.getLayoutParams();
                            Rect rect = g0;
                            d(viewD, rect);
                            viewD.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, L() + K() + ((ViewGroup.MarginLayoutParams) c2926uA).leftMargin + ((ViewGroup.MarginLayoutParams) c2926uA).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) c2926uA).width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, J() + M() + ((ViewGroup.MarginLayoutParams) c2926uA).topMargin + ((ViewGroup.MarginLayoutParams) c2926uA).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) c2926uA).height));
                            iArr[0] = a1(viewD);
                            iArr[1] = Z0(viewD);
                            this.A.i(viewD);
                        }
                        i = this.s == 0 ? iArr[1] : iArr[0];
                    }
                }
                if (i >= 0) {
                    i4 = i;
                }
            }
            if (i4 < 0) {
                i4 = 0;
            }
            int[] iArr2 = this.N;
            if (iArr2[i2] != i4) {
                iArr2[i2] = i4;
                z2 = true;
            }
        }
        return z2;
    }

    public final int p1(int i, boolean z) {
        C2102ll c2102llK;
        AbstractC2442pA abstractC2442pA = this.W;
        if (abstractC2442pA == null) {
            return i;
        }
        int i2 = this.D;
        int i3 = (i2 == -1 || (c2102llK = abstractC2442pA.k(i2)) == null) ? -1 : c2102llK.l;
        int iX = x();
        View view = null;
        for (int i4 = 0; i4 < iX && i != 0; i4++) {
            int i5 = i > 0 ? i4 : (iX - 1) - i4;
            View viewW = w(i5);
            if (viewW.getVisibility() == 0 && (!R() || viewW.hasFocusable())) {
                int iY0 = Y0(w(i5));
                C2102ll c2102llK2 = this.W.k(iY0);
                int i6 = c2102llK2 == null ? -1 : c2102llK2.l;
                if (i3 == -1) {
                    i2 = iY0;
                    view = viewW;
                    i3 = i6;
                } else if (i6 == i3 && ((i > 0 && iY0 > i2) || (i < 0 && iY0 < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = iY0;
                    view = viewW;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (R()) {
                    this.B |= 32;
                    view.requestFocus();
                    this.B &= -33;
                }
                this.D = i2;
                this.E = 0;
            } else {
                x1(view, true);
            }
        }
        return i;
    }

    @Override // o.X50
    public final void q0(C1266d60 c1266d60, C1755i60 c1755i60, int i, int i2) {
        int size;
        int size2;
        int mode;
        int iK;
        int iL;
        int iF1;
        s1(c1266d60, c1755i60);
        if (this.s == 0) {
            size2 = View.MeasureSpec.getSize(i);
            size = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i2);
            iK = M();
            iL = J();
        } else {
            size = View.MeasureSpec.getSize(i);
            size2 = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i);
            iK = K();
            iL = L();
        }
        int i3 = iL + iK;
        this.O = size;
        int i4 = this.L;
        if (i4 == -2) {
            int i5 = this.V;
            if (i5 == 0) {
                i5 = 1;
            }
            this.U = i5;
            this.M = 0;
            int[] iArr = this.N;
            if (iArr == null || iArr.length != i5) {
                this.N = new int[i5];
            }
            if (this.v.g) {
                D1();
            }
            o1(true);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(f1() + i3, this.O);
            } else if (mode == 0) {
                iF1 = f1();
                size = iF1 + i3;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
                size = this.O;
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    if (i4 == 0) {
                        i4 = size - i3;
                    }
                    this.M = i4;
                    int i6 = this.V;
                    if (i6 == 0) {
                        i6 = 1;
                    }
                    this.U = i6;
                    iF1 = ((i6 - 1) * this.S) + (i4 * i6);
                    size = iF1 + i3;
                } else if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i7 = this.V;
            if (i7 == 0 && i4 == 0) {
                this.U = 1;
                this.M = size - i3;
            } else if (i7 == 0) {
                this.M = i4;
                int i8 = this.S;
                this.U = (size + i8) / (i4 + i8);
            } else if (i4 == 0) {
                this.U = i7;
                this.M = ((size - i3) - ((i7 - 1) * this.S)) / i7;
            } else {
                this.U = i7;
                this.M = i4;
            }
            if (mode == Integer.MIN_VALUE) {
                int i9 = this.M;
                int i10 = this.U;
                int i11 = ((i10 - 1) * this.S) + (i9 * i10) + i3;
                if (i11 < size) {
                    size = i11;
                }
            }
        }
        if (this.s == 0) {
            this.b.setMeasuredDimension(size2, size);
        } else {
            this.b.setMeasuredDimension(size, size2);
        }
        k1();
    }

    public final void q1() {
        int i = this.B;
        if ((65600 & i) == 65536) {
            AbstractC2442pA abstractC2442pA = this.W;
            int i2 = this.D;
            int i3 = (i & 262144) != 0 ? -this.b0 : this.a0 + this.b0;
            while (true) {
                int i4 = abstractC2442pA.g;
                if (i4 >= abstractC2442pA.f && i4 > i2) {
                    if (!abstractC2442pA.c) {
                        if (abstractC2442pA.b.o(i4) < i3) {
                            break;
                        }
                        abstractC2442pA.b.z(abstractC2442pA.g);
                        abstractC2442pA.g--;
                    } else {
                        if (abstractC2442pA.b.o(i4) > i3) {
                            break;
                        }
                        abstractC2442pA.b.z(abstractC2442pA.g);
                        abstractC2442pA.g--;
                    }
                } else {
                    break;
                }
            }
            if (abstractC2442pA.g < abstractC2442pA.f) {
                abstractC2442pA.g = -1;
                abstractC2442pA.f = -1;
            }
        }
    }

    @Override // o.X50
    public final boolean r0(RecyclerView recyclerView, View view, View view2) {
        if ((this.B & 32768) == 0 && Y0(view) != -1 && (this.B & 35) == 0) {
            w1(view, view2, true, 0, 0);
        }
        return true;
    }

    public final void r1() {
        int i = this.B;
        if ((65600 & i) == 65536) {
            AbstractC2442pA abstractC2442pA = this.W;
            int i2 = this.D;
            int i3 = (i & 262144) != 0 ? this.a0 + this.b0 : -this.b0;
            while (true) {
                int i4 = abstractC2442pA.g;
                int i5 = abstractC2442pA.f;
                if (i4 >= i5 && i5 < i2) {
                    int iQ = abstractC2442pA.b.q(i5);
                    if (!abstractC2442pA.c) {
                        if (abstractC2442pA.b.o(abstractC2442pA.f) + iQ > i3) {
                            break;
                        }
                        abstractC2442pA.b.z(abstractC2442pA.f);
                        abstractC2442pA.f++;
                    } else {
                        if (abstractC2442pA.b.o(abstractC2442pA.f) - iQ < i3) {
                            break;
                        }
                        abstractC2442pA.b.z(abstractC2442pA.f);
                        abstractC2442pA.f++;
                    }
                } else {
                    break;
                }
            }
            if (abstractC2442pA.g < abstractC2442pA.f) {
                abstractC2442pA.g = -1;
                abstractC2442pA.f = -1;
            }
        }
    }

    @Override // o.X50
    public final void s0(Parcelable parcelable) {
        if (parcelable instanceof C3120wA) {
            C3120wA c3120wA = (C3120wA) parcelable;
            this.D = c3120wA.l;
            this.H = 0;
            Bundle bundle = c3120wA.m;
            FV fv = this.d0;
            C2841tM c2841tM = (C2841tM) fv.n;
            if (c2841tM != null && bundle != null) {
                c2841tM.n(-1);
                for (String str : bundle.keySet()) {
                    ((C2841tM) fv.n).k(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.B |= 256;
            E0();
        }
    }

    public final void s1(C1266d60 c1266d60, C1755i60 c1755i60) {
        int i = this.u;
        if (i == 0) {
            this.A = c1266d60;
            this.v = c1755i60;
            this.w = 0;
            this.x = 0;
        }
        this.u = i + 1;
    }

    @Override // o.X50
    public final Y50 t() {
        return new C2926uA(-2, -2);
    }

    @Override // o.X50
    public final Parcelable t0() {
        Bundle bundle;
        C3120wA c3120wA = new C3120wA();
        c3120wA.m = Bundle.EMPTY;
        c3120wA.l = this.D;
        FV fv = this.d0;
        C2841tM c2841tM = (C2841tM) fv.n;
        if (c2841tM == null || c2841tM.m() == 0) {
            bundle = null;
        } else {
            C2841tM c2841tM2 = (C2841tM) fv.n;
            c2841tM2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            synchronized (((C2743sL) c2841tM2.g)) {
                Set<Map.Entry> setEntrySet = ((C2938uM) c2841tM2.f).m.entrySet();
                AbstractC1474fG.i(setEntrySet, "map.entries");
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            bundle = new Bundle();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                bundle.putSparseParcelableArray((String) entry2.getKey(), (SparseArray) entry2.getValue());
            }
        }
        int iX = x();
        for (int i = 0; i < iX; i++) {
            View viewW = w(i);
            int iY0 = Y0(viewW);
            if (iY0 != -1 && this.d0.l != 0) {
                String string = Integer.toString(iY0);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                viewW.saveHierarchyState(sparseArray);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray(string, sparseArray);
            }
        }
        c3120wA.m = bundle;
        return c3120wA;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[PHI: r0
  0x0031: PHI (r0v9 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x002f, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public final int t1(int i) {
        int i2;
        int i3 = this.B;
        if ((i3 & 64) == 0 && (i3 & 3) != 1) {
            C2303no0 c2303no0 = this.Y;
            if (i > 0) {
                C1735hw0 c1735hw0 = (C1735hw0) c2303no0.f941o;
                if (c1735hw0.a != Integer.MAX_VALUE && i > (i2 = c1735hw0.c)) {
                    i = i2;
                }
            } else if (i < 0) {
                C1735hw0 c1735hw1 = (C1735hw0) c2303no0.f941o;
                if (c1735hw1.b != Integer.MIN_VALUE && i < (i2 = c1735hw1.d)) {
                    i = i2;
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        int i4 = -i;
        int iX = x();
        if (this.s == 1) {
            for (int i5 = 0; i5 < iX; i5++) {
                w(i5).offsetTopAndBottom(i4);
            }
        } else {
            for (int i6 = 0; i6 < iX; i6++) {
                w(i6).offsetLeftAndRight(i4);
            }
        }
        if ((this.B & 3) == 1) {
            F1();
            return i;
        }
        int iX2 = x();
        if ((this.B & 262144) == 0 ? i >= 0 : i <= 0) {
            V0();
        } else {
            m1();
        }
        boolean z = x() > iX2;
        int iX3 = x();
        if ((262144 & this.B) == 0 ? i >= 0 : i <= 0) {
            r1();
        } else {
            q1();
        }
        if (z | (x() < iX3)) {
            E1();
        }
        this.r.invalidate();
        F1();
        return i;
    }

    @Override // o.X50
    public final Y50 u(Context context, AttributeSet attributeSet) {
        return new C2926uA(context, attributeSet);
    }

    public final int u1(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int iX = x();
        if (this.s == 0) {
            while (i2 < iX) {
                w(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < iX) {
                w(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.K += i;
        G1();
        this.r.invalidate();
        return i;
    }

    @Override // o.X50
    public final Y50 v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2926uA) {
            return new C2926uA((C2926uA) layoutParams);
        }
        if (layoutParams instanceof Y50) {
            return new C2926uA((Y50) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2926uA((ViewGroup.MarginLayoutParams) layoutParams) : new C2926uA(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.X50
    public final boolean v0(C1266d60 c1266d60, C1755i60 c1755i60, int i, Bundle bundle) {
        if ((this.B & 131072) != 0) {
            s1(c1266d60, c1755i60);
            boolean z = (this.B & 262144) != 0;
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.s == 0) {
                    if (i == F0.l.a()) {
                        if (z) {
                            i = C1672hI.a.f;
                        } else {
                            i = C1672hI.a.e;
                        }
                    } else if (i == F0.n.a()) {
                        if (z) {
                            i = C1672hI.a.e;
                        } else {
                            i = C1672hI.a.f;
                        }
                    }
                } else if (i == F0.k.a()) {
                    i = C1672hI.a.e;
                } else if (i == F0.m.a()) {
                    i = C1672hI.a.f;
                }
            }
            int i2 = this.D;
            boolean z2 = i2 == 0 && i == 8192;
            boolean z3 = i2 == c1755i60.b() - 1 && i == 4096;
            if (z2 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(C1672hI.a.f);
                AbstractC0976a8 abstractC0976a8 = this.r;
                abstractC0976a8.onInitializeAccessibilityEvent(accessibilityEventObtain);
                abstractC0976a8.requestSendAccessibilityEvent(abstractC0976a8, accessibilityEventObtain);
            } else if (i == 4096) {
                n1(true);
                p1(1, false);
            } else if (i == 8192) {
                n1(false);
                p1(-1, false);
            }
            k1();
        }
        return true;
    }

    public final void v1(int i, int i2, int i3, boolean z) {
        this.I = i3;
        View viewS = s(i);
        boolean z2 = !U();
        AbstractC0976a8 abstractC0976a8 = this.r;
        if (z2 && !abstractC0976a8.isLayoutRequested() && viewS != null && Y0(viewS) == i) {
            this.B |= 32;
            x1(viewS, z);
            this.B &= -33;
            return;
        }
        int i4 = this.B;
        if ((i4 & 512) == 0 || (i4 & 64) != 0) {
            this.D = i;
            this.E = i2;
            this.H = Integer.MIN_VALUE;
            return;
        }
        if (z && !abstractC0976a8.isLayoutRequested()) {
            this.D = i;
            this.E = i2;
            this.H = Integer.MIN_VALUE;
            if (this.W == null) {
                abstractC0976a8.getId();
                return;
            }
            C2539qA c2539qA = new C2539qA(this);
            c2539qA.a = i;
            T0(c2539qA);
            int i5 = c2539qA.a;
            if (i5 != this.D) {
                this.D = i5;
                this.E = 0;
                return;
            }
            return;
        }
        if (!z2) {
            AbstractC2732sA abstractC2732sA = this.F;
            if (abstractC2732sA != null) {
                abstractC2732sA.p = true;
            }
            abstractC0976a8.p0();
        }
        if (!abstractC0976a8.isLayoutRequested() && viewS != null && Y0(viewS) == i) {
            this.B |= 32;
            x1(viewS, z);
            this.B &= -33;
        } else {
            this.D = i;
            this.E = i2;
            this.H = Integer.MIN_VALUE;
            this.B |= 256;
            E0();
        }
    }

    public final void w1(View view, View view2, boolean z, int i, int i2) {
        if ((this.B & 64) != 0) {
            return;
        }
        int iY0 = Y0(view);
        if (view != null && view2 != null) {
            ((C2926uA) view.getLayoutParams()).getClass();
        }
        int i3 = this.D;
        AbstractC0976a8 abstractC0976a8 = this.r;
        if (iY0 != i3 || this.E != 0) {
            this.D = iY0;
            this.E = 0;
            this.H = 0;
            if ((this.B & 3) != 1) {
                W0();
            }
            if (abstractC0976a8.O()) {
                abstractC0976a8.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && abstractC0976a8.hasFocus()) {
            view.requestFocus();
        }
        if ((this.B & 131072) == 0 && z) {
            return;
        }
        int[] iArr = h0;
        if (!e1(view, view2, iArr) && i == 0 && i2 == 0) {
            return;
        }
        int i4 = iArr[0] + i;
        int i5 = iArr[1] + i2;
        if ((this.B & 3) == 1) {
            t1(i4);
            u1(i5);
            return;
        }
        if (this.s != 0) {
            i5 = i4;
            i4 = i5;
        }
        if (z) {
            abstractC0976a8.k0(i4, i5, false);
        } else {
            abstractC0976a8.scrollBy(i4, i5);
            X0();
        }
    }

    @Override // o.X50
    public final void x0(C1266d60 c1266d60) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            A0(iX, c1266d60);
        }
    }

    public final void x1(View view, boolean z) {
        w1(view, view.findFocus(), z, 0, 0);
    }

    public final void y1(int i) {
        if (i == 0 || i == 1) {
            this.s = i;
            this.t = AbstractC0351Cp.a(this, i);
            C2303no0 c2303no0 = this.Y;
            c2303no0.getClass();
            C1735hw0 c1735hw0 = (C1735hw0) c2303no0.m;
            C1735hw0 c1735hw1 = (C1735hw0) c2303no0.n;
            if (i == 0) {
                c2303no0.f941o = c1735hw1;
                c2303no0.p = c1735hw0;
            } else {
                c2303no0.f941o = c1735hw0;
                c2303no0.p = c1735hw1;
            }
            Na0 na0 = this.Z;
            na0.getClass();
            if (i == 0) {
                na0.f414o = (C2641rG) na0.n;
            } else {
                na0.f414o = (C2641rG) na0.m;
            }
            this.B |= 256;
        }
    }

    @Override // o.X50
    public final int z(C1266d60 c1266d60, C1755i60 c1755i60) {
        AbstractC2442pA abstractC2442pA;
        if (this.s != 1 || (abstractC2442pA = this.W) == null) {
            return -1;
        }
        return abstractC2442pA.e;
    }

    public final void z1(int i) {
        if (i < 0 && i != -2) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Invalid row height: "));
        }
        this.L = i;
    }

    @Override // o.X50
    public final void p0(C1755i60 c1755i60) {
    }
}
