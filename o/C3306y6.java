package o;

import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: o.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3306y6 implements InterfaceC1219cj, InterfaceC2967uh0, InterfaceC0803Ua, InterfaceC0328Bs, InterfaceC0354Cs {
    public final /* synthetic */ int l;
    public long m;
    public Object n;

    public /* synthetic */ C3306y6(long j, Object obj, int i) {
        this.l = i;
        this.m = j;
        this.n = obj;
    }

    @Override // o.InterfaceC0328Bs
    public long A() {
        return ((InterfaceC0328Bs) this.n).A() - this.m;
    }

    @Override // o.InterfaceC0328Bs
    public void B(byte[] bArr, int i, int i2) {
        ((InterfaceC0328Bs) this.n).B(bArr, i, i2);
    }

    @Override // o.InterfaceC0328Bs
    public void C(int i) {
        ((InterfaceC0328Bs) this.n).C(i);
    }

    @Override // o.InterfaceC2000kj
    public int D(byte[] bArr, int i, int i2) {
        return ((InterfaceC0328Bs) this.n).D(bArr, i, i2);
    }

    @Override // o.InterfaceC0803Ua
    public void E(A50 a50, IOException iOException) {
        AbstractC1474fG.j(a50, "call");
        InterfaceC1594gb interfaceC1594gb = (InterfaceC1594gb) this.n;
        if (interfaceC1594gb.a()) {
            interfaceC1594gb.j(Jp0.k(iOException));
        }
    }

    @Override // o.InterfaceC0328Bs
    public long F() {
        return ((InterfaceC0328Bs) this.n).F() - this.m;
    }

    @Override // o.InterfaceC2967uh0
    public int G() {
        return 1;
    }

    public void H(int i) {
        if (i < 64) {
            this.m &= ~(1 << i);
            return;
        }
        C3306y6 c3306y6 = (C3306y6) this.n;
        if (c3306y6 != null) {
            c3306y6.H(i - 64);
        }
    }

    public int I(int i) {
        C3306y6 c3306y6 = (C3306y6) this.n;
        if (c3306y6 == null) {
            return i >= 64 ? Long.bitCount(this.m) : Long.bitCount(this.m & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.m & ((1 << i) - 1));
        }
        return Long.bitCount(this.m) + c3306y6.I(i - 64);
    }

    public void J() {
        if (((C3306y6) this.n) == null) {
            this.n = new C3306y6(1);
        }
    }

    public boolean K(int i) {
        if (i < 64) {
            return (this.m & (1 << i)) != 0;
        }
        J();
        return ((C3306y6) this.n).K(i - 64);
    }

    public void L(int i, boolean z) {
        if (i >= 64) {
            J();
            ((C3306y6) this.n).L(i - 64, z);
            return;
        }
        long j = this.m;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.m = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            O(i);
        } else {
            H(i);
        }
        if (z2 || ((C3306y6) this.n) != null) {
            J();
            ((C3306y6) this.n).L(0, z2);
        }
    }

    public boolean M(int i) {
        if (i >= 64) {
            J();
            return ((C3306y6) this.n).M(i - 64);
        }
        long j = 1 << i;
        long j2 = this.m;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.m = j3;
        long j4 = j - 1;
        this.m = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C3306y6 c3306y6 = (C3306y6) this.n;
        if (c3306y6 != null) {
            if (c3306y6.K(0)) {
                O(63);
            }
            ((C3306y6) this.n).M(0);
        }
        return z;
    }

    public void N() {
        this.m = 0L;
        C3306y6 c3306y6 = (C3306y6) this.n;
        if (c3306y6 != null) {
            c3306y6.N();
        }
    }

    public void O(int i) {
        if (i < 64) {
            this.m |= 1 << i;
        } else {
            J();
            ((C3306y6) this.n).O(i - 64);
        }
    }

    public void P(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.n) == null) {
            this.n = exc;
            this.m = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.m) {
            Exception exc2 = (Exception) this.n;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.n;
            this.n = null;
            throw exc3;
        }
    }

    @Override // o.InterfaceC0328Bs
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC0328Bs) this.n).a(bArr, i, i2, z);
    }

    @Override // o.InterfaceC1219cj
    public long b(long j) {
        return ((C2861td) this.n).e[(int) j] - this.m;
    }

    @Override // o.InterfaceC1219cj
    public long c(long j, long j2) {
        return Lr0.f(((C2861td) this.n).e, j + this.m, true);
    }

    @Override // o.InterfaceC0328Bs
    public long d() {
        return ((InterfaceC0328Bs) this.n).d() - this.m;
    }

    @Override // o.InterfaceC2967uh0
    public int e(long j) {
        return this.m > j ? 0 : -1;
    }

    @Override // o.InterfaceC0354Cs
    public void f() {
        ((InterfaceC0354Cs) this.n).f();
    }

    @Override // o.InterfaceC1219cj
    public long g(long j, long j2) {
        return ((C2861td) this.n).d[(int) j];
    }

    @Override // o.InterfaceC2967uh0
    public long h(int i) {
        AbstractC0397Ej.c(i == 0);
        return this.m;
    }

    @Override // o.InterfaceC0354Cs
    public void i(InterfaceC2664rb0 interfaceC2664rb0) {
        ((InterfaceC0354Cs) this.n).i(new C2287ng0(this, interfaceC2664rb0));
    }

    @Override // o.InterfaceC1219cj
    public long j(long j, long j2) {
        return 0L;
    }

    @Override // o.InterfaceC1219cj
    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // o.InterfaceC1219cj
    public C2433p50 n(long j) {
        C2861td c2861td = (C2861td) this.n;
        int i = (int) j;
        return new C2433p50(c2861td.c[i], c2861td.b[i], null);
    }

    @Override // o.InterfaceC0328Bs
    public void o() {
        ((InterfaceC0328Bs) this.n).o();
    }

    @Override // o.InterfaceC0803Ua
    public void p(A50 a50, C1855j80 c1855j80) {
        String string;
        InterfaceC1594gb interfaceC1594gb = (InterfaceC1594gb) this.n;
        try {
            long j = this.m;
            try {
                AbstractC2051l80 abstractC2051l80 = c1855j80.r;
                if (abstractC2051l80 != null && abstractC2051l80.i() > j) {
                    throw new IOException("Respuesta HTTP demasiado grande");
                }
                int i = c1855j80.f840o;
                if (abstractC2051l80 == null) {
                    string = null;
                } else {
                    if (j != Long.MAX_VALUE) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[C1672hI.a.e];
                        InputStream inputStreamA = abstractC2051l80.a();
                        long j2 = 0;
                        while (true) {
                            try {
                                int i2 = inputStreamA.read(bArr);
                                if (i2 < 0) {
                                    AbstractC3409z9.g(inputStreamA, null);
                                    string = byteArrayOutputStream.toString(AbstractC1305dd.a.name());
                                    break;
                                } else {
                                    j2 += (long) i2;
                                    if (j2 > j) {
                                        throw new IOException("Respuesta HTTP demasiado grande");
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC3409z9.g(inputStreamA, th);
                                    throw th2;
                                }
                            }
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                AbstractC3409z9.g(c1855j80, th);
                                throw th3;
                            }
                        }
                    }
                    string = abstractC2051l80.q();
                }
                if (string == null) {
                    string = "";
                }
                Wg0 wg0 = new Wg0(string, i, c1855j80.f("X-Encrypt", null));
                AbstractC3409z9.g(c1855j80, null);
                if (interfaceC1594gb.a()) {
                    interfaceC1594gb.j(wg0);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Exception e) {
            if (interfaceC1594gb.a()) {
                interfaceC1594gb.j(Jp0.k(e));
            }
        }
    }

    @Override // o.InterfaceC0328Bs
    public void q(int i) {
        ((InterfaceC0328Bs) this.n).q(i);
    }

    @Override // o.InterfaceC1219cj
    public boolean r() {
        return true;
    }

    @Override // o.InterfaceC0328Bs
    public void readFully(byte[] bArr, int i, int i2) {
        ((InterfaceC0328Bs) this.n).readFully(bArr, i, i2);
    }

    @Override // o.InterfaceC0354Cs
    public InterfaceC1324dm0 s(int i, int i2) {
        return ((InterfaceC0354Cs) this.n).s(i, i2);
    }

    @Override // o.InterfaceC2967uh0
    public List t(long j) {
        if (j >= this.m) {
            return (AbstractC0985aF) this.n;
        }
        XE xe = AbstractC0985aF.m;
        return M60.p;
    }

    public String toString() {
        switch (this.l) {
            case 1:
                if (((C3306y6) this.n) == null) {
                    return Long.toBinaryString(this.m);
                }
                return ((C3306y6) this.n).toString() + "xx" + Long.toBinaryString(this.m);
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC1219cj
    public long u() {
        return 0L;
    }

    @Override // o.InterfaceC0328Bs
    public boolean x(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC0328Bs) this.n).x(bArr, i, i2, z);
    }

    @Override // o.InterfaceC1219cj
    public long y(long j) {
        return ((C2861td) this.n).a;
    }

    @Override // o.InterfaceC1219cj
    public long z(long j, long j2) {
        return ((C2861td) this.n).a;
    }

    public /* synthetic */ C3306y6(Object obj, long j, int i) {
        this.l = i;
        this.n = obj;
        this.m = j;
    }

    public C3306y6(N9 n9) {
        this.l = 5;
        this.n = n9;
        this.m = 262144L;
    }

    public C3306y6(C0554Kk c0554Kk, long j) {
        this.l = 8;
        this.n = c0554Kk;
        AbstractC0397Ej.c(c0554Kk.f369o >= j);
        this.m = j;
    }

    public C3306y6(int i) {
        this.l = i;
        switch (i) {
            case 3:
                break;
            default:
                this.m = 0L;
                break;
        }
    }
}
