package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import o.AbstractC1923jt0;
import o.AbstractC2595qp;
import o.AbstractC2989us0;
import o.AbstractC3086vs0;
import o.AbstractC3185wt0;
import o.C0334By;
import o.C0659Om;
import o.C2426p2;
import o.C2650rP;
import o.C2720s4;
import o.C3080vp0;
import o.C3183ws0;
import o.FU;
import o.GU;
import o.HU;
import o.IU;
import o.It0;
import o.KU;
import o.Lt0;
import o.Mt0;
import o.Yu0;
import o.ZN;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements KU, ScrollingView {
    public static final float N = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final ZN O = new ZN(3);
    public static final int[] P = {R.attr.fillViewport};
    public final int A;
    public final int B;
    public int C;
    public final int[] D;
    public final int[] E;
    public int F;
    public int G;
    public HU H;
    public final C2650rP I;
    public final IU J;
    public float K;
    public GU L;
    public final C0659Om M;
    public final float l;
    public long m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final OverScroller f16o;
    public final EdgeEffect p;
    public final EdgeEffect q;
    public int r;
    public boolean s;
    public boolean t;
    public View u;
    public boolean v;
    public VelocityTracker w;
    public boolean x;
    public boolean y;
    public final int z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skidush.clonex.R.attr.nestedScrollViewStyle);
        this.n = new Rect();
        this.s = true;
        this.t = false;
        this.u = null;
        this.v = false;
        this.y = true;
        this.C = -1;
        this.D = new int[2];
        this.E = new int[2];
        this.M = new C0659Om(getContext(), new C0334By(21, this));
        int i = Build.VERSION.SDK_INT;
        this.p = i >= 31 ? AbstractC2595qp.a(context, attributeSet) : new EdgeEffect(context);
        this.q = i >= 31 ? AbstractC2595qp.a(context, attributeSet) : new EdgeEffect(context);
        this.l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f16o = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.z = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.B = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P, com.skidush.clonex.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.I = new C2650rP();
        this.J = new IU(this);
        setNestedScrollingEnabled(true);
        It0.p(this, O);
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    @Override // o.JU
    public final void a(View view, View view2, int i, int i2) {
        C2650rP c2650rP = this.I;
        if (i2 == 1) {
            c2650rP.b = i;
        } else {
            c2650rP.a = i;
        }
        this.J.h(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // o.JU
    public final void b(View view, int i) {
        C2650rP c2650rP = this.I;
        if (i == 1) {
            c2650rP.b = 0;
        } else {
            c2650rP.a = 0;
        }
        w(i);
    }

    @Override // o.JU
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        this.J.c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.f16o.isFinished()) {
            return;
        }
        this.f16o.computeScrollOffset();
        int currY = this.f16o.getCurrY();
        int i2 = currY - this.G;
        int height = getHeight();
        EdgeEffect edgeEffect = this.q;
        EdgeEffect edgeEffect2 = this.p;
        if (i2 <= 0 || AbstractC1923jt0.n(edgeEffect2) == 0.0f) {
            if (i2 < 0 && AbstractC1923jt0.n(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC1923jt0.x(edgeEffect, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            this.G = currY;
            iArr = this.E;
            iArr[1] = 0;
            this.J.c(0, i2, 1, iArr, null);
            i = i2 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.J.e(0, scrollY2, 0, i3, this.D, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f16o.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f16o.getCurrVelocity());
                    }
                }
                this.f16o.abortAnimation();
                w(1);
            }
            if (this.f16o.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC1923jt0.x(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        this.G = currY;
        iArr = this.E;
        iArr[1] = 0;
        this.J.c(0, i2, 1, iArr, null);
        i = i2 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            p(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i4 = i - scrollY4;
            iArr[1] = 0;
            this.J.e(0, scrollY4, 0, i4, this.D, 1, iArr);
            i = i4 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f16o.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f16o.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f16o.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f16o.getCurrVelocity());
            }
            this.f16o.abortAnimation();
            w(1);
        }
        if (this.f16o.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // o.KU
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.J.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.J.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.J.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.J.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.p;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (FU.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (FU.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.q;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (FU.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (FU.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // o.JU
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, null);
    }

    @Override // o.JU
    public final boolean f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.n;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2650rP c2650rP = this.I;
        return c2650rP.b | c2650rP.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.K;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.J.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.n.setEmpty();
        int childCount = getChildCount();
        int i = Yu0.b.m0;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(Yu0.b.m0) : g(Yu0.b.m0);
                }
                if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    q(i);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(Yu0.b.m0);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(Yu0.b.m0);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, Yu0.b.m0);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(Yu0.b.m0)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.J.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f16o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.J.h(2, 1);
            this.G = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.n;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.J.d(scrollY2, i - scrollY2, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.r = (int) motionEvent.getY(i);
            this.C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = false;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        int width;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        char c;
        boolean z;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f;
        long j;
        float fSqrt;
        int i2;
        if (motionEvent.getAction() != 8 || this.v) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            i = 0;
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0659Om c0659Om = this.M;
        c0659Om.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i3 = c0659Om.h;
        int[] iArr = c0659Om.j;
        if (i3 == source && c0659Om.i == deviceId && c0659Om.g == i) {
            c = 0;
            z = false;
        } else {
            c0659Om.c.getClass();
            Context context = c0659Om.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                Method method = Mt0.a;
                scaledMinimumFlingVelocity = Lt0.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = Mt0.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i4 >= 34) {
                scaledMaximumFlingVelocity = Lt0.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        int dimensionPixelSize = resources2.getDimensionPixelSize(identifier2);
                        scaledMaximumFlingVelocity = dimensionPixelSize >= 0 ? dimensionPixelSize : Integer.MIN_VALUE;
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0659Om.h = source;
            c0659Om.i = deviceId;
            c0659Om.g = i;
            c = 0;
            z = true;
        }
        if (iArr[c] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0659Om.e;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            c0659Om.e = null;
            return true;
        }
        if (c0659Om.e == null) {
            c0659Om.e = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c0659Om.e;
        c0659Om.d.getClass();
        Map map = AbstractC3086vs0.a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC3086vs0.a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new C3183ws0());
            }
            C3183ws0 c3183ws0 = (C3183ws0) map2.get(velocityTracker3);
            c3183ws0.getClass();
            long eventTime = motionEvent.getEventTime();
            int i5 = c3183ws0.d;
            long[] jArr = c3183ws0.b;
            if (i5 != 0 && eventTime - jArr[c3183ws0.e] > 40) {
                c3183ws0.d = 0;
                c3183ws0.c = 0.0f;
            }
            int i6 = (c3183ws0.e + 1) % 20;
            c3183ws0.e = i6;
            int i7 = c3183ws0.d;
            if (i7 != 20) {
                c3183ws0.d = i7 + 1;
            }
            c3183ws0.a[i6] = motionEvent.getAxisValue(26);
            jArr[c3183ws0.e] = eventTime;
        }
        velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C3183ws0 c3183ws1 = (C3183ws0) AbstractC3086vs0.a.get(velocityTracker3);
        if (c3183ws1 != null) {
            int i8 = c3183ws1.d;
            if (i8 < 2) {
                velocityTracker = velocityTracker3;
                fSqrt = 0.0f;
            } else {
                int i9 = c3183ws1.e;
                int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                long[] jArr2 = c3183ws1.b;
                long j2 = jArr2[i9];
                while (true) {
                    j = jArr2[i10];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c3183ws1.d--;
                    i10 = (i10 + 1) % 20;
                }
                int i11 = c3183ws1.d;
                if (i11 < 2) {
                    velocityTracker = velocityTracker3;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = c3183ws1.a;
                    if (i11 == 2) {
                        int i12 = (i10 + 1) % 20;
                        long j3 = jArr2[i12];
                        if (j == j3) {
                            velocityTracker = velocityTracker3;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            fSqrt = fArr[i12] / (j3 - j);
                        }
                    } else {
                        float f2 = 0.0f;
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            if (i13 >= c3183ws1.d - 1) {
                                break;
                            }
                            int i15 = i13 + i10;
                            long j4 = jArr2[i15 % 20];
                            int i16 = (i15 + 1) % 20;
                            if (jArr2[i16] == j4) {
                                i2 = 1;
                            } else {
                                i14++;
                                float fSqrt2 = (f2 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f2) * 2.0f));
                                float f3 = fArr[i16] / (jArr2[i16] - j4);
                                float fAbs = (Math.abs(f3) * (f3 - fSqrt2)) + f2;
                                i2 = 1;
                                if (i14 == 1) {
                                    fAbs *= 0.5f;
                                }
                                f2 = fAbs;
                            }
                            i13 += i2;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f2) * 2.0f)) * (f2 < 0.0f ? -1.0f : 1.0f);
                    }
                }
            }
            float f4 = fSqrt * 1000;
            c3183ws1.c = f4;
            if (f4 < (-Math.abs(Float.MAX_VALUE))) {
                c3183ws1.c = -Math.abs(Float.MAX_VALUE);
            } else if (c3183ws1.c > Math.abs(Float.MAX_VALUE)) {
                c3183ws1.c = Math.abs(Float.MAX_VALUE);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC2989us0.a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                C3183ws0 c3183ws2 = (C3183ws0) AbstractC3086vs0.a.get(velocityTracker4);
                yVelocity = (c3183ws2 == null || i != 26) ? 0.0f : c3183ws2.c;
            }
        }
        C0334By c0334By = c0659Om.b;
        float f5 = yVelocity * (-((NestedScrollView) c0334By.m).getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f5);
        NestedScrollView nestedScrollView = (NestedScrollView) c0334By.m;
        if (z || (fSignum != Math.signum(c0659Om.f) && fSignum != 0.0f)) {
            nestedScrollView.f16o.abortAnimation();
        }
        if (Math.abs(f5) < iArr[0]) {
            return true;
        }
        int i17 = iArr[1];
        float fMax = Math.max(-i17, Math.min(f5, i17));
        if (fMax == 0.0f) {
            f = 0.0f;
        } else {
            nestedScrollView.f16o.abortAnimation();
            nestedScrollView.j((int) fMax);
            f = fMax;
        }
        c0659Om.f = f;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.v) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f16o.isFinished()) {
                        z = false;
                    }
                    this.v = z;
                    velocityTracker = this.w;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.w = null;
                    }
                } else {
                    this.r = y;
                    this.C = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.w;
                    if (velocityTracker3 == null) {
                        this.w = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.w.addMovement(motionEvent);
                    this.f16o.computeScrollOffset();
                    if (!v(motionEvent) && this.f16o.isFinished()) {
                        z = false;
                    }
                    this.v = z;
                    this.J.h(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z = false;
                }
                this.v = z;
                velocityTracker = this.w;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.w = null;
                }
            }
        } else if (i == 1) {
            this.v = false;
            this.C = -1;
            velocityTracker2 = this.w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.w = null;
            }
            if (this.f16o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 2) {
            int i2 = this.C;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.r) > this.z && (2 & getNestedScrollAxes()) == 0) {
                    this.v = true;
                    this.r = y2;
                    if (this.w == null) {
                        this.w = VelocityTracker.obtain();
                    }
                    this.w.addMovement(motionEvent);
                    this.F = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i == 3) {
            this.v = false;
            this.C = -1;
            velocityTracker2 = this.w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.w = null;
            }
            if (this.f16o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 6) {
            o(motionEvent);
        }
        return this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.s = false;
        View view = this.u;
        if (view != null && l(view, this)) {
            View view2 = this.u;
            Rect rect = this.n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.u = null;
        if (!this.t) {
            if (this.H != null) {
                scrollTo(getScrollX(), this.H.l);
                this.H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.x && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.J.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.J.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = Yu0.b.m0;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ m(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof HU)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        HU hu = (HU) parcelable;
        super.onRestoreInstanceState(hu.getSuperState());
        this.H = hu;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        HU hu = new HU(super.onSaveInstanceState());
        hu.l = getScrollY();
        return hu;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        GU gu = this.L;
        if (gu != null) {
            C2720s4 c2720s4 = (C2720s4) gu;
            C2426p2.b(this, (View) c2720s4.m, (View) c2720s4.n);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.n;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.y) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.F);
        IU iu = this.J;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.q;
            EdgeEffect edgeEffect2 = this.p;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.w;
                velocityTracker.computeCurrentVelocity(1000, this.B);
                int yVelocity = (int) velocityTracker.getYVelocity(this.C);
                if (Math.abs(yVelocity) >= this.A) {
                    if (AbstractC1923jt0.n(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (AbstractC1923jt0.n(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!iu.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            j(i2);
                        }
                    }
                } else if (this.f16o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.C = -1;
                this.v = false;
                VelocityTracker velocityTracker2 = this.w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.w = null;
                }
                w(0);
                this.p.onRelease();
                this.q.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.r - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (AbstractC1923jt0.n(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC1923jt0.x(edgeEffect2, -height, x);
                        if (AbstractC1923jt0.n(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC1923jt0.n(edgeEffect) != 0.0f) {
                        float fX = AbstractC1923jt0.x(edgeEffect, height, 1.0f - x);
                        if (AbstractC1923jt0.n(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fX;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.v && Math.abs(i4) > this.z) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.v = true;
                        i4 = i4 > 0 ? i4 - this.z : i4 + this.z;
                    }
                    if (this.v) {
                        int iS = s(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.r = y - iS;
                        this.F += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.v && getChildCount() > 0 && this.f16o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.C = -1;
                this.v = false;
                VelocityTracker velocityTracker3 = this.w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.w = null;
                }
                w(0);
                this.p.onRelease();
                this.q.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.r = (int) motionEvent.getY(actionIndex);
                this.C = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.r = (int) motionEvent.getY(motionEvent.findPointerIndex(this.C));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16o.isFinished()) {
                this.f16o.abortAnimation();
                w(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.r = y2;
            this.C = pointerId;
            iu.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.w;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.J.g(1)) {
            this.f16o.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    public final void q(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.n;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            s(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.s) {
            this.u = view2;
        } else {
            Rect rect = this.n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z2 = iH != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iH);
            } else {
                u(0, iH, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.w) != null) {
            velocityTracker.recycle();
            this.w = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s = true;
        super.requestLayout();
    }

    public final int s(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        IU iu = this.J;
        if (i3 == 1) {
            iu.h(2, i3);
        }
        boolean zC = this.J.c(0, i, i3, this.E, this.D);
        int[] iArr = this.E;
        int[] iArr2 = this.D;
        if (zC) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = p(i4, 0, scrollY, scrollRange) && !iu.g(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.J.e(0, scrollY2, 0, i4 - scrollY2, this.D, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.q;
        EdgeEffect edgeEffect2 = this.p;
        if (i8 < 0) {
            if (z3) {
                AbstractC1923jt0.x(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            AbstractC1923jt0.x(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.w) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            w(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.x) {
            this.x = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        IU iu = this.J;
        if (iu.d) {
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.z(iu.c);
        }
        iu.d = z;
    }

    public void setOnScrollChangeListener(GU gu) {
        this.L = gu;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.J.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fN = AbstractC1923jt0.n(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.l * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = N;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fN;
    }

    public final void u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.m > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16o.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, C3080vp0.y0);
            if (z) {
                this.J.h(2, 1);
            } else {
                w(1);
            }
            this.G = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f16o.isFinished()) {
                this.f16o.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.m = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.p;
        if (AbstractC1923jt0.n(edgeEffect) != 0.0f) {
            AbstractC1923jt0.x(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.q;
        if (AbstractC1923jt0.n(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC1923jt0.x(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.J.i(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
