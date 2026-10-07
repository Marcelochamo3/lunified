package o;

import android.view.ViewGroup;

/* JADX INFO: renamed from: o.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312Bc extends Dm0 {
    public boolean a = false;
    public final ViewGroup b;

    public C0312Bc(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // o.Dm0, o.Bm0
    public final void a(Cm0 cm0) {
        Ou0.F(this.b, false);
        this.a = true;
    }

    @Override // o.Dm0, o.Bm0
    public final void b() {
        Ou0.F(this.b, false);
    }

    @Override // o.Dm0, o.Bm0
    public final void c() {
        Ou0.F(this.b, true);
    }

    @Override // o.Dm0, o.Bm0
    public final void f(Cm0 cm0) {
        if (!this.a) {
            Ou0.F(this.b, false);
        }
        cm0.E(this);
    }
}
