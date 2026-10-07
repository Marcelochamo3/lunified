package o;

import androidx.preference.SwitchPreference;

/* JADX INFO: loaded from: classes.dex */
public final class Uc0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Wc0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SwitchPreference f556o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uc0(SwitchPreference switchPreference, InterfaceC0473Hh interfaceC0473Hh, Wc0 wc0) {
        super(2, interfaceC0473Hh);
        this.n = wc0;
        this.f556o = switchPreference;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Uc0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Uc0(this.f556o, interfaceC0473Hh, this.n);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i == 0) {
            Jp0.O(obj);
            SwitchPreference switchPreference = this.f556o;
            Wc0 wc0 = this.n;
            Tc0 tc0 = new Tc0(switchPreference, null, wc0);
            this.m = 1;
            Object objB = AbstractC1376eG.B(wc0.b0, TJ.f532o, tc0, this);
            if (objB != enumC1706hi) {
                objB = c2985uq0;
            }
            if (objB == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return c2985uq0;
    }
}
