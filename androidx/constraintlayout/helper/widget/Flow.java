package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import o.C0731Rg;
import o.C1636gw;
import o.C3213x8;
import o.Ku0;
import o.M40;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends Ku0 {
    public C1636gw u;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.Ku0, o.AbstractC0446Gg
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        C1636gw c1636gw = new C1636gw();
        c1636gw.s0 = 0;
        c1636gw.t0 = 0;
        c1636gw.u0 = 0;
        c1636gw.v0 = 0;
        c1636gw.w0 = 0;
        c1636gw.x0 = 0;
        c1636gw.y0 = false;
        c1636gw.z0 = 0;
        c1636gw.A0 = 0;
        c1636gw.B0 = new C3213x8();
        c1636gw.C0 = null;
        c1636gw.D0 = -1;
        c1636gw.E0 = -1;
        c1636gw.F0 = -1;
        c1636gw.G0 = -1;
        c1636gw.H0 = -1;
        c1636gw.I0 = -1;
        c1636gw.J0 = 0.5f;
        c1636gw.K0 = 0.5f;
        c1636gw.L0 = 0.5f;
        c1636gw.M0 = 0.5f;
        c1636gw.N0 = 0.5f;
        c1636gw.O0 = 0.5f;
        c1636gw.P0 = 0;
        c1636gw.Q0 = 0;
        c1636gw.R0 = 2;
        c1636gw.S0 = 2;
        c1636gw.T0 = 0;
        c1636gw.U0 = -1;
        c1636gw.V0 = 0;
        c1636gw.W0 = new ArrayList();
        c1636gw.X0 = null;
        c1636gw.Y0 = null;
        c1636gw.Z0 = null;
        c1636gw.b1 = 0;
        this.u = c1636gw;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, M40.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.u.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1636gw c1636gw2 = this.u;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1636gw2.s0 = dimensionPixelSize;
                    c1636gw2.t0 = dimensionPixelSize;
                    c1636gw2.u0 = dimensionPixelSize;
                    c1636gw2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1636gw c1636gw3 = this.u;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1636gw3.u0 = dimensionPixelSize2;
                    c1636gw3.w0 = dimensionPixelSize2;
                    c1636gw3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.u.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.u.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.u.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.u.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.u.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.u.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.u.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.u.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.u.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.u.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.u.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.u.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.u.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.u.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.u.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.u.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.u.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.u.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.u.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.u.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.u.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.u.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.u.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f284o = this.u;
        k();
    }

    @Override // o.AbstractC0446Gg
    public final void i(C0731Rg c0731Rg, boolean z) {
        C1636gw c1636gw = this.u;
        int i = c1636gw.u0;
        if (i > 0 || c1636gw.v0 > 0) {
            if (z) {
                c1636gw.w0 = c1636gw.v0;
                c1636gw.x0 = i;
            } else {
                c1636gw.w0 = i;
                c1636gw.x0 = c1636gw.v0;
            }
        }
    }

    @Override // o.Ku0
    public final void l(C1636gw c1636gw, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c1636gw == null) {
            setMeasuredDimension(0, 0);
        } else {
            c1636gw.V(mode, size, mode2, size2);
            setMeasuredDimension(c1636gw.z0, c1636gw.A0);
        }
    }

    @Override // o.AbstractC0446Gg, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.u, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.u.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.u.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.u.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.u.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.u.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.u.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.u.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.u.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.u.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.u.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.u.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.u.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.u.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.u.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1636gw c1636gw = this.u;
        c1636gw.s0 = i;
        c1636gw.t0 = i;
        c1636gw.u0 = i;
        c1636gw.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.u.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.u.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.u.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.u.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.u.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.u.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.u.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.u.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.u.T0 = i;
        requestLayout();
    }
}
