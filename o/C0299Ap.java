package o;

import android.os.Build;

/* JADX INFO: renamed from: o.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0299Ap extends Pu0 {
    public final /* synthetic */ C0325Bp f;

    public C0299Ap(C0325Bp c0325Bp) {
        this.f = c0325Bp;
    }

    @Override // o.Pu0
    public final void o(Throwable th) {
        this.f.a.d(th);
    }

    @Override // o.Pu0
    public final void p(C1583gR c1583gR) {
        C0325Bp c0325Bp = this.f;
        c0325Bp.c = c1583gR;
        C1583gR c1583gR2 = c0325Bp.c;
        C0455Gp c0455Gp = c0325Bp.a;
        c0325Bp.b = new Na0(c1583gR2, c0455Gp.g, c0455Gp.i, Build.VERSION.SDK_INT >= 34 ? AbstractC0610Mp.a() : zy0.t());
        c0325Bp.a.e();
    }
}
