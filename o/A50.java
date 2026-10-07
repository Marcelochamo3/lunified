package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class A50 implements Cloneable {
    public volatile boolean A;
    public volatile C2599qr B;
    public volatile C50 C;
    public final OV l;
    public final C1951k70 m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.d f162o;
    public final C2691rp p;
    public final C3402z50 q;
    public final AtomicBoolean r;
    public Object s;
    public C2792sr t;
    public C50 u;
    public boolean v;
    public C2599qr w;
    public boolean x;
    public boolean y;
    public boolean z;

    public A50(OV ov, C1951k70 c1951k70, boolean z) {
        AbstractC1474fG.j(ov, "client");
        AbstractC1474fG.j(c1951k70, "originalRequest");
        this.l = ov;
        this.m = c1951k70;
        this.n = z;
        this.f162o = (io.sentry.android.core.internal.util.d) ov.m.m;
        C2691rp c2691rp = (C2691rp) ov.p.m;
        AbstractC1474fG.j(c2691rp, "$this_asFactory");
        this.p = c2691rp;
        C3402z50 c3402z50 = new C3402z50(this);
        c3402z50.g(ov.I, TimeUnit.MILLISECONDS);
        this.q = c3402z50;
        this.r = new AtomicBoolean();
        this.z = true;
    }

    public static final String b(A50 a50) {
        StringBuilder sb = new StringBuilder();
        sb.append(a50.A ? "canceled " : "");
        sb.append(a50.n ? "web socket" : "call");
        sb.append(" to ");
        sb.append(a50.m.a.i());
        return sb.toString();
    }

    public final void c(C50 c50) {
        byte[] bArr = Mr0.a;
        if (this.u != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.u = c50;
        c50.p.add(new C3305y50(this, this.s));
    }

    public final void cancel() {
        Socket socket;
        if (this.A) {
            return;
        }
        this.A = true;
        C2599qr c2599qr = this.B;
        if (c2599qr != null) {
            c2599qr.d.cancel();
        }
        C50 c50 = this.C;
        if (c50 != null && (socket = c50.c) != null) {
            Mr0.e(socket);
        }
        this.p.getClass();
    }

    public final Object clone() {
        return new A50(this.l, this.m, this.n);
    }

    public final IOException d(IOException iOException) {
        IOException interruptedIOException;
        Socket socketN;
        byte[] bArr = Mr0.a;
        C50 c50 = this.u;
        if (c50 != null) {
            synchronized (c50) {
                socketN = n();
            }
            if (this.u == null) {
                if (socketN != null) {
                    Mr0.e(socketN);
                }
                this.p.getClass();
            } else if (socketN != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.v && this.q.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            C2691rp c2691rp = this.p;
            AbstractC1474fG.g(interruptedIOException);
            c2691rp.getClass();
        } else {
            this.p.getClass();
        }
        return interruptedIOException;
    }

    public final void e(InterfaceC0803Ua interfaceC0803Ua) {
        RunnableC3208x50 runnableC3208x50;
        AbstractC1474fG.j(interfaceC0803Ua, "responseCallback");
        if (!this.r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        VY vy = VY.a;
        this.s = VY.a.g();
        this.p.getClass();
        C1813in c1813in = this.l.l;
        RunnableC3208x50 runnableC3208x51 = new RunnableC3208x50(this, interfaceC0803Ua);
        c1813in.getClass();
        synchronized (c1813in) {
            ((ArrayDeque) c1813in.d).add(runnableC3208x51);
            if (!this.n) {
                String str = this.m.a.d;
                Iterator it = ((ArrayDeque) c1813in.e).iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c1813in.d).iterator();
                        do {
                            if (!it2.hasNext()) {
                                runnableC3208x50 = null;
                                break;
                            }
                            runnableC3208x50 = (RunnableC3208x50) it2.next();
                        } while (!AbstractC1474fG.b(runnableC3208x50.n.m.a.d, str));
                    } else {
                        runnableC3208x50 = (RunnableC3208x50) it.next();
                    }
                } while (!AbstractC1474fG.b(runnableC3208x50.n.m.a.d, str));
                if (runnableC3208x50 != null) {
                    runnableC3208x51.m = runnableC3208x50.m;
                }
            }
        }
        c1813in.k();
    }

    public final C1855j80 g() {
        if (!this.r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.q.h();
        VY vy = VY.a;
        this.s = VY.a.g();
        this.p.getClass();
        try {
            C1813in c1813in = this.l.l;
            synchronized (c1813in) {
                ((ArrayDeque) c1813in.f).add(this);
            }
            C1855j80 c1855j80J = j();
            C1813in c1813in2 = this.l.l;
            c1813in2.getClass();
            c1813in2.e((ArrayDeque) c1813in2.f, this);
            return c1855j80J;
        } catch (Throwable th) {
            C1813in c1813in3 = this.l.l;
            c1813in3.getClass();
            c1813in3.e((ArrayDeque) c1813in3.f, this);
            throw th;
        }
    }

    public final void h(boolean z) {
        C2599qr c2599qr;
        synchronized (this) {
            if (!this.z) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c2599qr = this.B) != null) {
            c2599qr.d.cancel();
            c2599qr.a.k(c2599qr, true, true, null);
        }
        this.w = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    public final C1855j80 j() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC1406ef.Q(arrayList, this.l.n);
        arrayList.add(new C0466Ha(this.l));
        arrayList.add(new C0466Ha(this.l.u));
        arrayList.add(new C0466Ha(this.l.v));
        arrayList.add(C2480pg.b);
        if (!this.n) {
            AbstractC1406ef.Q(arrayList, this.l.f433o);
        }
        arrayList.add(new C0699Qa(this.n));
        C1951k70 c1951k70 = this.m;
        OV ov = this.l;
        boolean z = false;
        try {
            C1855j80 c1855j80B = new D50(this, arrayList, 0, null, c1951k70, ov.J, ov.K, ov.L).b(this.m);
            if (this.A) {
                Mr0.d(c1855j80B);
                throw new IOException("Canceled");
            }
            m(null);
            return c1855j80B;
        } catch (IOException e) {
            try {
                IOException iOExceptionM = m(e);
                AbstractC1474fG.h(iOExceptionM, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    m(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                m(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException k(C2599qr c2599qr, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC1474fG.j(c2599qr, "exchange");
        if (!AbstractC1474fG.b(c2599qr, this.B)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.x) {
                        if (z) {
                            this.x = false;
                        }
                        if (z2) {
                            this.y = false;
                        }
                        z5 = this.x;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.y) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.x = false;
                        }
                        if (z2) {
                            this.y = false;
                        }
                        z5 = this.x;
                        if (z5 || this.y) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.y && !this.z) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.B = null;
            C50 c50 = this.u;
            if (c50 != null) {
                c50.h();
            }
        }
        return z4 ? d(iOException) : iOException;
    }

    public final IOException m(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.z) {
                this.z = false;
                if (!this.x && !this.y) {
                    z = true;
                }
            }
        }
        return z ? d(iOException) : iOException;
    }

    public final Socket n() {
        C50 c50 = this.u;
        AbstractC1474fG.g(c50);
        byte[] bArr = Mr0.a;
        ArrayList arrayList = c50.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC1474fG.b(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.u = null;
        if (arrayList.isEmpty()) {
            c50.q = System.nanoTime();
            io.sentry.android.core.internal.util.d dVar = this.f162o;
            dVar.getClass();
            byte[] bArr2 = Mr0.a;
            boolean z = c50.j;
            C3357yi0 c3357yi0 = (C3357yi0) dVar.c;
            if (z || dVar.a == 0) {
                c50.j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) dVar.e;
                concurrentLinkedQueue.remove(c50);
                if (concurrentLinkedQueue.isEmpty()) {
                    c3357yi0.a();
                }
                Socket socket = c50.d;
                AbstractC1474fG.g(socket);
                return socket;
            }
            c3357yi0.c((C1130bn) dVar.d, 0L);
        }
        return null;
    }
}
