package o;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.widget.EditText;
import com.skidush.clonex.activities.main.MainTvActivity;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UM implements DialogInterface.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ UM(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.m;
        switch (this.l) {
            case 0:
                int i2 = MainTvActivity.Q;
                MainTvActivity mainTvActivity = (MainTvActivity) obj;
                AbstractC1474fG.j(mainTvActivity, "this$0");
                mainTvActivity.finish();
                return;
            case 1:
                SY sy = (SY) obj;
                AbstractC1474fG.j(sy, "this$0");
                EditText editText = sy.C0;
                if (editText == null) {
                    AbstractC1474fG.U("pinEditText");
                    throw null;
                }
                sy.B0.b(editText.getText().toString());
                return;
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                AbstractC1474fG.j(dialogInterface, "dialog");
                dialogInterface.dismiss();
                playerTvFragment.n0 = false;
                CountDownTimer countDownTimer = playerTvFragment.m0;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                playerTvFragment.m0 = new CountDownTimerC1254d00(1, playerTvFragment).start();
                return;
        }
    }
}
