package o;

import androidx.preference.SwitchPreference;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;

/* JADX INFO: renamed from: o.gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1599gd0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ SettingsTvFragment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SwitchPreference f795o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599gd0(SwitchPreference switchPreference, SettingsTvFragment settingsTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = settingsTvFragment;
        this.f795o = switchPreference;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1599gd0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1599gd0(this.f795o, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i == 0) {
            Jp0.O(obj);
            SwitchPreference switchPreference = this.f795o;
            SettingsTvFragment settingsTvFragment = this.n;
            C1501fd0 c1501fd0 = new C1501fd0(switchPreference, settingsTvFragment, null);
            this.m = 1;
            Object objB = AbstractC1376eG.B(settingsTvFragment.b0, TJ.f532o, c1501fd0, this);
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
