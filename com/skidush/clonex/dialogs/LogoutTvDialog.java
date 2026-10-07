package com.skidush.clonex.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.skidush.clonex.activities.main.MainTvActivity;
import com.skidush.clonex.dialogs.LogoutTvDialog;
import o.AbstractC1474fG;
import o.DialogInterfaceOnCancelListenerC0348Cm;

/* JADX INFO: loaded from: classes.dex */
public final class LogoutTvDialog extends DialogInterfaceOnCancelListenerC0348Cm {
    @Override // o.DialogInterfaceOnCancelListenerC0348Cm
    public final Dialog X() {
        final int i = 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(Q()).setTitle("Cerrar Sesión").setMessage("¿Estás seguro de que deseas cerrar sesión?").setPositiveButton("Sí", new DialogInterface.OnClickListener(this) { // from class: o.YL
            public final /* synthetic */ LogoutTvDialog m;

            {
                this.m = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        LogoutTvDialog logoutTvDialog = this.m;
                        AbstractC1474fG.j(logoutTvDialog, "this$0");
                        AbstractActivityC1540fx abstractActivityC1540fxH = logoutTvDialog.h();
                        MainTvActivity mainTvActivity = abstractActivityC1540fxH instanceof MainTvActivity ? (MainTvActivity) abstractActivityC1540fxH : null;
                        if (mainTvActivity != null) {
                            Toast.makeText(mainTvActivity, "Cerrando sesión...", 0).show();
                            AbstractC1376eG.w(AbstractC1459f50.y(mainTvActivity), AbstractC1910jn.b, 0, new YM(mainTvActivity, null), 2);
                        }
                        break;
                    default:
                        LogoutTvDialog logoutTvDialog2 = this.m;
                        AbstractC1474fG.j(logoutTvDialog2, "this$0");
                        logoutTvDialog2.W(false, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        AlertDialog alertDialogCreate = positiveButton.setNegativeButton("No", new DialogInterface.OnClickListener(this) { // from class: o.YL
            public final /* synthetic */ LogoutTvDialog m;

            {
                this.m = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                switch (i2) {
                    case 0:
                        LogoutTvDialog logoutTvDialog = this.m;
                        AbstractC1474fG.j(logoutTvDialog, "this$0");
                        AbstractActivityC1540fx abstractActivityC1540fxH = logoutTvDialog.h();
                        MainTvActivity mainTvActivity = abstractActivityC1540fxH instanceof MainTvActivity ? (MainTvActivity) abstractActivityC1540fxH : null;
                        if (mainTvActivity != null) {
                            Toast.makeText(mainTvActivity, "Cerrando sesión...", 0).show();
                            AbstractC1376eG.w(AbstractC1459f50.y(mainTvActivity), AbstractC1910jn.b, 0, new YM(mainTvActivity, null), 2);
                        }
                        break;
                    default:
                        LogoutTvDialog logoutTvDialog2 = this.m;
                        AbstractC1474fG.j(logoutTvDialog2, "this$0");
                        logoutTvDialog2.W(false, false);
                        break;
                }
            }
        }).create();
        AbstractC1474fG.i(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
