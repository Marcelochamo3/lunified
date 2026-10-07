package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class I4 extends Spinner {
    public static final int[] t = {R.attr.spinnerMode};
    public final Y1 l;
    public final Context m;
    public final C3302y4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SpinnerAdapter f318o;
    public final boolean p;
    public final H4 q;
    public int r;
    public final Rect s;

    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    public I4(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.skidush.clonex.R.attr.spinnerStyle);
        this.s = new Rect();
        AbstractC1220cj0.a(this, getContext());
        int[] iArr = T40.u;
        RN rnY = RN.y(context, attributeSet, iArr, com.skidush.clonex.R.attr.spinnerStyle, 0);
        this.l = new Y1(this);
        TypedArray typedArray = (TypedArray) rnY.n;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.m = new C0447Gh(context, resourceId);
        } else {
            this.m = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t, com.skidush.clonex.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    B4 b4 = new B4(this);
                    this.q = b4;
                    b4.n = typedArray.getString(2);
                } else if (i == 1) {
                    F4 f4 = new F4(this, this.m, attributeSet);
                    RN rnY2 = RN.y(this.m, attributeSet, iArr, com.skidush.clonex.R.attr.spinnerStyle, 0);
                    this.r = ((TypedArray) rnY2.n).getLayoutDimension(3, -2);
                    f4.j(rnY2.u(1));
                    f4.O = typedArray.getString(2);
                    rnY2.A();
                    this.q = f4;
                    this.n = new C3302y4(this, this, f4);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.skidush.clonex.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                rnY.A();
                this.p = true;
                spinnerAdapter = this.f318o;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f318o = null;
                }
                this.l.k(attributeSet, com.skidush.clonex.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            B4 b5 = new B4(this);
            this.q = b5;
            b5.n = typedArray.getString(2);
        } else if (i == 1) {
            F4 f5 = new F4(this, this.m, attributeSet);
            RN rnY3 = RN.y(this.m, attributeSet, iArr, com.skidush.clonex.R.attr.spinnerStyle, 0);
            this.r = ((TypedArray) rnY3.n).getLayoutDimension(3, -2);
            f5.j(rnY3.u(1));
            f5.O = typedArray.getString(2);
            rnY3.A();
            this.q = f5;
            this.n = new C3302y4(this, this, f5);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.skidush.clonex.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        rnY.A();
        this.p = true;
        spinnerAdapter = this.f318o;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f318o = null;
        }
        this.l.k(attributeSet, com.skidush.clonex.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.s;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        H4 h4 = this.q;
        return h4 != null ? h4.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        H4 h4 = this.q;
        return h4 != null ? h4.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.q != null ? this.r : super.getDropDownWidth();
    }

    public final H4 getInternalPopup() {
        return this.q;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        H4 h4 = this.q;
        return h4 != null ? h4.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.m;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        H4 h4 = this.q;
        return h4 != null ? h4.p() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        H4 h4 = this.q;
        if (h4 == null || !h4.b()) {
            return;
        }
        h4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.q == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        G4 g4 = (G4) parcelable;
        super.onRestoreInstanceState(g4.getSuperState());
        if (!g4.l || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3399z4(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        G4 g4 = new G4(super.onSaveInstanceState());
        H4 h4 = this.q;
        g4.l = h4 != null && h4.b();
        return g4;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3302y4 c3302y4 = this.n;
        if (c3302y4 == null || !c3302y4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        H4 h4 = this.q;
        if (h4 == null) {
            return super.performClick();
        }
        if (h4.b()) {
            return true;
        }
        this.q.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.n(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        H4 h4 = this.q;
        if (h4 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            h4.l(i);
            h4.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        H4 h4 = this.q;
        if (h4 != null) {
            h4.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.q != null) {
            this.r = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        H4 h4 = this.q;
        if (h4 != null) {
            h4.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(Ou0.l(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        H4 h4 = this.q;
        if (h4 != null) {
            h4.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.u(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.p) {
            this.f318o = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        H4 h4 = this.q;
        if (h4 != null) {
            Context context = this.m;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C4 c4 = new C4();
            c4.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c4.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && A0.v(spinnerAdapter)) {
                A4.a(A0.j(spinnerAdapter), theme);
            }
            h4.q(c4);
        }
    }
}
