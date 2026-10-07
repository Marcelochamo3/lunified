package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class Gw0 extends Fw0 {
    public static final Kw0 q = Kw0.g(null, WindowInsets.CONSUMED);

    public Gw0(Kw0 kw0, WindowInsets windowInsets) {
        super(kw0, windowInsets);
    }

    @Override // o.Bw0, o.Hw0
    public TF f(int i) {
        return TF.c(this.c.getInsets(Jw0.a(i)));
    }

    @Override // o.Bw0, o.Hw0
    public final void d(View view) {
    }
}
