package o;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Cw0 extends Bw0 {
    public TF m;

    public Cw0(Kw0 kw0, WindowInsets windowInsets) {
        super(kw0, windowInsets);
        this.m = null;
    }

    @Override // o.Hw0
    public Kw0 b() {
        return Kw0.g(null, this.c.consumeStableInsets());
    }

    @Override // o.Hw0
    public Kw0 c() {
        return Kw0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // o.Hw0
    public final TF h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = TF.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // o.Hw0
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // o.Hw0
    public void q(TF tf) {
        this.m = tf;
    }
}
