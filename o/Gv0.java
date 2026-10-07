package o;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Gv0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Hv0 f290o;
    public final /* synthetic */ Map p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gv0(String str, Map map, InterfaceC0473Hh interfaceC0473Hh, Hv0 hv0) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f290o = hv0;
        this.p = map;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Gv0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Hv0 hv0 = this.f290o;
        Gv0 gv0 = new Gv0(this.n, this.p, interfaceC0473Hh, hv0);
        gv0.m = obj;
        return gv0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128 A[Catch: all -> 0x014f, TRY_ENTER, TryCatch #5 {all -> 0x014f, blocks: (B:6:0x0072, B:19:0x00a7, B:22:0x00af, B:25:0x00b6, B:38:0x00e8, B:41:0x00ee, B:44:0x00f5, B:45:0x0117, B:49:0x0128, B:54:0x013b, B:57:0x0151, B:62:0x016e, B:63:0x0171, B:67:0x0175, B:68:0x0178, B:64:0x0172, B:7:0x0082, B:10:0x008d, B:12:0x0091, B:14:0x009c, B:26:0x00c6, B:29:0x00ce, B:31:0x00d2, B:33:0x00dd, B:59:0x016b), top: B:85:0x0072, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0136  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b A[Catch: all -> 0x014f, TryCatch #5 {all -> 0x014f, blocks: (B:6:0x0072, B:19:0x00a7, B:22:0x00af, B:25:0x00b6, B:38:0x00e8, B:41:0x00ee, B:44:0x00f5, B:45:0x0117, B:49:0x0128, B:54:0x013b, B:57:0x0151, B:62:0x016e, B:63:0x0171, B:67:0x0175, B:68:0x0178, B:64:0x0172, B:7:0x0082, B:10:0x008d, B:12:0x0091, B:14:0x009c, B:26:0x00c6, B:29:0x00ce, B:31:0x00d2, B:33:0x00dd, B:59:0x016b), top: B:85:0x0072, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x008b  */
    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        AbstractC2051l80 abstractC2051l80;
        String strQ;
        String strA;
        C1855j80 c1855j80G;
        AbstractC2051l80 abstractC2051l81;
        String strQ2;
        String strB;
        LinkedHashMap linkedHashMapD;
        C2446pE c2446pEB;
        List listH;
        List list;
        Jp0.O(obj);
        I60 i60 = S80.a;
        String str = this.n;
        AbstractC1474fG.j(str, "url");
        if (!AbstractC1468fA.r(str, "rumble.com")) {
            return null;
        }
        C2112lq c2112lq = new C2112lq(7);
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
        nv.j = c2112lq;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nv.e(10L, timeUnit);
        nv.i(12L, timeUnit);
        nv.c(25L, timeUnit);
        nv.h = true;
        nv.i = true;
        OV ov = new OV(nv);
        Hv0 hv0 = this.f290o;
        Map map = this.p;
        try {
            C1855j80 c1855j80G2 = ov.c(Hv0.f(hv0, str, null, map, str).c()).g();
            try {
                if (c1855j80G2.p() && (abstractC2051l80 = c1855j80G2.r) != null) {
                    strQ = abstractC2051l80.q();
                    if (!(!AbstractC1899jh0.O(strQ)) || strQ.length() > 2000000) {
                        strQ = null;
                    }
                    AbstractC3409z9.g(c1855j80G2, null);
                    if (strQ == null && (strA = S80.a(strQ, str)) != null) {
                        c1855j80G = ov.c(Hv0.f(hv0, strA, str, map, str).c()).g();
                        try {
                            if (c1855j80G.p() || (abstractC2051l81 = c1855j80G.r) == null) {
                                strQ2 = null;
                            } else {
                                strQ2 = abstractC2051l81.q();
                                if ((!AbstractC1899jh0.O(strQ2)) || strQ2.length() > 2000000) {
                                    strQ2 = null;
                                }
                            }
                            AbstractC3409z9.g(c1855j80G, null);
                            if (strQ2 != null && (strB = S80.b(strQ2, strA)) != null) {
                                linkedHashMapD = AbstractC3327yN.D(AbstractC1468fA.a(str, strB, map));
                                linkedHashMapD.put("Accept", "*/*");
                                linkedHashMapD.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                                linkedHashMapD.put("Referer", strA);
                                linkedHashMapD.put("Origin", "https://rumble.com");
                                try {
                                    C2349oE c2349oE = new C2349oE();
                                    c2349oE.g(null, strB);
                                    c2446pEB = c2349oE.b();
                                } catch (IllegalArgumentException unused) {
                                    c2446pEB = null;
                                }
                                if (c2446pEB != null) {
                                    listH = c2112lq.h(c2446pEB);
                                    if (!((ArrayList) listH).isEmpty()) {
                                        list = listH;
                                    } else {
                                        list = null;
                                    }
                                    if (list != null) {
                                        linkedHashMapD.put("Cookie", AbstractC0911Ye.h0(list, "; ", null, null, Iu0.t, 30));
                                    }
                                }
                                objK = new Js0(strB, (Map) linkedHashMapD, "hls", (String) null, (String) null, (byte[]) null, (String) null, strA, (String) null, (List) null, false, 3960);
                            } else {
                                objK = null;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3409z9.g(c1855j80G, th);
                                throw th2;
                            }
                        }
                    } else {
                        objK = null;
                    }
                } else {
                    strQ = null;
                    AbstractC3409z9.g(c1855j80G2, null);
                    if (strQ == null) {
                        objK = null;
                    } else {
                        c1855j80G = ov.c(Hv0.f(hv0, strA, str, map, str).c()).g();
                        if (c1855j80G.p()) {
                            strQ2 = null;
                        } else {
                            strQ2 = abstractC2051l81.q();
                            if (!AbstractC1899jh0.O(strQ2)) {
                                strQ2 = null;
                            } else {
                                strQ2 = null;
                            }
                        }
                        AbstractC3409z9.g(c1855j80G, null);
                        if (strQ2 != null) {
                            linkedHashMapD = AbstractC3327yN.D(AbstractC1468fA.a(str, strB, map));
                            linkedHashMapD.put("Accept", "*/*");
                            linkedHashMapD.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                            linkedHashMapD.put("Referer", strA);
                            linkedHashMapD.put("Origin", "https://rumble.com");
                            C2349oE c2349oE2 = new C2349oE();
                            c2349oE2.g(null, strB);
                            c2446pEB = c2349oE2.b();
                            if (c2446pEB != null) {
                                listH = c2112lq.h(c2446pEB);
                                if (!((ArrayList) listH).isEmpty()) {
                                    list = listH;
                                } else {
                                    list = null;
                                }
                                if (list != null) {
                                    linkedHashMapD.put("Cookie", AbstractC0911Ye.h0(list, "; ", null, null, Iu0.t, 30));
                                }
                            }
                            objK = new Js0(strB, (Map) linkedHashMapD, "hls", (String) null, (String) null, (byte[]) null, (String) null, strA, (String) null, (List) null, false, 3960);
                        }
                        objK = null;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3409z9.g(c1855j80G2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            objK = Jp0.k(th5);
        }
        if (C2536q80.a(objK) == null) {
            return objK;
        }
        System.out.getClass();
        return null;
    }
}
