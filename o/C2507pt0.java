package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.pt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2507pt0 extends AbstractC3473zs {
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2410ot0 c2410ot0;
        C2507pt0 c2507pt0;
        InterfaceC2313nt0 interfaceC2313nt0;
        Js0 js0;
        int i = 1;
        if (interfaceC0473Hh instanceof C2410ot0) {
            c2410ot0 = (C2410ot0) interfaceC0473Hh;
            int i2 = c2410ot0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2410ot0.p = i2 - Integer.MIN_VALUE;
            } else {
                c2410ot0 = new C2410ot0(this, interfaceC0473Hh);
            }
        } else {
            c2410ot0 = new C2410ot0(this, interfaceC0473Hh);
        }
        Object objB = c2410ot0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2410ot0.p;
        if (i3 != 0) {
            if (i3 == 1) {
                interfaceC2313nt0 = (InterfaceC2313nt0) c2410ot0.m;
                c2507pt0 = (C2507pt0) c2410ot0.l;
                Jp0.O(objB);
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Jp0.O(objB);
                        AbstractC1674hK.w(objB);
                        throw null;
                    }
                    if (i3 == 4) {
                        String str2 = (String) c2410ot0.m;
                        InterfaceC2313nt0 interfaceC2313nt1 = (InterfaceC2313nt0) c2410ot0.l;
                        Jp0.O(objB);
                        Js0 js1 = (Js0) objB;
                        c2410ot0.l = js1;
                        c2410ot0.m = null;
                        c2410ot0.p = 5;
                        Object objC = interfaceC2313nt1.c(str2, c2410ot0);
                        if (objC == enumC1706hi) {
                            return enumC1706hi;
                        }
                        js0 = js1;
                        objB = objC;
                    } else {
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Js0 js2 = (Js0) c2410ot0.l;
                        Jp0.O(objB);
                        js0 = js2;
                    }
                    Iterable iterable = (Iterable) objB;
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(iterable, 10));
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        return Js0.a(js0, null, null, null, null, null, arrayList, false, 3583);
                    }
                    AbstractC1674hK.w(it.next());
                    throw null;
                }
                Jp0.O(objB);
            }
            AbstractC1674hK.w(objB);
            throw null;
        }
        Jp0.O(objB);
        C1583gR c1583gR = new C1583gR(12);
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList2 = nvO.c;
        arrayList2.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList3 = nvO.d;
        arrayList3.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList2, X10.q);
        AbstractC1406ef.S(arrayList3, X10.r);
        arrayList2.add(x11);
        arrayList3.add(x11);
        c1583gR.m = new OV(nvO);
        c1583gR.f("https://vidsrc.to");
        P9 p9 = new P9(i);
        ArrayList arrayList4 = (ArrayList) c1583gR.f793o;
        arrayList4.add(p9);
        arrayList4.add(DA.c());
        Object objB2 = c1583gR.m().b(InterfaceC2313nt0.class);
        AbstractC1474fG.i(objB2, "create(...)");
        InterfaceC2313nt0 interfaceC2313nt2 = (InterfaceC2313nt0) objB2;
        c2410ot0.l = this;
        c2410ot0.m = interfaceC2313nt2;
        c2410ot0.p = 1;
        Object objA = interfaceC2313nt2.a(str, c2410ot0);
        if (objA == enumC1706hi) {
            return enumC1706hi;
        }
        c2507pt0 = this;
        interfaceC2313nt0 = interfaceC2313nt2;
        objB = objA;
        C3176wp c3176wpX = ((C0660On) objB).X("ul.episodes li a");
        if ((c3176wpX != null ? c3176wpX.d("data-id") : null) == null) {
            throw new Exception("Can't retrieve media ID");
        }
        c2507pt0.getClass();
        c2410ot0.l = c2507pt0;
        c2410ot0.m = interfaceC2313nt0;
        c2410ot0.getClass();
        c2410ot0.p = 2;
        objB = interfaceC2313nt0.b("https://raw.githubusercontent.com/Ciarands/vidsrc-keys/main/keys.json", c2410ot0);
        if (objB == enumC1706hi) {
            return enumC1706hi;
        }
        AbstractC1674hK.w(objB);
        throw null;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://vidsrc.to";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Vidsrc.to";
    }
}
