package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.b50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1069b50 {
    static final /* synthetic */ C1069b50 $$INSTANCE = new C1069b50();

    public static InterfaceC1557g50 a(String str) {
        AbstractC1474fG.j(str, "baseUrl");
        C1583gR c1583gR = new C1583gR(12);
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        c1583gR.m = new OV(nvO);
        c1583gR.f(str);
        P9 p9 = new P9(4);
        ArrayList arrayList3 = (ArrayList) c1583gR.f793o;
        arrayList3.add(p9);
        CA ca = new CA();
        ca.b(AbstractC1459f50.class, new C1361e50());
        arrayList3.add(new DA(ca.a()));
        Object objB = c1583gR.m().b(InterfaceC1557g50.class);
        AbstractC1474fG.i(objB, "create(...)");
        return (InterfaceC1557g50) objB;
    }
}
