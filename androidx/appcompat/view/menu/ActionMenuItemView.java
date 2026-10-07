package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import o.AbstractC1646h1;
import o.AbstractC1923jt0;
import o.C1386eQ;
import o.C1548g1;
import o.InterfaceC2521q1;
import o.InterfaceC2748sQ;
import o.T4;
import o.T40;
import o.YP;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends T4 implements InterfaceC2748sQ, View.OnClickListener, InterfaceC2521q1 {
    public final int A;
    public int B;
    public final int C;
    public C1386eQ s;
    public CharSequence t;
    public Drawable u;
    public YP v;
    public C1548g1 w;
    public AbstractC1646h1 x;
    public boolean y;
    public boolean z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.y = n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.c, 0, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.B = -1;
        setSaveEnabled(false);
    }

    @Override // o.InterfaceC2748sQ
    public final void a(C1386eQ c1386eQ) {
        this.s = c1386eQ;
        setIcon(c1386eQ.getIcon());
        setTitle(c1386eQ.getTitleCondensed());
        setId(c1386eQ.a);
        setVisibility(c1386eQ.isVisible() ? 0 : 8);
        setEnabled(c1386eQ.isEnabled());
        if (c1386eQ.hasSubMenu() && this.w == null) {
            this.w = new C1548g1(this);
        }
    }

    @Override // o.InterfaceC2521q1
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.InterfaceC2521q1
    public final boolean c() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.s.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.InterfaceC2748sQ
    public C1386eQ getItemData() {
        return this.s;
    }

    public final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void o() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.t);
        if (this.u != null && ((this.s.y & 4) != 4 || (!this.y && !this.z))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.t : null);
        CharSequence charSequence = this.s.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.s.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.s.r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1923jt0.H(this, z3 ? null : this.s.e);
        } else {
            AbstractC1923jt0.H(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YP yp = this.v;
        if (yp != null) {
            yp.c(this.s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y = n();
        o();
    }

    @Override // o.T4, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.B) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.A;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1548g1 c1548g1;
        if (this.s.hasSubMenu() && (c1548g1 = this.w) != null && c1548g1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.z != z) {
            this.z = z;
            C1386eQ c1386eQ = this.s;
            if (c1386eQ != null) {
                ZP zp = c1386eQ.n;
                zp.k = true;
                zp.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.C;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        o();
    }

    public void setItemInvoker(YP yp) {
        this.v = yp;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.B = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1646h1 abstractC1646h1) {
        this.x = abstractC1646h1;
    }

    public void setTitle(CharSequence charSequence) {
        this.t = charSequence;
        o();
    }
}
