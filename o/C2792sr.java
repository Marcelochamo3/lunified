package o;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: o.sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2792sr {
    public final io.sentry.android.core.internal.util.d a;
    public final C1159c2 b;
    public final A50 c;
    public final C2691rp d;
    public C1225cm e;
    public C2349oE f;
    public int g;
    public int h;
    public int i;
    public K80 j;

    public C2792sr(io.sentry.android.core.internal.util.d dVar, C1159c2 c1159c2, A50 a50, C2691rp c2691rp) {
        AbstractC1474fG.j(dVar, "connectionPool");
        AbstractC1474fG.j(c2691rp, "eventListener");
        this.a = dVar;
        this.b = c1159c2;
        this.c = a50;
        this.d = c2691rp;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final C50 a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        K80 k80;
        C1225cm c1225cm;
        C2349oE c2349oE;
        C1225cm c1225cmF;
        List list;
        Socket socketN;
        while (!this.c.A) {
            C50 c50 = this.c.u;
            if (c50 != null) {
                synchronized (c50) {
                    try {
                        socketN = (c50.j || !b(c50.b.a.i)) ? this.c.n() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.u == null) {
                    if (socketN != null) {
                        Mr0.e(socketN);
                    }
                    C2691rp c2691rp = this.d;
                    A50 a50 = this.c;
                    c2691rp.getClass();
                    AbstractC1474fG.j(a50, "call");
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        c50 = this.c.u;
                        AbstractC1474fG.g(c50);
                        C2691rp c2691rp2 = this.d;
                        A50 a51 = this.c;
                        c2691rp2.getClass();
                        AbstractC1474fG.j(a51, "call");
                    } else {
                        k80 = this.j;
                        try {
                            if (k80 != null) {
                                this.j = null;
                            } else {
                                c1225cm = this.e;
                                if (c1225cm == null && c1225cm.c()) {
                                    C1225cm c1225cm2 = this.e;
                                    AbstractC1474fG.g(c1225cm2);
                                    if (!c1225cm2.c()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i5 = c1225cm2.b;
                                    c1225cm2.b = i5 + 1;
                                    k80 = (K80) c1225cm2.a.get(i5);
                                } else {
                                    c2349oE = this.f;
                                    if (c2349oE == null) {
                                        C1159c2 c1159c2 = this.b;
                                        A50 a52 = this.c;
                                        c2349oE = new C2349oE(c1159c2, a52.l.O, a52, this.d);
                                        this.f = c2349oE;
                                    }
                                    c1225cmF = c2349oE.f();
                                    this.e = c1225cmF;
                                    list = c1225cmF.a;
                                    if (!this.c.A) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.a.a(this.b, this.c, list, false)) {
                                        c50 = this.c.u;
                                        AbstractC1474fG.g(c50);
                                        C2691rp c2691rp3 = this.d;
                                        A50 a53 = this.c;
                                        c2691rp3.getClass();
                                        AbstractC1474fG.j(a53, "call");
                                    } else {
                                        if (c1225cmF.c()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i6 = c1225cmF.b;
                                        c1225cmF.b = i6 + 1;
                                        k80 = (K80) c1225cmF.a.get(i6);
                                        c50 = new C50(this.a, k80);
                                        this.c.C = c50;
                                        c50.c(i, i2, i3, i4, z, this.c, this.d);
                                        this.c.C = null;
                                        this.c.l.O.i(k80);
                                        if (this.a.a(this.b, this.c, list, true)) {
                                            C50 c51 = this.c.u;
                                            AbstractC1474fG.g(c51);
                                            this.j = k80;
                                            Socket socket = c50.d;
                                            AbstractC1474fG.g(socket);
                                            Mr0.e(socket);
                                            C2691rp c2691rp4 = this.d;
                                            A50 a54 = this.c;
                                            c2691rp4.getClass();
                                            AbstractC1474fG.j(a54, "call");
                                            c50 = c51;
                                        } else {
                                            synchronized (c50) {
                                                io.sentry.android.core.internal.util.d dVar = this.a;
                                                dVar.getClass();
                                                byte[] bArr = Mr0.a;
                                                ((ConcurrentLinkedQueue) dVar.e).add(c50);
                                                ((C3357yi0) dVar.c).c((C1130bn) dVar.d, 0L);
                                                this.c.c(c50);
                                            }
                                            C2691rp c2691rp5 = this.d;
                                            A50 a55 = this.c;
                                            c2691rp5.getClass();
                                            AbstractC1474fG.j(a55, "call");
                                        }
                                    }
                                }
                            }
                            c50.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.C = null;
                            this.c.l.O.i(k80);
                            if (this.a.a(this.b, this.c, list, true)) {
                                C50 c52 = this.c.u;
                                AbstractC1474fG.g(c52);
                                this.j = k80;
                                Socket socket2 = c50.d;
                                AbstractC1474fG.g(socket2);
                                Mr0.e(socket2);
                                C2691rp c2691rp6 = this.d;
                                A50 a56 = this.c;
                                c2691rp6.getClass();
                                AbstractC1474fG.j(a56, "call");
                                c50 = c52;
                            } else {
                                synchronized (c50) {
                                    io.sentry.android.core.internal.util.d dVar2 = this.a;
                                    dVar2.getClass();
                                    byte[] bArr2 = Mr0.a;
                                    ((ConcurrentLinkedQueue) dVar2.e).add(c50);
                                    ((C3357yi0) dVar2.c).c((C1130bn) dVar2.d, 0L);
                                    this.c.c(c50);
                                    C2691rp c2691rp7 = this.d;
                                    A50 a57 = this.c;
                                    c2691rp7.getClass();
                                    AbstractC1474fG.j(a57, "call");
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.C = null;
                            throw th2;
                        }
                        list = null;
                        c50 = new C50(this.a, k80);
                        this.c.C = c50;
                    }
                } else if (socketN != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    c50 = this.c.u;
                    AbstractC1474fG.g(c50);
                    C2691rp c2691rp8 = this.d;
                    A50 a58 = this.c;
                    c2691rp8.getClass();
                    AbstractC1474fG.j(a58, "call");
                } else {
                    k80 = this.j;
                    if (k80 != null) {
                        this.j = null;
                    } else {
                        c1225cm = this.e;
                        if (c1225cm == null) {
                        }
                        c2349oE = this.f;
                        if (c2349oE == null) {
                            C1159c2 c1159c3 = this.b;
                            A50 a59 = this.c;
                            c2349oE = new C2349oE(c1159c3, a59.l.O, a59, this.d);
                            this.f = c2349oE;
                        }
                        c1225cmF = c2349oE.f();
                        this.e = c1225cmF;
                        list = c1225cmF.a;
                        if (!this.c.A) {
                            throw new IOException("Canceled");
                        }
                        if (this.a.a(this.b, this.c, list, false)) {
                            c50 = this.c.u;
                            AbstractC1474fG.g(c50);
                            C2691rp c2691rp9 = this.d;
                            A50 a510 = this.c;
                            c2691rp9.getClass();
                            AbstractC1474fG.j(a510, "call");
                        } else {
                            if (c1225cmF.c()) {
                                throw new NoSuchElementException();
                            }
                            int i7 = c1225cmF.b;
                            c1225cmF.b = i7 + 1;
                            k80 = (K80) c1225cmF.a.get(i7);
                            c50 = new C50(this.a, k80);
                            this.c.C = c50;
                            c50.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.C = null;
                            this.c.l.O.i(k80);
                            if (this.a.a(this.b, this.c, list, true)) {
                                C50 c53 = this.c.u;
                                AbstractC1474fG.g(c53);
                                this.j = k80;
                                Socket socket3 = c50.d;
                                AbstractC1474fG.g(socket3);
                                Mr0.e(socket3);
                                C2691rp c2691rp10 = this.d;
                                A50 a511 = this.c;
                                c2691rp10.getClass();
                                AbstractC1474fG.j(a511, "call");
                                c50 = c53;
                            } else {
                                synchronized (c50) {
                                    io.sentry.android.core.internal.util.d dVar3 = this.a;
                                    dVar3.getClass();
                                    byte[] bArr3 = Mr0.a;
                                    ((ConcurrentLinkedQueue) dVar3.e).add(c50);
                                    ((C3357yi0) dVar3.c).c((C1130bn) dVar3.d, 0L);
                                    this.c.c(c50);
                                    C2691rp c2691rp11 = this.d;
                                    A50 a512 = this.c;
                                    c2691rp11.getClass();
                                    AbstractC1474fG.j(a512, "call");
                                }
                            }
                        }
                    }
                    list = null;
                    c50 = new C50(this.a, k80);
                    this.c.C = c50;
                    c50.c(i, i2, i3, i4, z, this.c, this.d);
                    this.c.C = null;
                    this.c.l.O.i(k80);
                    if (this.a.a(this.b, this.c, list, true)) {
                        C50 c54 = this.c.u;
                        AbstractC1474fG.g(c54);
                        this.j = k80;
                        Socket socket4 = c50.d;
                        AbstractC1474fG.g(socket4);
                        Mr0.e(socket4);
                        C2691rp c2691rp12 = this.d;
                        A50 a513 = this.c;
                        c2691rp12.getClass();
                        AbstractC1474fG.j(a513, "call");
                        c50 = c54;
                    } else {
                        synchronized (c50) {
                            io.sentry.android.core.internal.util.d dVar4 = this.a;
                            dVar4.getClass();
                            byte[] bArr4 = Mr0.a;
                            ((ConcurrentLinkedQueue) dVar4.e).add(c50);
                            ((C3357yi0) dVar4.c).c((C1130bn) dVar4.d, 0L);
                            this.c.c(c50);
                            C2691rp c2691rp13 = this.d;
                            A50 a514 = this.c;
                            c2691rp13.getClass();
                            AbstractC1474fG.j(a514, "call");
                        }
                    }
                }
            }
            if (c50.j(z2)) {
                return c50;
            }
            c50.l();
            if (this.j == null) {
                C1225cm c1225cm3 = this.e;
                if (c1225cm3 != null ? c1225cm3.c() : true) {
                    continue;
                } else {
                    C2349oE c2349oE2 = this.f;
                    if (!(c2349oE2 != null ? c2349oE2.e() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(C2446pE c2446pE) {
        AbstractC1474fG.j(c2446pE, "url");
        C2446pE c2446pE2 = this.b.i;
        return c2446pE.e == c2446pE2.e && AbstractC1474fG.b(c2446pE.d, c2446pE2.d);
    }

    public final void c(IOException iOException) {
        AbstractC1474fG.j(iOException, "e");
        this.j = null;
        if ((iOException instanceof Gg0) && ((Gg0) iOException).l == 8) {
            this.g++;
        } else if (iOException instanceof C2577qg) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
