package o;

/* JADX INFO: renamed from: o.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2519q0 implements InterfaceC3273xp {
    public final /* synthetic */ int a;
    public final C2084lc b;
    public final C2562qX c;
    public final String d;
    public String e;
    public InterfaceC1324dm0 f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public C0643Nw k;
    public int l;
    public long m;

    public C2519q0(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                C2084lc c2084lc = new C2084lc(16, new byte[16]);
                this.b = c2084lc;
                this.c = new C2562qX(c2084lc.b);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                C2084lc c2084lc2 = new C2084lc(128, new byte[128]);
                this.b = c2084lc2;
                this.c = new C2562qX(c2084lc2.b);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x031f  */
    /* JADX WARN: Code duplicated, block: B:182:0x032d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0335  */
    /* JADX WARN: Code duplicated, block: B:191:0x0349  */
    /* JADX WARN: Code duplicated, block: B:193:0x034d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0352  */
    /* JADX WARN: Code duplicated, block: B:196:0x0356  */
    /* JADX WARN: Code duplicated, block: B:198:0x035c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0363  */
    /* JADX WARN: Code duplicated, block: B:340:0x035f A[SYNTHETIC] */
    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) {
        int i;
        int iN;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.a) {
            case 0:
                AbstractC0397Ej.g(this.f);
                while (c2562qX.a() > 0) {
                    int i18 = this.g;
                    C2562qX c2562qX2 = this.c;
                    if (i18 == 0) {
                        while (c2562qX.a() > 0) {
                            if (this.i) {
                                int iU = c2562qX.u();
                                if (iU == 119) {
                                    this.i = false;
                                    this.g = 1;
                                    byte[] bArr = c2562qX2.a;
                                    bArr[0] = C3285xv.h;
                                    bArr[1] = 119;
                                    this.h = 2;
                                }
                                this.i = iU == 11;
                            } else {
                                this.i = c2562qX.u() == 11;
                            }
                            break;
                        }
                    } else if (i18 == 1) {
                        byte[] bArr2 = c2562qX2.a;
                        int iMin = Math.min(c2562qX.a(), 128 - this.h);
                        c2562qX.e(bArr2, this.h, iMin);
                        int i19 = this.h + iMin;
                        this.h = i19;
                        if (i19 == 128) {
                            C2084lc c2084lc = this.b;
                            c2084lc.p(0);
                            int iG = c2084lc.g();
                            c2084lc.s(40);
                            boolean z = c2084lc.i(5) > 10;
                            c2084lc.p(iG);
                            int[] iArr = AbstractC0397Ej.d;
                            int[] iArr2 = AbstractC0397Ej.b;
                            if (z) {
                                c2084lc.s(16);
                                int i20 = c2084lc.i(2);
                                if (i20 == 0) {
                                    b = 0;
                                } else if (i20 != 1) {
                                    b = i20 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b = 1;
                                }
                                c2084lc.s(3);
                                iN = (c2084lc.i(11) + 1) * 2;
                                int i21 = c2084lc.i(2);
                                if (i21 == 3) {
                                    i5 = AbstractC0397Ej.c[c2084lc.i(2)];
                                    i7 = 6;
                                    i6 = 3;
                                } else {
                                    int i22 = c2084lc.i(2);
                                    int i23 = AbstractC0397Ej.a[i22];
                                    i5 = iArr2[i21];
                                    i6 = i22;
                                    i7 = i23;
                                }
                                i4 = i7 * 256;
                                int i24 = (iN * i5) / (i7 * 32);
                                int i25 = c2084lc.i(3);
                                boolean zH = c2084lc.h();
                                i3 = iArr[i25] + (zH ? 1 : 0);
                                c2084lc.s(10);
                                if (c2084lc.h()) {
                                    c2084lc.s(8);
                                }
                                if (i25 == 0) {
                                    c2084lc.s(5);
                                    if (c2084lc.h()) {
                                        c2084lc.s(8);
                                    }
                                }
                                if (b == 1 && c2084lc.h()) {
                                    c2084lc.s(16);
                                }
                                if (c2084lc.h()) {
                                    if (i25 > 2) {
                                        c2084lc.s(2);
                                    }
                                    if ((i25 & 1) == 0 || i25 <= 2) {
                                        i12 = 6;
                                    } else {
                                        i12 = 6;
                                        c2084lc.s(6);
                                    }
                                    if ((i25 & 4) != 0) {
                                        c2084lc.s(i12);
                                    }
                                    if (zH && c2084lc.h()) {
                                        c2084lc.s(5);
                                    }
                                    if (b != 0) {
                                        i8 = i6;
                                    } else {
                                        if (c2084lc.h()) {
                                            i13 = 6;
                                            c2084lc.s(6);
                                        } else {
                                            i13 = 6;
                                        }
                                        if (i25 == 0 && c2084lc.h()) {
                                            c2084lc.s(i13);
                                        }
                                        if (c2084lc.h()) {
                                            c2084lc.s(i13);
                                        }
                                        int i26 = c2084lc.i(2);
                                        if (i26 == 1) {
                                            c2084lc.s(5);
                                        } else if (i26 == 2) {
                                            c2084lc.s(12);
                                        } else {
                                            if (i26 == 3) {
                                                int i27 = c2084lc.i(5);
                                                if (c2084lc.h()) {
                                                    c2084lc.s(5);
                                                    if (c2084lc.h()) {
                                                        i15 = 4;
                                                        c2084lc.s(4);
                                                    } else {
                                                        i15 = 4;
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i15);
                                                    }
                                                    if (c2084lc.h()) {
                                                        if (c2084lc.h()) {
                                                            c2084lc.s(i15);
                                                        }
                                                        if (c2084lc.h()) {
                                                            c2084lc.s(i15);
                                                        }
                                                    }
                                                }
                                                if (c2084lc.h()) {
                                                    c2084lc.s(5);
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(7);
                                                        if (c2084lc.h()) {
                                                            c2084lc.s(8);
                                                        }
                                                    }
                                                }
                                                i14 = 2;
                                                c2084lc.s((i27 + 2) * 8);
                                                c2084lc.c();
                                            }
                                            if (i25 < i14) {
                                                if (c2084lc.h()) {
                                                    c2084lc.s(14);
                                                }
                                                if (i25 == 0 && c2084lc.h()) {
                                                    c2084lc.s(14);
                                                }
                                            }
                                            if (c2084lc.h()) {
                                                i8 = i6;
                                                if (i8 == 0) {
                                                    c2084lc.s(5);
                                                } else {
                                                    i16 = 5;
                                                    i17 = 0;
                                                    while (i17 < i7) {
                                                        if (c2084lc.h()) {
                                                            c2084lc.s(i16);
                                                        }
                                                        i17++;
                                                        i16 = 5;
                                                    }
                                                }
                                            } else {
                                                i8 = i6;
                                            }
                                        }
                                        i14 = 2;
                                        if (i25 < i14) {
                                            if (c2084lc.h()) {
                                                c2084lc.s(14);
                                            }
                                            if (i25 == 0) {
                                                c2084lc.s(14);
                                            }
                                        }
                                        if (c2084lc.h()) {
                                            i8 = i6;
                                            if (i8 == 0) {
                                                c2084lc.s(5);
                                            } else {
                                                i16 = 5;
                                                i17 = 0;
                                                while (i17 < i7) {
                                                    if (c2084lc.h()) {
                                                        c2084lc.s(i16);
                                                    }
                                                    i17++;
                                                    i16 = 5;
                                                }
                                            }
                                        } else {
                                            i8 = i6;
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                                if (c2084lc.h()) {
                                    c2084lc.s(5);
                                    if (i25 == 2) {
                                        c2084lc.s(4);
                                    }
                                    if (i25 >= 6) {
                                        c2084lc.s(2);
                                    }
                                    if (c2084lc.h()) {
                                        i11 = 8;
                                        c2084lc.s(8);
                                    } else {
                                        i11 = 8;
                                    }
                                    if (i25 == 0 && c2084lc.h()) {
                                        c2084lc.s(i11);
                                    }
                                    i9 = 3;
                                    if (i21 < 3) {
                                        c2084lc.r();
                                    }
                                } else {
                                    i9 = 3;
                                }
                                if (b == 0 && i8 != i9) {
                                    c2084lc.r();
                                }
                                if (b == 2 && (i8 == i9 || c2084lc.h())) {
                                    i10 = 6;
                                    c2084lc.s(6);
                                } else {
                                    i10 = 6;
                                }
                                str = (c2084lc.h() && c2084lc.i(i10) == 1 && c2084lc.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i24;
                            } else {
                                c2084lc.s(32);
                                int i28 = c2084lc.i(2);
                                String str2 = i28 == 3 ? null : "audio/ac3";
                                int i29 = c2084lc.i(6);
                                i = AbstractC0397Ej.e[i29 / 2] * 1000;
                                iN = AbstractC0397Ej.n(i28, i29);
                                c2084lc.s(8);
                                int i30 = c2084lc.i(3);
                                if ((i30 & 1) == 0 || i30 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    c2084lc.s(2);
                                }
                                if ((i30 & 4) != 0) {
                                    c2084lc.s(i2);
                                }
                                if (i30 == i2) {
                                    c2084lc.s(i2);
                                }
                                int i31 = i28 < 3 ? iArr2[i28] : -1;
                                i3 = iArr[i30] + (c2084lc.h() ? 1 : 0);
                                i4 = 1536;
                                str = str2;
                                i5 = i31;
                            }
                            C0643Nw c0643Nw = this.k;
                            if (c0643Nw == null || i3 != c0643Nw.J || i5 != c0643Nw.K || !Lr0.a(str, c0643Nw.w)) {
                                C0617Mw c0617Mw = new C0617Mw();
                                c0617Mw.a = this.e;
                                c0617Mw.k = str;
                                c0617Mw.x = i3;
                                c0617Mw.y = i5;
                                c0617Mw.c = this.d;
                                c0617Mw.g = i;
                                if ("audio/ac3".equals(str)) {
                                    c0617Mw.f = i;
                                }
                                C0643Nw c0643Nw2 = new C0643Nw(c0617Mw);
                                this.k = c0643Nw2;
                                this.f.a(c0643Nw2);
                            }
                            this.l = iN;
                            this.j = (((long) i4) * 1000000) / ((long) this.k.K);
                            c2562qX2.F(0);
                            this.f.e(128, c2562qX2);
                            this.g = 2;
                        }
                    } else if (i18 == 2) {
                        int iMin2 = Math.min(c2562qX.a(), this.l - this.h);
                        this.f.e(iMin2, c2562qX);
                        int i32 = this.h + iMin2;
                        this.h = i32;
                        int i33 = this.l;
                        if (i32 == i33) {
                            long j = this.m;
                            if (j != -9223372036854775807L) {
                                this.f.d(j, 1, i33, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC0397Ej.g(this.f);
                while (c2562qX.a() > 0) {
                    int i34 = this.g;
                    C2562qX c2562qX3 = this.c;
                    if (i34 == 0) {
                        while (c2562qX.a() > 0) {
                            if (this.i) {
                                int iU2 = c2562qX.u();
                                this.i = iU2 == 172;
                                if (iU2 == 64 || iU2 == 65) {
                                    boolean z2 = iU2 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = c2562qX3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z2 ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.i = c2562qX.u() == 172;
                            }
                            break;
                        }
                    } else if (i34 == 1) {
                        byte[] bArr4 = c2562qX3.a;
                        int iMin3 = Math.min(c2562qX.a(), 16 - this.h);
                        c2562qX.e(bArr4, this.h, iMin3);
                        int i35 = this.h + iMin3;
                        this.h = i35;
                        if (i35 == 16) {
                            C2084lc c2084lc2 = this.b;
                            c2084lc2.p(0);
                            C2712s0 c2712s0C = AbstractC2506pt.C(c2084lc2);
                            C0643Nw c0643Nw3 = this.k;
                            int i36 = c2712s0C.a;
                            if (c0643Nw3 == null || 2 != c0643Nw3.J || i36 != c0643Nw3.K || !"audio/ac4".equals(c0643Nw3.w)) {
                                C0617Mw c0617Mw2 = new C0617Mw();
                                c0617Mw2.a = this.e;
                                c0617Mw2.k = "audio/ac4";
                                c0617Mw2.x = 2;
                                c0617Mw2.y = i36;
                                c0617Mw2.c = this.d;
                                C0643Nw c0643Nw4 = new C0643Nw(c0617Mw2);
                                this.k = c0643Nw4;
                                this.f.a(c0643Nw4);
                            }
                            this.l = c2712s0C.b;
                            this.j = (((long) c2712s0C.c) * 1000000) / ((long) this.k.K);
                            c2562qX3.F(0);
                            this.f.e(16, c2562qX3);
                            this.g = 2;
                        }
                    } else if (i34 == 2) {
                        int iMin4 = Math.min(c2562qX.a(), this.l - this.h);
                        this.f.e(iMin4, c2562qX);
                        int i37 = this.h + iMin4;
                        this.h = i37;
                        int i38 = this.l;
                        if (i37 == i38) {
                            long j2 = this.m;
                            if (j2 != -9223372036854775807L) {
                                this.f.d(j2, 1, i38, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.m = j;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.m = j;
                }
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        switch (this.a) {
            case 0:
                ym0.a();
                ym0.b();
                this.e = ym0.e;
                ym0.b();
                this.f = interfaceC0354Cs.s(ym0.d, 1);
                break;
            default:
                ym0.a();
                ym0.b();
                this.e = ym0.e;
                ym0.b();
                this.f = interfaceC0354Cs.s(ym0.d, 1);
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
        int i = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }
}
