package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class T80 {
    public AbstractC1637gw0 a;
    public ArrayList b;

    public static long a(C2395om c2395om, long j) {
        AbstractC1637gw0 abstractC1637gw0 = c2395om.d;
        if (abstractC1637gw0 instanceof C2540qB) {
            return j;
        }
        ArrayList arrayList = c2395om.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2201mm interfaceC2201mm = (InterfaceC2201mm) arrayList.get(i);
            if (interfaceC2201mm instanceof C2395om) {
                C2395om c2395om2 = (C2395om) interfaceC2201mm;
                if (c2395om2.d != abstractC1637gw0) {
                    jMin = Math.min(jMin, a(c2395om2, ((long) c2395om2.f) + j));
                }
            }
        }
        if (c2395om != abstractC1637gw0.i) {
            return jMin;
        }
        long j2 = abstractC1637gw0.j();
        C2395om c2395om3 = abstractC1637gw0.h;
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(c2395om3, j3)), j3 - ((long) c2395om3.f));
    }

    public static long b(C2395om c2395om, long j) {
        AbstractC1637gw0 abstractC1637gw0 = c2395om.d;
        if (abstractC1637gw0 instanceof C2540qB) {
            return j;
        }
        ArrayList arrayList = c2395om.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2201mm interfaceC2201mm = (InterfaceC2201mm) arrayList.get(i);
            if (interfaceC2201mm instanceof C2395om) {
                C2395om c2395om2 = (C2395om) interfaceC2201mm;
                if (c2395om2.d != abstractC1637gw0) {
                    jMax = Math.max(jMax, b(c2395om2, ((long) c2395om2.f) + j));
                }
            }
        }
        if (c2395om != abstractC1637gw0.h) {
            return jMax;
        }
        long j2 = abstractC1637gw0.j();
        C2395om c2395om3 = abstractC1637gw0.i;
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(c2395om3, j3)), j3 - ((long) c2395om3.f));
    }
}
