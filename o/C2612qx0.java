package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.qx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2612qx0 extends Ph0 implements InterfaceC0775Sy {
    public Mb0 m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f995o;
    public /* synthetic */ Object p;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2612qx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2612qx0 c2612qx0 = new C2612qx0(2, interfaceC0473Hh);
        c2612qx0.p = obj;
        return c2612qx0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c7 A[LOOP:0: B:24:0x00c1->B:26:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC1608gi interfaceC1608gi;
        Mb0 mb0A;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f995o;
        if (i != 0) {
            if (i == 1) {
                InterfaceC1608gi interfaceC1608gi2 = (InterfaceC1608gi) this.p;
                Jp0.O(obj);
                interfaceC1608gi = interfaceC1608gi2;
            } else if (i == 2) {
                arrayList = this.n;
                mb0A = this.m;
                interfaceC1608gi = (InterfaceC1608gi) this.p;
                Jp0.O(obj);
                Iterable iterable = (Iterable) obj;
                arrayList2 = new ArrayList(AbstractC1016af.O(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C2418ox0(null, mb0A, (JSONObject) it.next()), 2));
                }
                ArrayList arrayListM0 = AbstractC0911Ye.m0(arrayList, arrayList2);
                this.p = null;
                this.m = null;
                this.n = null;
                this.f995o = 3;
                obj = AbstractC1370eA.b(arrayListM0, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            return AbstractC0911Ye.Z((Iterable) obj);
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi3 = (InterfaceC1608gi) this.p;
        Lx0 lx0 = Lx0.b;
        this.p = interfaceC1608gi3;
        this.f995o = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC1608gi = interfaceC1608gi3;
        mb0A = Nb0.a(4);
        Lx0 lx1 = Lx0.b;
        List listK = AbstractC0937Ze.K(new C1639gx0("Kids", AbstractC1923jt0.L(10)), new C1639gx0("Anime", AbstractC1923jt0.L(11)));
        arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
        Iterator it2 = listK.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C2515px0(mb0A, (C1639gx0) it2.next(), null), 2));
        }
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        C2321nx0 c2321nx0 = new C2321nx0(2, null);
        this.p = interfaceC1608gi;
        this.m = mb0A;
        this.n = arrayList;
        this.f995o = 2;
        obj = AbstractC1376eG.J(executorC0891Xk, c2321nx0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        Iterable iterable2 = (Iterable) obj;
        arrayList2 = new ArrayList(AbstractC1016af.O(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C2418ox0(null, mb0A, (JSONObject) it.next()), 2));
        }
        ArrayList arrayListM1 = AbstractC0911Ye.m0(arrayList, arrayList2);
        this.p = null;
        this.m = null;
        this.n = null;
        this.f995o = 3;
        obj = AbstractC1370eA.b(arrayListM1, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        return AbstractC0911Ye.Z((Iterable) obj);
    }
}
