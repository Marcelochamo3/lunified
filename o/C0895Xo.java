package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0895Xo implements InterfaceC3273xp {
    public final String b;
    public String c;
    public InterfaceC1324dm0 d;
    public int f;
    public int g;
    public long h;
    public C0643Nw i;
    public int j;
    public final C2562qX a = new C2562qX(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public C0895Xo(String str) {
        this.b = str;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x020f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0217  */
    /* JADX WARN: Code duplicated, block: B:69:0x021a  */
    /* JADX WARN: Code duplicated, block: B:71:0x021e  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:74:0x023b  */
    /* JADX WARN: Code duplicated, block: B:75:0x024a  */
    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C2084lc c2084lc;
        int i9;
        int i10;
        AbstractC0397Ej.g(this.d);
        while (c2562qX.a() > 0) {
            int i11 = this.e;
            int i12 = 2;
            int i13 = 8;
            C2562qX c2562qX2 = this.a;
            if (i11 == 0) {
                while (c2562qX.a() > 0) {
                    int i14 = this.g << 8;
                    this.g = i14;
                    int iU = i14 | c2562qX.u();
                    this.g = iU;
                    if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                        byte[] bArr = c2562qX2.a;
                        bArr[0] = (byte) ((iU >> 24) & 255);
                        bArr[1] = (byte) ((iU >> 16) & 255);
                        bArr[2] = (byte) ((iU >> 8) & 255);
                        bArr[3] = (byte) (iU & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = c2562qX2.a;
                int iMin = Math.min(c2562qX.a(), 18 - this.f);
                c2562qX.e(bArr2, this.f, iMin);
                int i15 = this.f + iMin;
                this.f = i15;
                if (i15 == 18) {
                    byte[] bArr3 = c2562qX2.a;
                    if (this.i == null) {
                        String str = this.c;
                        if (bArr3[0] == 127) {
                            c2084lc = new C2084lc(bArr3.length, bArr3);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b = bArrCopyOf[0];
                            if (b == -2 || b == -1) {
                                for (int i16 = 0; i16 < bArrCopyOf.length - 1; i16 += 2) {
                                    byte b2 = bArrCopyOf[i16];
                                    int i17 = i16 + 1;
                                    bArrCopyOf[i16] = bArrCopyOf[i17];
                                    bArrCopyOf[i17] = b2;
                                }
                            }
                            C2084lc c2084lc2 = new C2084lc(bArrCopyOf.length, bArrCopyOf);
                            if (bArrCopyOf[0] == 31) {
                                C2084lc c2084lc3 = new C2084lc(bArrCopyOf.length, bArrCopyOf);
                                while (c2084lc3.b() >= 16) {
                                    c2084lc3.s(i12);
                                    int i18 = c2084lc3.i(14) & 16383;
                                    int iMin2 = Math.min(8 - c2084lc2.d, 14);
                                    int i19 = c2084lc2.d;
                                    int i20 = (8 - i19) - iMin2;
                                    int i21 = (C1531fs0.i >> i19) | ((1 << i20) - 1);
                                    byte[] bArr4 = c2084lc2.b;
                                    int i22 = c2084lc2.c;
                                    byte b3 = (byte) (bArr4[i22] & i21);
                                    bArr4[i22] = b3;
                                    int i23 = 14 - iMin2;
                                    bArr4[i22] = (byte) (b3 | ((i18 >>> i23) << i20));
                                    int i24 = i22 + 1;
                                    while (i23 > i13) {
                                        c2084lc2.b[i24] = (byte) (i18 >>> (i23 - 8));
                                        i23 -= 8;
                                        i24++;
                                        i13 = 8;
                                    }
                                    int i25 = 8 - i23;
                                    byte[] bArr5 = c2084lc2.b;
                                    byte b4 = (byte) (bArr5[i24] & ((1 << i25) - 1));
                                    bArr5[i24] = b4;
                                    bArr5[i24] = (byte) (((i18 & ((1 << i23) - 1)) << i25) | b4);
                                    c2084lc2.s(14);
                                    c2084lc2.a();
                                    i12 = 2;
                                    i13 = 8;
                                }
                            }
                            c2084lc2.n(bArrCopyOf.length, bArrCopyOf);
                            c2084lc = c2084lc2;
                        }
                        c2084lc.s(60);
                        int i26 = UK.c[c2084lc.i(6)];
                        int i27 = UK.d[c2084lc.i(4)];
                        int i28 = c2084lc.i(5);
                        if (i28 >= 29) {
                            i10 = -1;
                            i9 = 2;
                        } else {
                            int i29 = UK.e[i28] * 1000;
                            i9 = 2;
                            i10 = i29 / 2;
                        }
                        c2084lc.s(10);
                        int i30 = i26 + (c2084lc.i(i9) > 0 ? 1 : 0);
                        C0617Mw c0617Mw = new C0617Mw();
                        c0617Mw.a = str;
                        c0617Mw.k = "audio/vnd.dts";
                        c0617Mw.f = i10;
                        c0617Mw.x = i30;
                        c0617Mw.y = i27;
                        c0617Mw.n = null;
                        c0617Mw.c = this.b;
                        C0643Nw c0643Nw = new C0643Nw(c0617Mw);
                        this.i = c0643Nw;
                        this.d.a(c0643Nw);
                    }
                    byte b5 = bArr3[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i7 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            i8 = (bArr3[9] & 60) >> 2;
                        } else if (b5 != 31) {
                            i = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4) | ((bArr3[7] & 240) >> 4);
                        } else {
                            i7 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            i8 = (bArr3[8] & 60) >> 2;
                        }
                        i2 = (i7 | i8) + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.j = i2;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i6 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                            } else if (b5 != 31) {
                                i4 = (bArr3[4] & 1) << 6;
                                i5 = bArr3[5] & 252;
                                i3 = 2;
                            } else {
                                i3 = 2;
                                i4 = (7 & bArr3[5]) << 4;
                                i5 = bArr3[6] & 60;
                            }
                            this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.K));
                            c2562qX2.F(0);
                            this.d.e(18, c2562qX2);
                            this.e = 2;
                        } else {
                            i3 = 2;
                            i4 = (bArr3[5] & 1) << 6;
                            i5 = bArr3[4] & 252;
                        }
                        i6 = (i5 >> i3) | i4;
                        this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.K));
                        c2562qX2.F(0);
                        this.d.e(18, c2562qX2);
                        this.e = 2;
                    } else {
                        i = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4) | ((bArr3[6] & 240) >> 4);
                    }
                    i2 = i + 1;
                    z = false;
                    if (z) {
                        i2 = (i2 * 16) / 14;
                    }
                    this.j = i2;
                    if (b5 != -2) {
                        if (b5 != -1) {
                            i6 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                        } else if (b5 != 31) {
                            i4 = (bArr3[4] & 1) << 6;
                            i5 = bArr3[5] & 252;
                            i3 = 2;
                        } else {
                            i3 = 2;
                            i4 = (7 & bArr3[5]) << 4;
                            i5 = bArr3[6] & 60;
                        }
                        this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.K));
                        c2562qX2.F(0);
                        this.d.e(18, c2562qX2);
                        this.e = 2;
                    } else {
                        i3 = 2;
                        i4 = (bArr3[5] & 1) << 6;
                        i5 = bArr3[4] & 252;
                    }
                    i6 = (i5 >> i3) | i4;
                    this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.K));
                    c2562qX2.F(0);
                    this.d.e(18, c2562qX2);
                    this.e = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(c2562qX.a(), this.j - this.f);
                this.d.e(iMin3, c2562qX);
                int i31 = this.f + iMin3;
                this.f = i31;
                int i32 = this.j;
                if (i31 == i32) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.d.d(j, 1, i32, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
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
        this.c = ym0.e;
        ym0.b();
        this.d = interfaceC0354Cs.s(ym0.d, 1);
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
