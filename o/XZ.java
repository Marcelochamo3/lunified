package o;

import android.os.Bundle;
import android.widget.Toast;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class XZ extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C0456Gq m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZ(C0456Gq c0456Gq, PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c0456Gq;
        this.n = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((XZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new XZ(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C2985uq0 c2985uq0;
        Ma0 ma0;
        C0456Gq c0456Gq = this.m;
        C2985uq0 c2985uq1 = C2985uq0.a;
        PlayerMobileFragment playerMobileFragment = this.n;
        Jp0.O(obj);
        try {
            C2109lo0 c2109lo0 = c0456Gq.e;
            if (c2109lo0 == null || (ma0 = c0456Gq.f) == null) {
                return c2985uq1;
            }
            playerMobileFragment.P().getIntent();
            Bundle bundle = new Bundle();
            String str = c0456Gq.a;
            int i = c0456Gq.b;
            String str2 = c0456Gq.c;
            String str3 = c0456Gq.d;
            String str4 = c2109lo0.a;
            String str5 = c2109lo0.b;
            if (str5 == null) {
                str5 = "";
            }
            c2985uq0 = c2985uq1;
            try {
                bundle.putParcelable("videoType", new Hs0(str, i, str2, str3, new Gs0(str4, str5, c2109lo0.h, c2109lo0.i), new Fs0(ma0.b, ma0.c)));
                bundle.putString("id", c0456Gq.a);
                String str6 = c2109lo0.b;
                if (str6 == null) {
                    str6 = "";
                }
                bundle.putString("title", str6);
                bundle.putString("subtitle", PlayerMobileFragment.Y(playerMobileFragment, c0456Gq));
                UK.m(playerMobileFragment).r();
                UK.m(playerMobileFragment).n(R.id.player, bundle, null);
            } catch (Exception unused) {
                Toast.makeText(playerMobileFragment.Q(), "Error al reproducir siguiente episodio", 0).show();
            }
            return c2985uq0;
        } catch (Exception unused2) {
            c2985uq0 = c2985uq1;
        }
        Toast.makeText(playerMobileFragment.Q(), "Error al reproducir siguiente episodio", 0).show();
        return c2985uq0;
    }
}
