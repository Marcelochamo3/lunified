package o;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.iX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1785iX extends Pu0 {
    public final /* synthetic */ int f;
    public final Method g;
    public final int h;

    public /* synthetic */ C1785iX(Method method, int i, int i2) {
        this.f = i2;
        this.g = method;
        this.h = i;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        switch (this.f) {
            case 0:
                C2152mB c2152mB = (C2152mB) obj;
                if (c2152mB == null) {
                    int i = this.h;
                    throw UK.M(this.g, i, "Headers parameter must not be null.", new Object[0]);
                }
                C2112lq c2112lq = c2534q70.f;
                c2112lq.getClass();
                int size = c2152mB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c2112lq.d(c2152mB.d(i2), c2152mB.h(i2));
                }
                return;
            default:
                if (obj != null) {
                    c2534q70.c = obj.toString();
                    return;
                } else {
                    int i3 = this.h;
                    throw UK.M(this.g, i3, "@Url parameter is null.", new Object[0]);
                }
        }
    }
}
