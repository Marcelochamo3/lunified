package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.p20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2427p20 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2427p20(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2427p20) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2427p20(this.m, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C0560Kq c0560Kq = new C0560Kq();
        String str = this.m;
        c0560Kq.u(str);
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36");
        c0560Kq.j("Referer", C20.b.r());
        C1855j80 c1855j80G = C20.c.c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.p()) {
                throw new IllegalStateException(("PoseidonHD2 HTTP " + c1855j80G.f840o + " at " + str).toString());
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            List list = C20.f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC1119bh0.W(strQ, (String) it.next(), true)) {
                        throw new IllegalStateException(("PoseidonHD2 Cloudflare challenge at " + str).toString());
                    }
                }
            }
            C2446pE c2446pE = c1855j80G.l.a;
            String str2 = c2446pE.d;
            if (AbstractC1119bh0.W(str2, "poseidonhd2", true) && !AbstractC1899jh0.U(str2, "player.", false)) {
                Cr0 cr0 = Cr0.n;
                String strB = cr0.b();
                if (strB == null) {
                    strB = "www.poseidonhd2.co";
                } else {
                    if (!(!AbstractC1899jh0.O(strB))) {
                        strB = null;
                    }
                    if (strB == null) {
                        strB = "www.poseidonhd2.co";
                    }
                }
                if (!AbstractC1474fG.b(str2, strB)) {
                    String string = AbstractC1119bh0.E0(str2).toString();
                    if (!(true ^ AbstractC1899jh0.O(string))) {
                        string = null;
                    }
                    cr0.f(string);
                }
            }
            C0660On c0660OnZ = RN.z(strQ, c2446pE.i);
            AbstractC3409z9.g(c1855j80G, null);
            return c0660OnZ;
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
