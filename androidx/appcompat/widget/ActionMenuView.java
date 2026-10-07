package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.AbstractC2064lK;
import o.AbstractC3478zu0;
import o.C1386eQ;
import o.C1744i1;
import o.C1966kK;
import o.C2036l1;
import o.C2133m1;
import o.C2424p1;
import o.C2617r1;
import o.C2691rp;
import o.InterfaceC2521q1;
import o.InterfaceC2555qQ;
import o.InterfaceC2714s1;
import o.InterfaceC2845tQ;
import o.XP;
import o.YP;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC2064lK implements YP, InterfaceC2845tQ {
    public ZP A;
    public Context B;
    public int C;
    public boolean D;
    public C2424p1 E;
    public InterfaceC2555qQ F;
    public XP G;
    public boolean H;
    public int I;
    public final int J;
    public final int K;
    public InterfaceC2714s1 L;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.J = (int) (56.0f * f);
        this.K = (int) (f * 4.0f);
        this.B = context;
        this.C = 0;
    }

    public static C2617r1 j() {
        C2617r1 c2617r1 = new C2617r1(-2, -2);
        c2617r1.a = false;
        ((LinearLayout.LayoutParams) c2617r1).gravity = 16;
        return c2617r1;
    }

    public static C2617r1 k(ViewGroup.LayoutParams layoutParams) {
        C2617r1 c2617r1;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C2617r1) {
            C2617r1 c2617r2 = (C2617r1) layoutParams;
            c2617r1 = new C2617r1(c2617r2);
            c2617r1.a = c2617r2.a;
        } else {
            c2617r1 = new C2617r1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2617r1).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2617r1).gravity = 16;
        }
        return c2617r1;
    }

    @Override // o.InterfaceC2845tQ
    public final void b(ZP zp) {
        this.A = zp;
    }

    @Override // o.YP
    public final boolean c(C1386eQ c1386eQ) {
        return this.A.q(c1386eQ, null, 0);
    }

    @Override // o.AbstractC2064lK, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2617r1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.AbstractC2064lK
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C1966kK generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.AbstractC2064lK
    /* JADX INFO: renamed from: g */
    public final C1966kK generateLayoutParams(AttributeSet attributeSet) {
        return new C2617r1(getContext(), attributeSet);
    }

    @Override // o.AbstractC2064lK, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.AbstractC2064lK, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.A == null) {
            Context context = getContext();
            ZP zp = new ZP(context);
            this.A = zp;
            zp.e = new C2133m1(1, this);
            C2424p1 c2424p1 = new C2424p1(context);
            this.E = c2424p1;
            c2424p1.x = true;
            c2424p1.y = true;
            InterfaceC2555qQ c2691rp = this.F;
            if (c2691rp == null) {
                c2691rp = new C2691rp(20);
            }
            c2424p1.p = c2691rp;
            this.A.b(c2424p1, this.B);
            C2424p1 c2424p2 = this.E;
            c2424p2.s = this;
            this.A = c2424p2.n;
        }
        return this.A;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2424p1 c2424p1 = this.E;
        C2036l1 c2036l1 = c2424p1.u;
        if (c2036l1 != null) {
            return c2036l1.getDrawable();
        }
        if (c2424p1.w) {
            return c2424p1.v;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.AbstractC2064lK
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1966kK generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC2521q1)) {
            zB = ((InterfaceC2521q1) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC2521q1)) ? zB : zB | ((InterfaceC2521q1) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2424p1 c2424p1 = this.E;
        if (c2424p1 != null) {
            c2424p1.d(false);
            if (this.E.h()) {
                this.E.e();
                this.E.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2424p1 c2424p1 = this.E;
        if (c2424p1 != null) {
            c2424p1.e();
            C1744i1 c1744i1 = c2424p1.F;
            if (c1744i1 == null || !c1744i1.b()) {
                return;
            }
            c1744i1.j.dismiss();
        }
    }

    @Override // o.AbstractC2064lK, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.H) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC3478zu0.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2617r1 c2617r1 = (C2617r1) childAt.getLayoutParams();
                if (c2617r1.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c2617r1).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2617r1).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2617r1).leftMargin) + ((LinearLayout.LayoutParams) c2617r1).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C2617r1 c2617r2 = (C2617r1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2617r2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c2617r2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2617r2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C2617r1 c2617r3 = (C2617r1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2617r3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c2617r3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c2617r3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // o.AbstractC2064lK, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        ?? r1;
        int i7;
        ZP zp;
        boolean z2 = this.H;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.H = z3;
        if (z2 != z3) {
            this.I = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.H && (zp = this.A) != null && size != this.I) {
            this.I = size;
            zp.p(true);
        }
        int childCount = getChildCount();
        if (!this.H || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C2617r1 c2617r1 = (C2617r1) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c2617r1).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2617r1).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.J;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int iMax = 0;
        int i15 = 0;
        boolean z4 = false;
        long j = 0;
        int i16 = 0;
        int iMax2 = 0;
        while (true) {
            i3 = this.K;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C2617r1 c2617r2 = (C2617r1) childAt.getLayoutParams();
                c2617r2.f = false;
                c2617r2.c = 0;
                c2617r2.b = 0;
                c2617r2.d = false;
                ((LinearLayout.LayoutParams) c2617r2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2617r2).rightMargin = 0;
                c2617r2.e = z5 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i19 = c2617r2.a ? 1 : i11;
                C2617r1 c2617r3 = (C2617r1) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i19 <= 0 || (z6 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i13, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i7++;
                    }
                    if (z6 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c2617r3.d = !c2617r3.a && z6;
                c2617r3.b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i7);
                if (c2617r2.d) {
                    i16++;
                }
                if (c2617r2.a) {
                    z4 = true;
                }
                i11 -= i7;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j |= (long) (1 << i15);
                }
                i14 = i18;
            }
            i15++;
            size3 = i17;
            paddingBottom = paddingBottom;
            i9 = i9;
        }
        int i20 = i9;
        int i21 = size3;
        int i22 = iMax2;
        boolean z7 = z4 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i11 <= 0) {
                i4 = i22;
                z = z8;
                break;
            }
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                int i26 = i22;
                C2617r1 c2617r4 = (C2617r1) getChildAt(i25).getLayoutParams();
                boolean z9 = z8;
                if (c2617r4.d) {
                    int i27 = c2617r4.b;
                    if (i27 < i23) {
                        j2 = 1 << i25;
                        i23 = i27;
                        i24 = 1;
                    } else if (i27 == i23) {
                        i24++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                z8 = z9;
                i22 = i26;
            }
            i4 = i22;
            z = z8;
            j |= j2;
            if (i24 > i11) {
                break;
            }
            int i28 = i23 + 1;
            int i29 = 0;
            while (i29 < childCount2) {
                View childAt2 = getChildAt(i29);
                C2617r1 c2617r5 = (C2617r1) childAt2.getLayoutParams();
                int i30 = mode;
                int i31 = childMeasureSpec;
                int i32 = childCount2;
                long j3 = 1 << i29;
                if ((j2 & j3) != 0) {
                    if (z7 && c2617r5.e) {
                        r1 = 1;
                        r1 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    c2617r5.b += r1;
                    c2617r5.f = r1;
                    i11--;
                } else if (c2617r5.b == i28) {
                    j |= j3;
                }
                i29++;
                childMeasureSpec = i31;
                mode = i30;
                childCount2 = i32;
            }
            i22 = i4;
            z8 = true;
        }
        int i33 = childMeasureSpec;
        int i34 = childCount2;
        boolean z10 = !z4 && i14 == 1;
        if (i11 <= 0 || j == 0 || (i11 >= i14 - 1 && !z10 && iMax <= 1)) {
            i5 = i34;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C2617r1) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i35 = i34 - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((C2617r1) getChildAt(i35).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i36 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            i5 = i34;
            for (int i37 = 0; i37 < i5; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C2617r1 c2617r6 = (C2617r1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2617r6.c = i36;
                        c2617r6.f = true;
                        if (i37 == 0 && !c2617r6.e) {
                            ((LinearLayout.LayoutParams) c2617r6).leftMargin = (-i36) / 2;
                        }
                    } else if (c2617r6.a) {
                        c2617r6.c = i36;
                        c2617r6.f = true;
                        ((LinearLayout.LayoutParams) c2617r6).rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) c2617r6).leftMargin = i36 / 2;
                        }
                        if (i37 != i5 - 1) {
                            ((LinearLayout.LayoutParams) c2617r6).rightMargin = i36 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            int i38 = 0;
            while (i38 < i5) {
                View childAt4 = getChildAt(i38);
                C2617r1 c2617r7 = (C2617r1) childAt4.getLayoutParams();
                if (c2617r7.f) {
                    i6 = i33;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2617r7.b * i13) + c2617r7.c, 1073741824), i6);
                } else {
                    i6 = i33;
                }
                i38++;
                i33 = i6;
            }
        }
        setMeasuredDimension(i20, mode != 1073741824 ? i4 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.E.C = z;
    }

    public void setOnMenuItemClickListener(InterfaceC2714s1 interfaceC2714s1) {
        this.L = interfaceC2714s1;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2424p1 c2424p1 = this.E;
        C2036l1 c2036l1 = c2424p1.u;
        if (c2036l1 != null) {
            c2036l1.setImageDrawable(drawable);
        } else {
            c2424p1.w = true;
            c2424p1.v = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.D = z;
    }

    public void setPopupTheme(int i) {
        if (this.C != i) {
            this.C = i;
            if (i == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2424p1 c2424p1) {
        this.E = c2424p1;
        c2424p1.s = this;
        this.A = c2424p1.n;
    }

    @Override // o.AbstractC2064lK, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2617r1(getContext(), attributeSet);
    }
}
