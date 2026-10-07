package o;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class Vs0 implements Us0, DisplayManager.DisplayListener {
    public final DisplayManager l;
    public C2278nc m;

    public Vs0(DisplayManager displayManager) {
        this.l = displayManager;
    }

    @Override // o.Us0
    public final void a() {
        this.l.unregisterDisplayListener(this);
        this.m = null;
    }

    @Override // o.Us0
    public final void f(C2278nc c2278nc) {
        this.m = c2278nc;
        Handler handlerN = Lr0.n(null);
        DisplayManager displayManager = this.l;
        displayManager.registerDisplayListener(this, handlerN);
        c2278nc.h(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C2278nc c2278nc = this.m;
        if (c2278nc == null || i != 0) {
            return;
        }
        c2278nc.h(this.l.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
