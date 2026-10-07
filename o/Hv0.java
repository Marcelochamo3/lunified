package o;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Hv0 extends AbstractC3473zs {
    public static Context b;
    public static final Rh0 c = new Rh0(C1693hb0.z);

    public static final C0560Kq f(Hv0 hv0, String str, String str2, Map map, String str3) {
        hv0.getClass();
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.j("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        c0560Kq.j("Accept-Language", "es-ES,es;q=0.9,en;q=0.7");
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        if (str2 != null && !AbstractC1899jh0.O(str2)) {
            c0560Kq.j("Referer", str2);
        }
        for (Map.Entry entry : AbstractC1468fA.a(str3, str, map).entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (!AbstractC1899jh0.U(str4, "_channel_", false)) {
                c0560Kq.j(str4, str5);
            }
        }
        return c0560Kq;
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return g(str, C1330dq.l, interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "WebView";
    }

    public final Object g(String str, Map map, InterfaceC0473Hh interfaceC0473Hh) {
        C3362yl c3362yl = AbstractC1910jn.a;
        return AbstractC1376eG.J(FM.a, new Ev0(str, map, null, this), interfaceC0473Hh);
    }
}
