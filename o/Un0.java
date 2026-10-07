package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Un0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Ds0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Un0(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Un0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Un0(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String str;
        String str2;
        Jp0.O(obj);
        Ds0 ds0 = this.m;
        Map map = ds0.f223o;
        if (map == null || (str = (String) map.get("Referer")) == null) {
            str = "";
        }
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(ds0.l);
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        c0560Kq.j("Referer", str);
        AbstractC2051l80 abstractC2051l80 = ((OV) C1816io0.u.getValue()).c(c0560Kq.c()).g().r;
        if (abstractC2051l80 == null) {
            throw new Exception("No response body");
        }
        String strQ = abstractC2051l80.q();
        JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("var url\\s*=\\s*'(https?://[^']+)'", "compile(...)", strQ, "matcher(...)"), 0, strQ);
        if (jnA == null || (str2 = (String) ((HN) jnA.a()).get(1)) == null) {
            throw new Exception("Real URL not found");
        }
        return str2;
    }
}
