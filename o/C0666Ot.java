package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: o.Ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666Ot extends AbstractC0773Sw {
    public final InterfaceC0412Ey m;
    public boolean n;

    public C0666Ot(C1948k6 c1948k6, InterfaceC0412Ey interfaceC0412Ey) {
        super(c1948k6);
        this.m = interfaceC0412Ey;
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.n = true;
            this.m.b(e);
        }
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
        if (this.n) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.n = true;
            this.m.b(e);
        }
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0
    public final void w(E9 e9, long j) throws EOFException {
        AbstractC1474fG.j(e9, "source");
        if (this.n) {
            e9.skip(j);
            return;
        }
        try {
            super.w(e9, j);
        } catch (IOException e) {
            this.n = true;
            this.m.b(e);
        }
    }
}
