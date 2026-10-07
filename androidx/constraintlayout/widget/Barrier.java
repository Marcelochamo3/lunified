package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import o.AbstractC0446Gg;
import o.C0731Rg;
import o.M40;
import o.O7;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends AbstractC0446Gg {
    public int s;
    public int t;
    public O7 u;

    public Barrier(Context context) {
        super(context);
        this.l = new int[32];
        this.r = new HashMap();
        this.n = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.u.t0;
    }

    public int getMargin() {
        return this.u.u0;
    }

    public int getType() {
        return this.s;
    }

    @Override // o.AbstractC0446Gg
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        O7 o7 = new O7();
        o7.s0 = 0;
        o7.t0 = true;
        o7.u0 = 0;
        o7.v0 = false;
        this.u = o7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, M40.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.u.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.u.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f284o = this.u;
        k();
    }

    @Override // o.AbstractC0446Gg
    public final void i(C0731Rg c0731Rg, boolean z) {
        int i = this.s;
        this.t = i;
        if (z) {
            if (i == 5) {
                this.t = 1;
            } else if (i == 6) {
                this.t = 0;
            }
        } else if (i == 5) {
            this.t = 0;
        } else if (i == 6) {
            this.t = 1;
        }
        if (c0731Rg instanceof O7) {
            ((O7) c0731Rg).s0 = this.t;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.u.t0 = z;
    }

    public void setDpMargin(int i) {
        this.u.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.u.u0 = i;
    }

    public void setType(int i) {
        this.s = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
