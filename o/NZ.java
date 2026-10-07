package o;

import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class NZ extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerMobileFragment m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NZ(PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        NZ nz = (NZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        nz.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new NZ(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        Toast.makeText(this.m.Q(), "Tu dispositivo no soporta esta reproducción. Prueba con otro canal o dispositivo.", 1).show();
        return C2985uq0.a;
    }
}
