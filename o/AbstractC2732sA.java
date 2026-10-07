package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: o.sA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2732sA extends C2645rK {
    public boolean p;
    public final /* synthetic */ C3217xA q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2732sA(C3217xA c3217xA) {
        super(c3217xA.r.getContext());
        this.q = c3217xA;
    }

    @Override // o.C2645rK
    public final float d(DisplayMetrics displayMetrics) {
        return super.d(displayMetrics) * this.q.p;
    }

    @Override // o.C2645rK
    public final int e(int i) {
        int iE = super.e(i);
        int i2 = ((C1735hw0) this.q.Y.f941o).i;
        if (i2 <= 0) {
            return iE;
        }
        float f = (30.0f / i2) * i;
        return ((float) iE) < f ? (int) f : iE;
    }

    @Override // o.C2645rK
    public final void h() {
        super.h();
        if (!this.p) {
            k();
        }
        C3217xA c3217xA = this.q;
        if (c3217xA.F == this) {
            c3217xA.F = null;
        }
        if (c3217xA.G == this) {
            c3217xA.G = null;
        }
    }

    @Override // o.C2645rK
    public final void i(View view, C1562g8 c1562g8) {
        int i;
        int i2;
        int[] iArr = C3217xA.h0;
        C3217xA c3217xA = this.q;
        if (c3217xA.e1(view, null, iArr)) {
            if (c3217xA.s == 0) {
                i = iArr[0];
                i2 = iArr[1];
            } else {
                i = iArr[1];
                i2 = iArr[0];
            }
            int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((i2 * i2) + (i * i)))) / 0.3356d);
            DecelerateInterpolator decelerateInterpolator = this.i;
            c1562g8.c = i;
            c1562g8.d = i2;
            c1562g8.e = iCeil;
            c1562g8.g = decelerateInterpolator;
            c1562g8.b = true;
        }
    }

    public void k() {
        View viewS = this.b.y.s(this.a);
        C3217xA c3217xA = this.q;
        if (viewS == null) {
            int i = this.a;
            if (i >= 0) {
                c3217xA.v1(i, 0, 0, false);
                return;
            }
            return;
        }
        int i2 = c3217xA.D;
        int i3 = this.a;
        if (i2 != i3) {
            c3217xA.D = i3;
        }
        if (c3217xA.R()) {
            c3217xA.B |= 32;
            viewS.requestFocus();
            c3217xA.B &= -33;
        }
        c3217xA.W0();
        c3217xA.X0();
    }
}
