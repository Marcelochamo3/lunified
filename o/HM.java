package o;

import android.content.DialogInterface;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HM implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ HM(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.m;
        switch (this.l) {
            case 0:
                int i = MainMobileActivity.Q;
                MainMobileActivity mainMobileActivity = (MainMobileActivity) obj;
                AbstractC1474fG.j(mainMobileActivity, "this$0");
                mainMobileActivity.N = null;
                break;
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                playerTvFragment.u0 = null;
                break;
        }
    }
}
