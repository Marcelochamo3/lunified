package o;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class Mw0 extends Lw0 {
    @Override // o.Nr0
    public final boolean q() {
        return (this.h.getDecorView().getSystemUiVisibility() & C1672hI.a.e) != 0;
    }

    @Override // o.Nr0
    public final void z(boolean z) {
        if (!z) {
            M(C1672hI.a.e);
            return;
        }
        Window window = this.h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        L(C1672hI.a.e);
    }
}
