package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Vx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vx0(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Vx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Vx0(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[LOOP:0: B:20:0x005a->B:22:0x0060, LOOP_END] */
    @Override // o.R7
    public final Object r(Object obj) {
        int i;
        ArrayList arrayList;
        Iterator it;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.m;
        if (i2 != 0) {
            if (i2 == 1) {
                Jp0.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            List list = ((Mx0) obj).b;
            i = this.n;
            if (i < 1) {
                i = 1;
            }
            List listS0 = AbstractC0911Ye.s0(100, AbstractC0911Ye.Y((i - 1) * 100, list));
            arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
            it = listS0.iterator();
            while (it.hasNext()) {
                arrayList.add(C1152by0.r((Ox0) it.next()));
            }
            return arrayList;
        }
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        this.m = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        C1152by0 c1152by0 = C1152by0.b;
        this.m = 2;
        obj = C1152by0.q(c1152by0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        List list2 = ((Mx0) obj).b;
        i = this.n;
        if (i < 1) {
            i = 1;
        }
        List listS1 = AbstractC0911Ye.s0(100, AbstractC0911Ye.Y((i - 1) * 100, list2));
        arrayList = new ArrayList(AbstractC1016af.O(listS1, 10));
        it = listS1.iterator();
        while (it.hasNext()) {
            arrayList.add(C1152by0.r((Ox0) it.next()));
        }
        return arrayList;
    }
}
