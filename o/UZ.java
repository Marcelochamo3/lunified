package o;

import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class UZ extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZ(PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((UZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new UZ(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = null;
        if (i == 0) {
            Jp0.O(obj);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            TZ tz = new TZ(2, null);
            this.m = 1;
            obj = AbstractC1376eG.J(executorC0891Xk, tz, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2985uq0 c2985uq1 = C2985uq0.a;
        PlayerMobileFragment playerMobileFragment = this.n;
        if (zBooleanValue && playerMobileFragment.t() && playerMobileFragment.u0 != null) {
            Ds0 ds0 = playerMobileFragment.o0;
            if (ds0 != null) {
                playerMobileFragment.k0().g(ds0, null);
                c2985uq0 = c2985uq1;
            }
            if (c2985uq0 == null) {
                playerMobileFragment.k0().i(playerMobileFragment.h0().d, playerMobileFragment.h0().a);
            }
        } else if (playerMobileFragment.t()) {
            Toast.makeText(playerMobileFragment.Q(), "No se pudo desbloquear la transmisión", 1).show();
        }
        return c2985uq1;
    }
}
