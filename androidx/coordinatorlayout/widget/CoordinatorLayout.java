package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o.AbstractC0706Qh;
import o.AbstractC2991ut0;
import o.AbstractC3045vW;
import o.AbstractC3185wt0;
import o.AbstractC3354yh;
import o.C0784Th;
import o.C0836Vh;
import o.C1583gR;
import o.C2133m1;
import o.C2136m20;
import o.C2650rP;
import o.InterfaceC0732Rh;
import o.InterfaceC1941k20;
import o.It0;
import o.JU;
import o.KU;
import o.Kw0;
import o.N2;
import o.N40;
import o.Nd0;
import o.Qd0;
import o.Qt0;
import o.ViewGroupOnHierarchyChangeListenerC0758Sh;
import o.ViewTreeObserverOnPreDrawListenerC0810Uh;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements JU, KU {
    public static final String E;
    public static final Class[] F;
    public static final ThreadLocal G;
    public static final N2 H;
    public static final C2136m20 I;
    public Drawable A;
    public ViewGroup.OnHierarchyChangeListener B;
    public C2133m1 C;
    public final C2650rP D;
    public final ArrayList l;
    public final C1583gR m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f14o;
    public final int[] p;
    public final int[] q;
    public boolean r;
    public boolean s;
    public final int[] t;
    public View u;
    public View v;
    public ViewTreeObserverOnPreDrawListenerC0810Uh w;
    public boolean x;
    public Kw0 y;
    public boolean z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        E = r0 != null ? r0.getName() : null;
        H = new N2(7);
        F = new Class[]{Context.class, AttributeSet.class};
        G = new ThreadLocal();
        I = new C2136m20(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.l = new ArrayList();
        this.m = new C1583gR(4);
        this.n = new ArrayList();
        this.f14o = new ArrayList();
        this.p = new int[2];
        this.q = new int[2];
        this.D = new C2650rP();
        int[] iArr = N40.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.t = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.t;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.A = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0758Sh(this));
        WeakHashMap weakHashMap = It0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) I.n();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C0784Th c0784Th, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c0784Th.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0784Th.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static C0784Th m(View view) {
        C0784Th c0784Th = (C0784Th) view.getLayoutParams();
        if (!c0784Th.b) {
            InterfaceC0732Rh interfaceC0732Rh = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0732Rh = (InterfaceC0732Rh) superclass.getAnnotation(InterfaceC0732Rh.class);
                if (interfaceC0732Rh != null) {
                    break;
                }
            }
            if (interfaceC0732Rh != null) {
                try {
                    AbstractC0706Qh abstractC0706Qh = (AbstractC0706Qh) interfaceC0732Rh.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0706Qh abstractC0706Qh2 = c0784Th.a;
                    if (abstractC0706Qh2 != abstractC0706Qh) {
                        if (abstractC0706Qh2 != null) {
                            abstractC0706Qh2.i();
                        }
                        c0784Th.a = abstractC0706Qh;
                        c0784Th.b = true;
                        if (abstractC0706Qh != null) {
                            abstractC0706Qh.g(c0784Th);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC0732Rh.value().getClass();
                }
            }
            c0784Th.b = true;
        }
        return c0784Th;
    }

    public static void t(View view, int i) {
        C0784Th c0784Th = (C0784Th) view.getLayoutParams();
        int i2 = c0784Th.i;
        if (i2 != i) {
            It0.j(view, i - i2);
            c0784Th.i = i;
        }
    }

    public static void u(View view, int i) {
        C0784Th c0784Th = (C0784Th) view.getLayoutParams();
        int i2 = c0784Th.j;
        if (i2 != i) {
            It0.k(view, i - i2);
            c0784Th.j = i;
        }
    }

    @Override // o.JU
    public final void a(View view, View view2, int i, int i2) {
        C2650rP c2650rP = this.D;
        if (i2 == 1) {
            c2650rP.b = i;
        } else {
            c2650rP.a = i;
        }
        this.v = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0784Th) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // o.JU
    public final void b(View view, int i) {
        C2650rP c2650rP = this.D;
        if (i == 1) {
            c2650rP.b = 0;
        } else {
            c2650rP.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
            if (c0784Th.a(i)) {
                AbstractC0706Qh abstractC0706Qh = c0784Th.a;
                if (abstractC0706Qh != null) {
                    abstractC0706Qh.t(childAt, view, i);
                }
                if (i == 0) {
                    c0784Th.n = false;
                } else if (i == 1) {
                    c0784Th.f540o = false;
                }
                c0784Th.getClass();
            }
        }
        this.v = null;
    }

    @Override // o.JU
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0706Qh abstractC0706Qh;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
                if (c0784Th.a(i3) && (abstractC0706Qh = c0784Th.a) != null) {
                    int[] iArr2 = this.p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0706Qh.n(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0784Th) && super.checkLayoutParams(layoutParams);
    }

    @Override // o.KU
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0706Qh abstractC0706Qh;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
                if (c0784Th.a(i5) && (abstractC0706Qh = c0784Th.a) != null) {
                    int[] iArr2 = this.p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0706Qh.o(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0706Qh abstractC0706Qh = ((C0784Th) view.getLayoutParams()).a;
        if (abstractC0706Qh != null) {
            abstractC0706Qh.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // o.JU
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.q);
    }

    @Override // o.JU
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
                AbstractC0706Qh abstractC0706Qh = c0784Th.a;
                if (abstractC0706Qh != null) {
                    boolean zS = abstractC0706Qh.s(childAt, i, i2);
                    z |= zS;
                    if (i2 == 0) {
                        c0784Th.n = zS;
                    } else if (i2 == 1) {
                        c0784Th.f540o = zS;
                    }
                } else if (i2 == 0) {
                    c0784Th.n = false;
                } else if (i2 == 1) {
                    c0784Th.f540o = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0784Th();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0784Th(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        r();
        return Collections.unmodifiableList(this.l);
    }

    public final Kw0 getLastWindowInsets() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2650rP c2650rP = this.D;
        return c2650rP.b | c2650rP.a;
    }

    public Drawable getStatusBarBackground() {
        return this.A;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0784Th c0784Th, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        Nd0 nd0 = (Nd0) this.m.n;
        int i = nd0.n;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) nd0.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nd0.f(i2));
            }
        }
        ArrayList arrayList3 = this.f14o;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = Qt0.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = Qt0.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Qt0.a(this, view, matrix);
        ThreadLocal threadLocal3 = Qt0.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean n(View view, int i, int i2) {
        C2136m20 c2136m20 = I;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i, i2);
        } finally {
            rectG.setEmpty();
            c2136m20.e(rectG);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    public final void o(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        ArrayList arrayList;
        boolean z;
        int i6;
        boolean z2;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        C2136m20 c2136m20;
        AbstractC0706Qh abstractC0706Qh;
        int i13 = i;
        WeakHashMap weakHashMap = It0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.l;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i14 = 0;
        while (true) {
            C2136m20 c2136m21 = I;
            if (i14 >= size) {
                Rect rect4 = rectG3;
                Rect rect5 = rectG2;
                Rect rect6 = rectG;
                rect6.setEmpty();
                c2136m21.e(rect6);
                rect5.setEmpty();
                c2136m21.e(rect5);
                rect4.setEmpty();
                c2136m21.e(rect4);
                return;
            }
            View view = (View) arrayList2.get(i14);
            C0784Th c0784Th = (C0784Th) view.getLayoutParams();
            if (i13 != 0 || view.getVisibility() != 8) {
                int i15 = 0;
                while (i15 < i14) {
                    if (c0784Th.l == ((View) arrayList2.get(i15))) {
                        C0784Th c0784Th2 = (C0784Th) view.getLayoutParams();
                        if (c0784Th2.k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            Rect rectG6 = g();
                            k(c0784Th2.k, rectG4);
                            i(view, rectG5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c2136m20 = c2136m21;
                            l(layoutDirection, rectG4, rectG6, c0784Th2, measuredWidth, measuredHeight);
                            boolean z3 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(c0784Th2, rectG6, measuredWidth, measuredHeight);
                            int i16 = rectG6.left - rectG5.left;
                            int i17 = rectG6.top - rectG5.top;
                            if (i16 != 0) {
                                It0.j(view, i16);
                            }
                            if (i17 != 0) {
                                It0.k(view, i17);
                            }
                            if (z3 && (abstractC0706Qh = c0784Th2.a) != null) {
                                abstractC0706Qh.h(this, view, c0784Th2.k);
                            }
                            rectG4.setEmpty();
                            c2136m20.e(rectG4);
                            rectG5.setEmpty();
                            c2136m20.e(rectG5);
                            rectG6.setEmpty();
                            c2136m20.e(rectG6);
                        } else {
                            c2136m20 = c2136m21;
                        }
                    } else {
                        c2136m20 = c2136m21;
                    }
                    i15++;
                    c2136m21 = c2136m20;
                    size = size;
                    arrayList2 = arrayList2;
                    layoutDirection = layoutDirection;
                    c0784Th = c0784Th;
                    i14 = i14;
                    rectG3 = rectG3;
                    rectG2 = rectG2;
                    rectG = rectG;
                }
                C0784Th c0784Th3 = c0784Th;
                int i18 = layoutDirection;
                InterfaceC1941k20 interfaceC1941k20 = c2136m21;
                i2 = i14;
                Rect rect7 = rectG3;
                rect = rectG2;
                Rect rect8 = rectG;
                ArrayList arrayList3 = arrayList2;
                int i19 = size;
                i(view, rect, true);
                if (c0784Th3.g == 0 || rect.isEmpty()) {
                    i3 = i18;
                    rect2 = rect8;
                } else {
                    i3 = i18;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0784Th3.g, i3);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        rect2 = rect8;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i20 != 80) {
                        rect2 = rect8;
                    } else {
                        rect2 = rect8;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i21 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c0784Th3.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap2 = It0.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0784Th c0784Th4 = (C0784Th) view.getLayoutParams();
                        AbstractC0706Qh abstractC0706Qh2 = c0784Th4.a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0706Qh2 == null || !abstractC0706Qh2.e(view)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        interfaceC1941k20.e(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            interfaceC1941k20.e(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0784Th4.h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i11 = (rectG7.top - ((ViewGroup.MarginLayoutParams) c0784Th4).topMargin) - c0784Th4.j) >= (i12 = rect2.top)) {
                                z = false;
                            } else {
                                u(view, i12 - i11);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) c0784Th4).bottomMargin) + c0784Th4.j) < (i10 = rect2.bottom)) {
                                u(view, height - i10);
                                z = true;
                            }
                            if (z) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                                u(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i8 = (rectG7.left - ((ViewGroup.MarginLayoutParams) c0784Th4).leftMargin) - c0784Th4.i) >= (i9 = rect2.left)) {
                                z2 = false;
                            } else {
                                t(view, i9 - i8);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) c0784Th4).rightMargin) + c0784Th4.i) < (i7 = rect2.right)) {
                                t(view, width - i7);
                                z2 = true;
                            }
                            if (!z2) {
                                t(view, i6);
                            }
                            rectG7.setEmpty();
                            interfaceC1941k20.e(rectG7);
                        }
                    }
                }
                i4 = i;
                if (i4 != 2) {
                    rect3 = rect7;
                    rect3.set(((C0784Th) view.getLayoutParams()).p);
                    if (rect3.equals(rect)) {
                        i5 = i19;
                        arrayList = arrayList3;
                    } else {
                        ((C0784Th) view.getLayoutParams()).p.set(rect);
                    }
                } else {
                    rect3 = rect7;
                }
                int i22 = i2 + 1;
                i5 = i19;
                while (true) {
                    arrayList = arrayList3;
                    if (i22 >= i5) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i22);
                    AbstractC0706Qh abstractC0706Qh3 = ((C0784Th) view2.getLayoutParams()).a;
                    if (abstractC0706Qh3 != null) {
                        abstractC0706Qh3.f(view2);
                    }
                    i22++;
                    arrayList3 = arrayList;
                }
            } else {
                i4 = i13;
                i3 = layoutDirection;
                i2 = i14;
                rect3 = rectG3;
                rect = rectG2;
                rect2 = rectG;
                arrayList = arrayList2;
                i5 = size;
            }
            size = i5;
            i14 = i2 + 1;
            rectG2 = rect;
            i13 = i4;
            rectG3 = rect3;
            arrayList2 = arrayList;
            rectG = rect2;
            layoutDirection = i3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s(false);
        if (this.x) {
            if (this.w == null) {
                this.w = new ViewTreeObserverOnPreDrawListenerC0810Uh(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.w);
        }
        if (this.y == null) {
            WeakHashMap weakHashMap = It0.a;
            if (getFitsSystemWindows()) {
                AbstractC2991ut0.c(this);
            }
        }
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s(false);
        if (this.x && this.w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.w);
        }
        View view = this.v;
        if (view != null) {
            b(view, 0);
        }
        this.s = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.z || this.A == null) {
            return;
        }
        Kw0 kw0 = this.y;
        int iD = kw0 != null ? kw0.d() : 0;
        if (iD > 0) {
            this.A.setBounds(0, 0, getWidth(), iD);
            this.A.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s(true);
        }
        boolean zQ = q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            s(true);
        }
        return zQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0706Qh abstractC0706Qh;
        WeakHashMap weakHashMap = It0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0706Qh = ((C0784Th) view.getLayoutParams()).a) == null || !abstractC0706Qh.k(this, view, layoutDirection))) {
                p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        AbstractC0706Qh abstractC0706Qh;
        int i7;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int absoluteGravity;
        r();
        int childCount = getChildCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i17);
            Nd0 nd0 = (Nd0) this.m.n;
            int i18 = nd0.n;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) nd0.j(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z != this.x) {
            if (z) {
                if (this.s) {
                    if (this.w == null) {
                        this.w = new ViewTreeObserverOnPreDrawListenerC0810Uh(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.w);
                }
                this.x = true;
            } else {
                if (this.s && this.w != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.w);
                }
                this.x = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = It0.a;
        int layoutDirection = getLayoutDirection();
        boolean z2 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z3 = this.y != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.l;
        int size3 = arrayList3.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i24 = 0;
        while (i24 < size3) {
            View view = (View) arrayList3.get(i24);
            if (view.getVisibility() == 8) {
                i14 = i24;
                i7 = size3;
                arrayList = arrayList3;
                i12 = paddingLeft;
                i8 = paddingRight;
                i9 = layoutDirection;
            } else {
                C0784Th c0784Th = (C0784Th) view.getLayoutParams();
                int i25 = c0784Th.e;
                if (i25 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                    i4 = i24;
                } else {
                    i3 = iCombineMeasuredStates;
                    int[] iArr = this.t;
                    if (iArr == null) {
                        toString();
                        i4 = i24;
                    } else {
                        i4 = i24;
                        if (i25 < 0 || i25 >= iArr.length) {
                            toString();
                        } else {
                            i15 = iArr[i25];
                        }
                        i16 = c0784Th.c;
                        if (i16 == 0) {
                            i16 = 8388661;
                        }
                        absoluteGravity = Gravity.getAbsoluteGravity(i16, layoutDirection) & 7;
                        if (!(absoluteGravity == 3 || z2) || (absoluteGravity == 5 && z2)) {
                            iMax = Math.max(0, (size - paddingRight) - i15);
                        } else if ((absoluteGravity != 5 && !z2) || (absoluteGravity == 3 && z2)) {
                            iMax = Math.max(0, i15 - paddingLeft);
                        }
                        if (z3 || view.getFitsSystemWindows()) {
                            i5 = i;
                            i6 = i2;
                        } else {
                            int iC = this.y.c() + this.y.b();
                            int iA = this.y.a() + this.y.d();
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                            i5 = iMakeMeasureSpec;
                            i6 = iMakeMeasureSpec2;
                        }
                        abstractC0706Qh = c0784Th.a;
                        if (abstractC0706Qh != null) {
                            int i26 = i3;
                            i14 = i4;
                            i12 = paddingLeft;
                            i13 = i26;
                            i8 = paddingRight;
                            i10 = i23;
                            i9 = layoutDirection;
                            i11 = i22;
                            i7 = size3;
                            arrayList = arrayList3;
                            if (!abstractC0706Qh.l(this, view, i5, iMax, i6)) {
                            }
                            int iMax2 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                            i22 = iMax2;
                            iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                            i23 = iMax3;
                        } else {
                            i7 = size3;
                            arrayList = arrayList3;
                            i8 = paddingRight;
                            i9 = layoutDirection;
                            i10 = i23;
                            i11 = i22;
                            int i27 = i4;
                            i12 = paddingLeft;
                            i13 = i3;
                            i14 = i27;
                        }
                        measureChildWithMargins(view, i5, iMax, i6, 0);
                        int iMax4 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                        i22 = iMax4;
                        iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                        i23 = iMax5;
                    }
                    i15 = 0;
                    i16 = c0784Th.c;
                    if (i16 == 0) {
                        i16 = 8388661;
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i16, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity != 5) {
                        }
                    } else if (absoluteGravity != 5) {
                    }
                    if (z3) {
                        i5 = i;
                        i6 = i2;
                    } else {
                        i5 = i;
                        i6 = i2;
                    }
                    abstractC0706Qh = c0784Th.a;
                    if (abstractC0706Qh != null) {
                        int i28 = i3;
                        i14 = i4;
                        i12 = paddingLeft;
                        i13 = i28;
                        i8 = paddingRight;
                        i10 = i23;
                        i9 = layoutDirection;
                        i11 = i22;
                        i7 = size3;
                        arrayList = arrayList3;
                        if (!abstractC0706Qh.l(this, view, i5, iMax, i6)) {
                        }
                        int iMax6 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                        i22 = iMax6;
                        iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                        i23 = iMax7;
                    } else {
                        i7 = size3;
                        arrayList = arrayList3;
                        i8 = paddingRight;
                        i9 = layoutDirection;
                        i10 = i23;
                        i11 = i22;
                        int i29 = i4;
                        i12 = paddingLeft;
                        i13 = i3;
                        i14 = i29;
                    }
                    measureChildWithMargins(view, i5, iMax, i6, 0);
                    int iMax8 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                    i22 = iMax8;
                    iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i23 = iMax9;
                }
                iMax = 0;
                if (z3) {
                    i5 = i;
                    i6 = i2;
                } else {
                    i5 = i;
                    i6 = i2;
                }
                abstractC0706Qh = c0784Th.a;
                if (abstractC0706Qh != null) {
                    int i210 = i3;
                    i14 = i4;
                    i12 = paddingLeft;
                    i13 = i210;
                    i8 = paddingRight;
                    i10 = i23;
                    i9 = layoutDirection;
                    i11 = i22;
                    i7 = size3;
                    arrayList = arrayList3;
                    if (!abstractC0706Qh.l(this, view, i5, iMax, i6)) {
                    }
                    int iMax10 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                    i22 = iMax10;
                    iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i23 = iMax11;
                } else {
                    i7 = size3;
                    arrayList = arrayList3;
                    i8 = paddingRight;
                    i9 = layoutDirection;
                    i10 = i23;
                    i11 = i22;
                    int i211 = i4;
                    i12 = paddingLeft;
                    i13 = i3;
                    i14 = i211;
                }
                measureChildWithMargins(view, i5, iMax, i6, 0);
                int iMax12 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin + ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0784Th).topMargin + ((ViewGroup.MarginLayoutParams) c0784Th).bottomMargin);
                i22 = iMax12;
                iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                i23 = iMax13;
            }
            i24 = i14 + 1;
            paddingLeft = i12;
            paddingRight = i8;
            layoutDirection = i9;
            size3 = i7;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i22, i, (-16777216) & i30), View.resolveSizeAndState(i23, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
                if (c0784Th.a(0)) {
                    AbstractC0706Qh abstractC0706Qh = c0784Th.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0706Qh abstractC0706Qh;
        int childCount = getChildCount();
        boolean zM = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0784Th c0784Th = (C0784Th) childAt.getLayoutParams();
                if (c0784Th.a(0) && (abstractC0706Qh = c0784Th.a) != null) {
                    zM |= abstractC0706Qh.m(view);
                }
            }
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0836Vh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0836Vh c0836Vh = (C0836Vh) parcelable;
        super.onRestoreInstanceState(c0836Vh.l);
        SparseArray sparseArray = c0836Vh.n;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0706Qh abstractC0706Qh = m(childAt).a;
            if (id != -1 && abstractC0706Qh != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0706Qh.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        C0836Vh c0836Vh = new C0836Vh(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0706Qh abstractC0706Qh = ((C0784Th) childAt.getLayoutParams()).a;
            if (id != -1 && abstractC0706Qh != null && (parcelableR = abstractC0706Qh.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        c0836Vh.n = sparseArray;
        return c0836Vh;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zQ;
        boolean zU;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == null) {
            zQ = q(motionEvent, 1);
            if (!zQ) {
                zU = false;
            }
            motionEventObtain = null;
            if (this.u == null) {
                zU |= super.onTouchEvent(motionEvent);
            } else if (zQ) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                s(false);
            }
            return zU;
        }
        zQ = false;
        AbstractC0706Qh abstractC0706Qh = ((C0784Th) this.u.getLayoutParams()).a;
        if (abstractC0706Qh != null) {
            zU = abstractC0706Qh.u(this.u, motionEvent);
        } else {
            zU = false;
        }
        motionEventObtain = null;
        if (this.u == null) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (zQ) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            s(false);
        } else {
            s(false);
        }
        return zU;
    }

    public final void p(View view, int i) {
        int i2;
        C0784Th c0784Th = (C0784Th) view.getLayoutParams();
        View view2 = c0784Th.k;
        if (view2 == null && c0784Th.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C2136m20 c2136m20 = I;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                k(view2, rectG);
                C0784Th c0784Th2 = (C0784Th) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, c0784Th2, measuredWidth, measuredHeight);
                h(c0784Th2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                c2136m20.e(rectG);
                rectG2.setEmpty();
                c2136m20.e(rectG2);
            }
        }
        int i3 = c0784Th.e;
        if (i3 < 0) {
            C0784Th c0784Th3 = (C0784Th) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0784Th3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0784Th3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0784Th3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0784Th3).bottomMargin);
            if (this.y != null) {
                WeakHashMap weakHashMap = It0.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.y.b() + rectG3.left;
                    rectG3.top = this.y.d() + rectG3.top;
                    rectG3.right -= this.y.c();
                    rectG3.bottom -= this.y.a();
                }
            }
            Rect rectG4 = g();
            int i4 = c0784Th3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            c2136m20.e(rectG3);
            rectG4.setEmpty();
            c2136m20.e(rectG4);
            return;
        }
        C0784Th c0784Th4 = (C0784Th) view.getLayoutParams();
        int i5 = c0784Th4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int[] iArr = this.t;
        int i8 = 0;
        if (iArr != null && i3 >= 0 && i3 < iArr.length) {
            i2 = iArr[i3];
        } else {
            toString();
            i2 = 0;
        }
        int i9 = i2 - measuredWidth2;
        if (i6 == 1) {
            i9 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            i9 += measuredWidth2;
        }
        if (i7 == 16) {
            i8 = measuredHeight2 / 2;
        } else if (i7 == 80) {
            i8 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0784Th4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0784Th4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0784Th4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0784Th4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean q(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.n;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        N2 n2 = H;
        if (n2 != null) {
            Collections.sort(arrayList, n2);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zJ = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            C0784Th c0784Th = (C0784Th) view.getLayoutParams();
            AbstractC0706Qh abstractC0706Qh = c0784Th.a;
            if (!(zJ || z2) || actionMasked == 0) {
                if (!zJ && abstractC0706Qh != null) {
                    if (i == 0) {
                        zJ = abstractC0706Qh.j(this, view, motionEvent);
                    } else if (i == 1) {
                        zJ = abstractC0706Qh.u(view, motionEvent);
                    }
                    if (zJ) {
                        this.u = view;
                    }
                }
                if (c0784Th.a == null) {
                    c0784Th.m = false;
                }
                boolean z3 = c0784Th.m;
                if (z3) {
                    z = true;
                } else {
                    c0784Th.m = z3;
                    z = z3;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (abstractC0706Qh != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0706Qh.j(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC0706Qh.u(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zJ;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void r() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.r():void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0706Qh abstractC0706Qh = ((C0784Th) view.getLayoutParams()).a;
        if (abstractC0706Qh != null) {
            abstractC0706Qh.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.r) {
            return;
        }
        s(false);
        this.r = true;
    }

    public final void s(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0706Qh abstractC0706Qh = ((C0784Th) childAt.getLayoutParams()).a;
            if (abstractC0706Qh != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0706Qh.j(this, childAt, motionEventObtain);
                } else {
                    abstractC0706Qh.u(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0784Th) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.u = null;
        this.r = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.B = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.A = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.A.setState(getDrawableState());
                }
                Drawable drawable3 = this.A;
                WeakHashMap weakHashMap = It0.a;
                AbstractC3045vW.J(drawable3, getLayoutDirection());
                this.A.setVisible(getVisibility() == 0, false);
                this.A.setCallback(this);
            }
            WeakHashMap weakHashMap2 = It0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC3354yh.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.A.setVisible(z, false);
    }

    public final void v() {
        WeakHashMap weakHashMap = It0.a;
        if (!getFitsSystemWindows()) {
            AbstractC3185wt0.u(this, null);
            return;
        }
        if (this.C == null) {
            this.C = new C2133m1(16, this);
        }
        AbstractC3185wt0.u(this, this.C);
        setSystemUiVisibility(Qd0.j);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0784Th) {
            return new C0784Th((C0784Th) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0784Th((ViewGroup.MarginLayoutParams) layoutParams) : new C0784Th(layoutParams);
    }
}
