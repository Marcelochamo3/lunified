package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0799Tw implements InterfaceC2091lf0 {
    public final InterfaceC2091lf0 l;

    public AbstractC0799Tw(InterfaceC2091lf0 interfaceC2091lf0) {
        AbstractC1474fG.j(interfaceC2091lf0, "delegate");
        this.l = interfaceC2091lf0;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.l.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.l + ')';
    }

    @Override // o.InterfaceC2091lf0
    public long y(E9 e9, long j) {
        AbstractC1474fG.j(e9, "sink");
        return this.l.y(e9, j);
    }
}
