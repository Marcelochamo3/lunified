package o;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class Lw0 extends Nr0 {
    public final Window h;
    public final L80 i;

    public Lw0(Window window, L80 l80) {
        this.h = window;
        this.i = l80;
    }

    @Override // o.Nr0
    public final void A() {
        M(C1672hI.a.g);
        L(C1672hI.a.f);
    }

    @Override // o.Nr0
    public final void C(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    M(4);
                    this.h.clearFlags(1024);
                } else if (i2 == 2) {
                    M(2);
                } else if (i2 == 8) {
                    ((L80) this.i.l).p();
                }
            }
        }
    }

    public final void L(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void M(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // o.Nr0
    public final void o() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    L(4);
                } else if (i == 2) {
                    L(2);
                } else if (i == 8) {
                    ((L80) this.i.l).o();
                }
            }
        }
    }
}
