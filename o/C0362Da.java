package o;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: renamed from: o.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362Da implements Closeable, Flushable {
    public final C1227cn l;

    public C0362Da(File file) {
        this.l = new C1227cn(file, C3454zi0.i);
    }

    public final void a(C1951k70 c1951k70) {
        AbstractC1474fG.j(c1951k70, "request");
        C1227cn c1227cn = this.l;
        String strL = AP.l(c1951k70.a);
        synchronized (c1227cn) {
            AbstractC1474fG.j(strL, "key");
            c1227cn.p();
            c1227cn.a();
            C1227cn.Z(strL);
            C0919Ym c0919Ym = (C0919Ym) c1227cn.t.get(strL);
            if (c0919Ym == null) {
                return;
            }
            c1227cn.X(c0919Ym);
            if (c1227cn.r <= c1227cn.n) {
                c1227cn.z = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.close();
    }

    public final synchronized void f() {
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.l.flush();
    }
}
