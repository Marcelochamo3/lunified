package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Qn0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Context m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qn0(Context context, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = context;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        Qn0 qn0 = (Qn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        qn0.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Qn0(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Context context = this.m;
        Jp0.O(obj);
        try {
            Context context2 = Hv0.b;
            AbstractC1474fG.i(context, "$applicationContext");
            Hv0.b = context.getApplicationContext();
            int i = AbstractC1296dX.b;
            context.getApplicationContext();
        } catch (Exception unused) {
        }
        return C2985uq0.a;
    }
}
