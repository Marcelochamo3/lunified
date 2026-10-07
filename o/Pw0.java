package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class Pw0 {
    public final Nr0 a;

    public Pw0(WindowInsetsController windowInsetsController) {
        L80 l80 = new L80();
        Je0 je0 = new Je0(null);
        je0.n = windowInsetsController;
        l80.l = je0;
        this.a = new Ow0(windowInsetsController, l80);
    }

    public Pw0(Window window, View view) {
        L80 l80 = new L80(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Ow0 ow0 = new Ow0(window.getInsetsController(), l80);
            ow0.j = window;
            this.a = ow0;
        } else if (i >= 26) {
            this.a = new Nw0(window, l80);
        } else if (i >= 23) {
            this.a = new Mw0(window, l80);
        } else {
            this.a = new Lw0(window, l80);
        }
    }
}
