package o;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class Ow0 extends Nr0 {
    public final WindowInsetsController h;
    public final L80 i;
    public Window j;

    public Ow0(WindowInsetsController windowInsetsController, L80 l80) {
        this.h = windowInsetsController;
        this.i = l80;
    }

    @Override // o.Nr0
    public final void A() {
        this.h.setSystemBarsBehavior(2);
    }

    @Override // o.Nr0
    public final void C(int i) {
        if ((i & 8) != 0) {
            ((L80) this.i.l).p();
        }
        this.h.show(i & (-9));
    }

    @Override // o.Nr0
    public final void o() {
        this.h.hide(7);
    }

    @Override // o.Nr0
    public final boolean q() {
        this.h.setSystemBarsAppearance(0, 0);
        return (this.h.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // o.Nr0
    public final void y(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.h.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.h.setSystemBarsAppearance(0, 16);
    }

    @Override // o.Nr0
    public final void z(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | C1672hI.a.e);
            }
            this.h.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.h.setSystemBarsAppearance(0, 8);
    }
}
