package o;

/* JADX INFO: loaded from: classes.dex */
public final class Mj0 extends R90 implements Runnable {
    public final long p;

    public Mj0(long j, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh, interfaceC0473Hh.g());
        this.p = j;
    }

    @Override // o.AbstractC2518q, o.JH
    public final String Z() {
        return super.Z() + "(timeMillis=" + this.p + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1376eG.t(this.n);
        z(new Ij0("Timed out waiting for " + this.p + " ms", this));
    }
}
