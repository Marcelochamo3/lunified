package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AbstractC1923jt0;
import o.AbstractC3478zu0;
import o.C1386eQ;
import o.C2236n4;
import o.C2333o4;
import o.C2424p1;
import o.C2514px;
import o.Gl0;
import o.Hl0;
import o.Il0;
import o.InterfaceC0760Sj;
import o.InterfaceC1094bQ;
import o.It0;
import o.Jl0;
import o.Kh0;
import o.Kl0;
import o.Ll0;
import o.Ml0;
import o.Ol0;
import o.Ou0;
import o.Q80;
import o.RN;
import o.RunnableC3102w1;
import o.T4;
import o.T40;
import o.YN;
import o.Z0;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1094bQ {
    public int A;
    public int B;
    public int C;
    public int D;
    public Q80 E;
    public int F;
    public int G;
    public final int H;
    public CharSequence I;
    public CharSequence J;
    public ColorStateList K;
    public ColorStateList L;
    public boolean M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final int[] Q;
    public final RN R;
    public ArrayList S;
    public final Hl0 T;
    public Ol0 U;
    public C2424p1 V;
    public Jl0 W;
    public boolean a0;
    public OnBackInvokedCallback b0;
    public OnBackInvokedDispatcher c0;
    public boolean d0;
    public final RunnableC3102w1 e0;
    public ActionMenuView l;
    public T4 m;
    public T4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2236n4 f10o;
    public C2333o4 p;
    public final Drawable q;
    public final CharSequence r;
    public C2236n4 s;
    public View t;
    public Context u;
    public int v;
    public int w;
    public int x;
    public final int y;
    public final int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new Kh0(getContext());
    }

    public static Kl0 h() {
        Kl0 kl0 = new Kl0(-2, -2);
        kl0.b = 0;
        kl0.a = 8388627;
        return kl0;
    }

    public static Kl0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof Kl0;
        if (z) {
            Kl0 kl0 = (Kl0) layoutParams;
            Kl0 kl1 = new Kl0(kl0);
            kl1.b = 0;
            kl1.b = kl0.b;
            return kl1;
        }
        if (z) {
            Kl0 kl2 = new Kl0((Kl0) layoutParams);
            kl2.b = 0;
            return kl2;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Kl0 kl3 = new Kl0(layoutParams);
            kl3.b = 0;
            return kl3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Kl0 kl4 = new Kl0(marginLayoutParams);
        kl4.b = 0;
        ((ViewGroup.MarginLayoutParams) kl4).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) kl4).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) kl4).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) kl4).bottomMargin = marginLayoutParams.bottomMargin;
        return kl4;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                Kl0 kl0 = (Kl0) childAt.getLayoutParams();
                if (kl0.b == 0 && t(childAt)) {
                    int i3 = kl0.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            Kl0 kl1 = (Kl0) childAt2.getLayoutParams();
            if (kl1.b == 0 && t(childAt2)) {
                int i5 = kl1.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        Kl0 kl0I;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            kl0I = h();
        } else {
            kl0I = !checkLayoutParams(layoutParams) ? i(layoutParams) : (Kl0) layoutParams;
        }
        kl0I.b = 1;
        if (!z || this.t == null) {
            addView(view, kl0I);
        } else {
            view.setLayoutParams(kl0I);
            this.P.add(view);
        }
    }

    public final void c() {
        if (this.s == null) {
            C2236n4 c2236n4 = new C2236n4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.s = c2236n4;
            c2236n4.setImageDrawable(this.q);
            this.s.setContentDescription(this.r);
            Kl0 kl0H = h();
            kl0H.a = (this.y & 112) | 8388611;
            kl0H.b = 2;
            this.s.setLayoutParams(kl0H);
            this.s.setOnClickListener(new Z0(7, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Kl0);
    }

    public final void d() {
        if (this.E == null) {
            Q80 q80 = new Q80();
            q80.a = 0;
            q80.b = 0;
            q80.c = Integer.MIN_VALUE;
            q80.d = Integer.MIN_VALUE;
            q80.e = 0;
            q80.f = 0;
            q80.g = false;
            q80.h = false;
            this.E = q80;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.l;
        if (actionMenuView.A == null) {
            ZP zp = (ZP) actionMenuView.getMenu();
            if (this.W == null) {
                this.W = new Jl0(this);
            }
            this.l.setExpandedActionViewsExclusive(true);
            zp.b(this.W, this.u);
            u();
        }
    }

    public final void f() {
        if (this.l == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.l = actionMenuView;
            actionMenuView.setPopupTheme(this.v);
            this.l.setOnMenuItemClickListener(this.T);
            ActionMenuView actionMenuView2 = this.l;
            Hl0 hl0 = new Hl0(this);
            actionMenuView2.F = null;
            actionMenuView2.G = hl0;
            Kl0 kl0H = h();
            kl0H.a = (this.y & 112) | 8388613;
            this.l.setLayoutParams(kl0H);
            b(this.l, false);
        }
    }

    public final void g() {
        if (this.f10o == null) {
            this.f10o = new C2236n4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Kl0 kl0H = h();
            kl0H.a = (this.y & 112) | 8388611;
            this.f10o.setLayoutParams(kl0H);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C2236n4 c2236n4 = this.s;
        if (c2236n4 != null) {
            return c2236n4.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2236n4 c2236n4 = this.s;
        if (c2236n4 != null) {
            return c2236n4.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q80 q80 = this.E;
        if (q80 != null) {
            return q80.g ? q80.a : q80.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.G;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q80 q80 = this.E;
        if (q80 != null) {
            return q80.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q80 q80 = this.E;
        if (q80 != null) {
            return q80.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q80 q80 = this.E;
        if (q80 != null) {
            return q80.g ? q80.b : q80.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.F;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ZP zp;
        ActionMenuView actionMenuView = this.l;
        return (actionMenuView == null || (zp = actionMenuView.A) == null || !zp.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.G, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2333o4 c2333o4 = this.p;
        if (c2333o4 != null) {
            return c2333o4.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2333o4 c2333o4 = this.p;
        if (c2333o4 != null) {
            return c2333o4.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.l.getMenu();
    }

    public View getNavButtonView() {
        return this.f10o;
    }

    public CharSequence getNavigationContentDescription() {
        C2236n4 c2236n4 = this.f10o;
        if (c2236n4 != null) {
            return c2236n4.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2236n4 c2236n4 = this.f10o;
        if (c2236n4 != null) {
            return c2236n4.getDrawable();
        }
        return null;
    }

    public C2424p1 getOuterActionMenuPresenter() {
        return this.V;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.l.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.u;
    }

    public int getPopupTheme() {
        return this.v;
    }

    public CharSequence getSubtitle() {
        return this.J;
    }

    public final TextView getSubtitleTextView() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.I;
    }

    public int getTitleMarginBottom() {
        return this.D;
    }

    public int getTitleMarginEnd() {
        return this.B;
    }

    public int getTitleMarginStart() {
        return this.A;
    }

    public int getTitleMarginTop() {
        return this.C;
    }

    public final TextView getTitleTextView() {
        return this.m;
    }

    public InterfaceC0760Sj getWrapper() {
        Drawable drawable;
        if (this.U == null) {
            Ol0 ol0 = new Ol0();
            ol0.n = 0;
            ol0.a = this;
            ol0.h = getTitle();
            ol0.i = getSubtitle();
            ol0.g = ol0.h != null;
            ol0.f = getNavigationIcon();
            RN rnY = RN.y(getContext(), null, T40.a, R.attr.actionBarStyle, 0);
            ol0.f441o = rnY.u(15);
            TypedArray typedArray = (TypedArray) rnY.n;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                ol0.g = true;
                ol0.h = text;
                if ((ol0.b & 8) != 0) {
                    Toolbar toolbar = ol0.a;
                    toolbar.setTitle(text);
                    if (ol0.g) {
                        It0.q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                ol0.i = text2;
                if ((ol0.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableU = rnY.u(20);
            if (drawableU != null) {
                ol0.e = drawableU;
                ol0.c();
            }
            Drawable drawableU2 = rnY.u(17);
            if (drawableU2 != null) {
                ol0.d = drawableU2;
                ol0.c();
            }
            if (ol0.f == null && (drawable = ol0.f441o) != null) {
                ol0.f = drawable;
                int i = ol0.b & 4;
                Toolbar toolbar2 = ol0.a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            ol0.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = ol0.c;
                if (view != null && (ol0.b & 16) != 0) {
                    removeView(view);
                }
                ol0.c = viewInflate;
                if (viewInflate != null && (ol0.b & 16) != 0) {
                    addView(viewInflate);
                }
                ol0.a(ol0.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.E.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.w = resourceId2;
                T4 t4 = this.m;
                if (t4 != null) {
                    t4.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.x = resourceId3;
                T4 t5 = this.n;
                if (t5 != null) {
                    t5.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            rnY.A();
            if (R.string.abc_action_bar_up_description != ol0.n) {
                ol0.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = ol0.n;
                    ol0.j = i2 != 0 ? getContext().getString(i2) : null;
                    ol0.b();
                }
            }
            ol0.j = getNavigationContentDescription();
            setNavigationOnClickListener(new YN(ol0));
            this.U = ol0;
        }
        return this.U;
    }

    public final int j(View view, int i) {
        Kl0 kl0 = (Kl0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = kl0.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) kl0).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) kl0).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) kl0).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.R.n).iterator();
        while (it2.hasNext()) {
            ((C2514px) it2.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.S = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.P.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.e0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.N = false;
        }
        if (!this.N) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0261  */
    /* JADX WARN: Code duplicated, block: B:101:0x0283  */
    /* JADX WARN: Code duplicated, block: B:103:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0314 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0316  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        T4 t4;
        T4 t5;
        Kl0 kl0;
        Kl0 kl1;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int size;
        int iP2;
        int i17;
        int i18;
        int size2;
        int i19;
        int size3;
        int i20;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.Q;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = It0.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.f10o)) {
            if (z3) {
                iQ = q(this.f10o, i26, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(this.f10o, paddingLeft, iMin2, iArr);
            }
            if (t(this.s)) {
                if (z3) {
                    iQ = q(this.s, iQ, iMin2, iArr);
                } else {
                    iP = p(this.s, iP, iMin2, iArr);
                }
            }
            if (t(this.l)) {
                if (z3) {
                    iP = p(this.l, iP, iMin2, iArr);
                } else {
                    iQ = q(this.l, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i26 - currentContentInsetRight);
            if (t(this.t)) {
                if (z3) {
                    iMin = q(this.t, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.t, iMax, iMin2, iArr);
                }
            }
            if (t(this.p)) {
                if (z3) {
                    iMin = q(this.p, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.p, iMax, iMin2, iArr);
                }
            }
            zT = t(this.m);
            zT2 = t(this.n);
            if (zT) {
                Kl0 kl2 = (Kl0) this.m.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) kl2).bottomMargin + this.m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kl2).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                Kl0 kl3 = (Kl0) this.n.getLayoutParams();
                measuredHeight += this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kl3).topMargin + ((ViewGroup.MarginLayoutParams) kl3).bottomMargin;
            }
            if (!zT || zT2) {
                if (zT) {
                    t4 = this.m;
                } else {
                    t4 = this.n;
                }
                if (zT2) {
                    t5 = this.n;
                } else {
                    t5 = this.m;
                }
                kl0 = (Kl0) t4.getLayoutParams();
                kl1 = (Kl0) t5.getLayoutParams();
                z2 = (!zT && this.m.getMeasuredWidth() > 0) || (zT2 && this.n.getMeasuredWidth() > 0);
                i5 = this.H & 112;
                i6 = iMin2;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) kl0).bottomMargin;
                        i16 = this.D;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) kl1).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) kl1).bottomMargin) - this.D) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.A;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zT) {
                        Kl0 kl4 = (Kl0) this.m.getLayoutParams();
                        int measuredWidth2 = iMin - this.m.getMeasuredWidth();
                        int measuredHeight2 = this.m.getMeasuredHeight() + paddingTop;
                        this.m.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.B;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) kl4).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zT2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                        this.n.layout(iMin - this.n.getMeasuredWidth(), i28, iMin, this.n.getMeasuredHeight() + i28);
                        i12 = iMin - this.B;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i7 = this.A;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax = Math.max(0, i29) + iMax;
                    iArr[0] = Math.max(0, -i29);
                    if (zT) {
                        Kl0 kl5 = (Kl0) this.m.getLayoutParams();
                        int measuredWidth3 = this.m.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.m.getMeasuredHeight() + paddingTop;
                        this.m.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.B;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) kl5).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (zT2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.n.getMeasuredWidth() + iMax;
                        this.n.layout(iMax, i30, measuredWidth4, this.n.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.B;
                    } else {
                        i9 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i6 = iMin2;
            }
            arrayList = this.O;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i17 = 0; i17 < size; i17++) {
                iP2 = p((View) arrayList.get(i17), iP2, i6, iArr);
            }
            i18 = i6;
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = q((View) arrayList.get(i19), iMin, i18, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            int i32 = iArr[1];
            size3 = arrayList.size();
            i20 = i32;
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                Kl0 kl6 = (Kl0) view.getLayoutParams();
                int i33 = ((ViewGroup.MarginLayoutParams) kl6).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) kl6).rightMargin - i20;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i20 = iMax6;
                i21 = iMax5;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iP2) {
                if (i25 > iMin) {
                    iP2 = i24 - (i25 - iMin);
                } else {
                    iP2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iP2 = p((View) arrayList.get(i23), iP2, i18, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i26;
        if (t(this.s)) {
            if (z3) {
                iQ = q(this.s, iQ, iMin2, iArr);
            } else {
                iP = p(this.s, iP, iMin2, iArr);
            }
        }
        if (t(this.l)) {
            if (z3) {
                iP = p(this.l, iP, iMin2, iArr);
            } else {
                iQ = q(this.l, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i26 - currentContentInsetRight2);
        if (t(this.t)) {
            if (z3) {
                iMin = q(this.t, iMin, iMin2, iArr);
            } else {
                iMax = p(this.t, iMax, iMin2, iArr);
            }
        }
        if (t(this.p)) {
            if (z3) {
                iMin = q(this.p, iMin, iMin2, iArr);
            } else {
                iMax = p(this.p, iMax, iMin2, iArr);
            }
        }
        zT = t(this.m);
        zT2 = t(this.n);
        if (zT) {
            Kl0 kl7 = (Kl0) this.m.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) kl7).bottomMargin + this.m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kl7).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            Kl0 kl8 = (Kl0) this.n.getLayoutParams();
            measuredHeight += this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kl8).topMargin + ((ViewGroup.MarginLayoutParams) kl8).bottomMargin;
        }
        if (zT) {
            if (zT) {
                t4 = this.m;
            } else {
                t4 = this.n;
            }
            if (zT2) {
                t5 = this.n;
            } else {
                t5 = this.m;
            }
            kl0 = (Kl0) t4.getLayoutParams();
            kl1 = (Kl0) t5.getLayoutParams();
            if (zT) {
            }
            i5 = this.H & 112;
            i6 = iMin2;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) kl0).bottomMargin;
                    i16 = this.D;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) kl1).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) kl1).bottomMargin) - this.D) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.A;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zT) {
                    Kl0 kl9 = (Kl0) this.m.getLayoutParams();
                    int measuredWidth5 = iMin - this.m.getMeasuredWidth();
                    int measuredHeight4 = this.m.getMeasuredHeight() + paddingTop;
                    this.m.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.B;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) kl9).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zT2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                    this.n.layout(iMin - this.n.getMeasuredWidth(), i211, iMin, this.n.getMeasuredHeight() + i211);
                    i12 = iMin - this.B;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.A;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax = Math.max(0, i212) + iMax;
                iArr[0] = Math.max(0, -i212);
                if (zT) {
                    Kl0 kl10 = (Kl0) this.m.getLayoutParams();
                    int measuredWidth6 = this.m.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.m.getMeasuredHeight() + paddingTop;
                    this.m.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.B;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) kl10).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zT2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.n.getMeasuredWidth() + iMax;
                    this.n.layout(iMax, i35, measuredWidth7, this.n.getMeasuredHeight() + i35);
                    i9 = measuredWidth7 + this.B;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (zT) {
                t4 = this.m;
            } else {
                t4 = this.n;
            }
            if (zT2) {
                t5 = this.n;
            } else {
                t5 = this.m;
            }
            kl0 = (Kl0) t4.getLayoutParams();
            kl1 = (Kl0) t5.getLayoutParams();
            if (zT) {
            }
            i5 = this.H & 112;
            i6 = iMin2;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) kl0).topMargin + this.C;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) kl0).bottomMargin;
                    i16 = this.D;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) kl1).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) kl1).bottomMargin) - this.D) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.A;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zT) {
                    Kl0 kl11 = (Kl0) this.m.getLayoutParams();
                    int measuredWidth8 = iMin - this.m.getMeasuredWidth();
                    int measuredHeight6 = this.m.getMeasuredHeight() + paddingTop;
                    this.m.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.B;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) kl11).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zT2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                    this.n.layout(iMin - this.n.getMeasuredWidth(), i214, iMin, this.n.getMeasuredHeight() + i214);
                    i12 = iMin - this.B;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.A;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax = Math.max(0, i215) + iMax;
                iArr[0] = Math.max(0, -i215);
                if (zT) {
                    Kl0 kl12 = (Kl0) this.m.getLayoutParams();
                    int measuredWidth9 = this.m.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.m.getMeasuredHeight() + paddingTop;
                    this.m.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.B;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) kl12).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zT2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Kl0) this.n.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.n.getMeasuredWidth() + iMax;
                    this.n.layout(iMax, i36, measuredWidth10, this.n.getMeasuredHeight() + i36);
                    i9 = measuredWidth10 + this.B;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        arrayList = this.O;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i17 < size) {
            iP2 = p((View) arrayList.get(i17), iP2, i6, iArr);
        }
        i18 = i6;
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = q((View) arrayList.get(i19), iMin, i18, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        int i38 = iArr[1];
        size3 = arrayList.size();
        i20 = i38;
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            Kl0 kl13 = (Kl0) view2.getLayoutParams();
            int i39 = ((ViewGroup.MarginLayoutParams) kl13).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) kl13).rightMargin - i20;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i20 = iMax10;
            i21 = iMax9;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iP2) {
            if (i25 > iMin) {
                iP2 = i24 - (i25 - iMin);
            } else {
                iP2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iP2 = p((View) arrayList.get(i23), iP2, i18, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iL;
        boolean z = AbstractC3478zu0.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (t(this.f10o)) {
            s(this.f10o, i, 0, i2, this.z);
            iK = k(this.f10o) + this.f10o.getMeasuredWidth();
            iMax = Math.max(0, l(this.f10o) + this.f10o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f10o.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.s)) {
            s(this.s, i, 0, i2, this.z);
            iK = k(this.s) + this.s.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.s) + this.s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.Q;
        iArr[c] = iMax4;
        if (t(this.l)) {
            s(this.l, i, iMax3, i2, this.z);
            iK2 = k(this.l) + this.l.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.t)) {
            iMax5 += r(this.t, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.t) + this.t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.t.getMeasuredState());
        }
        if (t(this.p)) {
            iMax5 += r(this.p, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.p) + this.p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.p.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((Kl0) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.C + this.D;
        int i6 = this.A + this.B;
        if (t(this.m)) {
            r(this.m, i, iMax5 + i6, i2, i5, iArr);
            int iK3 = k(this.m) + this.m.getMeasuredWidth();
            iL = l(this.m) + this.m.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
            iMax2 = iK3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iL = 0;
        }
        if (t(this.n)) {
            iMax2 = Math.max(iMax2, r(this.n, i, iMax5 + i6, i2, iL + i5, iArr));
            iL = l(this.n) + this.n.getMeasuredHeight() + iL;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.n.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.a0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof Ml0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Ml0 ml0 = (Ml0) parcelable;
        super.onRestoreInstanceState(ml0.l);
        ActionMenuView actionMenuView = this.l;
        ZP zp = actionMenuView != null ? actionMenuView.A : null;
        int i = ml0.n;
        if (i != 0 && this.W != null && zp != null && (menuItemFindItem = zp.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (ml0.f400o) {
            RunnableC3102w1 runnableC3102w1 = this.e0;
            removeCallbacks(runnableC3102w1);
            post(runnableC3102w1);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        Q80 q80 = this.E;
        boolean z = i == 1;
        if (z == q80.g) {
            return;
        }
        q80.g = z;
        if (!q80.h) {
            q80.a = q80.e;
            q80.b = q80.f;
            return;
        }
        if (z) {
            int i2 = q80.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = q80.e;
            }
            q80.a = i2;
            int i3 = q80.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = q80.f;
            }
            q80.b = i3;
            return;
        }
        int i4 = q80.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = q80.e;
        }
        q80.a = i4;
        int i5 = q80.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = q80.f;
        }
        q80.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2424p1 c2424p1;
        C1386eQ c1386eQ;
        Ml0 ml0 = new Ml0(super.onSaveInstanceState());
        Jl0 jl0 = this.W;
        if (jl0 != null && (c1386eQ = jl0.m) != null) {
            ml0.n = c1386eQ.a;
        }
        ActionMenuView actionMenuView = this.l;
        ml0.f400o = (actionMenuView == null || (c2424p1 = actionMenuView.E) == null || !c2424p1.h()) ? false : true;
        return ml0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = false;
        }
        if (!this.M) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        Kl0 kl0 = (Kl0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) kl0).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) kl0).rightMargin + iMax;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Kl0 kl0 = (Kl0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) kl0).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) kl0).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(Ou0.l(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.a0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.G) {
            this.G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.F) {
            this.F = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(Ou0.l(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(Ou0.l(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f10o.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.l.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.v != i) {
            this.v = i;
            if (i == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.D = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.B = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.C = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Il0.a(this);
            Jl0 jl0 = this.W;
            boolean z = (jl0 == null || jl0.m == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.d0) ? false : true;
            if (z && this.c0 == null) {
                if (this.b0 == null) {
                    this.b0 = Il0.b(new Gl0(this, 0));
                }
                Il0.c(onBackInvokedDispatcherA, this.b0);
                this.c0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.c0) == null) {
                return;
            }
            Il0.d(onBackInvokedDispatcher, this.b0);
            this.c0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.H = 8388627;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new int[2];
        this.R = new RN(new Gl0(this, 1));
        this.S = new ArrayList();
        this.T = new Hl0(this);
        this.e0 = new RunnableC3102w1(26, this);
        Context context2 = getContext();
        int[] iArr = T40.x;
        RN rnY = RN.y(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        It0.o(this, context, iArr, attributeSet, (TypedArray) rnY.n, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) rnY.n;
        this.w = typedArray.getResourceId(28, 0);
        this.x = typedArray.getResourceId(19, 0);
        this.H = typedArray.getInteger(0, 8388627);
        this.y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        this.A = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.B = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.C = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.D = dimensionPixelOffset5;
        }
        this.z = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q80 q80 = this.E;
        q80.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q80.e = dimensionPixelSize;
            q80.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q80.f = dimensionPixelSize2;
            q80.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q80.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.F = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.G = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.q = rnY.u(4);
        this.r = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.u = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableU = rnY.u(16);
        if (drawableU != null) {
            setNavigationIcon(drawableU);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableU2 = rnY.u(11);
        if (drawableU2 != null) {
            setLogo(drawableU2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(rnY.s(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(rnY.s(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        rnY.A();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Kl0 kl0 = new Kl0(context, attributeSet);
        kl0.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.b);
        kl0.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        kl0.b = 0;
        return kl0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C2236n4 c2236n4 = this.s;
        if (c2236n4 != null) {
            c2236n4.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.s.setImageDrawable(drawable);
        } else {
            C2236n4 c2236n4 = this.s;
            if (c2236n4 != null) {
                c2236n4.setImageDrawable(this.q);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.p == null) {
                this.p = new C2333o4(getContext(), null, 0);
            }
            if (!o(this.p)) {
                b(this.p, true);
            }
        } else {
            C2333o4 c2333o4 = this.p;
            if (c2333o4 != null && o(c2333o4)) {
                removeView(this.p);
                this.P.remove(this.p);
            }
        }
        C2333o4 c2333o5 = this.p;
        if (c2333o5 != null) {
            c2333o5.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.p == null) {
            this.p = new C2333o4(getContext(), null, 0);
        }
        C2333o4 c2333o4 = this.p;
        if (c2333o4 != null) {
            c2333o4.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C2236n4 c2236n4 = this.f10o;
        if (c2236n4 != null) {
            c2236n4.setContentDescription(charSequence);
            AbstractC1923jt0.H(this.f10o, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f10o)) {
                b(this.f10o, true);
            }
        } else {
            C2236n4 c2236n4 = this.f10o;
            if (c2236n4 != null && o(c2236n4)) {
                removeView(this.f10o);
                this.P.remove(this.f10o);
            }
        }
        C2236n4 c2236n5 = this.f10o;
        if (c2236n5 != null) {
            c2236n5.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            T4 t4 = this.n;
            if (t4 != null && o(t4)) {
                removeView(this.n);
                this.P.remove(this.n);
            }
        } else {
            if (this.n == null) {
                Context context = getContext();
                T4 t5 = new T4(context, null);
                this.n = t5;
                t5.setSingleLine();
                this.n.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.x;
                if (i != 0) {
                    this.n.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.n.setTextColor(colorStateList);
                }
            }
            if (!o(this.n)) {
                b(this.n, true);
            }
        }
        T4 t6 = this.n;
        if (t6 != null) {
            t6.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        T4 t4 = this.n;
        if (t4 != null) {
            t4.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            T4 t4 = this.m;
            if (t4 != null && o(t4)) {
                removeView(this.m);
                this.P.remove(this.m);
            }
        } else {
            if (this.m == null) {
                Context context = getContext();
                T4 t5 = new T4(context, null);
                this.m = t5;
                t5.setSingleLine();
                this.m.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.w;
                if (i != 0) {
                    this.m.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.K;
                if (colorStateList != null) {
                    this.m.setTextColor(colorStateList);
                }
            }
            if (!o(this.m)) {
                b(this.m, true);
            }
        }
        T4 t6 = this.m;
        if (t6 != null) {
            t6.setText(charSequence);
        }
        this.I = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        T4 t4 = this.m;
        if (t4 != null) {
            t4.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(Ll0 ll0) {
    }
}
