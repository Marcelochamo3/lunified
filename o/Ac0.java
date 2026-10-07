package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Ac0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1101bX f174o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac0(Context context, C1101bX c1101bX, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = context;
        this.f174o = c1101bX;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        Ac0 ac0 = (Ac0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        ac0.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Ac0 ac0 = new Ac0(this.n, this.f174o, interfaceC0473Hh);
        ac0.m = obj;
        return ac0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Jp0.O(obj);
        Context context = this.n;
        C1101bX c1101bX = this.f174o;
        try {
            Ec0 ec0 = Ec0.a;
            AbstractC1474fG.g(context);
            Ec0.k((String) c1101bX.l, (String) c1101bX.m);
            objK = c2985uq0;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2536q80.a(objK);
        return c2985uq0;
    }
}
