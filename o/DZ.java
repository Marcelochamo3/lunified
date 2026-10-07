package o;

import android.view.View;
import android.widget.Toast;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsMobileView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DZ implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ PlayerMobileFragment m;

    public /* synthetic */ DZ(PlayerMobileFragment playerMobileFragment, int i) {
        this.l = i;
        this.m = playerMobileFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                PlayerMobileFragment playerMobileFragment = this.m;
                AbstractC1474fG.j(playerMobileFragment, "this$0");
                UK.m(playerMobileFragment).q();
                break;
            case 1:
                PlayerMobileFragment playerMobileFragment2 = this.m;
                AbstractC1474fG.j(playerMobileFragment2, "this$0");
                Dr0 dr0Z = AbstractC1459f50.z();
                Dr0[] dr0ArrValues = Dr0.values();
                Dr0 dr0 = dr0ArrValues[(dr0Z.ordinal() + 1) % dr0ArrValues.length];
                AbstractC1474fG.j(dr0, "value");
                Cr0.p.e(Integer.valueOf(dr0.m));
                C2303no0 c2303no0 = playerMobileFragment2.u0;
                AbstractC1474fG.g(c2303no0);
                C2303no0 c2303no1 = playerMobileFragment2.u0;
                AbstractC1474fG.g(c2303no1);
                ((PlayerView) c2303no0.f941o).setControllerShowTimeoutMs(((PlayerView) c2303no1.f941o).getControllerShowTimeoutMs());
                Toast.makeText(playerMobileFragment2.Q(), playerMobileFragment2.Q().getString(AbstractC1459f50.z().l), 0).show();
                C2303no0 c2303no2 = playerMobileFragment2.u0;
                AbstractC1474fG.g(c2303no2);
                ((PlayerView) c2303no2.f941o).setResizeMode(AbstractC1459f50.z().m);
                break;
            case 2:
                PlayerMobileFragment playerMobileFragment3 = this.m;
                AbstractC1474fG.j(playerMobileFragment3, "this$0");
                C2303no0 c2303no3 = playerMobileFragment3.u0;
                AbstractC1474fG.g(c2303no3);
                C2303no0 c2303no4 = playerMobileFragment3.u0;
                AbstractC1474fG.g(c2303no4);
                ((PlayerView) c2303no3.f941o).setControllerShowTimeoutMs(((PlayerView) c2303no4.f941o).getControllerShowTimeoutMs());
                C2303no0 c2303no5 = playerMobileFragment3.u0;
                AbstractC1474fG.g(c2303no5);
                PlayerSettingsMobileView playerSettingsMobileView = (PlayerSettingsMobileView) c2303no5.p;
                playerSettingsMobileView.setVisibility(0);
                playerSettingsMobileView.o(EnumC2035l00.l);
                RunnableC3102w1 runnableC3102w1 = playerSettingsMobileView.D;
                playerSettingsMobileView.removeCallbacks(runnableC3102w1);
                playerSettingsMobileView.n();
                playerSettingsMobileView.m();
                if (AbstractC2520q00.d) {
                    playerSettingsMobileView.postDelayed(runnableC3102w1, 2000L);
                }
                break;
            case 3:
                PlayerMobileFragment playerMobileFragment4 = this.m;
                AbstractC1474fG.j(playerMobileFragment4, "this$0");
                playerMobileFragment4.t0();
                break;
            default:
                PlayerMobileFragment playerMobileFragment5 = this.m;
                playerMobileFragment5.e0();
                C2303no0 c2303no6 = playerMobileFragment5.u0;
                AbstractC1474fG.g(c2303no6);
                ((LW) c2303no6.n).m.animate().alpha(0.0f).setDuration(300L).withEndAction(new Jj0(21, playerMobileFragment5)).start();
                break;
        }
    }
}
