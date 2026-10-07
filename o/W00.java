package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W00 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ PlayerTvFragment m;

    public /* synthetic */ W00(PlayerTvFragment playerTvFragment, int i) {
        this.l = i;
        this.m = playerTvFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        LW lw;
        LW lw2;
        switch (this.l) {
            case 0:
                PlayerTvFragment playerTvFragment = this.m;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                C0560Kq c0560Kq = playerTvFragment.z0;
                if (c0560Kq != null && ((PlayerView) c0560Kq.p).b()) {
                    C0560Kq c0560Kq2 = playerTvFragment.z0;
                    AbstractC1474fG.g(c0560Kq2);
                    PlayerView playerView = (PlayerView) c0560Kq2.p;
                    AbstractC1474fG.i(playerView, "pvPlayer");
                    C1215ch c1215chJ0 = PlayerTvFragment.j0(playerView);
                    ConstraintLayout constraintLayout = (ConstraintLayout) c1215chJ0.m;
                    AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                    C3421zK c3421zK = new C3421zK();
                    c3421zK.add(Integer.valueOf(PlayerTvFragment.h1));
                    c3421zK.add(Integer.valueOf(R.id.exo_play_pause));
                    if (AbstractC1899jh0.U(playerTvFragment.i0().a, "tv-", false) || AbstractC1899jh0.U(playerTvFragment.i0().a, "claro-", false) || AbstractC1899jh0.U(playerTvFragment.i0().a, "claroar-", false)) {
                        c3421zK.add(Integer.valueOf(R.id.btn_categories));
                        c3421zK.add(Integer.valueOf(R.id.btn_prev_channel));
                        c3421zK.add(Integer.valueOf(R.id.btn_next_channel));
                    }
                    c3421zK.add(Integer.valueOf(((ImageView) c1215chJ0.q).getId()));
                    C1634gv c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(AbstractC0911Ye.X(AbstractC2506pt.h(c3421zK))), new io.sentry.android.replay.v(15, constraintLayout)));
                    while (true) {
                        if (c1634gv.hasNext()) {
                            next = c1634gv.next();
                            View view = (View) next;
                            if (view.getVisibility() != 0 || !view.isShown() || !view.isFocusable()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    View view2 = (View) next;
                    if (view2 != null && !view2.hasFocus()) {
                        view2.requestFocus();
                    }
                }
                C0560Kq c0560Kq3 = playerTvFragment.z0;
                if (c0560Kq3 != null) {
                    ((PlayerView) c0560Kq3.p).post(new W00(playerTvFragment, 1));
                    break;
                }
                break;
            case 1:
                PlayerTvFragment playerTvFragment2 = this.m;
                AbstractC1474fG.j(playerTvFragment2, "this$0");
                playerTvFragment2.x0 = false;
                break;
            case 2:
                PlayerTvFragment playerTvFragment3 = this.m;
                AbstractC1474fG.j(playerTvFragment3, "this$0");
                C0560Kq c0560Kq4 = playerTvFragment3.z0;
                FrameLayout frameLayout = null;
                FrameLayout frameLayout2 = (c0560Kq4 == null || (lw2 = (LW) c0560Kq4.f370o) == null) ? null : lw2.m;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                C0560Kq c0560Kq5 = playerTvFragment3.z0;
                if (c0560Kq5 != null && (lw = (LW) c0560Kq5.f370o) != null) {
                    frameLayout = lw.m;
                }
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f);
                }
                playerTvFragment3.S0 = false;
                break;
            default:
                C0560Kq c0560Kq6 = this.m.z0;
                if (c0560Kq6 != null) {
                    ((LW) c0560Kq6.f370o).f379o.requestFocus();
                    break;
                }
                break;
        }
    }
}
