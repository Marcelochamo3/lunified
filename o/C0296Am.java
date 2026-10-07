package o;

import android.util.Log;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: renamed from: o.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0296Am implements DV {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0348Cm l;

    public C0296Am(DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm) {
        this.l = dialogInterfaceOnCancelListenerC0348Cm;
    }

    @Override // o.DV
    public final void b(Object obj) {
        if (((InterfaceC1283dK) obj) != null) {
            DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = this.l;
            if (dialogInterfaceOnCancelListenerC0348Cm.s0) {
                View viewR = dialogInterfaceOnCancelListenerC0348Cm.R();
                if (viewR.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0348Cm.w0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Objects.toString(dialogInterfaceOnCancelListenerC0348Cm.w0);
                    }
                    dialogInterfaceOnCancelListenerC0348Cm.w0.setContentView(viewR);
                }
            }
        }
    }
}
