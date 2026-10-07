package o;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Xn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Ds0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f624o;
    public final /* synthetic */ C1816io0 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn0(Ds0 ds0, long j, C1816io0 c1816io0, String str, Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ds0;
        this.f624o = j;
        this.p = c1816io0;
        this.q = str;
        this.r = obj;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Xn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Xn0(this.n, this.f624o, this.p, this.q, this.r, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            Map map = this.n.f223o;
            if (map == null || (str2 = (String) map.get("extractor")) == null) {
                str = null;
            } else {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                str = lowerCase;
            }
            Map map2 = this.n.f223o;
            boolean zB = AbstractC1474fG.b(map2 != null ? (String) map2.get("_direct") : null, "true");
            long j = AbstractC0911Ye.W(Lc0.T("voesx", "voe"), str) ? 28000L : 12000L;
            Wn0 wn0 = new Wn0(str, zB, this.p, this.n, null);
            this.m = 1;
            obj = Nr0.I(j, wn0, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        Js0 js0 = (Js0) obj;
        Ec0 ec0 = Ec0.a;
        if (!Ec0.i(this.f624o)) {
            throw new CancellationException("La sesión cambió durante la resolución VOD");
        }
        if (!AbstractC1474fG.b(js0.n, "webview") && (!AbstractC1899jh0.O(js0.l))) {
            Object obj2 = C1816io0.i;
            String str3 = this.q;
            Object obj3 = this.r;
            C1816io0 c1816io0 = this.p;
            synchronized (obj2) {
                try {
                    if (C1816io0.l.get(str3) == obj3) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c1816io0.getClass();
                        C1816io0.G(jElapsedRealtime);
                        while (true) {
                            linkedHashMap = C1816io0.j;
                            if (linkedHashMap.size() < 16) {
                                break;
                            }
                            Iterator it = linkedHashMap.entrySet().iterator();
                            if (!it.hasNext()) {
                                break;
                            }
                            it.next();
                            it.remove();
                        }
                        linkedHashMap.put(str3, new C2398on0(js0, jElapsedRealtime));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return js0;
    }
}
