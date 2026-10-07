package o;

import java.util.List;

/* JADX INFO: renamed from: o.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2185me extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Ds0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185me(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2185me) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2185me(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Integer numJ;
        Object objJ;
        Object objJ2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
                objJ2 = obj;
                return (Js0) objJ2;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            objJ = obj;
            return (Js0) objJ;
        }
        Jp0.O(obj);
        Ds0 ds0 = this.n;
        List listT0 = AbstractC1119bh0.t0(AbstractC1119bh0.l0(ds0.l, "fctvevent-"), new String[]{"-"}, 0, 6);
        String str = (String) AbstractC0911Ye.e0(0, listT0);
        String str2 = ds0.l;
        if (str == null || (numJ = AbstractC1802ih0.J(str)) == null) {
            throw new Exception(AbstractC1701hf0.t("Evento inválido: ", str2));
        }
        int iIntValue = numJ.intValue();
        String str3 = (String) AbstractC0911Ye.e0(1, listT0);
        if (str3 != null) {
            String str4 = AbstractC1899jh0.O(str3) ^ true ? str3 : null;
            if (str4 != null) {
                String str5 = (String) AbstractC0911Ye.e0(2, listT0);
                Long lK = str5 != null ? AbstractC1802ih0.K(str5) : null;
                String str6 = (String) AbstractC0911Ye.e0(3, listT0);
                Long lK2 = str6 != null ? AbstractC1802ih0.K(str6) : null;
                if (lK == null || lK2 == null) {
                    C3380yu c3380yuQ = C2379oe.q();
                    this.m = 2;
                    c3380yuQ.getClass();
                    objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2992uu(c3380yuQ, str4, iIntValue, null), this);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return (Js0) objJ;
                }
                C3380yu c3380yuQ2 = C2379oe.q();
                long jLongValue = lK.longValue();
                long jLongValue2 = lK2.longValue();
                this.m = 1;
                c3380yuQ2.getClass();
                objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C3089vu(c3380yuQ2, str4, iIntValue, jLongValue, jLongValue2, null), this);
                if (objJ2 == enumC1706hi) {
                    return enumC1706hi;
                }
                return (Js0) objJ2;
            }
        }
        throw new Exception(AbstractC1701hf0.t("Evento inválido: ", str2));
    }
}
