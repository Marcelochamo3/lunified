package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.Proxy;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.ex0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1443ex0 {
    public static final CJ a;
    public static final CJ b;

    static {
        IJ ij = IJ.l;
        a = AP.m(ij, C1693hb0.B);
        b = AP.m(ij, C1693hb0.A);
    }

    public static NV a() {
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
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nv);
        Rh0 rh0 = C2376oc0.a;
        C2376oc0.b(nv, true);
        return nv;
    }

    public static boolean b(String str) {
        AbstractC1474fG.j(str, "url");
        C2446pE c2446pEB = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
        }
        if (c2446pEB == null || !c2446pEB.j || c2446pEB.e != 443 || !AbstractC1899jh0.U(c2446pEB.b(), "/vod/", false)) {
            return false;
        }
        return AbstractC1474fG.b(c2446pEB.d, (String) a.getValue());
    }
}
