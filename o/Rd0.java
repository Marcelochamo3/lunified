package o;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class Rd0 implements InterfaceC3064vh0, InterfaceC0553Kj {
    public final Od0 a;
    public final AbstractC0682Pj[] f;
    public int h;
    public C0656Oj i;
    public C3161wh0 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final C0656Oj[] e = new C3258xh0[2];
    public int g = 2;

    public Rd0() {
        C2472pc[] c2472pcArr = new C2472pc[2];
        int i = 0;
        while (true) {
            if (i >= this.g) {
                break;
            }
            this.e[i] = new C3258xh0(1);
            i++;
        }
        this.f = c2472pcArr;
        this.h = 2;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new C2472pc(this, 2);
        }
        Od0 od0 = new Od0(this);
        this.a = od0;
        od0.start();
        int i3 = this.g;
        C0656Oj[] c0656OjArr = this.e;
        AbstractC0397Ej.f(i3 == c0656OjArr.length);
        for (C0656Oj c0656Oj : c0656OjArr) {
            c0656Oj.H(1024);
        }
    }

    @Override // o.InterfaceC0553Kj
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // o.InterfaceC0553Kj
    public final void b(C3258xh0 c3258xh0) {
        synchronized (this.b) {
            try {
                C3161wh0 c3161wh0 = this.j;
                if (c3161wh0 != null) {
                    throw c3161wh0;
                }
                AbstractC0397Ej.c(c3258xh0 == this.i);
                this.c.addLast(c3258xh0);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC0553Kj
    public final Object d() {
        synchronized (this.b) {
            try {
                C3161wh0 c3161wh0 = this.j;
                if (c3161wh0 != null) {
                    throw c3161wh0;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (AbstractC0682Pj) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC0553Kj
    public final Object e() {
        C0656Oj c0656Oj;
        synchronized (this.b) {
            try {
                C3161wh0 c3161wh0 = this.j;
                if (c3161wh0 != null) {
                    throw c3161wh0;
                }
                AbstractC0397Ej.f(this.i == null);
                int i = this.g;
                if (i == 0) {
                    c0656Oj = null;
                } else {
                    C0656Oj[] c0656OjArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    c0656Oj = c0656OjArr[i2];
                }
                this.i = c0656Oj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0656Oj;
    }

    public abstract InterfaceC2967uh0 f(byte[] bArr, int i, boolean z);

    @Override // o.InterfaceC0553Kj
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                C0656Oj c0656Oj = this.i;
                if (c0656Oj != null) {
                    c0656Oj.E();
                    int i = this.g;
                    this.g = i + 1;
                    this.e[i] = c0656Oj;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    C0656Oj c0656Oj2 = (C0656Oj) this.c.removeFirst();
                    c0656Oj2.E();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c0656Oj2;
                }
                while (!this.d.isEmpty()) {
                    ((AbstractC0682Pj) this.d.removeFirst()).E();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3161wh0 g(C0656Oj c0656Oj, AbstractC0682Pj abstractC0682Pj, boolean z) {
        C3258xh0 c3258xh0 = (C3258xh0) c0656Oj;
        C2472pc c2472pc = (C2472pc) abstractC0682Pj;
        try {
            ByteBuffer byteBuffer = c3258xh0.f439o;
            byteBuffer.getClass();
            c2472pc.F(c3258xh0.q, f(byteBuffer.array(), byteBuffer.limit(), z), c3258xh0.u);
            c2472pc.m &= Integer.MAX_VALUE;
            return null;
        } catch (C3161wh0 e) {
            return e;
        }
    }

    public final boolean h() {
        C3161wh0 c3161wh0;
        C3161wh0 c3161wh0G;
        synchronized (this.b) {
            while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
                try {
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            C0656Oj c0656Oj = (C0656Oj) this.c.removeFirst();
            AbstractC0682Pj[] abstractC0682PjArr = this.f;
            int i = this.h - 1;
            this.h = i;
            AbstractC0682Pj abstractC0682Pj = abstractC0682PjArr[i];
            boolean z = this.k;
            this.k = false;
            if (c0656Oj.j(4)) {
                abstractC0682Pj.b(4);
            } else {
                if (c0656Oj.j(Integer.MIN_VALUE)) {
                    abstractC0682Pj.b(Integer.MIN_VALUE);
                }
                if (c0656Oj.j(134217728)) {
                    abstractC0682Pj.b(134217728);
                }
                try {
                    c3161wh0G = g(c0656Oj, abstractC0682Pj, z);
                } catch (OutOfMemoryError e) {
                    c3161wh0 = new C3161wh0("Unexpected decode error", e);
                    c3161wh0G = c3161wh0;
                } catch (RuntimeException e2) {
                    c3161wh0 = new C3161wh0("Unexpected decode error", e2);
                    c3161wh0G = c3161wh0;
                }
                if (c3161wh0G != null) {
                    synchronized (this.b) {
                        this.j = c3161wh0G;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || abstractC0682Pj.j(Integer.MIN_VALUE)) {
                        abstractC0682Pj.E();
                    } else {
                        this.d.addLast(abstractC0682Pj);
                    }
                    c0656Oj.E();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c0656Oj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // o.InterfaceC3064vh0
    public final void c(long j) {
    }
}
