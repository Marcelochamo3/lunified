package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import o.C1744i1;
import o.C2424p1;
import o.C2509pu0;
import o.InterfaceC0734Rj;
import o.InterfaceC1313dh;
import o.LayoutInflaterFactory2C1456f4;
import o.Ol0;
import o.T3;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue l;
    public TypedValue m;
    public TypedValue n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TypedValue f8o;
    public TypedValue p;
    public TypedValue q;
    public final Rect r;
    public InterfaceC1313dh s;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.r = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.p == null) {
            this.p = new TypedValue();
        }
        return this.p;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.q == null) {
            this.q = new TypedValue();
        }
        return this.q;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8o == null) {
            this.f8o = new TypedValue();
        }
        return this.f8o;
    }

    public TypedValue getMinWidthMajor() {
        if (this.l == null) {
            this.l = new TypedValue();
        }
        return this.l;
    }

    public TypedValue getMinWidthMinor() {
        if (this.m == null) {
            this.m = new TypedValue();
        }
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1313dh interfaceC1313dh = this.s;
        if (interfaceC1313dh != null) {
            interfaceC1313dh.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2424p1 c2424p1;
        super.onDetachedFromWindow();
        InterfaceC1313dh interfaceC1313dh = this.s;
        if (interfaceC1313dh != null) {
            LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = ((T3) interfaceC1313dh).m;
            InterfaceC0734Rj interfaceC0734Rj = layoutInflaterFactory2C1456f4.C;
            if (interfaceC0734Rj != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0734Rj;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Ol0) actionBarOverlayLayout.p).a.l;
                if (actionMenuView != null && (c2424p1 = actionMenuView.E) != null) {
                    c2424p1.e();
                    C1744i1 c1744i1 = c2424p1.F;
                    if (c1744i1 != null && c1744i1.b()) {
                        c1744i1.j.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1456f4.H != null) {
                layoutInflaterFactory2C1456f4.w.getDecorView().removeCallbacks(layoutInflaterFactory2C1456f4.I);
                if (layoutInflaterFactory2C1456f4.H.isShowing()) {
                    try {
                        layoutInflaterFactory2C1456f4.H.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1456f4.H = null;
            }
            C2509pu0 c2509pu0 = layoutInflaterFactory2C1456f4.J;
            if (c2509pu0 != null) {
                c2509pu0.b();
            }
            ZP zp = layoutInflaterFactory2C1456f4.x(0).h;
            if (zp != null) {
                zp.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.r;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f8o : this.n;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.p : this.q;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.m : this.l;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1313dh interfaceC1313dh) {
        this.s = interfaceC1313dh;
    }
}
