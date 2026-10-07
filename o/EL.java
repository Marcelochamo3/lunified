package o;

import android.app.Dialog;
import android.view.View;
import com.skidush.clonex.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EL implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ LoginActivity m;

    public /* synthetic */ EL(LoginActivity loginActivity, int i) {
        this.l = i;
        this.m = loginActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LoginActivity loginActivity = this.m;
        switch (this.l) {
            case 0:
                int i = LoginActivity.Z;
                AbstractC1474fG.j(loginActivity, "this$0");
                Dialog dialog = loginActivity.U;
                if (dialog != null) {
                    dialog.dismiss();
                }
                loginActivity.U = null;
                loginActivity.M();
                break;
            case 1:
                int i2 = LoginActivity.Z;
                AbstractC1474fG.j(loginActivity, "this$0");
                loginActivity.I();
                break;
            default:
                int i3 = LoginActivity.Z;
                AbstractC1474fG.j(loginActivity, "this$0");
                loginActivity.M();
                break;
        }
    }
}
