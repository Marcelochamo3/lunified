package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AbstractC0351Cp;
import o.AbstractC0937Ze;
import o.AbstractC0973a60;
import o.AbstractC1376eG;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;
import o.AbstractC1923jt0;
import o.AbstractC1949k60;
import o.AbstractC2144m60;
import o.AbstractC3185wt0;
import o.AbstractC3476zt0;
import o.C0571Lb;
import o.C0640Nt;
import o.C0702Qd;
import o.C1071b60;
import o.C1168c60;
import o.C1266d60;
import o.C1418el;
import o.C1437eu0;
import o.C1461f60;
import o.C1480fM;
import o.C1559g60;
import o.C1672hI;
import o.C1755i60;
import o.C1843j20;
import o.C1851j60;
import o.C2338o60;
import o.C2645rK;
import o.C2650rP;
import o.C3306y6;
import o.E40;
import o.IU;
import o.InterfaceC1363e60;
import o.InterfaceC1657h60;
import o.It0;
import o.Jt0;
import o.L50;
import o.M50;
import o.Mt0;
import o.N50;
import o.Na0;
import o.Nd0;
import o.O50;
import o.R50;
import o.RunnableC1544fz;
import o.RunnableC2047l60;
import o.S50;
import o.St0;
import o.T50;
import o.U50;
import o.Vl0;
import o.Vm0;
import o.X1;
import o.X50;
import o.XW;
import o.Y1;
import o.Y50;
import o.Yu0;
import o.Z50;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {
    public static final int[] M0 = {R.attr.nestedScrollingEnabled};
    public static final float N0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean O0;
    public static final boolean P0;
    public static final boolean Q0;
    public static final Class[] R0;
    public static final M50 S0;
    public static final C1851j60 T0;
    public final ArrayList A;
    public C2338o60 A0;
    public final ArrayList B;
    public final int[] B0;
    public final ArrayList C;
    public IU C0;
    public C0640Nt D;
    public final int[] D0;
    public boolean E;
    public final int[] E0;
    public boolean F;
    public final int[] F0;
    public boolean G;
    public final ArrayList G0;
    public int H;
    public final L50 H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public boolean K;
    public int K0;
    public int L;
    public final N50 L0;
    public boolean M;
    public final AccessibilityManager N;
    public ArrayList O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public S50 T;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;
    public EdgeEffect a0;
    public T50 b0;
    public int c0;
    public int d0;
    public VelocityTracker e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public Z50 k0;
    public final float l;
    public final int l0;
    public final C1461f60 m;
    public final int m0;
    public final C1266d60 n;
    public final float n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1559g60 f31o;
    public final float o0;
    public final Y1 p;
    public boolean p0;
    public final Na0 q;
    public final RunnableC2047l60 q0;
    public final Vm0 r;
    public RunnableC1544fz r0;
    public boolean s;
    public final C0702Qd s0;
    public final L50 t;
    public final C1755i60 t0;
    public final Rect u;
    public AbstractC0973a60 u0;
    public final Rect v;
    public ArrayList v0;
    public final RectF w;
    public boolean w0;
    public O50 x;
    public boolean x0;
    public X50 y;
    public final N50 y0;
    public InterfaceC1363e60 z;
    public boolean z0;

    static {
        int i = 0;
        O0 = Build.VERSION.SDK_INT >= 23;
        P0 = true;
        Q0 = true;
        Class cls = Integer.TYPE;
        R0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        S0 = new M50(i);
        T0 = new C1851j60();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.skidush.clonex.R.attr.recyclerViewStyle);
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewF = F(viewGroup.getChildAt(i));
            if (recyclerViewF != null) {
                return recyclerViewF;
            }
        }
        return null;
    }

    public static AbstractC2144m60 L(View view) {
        if (view == null) {
            return null;
        }
        return ((Y50) view.getLayoutParams()).a;
    }

    private IU getScrollingChildHelper() {
        if (this.C0 == null) {
            this.C0 = new IU(this);
        }
        return this.C0;
    }

    public static void j(AbstractC2144m60 abstractC2144m60) {
        WeakReference weakReference = abstractC2144m60.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC2144m60.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC2144m60.b = null;
        }
    }

    public static int m(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC1923jt0.n(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC1923jt0.x(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC1923jt0.n(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC1923jt0.x(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final String A() {
        return " " + super.toString() + ", adapter:" + this.x + ", layout:" + this.y + ", context:" + getContext();
    }

    public final void B(C1755i60 c1755i60) {
        if (getScrollState() != 2) {
            c1755i60.f825o = 0;
            c1755i60.p = 0;
        } else {
            OverScroller overScroller = this.q0.n;
            c1755i60.f825o = overScroller.getFinalX() - overScroller.getCurrX();
            c1755i60.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final View C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final boolean D(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0640Nt c0640Nt = (C0640Nt) arrayList.get(i);
            int i2 = c0640Nt.v;
            if (i2 == 1) {
                boolean zE = c0640Nt.e(motionEvent.getX(), motionEvent.getY());
                boolean zD = c0640Nt.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zE || zD)) {
                    if (zD) {
                        c0640Nt.w = 1;
                        c0640Nt.p = (int) motionEvent.getX();
                    } else if (zE) {
                        c0640Nt.w = 2;
                        c0640Nt.m = (int) motionEvent.getY();
                    }
                    c0640Nt.g(2);
                    z = true;
                } else {
                    z = false;
                }
            } else if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z && action != 3) {
                this.D = c0640Nt;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int iZ = this.q.z();
        if (iZ == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iZ; i3++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.y(i3));
            if (!abstractC2144m60L.s()) {
                int iE = abstractC2144m60L.e();
                if (iE < i) {
                    i = iE;
                }
                if (iE > i2) {
                    i2 = iE;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final AbstractC2144m60 G(int i) {
        AbstractC2144m60 abstractC2144m60 = null;
        if (this.P) {
            return null;
        }
        int iE = this.q.E();
        for (int i2 = 0; i2 < iE; i2++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.D(i2));
            if (abstractC2144m60L != null && !abstractC2144m60L.l() && I(abstractC2144m60L) == i) {
                if (!this.q.L(abstractC2144m60L.a)) {
                    return abstractC2144m60L;
                }
                abstractC2144m60 = abstractC2144m60L;
            }
        }
        return abstractC2144m60;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[SYNTHETIC] */
    public final AbstractC2144m60 H(int i, boolean z) {
        int iE = this.q.E();
        AbstractC2144m60 abstractC2144m60 = null;
        for (int i2 = 0; i2 < iE; i2++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.D(i2));
            if (abstractC2144m60L != null && !abstractC2144m60L.l()) {
                if (z) {
                    if (abstractC2144m60L.c != i) {
                        continue;
                    } else {
                        if (((ArrayList) this.q.f414o).contains(abstractC2144m60L.a)) {
                            return abstractC2144m60L;
                        }
                        abstractC2144m60 = abstractC2144m60L;
                    }
                } else if (abstractC2144m60L.e() != i) {
                    continue;
                } else {
                    if (((ArrayList) this.q.f414o).contains(abstractC2144m60L.a)) {
                        return abstractC2144m60L;
                    }
                    abstractC2144m60 = abstractC2144m60L;
                }
            }
        }
        return abstractC2144m60;
    }

    public final int I(AbstractC2144m60 abstractC2144m60) {
        if (abstractC2144m60.g(524) || !abstractC2144m60.i()) {
            return -1;
        }
        Y1 y1 = this.p;
        int i = abstractC2144m60.c;
        ArrayList arrayList = (ArrayList) y1.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X1 x1 = (X1) arrayList.get(i2);
            int i3 = x1.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = x1.b;
                    if (i4 <= i) {
                        int i5 = x1.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = x1.b;
                    if (i6 == i) {
                        i = x1.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (x1.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (x1.b <= i) {
                i += x1.d;
            }
        }
        return i;
    }

    public final long J(AbstractC2144m60 abstractC2144m60) {
        return this.x.b ? abstractC2144m60.e : abstractC2144m60.c;
    }

    public final AbstractC2144m60 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        Y50 y50 = (Y50) view.getLayoutParams();
        boolean z = y50.c;
        Rect rect = y50.b;
        if (!z) {
            return rect;
        }
        C1755i60 c1755i60 = this.t0;
        if (c1755i60.g && (y50.a.o() || y50.a.j())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.u;
            rect2.set(0, 0, 0, 0);
            ((U50) arrayList.get(i)).a(rect2, view, this, c1755i60);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        y50.c = false;
        return rect;
    }

    public final boolean N() {
        return !this.G || this.P || this.p.j();
    }

    public boolean O() {
        return isChildrenDrawingOrderEnabled();
    }

    public final boolean P() {
        return this.R > 0;
    }

    public final void Q(int i) {
        if (this.y == null) {
            return;
        }
        setScrollState(2);
        this.y.H0(i);
        awakenScrollBars();
    }

    public final void R() {
        int iE = this.q.E();
        for (int i = 0; i < iE; i++) {
            ((Y50) this.q.D(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.n.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Y50 y50 = (Y50) ((AbstractC2144m60) arrayList.get(i2)).a.getLayoutParams();
            if (y50 != null) {
                y50.c = true;
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iE = this.q.E();
        for (int i4 = 0; i4 < iE; i4++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.D(i4));
            if (abstractC2144m60L != null && !abstractC2144m60L.s()) {
                int i5 = abstractC2144m60L.c;
                C1755i60 c1755i60 = this.t0;
                if (i5 >= i3) {
                    abstractC2144m60L.p(-i2, z);
                    c1755i60.f = true;
                } else if (i5 >= i) {
                    abstractC2144m60L.b(8);
                    abstractC2144m60L.p(-i2, z);
                    abstractC2144m60L.c = i - 1;
                    c1755i60.f = true;
                }
            }
        }
        C1266d60 c1266d60 = this.n;
        ArrayList arrayList = c1266d60.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(size);
            if (abstractC2144m60 != null) {
                int i6 = abstractC2144m60.c;
                if (i6 >= i3) {
                    abstractC2144m60.p(-i2, z);
                } else if (i6 >= i) {
                    abstractC2144m60.b(8);
                    c1266d60.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.R++;
    }

    public final void U(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.R - 1;
        this.R = i2;
        if (i2 < 1) {
            this.R = 0;
            if (z) {
                int i3 = this.L;
                this.L = 0;
                if (i3 != 0 && (accessibilityManager = this.N) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(C1672hI.a.g);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.G0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(size);
                    if (abstractC2144m60.a.getParent() == this && !abstractC2144m60.s() && (i = abstractC2144m60.q) != -1) {
                        WeakHashMap weakHashMap = It0.a;
                        abstractC2144m60.a.setImportantForAccessibility(i);
                        abstractC2144m60.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.d0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.h0 = x;
            this.f0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.i0 = y;
            this.g0 = y;
        }
    }

    public final void W() {
        if (this.z0 || !this.E) {
            return;
        }
        WeakHashMap weakHashMap = It0.a;
        postOnAnimation(this.H0);
        this.z0 = true;
    }

    public final void X() {
        boolean z;
        boolean z2 = false;
        if (this.P) {
            Y1 y1 = this.p;
            y1.r((ArrayList) y1.c);
            y1.r((ArrayList) y1.d);
            y1.a = 0;
            if (this.Q) {
                this.y.j0();
            }
        }
        if (this.b0 == null || !this.y.U0()) {
            this.p.d();
        } else {
            this.p.p();
        }
        boolean z3 = this.w0 || this.x0;
        boolean z4 = this.G && this.b0 != null && ((z = this.P) || z3 || this.y.f) && (!z || this.x.b);
        C1755i60 c1755i60 = this.t0;
        c1755i60.j = z4;
        if (z4 && z3 && !this.P && this.b0 != null && this.y.U0()) {
            z2 = true;
        }
        c1755i60.k = z2;
    }

    public final void Y(boolean z) {
        this.Q = z | this.Q;
        this.P = true;
        int iE = this.q.E();
        for (int i = 0; i < iE; i++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.D(i));
            if (abstractC2144m60L != null && !abstractC2144m60L.s()) {
                abstractC2144m60L.b(6);
            }
        }
        R();
        C1266d60 c1266d60 = this.n;
        ArrayList arrayList = c1266d60.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(i2);
            if (abstractC2144m60 != null) {
                abstractC2144m60.b(6);
                abstractC2144m60.a(null);
            }
        }
        O50 o50 = c1266d60.h.x;
        if (o50 == null || !o50.b) {
            c1266d60.g();
        }
    }

    public final void Z(AbstractC2144m60 abstractC2144m60, C2650rP c2650rP) {
        abstractC2144m60.j &= -8193;
        boolean z = this.t0.h;
        Vm0 vm0 = this.r;
        if (z && abstractC2144m60.o() && !abstractC2144m60.l() && !abstractC2144m60.s()) {
            ((C1480fM) vm0.n).j(J(abstractC2144m60), abstractC2144m60);
        }
        Nd0 nd0 = (Nd0) vm0.m;
        St0 st0A = (St0) nd0.get(abstractC2144m60);
        if (st0A == null) {
            st0A = St0.a();
            nd0.put(abstractC2144m60, st0A);
        }
        st0A.b = c2650rP;
        st0A.a |= 4;
    }

    public final int a0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.U;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC1923jt0.n(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.W;
            if (edgeEffect2 != null && AbstractC1923jt0.n(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.W.onRelease();
                } else {
                    float fX = AbstractC1923jt0.x(this.W, width, height);
                    if (AbstractC1923jt0.n(this.W) == 0.0f) {
                        this.W.onRelease();
                    }
                    f2 = fX;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.U.onRelease();
            } else {
                float f3 = -AbstractC1923jt0.x(this.U, -width, 1.0f - height);
                if (AbstractC1923jt0.n(this.U) == 0.0f) {
                    this.U.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        X50 x50 = this.y;
        if (x50 == null || !x50.Z(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final int b0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.V;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC1923jt0.n(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.a0;
            if (edgeEffect2 != null && AbstractC1923jt0.n(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.a0.onRelease();
                } else {
                    float fX = AbstractC1923jt0.x(this.a0, height, 1.0f - width);
                    if (AbstractC1923jt0.n(this.a0) == 0.0f) {
                        this.a0.onRelease();
                    }
                    f2 = fX;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.V.onRelease();
            } else {
                float f3 = -AbstractC1923jt0.x(this.V, -height, width);
                if (AbstractC1923jt0.n(this.V) == 0.0f) {
                    this.V.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.u;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof Y50) {
            Y50 y50 = (Y50) layoutParams;
            if (!y50.c) {
                int i = rect.left;
                Rect rect2 = y50.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.y.D0(this, view, this.u, !this.G, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Y50) && this.y.g((Y50) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        X50 x50 = this.y;
        if (x50 != null && x50.e()) {
            return this.y.k(this.t0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        X50 x50 = this.y;
        if (x50 != null && x50.e()) {
            return this.y.l(this.t0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        X50 x50 = this.y;
        if (x50 != null && x50.e()) {
            return this.y.m(this.t0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        X50 x50 = this.y;
        if (x50 != null && x50.f()) {
            return this.y.n(this.t0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        X50 x50 = this.y;
        if (x50 != null && x50.f()) {
            return this.y.o(this.t0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        X50 x50 = this.y;
        if (x50 != null && x50.f()) {
            return this.y.p(this.t0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        o0(0);
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = It0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((U50) arrayList.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.U;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.s) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.W;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.s) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.b0 == null || arrayList.size() <= 0 || !this.b0.f()) ? z : true) {
            WeakHashMap weakHashMap = It0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107 A[DONT_INVERT, PHI: r4
  0x0107: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:34:0x00ee, B:32:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    public final boolean e0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        n();
        O50 o50 = this.x;
        int[] iArr = this.F0;
        if (o50 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(i, i2, iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i4 = i8;
            i5 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.B.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        u(i4, i5, i6, i7, this.D0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z2 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.h0;
        int[] iArr2 = this.D0;
        int i15 = iArr2[0];
        this.h0 = i14 - i15;
        int i16 = this.i0;
        int i17 = iArr2[1];
        this.i0 = i16 - i17;
        int[] iArr3 = this.E0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i11;
                float y = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    x();
                    AbstractC1923jt0.x(this.U, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f > 0.0f) {
                        y();
                        AbstractC1923jt0.x(this.W, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        z();
                        AbstractC1923jt0.x(this.V, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        w();
                        AbstractC1923jt0.x(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f != 0.0f || f2 != 0.0f) {
                        WeakHashMap weakHashMap = It0.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        WeakHashMap weakHashMap2 = It0.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = It0.a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f2 < 0.0f) {
                    z();
                    AbstractC1923jt0.x(this.V, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    w();
                    AbstractC1923jt0.x(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    WeakHashMap weakHashMap4 = It0.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = It0.a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    WeakHashMap weakHashMap6 = It0.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = It0.a;
                    postInvalidateOnAnimation();
                }
            }
            l(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            v(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i4 == 0 && i5 == 0) ? false : true;
    }

    public final void f(AbstractC2144m60 abstractC2144m60) {
        View view = abstractC2144m60.a;
        boolean z = view.getParent() == this;
        this.n.m(K(view));
        if (abstractC2144m60.n()) {
            this.q.q(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.q.p(view, -1, true);
            return;
        }
        Na0 na0 = this.q;
        int iIndexOfChild = ((N50) na0.m).a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C3306y6) na0.n).O(iIndexOfChild);
            na0.I(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i, int i2, int[] iArr) {
        AbstractC2144m60 abstractC2144m60;
        Na0 na0 = this.q;
        m0();
        T();
        int i3 = Vl0.a;
        Trace.beginSection("RV Scroll");
        C1755i60 c1755i60 = this.t0;
        B(c1755i60);
        C1266d60 c1266d60 = this.n;
        int iG0 = i != 0 ? this.y.G0(i, c1266d60, c1755i60) : 0;
        int iI0 = i2 != 0 ? this.y.I0(i2, c1266d60, c1755i60) : 0;
        Trace.endSection();
        int iZ = na0.z();
        for (int i4 = 0; i4 < iZ; i4++) {
            View viewY = na0.y(i4);
            AbstractC2144m60 abstractC2144m60K = K(viewY);
            if (abstractC2144m60K != null && (abstractC2144m60 = abstractC2144m60K.i) != null) {
                int left = viewY.getLeft();
                int top = viewY.getTop();
                View view = abstractC2144m60.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = iG0;
            iArr[1] = iI0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewC0;
        int i2;
        byte b;
        boolean z;
        View viewH0 = this.y.h0(view, i);
        if (viewH0 != null) {
            return viewH0;
        }
        boolean z2 = true;
        boolean z3 = (this.x == null || this.y == null || P() || this.J) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C1755i60 c1755i60 = this.t0;
        C1266d60 c1266d60 = this.n;
        if (z3 && (i == 2 || i == 1)) {
            if (this.y.f()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? Yu0.b.m0 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.y.e()) {
                z = focusFinder.findNextFocus(this, view, (this.y.I() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                n();
                if (C(view) == null) {
                    return null;
                }
                m0();
                this.y.c0(view, i, c1266d60, c1755i60);
                n0(false);
            }
            viewC0 = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                n();
                if (C(view) == null) {
                    return null;
                }
                m0();
                viewC0 = this.y.c0(view, i, c1266d60, c1755i60);
                n0(false);
            } else {
                viewC0 = viewFindNextFocus;
            }
        }
        if (viewC0 != null && !viewC0.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            c0(viewC0, null);
            return view;
        }
        if (viewC0 == null || viewC0 == this || viewC0 == view || C(viewC0) == null) {
            z2 = false;
        } else if (view != null && C(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.u;
            rect.set(0, 0, width, height);
            int width2 = viewC0.getWidth();
            int height2 = viewC0.getHeight();
            Rect rect2 = this.v;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewC0, rect2);
            int i3 = this.y.I() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i + A());
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                z2 = false;
            }
        }
        return z2 ? viewC0 : super.focusSearch(view, i);
    }

    public final void g(U50 u50) {
        X50 x50 = this.y;
        if (x50 != null) {
            x50.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(u50);
        R();
        requestLayout();
    }

    public void g0(int i) {
        if (this.J) {
            return;
        }
        p0();
        X50 x50 = this.y;
        if (x50 == null) {
            return;
        }
        x50.H0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        X50 x50 = this.y;
        if (x50 != null) {
            return x50.t();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        X50 x50 = this.y;
        if (x50 != null) {
            return x50.u(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public O50 getAdapter() {
        return this.x;
    }

    @Override // android.view.View
    public int getBaseline() {
        X50 x50 = this.y;
        if (x50 == null) {
            return super.getBaseline();
        }
        x50.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.s;
    }

    public C2338o60 getCompatAccessibilityDelegate() {
        return this.A0;
    }

    public S50 getEdgeEffectFactory() {
        return this.T;
    }

    public T50 getItemAnimator() {
        return this.b0;
    }

    public int getItemDecorationCount() {
        return this.B.size();
    }

    public X50 getLayoutManager() {
        return this.y;
    }

    public int getMaxFlingVelocity() {
        return this.m0;
    }

    public int getMinFlingVelocity() {
        return this.l0;
    }

    public long getNanoTime() {
        if (Q0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public Z50 getOnFlingListener() {
        return this.k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.p0;
    }

    public C1168c60 getRecycledViewPool() {
        return this.n.c();
    }

    public int getScrollState() {
        return this.c0;
    }

    public final void h(AbstractC0973a60 abstractC0973a60) {
        if (this.v0 == null) {
            this.v0 = new ArrayList();
        }
        this.v0.add(abstractC0973a60);
    }

    public final boolean h0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fN = AbstractC1923jt0.n(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.l * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = N0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fN;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + A());
        }
        if (this.S > 0) {
            new IllegalStateException("" + A());
        }
    }

    public void i0(int i, int i2) {
        j0(i, i2);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.J;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void j0(int i, int i2) {
        k0(i, i2, false);
    }

    public final void k() {
        int iE = this.q.E();
        for (int i = 0; i < iE; i++) {
            AbstractC2144m60 abstractC2144m60L = L(this.q.D(i));
            if (!abstractC2144m60L.s()) {
                abstractC2144m60L.d = -1;
                abstractC2144m60L.g = -1;
            }
        }
        C1266d60 c1266d60 = this.n;
        ArrayList arrayList = c1266d60.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(i2);
            abstractC2144m60.d = -1;
            abstractC2144m60.g = -1;
        }
        ArrayList arrayList2 = c1266d60.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC2144m60 abstractC2144m61 = (AbstractC2144m60) arrayList2.get(i3);
            abstractC2144m61.d = -1;
            abstractC2144m61.g = -1;
        }
        ArrayList arrayList3 = c1266d60.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC2144m60 abstractC2144m62 = (AbstractC2144m60) c1266d60.b.get(i4);
                abstractC2144m62.d = -1;
                abstractC2144m62.g = -1;
            }
        }
    }

    public final void k0(int i, int i2, boolean z) {
        X50 x50 = this.y;
        if (x50 == null || this.J) {
            return;
        }
        if (!x50.e()) {
            i = 0;
        }
        if (!this.y.f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.q0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.U.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.a0.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = It0.a;
            postInvalidateOnAnimation();
        }
    }

    public void l0(int i) {
        X50 x50;
        if (this.J || (x50 = this.y) == null) {
            return;
        }
        x50.S0(i, this);
    }

    public final void m0() {
        int i = this.H + 1;
        this.H = i;
        if (i != 1 || this.J) {
            return;
        }
        this.I = false;
    }

    public final void n() {
        Na0 na0 = this.q;
        Y1 y1 = this.p;
        if (!this.G || this.P) {
            int i = Vl0.a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
            return;
        }
        if (y1.j()) {
            int i2 = y1.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (y1.j()) {
                    int i3 = Vl0.a;
                    Trace.beginSection("RV FullInvalidate");
                    q();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = Vl0.a;
            Trace.beginSection("RV PartialInvalidate");
            m0();
            T();
            y1.p();
            if (!this.I) {
                int iZ = na0.z();
                for (int i5 = 0; i5 < iZ; i5++) {
                    AbstractC2144m60 abstractC2144m60L = L(na0.y(i5));
                    if (abstractC2144m60L != null && !abstractC2144m60L.s() && abstractC2144m60L.o()) {
                        q();
                    }
                }
                y1.c();
            }
            n0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void n0(boolean z) {
        if (this.H < 1) {
            this.H = 1;
        }
        if (!z && !this.J) {
            this.I = false;
        }
        if (this.H == 1) {
            if (z && this.I && !this.J && this.y != null && this.x != null) {
                q();
            }
            if (!this.J) {
                this.I = false;
            }
        }
        this.H--;
    }

    public final void o(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = It0.a;
        setMeasuredDimension(X50.h(i, paddingRight, getMinimumWidth()), X50.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void o0(int i) {
        getScrollingChildHelper().i(i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.R = 0;
        this.E = true;
        this.G = this.G && !isLayoutRequested();
        this.n.e();
        X50 x50 = this.y;
        if (x50 != null) {
            x50.g = true;
            x50.a0(this);
        }
        this.z0 = false;
        if (Q0) {
            ThreadLocal threadLocal = RunnableC1544fz.p;
            RunnableC1544fz runnableC1544fz = (RunnableC1544fz) threadLocal.get();
            this.r0 = runnableC1544fz;
            if (runnableC1544fz == null) {
                RunnableC1544fz runnableC1544fz2 = new RunnableC1544fz();
                runnableC1544fz2.l = new ArrayList();
                runnableC1544fz2.f787o = new ArrayList();
                this.r0 = runnableC1544fz2;
                WeakHashMap weakHashMap = It0.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1544fz runnableC1544fz3 = this.r0;
                runnableC1544fz3.n = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1544fz3);
            }
            this.r0.l.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1266d60 c1266d60;
        RunnableC1544fz runnableC1544fz;
        super.onDetachedFromWindow();
        T50 t50 = this.b0;
        if (t50 != null) {
            t50.e();
        }
        p0();
        int i = 0;
        this.E = false;
        X50 x50 = this.y;
        if (x50 != null) {
            x50.g = false;
            x50.b0(this);
        }
        this.G0.clear();
        removeCallbacks(this.H0);
        this.r.getClass();
        while (St0.d.n() != null) {
        }
        int i2 = 0;
        while (true) {
            c1266d60 = this.n;
            ArrayList arrayList = c1266d60.c;
            if (i2 >= arrayList.size()) {
                break;
            }
            AbstractC1376eG.e(((AbstractC2144m60) arrayList.get(i2)).a);
            i2++;
        }
        c1266d60.f(c1266d60.h.x, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C1843j20 c1843j20 = (C1843j20) childAt.getTag(com.skidush.clonex.R.id.pooling_container_listener_holder_tag);
            if (c1843j20 == null) {
                c1843j20 = new C1843j20();
                childAt.setTag(com.skidush.clonex.R.id.pooling_container_listener_holder_tag, c1843j20);
            }
            ArrayList arrayList2 = c1843j20.a;
            int iJ = AbstractC0937Ze.J(arrayList2);
            if (-1 < iJ) {
                AbstractC1674hK.w(arrayList2.get(iJ));
                throw null;
            }
            i = i3;
        }
        if (!Q0 || (runnableC1544fz = this.r0) == null) {
            return;
        }
        runnableC1544fz.l.remove(this);
        this.r0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((U50) arrayList.get(i)).b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.y != null && !this.J && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.y.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.y.e() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.y.f()) {
                    f = -axisValue2;
                } else if (this.y.e()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.n0);
                int i2 = (int) (f * this.o0);
                X50 x50 = this.y;
                if (x50 != null && !this.J) {
                    int[] iArr = this.F0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zE = x50.e();
                    boolean zF = this.y.f();
                    int i3 = zF ? (zE ? 1 : 0) | 2 : zE ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iA0 = i - a0(i, y);
                    int iB0 = i2 - b0(i2, x);
                    getScrollingChildHelper().h(i3, 1);
                    if (t(zE ? iA0 : 0, zF ? iB0 : 0, 1, this.F0, this.D0)) {
                        iA0 -= iArr[0];
                        iB0 -= iArr[1];
                    }
                    e0(zE ? iA0 : 0, zF ? iB0 : 0, motionEvent, 1);
                    RunnableC1544fz runnableC1544fz = this.r0;
                    if (runnableC1544fz != null && (iA0 != 0 || iB0 != 0)) {
                        runnableC1544fz.a(this, iA0, iB0);
                    }
                    o0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.J) {
            return false;
        }
        this.D = null;
        if (D(motionEvent)) {
            d0();
            setScrollState(0);
            return true;
        }
        X50 x50 = this.y;
        if (x50 == null) {
            return false;
        }
        boolean zE = x50.e();
        boolean zF = this.y.f();
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        this.e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.K) {
                this.K = false;
            }
            this.d0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.h0 = x;
            this.f0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.i0 = y;
            this.g0 = y;
            EdgeEffect edgeEffect = this.U;
            if (edgeEffect == null || AbstractC1923jt0.n(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                AbstractC1923jt0.x(this.U, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.W;
            if (edgeEffect2 != null && AbstractC1923jt0.n(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                AbstractC1923jt0.x(this.W, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.V;
            if (edgeEffect3 != null && AbstractC1923jt0.n(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                AbstractC1923jt0.x(this.V, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.a0;
            if (edgeEffect4 != null && AbstractC1923jt0.n(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                AbstractC1923jt0.x(this.a0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z = true;
            }
            if (z || this.c0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                o0(1);
            }
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zE;
            if (zF) {
                i = (zE ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i, 0);
        } else if (actionMasked == 1) {
            this.e0.clear();
            o0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.c0 != 1) {
                int i2 = x2 - this.f0;
                int i3 = y2 - this.g0;
                if (!zE || Math.abs(i2) <= this.j0) {
                    z2 = false;
                } else {
                    this.h0 = x2;
                    z2 = true;
                }
                if (zF && Math.abs(i3) > this.j0) {
                    this.i0 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            d0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.d0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.h0 = x3;
            this.f0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.i0 = y3;
            this.g0 = y3;
        } else if (actionMasked == 6) {
            V(motionEvent);
        }
        return this.c0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = Vl0.a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.G = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        X50 x50 = this.y;
        if (x50 == null) {
            o(i, i2);
            return;
        }
        boolean zS = x50.S();
        C1266d60 c1266d60 = this.n;
        boolean z = false;
        C1755i60 c1755i60 = this.t0;
        if (zS) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.y.q0(c1266d60, c1755i60, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.I0 = z;
            if (z || this.x == null) {
                return;
            }
            if (c1755i60.d == 1) {
                r();
            }
            this.y.L0(i, i2);
            c1755i60.i = true;
            s();
            this.y.N0(i, i2);
            if (this.y.Q0()) {
                this.y.L0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c1755i60.i = true;
                s();
                this.y.N0(i, i2);
            }
            this.J0 = getMeasuredWidth();
            this.K0 = getMeasuredHeight();
            return;
        }
        if (this.F) {
            this.y.q0(c1266d60, c1755i60, i, i2);
            return;
        }
        if (this.M) {
            m0();
            T();
            X();
            U(true);
            if (c1755i60.k) {
                c1755i60.g = true;
            } else {
                this.p.d();
                c1755i60.g = false;
            }
            this.M = false;
            n0(false);
        } else if (c1755i60.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        O50 o50 = this.x;
        if (o50 != null) {
            c1755i60.e = o50.a();
        } else {
            c1755i60.e = 0;
        }
        m0();
        this.y.q0(c1266d60, c1755i60, i, i2);
        n0(false);
        c1755i60.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1559g60)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1559g60 c1559g60 = (C1559g60) parcelable;
        this.f31o = c1559g60;
        super.onRestoreInstanceState(c1559g60.l);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1559g60 c1559g60 = new C1559g60(super.onSaveInstanceState());
        C1559g60 c1559g61 = this.f31o;
        if (c1559g61 != null) {
            c1559g60.n = c1559g61.n;
        } else {
            X50 x50 = this.y;
            if (x50 != null) {
                c1559g60.n = x50.t0();
            } else {
                c1559g60.n = null;
            }
        }
        return c1559g60;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x0336  */
    /* JADX WARN: Code duplicated, block: B:196:0x0378  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:299:0x04c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0 A[PHI: r0
  0x01e0: PHI (r0v54 int) = (r0v39 int), (r0v58 int) binds: [B:88:0x01c9, B:92:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zD;
        RecyclerView recyclerView;
        int i;
        MotionEvent motionEvent2;
        int iMax;
        int i2;
        RunnableC2047l60 runnableC2047l60;
        MotionEvent motionEvent3;
        int minFlingVelocity;
        boolean z;
        AbstractC0351Cp abstractC0351CpF;
        int iN;
        PointF pointFA;
        RunnableC2047l60 runnableC2047l61;
        int i3;
        RecyclerView recyclerView2;
        boolean z2;
        if (this.J || this.K) {
            return false;
        }
        C0640Nt c0640Nt = this.D;
        if (c0640Nt == null) {
            zD = motionEvent.getAction() == 0 ? false : D(motionEvent);
        } else {
            if (c0640Nt.v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zE = c0640Nt.e(motionEvent.getX(), motionEvent.getY());
                    boolean zD2 = c0640Nt.d(motionEvent.getX(), motionEvent.getY());
                    if (zE || zD2) {
                        if (zD2) {
                            c0640Nt.w = 1;
                            c0640Nt.p = (int) motionEvent.getX();
                        } else if (zE) {
                            c0640Nt.w = 2;
                            c0640Nt.m = (int) motionEvent.getY();
                        }
                        c0640Nt.g(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0640Nt.v == 2) {
                    c0640Nt.m = 0.0f;
                    c0640Nt.p = 0.0f;
                    c0640Nt.g(1);
                    c0640Nt.w = 0;
                } else if (motionEvent.getAction() == 2 && c0640Nt.v == 2) {
                    c0640Nt.h();
                    int i4 = c0640Nt.w;
                    int i5 = c0640Nt.b;
                    if (i4 == 1) {
                        float x = motionEvent.getX();
                        int[] iArr = c0640Nt.y;
                        iArr[0] = i5;
                        int i6 = c0640Nt.q - i5;
                        iArr[1] = i6;
                        float fMax = Math.max(i5, Math.min(i6, x));
                        if (Math.abs(c0640Nt.f419o - fMax) >= 2.0f) {
                            int iF = C0640Nt.f(c0640Nt.p, fMax, iArr, c0640Nt.s.computeHorizontalScrollRange(), c0640Nt.s.computeHorizontalScrollOffset(), c0640Nt.q);
                            if (iF != 0) {
                                c0640Nt.s.scrollBy(iF, 0);
                            }
                            c0640Nt.p = fMax;
                        }
                    }
                    if (c0640Nt.w == 2) {
                        float y = motionEvent.getY();
                        int[] iArr2 = c0640Nt.x;
                        iArr2[0] = i5;
                        int i7 = c0640Nt.r - i5;
                        iArr2[1] = i7;
                        float fMax2 = Math.max(i5, Math.min(i7, y));
                        if (Math.abs(c0640Nt.l - fMax2) >= 2.0f) {
                            int iF2 = C0640Nt.f(c0640Nt.m, fMax2, iArr2, c0640Nt.s.computeVerticalScrollRange(), c0640Nt.s.computeVerticalScrollOffset(), c0640Nt.r);
                            if (iF2 != 0) {
                                c0640Nt.s.scrollBy(0, iF2);
                            }
                            c0640Nt.m = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.D = null;
            }
            zD = true;
        }
        if (zD) {
            d0();
            setScrollState(0);
            return true;
        }
        X50 x50 = this.y;
        if (x50 == null) {
            return false;
        }
        boolean zE2 = x50.e();
        boolean zF = this.y.f();
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.E0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax2 = this.h0 - x2;
                    int iMax3 = this.i0 - y2;
                    if (this.c0 != 1) {
                        if (zE2) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.j0) : Math.min(0, iMax2 + this.j0);
                            if (iMax2 != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        if (zF) {
                            iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.j0) : Math.min(0, iMax3 + this.j0);
                            if (iMax3 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                    if (this.c0 == 1) {
                        int[] iArr4 = this.F0;
                        iArr4[0] = 0;
                        iArr4[1] = 0;
                        int iA0 = iMax2 - a0(iMax2, motionEvent.getY());
                        int iB0 = iMax3 - b0(iMax3, motionEvent.getX());
                        boolean zT = t(zE2 ? iA0 : 0, zF ? iB0 : 0, 0, this.F0, this.D0);
                        int[] iArr5 = this.D0;
                        if (zT) {
                            iA0 -= iArr4[0];
                            iB0 -= iArr4[1];
                            iArr3[0] = iArr3[0] + iArr5[0];
                            iArr3[1] = iArr3[1] + iArr5[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i8 = iA0;
                        int i9 = iB0;
                        this.h0 = x2 - iArr5[0];
                        this.i0 = y2 - iArr5[1];
                        if (e0(zE2 ? i8 : 0, zF ? i9 : 0, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC1544fz runnableC1544fz = this.r0;
                        if (runnableC1544fz != null && (i8 != 0 || i9 != 0)) {
                            runnableC1544fz.a(this, i8, i9);
                        }
                    }
                } else if (actionMasked == 3) {
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.d0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.h0 = x3;
                    this.f0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.i0 = y3;
                    this.g0 = y3;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                recyclerView = this;
            } else {
                this.e0.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.e0;
                int i10 = this.m0;
                velocityTracker.computeCurrentVelocity(1000, i10);
                float f = zE2 ? -this.e0.getXVelocity(this.d0) : 0.0f;
                float f2 = zF ? -this.e0.getYVelocity(this.d0) : 0.0f;
                if (f == 0.0f && f2 == 0.0f) {
                    recyclerView2 = this;
                    motionEvent3 = motionEventObtain;
                    i3 = 0;
                } else {
                    int i11 = (int) f;
                    int iMax4 = (int) f2;
                    X50 x51 = this.y;
                    if (x51 == null || this.J) {
                        motionEvent3 = motionEventObtain;
                        i3 = 0;
                        recyclerView2 = this;
                    } else {
                        int iE = x51.e();
                        boolean zF2 = this.y.f();
                        int i12 = this.l0;
                        if (iE == 0 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (!zF2 || Math.abs(iMax4) < i12) {
                            iMax4 = 0;
                        }
                        if (i11 == 0 && iMax4 == 0) {
                            motionEvent3 = motionEventObtain;
                            i3 = 0;
                            recyclerView2 = this;
                        } else {
                            if (i11 == 0) {
                                iMax = 0;
                            } else {
                                EdgeEffect edgeEffect = this.U;
                                if (edgeEffect == null || AbstractC1923jt0.n(edgeEffect) == 0.0f) {
                                    EdgeEffect edgeEffect2 = this.W;
                                    if (edgeEffect2 == null || AbstractC1923jt0.n(edgeEffect2) == 0.0f) {
                                        iMax = 0;
                                    } else if (h0(this.W, i11, getWidth())) {
                                        this.W.onAbsorb(i11);
                                        i11 = 0;
                                    }
                                } else {
                                    int i13 = -i11;
                                    if (h0(this.U, i13, getWidth())) {
                                        this.U.onAbsorb(i13);
                                        i11 = 0;
                                    }
                                }
                                iMax = i11;
                                i11 = 0;
                            }
                            if (iMax4 == 0) {
                                i2 = iMax4;
                                iMax4 = 0;
                            } else {
                                EdgeEffect edgeEffect3 = this.V;
                                if (edgeEffect3 == null || AbstractC1923jt0.n(edgeEffect3) == 0.0f) {
                                    EdgeEffect edgeEffect4 = this.a0;
                                    if (edgeEffect4 == null || AbstractC1923jt0.n(edgeEffect4) == 0.0f) {
                                        i2 = iMax4;
                                        iMax4 = 0;
                                    } else if (h0(this.a0, iMax4, getHeight())) {
                                        this.a0.onAbsorb(iMax4);
                                        iMax4 = 0;
                                    }
                                } else {
                                    int i14 = -iMax4;
                                    if (h0(this.V, i14, getHeight())) {
                                        this.V.onAbsorb(i14);
                                        iMax4 = 0;
                                    }
                                }
                                i2 = 0;
                            }
                            RunnableC2047l60 runnableC2047l62 = this.q0;
                            if (iMax != 0 || iMax4 != 0) {
                                int i15 = -i10;
                                iMax = Math.max(i15, Math.min(iMax, i10));
                                iMax4 = Math.max(i15, Math.min(iMax4, i10));
                                runnableC2047l62.a(iMax, iMax4);
                            }
                            if (i11 == 0 && i2 == 0) {
                                if (iMax != 0 || iMax4 != 0) {
                                    motionEvent3 = motionEventObtain;
                                }
                                motionEvent3 = motionEventObtain;
                                i3 = 0;
                                recyclerView2 = this;
                            } else {
                                float f3 = i11;
                                float f4 = i2;
                                if (dispatchNestedPreFling(f3, f4)) {
                                    motionEvent3 = motionEventObtain;
                                } else {
                                    boolean z3 = iE != 0 || zF2;
                                    dispatchNestedFling(f3, f4, z3);
                                    Z50 z50 = this.k0;
                                    if (z50 != null) {
                                        XW xw = (XW) z50;
                                        X50 layoutManager = xw.a.getLayoutManager();
                                        if (layoutManager == 0 || xw.a.getAdapter() == null || ((Math.abs(i2) <= (minFlingVelocity = xw.a.getMinFlingVelocity()) && Math.abs(i11) <= minFlingVelocity) || !((z = layoutManager instanceof InterfaceC1657h60)))) {
                                            runnableC2047l60 = runnableC2047l62;
                                            motionEvent3 = motionEventObtain;
                                            if (z3) {
                                                if (zF2) {
                                                    iE = (iE == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().h(iE, 1);
                                                int i16 = -i10;
                                                runnableC2047l60.a(Math.max(i16, Math.min(i11, i10)), Math.max(i16, Math.min(i2, i10)));
                                            }
                                        } else {
                                            C0571Lb c0571Lb = !z ? null : new C0571Lb(xw, xw.a.getContext(), 1);
                                            if (c0571Lb == null) {
                                                runnableC2047l60 = runnableC2047l62;
                                                motionEvent3 = motionEventObtain;
                                            } else {
                                                int iH = layoutManager.H();
                                                if (iH != 0) {
                                                    if (layoutManager.f()) {
                                                        abstractC0351CpF = xw.g(layoutManager);
                                                    } else {
                                                        abstractC0351CpF = layoutManager.e() ? xw.f(layoutManager) : null;
                                                    }
                                                    if (abstractC0351CpF == null) {
                                                        runnableC2047l60 = runnableC2047l62;
                                                        motionEvent3 = motionEventObtain;
                                                    } else {
                                                        int iX = layoutManager.x();
                                                        motionEvent3 = motionEventObtain;
                                                        int i17 = Integer.MAX_VALUE;
                                                        int i18 = 0;
                                                        int i19 = Integer.MIN_VALUE;
                                                        View view = null;
                                                        View view2 = null;
                                                        while (i18 < iX) {
                                                            int i20 = iX;
                                                            View viewW = layoutManager.w(i18);
                                                            if (viewW == null) {
                                                                runnableC2047l61 = runnableC2047l62;
                                                            } else {
                                                                runnableC2047l61 = runnableC2047l62;
                                                                int iC = XW.c(viewW, abstractC0351CpF);
                                                                if (iC <= 0 && iC > i19) {
                                                                    view2 = viewW;
                                                                    i19 = iC;
                                                                }
                                                                if (iC >= 0 && iC < i17) {
                                                                    view = viewW;
                                                                    i17 = iC;
                                                                }
                                                            }
                                                            i18++;
                                                            iX = i20;
                                                            runnableC2047l62 = runnableC2047l61;
                                                        }
                                                        runnableC2047l60 = runnableC2047l62;
                                                        boolean z4 = !layoutManager.e() ? i2 <= 0 : i11 <= 0;
                                                        if (z4 && view != null) {
                                                            iN = X50.N(view);
                                                        } else if (z4 || view2 == null) {
                                                            if (z4) {
                                                                view = view2;
                                                            }
                                                            if (view != null) {
                                                                iN = ((z && (pointFA = ((InterfaceC1657h60) layoutManager).a(layoutManager.H() - 1)) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == z4 ? -1 : 1) + X50.N(view);
                                                                if (iN < 0 || iN >= iH) {
                                                                }
                                                            }
                                                        } else {
                                                            iN = X50.N(view2);
                                                        }
                                                    }
                                                    iN = -1;
                                                } else {
                                                    runnableC2047l60 = runnableC2047l62;
                                                    motionEvent3 = motionEventObtain;
                                                    iN = -1;
                                                }
                                                if (iN != -1) {
                                                    c0571Lb.a = iN;
                                                    layoutManager.T0(c0571Lb);
                                                }
                                            }
                                            if (z3) {
                                                if (zF2) {
                                                    iE = (iE == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().h(iE, 1);
                                                int i110 = -i10;
                                                runnableC2047l60.a(Math.max(i110, Math.min(i11, i10)), Math.max(i110, Math.min(i2, i10)));
                                            }
                                        }
                                    } else {
                                        runnableC2047l60 = runnableC2047l62;
                                        motionEvent3 = motionEventObtain;
                                        if (z3) {
                                            if (zF2) {
                                                iE = (iE == true ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().h(iE, 1);
                                            int i111 = -i10;
                                            runnableC2047l60.a(Math.max(i111, Math.min(i11, i10)), Math.max(i111, Math.min(i2, i10)));
                                        }
                                    }
                                }
                                i3 = 0;
                                recyclerView2 = this;
                            }
                        }
                    }
                    d0();
                    motionEvent2 = motionEvent3;
                }
                recyclerView2.setScrollState(i3);
                d0();
                motionEvent2 = motionEvent3;
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.d0 = motionEvent.getPointerId(0);
        int x4 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.h0 = x4;
        recyclerView.f0 = x4;
        int y4 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.i0 = y4;
        recyclerView.g0 = y4;
        if (zF) {
            i = zE2;
            i = (zE2 ? 1 : 0) | 2;
        }
        i = zE2;
        getScrollingChildHelper().h(i, 0);
        motionEvent2 = motionEventObtain;
        recyclerView.e0.addMovement(motionEvent2);
        motionEvent2.recycle();
        return true;
    }

    public final void p(View view) {
        L(view);
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1437eu0) this.O.get(size)).getClass();
            }
        }
    }

    public final void p0() {
        C2645rK c2645rK;
        setScrollState(0);
        RunnableC2047l60 runnableC2047l60 = this.q0;
        runnableC2047l60.r.removeCallbacks(runnableC2047l60);
        runnableC2047l60.n.abortAnimation();
        X50 x50 = this.y;
        if (x50 == null || (c2645rK = x50.e) == null) {
            return;
        }
        c2645rK.j();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x031e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0364  */
    /* JADX WARN: Code duplicated, block: B:183:0x0367  */
    /* JADX WARN: Code duplicated, block: B:189:0x037e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0386  */
    /* JADX WARN: Code duplicated, block: B:193:0x038a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0392  */
    /* JADX WARN: Code duplicated, block: B:199:0x0399  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a3 A[LOOP:4: B:195:0x0390->B:202:0x03a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:208:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03bf A[LOOP:5: B:204:0x03ac->B:211:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:243:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03c2 A[EDGE_INSN: B:248:0x03c2->B:212:0x03c2 BREAK  A[LOOP:5: B:204:0x03ac->B:211:0x03bf], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
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
    public final void q() {
        long j;
        AbstractC2144m60 abstractC2144m60;
        int i;
        int iB;
        int i2;
        int iMin;
        AbstractC2144m60 abstractC2144m60G;
        View view;
        AbstractC2144m60 abstractC2144m60G2;
        View view2;
        int i3;
        View viewFindViewById;
        ArrayList arrayList;
        View view3;
        boolean z;
        C2650rP c2650rP;
        ?? r2;
        boolean zG;
        if (this.x == null || this.y == null) {
            return;
        }
        C1755i60 c1755i60 = this.t0;
        boolean z2 = false;
        c1755i60.i = false;
        boolean z3 = this.I0 && !(this.J0 == getWidth() && this.K0 == getHeight());
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = false;
        if (c1755i60.d == 1) {
            r();
            this.y.J0(this);
            s();
        } else {
            Y1 y1 = this.p;
            if ((((ArrayList) y1.d).isEmpty() || ((ArrayList) y1.c).isEmpty()) && !z3 && this.y.n == getWidth() && this.y.f613o == getHeight()) {
                this.y.J0(this);
            } else {
                this.y.J0(this);
                s();
            }
        }
        c1755i60.a(4);
        m0();
        T();
        c1755i60.d = 1;
        boolean z4 = c1755i60.j;
        C1266d60 c1266d60 = this.n;
        Vm0 vm0 = this.r;
        if (z4) {
            for (int iZ = this.q.z() - 1; iZ >= 0; iZ--) {
                AbstractC2144m60 abstractC2144m60L = L(this.q.y(iZ));
                if (!abstractC2144m60L.s()) {
                    long J = J(abstractC2144m60L);
                    this.b0.getClass();
                    C2650rP c2650rP2 = new C2650rP();
                    c2650rP2.b(abstractC2144m60L);
                    AbstractC2144m60 abstractC2144m61 = (AbstractC2144m60) ((C1480fM) vm0.n).e(J);
                    if (abstractC2144m61 == null || abstractC2144m61.s()) {
                        vm0.a(abstractC2144m60L, c2650rP2);
                    } else {
                        Nd0 nd0 = (Nd0) vm0.m;
                        St0 st0 = (St0) nd0.get(abstractC2144m61);
                        boolean z5 = (st0 == null || (st0.a & 1) == 0) ? false : true;
                        St0 st1 = (St0) nd0.get(abstractC2144m60L);
                        boolean z6 = (st1 == null || (st1.a & 1) == 0) ? false : true;
                        if (z5 && abstractC2144m61 == abstractC2144m60L) {
                            vm0.a(abstractC2144m60L, c2650rP2);
                        } else {
                            C2650rP c2650rPF = vm0.f(abstractC2144m61, 4);
                            vm0.a(abstractC2144m60L, c2650rP2);
                            C2650rP c2650rPF2 = vm0.f(abstractC2144m60L, 8);
                            if (c2650rPF == null) {
                                int iZ2 = this.q.z();
                                for (int i4 = 0; i4 < iZ2; i4++) {
                                    AbstractC2144m60 abstractC2144m60L2 = L(this.q.y(i4));
                                    if (abstractC2144m60L2 != abstractC2144m60L && J(abstractC2144m60L2) == J) {
                                        O50 o50 = this.x;
                                        if (o50 == null || !o50.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC2144m60L2 + " \n View Holder 2:" + abstractC2144m60L + A());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC2144m60L2 + " \n View Holder 2:" + abstractC2144m60L + A());
                                    }
                                }
                                Objects.toString(abstractC2144m61);
                                Objects.toString(abstractC2144m60L);
                                A();
                            } else {
                                abstractC2144m61.r(false);
                                if (z5) {
                                    f(abstractC2144m61);
                                }
                                if (abstractC2144m61 != abstractC2144m60L) {
                                    if (z6) {
                                        f(abstractC2144m60L);
                                    }
                                    abstractC2144m61.h = abstractC2144m60L;
                                    f(abstractC2144m61);
                                    c1266d60.m(abstractC2144m61);
                                    abstractC2144m60L.r(false);
                                    abstractC2144m60L.i = abstractC2144m61;
                                }
                                if (this.b0.a(abstractC2144m61, abstractC2144m60L, c2650rPF, c2650rPF2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
            }
            Nd0 nd1 = (Nd0) vm0.m;
            int i5 = nd1.n - 1;
            while (i5 >= 0) {
                AbstractC2144m60 abstractC2144m62 = (AbstractC2144m60) nd1.f(i5);
                St0 st2 = (St0) nd1.h(i5);
                int i6 = st2.a;
                int i7 = i6 & 3;
                N50 n50 = this.L0;
                if (i7 == 3) {
                    RecyclerView recyclerView = n50.a;
                    recyclerView.y.z0(abstractC2144m62.a, recyclerView.n);
                    r2 = z2;
                } else if ((i6 & 1) != 0) {
                    C2650rP c2650rP3 = st2.b;
                    if (c2650rP3 == null) {
                        RecyclerView recyclerView2 = n50.a;
                        recyclerView2.y.z0(abstractC2144m62.a, recyclerView2.n);
                        r2 = z2;
                    } else {
                        n50.f(abstractC2144m62, c2650rP3, st2.c);
                        r2 = z2;
                    }
                } else if ((i6 & 14) == 14) {
                    n50.e(abstractC2144m62, st2.b, st2.c);
                    r2 = z2;
                } else {
                    if ((i6 & 12) == 12) {
                        C2650rP c2650rP4 = st2.b;
                        C2650rP c2650rP5 = st2.c;
                        n50.getClass();
                        abstractC2144m62.r(z2);
                        RecyclerView recyclerView3 = n50.a;
                        if (!recyclerView3.P) {
                            C1418el c1418el = (C1418el) recyclerView3.b0;
                            c1418el.getClass();
                            int i8 = c2650rP4.a;
                            int i9 = c2650rP5.a;
                            if (i8 == i9 && c2650rP4.b == c2650rP5.b) {
                                c1418el.c(abstractC2144m62);
                                zG = false;
                            } else {
                                zG = c1418el.g(abstractC2144m62, i8, c2650rP4.b, i9, c2650rP5.b);
                            }
                            if (zG) {
                                recyclerView3.W();
                            }
                        } else if (recyclerView3.b0.a(abstractC2144m62, abstractC2144m62, c2650rP4, c2650rP5)) {
                            recyclerView3.W();
                        }
                        r2 = 0;
                    } else {
                        if ((i6 & 4) != 0) {
                            c2650rP = null;
                            n50.f(abstractC2144m62, st2.b, null);
                        } else {
                            c2650rP = null;
                            if ((i6 & 8) != 0) {
                                n50.e(abstractC2144m62, st2.b, st2.c);
                            }
                        }
                        r2 = 0;
                    }
                    st2.a = r2;
                    st2.b = c2650rP;
                    st2.c = c2650rP;
                    St0.d.e(st2);
                    i5--;
                    z2 = false;
                }
                c2650rP = null;
                st2.a = r2;
                st2.b = c2650rP;
                st2.c = c2650rP;
                St0.d.e(st2);
                i5--;
                z2 = false;
            }
        }
        View view4 = null;
        this.y.y0(c1266d60);
        c1755i60.b = c1755i60.e;
        this.P = false;
        this.Q = false;
        c1755i60.j = false;
        c1755i60.k = false;
        this.y.f = false;
        ArrayList arrayList2 = c1266d60.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        X50 x50 = this.y;
        if (x50.k) {
            x50.j = 0;
            x50.k = false;
            c1266d60.n();
        }
        this.y.p0(c1755i60);
        U(true);
        n0(false);
        ((Nd0) vm0.m).clear();
        ((C1480fM) vm0.n).c();
        int[] iArr = this.B0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        E(iArr);
        if ((iArr[0] == i10 && iArr[1] == i11) ? false : true) {
            v(0, 0);
        }
        if (this.p0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = c1755i60.m;
                if (j == -1) {
                    abstractC2144m60 = null;
                } else {
                    abstractC2144m60 = null;
                }
                if (abstractC2144m60 != null) {
                    arrayList = (ArrayList) this.q.f414o;
                    view3 = abstractC2144m60.a;
                    if (!arrayList.contains(view3)) {
                        if (this.q.z() > 0) {
                            int i12 = c1755i60.l;
                            if (i12 != -1) {
                            }
                            iB = c1755i60.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    abstractC2144m60G2 = G(i2);
                                    if (abstractC2144m60G2 != null) {
                                        view2 = abstractC2144m60G2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    abstractC2144m60G = G(iMin);
                                    if (abstractC2144m60G == null) {
                                        break;
                                        break;
                                    }
                                    view = abstractC2144m60G.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.q.z() > 0) {
                        int i13 = c1755i60.l;
                        if (i13 != -1) {
                        }
                        iB = c1755i60.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                abstractC2144m60G2 = G(i2);
                                if (abstractC2144m60G2 != null) {
                                    view2 = abstractC2144m60G2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC2144m60G = G(iMin);
                                if (abstractC2144m60G == null) {
                                    break;
                                    break;
                                }
                                view = abstractC2144m60G.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.q.z() > 0) {
                    int i14 = c1755i60.l;
                    if (i14 != -1) {
                    }
                    iB = c1755i60.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            abstractC2144m60G2 = G(i2);
                            if (abstractC2144m60G2 != null) {
                                view2 = abstractC2144m60G2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC2144m60G = G(iMin);
                            if (abstractC2144m60G == null) {
                                break;
                                break;
                            }
                            view = abstractC2144m60G.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c1755i60.n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.q.f414o).contains(getFocusedChild())) {
                j = c1755i60.m;
                if (j == -1 && (z = this.x.b) && z) {
                    int iE = this.q.E();
                    abstractC2144m60 = null;
                    for (int i15 = 0; i15 < iE; i15++) {
                        AbstractC2144m60 abstractC2144m60L3 = L(this.q.D(i15));
                        if (abstractC2144m60L3 != null && !abstractC2144m60L3.l() && abstractC2144m60L3.e == j) {
                            if (!((ArrayList) this.q.f414o).contains(abstractC2144m60L3.a)) {
                                abstractC2144m60 = abstractC2144m60L3;
                                break;
                            }
                            abstractC2144m60 = abstractC2144m60L3;
                        }
                    }
                } else {
                    abstractC2144m60 = null;
                }
                if (abstractC2144m60 != null) {
                    arrayList = (ArrayList) this.q.f414o;
                    view3 = abstractC2144m60.a;
                    if (!arrayList.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.q.z() > 0) {
                        int i16 = c1755i60.l;
                        i = i16 != -1 ? i16 : 0;
                        iB = c1755i60.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                abstractC2144m60G2 = G(i2);
                                if (abstractC2144m60G2 != null) {
                                    view2 = abstractC2144m60G2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC2144m60G = G(iMin);
                                if (abstractC2144m60G == null) {
                                    break;
                                }
                                view = abstractC2144m60G.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.q.z() > 0) {
                    int i17 = c1755i60.l;
                    if (i17 != -1) {
                    }
                    iB = c1755i60.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            abstractC2144m60G2 = G(i2);
                            if (abstractC2144m60G2 != null) {
                                view2 = abstractC2144m60G2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC2144m60G = G(iMin);
                            if (abstractC2144m60G == null) {
                                break;
                                break;
                            }
                            view = abstractC2144m60G.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c1755i60.n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        c1755i60.m = -1L;
        c1755i60.l = -1;
        c1755i60.n = -1;
    }

    public final void r() {
        St0 st0;
        View viewC;
        C1755i60 c1755i60 = this.t0;
        c1755i60.a(1);
        B(c1755i60);
        c1755i60.i = false;
        m0();
        Vm0 vm0 = this.r;
        ((Nd0) vm0.m).clear();
        C1480fM c1480fM = (C1480fM) vm0.n;
        c1480fM.c();
        T();
        X();
        AbstractC2144m60 abstractC2144m60K = null;
        View focusedChild = (this.p0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewC = C(focusedChild)) != null) {
            abstractC2144m60K = K(viewC);
        }
        if (abstractC2144m60K == null) {
            c1755i60.m = -1L;
            c1755i60.l = -1;
            c1755i60.n = -1;
        } else {
            c1755i60.m = this.x.b ? abstractC2144m60K.e : -1L;
            c1755i60.l = this.P ? -1 : abstractC2144m60K.l() ? abstractC2144m60K.d : abstractC2144m60K.c();
            View focusedChild2 = abstractC2144m60K.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c1755i60.n = id;
        }
        c1755i60.h = c1755i60.j && this.x0;
        this.x0 = false;
        this.w0 = false;
        c1755i60.g = c1755i60.k;
        c1755i60.e = this.x.a();
        E(this.B0);
        boolean z = c1755i60.j;
        Nd0 nd0 = (Nd0) vm0.m;
        if (z) {
            int iZ = this.q.z();
            for (int i = 0; i < iZ; i++) {
                AbstractC2144m60 abstractC2144m60L = L(this.q.y(i));
                if (!abstractC2144m60L.s() && (!abstractC2144m60L.j() || this.x.b)) {
                    T50 t50 = this.b0;
                    T50.b(abstractC2144m60L);
                    abstractC2144m60L.f();
                    t50.getClass();
                    C2650rP c2650rP = new C2650rP();
                    c2650rP.b(abstractC2144m60L);
                    St0 st0A = (St0) nd0.get(abstractC2144m60L);
                    if (st0A == null) {
                        st0A = St0.a();
                        nd0.put(abstractC2144m60L, st0A);
                    }
                    st0A.b = c2650rP;
                    st0A.a |= 4;
                    if (c1755i60.h && abstractC2144m60L.o() && !abstractC2144m60L.l() && !abstractC2144m60L.s() && !abstractC2144m60L.j()) {
                        c1480fM.j(J(abstractC2144m60L), abstractC2144m60L);
                    }
                }
            }
        }
        if (c1755i60.k) {
            int iE = this.q.E();
            for (int i2 = 0; i2 < iE; i2++) {
                AbstractC2144m60 abstractC2144m60L2 = L(this.q.D(i2));
                if (!abstractC2144m60L2.s() && abstractC2144m60L2.d == -1) {
                    abstractC2144m60L2.d = abstractC2144m60L2.c;
                }
            }
            boolean z2 = c1755i60.f;
            c1755i60.f = false;
            this.y.o0(this.n, c1755i60);
            c1755i60.f = z2;
            for (int i3 = 0; i3 < this.q.z(); i3++) {
                AbstractC2144m60 abstractC2144m60L3 = L(this.q.y(i3));
                if (!abstractC2144m60L3.s() && ((st0 = (St0) nd0.get(abstractC2144m60L3)) == null || (st0.a & 4) == 0)) {
                    T50.b(abstractC2144m60L3);
                    boolean zG = abstractC2144m60L3.g(C1672hI.a.e);
                    T50 t51 = this.b0;
                    abstractC2144m60L3.f();
                    t51.getClass();
                    C2650rP c2650rP2 = new C2650rP();
                    c2650rP2.b(abstractC2144m60L3);
                    if (zG) {
                        Z(abstractC2144m60L3, c2650rP2);
                    } else {
                        St0 st0A2 = (St0) nd0.get(abstractC2144m60L3);
                        if (st0A2 == null) {
                            st0A2 = St0.a();
                            nd0.put(abstractC2144m60L3, st0A2);
                        }
                        st0A2.a |= 2;
                        st0A2.b = c2650rP2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        U(true);
        n0(false);
        c1755i60.d = 2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC2144m60 abstractC2144m60L = L(view);
        if (abstractC2144m60L != null) {
            if (abstractC2144m60L.n()) {
                abstractC2144m60L.j &= -257;
            } else if (!abstractC2144m60L.s()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC2144m60L + A());
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.y.r0(this, view, view2) && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.y.C0(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0640Nt) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H != 0 || this.J) {
            this.I = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        m0();
        T();
        C1755i60 c1755i60 = this.t0;
        c1755i60.a(6);
        this.p.d();
        c1755i60.e = this.x.a();
        c1755i60.c = 0;
        if (this.f31o != null) {
            O50 o50 = this.x;
            int iW = AbstractC1701hf0.w(o50.c);
            if (iW == 1 ? o50.a() > 0 : iW != 2) {
                Parcelable parcelable = this.f31o.n;
                if (parcelable != null) {
                    this.y.s0(parcelable);
                }
                this.f31o = null;
            }
        }
        c1755i60.g = false;
        this.y.o0(this.n, c1755i60);
        c1755i60.f = false;
        c1755i60.j = c1755i60.j && this.b0 != null;
        c1755i60.d = 4;
        U(true);
        n0(false);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        X50 x50 = this.y;
        if (x50 == null || this.J) {
            return;
        }
        boolean zE = x50.e();
        boolean zF = this.y.f();
        if (zE || zF) {
            if (!zE) {
                i = 0;
            }
            if (!zF) {
                i2 = 0;
            }
            e0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.L |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C2338o60 c2338o60) {
        this.A0 = c2338o60;
        It0.p(this, c2338o60);
    }

    public void setAdapter(O50 o50) {
        setLayoutFrozen(false);
        O50 o51 = this.x;
        C1461f60 c1461f60 = this.m;
        if (o51 != null) {
            o51.a.unregisterObserver(c1461f60);
            this.x.getClass();
        }
        T50 t50 = this.b0;
        if (t50 != null) {
            t50.e();
        }
        X50 x50 = this.y;
        C1266d60 c1266d60 = this.n;
        if (x50 != null) {
            x50.x0(c1266d60);
            this.y.y0(c1266d60);
        }
        c1266d60.a.clear();
        c1266d60.g();
        Y1 y1 = this.p;
        y1.r((ArrayList) y1.c);
        y1.r((ArrayList) y1.d);
        y1.a = 0;
        O50 o52 = this.x;
        this.x = o50;
        if (o50 != null) {
            o50.a.registerObserver(c1461f60);
        }
        X50 x51 = this.y;
        if (x51 != null) {
            x51.Y(o52);
        }
        O50 o53 = this.x;
        c1266d60.a.clear();
        c1266d60.g();
        c1266d60.f(o52, true);
        C1168c60 c1168c60C = c1266d60.c();
        if (o52 != null) {
            c1168c60C.b--;
        }
        if (c1168c60C.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c1168c60C.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                C1071b60 c1071b60 = (C1071b60) sparseArray.valueAt(i);
                Iterator it = c1071b60.a.iterator();
                while (it.hasNext()) {
                    AbstractC1376eG.e(((AbstractC2144m60) it.next()).a);
                }
                c1071b60.a.clear();
                i++;
            }
        }
        if (o53 != null) {
            c1168c60C.b++;
        }
        c1266d60.e();
        this.t0.f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(R50 r50) {
        if (r50 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.s) {
            this.a0 = null;
            this.V = null;
            this.W = null;
            this.U = null;
        }
        this.s = z;
        super.setClipToPadding(z);
        if (this.G) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(S50 s50) {
        s50.getClass();
        this.T = s50;
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    public void setHasFixedSize(boolean z) {
        this.F = z;
    }

    public void setItemAnimator(T50 t50) {
        T50 t51 = this.b0;
        if (t51 != null) {
            t51.e();
            this.b0.a = null;
        }
        this.b0 = t50;
        if (t50 != null) {
            t50.a = this.y0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1266d60 c1266d60 = this.n;
        c1266d60.e = i;
        c1266d60.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(X50 x50) {
        N50 n50;
        if (x50 == this.y) {
            return;
        }
        p0();
        X50 x51 = this.y;
        C1266d60 c1266d60 = this.n;
        if (x51 != null) {
            T50 t50 = this.b0;
            if (t50 != null) {
                t50.e();
            }
            this.y.x0(c1266d60);
            this.y.y0(c1266d60);
            c1266d60.a.clear();
            c1266d60.g();
            if (this.E) {
                X50 x52 = this.y;
                x52.g = false;
                x52.b0(this);
            }
            this.y.O0(null);
            this.y = null;
        } else {
            c1266d60.a.clear();
            c1266d60.g();
        }
        Na0 na0 = this.q;
        ((C3306y6) na0.n).N();
        ArrayList arrayList = (ArrayList) na0.f414o;
        int size = arrayList.size() - 1;
        while (true) {
            n50 = (N50) na0.m;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            n50.getClass();
            AbstractC2144m60 abstractC2144m60L = L(view);
            if (abstractC2144m60L != null) {
                int i = abstractC2144m60L.p;
                RecyclerView recyclerView = n50.a;
                if (recyclerView.P()) {
                    abstractC2144m60L.q = i;
                    recyclerView.G0.add(abstractC2144m60L);
                } else {
                    WeakHashMap weakHashMap = It0.a;
                    abstractC2144m60L.a.setImportantForAccessibility(i);
                }
                abstractC2144m60L.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = n50.a;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            recyclerView2.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.y = x50;
        if (x50 != null) {
            if (x50.b != null) {
                throw new IllegalArgumentException("LayoutManager " + x50 + " is already attached to a RecyclerView:" + x50.b.A());
            }
            x50.O0(this);
            if (this.E) {
                X50 x53 = this.y;
                x53.g = true;
                x53.a0(this);
            }
        }
        c1266d60.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        IU scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(Z50 z50) {
        this.k0 = z50;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0973a60 abstractC0973a60) {
        this.u0 = abstractC0973a60;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.p0 = z;
    }

    public void setRecycledViewPool(C1168c60 c1168c60) {
        C1266d60 c1266d60 = this.n;
        RecyclerView recyclerView = c1266d60.h;
        c1266d60.f(recyclerView.x, false);
        C1168c60 c1168c61 = c1266d60.g;
        if (c1168c61 != null) {
            c1168c61.b--;
        }
        c1266d60.g = c1168c60;
        if (c1168c60 != null && recyclerView.getAdapter() != null) {
            c1266d60.g.b++;
        }
        c1266d60.e();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1363e60 interfaceC1363e60) {
        this.z = interfaceC1363e60;
    }

    public void setScrollState(int i) {
        C2645rK c2645rK;
        if (i == this.c0) {
            return;
        }
        this.c0 = i;
        if (i != 2) {
            RunnableC2047l60 runnableC2047l60 = this.q0;
            runnableC2047l60.r.removeCallbacks(runnableC2047l60);
            runnableC2047l60.n.abortAnimation();
            X50 x50 = this.y;
            if (x50 != null && (c2645rK = x50.e) != null) {
                c2645rK.j();
            }
        }
        X50 x51 = this.y;
        if (x51 != null) {
            x51.u0(i);
        }
        AbstractC0973a60 abstractC0973a60 = this.u0;
        if (abstractC0973a60 != null) {
            abstractC0973a60.a(i, this);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0973a60) this.v0.get(size)).a(i, this);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.j0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.j0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(AbstractC1949k60 abstractC1949k60) {
        this.n.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.J) {
            i("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.J = true;
                this.K = true;
                p0();
                return;
            }
            this.J = false;
            if (this.I && this.y != null && this.x != null) {
                requestLayout();
            }
            this.I = false;
        }
    }

    public final boolean t(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void v(int i, int i2) {
        this.S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0973a60 abstractC0973a60 = this.u0;
        if (abstractC0973a60 != null) {
            abstractC0973a60.b(this, i, i2);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0973a60) this.v0.get(size)).b(this, i, i2);
            }
        }
        this.S--;
    }

    public final void w() {
        if (this.a0 != null) {
            return;
        }
        ((C1851j60) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.a0 = edgeEffect;
        if (this.s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void x() {
        if (this.U != null) {
            return;
        }
        ((C1851j60) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.U = edgeEffect;
        if (this.s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.W != null) {
            return;
        }
        ((C1851j60) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.W = edgeEffect;
        if (this.s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.V != null) {
            return;
        }
        ((C1851j60) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        float fA;
        int i2;
        char c;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        int i3 = 1;
        this.m = new C1461f60(this);
        this.n = new C1266d60(this);
        this.r = new Vm0();
        this.t = new L50(0, this);
        this.u = new Rect();
        this.v = new Rect();
        this.w = new RectF();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.H = 0;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = T0;
        C1418el c1418el = new C1418el();
        c1418el.a = null;
        c1418el.b = new ArrayList();
        c1418el.c = 120L;
        c1418el.d = 120L;
        c1418el.e = 250L;
        c1418el.f = 250L;
        c1418el.g = true;
        c1418el.h = new ArrayList();
        c1418el.i = new ArrayList();
        c1418el.j = new ArrayList();
        c1418el.k = new ArrayList();
        c1418el.l = new ArrayList();
        c1418el.m = new ArrayList();
        c1418el.n = new ArrayList();
        c1418el.f761o = new ArrayList();
        c1418el.p = new ArrayList();
        c1418el.q = new ArrayList();
        c1418el.r = new ArrayList();
        this.b0 = c1418el;
        this.c0 = 0;
        this.d0 = -1;
        this.n0 = Float.MIN_VALUE;
        this.o0 = Float.MIN_VALUE;
        this.p0 = true;
        this.q0 = new RunnableC2047l60(this);
        this.s0 = Q0 ? new C0702Qd() : null;
        C1755i60 c1755i60 = new C1755i60();
        c1755i60.a = -1;
        c1755i60.b = 0;
        c1755i60.c = 0;
        c1755i60.d = 1;
        c1755i60.e = 0;
        c1755i60.f = false;
        c1755i60.g = false;
        c1755i60.h = false;
        c1755i60.i = false;
        c1755i60.j = false;
        c1755i60.k = false;
        this.t0 = c1755i60;
        this.w0 = false;
        this.x0 = false;
        N50 n50 = new N50(this);
        this.y0 = n50;
        this.z0 = false;
        this.B0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new ArrayList();
        this.H0 = new L50(i3, this);
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = new N50(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = Mt0.a;
            fA = Jt0.a(viewConfiguration);
        } else {
            fA = Mt0.a(viewConfiguration, context);
        }
        this.n0 = fA;
        this.o0 = i4 >= 26 ? Jt0.b(viewConfiguration) : Mt0.a(viewConfiguration, context);
        this.l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.b0.a = n50;
        this.p = new Y1(new N50(this));
        this.q = new Na0(new N50(this));
        WeakHashMap weakHashMap = It0.a;
        if ((i4 >= 26 ? AbstractC3476zt0.c(this) : 0) == 0 && i4 >= 26) {
            AbstractC3476zt0.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2338o60(this));
        int[] iArr = E40.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + A());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c = 2;
            new C0640Nt(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.skidush.clonex.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.skidush.clonex.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.skidush.clonex.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(X50.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(R0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((X50) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                }
            }
        }
        int[] iArr2 = M0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        It0.o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.skidush.clonex.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        X50 x50 = this.y;
        if (x50 != null) {
            return x50.v(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }
}
