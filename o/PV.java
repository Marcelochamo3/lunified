package o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class PV extends S7 implements InterfaceC1570gE {
    public final InterfaceC0595Ma p;
    public final C2994uv q;
    public final String r;
    public final C0414Fa s;
    public final C2994uv t;
    public final I20 u;
    public C1855j80 v;
    public InputStream w;
    public boolean x;
    public long y;
    public long z;

    static {
        AbstractC1726hs.a("goog.exo.okhttp");
    }

    public PV(InterfaceC0595Ma interfaceC0595Ma, C2994uv c2994uv) {
        super(true);
        interfaceC0595Ma.getClass();
        this.p = interfaceC0595Ma;
        this.r = null;
        this.s = null;
        this.t = c2994uv;
        this.u = null;
        this.q = new C2994uv(8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C1277dE {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.y;
            if (j != -1) {
                long j2 = j - this.z;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.w;
                    int i4 = Lr0.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.z += (long) i3;
                        b(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.w;
                int i5 = Lr0.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.z += (long) i3;
                    b(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            int i6 = Lr0.a;
            throw C1277dE.b(2, e);
        }
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        if (this.x) {
            this.x = false;
            c();
            g();
        }
    }

    public final void g() {
        C1855j80 c1855j80 = this.v;
        if (c1855j80 != null) {
            AbstractC2051l80 abstractC2051l80 = c1855j80.r;
            abstractC2051l80.getClass();
            abstractC2051l80.close();
            this.v = null;
        }
        this.w = null;
    }

    public final void h(long j) throws C1277dE {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[C1672hI.a.f];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, C1672hI.a.f);
                InputStream inputStream = this.w;
                int i = Lr0.a;
                int i2 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i2 == -1) {
                    throw new C1277dE(2008);
                }
                j -= (long) i2;
                b(i2);
            } catch (IOException e) {
                if (!(e instanceof C1277dE)) {
                    throw new C1277dE(2000);
                }
                throw ((C1277dE) e);
            }
        }
    }

    @Override // o.S7, o.InterfaceC2583qj
    public final Map l() {
        C1855j80 c1855j80 = this.v;
        return c1855j80 == null ? Collections.emptyMap() : c1855j80.q.g();
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C1277dE {
        C2446pE c2446pEB;
        C2243n70 c2243n70O;
        long j = 0;
        this.z = 0L;
        this.y = 0L;
        e();
        long j2 = c2970uj.f;
        String string = c2970uj.a.toString();
        AbstractC1474fG.j(string, "<this>");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, string);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null) {
            throw new C1277dE("Malformed URL", 1004);
        }
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.m = c2446pEB;
        C0414Fa c0414Fa = this.s;
        if (c0414Fa != null) {
            String string2 = c0414Fa.toString();
            if (string2.length() == 0) {
                c0560Kq.n("Cache-Control");
            } else {
                c0560Kq.j("Cache-Control", string2);
            }
        }
        HashMap map = new HashMap();
        C2994uv c2994uv = this.t;
        if (c2994uv != null) {
            map.putAll(c2994uv.c0());
        }
        map.putAll(this.q.c0());
        map.putAll(c2970uj.e);
        for (Map.Entry entry : map.entrySet()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        long j3 = c2970uj.g;
        String strA = AbstractC2639rE.a(j2, j3);
        if (strA != null) {
            c0560Kq.a("Range", strA);
        }
        String str = this.r;
        if (str != null) {
            c0560Kq.a("User-Agent", str);
        }
        if ((c2970uj.i & 1) != 1) {
            c0560Kq.a("Accept-Encoding", "identity");
        }
        int i = c2970uj.c;
        byte[] bArr = c2970uj.d;
        if (bArr != null) {
            c2243n70O = C2743sL.o(null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = Lr0.e;
            AbstractC1474fG.j(bArr2, "content");
            c2243n70O = C2743sL.o(null, bArr2);
        } else {
            c2243n70O = null;
        }
        c0560Kq.m(C2970uj.b(i), c2243n70O);
        A50 a50C = ((OV) this.p).c(c0560Kq.c());
        try {
            Mc0 mc0 = new Mc0();
            a50C.e(new C0334By(22, mc0));
            try {
                try {
                    C1855j80 c1855j80 = (C1855j80) mc0.get();
                    this.v = c1855j80;
                    AbstractC2051l80 abstractC2051l80 = c1855j80.r;
                    abstractC2051l80.getClass();
                    this.w = abstractC2051l80.a();
                    boolean zP = c1855j80.p();
                    long j4 = c2970uj.f;
                    int i2 = c1855j80.f840o;
                    if (!zP) {
                        C2152mB c2152mB = c1855j80.q;
                        if (i2 == 416 && j4 == AbstractC2639rE.b(c2152mB.a("Content-Range"))) {
                            this.x = true;
                            f(c2970uj);
                            if (j3 != -1) {
                                return j3;
                            }
                            return 0L;
                        }
                        try {
                            InputStream inputStream = this.w;
                            inputStream.getClass();
                            Lr0.W(inputStream);
                        } catch (IOException unused2) {
                            int i3 = Lr0.a;
                        }
                        TreeMap treeMapG = c2152mB.g();
                        g();
                        throw new C1472fE(i2, i2 == 416 ? new C2679rj(2008) : null, treeMapG);
                    }
                    TP tpL = abstractC2051l80.l();
                    String str2 = tpL != null ? tpL.a : "";
                    I20 i20 = this.u;
                    if (i20 != null && !i20.apply(str2)) {
                        g();
                        throw new C1374eE(str2);
                    }
                    if (i2 == 200 && j4 != 0) {
                        j = j4;
                    }
                    if (j3 != -1) {
                        this.y = j3;
                    } else {
                        long jI = abstractC2051l80.i();
                        this.y = jI != -1 ? jI - j : -1L;
                    }
                    this.x = true;
                    f(c2970uj);
                    try {
                        h(j);
                        return this.y;
                    } catch (C1277dE e) {
                        g();
                        throw e;
                    }
                } catch (ExecutionException e2) {
                    throw new IOException(e2);
                }
            } catch (InterruptedException unused3) {
                a50C.cancel();
                throw new InterruptedIOException();
            }
        } catch (IOException e3) {
            throw C1277dE.b(1, e3);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        C1855j80 c1855j80 = this.v;
        if (c1855j80 == null) {
            return null;
        }
        return Uri.parse(c1855j80.l.a.i);
    }
}
