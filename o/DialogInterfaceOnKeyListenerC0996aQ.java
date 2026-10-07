package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: o.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0996aQ implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC2555qQ {
    public ZP l;
    public DialogInterfaceC2619r2 m;
    public CK n;

    @Override // o.InterfaceC2555qQ
    public final void a(ZP zp, boolean z) {
        DialogInterfaceC2619r2 dialogInterfaceC2619r2;
        if ((z || zp == this.l) && (dialogInterfaceC2619r2 = this.m) != null) {
            dialogInterfaceC2619r2.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CK ck = this.n;
        if (ck.q == null) {
            ck.q = new BK(ck);
        }
        this.l.q(ck.q.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.n.a(this.l, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ZP zp = this.l;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.m.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.m.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                zp.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return zp.performShortcut(i, keyEvent, 0);
    }

    @Override // o.InterfaceC2555qQ
    public final boolean u(ZP zp) {
        return false;
    }
}
