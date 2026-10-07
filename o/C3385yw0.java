package o;

import android.view.WindowInsets;

/* JADX INFO: renamed from: o.yw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3385yw0 extends Aw0 {
    public final WindowInsets.Builder c;

    public C3385yw0() {
        this.c = CO.f();
    }

    @Override // o.Aw0
    public Kw0 b() {
        a();
        Kw0 kw0G = Kw0.g(null, this.c.build());
        kw0G.a.o(this.b);
        return kw0G;
    }

    @Override // o.Aw0
    public void d(TF tf) {
        this.c.setMandatorySystemGestureInsets(tf.d());
    }

    @Override // o.Aw0
    public void e(TF tf) {
        this.c.setStableInsets(tf.d());
    }

    @Override // o.Aw0
    public void f(TF tf) {
        this.c.setSystemGestureInsets(tf.d());
    }

    @Override // o.Aw0
    public void g(TF tf) {
        this.c.setSystemWindowInsets(tf.d());
    }

    @Override // o.Aw0
    public void h(TF tf) {
        this.c.setTappableElementInsets(tf.d());
    }

    public C3385yw0(Kw0 kw0) {
        WindowInsets.Builder builderF;
        super(kw0);
        WindowInsets windowInsetsF = kw0.f();
        if (windowInsetsF != null) {
            builderF = CO.g(windowInsetsF);
        } else {
            builderF = CO.f();
        }
        this.c = builderF;
    }
}
