package o;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: o.vA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3023vA extends AbstractC2732sA {
    public final boolean r;
    public int s;
    public final /* synthetic */ C3217xA t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3023vA(C3217xA c3217xA, int i, boolean z) {
        super(c3217xA);
        this.t = c3217xA;
        this.s = i;
        this.r = z;
        this.a = -2;
    }

    @Override // o.C2645rK
    public final PointF f(int i) {
        int i2 = this.s;
        if (i2 == 0) {
            return null;
        }
        C3217xA c3217xA = this.t;
        int i3 = ((c3217xA.B & 262144) == 0 ? i2 >= 0 : i2 <= 0) ? 1 : -1;
        return c3217xA.s == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // o.AbstractC2732sA
    public final void k() {
        super.k();
        this.s = 0;
        View viewS = this.b.y.s(this.a);
        if (viewS != null) {
            this.t.x1(viewS, true);
        }
    }
}
