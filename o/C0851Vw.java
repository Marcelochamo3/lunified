package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851Vw extends Hj0 {
    public Hj0 e;

    public C0851Vw(Hj0 hj0) {
        AbstractC1474fG.j(hj0, "delegate");
        this.e = hj0;
    }

    @Override // o.Hj0
    public final Hj0 a() {
        return this.e.a();
    }

    @Override // o.Hj0
    public final Hj0 b() {
        return this.e.b();
    }

    @Override // o.Hj0
    public final long c() {
        return this.e.c();
    }

    @Override // o.Hj0
    public final Hj0 d(long j) {
        return this.e.d(j);
    }

    @Override // o.Hj0
    public final boolean e() {
        return this.e.e();
    }

    @Override // o.Hj0
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // o.Hj0
    public final Hj0 g(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }
}
