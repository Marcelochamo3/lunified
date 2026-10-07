package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: o.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC3364ym implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0348Cm l;

    public DialogInterfaceOnCancelListenerC3364ym(DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm) {
        this.l = dialogInterfaceOnCancelListenerC0348Cm;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = this.l;
        Dialog dialog = dialogInterfaceOnCancelListenerC0348Cm.w0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0348Cm.onCancel(dialog);
        }
    }
}
