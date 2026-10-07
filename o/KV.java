package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class KV extends AbstractC2051l80 {
    public final AbstractC2051l80 m;
    public final C3111w50 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IOException f361o;

    public KV(AbstractC2051l80 abstractC2051l80) {
        this.m = abstractC2051l80;
        this.n = Nr0.g(new C3340ya(this, abstractC2051l80.p()));
    }

    @Override // o.AbstractC2051l80, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // o.AbstractC2051l80
    public final long i() {
        return this.m.i();
    }

    @Override // o.AbstractC2051l80
    public final TP l() {
        return this.m.l();
    }

    @Override // o.AbstractC2051l80
    public final N9 p() {
        return this.n;
    }
}
