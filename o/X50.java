package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class X50 {
    public Na0 a;
    public RecyclerView b;
    public final Vm0 c;
    public final Vm0 d;
    public C2645rK e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f613o;

    public X50() {
        V50 v50 = new V50(this, 0);
        V50 v51 = new V50(this, 1);
        this.c = new Vm0(v50);
        this.d = new Vm0(v51);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int D(View view) {
        Rect rect = ((Y50) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int E(View view) {
        Rect rect = ((Y50) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int N(View view) {
        return ((Y50) view.getLayoutParams()).a.e();
    }

    public static W50 O(Context context, AttributeSet attributeSet, int i, int i2) {
        W50 w50 = new W50();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E40.a, i, i2);
        w50.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        w50.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        w50.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        w50.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return w50;
    }

    public static boolean T(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void V(View view, int i, int i2, int i3, int i4) {
        Y50 y50 = (Y50) view.getLayoutParams();
        Rect rect = y50.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) y50).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) y50).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) y50).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) y50).bottomMargin);
    }

    public static int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int y(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public int A(View view) {
        return view.getBottom() + ((Y50) view.getLayoutParams()).b.bottom;
    }

    public final void A0(int i, C1266d60 c1266d60) {
        View viewW = w(i);
        B0(i);
        c1266d60.i(viewW);
    }

    public void B(View view, Rect rect) {
        int[] iArr = RecyclerView.M0;
        Y50 y50 = (Y50) view.getLayoutParams();
        Rect rect2 = y50.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) y50).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) y50).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) y50).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) y50).bottomMargin);
    }

    public final void B0(int i) {
        if (w(i) != null) {
            Na0 na0 = this.a;
            int iC = na0.C(i);
            N50 n50 = (N50) na0.m;
            View childAt = n50.a.getChildAt(iC);
            if (childAt == null) {
                return;
            }
            if (((C3306y6) na0.n).M(iC)) {
                na0.V(childAt);
            }
            n50.g(iC);
        }
    }

    public int C(View view) {
        return view.getLeft() - ((Y50) view.getLayoutParams()).b.left;
    }

    public boolean C0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return D0(recyclerView, view, rect, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    public boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iK = K();
        int iM = M();
        int iL = this.n - L();
        int iJ = this.f613o - J();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iK;
        int iMin = Math.min(0, i);
        int i2 = top - iM;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iL;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iJ);
        if (I() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iK2 = K();
                int iM2 = M();
                int iL2 = this.n - L();
                int iJ2 = this.f613o - J();
                Rect rect2 = this.b.u;
                B(focusedChild, rect2);
                if (rect2.left - i4 < iL2 && rect2.right - i4 > iK2 && rect2.top - i5 < iJ2 && rect2.bottom - i5 > iM2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                    } else {
                        recyclerView.i0(i4, i5);
                    }
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.i0(i4, i5);
            }
            return true;
        }
        return false;
    }

    public final void E0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int F(View view) {
        return view.getRight() + ((Y50) view.getLayoutParams()).b.right;
    }

    public final void F0(C1266d60 c1266d60, int i, View view) {
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        if (abstractC2144m60L.s()) {
            return;
        }
        if (abstractC2144m60L.j() && !abstractC2144m60L.l() && !this.b.x.b) {
            B0(i);
            c1266d60.j(abstractC2144m60L);
        } else {
            w(i);
            this.a.u(i);
            c1266d60.k(view);
            this.b.r.g(abstractC2144m60L);
        }
    }

    public int G(View view) {
        return view.getTop() - ((Y50) view.getLayoutParams()).b.top;
    }

    public abstract int G0(int i, C1266d60 c1266d60, C1755i60 c1755i60);

    public final int H() {
        RecyclerView recyclerView = this.b;
        O50 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void H0(int i);

    public final int I() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = It0.a;
        return recyclerView.getLayoutDirection();
    }

    public abstract int I0(int i, C1266d60 c1266d60, C1755i60 c1755i60);

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void J0(RecyclerView recyclerView) {
        L0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int K() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void K0(boolean z) {
        if (z != this.i) {
            this.i = z;
            this.j = 0;
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.n.n();
            }
        }
    }

    public final int L() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void L0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.O0) {
            this.n = 0;
        }
        this.f613o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.O0) {
            return;
        }
        this.f613o = 0;
    }

    public final int M() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void M0(Rect rect, int i, int i2) {
        int iL = L() + K() + rect.width();
        int iJ = J() + M() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = It0.a;
        this.b.setMeasuredDimension(h(i, iL, recyclerView.getMinimumWidth()), h(i2, iJ, this.b.getMinimumHeight()));
    }

    public final void N0(int i, int i2) {
        int iX = x();
        if (iX == 0) {
            this.b.o(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iX; i7++) {
            View viewW = w(i7);
            Rect rect = this.b.u;
            B(viewW, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.b.u.set(i5, i6, i3, i4);
        M0(this.b.u, i, i2);
    }

    public final void O0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.f613o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.q;
            this.n = recyclerView.getWidth();
            this.f613o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int P(C1266d60 c1266d60, C1755i60 c1755i60) {
        return -1;
    }

    public final boolean P0(View view, int i, int i2, Y50 y50) {
        return (!view.isLayoutRequested() && this.h && T(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) y50).width) && T(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) y50).height)) ? false : true;
    }

    public final void Q(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((Y50) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean Q0() {
        return false;
    }

    public final boolean R() {
        RecyclerView recyclerView = this.b;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean R0(View view, int i, int i2, Y50 y50) {
        return (this.h && T(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) y50).width) && T(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) y50).height)) ? false : true;
    }

    public boolean S() {
        return false;
    }

    public abstract void S0(int i, RecyclerView recyclerView);

    public void T0(C2645rK c2645rK) {
        C2645rK c2645rK2 = this.e;
        if (c2645rK2 != null && c2645rK != c2645rK2 && c2645rK2.e) {
            c2645rK2.j();
        }
        this.e = c2645rK;
        RecyclerView recyclerView = this.b;
        RunnableC2047l60 runnableC2047l60 = recyclerView.q0;
        runnableC2047l60.r.removeCallbacks(runnableC2047l60);
        runnableC2047l60.n.abortAnimation();
        c2645rK.b = recyclerView;
        c2645rK.c = this;
        int i = c2645rK.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.t0.a = i;
        c2645rK.e = true;
        c2645rK.d = true;
        c2645rK.f = recyclerView.y.s(i);
        c2645rK.b.q0.b();
    }

    public final boolean U() {
        C2645rK c2645rK = this.e;
        return c2645rK != null && c2645rK.e;
    }

    public boolean U0() {
        return this instanceof C3217xA;
    }

    public void W(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iZ = recyclerView.q.z();
            for (int i2 = 0; i2 < iZ; i2++) {
                recyclerView.q.y(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void X(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iZ = recyclerView.q.z();
            for (int i2 = 0; i2 < iZ; i2++) {
                recyclerView.q.y(i2).offsetTopAndBottom(i);
            }
        }
    }

    public boolean Z(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public final void b(View view, int i, boolean z) {
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        if (z || abstractC2144m60L.l()) {
            Nd0 nd0 = (Nd0) this.b.r.m;
            St0 st0A = (St0) nd0.get(abstractC2144m60L);
            if (st0A == null) {
                st0A = St0.a();
                nd0.put(abstractC2144m60L, st0A);
            }
            st0A.a |= 1;
        } else {
            this.b.r.g(abstractC2144m60L);
        }
        Y50 y50 = (Y50) view.getLayoutParams();
        if (abstractC2144m60L.t() || abstractC2144m60L.m()) {
            if (abstractC2144m60L.m()) {
                abstractC2144m60L.n.m(abstractC2144m60L);
            } else {
                abstractC2144m60L.j &= -33;
            }
            this.a.q(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.b) {
                int iJ = this.a.J(view);
                if (i == -1) {
                    i = this.a.z();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.A());
                }
                if (iJ != i) {
                    X50 x50 = this.b.y;
                    View viewW = x50.w(iJ);
                    if (viewW == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iJ + x50.b.toString());
                    }
                    x50.w(iJ);
                    x50.a.u(iJ);
                    Y50 y51 = (Y50) viewW.getLayoutParams();
                    AbstractC2144m60 abstractC2144m60L2 = RecyclerView.L(viewW);
                    if (abstractC2144m60L2.l()) {
                        Nd0 nd1 = (Nd0) x50.b.r.m;
                        St0 st0A2 = (St0) nd1.get(abstractC2144m60L2);
                        if (st0A2 == null) {
                            st0A2 = St0.a();
                            nd1.put(abstractC2144m60L2, st0A2);
                        }
                        st0A2.a = 1 | st0A2.a;
                    } else {
                        x50.b.r.g(abstractC2144m60L2);
                    }
                    x50.a.q(viewW, i, y51, abstractC2144m60L2.l());
                }
            } else {
                this.a.p(view, i, false);
                y50.c = true;
                C2645rK c2645rK = this.e;
                if (c2645rK != null && c2645rK.e) {
                    c2645rK.b.getClass();
                    AbstractC2144m60 abstractC2144m60L3 = RecyclerView.L(view);
                    if ((abstractC2144m60L3 != null ? abstractC2144m60L3.e() : -1) == c2645rK.a) {
                        c2645rK.f = view;
                    }
                }
            }
        }
        if (y50.d) {
            abstractC2144m60L.a.invalidate();
            y50.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public View c0(View view, int i, C1266d60 c1266d60, C1755i60 c1755i60) {
        return null;
    }

    public final void d(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
    }

    public void d0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        C1266d60 c1266d60 = recyclerView.n;
        C1755i60 c1755i60 = recyclerView.t0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        O50 o50 = this.b.x;
        if (o50 != null) {
            accessibilityEvent.setItemCount(o50.a());
        }
    }

    public abstract boolean e();

    public void e0(C1266d60 c1266d60, C1755i60 c1755i60, N0 n0) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            n0.a(C1672hI.a.e);
            n0.m(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            n0.a(C1672hI.a.f);
            n0.m(true);
        }
        n0.j(L0.d(P(c1266d60, c1755i60), z(c1266d60, c1755i60), 0));
    }

    public abstract boolean f();

    public final void f0(View view, N0 n0) {
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        if (abstractC2144m60L == null || abstractC2144m60L.l() || ((ArrayList) this.a.f414o).contains(abstractC2144m60L.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        g0(recyclerView.n, recyclerView.t0, view, n0);
    }

    public boolean g(Y50 y50) {
        return y50 != null;
    }

    public View h0(View view, int i) {
        return null;
    }

    public int k(C1755i60 c1755i60) {
        return 0;
    }

    public int l(C1755i60 c1755i60) {
        return 0;
    }

    public int m(C1755i60 c1755i60) {
        return 0;
    }

    public int n(C1755i60 c1755i60) {
        return 0;
    }

    public void n0(RecyclerView recyclerView, int i, int i2) {
        m0(i, i2);
    }

    public int o(C1755i60 c1755i60) {
        return 0;
    }

    public abstract void o0(C1266d60 c1266d60, C1755i60 c1755i60);

    public int p(C1755i60 c1755i60) {
        return 0;
    }

    public abstract void p0(C1755i60 c1755i60);

    public final void q(C1266d60 c1266d60) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            F0(c1266d60, iX, w(iX));
        }
    }

    public void q0(C1266d60 c1266d60, C1755i60 c1755i60, int i, int i2) {
        this.b.o(i, i2);
    }

    public final View r(View view) {
        View viewC;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (viewC = recyclerView.C(view)) == null || this.a.L(viewC)) {
            return null;
        }
        return viewC;
    }

    public boolean r0(RecyclerView recyclerView, View view, View view2) {
        return U() || recyclerView.P();
    }

    public View s(int i) {
        int iX = x();
        for (int i2 = 0; i2 < iX; i2++) {
            View viewW = w(i2);
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(viewW);
            if (abstractC2144m60L != null && abstractC2144m60L.e() == i && !abstractC2144m60L.s() && (this.b.t0.g || !abstractC2144m60L.l())) {
                return viewW;
            }
        }
        return null;
    }

    public abstract Y50 t();

    public Parcelable t0() {
        return null;
    }

    public Y50 u(Context context, AttributeSet attributeSet) {
        return new Y50(context, attributeSet);
    }

    public Y50 v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Y50) {
            return new Y50((Y50) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Y50((ViewGroup.MarginLayoutParams) layoutParams) : new Y50(layoutParams);
    }

    public boolean v0(C1266d60 c1266d60, C1755i60 c1755i60, int i, Bundle bundle) {
        int iM;
        int iK;
        if (this.b == null) {
            return false;
        }
        int iHeight = this.f613o;
        int iWidth = this.n;
        Rect rect = new Rect();
        if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                iM = 0;
            } else {
                iM = this.b.canScrollVertically(-1) ? -((iHeight - M()) - J()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iK = -((iWidth - K()) - L());
                }
            }
        } else {
            iM = this.b.canScrollVertically(1) ? (iHeight - M()) - J() : 0;
            iK = this.b.canScrollHorizontally(1) ? (iWidth - K()) - L() : 0;
        }
        if (iM == 0 && iK == 0) {
            return false;
        }
        this.b.k0(iK, iM, true);
        return true;
    }

    public final View w(int i) {
        Na0 na0 = this.a;
        if (na0 != null) {
            return na0.y(i);
        }
        return null;
    }

    public void w0() {
        E0();
    }

    public final int x() {
        Na0 na0 = this.a;
        if (na0 != null) {
            return na0.z();
        }
        return 0;
    }

    public void x0(C1266d60 c1266d60) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            if (!RecyclerView.L(w(iX)).s()) {
                A0(iX, c1266d60);
            }
        }
    }

    public final void y0(C1266d60 c1266d60) {
        ArrayList arrayList;
        int size = c1266d60.a.size();
        int i = size - 1;
        while (true) {
            arrayList = c1266d60.a;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC2144m60) arrayList.get(i)).a;
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
            if (!abstractC2144m60L.s()) {
                abstractC2144m60L.r(false);
                if (abstractC2144m60L.n()) {
                    this.b.removeDetachedView(view, false);
                }
                T50 t50 = this.b.b0;
                if (t50 != null) {
                    t50.d(abstractC2144m60L);
                }
                abstractC2144m60L.r(true);
                AbstractC2144m60 abstractC2144m60L2 = RecyclerView.L(view);
                abstractC2144m60L2.n = null;
                abstractC2144m60L2.f909o = false;
                abstractC2144m60L2.j &= -33;
                c1266d60.j(abstractC2144m60L2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c1266d60.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public int z(C1266d60 c1266d60, C1755i60 c1755i60) {
        return -1;
    }

    public final void z0(View view, C1266d60 c1266d60) {
        Na0 na0 = this.a;
        N50 n50 = (N50) na0.m;
        int iIndexOfChild = n50.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C3306y6) na0.n).M(iIndexOfChild)) {
                na0.V(view);
            }
            n50.g(iIndexOfChild);
        }
        c1266d60.i(view);
    }

    public void j0() {
    }

    public void Y(O50 o50) {
    }

    public void a0(RecyclerView recyclerView) {
    }

    public void b0(RecyclerView recyclerView) {
    }

    public void s0(Parcelable parcelable) {
    }

    public void u0(int i) {
    }

    public void i0(int i, int i2) {
    }

    public void j(int i, C0702Qd c0702Qd) {
    }

    public void k0(int i, int i2) {
    }

    public void l0(int i, int i2) {
    }

    public void m0(int i, int i2) {
    }

    public void g0(C1266d60 c1266d60, C1755i60 c1755i60, View view, N0 n0) {
    }

    public void i(int i, int i2, C1755i60 c1755i60, C0702Qd c0702Qd) {
    }
}
