package o;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.fH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1475fH extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f771o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1475fH(int i, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = i;
        this.n = str;
        this.f771o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1475fH) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1475fH(this.m, this.n, this.f771o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://jkanime.net/ajax/episodes/" + this.m + "/1");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = this.n;
        AbstractC1474fG.j(str, "value");
        arrayList.add(C0622Nb.l("_token", 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
        arrayList2.add(C0622Nb.l(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
        c0560Kq.m("POST", new C0540Jw(arrayList, arrayList2));
        c0560Kq.j("Referer", this.f771o);
        c0560Kq.j("X-Requested-With", "XMLHttpRequest");
        C1855j80 c1855j80G = C2933uH.c.c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.p()) {
                throw new IllegalStateException(("JKAnime episodios HTTP " + c1855j80G.f840o).toString());
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            JSONObject jSONObject = new JSONObject(strQ);
            AbstractC3409z9.g(c1855j80G, null);
            return jSONObject;
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
