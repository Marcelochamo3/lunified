package o;

import android.os.Bundle;
import android.widget.Toast;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.o10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2328o10 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerTvFragment m;
    public final /* synthetic */ C1387eR n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328o10(PlayerTvFragment playerTvFragment, C1387eR c1387eR, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerTvFragment;
        this.n = c1387eR;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        C2328o10 c2328o10 = (C2328o10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        c2328o10.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2328o10(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        PlayerTvFragment playerTvFragment = this.m;
        Jp0.O(obj);
        try {
            Bundle bundle = new Bundle();
            C1387eR c1387eR = this.n;
            String str = c1387eR.a;
            String str2 = c1387eR.b;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c1387eR.h;
            if (str4 == null) {
                str4 = "";
            }
            bundle.putParcelable("videoType", new Is0(str, str2, "", str4));
            bundle.putString("id", c1387eR.a);
            String str5 = c1387eR.b;
            if (str5 != null) {
                str3 = str5;
            }
            bundle.putString("title", str3);
            bundle.putString("subtitle", "TV en Vivo");
            UK.m(playerTvFragment).r();
            UK.m(playerTvFragment).n(R.id.player, bundle, null);
        } catch (Exception unused) {
            Toast.makeText(playerTvFragment.Q(), "Error al cambiar de canal", 0).show();
        }
        return C2985uq0.a;
    }
}
