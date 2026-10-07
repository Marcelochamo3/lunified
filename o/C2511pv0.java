package o;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: o.pv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2511pv0 implements InterfaceC2608qv0 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Yu0.b.m0, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final InterfaceC0354Cs a;
    public final InterfaceC1324dm0 b;
    public final A6 c;
    public final int d;
    public final byte[] e;
    public final C2562qX f;
    public final int g;
    public final C0643Nw h;
    public int i;
    public long j;
    public int k;
    public long l;

    public C2511pv0(InterfaceC0354Cs interfaceC0354Cs, InterfaceC1324dm0 interfaceC1324dm0, A6 a6) throws C2949uX {
        this.a = interfaceC0354Cs;
        this.b = interfaceC1324dm0;
        this.c = a6;
        int i = a6.m;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        C2562qX c2562qX = new C2562qX((byte[]) a6.p);
        c2562qX.n();
        int iN = c2562qX.n();
        this.d = iN;
        int i2 = a6.l;
        int i3 = a6.n;
        int i4 = (((i3 - (i2 * 4)) * 8) / (a6.f163o * i2)) + 1;
        if (iN != i4) {
            throw C2949uX.a("Expected frames per block: " + i4 + "; got: " + iN, null);
        }
        int iG = Lr0.g(iMax, iN);
        this.e = new byte[iG * i3];
        this.f = new C2562qX(iN * 2 * i2 * iG);
        int i5 = ((i3 * i) * 8) / iN;
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "audio/raw";
        c0617Mw.f = i5;
        c0617Mw.g = i5;
        c0617Mw.l = iMax * 2 * i2;
        c0617Mw.x = i2;
        c0617Mw.y = i;
        c0617Mw.z = 2;
        this.h = new C0643Nw(c0617Mw);
    }

    @Override // o.InterfaceC2608qv0
    public final void a(int i, long j) {
        this.a.i(new C2898tv0(this.c, this.d, i, j));
        this.b.a(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x014a  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0046 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011b A[EDGE_INSN: B:48:0x011b->B:35:0x011b BREAK  A[LOOP:1: B:17:0x004e->B:34:0x010f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC2608qv0
    public final boolean b(C0554Kk c0554Kk, long j) throws EOFException, InterruptedIOException {
        byte[] bArr;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        C2562qX c2562qX;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int iJ;
        int[] iArr;
        int i11;
        int i12;
        int iJ2;
        int i13;
        byte b;
        int i14;
        int i15;
        int i16;
        int i17;
        int iD;
        int i18 = this.k;
        A6 a6 = this.c;
        int i19 = i18 / (a6.l * 2);
        int i20 = this.g;
        int i21 = this.d;
        int iG = Lr0.g(i20 - i19, i21) * a6.n;
        boolean z2 = j == 0;
        while (true) {
            bArr = this.e;
            if (z2 && (i17 = this.i) < iG) {
                iD = c0554Kk.D(bArr, this.i, (int) Math.min(iG - i17, j));
                if (iD == -1) {
                    break;
                }
                this.i += iD;
                bArr = this.e;
                if (z2) {
                }
            }
            int i22 = this.i;
            i = a6.n;
            i2 = i22 / i;
            if (i2 > 0) {
                i4 = 0;
                while (true) {
                    c2562qX = this.f;
                    if (i4 < i2) {
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = a6.l;
                        if (i7 < i8) {
                            bArr2 = c2562qX.a;
                            int i23 = (i7 * 4) + (i4 * i);
                            i9 = (i8 * 4) + i23;
                            i10 = (i / i8) - 4;
                            iJ = (short) ((bArr[i23] & 255) | ((bArr[i23 + 1] & 255) << 8));
                            int i24 = bArr[i23 + 2] & 255;
                            boolean z3 = z2;
                            int iMin = Math.min(i24, 88);
                            iArr = n;
                            i11 = iArr[iMin];
                            i12 = ((i4 * i21 * i8) + i7) * 2;
                            bArr2[i12] = (byte) (iJ & 255);
                            bArr2[i12 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin;
                            int i25 = i20;
                            i13 = 0;
                            while (i13 < i10 * 2) {
                                b = bArr[((i13 / 8) * i8 * 4) + i9 + ((i13 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i14 = b & 255;
                                if (i13 % 2 == 0) {
                                    i15 = b & 15;
                                } else {
                                    i15 = i14 >> 4;
                                }
                                i16 = ((((i15 & 7) * 2) + 1) * i11) >> 3;
                                if ((i15 & 8) != 0) {
                                    i16 = -i16;
                                }
                                iJ = Lr0.j(iJ + i16, -32768, 32767);
                                i12 = (i8 * 2) + i12;
                                bArr2[i12] = (byte) (iJ & 255);
                                bArr2[i12 + 1] = (byte) (iJ >> 8);
                                iJ2 = Lr0.j(iJ2 + m[i15], 0, 88);
                                i11 = iArr[iJ2];
                                i13++;
                                i9 = i9;
                                bArr = bArr3;
                            }
                            i7++;
                            z2 = z3;
                            i20 = i25;
                        }
                    }
                    i4++;
                }
                i5 = i20;
                z = z2;
                int i26 = i21 * i2 * 2 * a6.l;
                c2562qX.F(0);
                c2562qX.E(i26);
                this.i -= i2 * i;
                int i27 = c2562qX.c;
                this.b.e(i27, c2562qX);
                i6 = this.k + i27;
                this.k = i6;
                if (i6 / (a6.l * 2) >= i5) {
                    d(i5);
                }
            } else {
                z = z2;
            }
            if (z && (i3 = this.k / (a6.l * 2)) > 0) {
                d(i3);
            }
            return z;
        }
        while (true) {
            bArr = this.e;
            if (z2) {
            }
            int i28 = this.i;
            i = a6.n;
            i2 = i28 / i;
            if (i2 > 0) {
                i4 = 0;
                while (true) {
                    c2562qX = this.f;
                    if (i4 < i2) {
                        break;
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = a6.l;
                        if (i7 < i8) {
                            bArr2 = c2562qX.a;
                            int i29 = (i7 * 4) + (i4 * i);
                            i9 = (i8 * 4) + i29;
                            i10 = (i / i8) - 4;
                            iJ = (short) ((bArr[i29] & 255) | ((bArr[i29 + 1] & 255) << 8));
                            int i210 = bArr[i29 + 2] & 255;
                            boolean z4 = z2;
                            int iMin2 = Math.min(i210, 88);
                            iArr = n;
                            i11 = iArr[iMin2];
                            i12 = ((i4 * i21 * i8) + i7) * 2;
                            bArr2[i12] = (byte) (iJ & 255);
                            bArr2[i12 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin2;
                            int i211 = i20;
                            i13 = 0;
                            while (i13 < i10 * 2) {
                                b = bArr[((i13 / 8) * i8 * 4) + i9 + ((i13 / 2) % 4)];
                                byte[] bArr4 = bArr;
                                i14 = b & 255;
                                if (i13 % 2 == 0) {
                                    i15 = b & 15;
                                } else {
                                    i15 = i14 >> 4;
                                }
                                i16 = ((((i15 & 7) * 2) + 1) * i11) >> 3;
                                if ((i15 & 8) != 0) {
                                    i16 = -i16;
                                }
                                iJ = Lr0.j(iJ + i16, -32768, 32767);
                                i12 = (i8 * 2) + i12;
                                bArr2[i12] = (byte) (iJ & 255);
                                bArr2[i12 + 1] = (byte) (iJ >> 8);
                                iJ2 = Lr0.j(iJ2 + m[i15], 0, 88);
                                i11 = iArr[iJ2];
                                i13++;
                                i9 = i9;
                                bArr = bArr4;
                            }
                            i7++;
                            z2 = z4;
                            i20 = i211;
                        }
                    }
                    i4++;
                }
                i5 = i20;
                z = z2;
                int i212 = i21 * i2 * 2 * a6.l;
                c2562qX.F(0);
                c2562qX.E(i212);
                this.i -= i2 * i;
                int i213 = c2562qX.c;
                this.b.e(i213, c2562qX);
                i6 = this.k + i213;
                this.k = i6;
                if (i6 / (a6.l * 2) >= i5) {
                    d(i5);
                }
            } else {
                z = z2;
            }
            if (z) {
                d(i3);
            }
            return z;
            this.i += iD;
        }
    }

    @Override // o.InterfaceC2608qv0
    public final void c(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        A6 a6 = this.c;
        long jR = j + Lr0.R(j2, 1000000L, a6.m);
        int i2 = i * 2 * a6.l;
        this.b.d(jR, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }
}
