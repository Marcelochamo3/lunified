package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0440Ga implements InterfaceC2091lf0 {
    public boolean l;
    public final /* synthetic */ N9 m;
    public final /* synthetic */ C0336Ca n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M9 f280o;

    public C0440Ga(N9 n9, C0336Ca c0336Ca, C3014v50 c3014v50) {
        this.m = n9;
        this.n = c0336Ca;
        this.f280o = c3014v50;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.m.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.l && !Mr0.h(this, TimeUnit.MILLISECONDS)) {
            this.l = true;
            this.n.a();
        }
        this.m.close();
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        AbstractC1474fG.j(e9, "sink");
        try {
            long jY = this.m.y(e9, j);
            M9 m9 = this.f280o;
            if (jY != -1) {
                e9.t(m9.b(), e9.m - jY, jY);
                m9.H();
                return jY;
            }
            if (!this.l) {
                this.l = true;
                m9.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.l) {
                this.l = true;
                this.n.a();
            }
            throw e;
        }
    }
}
