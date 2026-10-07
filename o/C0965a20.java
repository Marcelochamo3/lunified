package o;

/* JADX INFO: renamed from: o.a20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965a20 extends AbstractC0825Uw {
    public final Ej0 n;

    public C0965a20(Fj0 fj0) {
        super(fj0);
        this.n = new Ej0();
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        Fj0 fj0 = this.m;
        Dj0 dj0G = fj0.g(i, dj0, z);
        if (fj0.n(dj0G.n, this.n, 0L).a()) {
            dj0G.j(dj0.l, dj0.m, dj0.n, dj0.f219o, dj0.p, U1.r, true);
        } else {
            dj0G.q = true;
        }
        return dj0G;
    }
}
