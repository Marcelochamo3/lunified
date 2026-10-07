package o;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: o.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1354e2 implements InterfaceC0302As {
    public final C2562qX d;
    public final C2084lc e;
    public InterfaceC0354Cs f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final C1452f2 b = new C1452f2(true, null);
    public final C2562qX c = new C2562qX(C1672hI.a.g);
    public int i = -1;
    public long h = -1;

    public C1354e2() {
        C2562qX c2562qX = new C2562qX(10);
        this.d = c2562qX;
        byte[] bArr = c2562qX.a;
        this.e = new C2084lc(bArr.length, bArr);
    }

    public final int b(C0554Kk c0554Kk) {
        int i = 0;
        while (true) {
            C2562qX c2562qX = this.d;
            c0554Kk.x(c2562qX.a, 0, 10, false);
            c2562qX.F(0);
            if (c2562qX.w() != 4801587) {
                break;
            }
            c2562qX.G(3);
            int iT = c2562qX.t();
            i += iT + 10;
            c0554Kk.b(iT, false);
        }
        c0554Kk.q = 0;
        c0554Kk.b(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        int iB = b(c0554Kk);
        int i = iB;
        int i2 = 0;
        int i3 = 0;
        do {
            C2562qX c2562qX = this.d;
            c0554Kk.x(c2562qX.a, 0, 2, false);
            c2562qX.F(0);
            if ((c2562qX.z() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c0554Kk.x(c2562qX.a, 0, 4, false);
                C2084lc c2084lc = this.e;
                c2084lc.p(14);
                int i4 = c2084lc.i(13);
                if (i4 <= 6) {
                    i++;
                    c0554Kk.q = 0;
                    c0554Kk.b(i, false);
                } else {
                    c0554Kk.b(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                c0554Kk.q = 0;
                c0554Kk.b(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iB < 8192);
        return false;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.f = interfaceC0354Cs;
        this.b.d(interfaceC0354Cs, new Ym0(0, 1));
        interfaceC0354Cs.f();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX, EOFException, InterruptedIOException {
        int i;
        boolean z;
        AbstractC0397Ej.g(this.f);
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        int i2 = this.a;
        int i3 = i2 & 2;
        int i4 = 0;
        boolean z2 = true;
        long j = c0554Kk.n;
        if (i3 == 0 && ((i2 & 1) == 0 || j == -1)) {
            i = -1;
        } else {
            C2084lc c2084lc = this.e;
            C2562qX c2562qX = this.d;
            if (this.j) {
                i = -1;
            } else {
                this.i = -1;
                c0554Kk.q = 0;
                long j2 = 0;
                if (c0554Kk.f369o == 0) {
                    b(c0554Kk);
                }
                int i5 = 0;
                while (true) {
                    try {
                        C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
                        if (!c0554Kk2.x(c2562qX.a, i4, 2, z2)) {
                            break;
                        }
                        c2562qX.F(i4);
                        if ((c2562qX.z() & 65526) != 65520) {
                            i5 = 0;
                            break;
                        }
                        if (!c0554Kk2.x(c2562qX.a, i4, 4, z2)) {
                            break;
                        }
                        c2084lc.p(14);
                        int i6 = c2084lc.i(13);
                        if (i6 <= 6) {
                            this.j = true;
                            throw C2949uX.a("Malformed ADTS stream", null);
                        }
                        j2 += (long) i6;
                        i5++;
                        if (i5 == 1000 || !c0554Kk2.b(i6 - 6, true)) {
                            break;
                            break;
                        }
                        i4 = 0;
                        z2 = true;
                    } catch (EOFException unused) {
                    }
                }
                c0554Kk.q = 0;
                if (i5 > 0) {
                    this.i = (int) (j2 / ((long) i5));
                    i = -1;
                } else {
                    i = -1;
                    this.i = -1;
                }
                this.j = true;
            }
        }
        C2562qX c2562qX2 = this.c;
        int iD = c0554Kk.D(c2562qX2.a, 0, C1672hI.a.g);
        boolean z3 = iD == i;
        boolean z4 = this.l;
        C1452f2 c1452f2 = this.b;
        if (z4) {
            z = true;
        } else {
            boolean z5 = (i2 & 1) != 0 && this.i > 0;
            if (z5 && c1452f2.q == -9223372036854775807L && !z3) {
                z = true;
            } else {
                if (z5) {
                    long j3 = c1452f2.q;
                    if (j3 != -9223372036854775807L) {
                        InterfaceC0354Cs interfaceC0354Cs = this.f;
                        boolean z6 = i3 != 0;
                        int i7 = this.i;
                        interfaceC0354Cs.i(new C0316Bg(j, this.h, (int) ((((long) i7) * 8000000) / j3), i7, z6));
                    } else {
                        this.f.i(new C3114w7(-9223372036854775807L));
                    }
                } else {
                    this.f.i(new C3114w7(-9223372036854775807L));
                }
                z = true;
                this.l = true;
            }
        }
        if (z3) {
            return -1;
        }
        c2562qX2.F(0);
        c2562qX2.E(iD);
        if (!this.k) {
            c1452f2.c(4, this.g);
            this.k = z;
        }
        c1452f2.b(c2562qX2);
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
