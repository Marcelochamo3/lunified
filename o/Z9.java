package o;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z9 {
    public static final ArrayList a;
    public static final List b;
    public static final List c;

    static {
        List listK = AbstractC0937Ze.K("104.16.132.229", "104.16.133.229", "172.67.178.200", "104.21.56.100");
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(InetAddress.getByName((String) it.next()));
        }
        a = arrayList;
        b = AbstractC0937Ze.K("la14hd", "fubohd", "cdn-sp");
        c = AbstractC0937Ze.K("la14hd", "streamtp", "cdn-sp", "t-cdn", "m-cdn", "fubohd", "crackstreamslivehd");
    }

    public static OV a() {
        NV nvI = AbstractC1370eA.i();
        nvI.k = null;
        OV ov = new OV(nvI);
        C2687rn c2687rn = InterfaceC2784sn.a;
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, "https://1.1.1.1/dns-query");
        C2446pE c2446pEB = c2349oE.b();
        NV nvB = ov.b();
        TP tp = C0349Cn.e;
        nvB.f(c2687rn);
        Y9 y9 = new Y9(new C0349Cn(new OV(nvB), c2446pEB, false));
        X9 x9 = new X9(0);
        NV nvI2 = AbstractC1370eA.i();
        nvI2.f(y9);
        nvI2.c.add(x9);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvI2.e(30L, timeUnit);
        nvI2.i(30L, timeUnit);
        nvI2.h = true;
        nvI2.i = true;
        return new OV(nvI2);
    }

    public static boolean b(String str) {
        List list = c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC1119bh0.W(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
