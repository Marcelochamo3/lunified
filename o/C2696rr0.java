package o;

import android.content.Context;
import android.os.SystemClock;

/* JADX INFO: renamed from: o.rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2696rr0 extends Ph0 implements InterfaceC0775Sy {
    public YS m;
    public int n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2696rr0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2696rr0(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        YS ys;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i == 0) {
            Jp0.O(obj);
            YS ys2 = C3084vr0.g;
            this.m = ys2;
            this.n = 1;
            if (ys2.d(null, this) == enumC1706hi) {
                return enumC1706hi;
            }
            ys = ys2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ys = this.m;
            Jp0.O(obj);
        }
        try {
            if (!C3084vr0.n) {
                SystemClock.elapsedRealtime();
                Context context = C3084vr0.j;
                if (context == null) {
                    AbstractC1474fG.U("appContext");
                    throw null;
                }
                C3084vr0.k = AbstractC1370eA.H(context, "urban_proxy_identity_secure", "urban_proxy_identity");
                C3084vr0.n = true;
                SystemClock.elapsedRealtime();
            }
            ys.e(null);
            return C2985uq0.a;
        } catch (Throwable th) {
            ys.e(null);
            throw th;
        }
    }
}
