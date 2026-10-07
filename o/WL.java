package o;

import android.content.Context;
import com.skidush.clonex.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class WL extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WL(LoginActivity loginActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = loginActivity;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((WL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new WL(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            C3084vr0 c3084vr0 = C3084vr0.a;
            this.m = 1;
            if (C3084vr0.C(this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        Ec0 ec0 = Ec0.a;
        Context applicationContext = this.n.getApplicationContext();
        AbstractC1474fG.i(applicationContext, "getApplicationContext(...)");
        Ec0.h(applicationContext);
        Ec0.m(applicationContext);
        return Ec0.d();
    }
}
