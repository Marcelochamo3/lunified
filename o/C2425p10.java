package o;

import android.os.Bundle;
import android.widget.Toast;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.p10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2425p10 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerTvFragment m;
    public final /* synthetic */ C0456Gq n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2425p10(PlayerTvFragment playerTvFragment, C0456Gq c0456Gq, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerTvFragment;
        this.n = c0456Gq;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2425p10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2425p10(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C2109lo0 c2109lo0;
        Ma0 ma0;
        C0456Gq c0456Gq = this.n;
        PlayerTvFragment playerTvFragment = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Jp0.O(obj);
        try {
            if (playerTvFragment.z0 == null || (c2109lo0 = c0456Gq.e) == null || (ma0 = c0456Gq.f) == null) {
                return c2985uq0;
            }
            String str = c0456Gq.a;
            int i = c0456Gq.b;
            String str2 = c0456Gq.c;
            String str3 = c0456Gq.d;
            String str4 = c2109lo0.a;
            String str5 = c2109lo0.b;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            Hs0 hs0 = new Hs0(str, i, str2, str3, new Gs0(str4, str5, c2109lo0.h, c2109lo0.i), new Fs0(ma0.b, ma0.c));
            Bundle bundle = new Bundle();
            bundle.putParcelable("videoType", hs0);
            bundle.putString("id", c0456Gq.a);
            String str7 = c2109lo0.b;
            if (str7 != null) {
                str6 = str7;
            }
            bundle.putString("title", str6);
            bundle.putString("subtitle", PlayerTvFragment.W(playerTvFragment, c0456Gq));
            YT ytM = UK.m(playerTvFragment);
            if (!ytM.r()) {
                return c2985uq0;
            }
            ytM.n(R.id.player, bundle, null);
        } catch (Exception unused) {
            Toast.makeText(playerTvFragment.Q(), "Error al reproducir siguiente episodio", 0).show();
        }
        return c2985uq0;
    }
}
