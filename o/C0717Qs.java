package o;

import android.widget.Toast;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.util.List;

/* JADX INFO: renamed from: o.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0717Qs extends AbstractC1153bz implements InterfaceC0412Ey {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717Qs(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.t = i3;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) throws Exception {
        C2985uq0 c2985uq0 = C2985uq0.a;
        Object obj2 = this.m;
        switch (this.t) {
            case 0:
                String str = (String) obj;
                AbstractC1474fG.j(str, "p0");
                return AbstractC2506pt.d((TH) obj2, str);
            case 1:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "p0");
                List list = C3041vS.c;
                ((C3041vS) obj2).getClass();
                return C3041vS.h(str2);
            case 2:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "p0");
                List list2 = C3041vS.c;
                ((C3041vS) obj2).getClass();
                return C3041vS.h(str3);
            case 3:
                String str4 = (String) obj;
                AbstractC1474fG.j(str4, "p0");
                List list3 = C3041vS.c;
                ((C3041vS) obj2).getClass();
                return C3041vS.g(str4);
            case 4:
                String str5 = (String) obj;
                AbstractC1474fG.j(str5, "p0");
                List list4 = C3041vS.c;
                ((C3041vS) obj2).getClass();
                return C3041vS.g(str5);
            case 5:
                return ((C3176wp) obj2).d((String) obj);
            case 6:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) obj2;
                playerMobileFragment.s0 = bool;
                Js0 js0 = playerMobileFragment.p0;
                if (js0 != null) {
                    if (!AbstractC1899jh0.N(js0.n, "webview", true)) {
                        Ds0 ds0 = playerMobileFragment.o0;
                        if (ds0 != null) {
                            if (zBooleanValue != playerMobileFragment.r0) {
                                C1042as c1042as = playerMobileFragment.y0;
                                if (c1042as == null) {
                                    AbstractC1474fG.U("player");
                                    throw null;
                                }
                                playerMobileFragment.q0(zBooleanValue, js0, ds0, U9.f(c1042as.C(), 0L), true);
                            }
                            C1005aZ c1005aZM = U9.m((EnumC1103bZ) playerMobileFragment.l0.getValue(), zBooleanValue);
                            Toast.makeText(playerMobileFragment.Q(), playerMobileFragment.o(R.string.player_extra_buffer_profile_applied, Integer.valueOf(c1005aZM.a / 1000), Integer.valueOf(c1005aZM.b / 1000), Float.valueOf(c1005aZM.d / 1000.0f)), 0).show();
                        }
                    } else {
                        Toast.makeText(playerMobileFragment.Q(), R.string.player_extra_buffer_unavailable_webview, 0).show();
                    }
                }
                return c2985uq0;
            case 7:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj2;
                playerTvFragment.s0 = bool2;
                Js0 js1 = playerTvFragment.p0;
                if (js1 != null) {
                    if (!AbstractC1899jh0.N(js1.n, "webview", true)) {
                        Ds0 ds1 = playerTvFragment.o0;
                        if (ds1 != null) {
                            if (zBooleanValue2 != playerTvFragment.r0) {
                                C1042as c1042as2 = playerTvFragment.D0;
                                playerTvFragment.x0(zBooleanValue2, js1, ds1, U9.f(c1042as2 != null ? c1042as2.C() : 0L, 0L), true);
                            }
                            C1005aZ c1005aZM2 = U9.m(playerTvFragment.m0(), zBooleanValue2);
                            Toast.makeText(playerTvFragment.Q(), playerTvFragment.o(R.string.player_extra_buffer_profile_applied, Integer.valueOf(c1005aZM2.a / 1000), Integer.valueOf(c1005aZM2.b / 1000), Float.valueOf(c1005aZM2.d / 1000.0f)), 0).show();
                        }
                    } else {
                        Toast.makeText(playerTvFragment.Q(), R.string.player_extra_buffer_unavailable_webview, 0).show();
                    }
                }
                return c2985uq0;
            default:
                Cd0 cd0 = (Cd0) obj;
                AbstractC1474fG.j(cd0, "p0");
                ((C20) obj2).getClass();
                return C20.A(cd0);
        }
    }
}
