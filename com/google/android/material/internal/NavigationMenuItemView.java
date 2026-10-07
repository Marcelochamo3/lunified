package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import o.AbstractC0514Iw;
import o.AbstractC0977a80;
import o.AbstractC1465f80;
import o.AbstractC1923jt0;
import o.AbstractC2205mo;
import o.AbstractC3045vW;
import o.C1386eQ;
import o.C1672hI;
import o.C1966kK;
import o.C2633r9;
import o.InterfaceC2748sQ;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0514Iw implements InterfaceC2748sQ {
    public static final int[] R = {R.attr.state_checked};
    public int G;
    public boolean H;
    public boolean I;
    public final boolean J;
    public final CheckedTextView K;
    public FrameLayout L;
    public C1386eQ M;
    public ColorStateList N;
    public boolean O;
    public Drawable P;
    public final C2633r9 Q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = true;
        C2633r9 c2633r9 = new C2633r9(4, this);
        this.Q = c2633r9;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.skidush.clonex.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.skidush.clonex.R.id.design_menu_item_text);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        It0.p(checkedTextView, c2633r9);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.L == null) {
                this.L = (FrameLayout) ((ViewStub) findViewById(com.skidush.clonex.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.L.removeAllViews();
            this.L.addView(view);
        }
    }

    @Override // o.InterfaceC2748sQ
    public final void a(C1386eQ c1386eQ) {
        StateListDrawable stateListDrawable;
        this.M = c1386eQ;
        int i = c1386eQ.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1386eQ.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.skidush.clonex.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = It0.a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1386eQ.isCheckable());
        setChecked(c1386eQ.isChecked());
        setEnabled(c1386eQ.isEnabled());
        setTitle(c1386eQ.e);
        setIcon(c1386eQ.getIcon());
        setActionView(c1386eQ.getActionView());
        setContentDescription(c1386eQ.q);
        AbstractC1923jt0.H(this, c1386eQ.r);
        C1386eQ c1386eQ2 = this.M;
        CharSequence charSequence = c1386eQ2.e;
        CheckedTextView checkedTextView = this.K;
        if (charSequence == null && c1386eQ2.getIcon() == null && this.M.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                C1966kK c1966kK = (C1966kK) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1966kK).width = -1;
                this.L.setLayoutParams(c1966kK);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            C1966kK c1966kK2 = (C1966kK) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1966kK2).width = -2;
            this.L.setLayoutParams(c1966kK2);
        }
    }

    @Override // o.InterfaceC2748sQ
    public C1386eQ getItemData() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1386eQ c1386eQ = this.M;
        if (c1386eQ != null && c1386eQ.isCheckable() && this.M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.I != z) {
            this.I = z;
            this.Q.h(this.K, C1672hI.a.g);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.K;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.J) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC3045vW.R(drawable).mutate();
                AbstractC2205mo.h(drawable, this.N);
            }
            int i = this.G;
            drawable.setBounds(0, 0, i, i);
        } else if (this.H) {
            if (this.P == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC1465f80.a;
                Drawable drawableA = AbstractC0977a80.a(resources, com.skidush.clonex.R.drawable.navigation_empty_icon, theme);
                this.P = drawableA;
                if (drawableA != null) {
                    int i2 = this.G;
                    drawableA.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.P;
        }
        this.K.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.K.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.G = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        C1386eQ c1386eQ = this.M;
        if (c1386eQ != null) {
            setIcon(c1386eQ.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.K.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.H = z;
    }

    public void setTextAppearance(int i) {
        AbstractC3045vW.L(this.K, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}
