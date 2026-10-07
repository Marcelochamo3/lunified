package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: o.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC3461zm implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0348Cm l;

    public DialogInterfaceOnDismissListenerC3461zm(DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm) {
        this.l = dialogInterfaceOnCancelListenerC0348Cm;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = this.l;
        Dialog dialog = dialogInterfaceOnCancelListenerC0348Cm.w0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0348Cm.onDismiss(dialog);
        }
    }
}
