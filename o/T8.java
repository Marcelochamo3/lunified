package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class T8 implements InterfaceC1991ke0 {
    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return Hj0.d;
    }

    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) throws EOFException {
        AbstractC1474fG.j(e9, "source");
        e9.skip(j);
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
    }
}
