package o;

import java.util.Map;

/* JADX INFO: renamed from: o.gH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1573gH extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ Map n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573gH(String str, Map map, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = map;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1573gH) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1573gH(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C0560Kq c0560Kq = new C0560Kq();
        String str = this.m;
        c0560Kq.u(str);
        for (Map.Entry entry : this.n.entrySet()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1855j80 c1855j80G = C2933uH.c.c(c0560Kq.c()).g();
        try {
            if (c1855j80G.p()) {
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                if (strQ == null) {
                    strQ = "";
                }
                AbstractC3409z9.g(c1855j80G, null);
                return strQ;
            }
            throw new IllegalStateException(("JKAnime HTTP " + c1855j80G.f840o + ": " + str).toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }
}
