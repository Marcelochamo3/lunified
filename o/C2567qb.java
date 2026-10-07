package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2567qb extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C1951k70 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567qb(C1951k70 c1951k70, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c1951k70;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2567qb) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2567qb(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C1855j80 c1855j80G = C0441Gb.e.c(this.m).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (!c1855j80G.p()) {
                throw new IllegalStateException(("Canela TV HTTP " + c1855j80G.f840o).toString());
            }
            try {
                JSONObject jSONObject = new JSONObject(strQ);
                AbstractC3409z9.g(c1855j80G, null);
                return jSONObject;
            } catch (Throwable th) {
                throw new IllegalStateException("Canela TV devolvió una respuesta inválida", th);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC3409z9.g(c1855j80G, th2);
                throw th3;
            }
        }
    }
}
