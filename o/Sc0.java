package o;

import android.content.Context;
import android.text.format.Formatter;
import android.widget.Toast;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class Sc0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Wc0 f517o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sc0(Wc0 wc0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f517o = wc0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Sc0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Sc0 sc0 = new Sc0(this.f517o, interfaceC0473Hh);
        sc0.n = obj;
        return sc0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        Wc0 wc0 = this.f517o;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C2691rp c2691rp = C2691rp.m;
                Context contextQ = wc0.Q();
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
            Toast.makeText(wc0.Q(), wc0.o(R.string.settings_clear_cache_done, Formatter.formatFileSize(wc0.Q(), ((Number) objK).longValue())), 1).show();
        }
        if (C2536q80.a(objK) != null) {
            Toast.makeText(wc0.Q(), R.string.settings_clear_cache_error, 1).show();
        }
        return C2985uq0.a;
    }
}
