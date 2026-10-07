package o;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Fw0 extends Dw0 {
    public TF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TF f267o;
    public TF p;

    public Fw0(Kw0 kw0, WindowInsets windowInsets) {
        super(kw0, windowInsets);
        this.n = null;
        this.f267o = null;
        this.p = null;
    }

    @Override // o.Hw0
    public TF g() {
        if (this.f267o == null) {
            this.f267o = TF.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.f267o;
    }

    @Override // o.Hw0
    public TF i() {
        if (this.n == null) {
            this.n = TF.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // o.Hw0
    public TF k() {
        if (this.p == null) {
            this.p = TF.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // o.Bw0, o.Hw0
    public Kw0 l(int i, int i2, int i3, int i4) {
        return Kw0.g(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // o.Cw0, o.Hw0
    public void q(TF tf) {
    }
}
