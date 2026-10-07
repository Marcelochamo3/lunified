package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.zJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3420zJ implements InterfaceC3273xp {
    public final String a;
    public final C2562qX b;
    public final C2084lc c;
    public InterfaceC1324dm0 d;
    public String e;
    public C0643Nw f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1150o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public C3420zJ(String str) {
        this.a = str;
        C2562qX c2562qX = new C2562qX(1024);
        this.b = c2562qX;
        byte[] bArr = c2562qX.a;
        this.c = new C2084lc(bArr.length, bArr);
        this.k = -9223372036854775807L;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) throws C2949uX {
        int i;
        boolean zH;
        AbstractC0397Ej.g(this.d);
        while (c2562qX.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    C2562qX c2562qX2 = this.b;
                    C2084lc c2084lc = this.c;
                    if (i2 == 2) {
                        int iU = ((this.j & (-225)) << 8) | c2562qX.u();
                        this.i = iU;
                        if (iU > c2562qX2.a.length) {
                            c2562qX2.C(iU);
                            byte[] bArr = c2562qX2.a;
                            c2084lc.getClass();
                            c2084lc.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c2562qX.a(), this.i - this.h);
                        c2562qX.e(c2084lc.b, this.h, iMin);
                        int i3 = this.h + iMin;
                        this.h = i3;
                        if (i3 == this.i) {
                            c2084lc.p(0);
                            if (c2084lc.h()) {
                                if (this.l) {
                                }
                                this.g = 0;
                            } else {
                                this.l = true;
                                int i4 = c2084lc.i(1);
                                int i5 = i4 == 1 ? c2084lc.i(1) : 0;
                                this.m = i5;
                                if (i5 != 0) {
                                    throw C2949uX.a(null, null);
                                }
                                if (i4 == 1) {
                                    c2084lc.i((c2084lc.i(2) + 1) * 8);
                                }
                                if (!c2084lc.h()) {
                                    throw C2949uX.a(null, null);
                                }
                                this.n = c2084lc.i(6);
                                int i6 = c2084lc.i(4);
                                int i7 = c2084lc.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw C2949uX.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = c2084lc.g();
                                    int iB = c2084lc.b();
                                    FV fvV = AbstractC3409z9.v(c2084lc, true);
                                    this.u = (String) fvV.n;
                                    this.r = fvV.l;
                                    this.t = fvV.m;
                                    int iB2 = iB - c2084lc.b();
                                    c2084lc.p(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    c2084lc.j(iB2, bArr2);
                                    C0617Mw c0617Mw = new C0617Mw();
                                    c0617Mw.a = this.e;
                                    c0617Mw.k = "audio/mp4a-latm";
                                    c0617Mw.h = this.u;
                                    c0617Mw.x = this.t;
                                    c0617Mw.y = this.r;
                                    c0617Mw.m = Collections.singletonList(bArr2);
                                    c0617Mw.c = this.a;
                                    C0643Nw c0643Nw = new C0643Nw(c0617Mw);
                                    if (!c0643Nw.equals(this.f)) {
                                        this.f = c0643Nw;
                                        this.s = 1024000000 / ((long) c0643Nw.K);
                                        this.d.a(c0643Nw);
                                    }
                                } else {
                                    int i8 = c2084lc.i((c2084lc.i(2) + 1) * 8);
                                    int iB3 = c2084lc.b();
                                    FV fvV2 = AbstractC3409z9.v(c2084lc, true);
                                    this.u = (String) fvV2.n;
                                    this.r = fvV2.l;
                                    this.t = fvV2.m;
                                    c2084lc.s(i8 - (iB3 - c2084lc.b()));
                                }
                                int i9 = c2084lc.i(3);
                                this.f1150o = i9;
                                if (i9 == 0) {
                                    c2084lc.s(8);
                                } else if (i9 == 1) {
                                    c2084lc.s(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    c2084lc.s(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c2084lc.s(1);
                                }
                                boolean zH2 = c2084lc.h();
                                this.p = zH2;
                                this.q = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.q = c2084lc.i((c2084lc.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = c2084lc.h();
                                            this.q = (this.q << 8) + ((long) c2084lc.i(8));
                                        } while (zH);
                                    }
                                }
                                if (c2084lc.h()) {
                                    c2084lc.s(8);
                                }
                            }
                            if (this.m != 0) {
                                throw C2949uX.a(null, null);
                            }
                            if (this.n != 0) {
                                throw C2949uX.a(null, null);
                            }
                            if (this.f1150o != 0) {
                                throw C2949uX.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = c2084lc.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = c2084lc.g();
                            if ((iG2 & 7) == 0) {
                                c2562qX2.F(iG2 >> 3);
                            } else {
                                c2084lc.j(i10 * 8, c2562qX2.a);
                                c2562qX2.F(0);
                            }
                            this.d.e(i10, c2562qX2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.d(j, 1, i10, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                c2084lc.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = c2562qX.u();
                    if ((iU2 & 224) == 224) {
                        this.j = iU2;
                        this.g = 2;
                    } else if (iU2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (c2562qX.u() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.d = interfaceC0354Cs.s(ym0.d, 1);
        ym0.b();
        this.e = ym0.e;
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
