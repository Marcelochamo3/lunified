package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.x50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3208x50 implements Runnable {
    public final InterfaceC0803Ua l;
    public volatile AtomicInteger m;
    public final /* synthetic */ A50 n;

    public RunnableC3208x50(A50 a50, InterfaceC0803Ua interfaceC0803Ua) {
        AbstractC1474fG.j(interfaceC0803Ua, "responseCallback");
        this.n = a50;
        this.l = interfaceC0803Ua;
        this.m = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1813in c1813in;
        String str = "OkHttp " + this.n.m.a.i();
        A50 a50 = this.n;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            a50.q.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.l.p(a50, a50.j());
                        c1813in = a50.l.l;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            VY vy = VY.a;
                            VY vy2 = VY.a;
                            String str2 = "Callback failure for " + A50.b(a50);
                            vy2.getClass();
                            VY.i(4, str2, e);
                        } else {
                            this.l.E(a50, e);
                        }
                        c1813in = a50.l.l;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        a50.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            AbstractC3409z9.a(iOException, th);
                            this.l.E(a50, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                c1813in.f(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                a50.l.l.f(this);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
