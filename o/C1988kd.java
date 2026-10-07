package o;

/* JADX INFO: renamed from: o.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1988kd extends CH implements InterfaceC1890jd {
    public final InterfaceC2086ld p;

    public C1988kd(JH jh) {
        this.p = jh;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        q((Throwable) obj);
        return C2985uq0.a;
    }

    @Override // o.InterfaceC1890jd
    public final boolean g(Throwable th) {
        return p().D(th);
    }

    @Override // o.EH
    public final void q(Throwable th) {
        ((JH) this.p).z(p());
    }
}
