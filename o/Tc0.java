package o;

import androidx.preference.SwitchPreference;

/* JADX INFO: loaded from: classes.dex */
public final class Tc0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ SwitchPreference n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Wc0 f537o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tc0(SwitchPreference switchPreference, InterfaceC0473Hh interfaceC0473Hh, Wc0 wc0) {
        super(2, interfaceC0473Hh);
        this.n = switchPreference;
        this.f537o = wc0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        ((Tc0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
        return EnumC1706hi.l;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Tc0(this.n, interfaceC0473Hh, this.f537o);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            C2917u50 c2917u50 = C3084vr0.F;
            C2512pw c2512pw = new C2512pw(this.n, 1, this.f537o);
            this.m = 1;
            if (c2917u50.l.a(c2512pw, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        throw new C0730Rf();
    }
}
