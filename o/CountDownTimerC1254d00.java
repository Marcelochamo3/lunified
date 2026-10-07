package o;

import android.app.AlertDialog;
import android.os.CountDownTimer;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.d00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CountDownTimerC1254d00 extends CountDownTimer {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountDownTimerC1254d00(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        super(14400000L, 1000L);
        this.a = i;
        this.b = abstractComponentCallbacksC1247cx;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.b;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) abstractComponentCallbacksC1247cx;
                if (!playerMobileFragment.n0) {
                    playerMobileFragment.n0 = true;
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(playerMobileFragment.Q()).setTitle("¿Estás viendo?").setMessage("Has usado la app por más de 4 horas. Si no haces clic en cancelar, la app se cerrará en 50 segundos.").setCancelable(false).setPositiveButton("Cancelar", new EZ(playerMobileFragment, i2)).create();
                    alertDialogCreate.show();
                    WJ wjY = AbstractC1459f50.y(playerMobileFragment);
                    C3362yl c3362yl = AbstractC1910jn.a;
                    AbstractC1376eG.w(wjY, FM.a, 0, new C0961a00(alertDialogCreate, playerMobileFragment, null), 2);
                    break;
                }
                break;
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) abstractComponentCallbacksC1247cx;
                if (!playerTvFragment.n0) {
                    playerTvFragment.n0 = true;
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(playerTvFragment.Q()).setTitle("¿Estás viendo?").setMessage("Has usado la app por más de 4 horas. Si no haces clic en cancelar, la app se cerrará en 50 segundos.").setCancelable(false).setPositiveButton("Cancelar", new UM(i, playerTvFragment)).create();
                    alertDialogCreate2.show();
                    WJ wjY2 = AbstractC1459f50.y(playerTvFragment);
                    C3362yl c3362yl2 = AbstractC1910jn.a;
                    AbstractC1376eG.w(wjY2, FM.a, 0, new C3006v10(alertDialogCreate2, playerTvFragment, null), 2);
                    break;
                }
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = this.a;
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }
}
