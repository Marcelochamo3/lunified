package o;

import android.content.Context;
import android.text.format.Formatter;
import android.widget.Toast;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;

/* JADX INFO: renamed from: o.ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1403ed0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SettingsTvFragment f757o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1403ed0(SettingsTvFragment settingsTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f757o = settingsTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1403ed0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1403ed0 c1403ed0 = new C1403ed0(this.f757o, interfaceC0473Hh);
        c1403ed0.n = obj;
        return c1403ed0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        SettingsTvFragment settingsTvFragment = this.f757o;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C2691rp c2691rp = C2691rp.m;
                Context contextQ = settingsTvFragment.Q();
                this.m = 1;
                obj = c2691rp.n(contextQ, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            objK = new Long(((Number) obj).longValue());
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (!(objK instanceof C2439p80)) {
            Toast.makeText(settingsTvFragment.Q(), settingsTvFragment.o(R.string.settings_clear_cache_done, Formatter.formatFileSize(settingsTvFragment.Q(), ((Number) objK).longValue())), 1).show();
        }
        if (C2536q80.a(objK) != null) {
            Toast.makeText(settingsTvFragment.Q(), R.string.settings_clear_cache_error, 1).show();
        }
        return C2985uq0.a;
    }
}
