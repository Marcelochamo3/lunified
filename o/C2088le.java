package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2088le extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f896o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2088le(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2088le) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2088le c2088le = new C2088le(this.p, interfaceC0473Hh);
        c2088le.f896o = obj;
        return c2088le;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Integer numJ;
        String str;
        String str2;
        Throwable th;
        Object objK;
        String str3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        String str4 = this.p;
        if (i == 0) {
            Jp0.O(obj);
            List listT0 = AbstractC1119bh0.t0(AbstractC1119bh0.l0(str4, "fctvevent-"), new String[]{"-"}, 0, 6);
            String str5 = (String) AbstractC0911Ye.e0(0, listT0);
            numJ = str5 != null ? AbstractC1802ih0.J(str5) : null;
            String str6 = (String) AbstractC0911Ye.e0(1, listT0);
            if (str6 == null || !(!AbstractC1899jh0.O(str6))) {
                str6 = null;
            }
            if (numJ == null || str6 == null) {
                C1387eR c1387eR = (C1387eR) C2379oe.j.get(str4);
                return AbstractC2506pt.A(new Ds0(this.p, (c1387eR == null || (str = c1387eR.b) == null) ? "Evento en vivo" : str, null, null, 52));
            }
            try {
                C3380yu c3380yuQ = C2379oe.q();
                int iIntValue = numJ.intValue();
                this.f896o = numJ;
                this.m = str6;
                this.n = 1;
                c3380yuQ.getClass();
                Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C3283xu(c3380yuQ, str6, iIntValue, null), this);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                str2 = str6;
                obj = objJ;
            } catch (Throwable th2) {
                str2 = str6;
                th = th2;
                objK = Jp0.k(th);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.m;
            numJ = (Integer) this.f896o;
            try {
                Jp0.O(obj);
            } catch (Throwable th3) {
                th = th3;
                objK = Jp0.k(th);
            }
        }
        objK = (List) obj;
        Object obj2 = C1233cq.l;
        if (objK instanceof C2439p80) {
            objK = obj2;
        }
        List<C2798su> list = (List) objK;
        if (list.isEmpty()) {
            C1387eR c1387eR2 = (C1387eR) C2379oe.j.get(str4);
            return AbstractC2506pt.A(new Ds0(this.p, (c1387eR2 == null || (str3 = c1387eR2.b) == null) ? "Evento en vivo" : str3, null, null, 52));
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (C2798su c2798su : list) {
            arrayList.add(new Ds0("fctvevent-" + numJ + "-" + str2 + "-" + c2798su.a + "-" + c2798su.b, c2798su.c, null, null, 52));
        }
        return arrayList;
    }
}
