package o;

import androidx.preference.SwitchPreference;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;

/* JADX INFO: renamed from: o.pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2512pw implements InterfaceC1734hw {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C2512pw(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2415ow c2415ow;
        C2512pw c2512pw;
        String strO;
        int i;
        String strO2;
        int i2;
        C1529fr0 c1529fr0 = C1529fr0.a;
        Object obj2 = this.n;
        C1627gr0 c1627gr0 = C1627gr0.a;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Object obj3 = this.m;
        switch (this.l) {
            case 0:
                if (interfaceC0473Hh instanceof C2415ow) {
                    c2415ow = (C2415ow) interfaceC0473Hh;
                    int i3 = c2415ow.f958o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c2415ow.f958o = i3 - Integer.MIN_VALUE;
                    } else {
                        c2415ow = new C2415ow(this, interfaceC0473Hh);
                    }
                } else {
                    c2415ow = new C2415ow(this, interfaceC0473Hh);
                }
                Object obj4 = c2415ow.m;
                EnumC1706hi enumC1706hi = EnumC1706hi.l;
                int i4 = c2415ow.f958o;
                if (i4 == 0) {
                    Jp0.O(obj4);
                    try {
                        c2415ow.l = this;
                        c2415ow.f958o = 1;
                        return ((InterfaceC1734hw) obj3).l(obj, c2415ow) == enumC1706hi ? enumC1706hi : c2985uq0;
                    } catch (Throwable th) {
                        th = th;
                        c2512pw = this;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2512pw = c2415ow.l;
                    try {
                        Jp0.O(obj4);
                        return c2985uq0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ((IF) c2512pw.n).m = th;
                throw th;
            case 1:
                AbstractC1822ir0 abstractC1822ir0 = (AbstractC1822ir0) obj;
                SwitchPreference switchPreference = (SwitchPreference) obj3;
                if (switchPreference != null) {
                    C3084vr0 c3084vr0 = C3084vr0.a;
                    switchPreference.A(C3084vr0.s());
                }
                if (switchPreference != null) {
                    Wc0 wc0 = (Wc0) obj2;
                    if (AbstractC1474fG.b(abstractC1822ir0, c1627gr0)) {
                        strO = wc0.n(R.string.settings_proxy_disabled);
                    } else if (AbstractC1474fG.b(abstractC1822ir0, c1529fr0)) {
                        C3084vr0 c3084vr1 = C3084vr0.a;
                        strO = wc0.o(R.string.settings_proxy_connecting, C3084vr0.H().m);
                    } else if (abstractC1822ir0 instanceof C1431er0) {
                        C1431er0 c1431er0 = (C1431er0) abstractC1822ir0;
                        Boolean bool = c1431er0.e;
                        if (AbstractC1474fG.b(bool, Boolean.TRUE)) {
                            i = R.string.settings_proxy_network_hosting;
                        } else if (AbstractC1474fG.b(bool, Boolean.FALSE)) {
                            i = R.string.settings_proxy_network_non_hosting;
                        } else {
                            if (bool != null) {
                                throw new C0730Rf();
                            }
                            i = R.string.settings_proxy_network_unknown;
                        }
                        String strN = wc0.n(i);
                        AbstractC1474fG.i(strN, "getString(...)");
                        int i5 = c1431er0.g ? R.string.settings_proxy_refreshing : R.string.settings_proxy_active;
                        String str = c1431er0.a.m;
                        String strN2 = c1431er0.d;
                        if (AbstractC1899jh0.O(strN2)) {
                            strN2 = wc0.n(R.string.settings_proxy_isp_unknown);
                            AbstractC1474fG.i(strN2, "getString(...)");
                        }
                        strO = wc0.o(i5, str, c1431er0.b, c1431er0.c, strN2, strN);
                    } else {
                        if (!(abstractC1822ir0 instanceof C1725hr0)) {
                            throw new C0730Rf();
                        }
                        strO = wc0.o(R.string.settings_proxy_error, ((C1725hr0) abstractC1822ir0).a);
                    }
                    switchPreference.v(strO);
                }
                return c2985uq0;
            default:
                AbstractC1822ir0 abstractC1822ir1 = (AbstractC1822ir0) obj;
                SwitchPreference switchPreference2 = (SwitchPreference) obj3;
                if (switchPreference2 != null) {
                    C3084vr0 c3084vr2 = C3084vr0.a;
                    switchPreference2.A(C3084vr0.s());
                }
                if (switchPreference2 != null) {
                    SettingsTvFragment settingsTvFragment = (SettingsTvFragment) obj2;
                    if (AbstractC1474fG.b(abstractC1822ir1, c1627gr0)) {
                        strO2 = settingsTvFragment.n(R.string.settings_proxy_disabled);
                    } else if (AbstractC1474fG.b(abstractC1822ir1, c1529fr0)) {
                        C3084vr0 c3084vr3 = C3084vr0.a;
                        strO2 = settingsTvFragment.o(R.string.settings_proxy_connecting, C3084vr0.H().m);
                    } else if (abstractC1822ir1 instanceof C1431er0) {
                        C1431er0 c1431er1 = (C1431er0) abstractC1822ir1;
                        Boolean bool2 = c1431er1.e;
                        if (AbstractC1474fG.b(bool2, Boolean.TRUE)) {
                            i2 = R.string.settings_proxy_network_hosting;
                        } else if (AbstractC1474fG.b(bool2, Boolean.FALSE)) {
                            i2 = R.string.settings_proxy_network_non_hosting;
                        } else {
                            if (bool2 != null) {
                                throw new C0730Rf();
                            }
                            i2 = R.string.settings_proxy_network_unknown;
                        }
                        String strN3 = settingsTvFragment.n(i2);
                        AbstractC1474fG.i(strN3, "getString(...)");
                        int i6 = c1431er1.g ? R.string.settings_proxy_refreshing : R.string.settings_proxy_active;
                        String str2 = c1431er1.a.m;
                        String strN4 = c1431er1.d;
                        if (AbstractC1899jh0.O(strN4)) {
                            strN4 = settingsTvFragment.n(R.string.settings_proxy_isp_unknown);
                            AbstractC1474fG.i(strN4, "getString(...)");
                        }
                        strO2 = settingsTvFragment.o(i6, str2, c1431er1.b, c1431er1.c, strN4, strN3);
                    } else {
                        if (!(abstractC1822ir1 instanceof C1725hr0)) {
                            throw new C0730Rf();
                        }
                        strO2 = settingsTvFragment.o(R.string.settings_proxy_error, ((C1725hr0) abstractC1822ir1).a);
                    }
                    switchPreference2.v(strO2);
                }
                return c2985uq0;
        }
    }
}
