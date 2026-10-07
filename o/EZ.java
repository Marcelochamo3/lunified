package o;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ PlayerMobileFragment m;

    public /* synthetic */ EZ(PlayerMobileFragment playerMobileFragment, int i) {
        this.l = i;
        this.m = playerMobileFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.l) {
            case 0:
                PlayerMobileFragment playerMobileFragment = this.m;
                AbstractC1474fG.j(playerMobileFragment, "this$0");
                AbstractC1474fG.j(dialogInterface, "dialog");
                dialogInterface.dismiss();
                playerMobileFragment.n0 = false;
                CountDownTimer countDownTimer = playerMobileFragment.m0;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                playerMobileFragment.m0 = new CountDownTimerC1254d00(0, playerMobileFragment).start();
                return;
            default:
                PlayerMobileFragment playerMobileFragment2 = this.m;
                AbstractC1474fG.j(playerMobileFragment2, "this$0");
                Ds0 ds0 = (Ds0) playerMobileFragment2.A0.get(i);
                if (playerMobileFragment2.n0()) {
                    playerMobileFragment2.r0();
                }
                playerMobileFragment2.s0();
                playerMobileFragment2.S0 = SystemClock.elapsedRealtime() + 10000;
                Z10 z10K0 = playerMobileFragment2.k0();
                C1042as c1042as = playerMobileFragment2.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                long jC = c1042as.C();
                C1042as c1042as2 = playerMobileFragment2.y0;
                if (c1042as2 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                z10K0.k(jC, c1042as2.H());
                Z10 z10K1 = playerMobileFragment2.k0();
                C1042as c1042as3 = playerMobileFragment2.y0;
                if (c1042as3 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                z10K1.g(ds0, Long.valueOf(U9.f(c1042as3.C(), 0L)));
                Toast.makeText(playerMobileFragment2.Q(), "Cambiando a " + ds0.m, 0).show();
                return;
        }
    }
}
