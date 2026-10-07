package o;

import j$.lang.Iterable$EL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class Sm0 {
    private final Map<String, C1761i90> a = new HashMap();

    private String d(C2848tT c2848tT, int i) {
        StringBuilder sbR = AbstractC1674hK.r("T", i, "/");
        sbR.append(c2848tT.f());
        return sbR.toString();
    }

    private C1761i90 e(String str) {
        return this.a.get(str);
    }

    public void a() {
        this.a.clear();
    }

    public C1761i90 b(C2848tT c2848tT, int i) {
        while (c2848tT.s() > 0) {
            C1761i90 c1761i90E = e(d(c2848tT, i));
            if (c1761i90E != null) {
                return c1761i90E;
            }
            c2848tT = new C2848tT(c2848tT, 1);
        }
        return null;
    }

    public Collection<C1761i90> c() {
        return Collections.unmodifiableCollection(this.a.values());
    }

    public void f(C1761i90 c1761i90) {
        if (c1761i90.getType() != 43 && c1761i90.getType() != 48) {
            throw new IllegalArgumentException("Trust anchors can only be DS or DNSKEY records");
        }
        if (c1761i90.getType() == 48) {
            C1761i90 c1761i91 = new C1761i90();
            Iterator<H50> it = c1761i90.q().iterator();
            while (it.hasNext()) {
                C0552Ki c0552Ki = (C0552Ki) it.next();
                c1761i91.d(new C0655Oi(c0552Ki.v(), c0552Ki.t(), c0552Ki.x(), 4, c0552Ki));
            }
            c1761i90 = c1761i91;
        }
        String strD = d(c1761i90.o(), c1761i90.n());
        c1761i90.x(EnumC1887jb0.SECURE);
        C1761i90 c1761i90Put = this.a.put(strD, c1761i90);
        if (c1761i90Put != null) {
            Iterable$EL.forEach(c1761i90Put.q(), new WU(1, c1761i90));
        }
    }
}
