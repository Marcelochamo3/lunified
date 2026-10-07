package o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: o.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1948k6 implements InterfaceC1991ke0 {
    public final /* synthetic */ int l;
    public final Object m;
    public final Object n;

    public /* synthetic */ C1948k6(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        switch (this.l) {
            case 0:
                return (C2143m6) this.m;
            default:
                return (Hj0) this.n;
        }
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.l) {
            case 0:
                InterfaceC1991ke0 interfaceC1991ke0 = (InterfaceC1991ke0) this.n;
                C2143m6 c2143m6 = (C2143m6) this.m;
                c2143m6.h();
                try {
                    try {
                        interfaceC1991ke0.close();
                        if (c2143m6.i()) {
                            throw c2143m6.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c2143m6.i()) {
                            throw e;
                        }
                        throw c2143m6.j(e);
                    }
                } catch (Throwable th) {
                    c2143m6.i();
                    throw th;
                }
            default:
                ((OutputStream) this.m).close();
                return;
        }
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.l) {
            case 0:
                InterfaceC1991ke0 interfaceC1991ke0 = (InterfaceC1991ke0) this.n;
                C2143m6 c2143m6 = (C2143m6) this.m;
                c2143m6.h();
                try {
                    try {
                        interfaceC1991ke0.flush();
                        if (c2143m6.i()) {
                            throw c2143m6.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c2143m6.i()) {
                            throw e;
                        }
                        throw c2143m6.j(e);
                    }
                } catch (Throwable th) {
                    c2143m6.i();
                    throw th;
                }
            default:
                ((OutputStream) this.m).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.l) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC1991ke0) this.n) + ')';
            default:
                return "sink(" + ((OutputStream) this.m) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b A[LOOP:1: B:12:0x0062->B:25:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) throws IOException {
        C2143m6 c2143m6;
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(e9, "source");
                AbstractC2506pt.j(e9.m, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    C3343yb0 c3343yb0 = e9.l;
                    AbstractC1474fG.g(c3343yb0);
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (c3343yb0.c - c3343yb0.b);
                                if (j2 >= j) {
                                    j2 = j;
                                    InterfaceC1991ke0 interfaceC1991ke0 = (InterfaceC1991ke0) this.n;
                                    c2143m6 = (C2143m6) this.m;
                                    c2143m6.h();
                                    interfaceC1991ke0.w(e9, j2);
                                    if (!c2143m6.i()) {
                                        throw c2143m6.j(null);
                                    }
                                    j -= j2;
                                } else {
                                    c3343yb0 = c3343yb0.f;
                                    AbstractC1474fG.g(c3343yb0);
                                }
                            }
                            interfaceC1991ke0.w(e9, j2);
                            if (!c2143m6.i()) {
                                throw c2143m6.j(null);
                            }
                            j -= j2;
                        } catch (IOException e) {
                            if (!c2143m6.i()) {
                                throw e;
                            }
                            throw c2143m6.j(e);
                        }
                    } catch (Throwable th) {
                        c2143m6.i();
                        throw th;
                    }
                    InterfaceC1991ke0 interfaceC1991ke1 = (InterfaceC1991ke0) this.n;
                    c2143m6 = (C2143m6) this.m;
                    c2143m6.h();
                }
                break;
            default:
                AbstractC1474fG.j(e9, "source");
                AbstractC2506pt.j(e9.m, 0L, j);
                while (j > 0) {
                    ((Hj0) this.n).f();
                    C3343yb0 c3343yb1 = e9.l;
                    AbstractC1474fG.g(c3343yb1);
                    int iMin = (int) Math.min(j, c3343yb1.c - c3343yb1.b);
                    ((OutputStream) this.m).write(c3343yb1.a, c3343yb1.b, iMin);
                    int i = c3343yb1.b + iMin;
                    c3343yb1.b = i;
                    long j3 = iMin;
                    j -= j3;
                    e9.m -= j3;
                    if (i == c3343yb1.c) {
                        e9.l = c3343yb1.a();
                        Gb0.a(c3343yb1);
                    }
                }
                return;
        }
    }
}
