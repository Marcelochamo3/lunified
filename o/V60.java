package o;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class V60 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((V60) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        V60 v60 = new V60(2, interfaceC0473Hh);
        v60.m = obj;
        return v60;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        Jp0.O(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = O9.z;
        JSONObject jSONObject = O9.y;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (jSONObject != null && j > 0 && jElapsedRealtime >= j && jElapsedRealtime - j < 3600000) {
            return c2985uq0;
        }
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(C1263d5.g);
            C1951k70 c1951k70C = c0560Kq.c();
            C1791ib0 c1791ib0 = C1791ib0.a;
            C1855j80 c1855j80G = C1791ib0.e().c(c1951k70C).g();
            try {
                if (!c1855j80G.p()) {
                    throw new IOException("Configuración remota HTTP " + c1855j80G.f840o);
                }
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                if (abstractC2051l80 != null) {
                    String strQ = abstractC2051l80.q();
                    if (!(!AbstractC1899jh0.O(strQ))) {
                        strQ = null;
                    }
                    if (strQ != null) {
                        AbstractC3409z9.g(c1855j80G, null);
                        O9.y = O9.j(new JSONObject(strQ));
                        O9.z = SystemClock.elapsedRealtime();
                        objK = new Integer(Log.d("RemoteConfig", "Remote config actualizada por canal protegido"));
                        C2536q80.a(objK);
                        return c2985uq0;
                    }
                }
                throw new IOException("Configuración remota vacía");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
    }
}
