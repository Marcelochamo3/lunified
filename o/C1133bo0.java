package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.bo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1133bo0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f705o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133bo0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f705o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1133bo0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1133bo0(this.n, this.f705o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i == 0) {
                Jp0.O(obj);
                String str = this.n;
                if (str == null || AbstractC1899jh0.O(str)) {
                    List<C2420oz> listK = AbstractC0937Ze.K(new C2420oz("Acción", "Acción", c1233cq), new C2420oz("Animación", "Animación", c1233cq), new C2420oz("Aventura", "Aventura", c1233cq), new C2420oz("Ciencia ficción", "Ciencia ficción", c1233cq), new C2420oz("Comedia", "Comedia", c1233cq), new C2420oz("Drama", "Drama", c1233cq), new C2420oz("Fantasía", "Fantasía", c1233cq), new C2420oz("Romance", "Romance", c1233cq), new C2420oz("Terror", "Terror", c1233cq), new C2420oz("Thriller", "Thriller", c1233cq));
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
                    for (C2420oz c2420oz : listK) {
                        EnumC3203x3 enumC3203x3 = EnumC3203x3.t;
                        c2420oz.getClass();
                        c2420oz.d = enumC3203x3;
                        arrayList.add(c2420oz);
                    }
                    return arrayList;
                }
                if (this.f705o > 1) {
                    return c1233cq;
                }
                C1035ao0 c1035ao0 = new C1035ao0(C1816io0.w(str), null);
                this.m = 1;
                obj = zy0.n(c1035ao0, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            C1101bX c1101bX = (C1101bX) obj;
            return AbstractC0911Ye.m0((List) c1101bX.l, (List) c1101bX.m);
        } catch (Exception unused) {
            return c1233cq;
        }
    }
}
