package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Xu0 extends Fg0 {
    public C1909jm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f627o;
    public boolean p;
    public C3235xS q;
    public L80 r;

    @Override // o.Fg0
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        C3235xS c3235xS = this.q;
        this.f627o = c3235xS != null ? c3235xS.e : 0;
    }

    @Override // o.Fg0
    public final long b(C2562qX c2562qX) {
        byte b = c2562qX.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C1909jm0 c1909jm0 = this.n;
        AbstractC0397Ej.g(c1909jm0);
        boolean z = ((io.sentry.X1[]) c1909jm0.p)[(b >> 1) & (255 >>> (8 - c1909jm0.l))].a;
        C3235xS c3235xS = (C3235xS) c1909jm0.m;
        int i = !z ? c3235xS.e : c3235xS.f;
        long j = this.p ? (this.f627o + i) / 4 : 0;
        byte[] bArr = c2562qX.a;
        int length = bArr.length;
        int i2 = c2562qX.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            c2562qX.D(bArrCopyOf.length, bArrCopyOf);
        } else {
            c2562qX.E(i2);
        }
        byte[] bArr2 = c2562qX.a;
        int i3 = c2562qX.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.f627o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0384 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x0385  */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    @Override // o.Fg0
    public final boolean c(C2562qX c2562qX, long j, C2994uv c2994uv) throws C2949uX {
        C1909jm0 c1909jm0;
        C3235xS c3235xS;
        long jFloor;
        if (this.n != null) {
            ((C0643Nw) c2994uv.m).getClass();
            return false;
        }
        C3235xS c3235xS2 = this.q;
        int i = 4;
        if (c3235xS2 != null) {
            L80 l80 = this.r;
            if (l80 == null) {
                this.r = AbstractC1370eA.L(c2562qX, true, true);
            } else {
                int i2 = c2562qX.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(c2562qX.a, 0, bArr, 0, i2);
                int i3 = 5;
                AbstractC1370eA.R(5, c2562qX, false);
                int iU = c2562qX.u() + 1;
                C2084lc c2084lc = new C2084lc(c2562qX.a);
                c2084lc.s(c2562qX.b * 8);
                int i4 = 0;
                while (true) {
                    int i5 = 2;
                    int i6 = 16;
                    if (i4 >= iU) {
                        C3235xS c3235xS3 = c3235xS2;
                        byte[] bArr2 = bArr;
                        int i7 = 6;
                        int i8 = c2084lc.i(6) + 1;
                        for (int i9 = 0; i9 < i8; i9++) {
                            if (c2084lc.i(16) != 0) {
                                throw C2949uX.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i10 = c2084lc.i(6) + 1;
                        int i11 = 0;
                        while (true) {
                            int i12 = 3;
                            if (i11 >= i10) {
                                int i13 = c2084lc.i(i7) + 1;
                                int i14 = 0;
                                while (i14 < i13) {
                                    if (c2084lc.i(16) > 2) {
                                        throw C2949uX.a("residueType greater than 2 is not decodable", null);
                                    }
                                    c2084lc.s(24);
                                    c2084lc.s(24);
                                    c2084lc.s(24);
                                    int i15 = c2084lc.i(i7) + 1;
                                    int i16 = 8;
                                    c2084lc.s(8);
                                    int[] iArr = new int[i15];
                                    for (int i17 = 0; i17 < i15; i17++) {
                                        iArr[i17] = ((c2084lc.h() ? c2084lc.i(5) : 0) * 8) + c2084lc.i(3);
                                    }
                                    int i18 = 0;
                                    while (i18 < i15) {
                                        int i19 = 0;
                                        while (i19 < i16) {
                                            if ((iArr[i18] & (1 << i19)) != 0) {
                                                c2084lc.s(i16);
                                            }
                                            i19++;
                                            i16 = 8;
                                        }
                                        i18++;
                                        i16 = 8;
                                    }
                                    i14++;
                                    i7 = 6;
                                }
                                int i20 = c2084lc.i(i7) + 1;
                                int i21 = 0;
                                while (i21 < i20) {
                                    if (c2084lc.i(16) != 0) {
                                        AP.f();
                                        c3235xS = c3235xS3;
                                    } else {
                                        int i22 = c2084lc.h() ? c2084lc.i(4) + 1 : 1;
                                        boolean zH = c2084lc.h();
                                        c3235xS = c3235xS3;
                                        int i23 = c3235xS.a;
                                        if (zH) {
                                            int i24 = c2084lc.i(8) + 1;
                                            for (int i25 = 0; i25 < i24; i25++) {
                                                int i26 = i23 - 1;
                                                c2084lc.s(AbstractC1370eA.x(i26));
                                                c2084lc.s(AbstractC1370eA.x(i26));
                                            }
                                        }
                                        if (c2084lc.i(2) != 0) {
                                            throw C2949uX.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i22 > 1) {
                                            for (int i27 = 0; i27 < i23; i27++) {
                                                c2084lc.s(4);
                                            }
                                        }
                                        for (int i28 = 0; i28 < i22; i28++) {
                                            c2084lc.s(8);
                                            c2084lc.s(8);
                                            c2084lc.s(8);
                                        }
                                    }
                                    i21++;
                                    c3235xS3 = c3235xS;
                                }
                                C3235xS c3235xS4 = c3235xS3;
                                int i29 = c2084lc.i(6);
                                int i30 = i29 + 1;
                                io.sentry.X1[] x1Arr = new io.sentry.X1[i30];
                                for (int i31 = 0; i31 < i30; i31++) {
                                    boolean zH2 = c2084lc.h();
                                    c2084lc.i(16);
                                    c2084lc.i(16);
                                    c2084lc.i(8);
                                    io.sentry.X1 x1 = new io.sentry.X1();
                                    x1.a = zH2;
                                    x1Arr[i31] = x1;
                                }
                                if (!c2084lc.h()) {
                                    throw C2949uX.a("framing bit after modes not set as expected", null);
                                }
                                c1909jm0 = new C1909jm0(c3235xS4, l80, bArr2, x1Arr, AbstractC1370eA.x(i29));
                                break;
                            }
                            int i32 = c2084lc.i(i6);
                            if (i32 == 0) {
                                int i33 = 8;
                                c2084lc.s(8);
                                c2084lc.s(16);
                                c2084lc.s(16);
                                c2084lc.s(6);
                                c2084lc.s(8);
                                int i34 = c2084lc.i(4) + 1;
                                int i35 = 0;
                                while (i35 < i34) {
                                    c2084lc.s(i33);
                                    i35++;
                                    i33 = 8;
                                }
                            } else {
                                if (i32 != 1) {
                                    throw C2949uX.a("floor type greater than 1 not decodable: " + i32, null);
                                }
                                int i36 = c2084lc.i(5);
                                int[] iArr2 = new int[i36];
                                int i37 = -1;
                                for (int i38 = 0; i38 < i36; i38++) {
                                    int i39 = c2084lc.i(4);
                                    iArr2[i38] = i39;
                                    if (i39 > i37) {
                                        i37 = i39;
                                    }
                                }
                                int i40 = i37 + 1;
                                int[] iArr3 = new int[i40];
                                int i41 = 0;
                                while (i41 < i40) {
                                    iArr3[i41] = c2084lc.i(i12) + 1;
                                    int i42 = c2084lc.i(i5);
                                    int i43 = 8;
                                    if (i42 > 0) {
                                        c2084lc.s(8);
                                    }
                                    int i44 = 0;
                                    while (i44 < (1 << i42)) {
                                        c2084lc.s(i43);
                                        i44++;
                                        i43 = 8;
                                    }
                                    i41++;
                                    i12 = 3;
                                    i5 = 2;
                                }
                                c2084lc.s(2);
                                int i45 = c2084lc.i(4);
                                int i46 = 0;
                                int i47 = 0;
                                for (int i48 = 0; i48 < i36; i48++) {
                                    i46 += iArr3[iArr2[i48]];
                                    while (i47 < i46) {
                                        c2084lc.s(i45);
                                        i47++;
                                    }
                                }
                            }
                            i11++;
                            i7 = 6;
                            i6 = 16;
                            i5 = 2;
                        }
                    } else {
                        if (c2084lc.i(24) != 5653314) {
                            throw C2949uX.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((c2084lc.d * 8) + c2084lc.e), null);
                        }
                        int i49 = c2084lc.i(16);
                        int i50 = c2084lc.i(24);
                        if (c2084lc.h()) {
                            c2084lc.s(i3);
                            for (int i51 = 0; i51 < i50; i51 += c2084lc.i(AbstractC1370eA.x(i50 - i51))) {
                            }
                        } else {
                            boolean zH3 = c2084lc.h();
                            for (int i52 = 0; i52 < i50; i52++) {
                                if (!zH3) {
                                    c2084lc.s(i3);
                                } else if (c2084lc.h()) {
                                    c2084lc.s(i3);
                                }
                            }
                        }
                        int i53 = c2084lc.i(i);
                        if (i53 > 2) {
                            throw C2949uX.a("lookup type greater than 2 not decodable: " + i53, null);
                        }
                        if (i53 == 1 || i53 == 2) {
                            c2084lc.s(32);
                            c2084lc.s(32);
                            int i54 = c2084lc.i(i) + 1;
                            c2084lc.s(1);
                            if (i53 != 1) {
                                jFloor = ((long) i50) * ((long) i49);
                            } else if (i49 != 0) {
                                jFloor = (long) Math.floor(Math.pow(i50, 1.0d / ((double) i49)));
                            } else {
                                jFloor = 0;
                            }
                            c2084lc.s((int) (jFloor * ((long) i54)));
                        } else {
                            c3235xS2 = c3235xS2;
                            bArr = bArr;
                        }
                        i4++;
                        c3235xS2 = c3235xS2;
                        bArr = bArr;
                        i = 4;
                        i3 = 5;
                    }
                }
            }
            this.n = c1909jm0;
            if (c1909jm0 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            C3235xS c3235xS5 = (C3235xS) c1909jm0.m;
            arrayList.add((byte[]) c3235xS5.g);
            arrayList.add((byte[]) c1909jm0.f852o);
            CQ cqI = AbstractC1370eA.I(AbstractC0985aF.m((String[]) ((L80) c1909jm0.n).l));
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = "audio/vorbis";
            c0617Mw.f = c3235xS5.d;
            c0617Mw.g = c3235xS5.c;
            c0617Mw.x = c3235xS5.a;
            c0617Mw.y = c3235xS5.b;
            c0617Mw.m = arrayList;
            c0617Mw.i = cqI;
            c2994uv.m = new C0643Nw(c0617Mw);
            return true;
        }
        AbstractC1370eA.R(1, c2562qX, false);
        c2562qX.m();
        int iU2 = c2562qX.u();
        int iM = c2562qX.m();
        int i55 = c2562qX.i();
        if (i55 <= 0) {
            i55 = -1;
        }
        int i56 = c2562qX.i();
        int i57 = i56 <= 0 ? -1 : i56;
        c2562qX.i();
        int iU3 = c2562qX.u();
        int iPow = (int) Math.pow(2.0d, iU3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iU3 & 240) >> 4);
        c2562qX.u();
        ?? CopyOf = Arrays.copyOf(c2562qX.a, c2562qX.c);
        C3235xS c3235xS6 = new C3235xS();
        c3235xS6.a = iU2;
        c3235xS6.b = iM;
        c3235xS6.c = i55;
        c3235xS6.d = i57;
        c3235xS6.e = iPow;
        c3235xS6.f = iPow2;
        c3235xS6.g = CopyOf;
        this.q = c3235xS6;
        c1909jm0 = null;
        this.n = c1909jm0;
        if (c1909jm0 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        C3235xS c3235xS7 = (C3235xS) c1909jm0.m;
        arrayList2.add((byte[]) c3235xS7.g);
        arrayList2.add((byte[]) c1909jm0.f852o);
        CQ cqI2 = AbstractC1370eA.I(AbstractC0985aF.m((String[]) ((L80) c1909jm0.n).l));
        C0617Mw c0617Mw2 = new C0617Mw();
        c0617Mw2.k = "audio/vorbis";
        c0617Mw2.f = c3235xS7.d;
        c0617Mw2.g = c3235xS7.c;
        c0617Mw2.x = c3235xS7.a;
        c0617Mw2.y = c3235xS7.b;
        c0617Mw2.m = arrayList2;
        c0617Mw2.i = cqI2;
        c2994uv.m = new C0643Nw(c0617Mw2);
        return true;
    }

    @Override // o.Fg0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.f627o = 0;
        this.p = false;
    }
}
