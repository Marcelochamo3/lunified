package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.wx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3193wx0 extends Ph0 implements InterfaceC0775Sy {
    public long m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1105o;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3193wx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3193wx0 c3193wx0 = new C3193wx0(2, interfaceC0473Hh);
        c3193wx0.f1105o = obj;
        return c3193wx0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x016d  */
    /* JADX WARN: Code duplicated, block: B:33:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0167 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        InterfaceC1608gi interfaceC1608gi;
        long jElapsedRealtime;
        List listK;
        Object objB;
        ArrayList arrayList;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.m;
                interfaceC1608gi = (InterfaceC1608gi) this.f1105o;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.f1105o;
                Jp0.O(obj);
                listK = list;
                objB = obj;
            }
            ArrayList arrayListZ = AbstractC0911Ye.Z((Iterable) objB);
            arrayList = new ArrayList();
            for (Object obj2 : arrayListZ) {
                if (!((C0882Xb) obj2).b.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            SystemClock.elapsedRealtime();
            arrayList.size();
            listK.size();
            return arrayList;
        }
        Jp0.O(obj);
        interfaceC1608gi = (InterfaceC1608gi) this.f1105o;
        jElapsedRealtime = SystemClock.elapsedRealtime();
        Lx0 lx0 = Lx0.b;
        this.f1105o = interfaceC1608gi;
        this.m = jElapsedRealtime;
        this.n = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        SystemClock.elapsedRealtime();
        listK = AbstractC0937Ze.K(new C2999ux0("Películas nuevas · 2026", "movies", "year", "2026", null, 16), new C2999ux0("Series nuevas · 2026", "series", "year", "2026", null, 16), new C2999ux0("Kids", null, null, null, new Integer(AbstractC1923jt0.L(10)), 14), new C2999ux0("Anime", null, null, null, new Integer(AbstractC1923jt0.L(11)), 14), new C2999ux0("Acción · 2026", "movies", "tags", "Action", null, 16), new C2999ux0("Comedia · 2026", "movies", "tags", "Comedy", null, 16), new C2999ux0("Terror · 2026", "movies", "tags", "Horror", null, 16), new C2999ux0("Drama · 2026", "series", "tags", "Drama", null, 16));
        Mb0 mb0A = Nb0.a(4);
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(listK, 10));
        Iterator it = listK.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            arrayList2.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C3096vx0(mb0A, (C2999ux0) next, i2, null), 2));
            it = it;
            i2 = i3;
        }
        this.f1105o = listK;
        this.m = jElapsedRealtime;
        this.n = 2;
        objB = AbstractC1370eA.b(arrayList2, this);
        if (objB == enumC1706hi) {
            return enumC1706hi;
        }
        ArrayList arrayListZ2 = AbstractC0911Ye.Z((Iterable) objB);
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            if (!((C0882Xb) obj2).b.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        SystemClock.elapsedRealtime();
        arrayList.size();
        listK.size();
        return arrayList;
    }
}
