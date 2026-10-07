package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y00 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ PlayerTvFragment m;

    public /* synthetic */ Y00(PlayerTvFragment playerTvFragment, int i) {
        this.l = i;
        this.m = playerTvFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LW lw;
        FrameLayout frameLayout;
        switch (this.l) {
            case 0:
                PlayerTvFragment playerTvFragment = this.m;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                Dr0 dr0Z = AbstractC1459f50.z();
                Dr0[] dr0ArrValues = Dr0.values();
                Dr0 dr0 = dr0ArrValues[(dr0Z.ordinal() + 1) % dr0ArrValues.length];
                AbstractC1474fG.j(dr0, "value");
                Cr0.p.e(Integer.valueOf(dr0.m));
                C0560Kq c0560Kq = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq);
                C0560Kq c0560Kq2 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq2);
                ((PlayerView) c0560Kq.p).setControllerShowTimeoutMs(((PlayerView) c0560Kq2.p).getControllerShowTimeoutMs());
                Toast.makeText(playerTvFragment.Q(), playerTvFragment.Q().getString(AbstractC1459f50.z().l), 0).show();
                C0560Kq c0560Kq3 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq3);
                ((PlayerView) c0560Kq3.p).setResizeMode(AbstractC1459f50.z().m);
                break;
            case 1:
                PlayerTvFragment playerTvFragment2 = this.m;
                AbstractC1474fG.j(playerTvFragment2, "this$0");
                PlayerTvFragment.h1 = R.id.btn_categories;
                playerTvFragment2.C0();
                break;
            case 2:
                PlayerTvFragment playerTvFragment3 = this.m;
                AbstractC1474fG.j(playerTvFragment3, "this$0");
                PlayerTvFragment.h1 = R.id.btn_prev_channel;
                AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment3.q()), null, 0, new C1745i10(playerTvFragment3, null), 3);
                break;
            case 3:
                PlayerTvFragment playerTvFragment4 = this.m;
                AbstractC1474fG.j(playerTvFragment4, "this$0");
                PlayerTvFragment.h1 = R.id.btn_next_channel;
                AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment4.q()), null, 0, new C1841j10(playerTvFragment4, null), 3);
                break;
            case 4:
                PlayerTvFragment playerTvFragment5 = this.m;
                AbstractC1474fG.j(playerTvFragment5, "this$0");
                C0560Kq c0560Kq4 = playerTvFragment5.z0;
                AbstractC1474fG.g(c0560Kq4);
                PlayerView playerView = (PlayerView) c0560Kq4.p;
                AbstractC1474fG.i(playerView, "pvPlayer");
                PlayerTvFragment.h1 = ((ImageView) PlayerTvFragment.j0(playerView).q).getId();
                C0560Kq c0560Kq5 = playerTvFragment5.z0;
                AbstractC1474fG.g(c0560Kq5);
                C0560Kq c0560Kq6 = playerTvFragment5.z0;
                AbstractC1474fG.g(c0560Kq6);
                ((PlayerView) c0560Kq5.p).setControllerShowTimeoutMs(((PlayerView) c0560Kq6.p).getControllerShowTimeoutMs());
                C0560Kq c0560Kq7 = playerTvFragment5.z0;
                AbstractC1474fG.g(c0560Kq7);
                PlayerSettingsTvView playerSettingsTvView = (PlayerSettingsTvView) c0560Kq7.q;
                playerSettingsTvView.setVisibility(0);
                playerSettingsTvView.o(EnumC2035l00.l);
                RunnableC3102w1 runnableC3102w1 = playerSettingsTvView.D;
                playerSettingsTvView.removeCallbacks(runnableC3102w1);
                playerSettingsTvView.n();
                playerSettingsTvView.m();
                if (AbstractC2520q00.d) {
                    playerSettingsTvView.postDelayed(runnableC3102w1, 2000L);
                }
                break;
            default:
                PlayerTvFragment playerTvFragment6 = this.m;
                playerTvFragment6.f0();
                C0560Kq c0560Kq8 = playerTvFragment6.z0;
                if (c0560Kq8 != null && (lw = (LW) c0560Kq8.f370o) != null && (frameLayout = lw.m) != null) {
                    frameLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new W00(playerTvFragment6, 2)).start();
                    break;
                }
                break;
        }
    }
}
