package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class F4 extends JK implements H4 {
    public CharSequence O;
    public ListAdapter P;
    public final Rect Q;
    public int R;
    public final /* synthetic */ I4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(I4 i4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.S = i4;
        this.Q = new Rect();
        this.z = i4;
        this.J = true;
        this.K.setFocusable(true);
        this.A = new D4(0, this);
    }

    @Override // o.H4
    public final void i(CharSequence charSequence) {
        this.O = charSequence;
    }

    @Override // o.H4
    public final void l(int i) {
        this.R = i;
    }

    @Override // o.H4
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C2527q4 c2527q4 = this.K;
        boolean zIsShowing = c2527q4.isShowing();
        s();
        this.K.setInputMethodMode(2);
        e();
        C0687Po c0687Po = this.n;
        c0687Po.setChoiceMode(1);
        c0687Po.setTextDirection(i);
        c0687Po.setTextAlignment(i2);
        I4 i4 = this.S;
        int selectedItemPosition = i4.getSelectedItemPosition();
        C0687Po c0687Po2 = this.n;
        if (c2527q4.isShowing() && c0687Po2 != null) {
            c0687Po2.setListSelectionHidden(false);
            c0687Po2.setSelection(selectedItemPosition);
            if (c0687Po2.getChoiceMode() != 0) {
                c0687Po2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = i4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC3399z4 viewTreeObserverOnGlobalLayoutListenerC3399z4 = new ViewTreeObserverOnGlobalLayoutListenerC3399z4(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3399z4);
        this.K.setOnDismissListener(new E4(this, viewTreeObserverOnGlobalLayoutListenerC3399z4));
    }

    @Override // o.H4
    public final CharSequence p() {
        return this.O;
    }

    @Override // o.JK, o.H4
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.P = listAdapter;
    }

    public final void s() {
        int i;
        C2527q4 c2527q4 = this.K;
        Drawable background = c2527q4.getBackground();
        I4 i4 = this.S;
        if (background != null) {
            background.getPadding(i4.s);
            boolean z = AbstractC3478zu0.a;
            int layoutDirection = i4.getLayoutDirection();
            Rect rect = i4.s;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = i4.s;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = i4.getPaddingLeft();
        int paddingRight = i4.getPaddingRight();
        int width = i4.getWidth();
        int i2 = i4.r;
        if (i2 == -2) {
            int iA = i4.a((SpinnerAdapter) this.P, c2527q4.getBackground());
            int i3 = i4.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = i4.s;
            int i5 = (i3 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = AbstractC3478zu0.a;
        this.q = i4.getLayoutDirection() == 1 ? (((width - paddingRight) - this.p) - this.R) + i : paddingLeft + this.R + i;
    }
}
