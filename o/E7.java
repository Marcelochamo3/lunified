package o;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class E7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public E7(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        C2621r3 c2621r3 = C2621r3.a;
        float fD = c2621r3.d(backEvent);
        float fE = c2621r3.e(backEvent);
        float fB = c2621r3.b(backEvent);
        int iC = c2621r3.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
