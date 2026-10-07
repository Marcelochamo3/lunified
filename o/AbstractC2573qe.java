package o;

import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2573qe {
    public static final ArrayList a;
    public static final Rh0 b;

    static {
        List list = AbstractC1360e5.c;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        a = arrayList;
        b = new Rh0(C2428p3.u);
    }

    public static String a(String str, String str2, EnumC2476pe enumC2476pe) {
        Object objK;
        AbstractC1474fG.j(str2, "fallback");
        String str3 = null;
        str3 = null;
        if (str != null) {
            if (!(!AbstractC1899jh0.O(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    objK = c(str, enumC2476pe).i;
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                str3 = (String) (objK instanceof C2439p80 ? null : objK);
            }
        }
        return str3 == null ? c(str2, enumC2476pe).i : str3;
    }

    public static NV b() {
        NV nv = new NV();
        nv.g(Proxy.NO_PROXY);
        nv.h(InterfaceC2339o7.a);
        X9 x9 = Sr0.a;
        ArrayList arrayList = nv.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nv.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        nv.d((C3150wc) b.getValue());
        return nv;
    }

    public static C2446pE c(String str, EnumC2476pe enumC2476pe) {
        AbstractC1474fG.j(str, "url");
        C2446pE c2446pEB = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
        }
        if (c2446pEB == null) {
            throw new IOException("Endpoint Claro inválido");
        }
        if (!c2446pEB.j || c2446pEB.b.length() > 0 || c2446pEB.c.length() > 0 || c2446pEB.e != 443) {
            throw new IOException("Endpoint Claro sin HTTPS seguro");
        }
        String str2 = (String) AbstractC0911Ye.e0(enumC2476pe == EnumC2476pe.l ? 0 : 1, a);
        if (str2 == null) {
            throw new IOException("Host Claro no configurado");
        }
        if (AbstractC1899jh0.N(c2446pEB.d, str2, true)) {
            return c2446pEB;
        }
        throw new IOException("Host Claro no autorizado");
    }
}
