package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skidush.clonex.R;
import o.AbstractC2908u1;
import o.AbstractC3478zu0;
import o.C1744i1;
import o.C2033l;
import o.C2424p1;
import o.C2509pu0;
import o.InterfaceC2845tQ;
import o.It0;
import o.Ou0;
import o.T40;
import o.Z0;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public final int B;
    public final int C;
    public boolean D;
    public final int E;
    public final C2033l l;
    public final Context m;
    public ActionMenuView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2424p1 f6o;
    public int p;
    public C2509pu0 q;
    public boolean r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public View v;
    public View w;
    public View x;
    public LinearLayout y;
    public TextView z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.l = new C2033l(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.m = context;
        } else {
            this.m = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : Ou0.l(context, resourceId));
        this.B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.p = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC2908u1 abstractC2908u1) {
        View view = this.v;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.E, (ViewGroup) this, false);
            this.v = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.v);
        }
        View viewFindViewById = this.v.findViewById(R.id.action_mode_close_button);
        this.w = viewFindViewById;
        viewFindViewById.setOnClickListener(new Z0(0, abstractC2908u1));
        ZP zpC = abstractC2908u1.c();
        C2424p1 c2424p1 = this.f6o;
        if (c2424p1 != null) {
            c2424p1.e();
            C1744i1 c1744i1 = c2424p1.F;
            if (c1744i1 != null && c1744i1.b()) {
                c1744i1.j.dismiss();
            }
        }
        C2424p1 c2424p2 = new C2424p1(getContext());
        this.f6o = c2424p2;
        c2424p2.x = true;
        c2424p2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        zpC.b(this.f6o, this.m);
        C2424p1 c2424p3 = this.f6o;
        InterfaceC2845tQ interfaceC2845tQ = c2424p3.s;
        if (interfaceC2845tQ == null) {
            InterfaceC2845tQ interfaceC2845tQ2 = (InterfaceC2845tQ) c2424p3.f961o.inflate(c2424p3.q, (ViewGroup) this, false);
            c2424p3.s = interfaceC2845tQ2;
            interfaceC2845tQ2.b(c2424p3.n);
            c2424p3.d(true);
        }
        InterfaceC2845tQ interfaceC2845tQ3 = c2424p3.s;
        if (interfaceC2845tQ != interfaceC2845tQ3) {
            ((ActionMenuView) interfaceC2845tQ3).setPresenter(c2424p3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC2845tQ3;
        this.n = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.n, layoutParams);
    }

    public final void d() {
        if (this.y == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.y = linearLayout;
            this.z = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A = (TextView) this.y.findViewById(R.id.action_bar_subtitle);
            int i = this.B;
            if (i != 0) {
                this.z.setTextAppearance(getContext(), i);
            }
            int i2 = this.C;
            if (i2 != 0) {
                this.A.setTextAppearance(getContext(), i2);
            }
        }
        this.z.setText(this.t);
        this.A.setText(this.u);
        boolean z = !TextUtils.isEmpty(this.t);
        boolean z2 = !TextUtils.isEmpty(this.u);
        this.A.setVisibility(z2 ? 0 : 8);
        this.y.setVisibility((z || z2) ? 0 : 8);
        if (this.y.getParent() == null) {
            addView(this.y);
        }
    }

    public final void e() {
        removeAllViews();
        this.x = null;
        this.n = null;
        this.f6o = null;
        View view = this.w;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.q != null ? this.l.b : getVisibility();
    }

    public int getContentHeight() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.u;
    }

    public CharSequence getTitle() {
        return this.t;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C2509pu0 c2509pu0 = this.q;
            if (c2509pu0 != null) {
                c2509pu0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C2509pu0 i(int i, long j) {
        C2509pu0 c2509pu0 = this.q;
        if (c2509pu0 != null) {
            c2509pu0.b();
        }
        C2033l c2033l = this.l;
        if (i != 0) {
            C2509pu0 c2509pu0A = It0.a(this);
            c2509pu0A.a(0.0f);
            c2509pu0A.c(j);
            c2033l.c.q = c2509pu0A;
            c2033l.b = i;
            c2509pu0A.d(c2033l);
            return c2509pu0A;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2509pu0 c2509pu0A2 = It0.a(this);
        c2509pu0A2.a(1.0f);
        c2509pu0A2.c(j);
        c2033l.c.q = c2509pu0A2;
        c2033l.b = i;
        c2509pu0A2.d(c2033l);
        return c2509pu0A2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, T40.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C2424p1 c2424p1 = this.f6o;
        if (c2424p1 != null) {
            Configuration configuration2 = c2424p1.m.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c2424p1.B = i;
            ZP zp = c2424p1.n;
            if (zp != null) {
                zp.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2424p1 c2424p1 = this.f6o;
        if (c2424p1 != null) {
            c2424p1.e();
            C1744i1 c1744i1 = this.f6o.F;
            if (c1744i1 == null || !c1744i1.b()) {
                return;
            }
            c1744i1.j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.s = false;
        }
        if (!this.s) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.s = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.s = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC3478zu0.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.v;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.v, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null && this.x == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.y, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.x;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.n;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.p;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.v;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.n;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.n, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null && this.x == null) {
            if (this.D) {
                this.y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.y.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.y.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.x;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.x.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.p > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.r = false;
        }
        if (!this.r) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.r = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.r = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.p = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.x;
        if (view2 != null) {
            removeView(view2);
        }
        this.x = view;
        if (view != null && (linearLayout = this.y) != null) {
            removeView(linearLayout);
            this.y = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.u = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.t = charSequence;
        d();
        It0.q(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.D) {
            requestLayout();
        }
        this.D = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
