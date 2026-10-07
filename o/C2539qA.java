package o;

import android.graphics.PointF;

/* JADX INFO: renamed from: o.qA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2539qA extends AbstractC2732sA {
    public final /* synthetic */ C3217xA r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2539qA(C3217xA c3217xA) {
        super(c3217xA);
        this.r = c3217xA;
    }

    @Override // o.C2645rK
    public final PointF f(int i) {
        if (this.b.y.x() == 0) {
            return null;
        }
        C3217xA c3217xA = this.r;
        int iN = X50.N(c3217xA.w(0));
        int i2 = ((c3217xA.B & 262144) == 0 ? i >= iN : i <= iN) ? 1 : -1;
        return c3217xA.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }
}
