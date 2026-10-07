package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.AbstractC1633gu0;
import o.C1242cu0;
import o.C1339du0;
import o.C1437eu0;
import o.C1535fu0;
import o.C1583gR;
import o.C1672hI;
import o.C1925ju0;
import o.C2023ku0;
import o.C2121lu0;
import o.C2133m1;
import o.F40;
import o.InterfaceC1827iu0;
import o.It0;
import o.L0;
import o.O50;
import o.RunnableC0907Ya;
import o.T50;
import o.U90;
import o.V90;
import o.WW;
import o.X50;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public T50 A;
    public boolean B;
    public boolean C;
    public int D;
    public final C1583gR E;
    public final Rect l;
    public final Rect m;
    public final C1339du0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33o;
    public boolean p;
    public final C1242cu0 q;
    public final C1535fu0 r;
    public int s;
    public Parcelable t;
    public final C2023ku0 u;
    public final C1925ju0 v;
    public final V90 w;
    public final C1339du0 x;
    public final C2133m1 y;
    public final WW z;

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new Rect();
        this.m = new Rect();
        C1339du0 c1339du0 = new C1339du0();
        this.n = c1339du0;
        int i = 0;
        this.p = false;
        this.q = new C1242cu0(i, this);
        this.s = -1;
        this.A = null;
        this.B = false;
        int i2 = 1;
        this.C = true;
        this.D = -1;
        this.E = new C1583gR(this);
        C2023ku0 c2023ku0 = new C2023ku0(this, context);
        this.u = c2023ku0;
        WeakHashMap weakHashMap = It0.a;
        c2023ku0.setId(View.generateViewId());
        this.u.setDescendantFocusability(131072);
        C1535fu0 c1535fu0 = new C1535fu0(this);
        this.r = c1535fu0;
        this.u.setLayoutManager(c1535fu0);
        this.u.setScrollingTouchSlop(1);
        int[] iArr = F40.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.u.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C2023ku0 c2023ku1 = this.u;
            C1437eu0 c1437eu0 = new C1437eu0();
            if (c2023ku1.O == null) {
                c2023ku1.O = new ArrayList();
            }
            c2023ku1.O.add(c1437eu0);
            V90 v90 = new V90(this);
            this.w = v90;
            this.y = new C2133m1(26, v90);
            C1925ju0 c1925ju0 = new C1925ju0(this);
            this.v = c1925ju0;
            c1925ju0.a(this.u);
            this.u.h(this.w);
            C1339du0 c1339du1 = new C1339du0();
            this.x = c1339du1;
            this.w.a = c1339du1;
            C1339du0 c1339du2 = new C1339du0(this, i);
            C1339du0 c1339du3 = new C1339du0(this, i2);
            ((ArrayList) c1339du1.b).add(c1339du2);
            ((ArrayList) this.x.b).add(c1339du3);
            this.E.B(this.u);
            ((ArrayList) this.x.b).add(c1339du0);
            WW ww = new WW();
            this.z = ww;
            ((ArrayList) this.x.b).add(ww);
            C2023ku0 c2023ku2 = this.u;
            attachViewToParent(c2023ku2, 0, c2023ku2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        O50 adapter;
        if (this.s == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.t != null) {
            this.t = null;
        }
        int iMax = Math.max(0, Math.min(this.s, adapter.a() - 1));
        this.f33o = iMax;
        this.s = -1;
        this.u.g0(iMax);
        this.E.J();
    }

    public final void b(int i, boolean z) {
        if (((V90) this.y.m).m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        c(i, z);
    }

    public final void c(int i, boolean z) {
        AbstractC1633gu0 abstractC1633gu0;
        O50 adapter = getAdapter();
        if (adapter == null) {
            if (this.s != -1) {
                this.s = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.a() - 1);
        int i2 = this.f33o;
        if (iMin == i2 && this.w.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.f33o = iMin;
        this.E.J();
        V90 v90 = this.w;
        if (v90.f != 0) {
            v90.e();
            U90 u90 = v90.g;
            d = ((double) u90.b) + ((double) u90.a);
        }
        V90 v91 = this.w;
        v91.getClass();
        v91.e = z ? 2 : 3;
        v91.m = false;
        boolean z2 = v91.i != iMin;
        v91.i = iMin;
        v91.c(2);
        if (z2 && (abstractC1633gu0 = v91.a) != null) {
            abstractC1633gu0.c(iMin);
        }
        if (!z) {
            this.u.g0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.u.l0(iMin);
            return;
        }
        this.u.g0(d2 > d ? iMin - 3 : iMin + 3);
        C2023ku0 c2023ku0 = this.u;
        c2023ku0.post(new RunnableC0907Ya(iMin, c2023ku0));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.u.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.u.canScrollVertically(i);
    }

    public final void d() {
        C1925ju0 c1925ju0 = this.v;
        if (c1925ju0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = c1925ju0.e(this.r);
        if (viewE == null) {
            return;
        }
        this.r.getClass();
        int iN = X50.N(viewE);
        if (iN != this.f33o && getScrollState() == 0) {
            this.x.c(iN);
        }
        this.p = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C2121lu0) {
            int i = ((C2121lu0) parcelable).l;
            sparseArray.put(this.u.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.E.getClass();
        this.E.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public O50 getAdapter() {
        return this.u.getAdapter();
    }

    public int getCurrentItem() {
        return this.f33o;
    }

    public int getItemDecorationCount() {
        return this.u.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.D;
    }

    public int getOrientation() {
        return this.r.p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C2023ku0 c2023ku0 = this.u;
        if (getOrientation() == 0) {
            height = c2023ku0.getWidth() - c2023ku0.getPaddingLeft();
            paddingBottom = c2023ku0.getPaddingRight();
        } else {
            height = c2023ku0.getHeight() - c2023ku0.getPaddingTop();
            paddingBottom = c2023ku0.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.w.f;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        O50 adapter;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.E.p;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                iA = viewPager2.getAdapter().a();
            } else {
                iA2 = viewPager2.getAdapter().a();
                iA = 0;
            }
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) L0.d(iA, iA2, 0).l);
            adapter = viewPager2.getAdapter();
            if (adapter == null && (iA3 = adapter.a()) != 0 && viewPager2.C) {
                if (viewPager2.f33o > 0) {
                    accessibilityNodeInfo.addAction(C1672hI.a.e);
                }
                if (viewPager2.f33o < iA3 - 1) {
                    accessibilityNodeInfo.addAction(C1672hI.a.f);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
            return;
        }
        iA = 0;
        iA2 = 0;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) L0.d(iA, iA2, 0).l);
        adapter = viewPager2.getAdapter();
        if (adapter == null) {
            return;
        }
        if (viewPager2.f33o > 0) {
            accessibilityNodeInfo.addAction(C1672hI.a.e);
        }
        if (viewPager2.f33o < iA3 - 1) {
            accessibilityNodeInfo.addAction(C1672hI.a.f);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.u.getMeasuredWidth();
        int measuredHeight = this.u.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.l;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.m;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.u.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.p) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.u, i, i2);
        int measuredWidth = this.u.getMeasuredWidth();
        int measuredHeight = this.u.getMeasuredHeight();
        int measuredState = this.u.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2121lu0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2121lu0 c2121lu0 = (C2121lu0) parcelable;
        super.onRestoreInstanceState(c2121lu0.getSuperState());
        this.s = c2121lu0.m;
        this.t = c2121lu0.n;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2121lu0 c2121lu0 = new C2121lu0(super.onSaveInstanceState());
        c2121lu0.l = this.u.getId();
        int i = this.s;
        if (i == -1) {
            i = this.f33o;
        }
        c2121lu0.m = i;
        Parcelable parcelable = this.t;
        if (parcelable != null) {
            c2121lu0.n = parcelable;
        } else {
            this.u.getAdapter();
        }
        return c2121lu0;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.E.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C1583gR c1583gR = this.E;
        c1583gR.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) c1583gR.p;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.C) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(O50 o50) {
        O50 adapter = this.u.getAdapter();
        C1583gR c1583gR = this.E;
        if (adapter != null) {
            adapter.a.unregisterObserver((C1242cu0) c1583gR.f793o);
        } else {
            c1583gR.getClass();
        }
        C1242cu0 c1242cu0 = this.q;
        if (adapter != null) {
            adapter.a.unregisterObserver(c1242cu0);
        }
        this.u.setAdapter(o50);
        this.f33o = 0;
        a();
        C1583gR c1583gR2 = this.E;
        c1583gR2.J();
        if (o50 != null) {
            o50.a.registerObserver((C1242cu0) c1583gR2.f793o);
        }
        if (o50 != null) {
            o50.a.registerObserver(c1242cu0);
        }
    }

    public void setCurrentItem(int i) {
        b(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.E.J();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.D = i;
        this.u.requestLayout();
    }

    public void setOrientation(int i) {
        this.r.v1(i);
        this.E.J();
    }

    public void setPageTransformer(InterfaceC1827iu0 interfaceC1827iu0) {
        if (interfaceC1827iu0 != null) {
            if (!this.B) {
                this.A = this.u.getItemAnimator();
                this.B = true;
            }
            this.u.setItemAnimator(null);
        } else if (this.B) {
            this.u.setItemAnimator(this.A);
            this.A = null;
            this.B = false;
        }
        this.z.getClass();
        if (interfaceC1827iu0 == null) {
            return;
        }
        this.z.getClass();
        this.z.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.C = z;
        this.E.J();
    }
}
