package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.skidush.clonex.R;
import com.skidush.clonex.SettingsActivity;
import com.skidush.clonex.activities.main.MainMobileActivity;

/* JADX INFO: loaded from: classes.dex */
public final class OM extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ MainMobileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OM(MainMobileActivity mainMobileActivity, int i) {
        super(0);
        this.m = i;
        this.n = mainMobileActivity;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        C2985uq0 c2985uq0 = C2985uq0.a;
        MainMobileActivity mainMobileActivity = this.n;
        switch (this.m) {
            case 0:
                mainMobileActivity.startActivity(new Intent(mainMobileActivity, (Class<?>) SettingsActivity.class));
                break;
            default:
                int i = MainMobileActivity.Q;
                mainMobileActivity.getClass();
                new AlertDialog.Builder(mainMobileActivity).setTitle(R.string.main_menu_logout).setMessage("¿Estás seguro de que deseas cerrar sesión?").setPositiveButton("Sí", new IM(mainMobileActivity, 1)).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                break;
        }
        return c2985uq0;
    }
}
