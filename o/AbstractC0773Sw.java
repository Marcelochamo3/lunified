package o;

/* JADX INFO: renamed from: o.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773Sw implements InterfaceC1991ke0 {
    public final InterfaceC1991ke0 l;

    public AbstractC0773Sw(InterfaceC1991ke0 interfaceC1991ke0) {
        AbstractC1474fG.j(interfaceC1991ke0, "delegate");
        this.l = interfaceC1991ke0;
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.l.close();
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public void flush() {
        this.l.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.l + ')';
    }

    @Override // o.InterfaceC1991ke0
    public void w(E9 e9, long j) {
        AbstractC1474fG.j(e9, "source");
        this.l.w(e9, j);
    }
}
