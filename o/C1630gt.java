package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630gt extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630gt(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1630gt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1630gt(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[LOOP:1: B:23:0x006e->B:25:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[LOOP:3: B:35:0x00c2->B:37:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        C2409ot c2409ot;
        ArrayList arrayList3;
        Iterator it2;
        HashSet hashSet;
        ArrayList arrayList4;
        C0613Ms c0613Ms;
        C1101bX c1101bX;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                c1101bX = (C1101bX) obj2;
                if (C2409ot.s((C0821Us) c1101bX.l, (C0795Ts) c1101bX.m)) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1406ef.Q(arrayList2, ((C0795Ts) ((C1101bX) it.next()).m).b);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList2) {
                c0613Ms = (C0613Ms) obj3;
                AbstractC1474fG.j(c0613Ms, "card");
                if (c0613Ms.b != EnumC0639Ns.l && c0613Ms.f403o.isEmpty()) {
                    arrayList5.add(obj3);
                }
            }
            c2409ot = C2409ot.b;
            arrayList3 = new ArrayList(AbstractC1016af.O(arrayList5, 10));
            it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(c2409ot.D((C0613Ms) it2.next()));
            }
            hashSet = new HashSet();
            arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (hashSet.add(((C2109lo0) obj4).a)) {
                    arrayList4.add(obj4);
                }
            }
            return arrayList4;
        }
        Jp0.O(obj);
        C2409ot c2409ot2 = C2409ot.b;
        this.m = 1;
        obj = C2409ot.p(c2409ot2, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        C2409ot c2409ot3 = C2409ot.b;
        this.m = 2;
        obj = c2409ot3.y((C0665Os) obj, "/", this.n, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        arrayList = new ArrayList();
        while (r6.hasNext()) {
            c1101bX = (C1101bX) obj2;
            if (C2409ot.s((C0821Us) c1101bX.l, (C0795Ts) c1101bX.m)) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList2, ((C0795Ts) ((C1101bX) it.next()).m).b);
        }
        ArrayList arrayList6 = new ArrayList();
        while (r6.hasNext()) {
            c0613Ms = (C0613Ms) obj3;
            AbstractC1474fG.j(c0613Ms, "card");
            if (c0613Ms.b != EnumC0639Ns.l) {
            }
        }
        c2409ot = C2409ot.b;
        arrayList3 = new ArrayList(AbstractC1016af.O(arrayList6, 10));
        it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList3.add(c2409ot.D((C0613Ms) it2.next()));
        }
        hashSet = new HashSet();
        arrayList4 = new ArrayList();
        while (r1.hasNext()) {
            if (hashSet.add(((C2109lo0) obj4).a)) {
                arrayList4.add(obj4);
            }
        }
        return arrayList4;
    }
}
