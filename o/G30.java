package o;

/* JADX INFO: loaded from: classes.dex */
public final class G30 implements BP {
    public final InterfaceC2486pj a;
    public final C2278nc b;
    public InterfaceC0454Go c;
    public C0622Nb d;
    public final int e;

    public G30(InterfaceC2486pj interfaceC2486pj, InterfaceC0380Ds interfaceC0380Ds) {
        C2278nc c2278nc = new C2278nc(22, interfaceC0380Ds);
        Na0 na0 = new Na0(15);
        C0622Nb c0622Nb = new C0622Nb(10);
        this.a = interfaceC2486pj;
        this.b = c2278nc;
        this.c = na0;
        this.d = c0622Nb;
        this.e = 1048576;
    }

    @Override // o.BP
    public final BP a(InterfaceC0454Go interfaceC0454Go) {
        AbstractC0397Ej.e(interfaceC0454Go, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = interfaceC0454Go;
        return this;
    }

    @Override // o.BP
    public final BP b(C0622Nb c0622Nb) {
        AbstractC0397Ej.e(c0622Nb, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = c0622Nb;
        return this;
    }

    @Override // o.BP
    public final AbstractC1464f8 c(C1971kP c1971kP) {
        c1971kP.m.getClass();
        return new H30(c1971kP, this.a, this.b, this.c.d(c1971kP), this.d, this.e);
    }
}
