package o;

import android.content.DialogInterface;
import android.widget.Toast;
import com.skidush.clonex.activities.main.MainMobileActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class IM implements DialogInterface.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ MainMobileActivity m;

    public /* synthetic */ IM(MainMobileActivity mainMobileActivity, int i) {
        this.l = i;
        this.m = mainMobileActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainMobileActivity mainMobileActivity = this.m;
        switch (this.l) {
            case 0:
                int i2 = MainMobileActivity.Q;
                AbstractC1474fG.j(mainMobileActivity, "this$0");
                mainMobileActivity.finish();
                break;
            default:
                int i3 = MainMobileActivity.Q;
                AbstractC1474fG.j(mainMobileActivity, "this$0");
                Toast.makeText(mainMobileActivity, "Cerrando sesión...", 0).show();
                AbstractC1376eG.w(AbstractC1459f50.y(mainMobileActivity), AbstractC1910jn.b, 0, new MM(mainMobileActivity, null), 2);
                break;
        }
    }
}
