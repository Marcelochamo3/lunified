package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.aE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984aE {
    public final int a;
    public final TD b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final YD i;
    public final XD j;
    public final ZD k;
    public final ZD l;
    public int m;
    public IOException n;

    public C0984aE(int i, TD td, boolean z, boolean z2, C2152mB c2152mB) {
        this.a = i;
        this.b = td;
        this.f = td.D.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new YD(this, td.C.a(), z2);
        this.j = new XD(this, z);
        this.k = new ZD(this);
        this.l = new ZD(this);
        if (c2152mB == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c2152mB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z;
        boolean zI;
        byte[] bArr = Mr0.a;
        synchronized (this) {
            try {
                YD yd = this.i;
                if (yd.m || !yd.p) {
                    z = false;
                } else {
                    XD xd = this.j;
                    if (xd.l || xd.n) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zI = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zI) {
                return;
            }
            this.b.p(this.a);
        }
    }

    public final void b() throws IOException {
        XD xd = this.j;
        if (xd.n) {
            throw new IOException("stream closed");
        }
        if (xd.l) {
            throw new IOException("stream finished");
        }
        if (this.m != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.m;
            AbstractC1701hf0.p(i);
            throw new Gg0(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC1701hf0.q(i, "rstStatusCode");
        if (d(i, iOException)) {
            TD td = this.b;
            td.getClass();
            AbstractC1701hf0.q(i, "statusCode");
            td.J.t(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = Mr0.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.m && this.j.l) {
                return false;
            }
            this.b.p(this.a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC1701hf0.q(i, "errorCode");
        if (d(i, null)) {
            this.b.Q(this.a, i);
        }
    }

    public final synchronized int f() {
        return this.m;
    }

    public final XD g() {
        synchronized (this) {
            if (!this.h && !h()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.j;
    }

    public final boolean h() {
        return this.b.l == ((this.a & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.m != 0) {
            return false;
        }
        YD yd = this.i;
        if (yd.m || yd.p) {
            XD xd = this.j;
            if ((xd.l || xd.n) && this.h) {
                return false;
            }
        }
        return true;
    }

    public final void j(C2152mB c2152mB, boolean z) {
        boolean zI;
        AbstractC1474fG.j(c2152mB, "headers");
        byte[] bArr = Mr0.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(c2152mB);
                }
                if (z) {
                    this.i.m = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.b.p(this.a);
    }

    public final synchronized void k(int i) {
        AbstractC1701hf0.q(i, "errorCode");
        if (this.m == 0) {
            this.m = i;
            notifyAll();
        }
    }

    public final void l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
