package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Aw0 {
    public final Kw0 a;
    public TF[] b;

    public Aw0() {
        this(new Kw0());
    }

    public final void a() {
        TF[] tfArr = this.b;
        if (tfArr != null) {
            TF tfF = tfArr[Jp0.x(1)];
            TF tfF2 = this.b[Jp0.x(2)];
            Kw0 kw0 = this.a;
            if (tfF2 == null) {
                tfF2 = kw0.a.f(2);
            }
            if (tfF == null) {
                tfF = kw0.a.f(1);
            }
            g(TF.a(tfF, tfF2));
            TF tf = this.b[Jp0.x(16)];
            if (tf != null) {
                f(tf);
            }
            TF tf2 = this.b[Jp0.x(32)];
            if (tf2 != null) {
                d(tf2);
            }
            TF tf3 = this.b[Jp0.x(64)];
            if (tf3 != null) {
                h(tf3);
            }
        }
    }

    public abstract Kw0 b();

    public void c(int i, TF tf) {
        if (this.b == null) {
            this.b = new TF[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[Jp0.x(i2)] = tf;
            }
        }
    }

    public abstract void e(TF tf);

    public abstract void g(TF tf);

    public Aw0(Kw0 kw0) {
        this.a = kw0;
    }

    public void d(TF tf) {
    }

    public void f(TF tf) {
    }

    public void h(TF tf) {
    }
}
