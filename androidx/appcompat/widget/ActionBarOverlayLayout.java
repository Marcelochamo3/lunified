package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.skidush.clonex.R;
import java.util.WeakHashMap;
import o.AbstractC2991ut0;
import o.AbstractC3185wt0;
import o.Aw0;
import o.C0962a1;
import o.C1255d1;
import o.C1352e1;
import o.C2416ow0;
import o.C2424p1;
import o.C2606qu0;
import o.C2650rP;
import o.C3288xw0;
import o.C3385yw0;
import o.C3482zw0;
import o.Hw0;
import o.InterfaceC0734Rj;
import o.InterfaceC0760Sj;
import o.InterfaceC1157c1;
import o.It0;
import o.JU;
import o.Jl0;
import o.KU;
import o.Kw0;
import o.Ol0;
import o.Ou0;
import o.RunnableC1060b1;
import o.T3;
import o.TF;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0734Rj, JU, KU {
    public static final int[] N = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final Kw0 O;
    public static final Rect P;
    public final Rect A;
    public Kw0 B;
    public Kw0 C;
    public Kw0 D;
    public Kw0 E;
    public InterfaceC1157c1 F;
    public OverScroller G;
    public ViewPropertyAnimator H;
    public final C0962a1 I;
    public final RunnableC1060b1 J;
    public final RunnableC1060b1 K;
    public final C2650rP L;
    public final C1352e1 M;
    public int l;
    public int m;
    public ContentFrameLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionBarContainer f7o;
    public InterfaceC0760Sj p;
    public Drawable q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final Rect x;
    public final Rect y;
    public final Rect z;

    static {
        Aw0 c3385yw0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c3385yw0 = new C3482zw0();
        } else {
            c3385yw0 = i >= 29 ? new C3385yw0() : new C3288xw0();
        }
        c3385yw0.g(TF.b(0, 1, 0, 1));
        O = c3385yw0.b();
        P = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 0;
        this.x = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        Kw0 kw0 = Kw0.b;
        this.B = kw0;
        this.C = kw0;
        this.D = kw0;
        this.E = kw0;
        this.I = new C0962a1(0, this);
        this.J = new RunnableC1060b1(this, 0);
        this.K = new RunnableC1060b1(this, 1);
        i(context);
        this.L = new C2650rP();
        C1352e1 c1352e1 = new C1352e1(context);
        c1352e1.setWillNotDraw(true);
        this.M = c1352e1;
        addView(c1352e1);
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        C1255d1 c1255d1 = (C1255d1) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1255d1).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1255d1).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1255d1).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1255d1).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1255d1).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1255d1).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1255d1).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1255d1).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // o.JU
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.JU
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o.JU
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1255d1;
    }

    @Override // o.KU
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.q != null) {
            if (this.f7o.getVisibility() == 0) {
                translationY = (int) (this.f7o.getTranslationY() + this.f7o.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.q.setBounds(0, translationY, getWidth(), this.q.getIntrinsicHeight() + translationY);
            this.q.draw(canvas);
        }
    }

    @Override // o.JU
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.JU
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1255d1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1255d1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f7o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2650rP c2650rP = this.L;
        return c2650rP.b | c2650rP.a;
    }

    public CharSequence getTitle() {
        k();
        return ((Ol0) this.p).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.J);
        removeCallbacks(this.K);
        ViewPropertyAnimator viewPropertyAnimator = this.H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(N);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.q = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.G = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            this.p.getClass();
        } else if (i == 5) {
            this.p.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0760Sj wrapper;
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f7o = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0760Sj) {
                wrapper = (InterfaceC0760Sj) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.p = wrapper;
        }
    }

    public final void l(ZP zp, T3 t3) {
        k();
        Ol0 ol0 = (Ol0) this.p;
        C2424p1 c2424p1 = ol0.m;
        Toolbar toolbar = ol0.a;
        if (c2424p1 == null) {
            C2424p1 c2424p2 = new C2424p1(toolbar.getContext());
            ol0.m = c2424p2;
            c2424p2.t = R.id.action_menu_presenter;
        }
        C2424p1 c2424p3 = ol0.m;
        c2424p3.p = t3;
        if (zp == null && toolbar.l == null) {
            return;
        }
        toolbar.f();
        ZP zp2 = toolbar.l.A;
        if (zp2 == zp) {
            return;
        }
        if (zp2 != null) {
            zp2.r(toolbar.V);
            zp2.r(toolbar.W);
        }
        if (toolbar.W == null) {
            toolbar.W = new Jl0(toolbar);
        }
        c2424p3.C = true;
        if (zp != null) {
            zp.b(c2424p3, toolbar.u);
            zp.b(toolbar.W, toolbar.u);
        } else {
            c2424p3.j(toolbar.u, null);
            toolbar.W.j(toolbar.u, null);
            c2424p3.d(true);
            toolbar.W.d(true);
        }
        toolbar.l.setPopupTheme(toolbar.v);
        toolbar.l.setPresenter(c2424p3);
        toolbar.V = c2424p3;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        Kw0 kw0G = Kw0.g(this, windowInsets);
        boolean zG = g(this.f7o, new Rect(kw0G.b(), kw0G.d(), kw0G.c(), kw0G.a()), false);
        WeakHashMap weakHashMap = It0.a;
        Rect rect = this.x;
        AbstractC3185wt0.b(this, kw0G, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        Hw0 hw0 = kw0G.a;
        Kw0 kw0L = hw0.l(i, i2, i3, i4);
        this.B = kw0L;
        boolean z = true;
        if (!this.C.equals(kw0L)) {
            this.C = this.B;
            zG = true;
        }
        Rect rect2 = this.y;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return hw0.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1255d1 c1255d1 = (C1255d1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1255d1).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1255d1).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        Kw0 kw0;
        int i3;
        Aw0 c3288xw0;
        k();
        measureChildWithMargins(this.f7o, i, 0, i2, 0);
        C1255d1 c1255d1 = (C1255d1) this.f7o.getLayoutParams();
        int iMax = Math.max(0, this.f7o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1255d1).leftMargin + ((ViewGroup.MarginLayoutParams) c1255d1).rightMargin);
        int iMax2 = Math.max(0, this.f7o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1255d1).topMargin + ((ViewGroup.MarginLayoutParams) c1255d1).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f7o.getMeasuredState());
        WeakHashMap weakHashMap = It0.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.l;
            if (this.s && this.f7o.getTabContainer() != null) {
                measuredHeight += this.l;
            }
        } else {
            measuredHeight = this.f7o.getVisibility() != 8 ? this.f7o.getMeasuredHeight() : 0;
        }
        Rect rect = this.x;
        Rect rect2 = this.z;
        rect2.set(rect);
        this.D = this.B;
        if (this.r || z) {
            TF tfB = TF.b(this.D.b(), this.D.d() + measuredHeight, this.D.c(), this.D.a());
            kw0 = this.D;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                c3288xw0 = new C3482zw0(kw0);
            } else if (i3 >= 29) {
                c3288xw0 = new C3385yw0(kw0);
            } else {
                c3288xw0 = new C3288xw0(kw0);
            }
            c3288xw0.g(tfB);
            this.D = c3288xw0.b();
        } else {
            C1352e1 c1352e1 = this.M;
            Kw0 kw1 = O;
            Rect rect3 = this.A;
            AbstractC3185wt0.b(c1352e1, kw1, rect3);
            if (!rect3.equals(P)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.D = this.D.a.l(0, measuredHeight, 0, 0);
            } else {
                TF tfB2 = TF.b(this.D.b(), this.D.d() + measuredHeight, this.D.c(), this.D.a());
                kw0 = this.D;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    c3288xw0 = new C3482zw0(kw0);
                } else if (i3 >= 29) {
                    c3288xw0 = new C3385yw0(kw0);
                } else {
                    c3288xw0 = new C3288xw0(kw0);
                }
                c3288xw0.g(tfB2);
                this.D = c3288xw0.b();
            }
        }
        g(this.n, rect2, true);
        if (!this.E.equals(this.D)) {
            Kw0 kw2 = this.D;
            this.E = kw2;
            ContentFrameLayout contentFrameLayout = this.n;
            WindowInsets windowInsetsF = kw2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = AbstractC2991ut0.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    Kw0.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        C1255d1 c1255d2 = (C1255d1) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1255d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1255d2).rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1255d2).topMargin + ((ViewGroup.MarginLayoutParams) c1255d2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.t || !z) {
            return false;
        }
        this.G.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.G.getFinalY() > this.f7o.getHeight()) {
            h();
            this.K.run();
        } else {
            h();
            this.J.run();
        }
        this.u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.v + i2;
        this.v = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C2416ow0 c2416ow0;
        C2606qu0 c2606qu0;
        this.L.a = i;
        this.v = getActionBarHideOffset();
        h();
        InterfaceC1157c1 interfaceC1157c1 = this.F;
        if (interfaceC1157c1 == null || (c2606qu0 = (c2416ow0 = (C2416ow0) interfaceC1157c1).v) == null) {
            return;
        }
        c2606qu0.a();
        c2416ow0.v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f7o.getVisibility() != 0) {
            return false;
        }
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.t || this.u) {
            return;
        }
        if (this.v <= this.f7o.getHeight()) {
            h();
            postDelayed(this.J, 600L);
        } else {
            h();
            postDelayed(this.K, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.w ^ i;
        this.w = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1157c1 interfaceC1157c1 = this.F;
        if (interfaceC1157c1 != null) {
            ((C2416ow0) interfaceC1157c1).r = !z2;
            if (z || !z2) {
                C2416ow0 c2416ow0 = (C2416ow0) interfaceC1157c1;
                if (c2416ow0.s) {
                    c2416ow0.s = false;
                    c2416ow0.F(true);
                }
            } else {
                C2416ow0 c2416ow1 = (C2416ow0) interfaceC1157c1;
                if (!c2416ow1.s) {
                    c2416ow1.s = true;
                    c2416ow1.F(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.F == null) {
            return;
        }
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.m = i;
        InterfaceC1157c1 interfaceC1157c1 = this.F;
        if (interfaceC1157c1 != null) {
            ((C2416ow0) interfaceC1157c1).q = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f7o.setTranslationY(-Math.max(0, Math.min(i, this.f7o.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1157c1 interfaceC1157c1) {
        this.F = interfaceC1157c1;
        if (getWindowToken() != null) {
            ((C2416ow0) this.F).q = this.m;
            int i = this.w;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = It0.a;
                AbstractC2991ut0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.s = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.t) {
            this.t = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        Ol0 ol0 = (Ol0) this.p;
        ol0.d = i != 0 ? Ou0.l(ol0.a.getContext(), i) : null;
        ol0.c();
    }

    public void setLogo(int i) {
        k();
        Ol0 ol0 = (Ol0) this.p;
        ol0.e = i != 0 ? Ou0.l(ol0.a.getContext(), i) : null;
        ol0.c();
    }

    public void setOverlayMode(boolean z) {
        this.r = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // o.InterfaceC0734Rj
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Ol0) this.p).k = callback;
    }

    @Override // o.InterfaceC0734Rj
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Ol0 ol0 = (Ol0) this.p;
        if (ol0.g) {
            return;
        }
        ol0.h = charSequence;
        if ((ol0.b & 8) != 0) {
            Toolbar toolbar = ol0.a;
            toolbar.setTitle(charSequence);
            if (ol0.g) {
                It0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1255d1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Ol0 ol0 = (Ol0) this.p;
        ol0.d = drawable;
        ol0.c();
    }
}
