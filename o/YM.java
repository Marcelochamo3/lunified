package o;

import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: loaded from: classes.dex */
public final class YM extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MainTvActivity f635o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM(MainTvActivity mainTvActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f635o = mainTvActivity;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((YM) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        YM ym = new YM(this.f635o, interfaceC0473Hh);
        ym.n = obj;
        return ym;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        boolean z;
        MainTvActivity mainTvActivity = this.f635o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            try {
                Ec0 ec0 = Ec0.a;
                AbstractC1474fG.j(mainTvActivity, "context");
                C1101bX c1101bXD = Ec0.d();
                if (c1101bXD == null) {
                    z = false;
                } else {
                    Ec0.k((String) c1101bXD.l, (String) c1101bXD.m);
                    z = true;
                }
                objK = Boolean.valueOf(z);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            Object obj2 = Boolean.FALSE;
            if (objK instanceof C2439p80) {
                objK = obj2;
            }
            boolean zBooleanValue = ((Boolean) objK).booleanValue();
            C3362yl c3362yl = AbstractC1910jn.a;
            EM em = FM.a;
            XM xm = new XM(mainTvActivity, zBooleanValue, null);
            this.m = 1;
            if (AbstractC1376eG.J(em, xm, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
