package o;

/* JADX INFO: renamed from: o.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310Ba extends AbstractC0773Sw {
    public final /* synthetic */ C0362Da m;
    public final /* synthetic */ C0336Ca n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310Ba(C0362Da c0362Da, C0336Ca c0336Ca, InterfaceC1991ke0 interfaceC1991ke0) {
        super(interfaceC1991ke0);
        this.m = c0362Da;
        this.n = c0336Ca;
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0362Da c0362Da = this.m;
        C0336Ca c0336Ca = this.n;
        synchronized (c0362Da) {
            if (c0336Ca.d) {
                return;
            }
            c0336Ca.d = true;
            super.close();
            this.n.a.i();
        }
    }
}
