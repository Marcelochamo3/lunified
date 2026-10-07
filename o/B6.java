package o;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class B6 {
    public static final byte[] a;

    static {
        int i = Lr0.a;
        a = "OpusHead".getBytes(AbstractC1402ed.c);
    }

    public static C3209x6 a(int i, C2562qX c2562qX) {
        c2562qX.F(i + 12);
        c2562qX.G(1);
        b(c2562qX);
        c2562qX.G(2);
        int iU = c2562qX.u();
        if ((iU & 128) != 0) {
            c2562qX.G(2);
        }
        if ((iU & 64) != 0) {
            c2562qX.G(c2562qX.u());
        }
        if ((iU & 32) != 0) {
            c2562qX.G(2);
        }
        c2562qX.G(1);
        b(c2562qX);
        String strF = IQ.f(c2562qX.u());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new C3209x6(strF, null, -1L, -1L);
        }
        c2562qX.G(4);
        long jV = c2562qX.v();
        long jV2 = c2562qX.v();
        c2562qX.G(1);
        int iB = b(c2562qX);
        byte[] bArr = new byte[iB];
        c2562qX.e(bArr, 0, iB);
        return new C3209x6(strF, bArr, jV2 > 0 ? jV2 : -1L, jV > 0 ? jV : -1L);
    }

    public static int b(C2562qX c2562qX) {
        int iU = c2562qX.u();
        int i = iU & Yu0.b.k0;
        while ((iU & 128) == 128) {
            iU = c2562qX.u();
            i = (i << 7) | (iU & Yu0.b.k0);
        }
        return i;
    }

    public static C3306y6 c(C2562qX c2562qX) {
        long jV;
        c2562qX.F(8);
        if (AbstractC3015v6.B(c2562qX.g()) == 0) {
            jV = c2562qX.v();
            c2562qX.G(4);
        } else {
            long jO = c2562qX.o();
            c2562qX.G(8);
            jV = jO;
        }
        return new C3306y6(new CQ(new C2581qi((jV - ((long) 2082844800)) * 1000)), c2562qX.v(), 0);
    }

    public static Pair d(C2562qX c2562qX, int i, int i2) throws C2949uX {
        Xl0 xl0;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = c2562qX.b;
        while (i5 - i < i2) {
            c2562qX.F(i5);
            int iG = c2562qX.g();
            AbstractC2506pt.i("childAtomSize must be positive", iG > 0);
            if (c2562qX.g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String strS = null;
                Integer numValueOf = null;
                while (i6 - i5 < iG) {
                    c2562qX.F(i6);
                    int iG2 = c2562qX.g();
                    int iG3 = c2562qX.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(c2562qX.g());
                    } else if (iG3 == 1935894637) {
                        c2562qX.G(4);
                        strS = c2562qX.s(4, AbstractC1402ed.c);
                    } else if (iG3 == 1935894633) {
                        i7 = i6;
                        i8 = iG2;
                    }
                    i6 += iG2;
                }
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    AbstractC2506pt.i("frma atom is mandatory", numValueOf != null);
                    AbstractC2506pt.i("schi atom is mandatory", i7 != -1);
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            xl0 = null;
                            break;
                        }
                        c2562qX.F(i9);
                        int iG4 = c2562qX.g();
                        if (c2562qX.g() == 1952804451) {
                            int iB = AbstractC3015v6.B(c2562qX.g());
                            c2562qX.G(1);
                            if (iB == 0) {
                                c2562qX.G(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iU = c2562qX.u();
                                int i10 = (iU & 240) >> 4;
                                i3 = iU & 15;
                                i4 = i10;
                            }
                            boolean z = c2562qX.u() == 1;
                            int iU2 = c2562qX.u();
                            byte[] bArr2 = new byte[16];
                            c2562qX.e(bArr2, 0, 16);
                            if (z && iU2 == 0) {
                                int iU3 = c2562qX.u();
                                byte[] bArr3 = new byte[iU3];
                                c2562qX.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            xl0 = new Xl0(z, strS, iU2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iG4;
                    }
                    AbstractC2506pt.i("tenc atom is mandatory", xl0 != null);
                    int i11 = Lr0.a;
                    pairCreate = Pair.create(numValueOf, xl0);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iG;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0290  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b7 A[DONT_INVERT, LOOP:12: B:111:0x02b7->B:115:0x02c1, LOOP_START, PHI: r16
  0x02b7: PHI (r16v3 int) = (r16v2 int), (r16v4 int) binds: [B:110:0x02b5, B:115:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c1 A[LOOP:12: B:111:0x02b7->B:115:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c7 A[EDGE_INSN: B:116:0x02c7->B:117:0x02c8 BREAK  A[LOOP:12: B:111:0x02b7->B:115:0x02c1]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d2 A[LOOP:4: B:162:0x03cf->B:164:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:168:0x0402  */
    /* JADX WARN: Code duplicated, block: B:170:0x0407  */
    /* JADX WARN: Code duplicated, block: B:171:0x0409  */
    /* JADX WARN: Code duplicated, block: B:175:0x041a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0422  */
    /* JADX WARN: Code duplicated, block: B:180:0x044c  */
    /* JADX WARN: Code duplicated, block: B:185:0x045f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0461  */
    /* JADX WARN: Code duplicated, block: B:188:0x0466  */
    /* JADX WARN: Code duplicated, block: B:192:0x0479  */
    /* JADX WARN: Code duplicated, block: B:193:0x047b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0480  */
    /* JADX WARN: Code duplicated, block: B:197:0x0483  */
    /* JADX WARN: Code duplicated, block: B:199:0x0486  */
    /* JADX WARN: Code duplicated, block: B:200:0x0489  */
    /* JADX WARN: Code duplicated, block: B:202:0x048d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0491  */
    /* JADX WARN: Code duplicated, block: B:205:0x0494  */
    /* JADX WARN: Code duplicated, block: B:209:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x04be  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:217:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:218:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:221:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:224:0x0503  */
    /* JADX WARN: Code duplicated, block: B:241:0x0457 A[ADDED_TO_REGION, EDGE_INSN: B:241:0x0457->B:183:0x0457 BREAK  A[LOOP:6: B:178:0x0446->B:182:0x0451], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x050a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0217 A[EDGE_INSN: B:252:0x0217->B:81:0x0217 BREAK  A[LOOP:10: B:77:0x01fa->B:80:0x0202], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0217 A[EDGE_INSN: B:253:0x0217->B:81:0x0217 BREAK  A[LOOP:10: B:77:0x01fa->B:80:0x0202], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d A[LOOP:0: B:60:0x0147->B:62:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0160 A[LOOP:1: B:64:0x015e->B:65:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e A[LOOP:3: B:69:0x018c->B:70:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202 A[LOOP:10: B:77:0x01fa->B:80:0x0202, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0239 A[ADDED_TO_REGION, LOOP:11: B:86:0x0239->B:88:0x023d, LOOP_START, PHI: r16 r23 r27
  0x0239: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:85:0x0237, B:88:0x023d] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r23v3 int) = (r23v1 int), (r23v5 int) binds: [B:85:0x0237, B:88:0x023d] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r27v4 int) = (r27v1 int), (r27v5 int) binds: [B:85:0x0237, B:88:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0256  */
    /* JADX WARN: Code duplicated, block: B:95:0x025e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    public static C1421em0 e(Wl0 wl0, C2821t6 c2821t6, C1642gz c1642gz) throws C2949uX {
        InterfaceC3403z6 interfaceC3403z6;
        boolean z;
        int iX;
        int iX2;
        int iX3;
        int iA;
        boolean z2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        int iX4;
        int i2;
        int i3;
        int i4;
        int iX5;
        long j;
        int iG;
        long j2;
        int i5;
        int i6;
        long j3;
        boolean z3;
        int i7;
        int[] iArr;
        long[] jArr;
        int i8;
        int[] iArr2;
        long j4;
        boolean zA;
        int i9;
        int iC;
        int i10;
        long j5;
        long jR;
        long j6;
        long[] jArr2;
        int length;
        int i11;
        long[] jArr3;
        int i12;
        int[] iArr3;
        int i13;
        int i14;
        long[] jArr4;
        long j7;
        boolean z4;
        boolean z5;
        int[] iArr4;
        int[] iArr5;
        int i15;
        boolean z6;
        int i16;
        int i17;
        long[] jArr5;
        boolean z7;
        boolean z8;
        long[] jArr6;
        int[] iArr6;
        int[] iArr7;
        long[] jArr7;
        int i18;
        int i19;
        long j8;
        long j9;
        int i20;
        int i21;
        int[] iArr8;
        long jR2;
        boolean z9;
        long j10;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        long j11;
        int i26;
        int i27;
        long[] jArr8;
        int[] iArr9;
        long j12;
        int i28;
        int i29;
        int iG2;
        long[] jArr9;
        int[] iArr10;
        long[] jArr10;
        int[] iArr11;
        int i30;
        int i31;
        int i32;
        int i33;
        long j13;
        int iMax;
        int i34;
        int i35;
        C2918u6 c2918u6F = c2821t6.F(1937011578);
        C0643Nw c0643Nw = wl0.f;
        if (c2918u6F != null) {
            FV fv = new FV();
            C2562qX c2562qX = c2918u6F.n;
            fv.n = c2562qX;
            c2562qX.F(12);
            int iX6 = c2562qX.x();
            if ("audio/raw".equals(c0643Nw.w)) {
                int iY = Lr0.y(c0643Nw.L, c0643Nw.J);
                if (iX6 == 0 || iX6 % iY != 0) {
                    AP.z();
                    iX6 = iY;
                }
            }
            if (iX6 == 0) {
                iX6 = -1;
            }
            fv.l = iX6;
            fv.m = c2562qX.x();
            interfaceC3403z6 = fv;
        } else {
            C2918u6 c2918u6F2 = c2821t6.F(1937013298);
            if (c2918u6F2 == null) {
                throw C2949uX.a("Track has no sample table size information", null);
            }
            A6 a6 = new A6();
            C2562qX c2562qX2 = c2918u6F2.n;
            a6.p = c2562qX2;
            c2562qX2.F(12);
            a6.m = c2562qX2.x() & 255;
            a6.l = c2562qX2.x();
            interfaceC3403z6 = a6;
        }
        int iB = interfaceC3403z6.b();
        if (iB == 0) {
            return new C1421em0(wl0, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        C2918u6 c2918u6F3 = c2821t6.F(1937007471);
        if (c2918u6F3 == null) {
            c2918u6F3 = c2821t6.F(1668232756);
            c2918u6F3.getClass();
            z = true;
        } else {
            z = false;
        }
        C2918u6 c2918u6F4 = c2821t6.F(1937011555);
        c2918u6F4.getClass();
        C2918u6 c2918u6F5 = c2821t6.F(1937011827);
        c2918u6F5.getClass();
        C2918u6 c2918u6F6 = c2821t6.F(1937011571);
        C2562qX c2562qX3 = c2918u6F6 != null ? c2918u6F6.n : null;
        C2918u6 c2918u6F7 = c2821t6.F(1668576371);
        C2562qX c2562qX4 = c2918u6F7 != null ? c2918u6F7.n : null;
        C3112w6 c3112w6 = new C3112w6(c2918u6F4.n, c2918u6F3.n, z);
        C2562qX c2562qX5 = c2918u6F5.n;
        c2562qX5.F(12);
        int iX7 = c2562qX5.x() - 1;
        int iX8 = c2562qX5.x();
        int iX9 = c2562qX5.x();
        if (c2562qX4 != null) {
            c2562qX4.F(12);
            iX = c2562qX4.x();
        } else {
            iX = 0;
        }
        if (c2562qX3 != null) {
            c2562qX3.F(12);
            iX2 = c2562qX3.x();
            if (iX2 > 0) {
                iX3 = c2562qX3.x() - 1;
            } else {
                c2562qX3 = null;
            }
            iA = interfaceC3403z6.a();
            String str = c0643Nw.w;
            if (iA == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iX7 == 0 && iX == 0 && iX2 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i27 = c3112w6.a;
                jArr8 = new long[i27];
                iArr9 = new int[i27];
                while (c3112w6.a()) {
                    int i36 = c3112w6.b;
                    jArr8[i36] = c3112w6.d;
                    iArr9[i36] = c3112w6.c;
                }
                j12 = iX9;
                i28 = C1672hI.a.e / iA;
                iG2 = 0;
                for (i29 = 0; i29 < i27; i29++) {
                    iG2 += Lr0.g(iArr9[i29], i28);
                }
                jArr9 = new long[iG2];
                iArr10 = new int[iG2];
                jArr10 = new long[iG2];
                iArr11 = new int[iG2];
                i30 = 0;
                i31 = 0;
                i32 = 0;
                i33 = 0;
                while (i31 < i27) {
                    int i37 = iArr9[i31];
                    j13 = jArr8[i31];
                    int i38 = i33;
                    int i39 = i27;
                    iMax = i32;
                    i34 = i38;
                    long[] jArr11 = jArr8;
                    i35 = i37;
                    while (i35 > 0) {
                        int iMin = Math.min(i28, i35);
                        jArr9[i34] = j13;
                        int[] iArr12 = iArr9;
                        int i40 = iA * iMin;
                        iArr10[i34] = i40;
                        iMax = Math.max(iMax, i40);
                        jArr10[i34] = ((long) i30) * j12;
                        iArr11[i34] = 1;
                        j13 += (long) iArr10[i34];
                        i30 += iMin;
                        i35 -= iMin;
                        i34++;
                        iArr9 = iArr12;
                        iA = iA;
                    }
                    i31++;
                    jArr8 = jArr11;
                    int i41 = i34;
                    i32 = iMax;
                    i27 = i39;
                    i33 = i41;
                }
                j3 = j12 * ((long) i30);
                i7 = iB;
                jArr = jArr10;
                iArr2 = iArr11;
                jArrCopyOf = jArr9;
                iArr = iArr10;
                i8 = i32;
            } else {
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                jArrCopyOf2 = new long[iB];
                iArrCopyOf2 = new int[iB];
                iX4 = iX3;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                iX5 = 0;
                j = 0;
                iG = 0;
                j2 = 0;
                while (true) {
                    if (i2 < iB) {
                        i = iX2;
                        i5 = iX7;
                        i6 = iX8;
                        break;
                    }
                    j4 = j2;
                    zA = true;
                    while (true) {
                        if (i4 != 0) {
                            i = iX2;
                            break;
                        }
                        zA = c3112w6.a();
                        if (zA) {
                            i = iX2;
                            break;
                        }
                        i = iX2;
                        int i42 = iX7;
                        long j14 = c3112w6.d;
                        i4 = c3112w6.c;
                        j4 = j14;
                        iX8 = iX8;
                        iB = iB;
                        iX7 = i42;
                    }
                    i9 = iB;
                    i5 = iX7;
                    i6 = iX8;
                    if (!zA) {
                        AP.z();
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                        iB = i2;
                        break;
                    }
                    if (c2562qX4 != null) {
                        while (iX5 == 0 && iX > 0) {
                            iX5 = c2562qX4.x();
                            iG = c2562qX4.g();
                            iX--;
                        }
                        iX5--;
                    }
                    int i43 = iG;
                    jArrCopyOf[i2] = j4;
                    iC = interfaceC3403z6.c();
                    iArrCopyOf[i2] = iC;
                    if (iC > i3) {
                        i3 = iC;
                    }
                    jArrCopyOf2[i2] = j + ((long) i43);
                    if (c2562qX3 == null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i2] = i10;
                    if (i2 == iX4) {
                        iArrCopyOf2[i2] = 1;
                        i--;
                        if (i > 0) {
                            c2562qX3.getClass();
                            iX4 = c2562qX3.x() - 1;
                        }
                    }
                    j += (long) iX9;
                    iX8 = i6 - 1;
                    if (iX8 == 0 || i5 <= 0) {
                        iX7 = i5;
                    } else {
                        iX8 = c2562qX5.x();
                        iX7 = i5 - 1;
                        iX9 = c2562qX5.g();
                    }
                    iG = i43;
                    long j15 = j4 + ((long) iArrCopyOf[i2]);
                    i4--;
                    i2++;
                    jArrCopyOf = jArrCopyOf;
                    j2 = j15;
                    iB = i9;
                }
                j3 = j + ((long) iG);
                if (c2562qX4 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (iX > 0) {
                        z3 = true;
                        break;
                    }
                    if (c2562qX4.x() != 0) {
                        z3 = false;
                        break;
                    }
                    c2562qX4.g();
                    iX--;
                }
                if (i == 0 || i6 != 0 || i4 != 0 || i5 != 0 || iX5 != 0 || !z3) {
                    AP.z();
                }
                i7 = iB;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i8 = i3;
                iArr2 = iArrCopyOf2;
            }
            j5 = j3;
            jR = Lr0.R(j5, 1000000L, wl0.c);
            j6 = wl0.c;
            jArr2 = wl0.h;
            if (jArr2 == null) {
                Lr0.S(jArr, j6);
                return new C1421em0(wl0, jArrCopyOf, iArr, i8, jArr, iArr2, jR);
            }
            length = jArr2.length;
            i11 = wl0.b;
            jArr3 = wl0.i;
            if (length != 1 && i11 == 1 && jArr.length >= 2) {
                jArr3.getClass();
                long j16 = jArr3[0];
                i14 = i11;
                iArr3 = iArr;
                i13 = i8;
                long jR3 = Lr0.R(jArr2[0], wl0.c, wl0.d) + j16;
                int length2 = jArr.length - 1;
                i12 = i7;
                int iJ = Lr0.j(4, 0, length2);
                jArr4 = jArr3;
                int iJ2 = Lr0.j(jArr.length - 4, 0, length2);
                long j17 = jArr[0];
                if (j17 <= j16 && j16 < jArr[iJ] && jArr[iJ2] < jR3 && jR3 <= j5) {
                    long j18 = j5 - jR3;
                    long jR4 = Lr0.R(j16 - j17, c0643Nw.K, wl0.c);
                    j7 = j5;
                    long jR5 = Lr0.R(j18, c0643Nw.K, wl0.c);
                    if ((jR4 != 0 || jR5 != 0) && jR4 <= C1707hi0.a && jR5 <= C1707hi0.a) {
                        c1642gz.a = (int) jR4;
                        c1642gz.b = (int) jR5;
                        Lr0.S(jArr, j6);
                        return new C1421em0(wl0, jArrCopyOf, iArr3, i13, jArr, iArr2, Lr0.R(jArr2[0], 1000000L, wl0.d));
                    }
                }
                z4 = true;
                if (jArr2.length == 1) {
                    if (jArr2[0] == 0) {
                        jArr4.getClass();
                        j11 = jArr4[0];
                        for (i26 = 0; i26 < jArr.length; i26++) {
                            jArr[i26] = Lr0.R(jArr[i26] - j11, 1000000L, wl0.c);
                        }
                        return new C1421em0(wl0, jArrCopyOf, iArr3, i13, jArr, iArr2, Lr0.R(j7 - j11, 1000000L, wl0.c));
                    }
                    z4 = true;
                }
                if (i14 == z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iArr4 = new int[jArr2.length];
                iArr5 = new int[jArr2.length];
                jArr4.getClass();
                i15 = 0;
                z6 = false;
                i16 = 0;
                i17 = 0;
                while (i15 < jArr2.length) {
                    j10 = jArr4[i15];
                    if (j10 != -1) {
                        boolean z11 = z6;
                        int i44 = i16;
                        i22 = i17;
                        long jR6 = Lr0.R(jArr2[i15], wl0.c, wl0.d);
                        i23 = 1;
                        iArr4[i15] = Lr0.f(jArr, j10, true);
                        iArr5[i15] = Lr0.b(jArr, j10 + jR6, z5);
                        while (true) {
                            i24 = iArr4[i15];
                            i25 = iArr5[i15];
                            if (i24 < i25 || (iArr2[i24] & i23) != 0) {
                                break;
                            }
                            iArr4[i15] = i24 + 1;
                            i23 = 1;
                        }
                        i16 = (i25 - i24) + i44;
                        if (i22 != i24) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z6 = z11 | z10;
                        i17 = i25;
                    }
                    i15++;
                    jArr2 = jArr2;
                }
                boolean z12 = z6;
                jArr5 = jArr2;
                if (i16 != i12) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z12 | z7;
                if (z8) {
                    jArr6 = new long[i16];
                } else {
                    jArr6 = jArrCopyOf;
                }
                if (z8) {
                    iArr6 = new int[i16];
                } else {
                    iArr6 = iArr3;
                }
                if (z8) {
                    i13 = 0;
                }
                if (z8) {
                    iArr7 = new int[i16];
                } else {
                    iArr7 = iArr2;
                }
                jArr7 = new long[i16];
                i18 = 0;
                i19 = 0;
                j8 = 0;
                while (i18 < jArr5.length) {
                    j9 = jArr4[i18];
                    i20 = iArr4[i18];
                    int[] iArr13 = iArr4;
                    i21 = iArr5[i18];
                    if (z8) {
                        int i45 = i21 - i20;
                        System.arraycopy(jArrCopyOf, i20, jArr6, i19, i45);
                        iArr8 = iArr3;
                        System.arraycopy(iArr8, i20, iArr6, i19, i45);
                        System.arraycopy(iArr2, i20, iArr7, i19, i45);
                    } else {
                        iArr8 = iArr3;
                    }
                    int i46 = i13;
                    while (i20 < i21) {
                        int[] iArr14 = iArr2;
                        int i47 = i21;
                        long jR7 = Lr0.R(j8, 1000000L, wl0.d);
                        int[] iArr15 = iArr7;
                        int i48 = i20;
                        jR2 = Lr0.R(jArr[i20] - j9, 1000000L, wl0.c);
                        long[] jArr12 = jArr;
                        if (i14 != 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            jR2 = Math.max(0L, jR2);
                        }
                        jArr7[i19] = jR7 + jR2;
                        if (!z8 && iArr6[i19] > i46) {
                            i46 = iArr8[i48];
                        }
                        i19++;
                        i20 = i48 + 1;
                        iArr2 = iArr14;
                        i21 = i47;
                        iArr7 = iArr15;
                        jArr = jArr12;
                    }
                    j8 += jArr5[i18];
                    i18++;
                    iArr2 = iArr2;
                    iArr3 = iArr8;
                    i13 = i46;
                    iArr4 = iArr13;
                    iArr5 = iArr5;
                    jArrCopyOf = jArrCopyOf;
                    iArr7 = iArr7;
                    jArr = jArr;
                }
                return new C1421em0(wl0, jArr6, iArr6, i13, jArr7, iArr7, Lr0.R(j8, 1000000L, wl0.d));
            }
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j7 = j5;
            z4 = true;
            if (jArr2.length == 1) {
                if (jArr2[0] == 0) {
                    jArr4.getClass();
                    j11 = jArr4[0];
                    while (i26 < jArr.length) {
                        jArr[i26] = Lr0.R(jArr[i26] - j11, 1000000L, wl0.c);
                    }
                    return new C1421em0(wl0, jArrCopyOf, iArr3, i13, jArr, iArr2, Lr0.R(j7 - j11, 1000000L, wl0.c));
                }
                z4 = true;
            }
            if (i14 == z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            iArr4 = new int[jArr2.length];
            iArr5 = new int[jArr2.length];
            jArr4.getClass();
            i15 = 0;
            z6 = false;
            i16 = 0;
            i17 = 0;
            while (i15 < jArr2.length) {
                j10 = jArr4[i15];
                if (j10 != -1) {
                    boolean z13 = z6;
                    int i49 = i16;
                    i22 = i17;
                    long jR8 = Lr0.R(jArr2[i15], wl0.c, wl0.d);
                    i23 = 1;
                    iArr4[i15] = Lr0.f(jArr, j10, true);
                    iArr5[i15] = Lr0.b(jArr, j10 + jR8, z5);
                    while (true) {
                        i24 = iArr4[i15];
                        i25 = iArr5[i15];
                        if (i24 < i25) {
                            break;
                        }
                        break;
                        break;
                        iArr4[i15] = i24 + 1;
                        i23 = 1;
                    }
                    i16 = (i25 - i24) + i49;
                    if (i22 != i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z6 = z13 | z10;
                    i17 = i25;
                }
                i15++;
                jArr2 = jArr2;
            }
            boolean z14 = z6;
            jArr5 = jArr2;
            if (i16 != i12) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z14 | z7;
            if (z8) {
                jArr6 = new long[i16];
            } else {
                jArr6 = jArrCopyOf;
            }
            if (z8) {
                iArr6 = new int[i16];
            } else {
                iArr6 = iArr3;
            }
            if (z8) {
                i13 = 0;
            }
            if (z8) {
                iArr7 = new int[i16];
            } else {
                iArr7 = iArr2;
            }
            jArr7 = new long[i16];
            i18 = 0;
            i19 = 0;
            j8 = 0;
            while (i18 < jArr5.length) {
                j9 = jArr4[i18];
                i20 = iArr4[i18];
                int[] iArr16 = iArr4;
                i21 = iArr5[i18];
                if (z8) {
                    int i410 = i21 - i20;
                    System.arraycopy(jArrCopyOf, i20, jArr6, i19, i410);
                    iArr8 = iArr3;
                    System.arraycopy(iArr8, i20, iArr6, i19, i410);
                    System.arraycopy(iArr2, i20, iArr7, i19, i410);
                } else {
                    iArr8 = iArr3;
                }
                int i411 = i13;
                while (i20 < i21) {
                    int[] iArr17 = iArr2;
                    int i412 = i21;
                    long jR9 = Lr0.R(j8, 1000000L, wl0.d);
                    int[] iArr18 = iArr7;
                    int i413 = i20;
                    jR2 = Lr0.R(jArr[i20] - j9, 1000000L, wl0.c);
                    long[] jArr13 = jArr;
                    if (i14 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        jR2 = Math.max(0L, jR2);
                    }
                    jArr7[i19] = jR9 + jR2;
                    if (!z8) {
                    }
                    i19++;
                    i20 = i413 + 1;
                    iArr2 = iArr17;
                    i21 = i412;
                    iArr7 = iArr18;
                    jArr = jArr13;
                }
                j8 += jArr5[i18];
                i18++;
                iArr2 = iArr2;
                iArr3 = iArr8;
                i13 = i411;
                iArr4 = iArr16;
                iArr5 = iArr5;
                jArrCopyOf = jArrCopyOf;
                iArr7 = iArr7;
                jArr = jArr;
            }
            return new C1421em0(wl0, jArr6, iArr6, i13, jArr7, iArr7, Lr0.R(j8, 1000000L, wl0.d));
        }
        iX2 = 0;
        iX3 = -1;
        iA = interfaceC3403z6.a();
        String str2 = c0643Nw.w;
        if (iA == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            i27 = c3112w6.a;
            jArr8 = new long[i27];
            iArr9 = new int[i27];
            while (c3112w6.a()) {
                int i310 = c3112w6.b;
                jArr8[i310] = c3112w6.d;
                iArr9[i310] = c3112w6.c;
            }
            j12 = iX9;
            i28 = C1672hI.a.e / iA;
            iG2 = 0;
            while (i29 < i27) {
                iG2 += Lr0.g(iArr9[i29], i28);
            }
            jArr9 = new long[iG2];
            iArr10 = new int[iG2];
            jArr10 = new long[iG2];
            iArr11 = new int[iG2];
            i30 = 0;
            i31 = 0;
            i32 = 0;
            i33 = 0;
            while (i31 < i27) {
                int i311 = iArr9[i31];
                j13 = jArr8[i31];
                int i312 = i33;
                int i313 = i27;
                iMax = i32;
                i34 = i312;
                long[] jArr14 = jArr8;
                i35 = i311;
                while (i35 > 0) {
                    int iMin2 = Math.min(i28, i35);
                    jArr9[i34] = j13;
                    int[] iArr19 = iArr9;
                    int i414 = iA * iMin2;
                    iArr10[i34] = i414;
                    iMax = Math.max(iMax, i414);
                    jArr10[i34] = ((long) i30) * j12;
                    iArr11[i34] = 1;
                    j13 += (long) iArr10[i34];
                    i30 += iMin2;
                    i35 -= iMin2;
                    i34++;
                    iArr9 = iArr19;
                    iA = iA;
                }
                i31++;
                jArr8 = jArr14;
                int i415 = i34;
                i32 = iMax;
                i27 = i313;
                i33 = i415;
            }
            j3 = j12 * ((long) i30);
            i7 = iB;
            jArr = jArr10;
            iArr2 = iArr11;
            jArrCopyOf = jArr9;
            iArr = iArr10;
            i8 = i32;
        } else {
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            jArrCopyOf2 = new long[iB];
            iArrCopyOf2 = new int[iB];
            iX4 = iX3;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            iX5 = 0;
            j = 0;
            iG = 0;
            j2 = 0;
            while (true) {
                if (i2 < iB) {
                    i = iX2;
                    i5 = iX7;
                    i6 = iX8;
                    break;
                }
                j4 = j2;
                zA = true;
                while (true) {
                    if (i4 != 0) {
                        i = iX2;
                        break;
                    }
                    zA = c3112w6.a();
                    if (zA) {
                        i = iX2;
                        break;
                    }
                    i = iX2;
                    int i416 = iX7;
                    long j19 = c3112w6.d;
                    i4 = c3112w6.c;
                    j4 = j19;
                    iX8 = iX8;
                    iB = iB;
                    iX7 = i416;
                }
                i9 = iB;
                i5 = iX7;
                i6 = iX8;
                if (!zA) {
                    AP.z();
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                    iB = i2;
                    break;
                }
                if (c2562qX4 != null) {
                    while (iX5 == 0) {
                        iX5 = c2562qX4.x();
                        iG = c2562qX4.g();
                        iX--;
                    }
                    iX5--;
                }
                int i417 = iG;
                jArrCopyOf[i2] = j4;
                iC = interfaceC3403z6.c();
                iArrCopyOf[i2] = iC;
                if (iC > i3) {
                    i3 = iC;
                }
                jArrCopyOf2[i2] = j + ((long) i417);
                if (c2562qX3 == null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArrCopyOf2[i2] = i10;
                if (i2 == iX4) {
                    iArrCopyOf2[i2] = 1;
                    i--;
                    if (i > 0) {
                        c2562qX3.getClass();
                        iX4 = c2562qX3.x() - 1;
                    }
                }
                j += (long) iX9;
                iX8 = i6 - 1;
                if (iX8 == 0) {
                    iX7 = i5;
                } else {
                    iX7 = i5;
                }
                iG = i417;
                long j110 = j4 + ((long) iArrCopyOf[i2]);
                i4--;
                i2++;
                jArrCopyOf = jArrCopyOf;
                j2 = j110;
                iB = i9;
            }
            j3 = j + ((long) iG);
            if (c2562qX4 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (iX > 0) {
                    z3 = true;
                    break;
                }
                if (c2562qX4.x() != 0) {
                    z3 = false;
                    break;
                }
                c2562qX4.g();
                iX--;
            }
            if (i == 0) {
                AP.z();
            } else {
                AP.z();
            }
            i7 = iB;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i8 = i3;
            iArr2 = iArrCopyOf2;
        }
        j5 = j3;
        jR = Lr0.R(j5, 1000000L, wl0.c);
        j6 = wl0.c;
        jArr2 = wl0.h;
        if (jArr2 == null) {
            Lr0.S(jArr, j6);
            return new C1421em0(wl0, jArrCopyOf, iArr, i8, jArr, iArr2, jR);
        }
        length = jArr2.length;
        i11 = wl0.b;
        jArr3 = wl0.i;
        if (length != 1) {
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j7 = j5;
        } else {
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j7 = j5;
        }
        z4 = true;
        if (jArr2.length == 1) {
            if (jArr2[0] == 0) {
                jArr4.getClass();
                j11 = jArr4[0];
                while (i26 < jArr.length) {
                    jArr[i26] = Lr0.R(jArr[i26] - j11, 1000000L, wl0.c);
                }
                return new C1421em0(wl0, jArrCopyOf, iArr3, i13, jArr, iArr2, Lr0.R(j7 - j11, 1000000L, wl0.c));
            }
            z4 = true;
        }
        if (i14 == z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        iArr4 = new int[jArr2.length];
        iArr5 = new int[jArr2.length];
        jArr4.getClass();
        i15 = 0;
        z6 = false;
        i16 = 0;
        i17 = 0;
        while (i15 < jArr2.length) {
            j10 = jArr4[i15];
            if (j10 != -1) {
                boolean z15 = z6;
                int i418 = i16;
                i22 = i17;
                long jR10 = Lr0.R(jArr2[i15], wl0.c, wl0.d);
                i23 = 1;
                iArr4[i15] = Lr0.f(jArr, j10, true);
                iArr5[i15] = Lr0.b(jArr, j10 + jR10, z5);
                while (true) {
                    i24 = iArr4[i15];
                    i25 = iArr5[i15];
                    if (i24 < i25) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr4[i15] = i24 + 1;
                    i23 = 1;
                }
                i16 = (i25 - i24) + i418;
                if (i22 != i24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z6 = z15 | z10;
                i17 = i25;
            }
            i15++;
            jArr2 = jArr2;
        }
        boolean z16 = z6;
        jArr5 = jArr2;
        if (i16 != i12) {
            z7 = true;
        } else {
            z7 = false;
        }
        z8 = z16 | z7;
        if (z8) {
            jArr6 = new long[i16];
        } else {
            jArr6 = jArrCopyOf;
        }
        if (z8) {
            iArr6 = new int[i16];
        } else {
            iArr6 = iArr3;
        }
        if (z8) {
            i13 = 0;
        }
        if (z8) {
            iArr7 = new int[i16];
        } else {
            iArr7 = iArr2;
        }
        jArr7 = new long[i16];
        i18 = 0;
        i19 = 0;
        j8 = 0;
        while (i18 < jArr5.length) {
            j9 = jArr4[i18];
            i20 = iArr4[i18];
            int[] iArr110 = iArr4;
            i21 = iArr5[i18];
            if (z8) {
                int i419 = i21 - i20;
                System.arraycopy(jArrCopyOf, i20, jArr6, i19, i419);
                iArr8 = iArr3;
                System.arraycopy(iArr8, i20, iArr6, i19, i419);
                System.arraycopy(iArr2, i20, iArr7, i19, i419);
            } else {
                iArr8 = iArr3;
            }
            int i4110 = i13;
            while (i20 < i21) {
                int[] iArr111 = iArr2;
                int i4111 = i21;
                long jR11 = Lr0.R(j8, 1000000L, wl0.d);
                int[] iArr112 = iArr7;
                int i4112 = i20;
                jR2 = Lr0.R(jArr[i20] - j9, 1000000L, wl0.c);
                long[] jArr15 = jArr;
                if (i14 != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    jR2 = Math.max(0L, jR2);
                }
                jArr7[i19] = jR11 + jR2;
                if (!z8) {
                }
                i19++;
                i20 = i4112 + 1;
                iArr2 = iArr111;
                i21 = i4111;
                iArr7 = iArr112;
                jArr = jArr15;
            }
            j8 += jArr5[i18];
            i18++;
            iArr2 = iArr2;
            iArr3 = iArr8;
            i13 = i4110;
            iArr4 = iArr110;
            iArr5 = iArr5;
            jArrCopyOf = jArrCopyOf;
            iArr7 = iArr7;
            jArr = jArr;
        }
        return new C1421em0(wl0, jArr6, iArr6, i13, jArr7, iArr7, Lr0.R(j8, 1000000L, wl0.d));
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0252  */
    /* JADX WARN: Code duplicated, block: B:323:0x056e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0579  */
    /* JADX WARN: Code duplicated, block: B:326:0x057b  */
    /* JADX WARN: Code duplicated, block: B:329:0x058a  */
    /* JADX WARN: Code duplicated, block: B:331:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:333:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:341:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:345:0x063a  */
    /* JADX WARN: Code duplicated, block: B:347:0x0641  */
    /* JADX WARN: Code duplicated, block: B:349:0x067a  */
    /* JADX WARN: Code duplicated, block: B:352:0x068b  */
    /* JADX WARN: Code duplicated, block: B:354:0x0697  */
    /* JADX WARN: Code duplicated, block: B:356:0x069d  */
    /* JADX WARN: Code duplicated, block: B:359:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:361:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:362:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:364:0x06df  */
    /* JADX WARN: Code duplicated, block: B:366:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:368:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:369:0x0703  */
    /* JADX WARN: Code duplicated, block: B:371:0x0725  */
    /* JADX WARN: Code duplicated, block: B:373:0x072b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:374:0x072d  */
    /* JADX WARN: Code duplicated, block: B:377:0x0749  */
    /* JADX WARN: Code duplicated, block: B:381:0x0753  */
    /* JADX WARN: Code duplicated, block: B:396:0x082e  */
    /* JADX WARN: Code duplicated, block: B:398:0x083d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0842  */
    /* JADX WARN: Code duplicated, block: B:402:0x0846  */
    /* JADX WARN: Code duplicated, block: B:404:0x0849  */
    /* JADX WARN: Code duplicated, block: B:408:0x0852  */
    /* JADX WARN: Code duplicated, block: B:410:0x085d  */
    /* JADX WARN: Code duplicated, block: B:411:0x085f  */
    /* JADX WARN: Code duplicated, block: B:415:0x086d A[LOOP:4: B:406:0x084e->B:415:0x086d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x087a  */
    /* JADX WARN: Code duplicated, block: B:420:0x0888  */
    /* JADX WARN: Code duplicated, block: B:422:0x0890  */
    /* JADX WARN: Code duplicated, block: B:423:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:425:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:426:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:436:0x0925  */
    /* JADX WARN: Code duplicated, block: B:440:0x0951  */
    /* JADX WARN: Code duplicated, block: B:442:0x095b  */
    /* JADX WARN: Code duplicated, block: B:444:0x0967  */
    /* JADX WARN: Code duplicated, block: B:445:0x0969  */
    /* JADX WARN: Code duplicated, block: B:447:0x097a  */
    /* JADX WARN: Code duplicated, block: B:449:0x0981  */
    /* JADX WARN: Code duplicated, block: B:452:0x098f  */
    /* JADX WARN: Code duplicated, block: B:453:0x0992  */
    /* JADX WARN: Code duplicated, block: B:455:0x0997  */
    /* JADX WARN: Code duplicated, block: B:456:0x0999  */
    /* JADX WARN: Code duplicated, block: B:460:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:462:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:467:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:468:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:471:0x09f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:472:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:474:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a44 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:484:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:610:0x0cd2  */
    /* JADX WARN: Code duplicated, block: B:611:0x0cd7  */
    /* JADX WARN: Code duplicated, block: B:616:0x0cfa  */
    /* JADX WARN: Code duplicated, block: B:617:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:619:0x0d36 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:622:0x0d3c  */
    /* JADX WARN: Code duplicated, block: B:624:0x0d40  */
    /* JADX WARN: Code duplicated, block: B:625:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d4d  */
    /* JADX WARN: Code duplicated, block: B:634:0x0d9a  */
    /* JADX WARN: Code duplicated, block: B:636:0x0da5  */
    /* JADX WARN: Code duplicated, block: B:638:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:639:0x0db0  */
    /* JADX WARN: Code duplicated, block: B:641:0x0dca  */
    /* JADX WARN: Code duplicated, block: B:643:0x0dcd  */
    /* JADX WARN: Code duplicated, block: B:644:0x0dd2  */
    /* JADX WARN: Code duplicated, block: B:647:0x0dda  */
    /* JADX WARN: Code duplicated, block: B:648:0x0ddf  */
    /* JADX WARN: Code duplicated, block: B:651:0x0dec A[LOOP:7: B:640:0x0dc8->B:651:0x0dec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:656:0x0e01  */
    /* JADX WARN: Code duplicated, block: B:657:0x0e0a  */
    /* JADX WARN: Code duplicated, block: B:660:0x0e10  */
    /* JADX WARN: Code duplicated, block: B:661:0x0e12  */
    /* JADX WARN: Code duplicated, block: B:672:0x0e77 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0735 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0df3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0874 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0840 A[EDGE_INSN: B:688:0x0840->B:399:0x0840 BREAK  A[LOOP:4: B:406:0x084e->B:415:0x086d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0cee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    /* JADX WARN: Code duplicated, block: B:83:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f8  */
    public static ArrayList f(C2821t6 c2821t6, C1642gz c1642gz, long j, C3271xo c3271xo, boolean z, boolean z2, InterfaceC0671Oy interfaceC0671Oy) {
        int i;
        long jV;
        int i2;
        int i3;
        long j2;
        long j3;
        long jR;
        int iB;
        int i4;
        int i5;
        Pair pairCreate;
        C2918u6 c2918u6F;
        String str;
        C2562qX c2562qX;
        int iG;
        Xl0[] xl0Arr;
        int i6;
        C0643Nw c0643Nw;
        int i7;
        int i8;
        ArrayList arrayList;
        int i9;
        C2821t6 c2821t7;
        long j4;
        Pair pair;
        int i10;
        int i11;
        Xl0[] xl0Arr2;
        C0643Nw c0643Nw2;
        long[] jArr;
        long[] jArr2;
        Wl0 wl0;
        C2821t6 c2821t6E;
        C2918u6 c2918u6F2;
        C2562qX c2562qX2;
        int iB2;
        int iX;
        long[] jArr3;
        long[] jArr4;
        int i12;
        Pair pairCreate2;
        long jV2;
        long jG;
        int i13;
        int iG2;
        boolean z3;
        int iG3;
        int i14;
        Xl0[] xl0Arr3;
        C0643Nw c0643Nw3;
        String str2;
        int iZ;
        int iZ2;
        int i15;
        int i16;
        int i17;
        C3271xo c3271xoA;
        String str3;
        C3271xo c3271xo2;
        String str4;
        int i18;
        byte[] bArr;
        int iC;
        int i19;
        String str5;
        ByteBuffer byteBufferOrder;
        C3209x6 c3209x6;
        int i20;
        boolean z4;
        List list;
        int i21;
        int i22;
        float fX;
        byte[] bArr2;
        int i23;
        String str6;
        C0617Mw c0617Mw;
        int i24;
        int i25;
        byte[] bArrArray;
        int i26;
        int iG4;
        boolean z5;
        int iG5;
        int i27;
        int i28;
        int i29;
        String str7;
        J2 j2E;
        String str8;
        byte[] bArrCopyOfRange;
        boolean z6;
        C2733sB c2733sBA;
        float f;
        int i30;
        String str9;
        List list2;
        String str10;
        int i31;
        float f2;
        int i32;
        int i33;
        boolean z7;
        C2920u7 c2920u7A;
        float f3;
        Pair pairD;
        int iZ3;
        int iRound;
        int i34;
        int iX2;
        int i35;
        int i36;
        int i37;
        C3271xo c3271xo3;
        String str11;
        int i38;
        int i39;
        int iIntValue;
        int i40;
        String str12;
        List listQ;
        C3209x6 c3209x7;
        int iG6;
        boolean z8;
        int iG7;
        String str13;
        int i41;
        int i42;
        boolean z9;
        String str14;
        int iG8;
        boolean z10;
        int i43;
        List list3;
        C3209x6 c3209x6A;
        String str15;
        byte[] bArr3;
        int i44;
        int i45;
        int[] iArr;
        int[] iArr2;
        String str16;
        int i46;
        int i47;
        int i48;
        List listQ2;
        int i49;
        C2084lc c2084lc;
        int i50;
        int i51;
        String str17;
        C2084lc c2084lc2;
        int i52;
        long j5;
        M60 m60Q;
        ArrayList arrayList2 = new ArrayList();
        int i53 = 0;
        while (true) {
            ArrayList arrayList3 = c2821t6.p;
            if (i53 >= arrayList3.size()) {
                return arrayList2;
            }
            C2821t6 c2821t8 = (C2821t6) arrayList3.get(i53);
            if (c2821t8.m != 1953653099) {
                i9 = i53;
            } else {
                C2918u6 c2918u6F3 = c2821t6.F(1836476516);
                c2918u6F3.getClass();
                C2821t6 c2821t6E2 = c2821t8.E(1835297121);
                c2821t6E2.getClass();
                C2918u6 c2918u6F4 = c2821t6E2.F(1751411826);
                c2918u6F4.getClass();
                C2562qX c2562qX3 = c2918u6F4.n;
                c2562qX3.F(16);
                int iG9 = c2562qX3.g();
                if (iG9 == 1936684398) {
                    i = 1;
                } else if (iG9 == 1986618469) {
                    i = 2;
                } else if (iG9 == 1952807028 || iG9 == 1935832172 || iG9 == 1937072756 || iG9 == 1668047728) {
                    i = 3;
                } else {
                    i = iG9 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList2;
                    i9 = i53;
                    wl0 = null;
                } else {
                    C2918u6 c2918u6F5 = c2821t8.F(1953196132);
                    c2918u6F5.getClass();
                    C2562qX c2562qX4 = c2918u6F5.n;
                    c2562qX4.F(8);
                    int iB3 = AbstractC3015v6.B(c2562qX4.g());
                    c2562qX4.G(iB3 == 0 ? 8 : 16);
                    int iG10 = c2562qX4.g();
                    c2562qX4.G(4);
                    int i54 = c2562qX4.b;
                    int i55 = iB3 == 0 ? 4 : 8;
                    int i56 = 0;
                    while (true) {
                        if (i56 >= i55) {
                            c2562qX4.G(i55);
                        } else {
                            if (c2562qX4.a[i54 + i56] != -1) {
                                jV = iB3 == 0 ? c2562qX4.v() : c2562qX4.y();
                                if (jV != 0) {
                                    break;
                                }
                                break;
                            }
                            i56++;
                        }
                        jV = -9223372036854775807L;
                        break;
                    }
                    c2562qX4.G(16);
                    int iG11 = c2562qX4.g();
                    int iG12 = c2562qX4.g();
                    c2562qX4.G(4);
                    int iG13 = c2562qX4.g();
                    int iG14 = c2562qX4.g();
                    if (iG11 == 0 && iG12 == 65536) {
                        i2 = -65536;
                        if (iG13 == -65536 && iG14 == 0) {
                            i3 = 90;
                        }
                        if (j == -9223372036854775807L) {
                            j2 = jV;
                        } else {
                            j2 = j;
                        }
                        j3 = c(c2918u6F3.n).m;
                        jR = j2 != -9223372036854775807L ? Lr0.R(j2, 1000000L, j3) : -9223372036854775807L;
                        C2821t6 c2821t6E3 = c2821t6E2.E(1835626086);
                        c2821t6E3.getClass();
                        C2821t6 c2821t6E4 = c2821t6E3.E(1937007212);
                        c2821t6E4.getClass();
                        C2918u6 c2918u6F6 = c2821t6E2.F(1835296868);
                        c2918u6F6.getClass();
                        C2562qX c2562qX5 = c2918u6F6.n;
                        c2562qX5.F(8);
                        iB = AbstractC3015v6.B(c2562qX5.g());
                        if (iB == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        c2562qX5.G(i4);
                        long jV3 = c2562qX5.v();
                        if (iB == 0) {
                            i5 = 4;
                        } else {
                            i5 = 8;
                        }
                        c2562qX5.G(i5);
                        int iZ4 = c2562qX5.z();
                        pairCreate = Pair.create(Long.valueOf(jV3), "" + ((char) (((iZ4 >> 10) & 31) + 96)) + ((char) (((iZ4 >> 5) & 31) + 96)) + ((char) ((iZ4 & 31) + 96)));
                        c2918u6F = c2821t6E4.F(1937011556);
                        if (c2918u6F != null) {
                            throw C2949uX.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        str = (String) pairCreate.second;
                        c2562qX = c2918u6F.n;
                        c2562qX.F(12);
                        iG = c2562qX.g();
                        xl0Arr = new Xl0[iG];
                        i6 = 0;
                        c0643Nw = null;
                        i7 = 0;
                        i8 = 0;
                        while (i6 < iG) {
                            int i57 = iG;
                            i13 = c2562qX.b;
                            int i58 = i53;
                            iG2 = c2562qX.g();
                            ArrayList arrayList4 = arrayList2;
                            long j6 = j3;
                            if (iG2 > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String str18 = "childAtomSize must be positive";
                            AbstractC2506pt.i("childAtomSize must be positive", z3);
                            iG3 = c2562qX.g();
                            if (iG3 != 1635148593 || iG3 == 1635148595 || iG3 == 1701733238 || iG3 == 1831958048 || iG3 == 1836070006 || iG3 == 1752589105 || iG3 == 1751479857 || iG3 == 1932670515 || iG3 == 1211250227 || iG3 == 1987063864 || iG3 == 1987063865 || iG3 == 1635135537 || iG3 == 1685479798 || iG3 == 1685479729 || iG3 == 1685481573 || iG3 == 1685481521) {
                                i6 = i6;
                                i14 = i3;
                                c2821t8 = c2821t8;
                                pairCreate = pairCreate;
                                xl0Arr3 = xl0Arr;
                                c0643Nw3 = c0643Nw;
                                str2 = "childAtomSize must be positive";
                                c2562qX.F(i13 + 16);
                                c2562qX.G(16);
                                iZ = c2562qX.z();
                                iZ2 = c2562qX.z();
                                c2562qX.G(50);
                                i15 = c2562qX.b;
                                if (iG3 == 1701733238) {
                                    i16 = iG2;
                                    i17 = i13;
                                    pairD = d(c2562qX, i17, i16);
                                    if (pairD != null) {
                                        iG3 = ((Integer) pairD.first).intValue();
                                        if (c3271xo == null) {
                                            c3271xoA = null;
                                        } else {
                                            c3271xoA = c3271xo.a(((Xl0) pairD.second).b);
                                        }
                                        xl0Arr3[i6] = (Xl0) pairD.second;
                                    } else {
                                        c3271xoA = c3271xo;
                                    }
                                    c2562qX.F(i15);
                                } else {
                                    i16 = iG2;
                                    i17 = i13;
                                    c3271xoA = c3271xo;
                                }
                                if (iG3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iG3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                str = str;
                                c3271xo2 = c3271xoA;
                                str4 = str3;
                                i18 = i8;
                                bArr = null;
                                iC = -1;
                                i19 = -1;
                                str5 = null;
                                byteBufferOrder = null;
                                c3209x6 = null;
                                i20 = -1;
                                z4 = false;
                                list = null;
                                i21 = -1;
                                i22 = i15;
                                fX = 1.0f;
                                while (true) {
                                    if (i22 - i17 >= i16) {
                                        bArr2 = bArr;
                                        fX = fX;
                                        break;
                                    }
                                    c2562qX.F(i22);
                                    i26 = c2562qX.b;
                                    bArr2 = bArr;
                                    iG4 = c2562qX.g();
                                    fX = fX;
                                    if (iG4 != 0 && c2562qX.b - i17 == i16) {
                                        break;
                                    }
                                    if (iG4 > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    AbstractC2506pt.i(str2, z5);
                                    iG5 = c2562qX.g();
                                    String str19 = str2;
                                    if (iG5 == 1635148611) {
                                        if (str4 == null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        AbstractC2506pt.i(null, z7);
                                        c2562qX.F(i26 + 8);
                                        c2920u7A = C2920u7.a(c2562qX);
                                        if (z4) {
                                            f3 = fX;
                                        } else {
                                            f3 = c2920u7A.h;
                                        }
                                        i30 = c2920u7A.b;
                                        str9 = "video/avc";
                                        list2 = c2920u7A.a;
                                        str10 = c2920u7A.i;
                                        i31 = c2920u7A.e;
                                        f2 = f3;
                                        i32 = c2920u7A.f;
                                        i33 = c2920u7A.g;
                                    } else {
                                        if (iG5 == 1752589123) {
                                            if (str4 == null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            AbstractC2506pt.i(null, z6);
                                            c2562qX.F(i26 + 8);
                                            c2733sBA = C2733sB.a(c2562qX);
                                            if (z4) {
                                                f = fX;
                                            } else {
                                                f = c2733sBA.f;
                                            }
                                            i30 = c2733sBA.b;
                                            str9 = "video/hevc";
                                            list2 = c2733sBA.a;
                                            str10 = c2733sBA.g;
                                            i31 = c2733sBA.c;
                                            f2 = f;
                                            i32 = c2733sBA.d;
                                            i33 = c2733sBA.e;
                                        } else if (iG5 != 1685480259 || iG5 == 1685485123) {
                                            iZ = iZ;
                                            iG3 = iG3;
                                            iZ2 = iZ2;
                                            i27 = i17;
                                            i28 = i16;
                                            i29 = iG10;
                                            str7 = str5;
                                            j2E = J2.e(c2562qX);
                                            if (j2E != null) {
                                                str5 = j2E.m;
                                                str4 = "video/dolby-vision";
                                            } else {
                                                str5 = str7;
                                            }
                                            fX = fX;
                                        } else if (iG5 == 1987076931) {
                                            AbstractC2506pt.i(null, str4 == null);
                                            String str20 = iG3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            c2562qX.F(i26 + 12);
                                            c2562qX.G(2);
                                            boolean z11 = (c2562qX.u() & 1) != 0;
                                            int iU = c2562qX.u();
                                            int iU2 = c2562qX.u();
                                            int iB4 = C1602gf.b(iU);
                                            iZ = iZ;
                                            iG3 = iG3;
                                            iZ2 = iZ2;
                                            str4 = str20;
                                            i27 = i17;
                                            i20 = z11 ? 1 : 2;
                                            i28 = i16;
                                            iC = C1602gf.c(iU2);
                                            i29 = iG10;
                                            fX = fX;
                                            i19 = iB4;
                                        } else {
                                            if (iG5 == 1635135811) {
                                                AbstractC2506pt.i(null, str4 == null);
                                                str4 = "video/av01";
                                            } else if (iG5 == 1668050025) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer = byteBufferOrder;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(c2562qX.r());
                                                byteBuffer.putShort(c2562qX.r());
                                                byteBufferOrder = byteBuffer;
                                            } else {
                                                if (iG5 == 1835295606) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                                    short sR = c2562qX.r();
                                                    short sR2 = c2562qX.r();
                                                    iG3 = iG3;
                                                    short sR3 = c2562qX.r();
                                                    i27 = i17;
                                                    short sR4 = c2562qX.r();
                                                    i28 = i16;
                                                    short sR5 = c2562qX.r();
                                                    iZ2 = iZ2;
                                                    short sR6 = c2562qX.r();
                                                    iZ = iZ;
                                                    short sR7 = c2562qX.r();
                                                    str8 = str5;
                                                    short sR8 = c2562qX.r();
                                                    long jV4 = c2562qX.v();
                                                    long jV5 = c2562qX.v();
                                                    i29 = iG10;
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sR5);
                                                    byteBuffer2.putShort(sR6);
                                                    byteBuffer2.putShort(sR);
                                                    byteBuffer2.putShort(sR2);
                                                    byteBuffer2.putShort(sR3);
                                                    byteBuffer2.putShort(sR4);
                                                    byteBuffer2.putShort(sR7);
                                                    byteBuffer2.putShort(sR8);
                                                    byteBuffer2.putShort((short) (jV4 / 10000));
                                                    byteBuffer2.putShort((short) (jV5 / 10000));
                                                    byteBufferOrder = byteBuffer2;
                                                } else {
                                                    iZ = iZ;
                                                    iG3 = iG3;
                                                    iZ2 = iZ2;
                                                    i27 = i17;
                                                    i28 = i16;
                                                    i29 = iG10;
                                                    str8 = str5;
                                                    if (iG5 == 1681012275) {
                                                        AbstractC2506pt.i(null, str4 == null);
                                                        str4 = "video/3gpp";
                                                    } else {
                                                        if (iG5 == 1702061171) {
                                                            AbstractC2506pt.i(null, str4 == null);
                                                            C3209x6 c3209x6A2 = a(i26, c2562qX);
                                                            byte[] bArr4 = (byte[]) c3209x6A2.f1112o;
                                                            List listQ3 = bArr4 != null ? AbstractC0985aF.q(bArr4) : list;
                                                            c3209x6 = c3209x6A2;
                                                            str4 = (String) c3209x6A2.n;
                                                            list = listQ3;
                                                        } else if (iG5 == 1885434736) {
                                                            c2562qX.F(i26 + 8);
                                                            fX = c2562qX.x() / c2562qX.x();
                                                            str5 = str8;
                                                            z4 = true;
                                                        } else if (iG5 == 1937126244) {
                                                            int i59 = i26 + 8;
                                                            while (true) {
                                                                if (i59 - i26 >= iG4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                c2562qX.F(i59);
                                                                int iG15 = c2562qX.g();
                                                                if (c2562qX.g() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(c2562qX.a, i59, iG15 + i59);
                                                                    break;
                                                                }
                                                                i59 += iG15;
                                                            }
                                                            bArr2 = bArrCopyOfRange;
                                                        } else {
                                                            if (iG5 == 1936995172) {
                                                                int iU3 = c2562qX.u();
                                                                c2562qX.G(3);
                                                                if (iU3 == 0) {
                                                                    int iU4 = c2562qX.u();
                                                                    if (iU4 == 0) {
                                                                        i21 = 0;
                                                                    } else if (iU4 == 1) {
                                                                        i21 = 1;
                                                                    } else if (iU4 == 2) {
                                                                        i21 = 2;
                                                                    } else if (iU4 == 3) {
                                                                        i21 = 3;
                                                                    }
                                                                }
                                                            } else if (iG5 == 1668246642 && i19 == -1 && iC == -1) {
                                                                int iG16 = c2562qX.g();
                                                                if (iG16 == 1852009592 || iG16 == 1852009571) {
                                                                    int iZ5 = c2562qX.z();
                                                                    int iZ6 = c2562qX.z();
                                                                    c2562qX.G(2);
                                                                    boolean z12 = iG4 == 19 && (c2562qX.u() & 128) != 0;
                                                                    int iB5 = C1602gf.b(iZ5);
                                                                    int i60 = z12 ? 1 : 2;
                                                                    i19 = iB5;
                                                                    iC = C1602gf.c(iZ6);
                                                                    i20 = i60;
                                                                } else {
                                                                    AbstractC3015v6.g(iG16);
                                                                    AP.z();
                                                                }
                                                            }
                                                            fX = fX;
                                                            str5 = str8;
                                                        }
                                                        fX = fX;
                                                        str5 = str8;
                                                    }
                                                }
                                                str5 = str8;
                                            }
                                            i27 = i17;
                                            i28 = i16;
                                            i29 = iG10;
                                        }
                                        i22 += iG4;
                                        bArr = bArr2;
                                        str2 = str19;
                                        iG3 = iG3;
                                        i17 = i27;
                                        i16 = i28;
                                        iZ2 = iZ2;
                                        iZ = iZ;
                                        iG10 = i29;
                                    }
                                    iZ = iZ;
                                    iG3 = iG3;
                                    iZ2 = iZ2;
                                    i27 = i17;
                                    i28 = i16;
                                    i18 = i30;
                                    list = list2;
                                    i29 = iG10;
                                    int i61 = i32;
                                    iC = i33;
                                    fX = f2;
                                    i20 = i61;
                                    String str21 = str10;
                                    str4 = str9;
                                    i19 = i31;
                                    str5 = str21;
                                    i22 += iG4;
                                    bArr = bArr2;
                                    str2 = str19;
                                    iG3 = iG3;
                                    i17 = i27;
                                    i16 = i28;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                    iG10 = i29;
                                }
                                i23 = i17;
                                iG2 = i16;
                                iG10 = iG10;
                                str6 = str5;
                                if (str4 == null) {
                                    i3 = i14;
                                    c0643Nw = c0643Nw3;
                                } else {
                                    c0617Mw = new C0617Mw();
                                    c0617Mw.a = Integer.toString(iG10);
                                    c0617Mw.k = str4;
                                    c0617Mw.h = str6;
                                    c0617Mw.p = i24;
                                    c0617Mw.q = iZ2;
                                    c0617Mw.t = fX;
                                    i3 = i14;
                                    c0617Mw.s = i3;
                                    c0617Mw.u = bArr2;
                                    c0617Mw.v = i21;
                                    c0617Mw.m = list;
                                    c0617Mw.n = c3271xo2;
                                    i25 = i20;
                                    if (i19 == -1 || i25 != -1 || iC != -1 || byteBufferOrder != null) {
                                        i24 = iZ;
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        c0617Mw.w = new C1602gf(i19, i25, iC, bArrArray);
                                    }
                                    if (c3209x6 != null) {
                                        C3209x6 c3209x8 = c3209x6;
                                        c0617Mw.f = Pu0.s(c3209x8.l);
                                        c0617Mw.g = Pu0.s(c3209x8.m);
                                    }
                                    c0643Nw = new C0643Nw(c0617Mw);
                                }
                                i8 = i18;
                            } else if (iG3 == 1836069985 || iG3 == 1701733217 || iG3 == 1633889587 || iG3 == 1700998451 || iG3 == 1633889588 || iG3 == 1835823201 || iG3 == 1685353315 || iG3 == 1685353317 || iG3 == 1685353320 || iG3 == 1685353324 || iG3 == 1685353336 || iG3 == 1935764850 || iG3 == 1935767394 || iG3 == 1819304813 || iG3 == 1936684916 || iG3 == 1953984371 || iG3 == 778924082 || iG3 == 778924083 || iG3 == 1835557169 || iG3 == 1835560241 || iG3 == 1634492771 || iG3 == 1634492791 || iG3 == 1970037111 || iG3 == 1332770163 || iG3 == 1716281667) {
                                pairCreate = pairCreate;
                                c2562qX.F(i13 + 16);
                                if (z2) {
                                    iZ3 = c2562qX.z();
                                    c2562qX.G(6);
                                } else {
                                    c2562qX.G(8);
                                    iZ3 = 0;
                                }
                                if (iZ3 == 0 || iZ3 == 1) {
                                    int iZ7 = c2562qX.z();
                                    c2562qX.G(6);
                                    byte[] bArr5 = c2562qX.a;
                                    int i62 = c2562qX.b;
                                    int i63 = (bArr5[i62 + 1] & 255) | ((bArr5[i62] & 255) << 8);
                                    c2562qX.b = i62 + 4;
                                    c2562qX.F(i62);
                                    int iG17 = c2562qX.g();
                                    if (iZ3 == 1) {
                                        c2562qX.G(16);
                                    }
                                    iRound = i63;
                                    i34 = iG17;
                                    iX2 = iZ7;
                                } else {
                                    if (iZ3 == 2) {
                                        c2562qX.G(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c2562qX.o()));
                                        iX2 = c2562qX.x();
                                        c2562qX.G(20);
                                        i34 = 0;
                                    } else {
                                        i6 = i6;
                                        i37 = i3;
                                        i36 = iG2;
                                        c2821t8 = c2821t8;
                                        i35 = i13;
                                        xl0Arr3 = xl0Arr;
                                    }
                                    i3 = i37;
                                    iG2 = i36;
                                    i23 = i35;
                                }
                                int i64 = c2562qX.b;
                                int i65 = iX2;
                                if (iG3 == 1701733217) {
                                    Pair pairD2 = d(c2562qX, i13, iG2);
                                    if (pairD2 != null) {
                                        int iIntValue2 = ((Integer) pairD2.first).intValue();
                                        C3271xo c3271xoA2 = c3271xo == null ? null : c3271xo.a(((Xl0) pairD2.second).b);
                                        xl0Arr[i6] = (Xl0) pairD2.second;
                                        c3271xo3 = c3271xoA2;
                                        iG3 = iIntValue2;
                                    } else {
                                        c3271xo3 = c3271xo;
                                    }
                                    c2562qX.F(i64);
                                } else {
                                    c3271xo3 = c3271xo;
                                }
                                int i66 = iRound;
                                String str22 = "audio/ac3";
                                c2821t8 = c2821t8;
                                if (iG3 == 1633889587) {
                                    str11 = "audio/ac3";
                                } else if (iG3 == 1700998451) {
                                    str11 = "audio/eac3";
                                } else if (iG3 == 1633889588) {
                                    str11 = "audio/ac4";
                                } else if (iG3 == 1685353315) {
                                    str11 = "audio/vnd.dts";
                                } else if (iG3 == 1685353320 || iG3 == 1685353324) {
                                    str11 = "audio/vnd.dts.hd";
                                } else if (iG3 == 1685353317) {
                                    str11 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iG3 == 1685353336) {
                                    str11 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iG3 == 1935764850) {
                                    str11 = "audio/3gpp";
                                } else if (iG3 == 1935767394) {
                                    str11 = "audio/amr-wb";
                                } else {
                                    if (iG3 == 1819304813 || iG3 == 1936684916) {
                                        str11 = "audio/raw";
                                        i38 = 2;
                                    } else if (iG3 == 1953984371) {
                                        str11 = "audio/raw";
                                        i38 = 268435456;
                                    } else if (iG3 == 778924082 || iG3 == 778924083) {
                                        str11 = "audio/mpeg";
                                    } else if (iG3 == 1835557169) {
                                        str11 = "audio/mha1";
                                    } else if (iG3 == 1835560241) {
                                        str11 = "audio/mhm1";
                                    } else if (iG3 == 1634492771) {
                                        str11 = "audio/alac";
                                    } else if (iG3 == 1634492791) {
                                        str11 = "audio/g711-alaw";
                                    } else if (iG3 == 1970037111) {
                                        str11 = "audio/g711-mlaw";
                                    } else if (iG3 == 1332770163) {
                                        str11 = "audio/opus";
                                    } else if (iG3 == 1716281667) {
                                        str11 = "audio/flac";
                                    } else {
                                        str11 = iG3 == 1835823201 ? "audio/true-hd" : null;
                                    }
                                    i6 = i6;
                                    i37 = i3;
                                    int i67 = i38;
                                    xl0Arr3 = xl0Arr;
                                    i39 = i66;
                                    iIntValue = i65;
                                    i40 = i64;
                                    str12 = null;
                                    listQ = null;
                                    c3209x7 = null;
                                    while (i40 - i13 < iG2) {
                                        c2562qX.F(i40);
                                        iG6 = c2562qX.g();
                                        int i68 = iG2;
                                        if (iG6 > 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        AbstractC2506pt.i(str18, z8);
                                        iG7 = c2562qX.g();
                                        int i69 = i13;
                                        if (iG7 == 1835557187) {
                                            int i70 = iG6 - 13;
                                            byte[] bArr6 = new byte[i70];
                                            c2562qX.F(i40 + 13);
                                            c2562qX.e(bArr6, 0, i70);
                                            listQ = AbstractC0985aF.q(bArr6);
                                            str14 = str18;
                                            str22 = str22;
                                            str12 = str12;
                                        } else {
                                            str13 = str12;
                                            if (iG7 == 1702061171) {
                                                i41 = 1702061171;
                                            } else if (z2 || iG7 != 2002876005) {
                                                iArr = AbstractC0397Ej.d;
                                                iArr2 = AbstractC0397Ej.b;
                                                str16 = str18;
                                                if (iG7 == 1684103987) {
                                                    c2562qX.F(i40 + 8);
                                                    String string = Integer.toString(iG10);
                                                    c2084lc2 = new C2084lc();
                                                    c2084lc2.o(c2562qX);
                                                    int i71 = i39;
                                                    int i72 = iArr2[c2084lc2.i(2)];
                                                    c2084lc2.s(8);
                                                    i52 = iArr[c2084lc2.i(3)];
                                                    if (c2084lc2.i(1) != 0) {
                                                        i52++;
                                                    }
                                                    int i73 = AbstractC0397Ej.e[c2084lc2.i(5)] * 1000;
                                                    c2084lc2.c();
                                                    c2562qX.F(c2084lc2.f());
                                                    C0617Mw c0617Mw2 = new C0617Mw();
                                                    c0617Mw2.a = string;
                                                    c0617Mw2.k = str22;
                                                    c0617Mw2.x = i52;
                                                    c0617Mw2.y = i72;
                                                    c0617Mw2.n = c3271xo3;
                                                    c0617Mw2.c = str;
                                                    c0617Mw2.f = i73;
                                                    c0617Mw2.g = i73;
                                                    c0643Nw = new C0643Nw(c0617Mw2);
                                                    i48 = i71;
                                                } else {
                                                    i46 = i39;
                                                    if (iG7 == 1684366131) {
                                                        c2562qX.F(i40 + 8);
                                                        String string2 = Integer.toString(iG10);
                                                        c2084lc = new C2084lc();
                                                        c2084lc.o(c2562qX);
                                                        int i74 = c2084lc.i(13) * 1000;
                                                        c2084lc.s(3);
                                                        int i75 = iArr2[c2084lc.i(2)];
                                                        c2084lc.s(10);
                                                        i50 = iArr[c2084lc.i(3)];
                                                        if (c2084lc.i(1) != 0) {
                                                            i50++;
                                                        }
                                                        c2084lc.s(3);
                                                        i51 = c2084lc.i(4);
                                                        c2084lc.s(1);
                                                        if (i51 > 0) {
                                                            c2084lc.s(6);
                                                            if (c2084lc.i(1) != 0) {
                                                                i50 += 2;
                                                            }
                                                            c2084lc.s(1);
                                                        }
                                                        if (c2084lc.b() > 7) {
                                                            c2084lc.s(7);
                                                            if (c2084lc.i(1) != 0) {
                                                                str17 = "audio/eac3-joc";
                                                            } else {
                                                                str17 = "audio/eac3";
                                                            }
                                                        } else {
                                                            str17 = "audio/eac3";
                                                        }
                                                        c2084lc.c();
                                                        c2562qX.F(c2084lc.f());
                                                        C0617Mw c0617Mw3 = new C0617Mw();
                                                        c0617Mw3.a = string2;
                                                        c0617Mw3.k = str17;
                                                        c0617Mw3.x = i50;
                                                        c0617Mw3.y = i75;
                                                        c0617Mw3.n = c3271xo3;
                                                        c0617Mw3.c = str;
                                                        c0617Mw3.g = i74;
                                                        c0643Nw = new C0643Nw(c0617Mw3);
                                                        i48 = i46;
                                                    } else {
                                                        i47 = iIntValue;
                                                        str22 = str22;
                                                        if (iG7 == 1684103988) {
                                                            c2562qX.F(i40 + 8);
                                                            String string3 = Integer.toString(iG10);
                                                            c2562qX.G(1);
                                                            if (((c2562qX.u() & 32) >> 5) == 1) {
                                                                i49 = 48000;
                                                            } else {
                                                                i49 = 44100;
                                                            }
                                                            C0617Mw c0617Mw4 = new C0617Mw();
                                                            c0617Mw4.a = string3;
                                                            c0617Mw4.k = "audio/ac4";
                                                            c0617Mw4.x = 2;
                                                            c0617Mw4.y = i49;
                                                            c0617Mw4.n = c3271xo3;
                                                            c0617Mw4.c = str;
                                                            c0643Nw = new C0643Nw(c0617Mw4);
                                                            i48 = i46;
                                                            iIntValue = i47;
                                                            i39 = i48;
                                                            iIntValue = iIntValue;
                                                            str12 = str13;
                                                            str14 = str16;
                                                        } else if (iG7 != 1684892784) {
                                                            if (iG7 != 1684305011 || iG7 == 1969517683) {
                                                                C0617Mw c0617Mw5 = new C0617Mw();
                                                                c0617Mw5.a = Integer.toString(iG10);
                                                                c0617Mw5.k = str11;
                                                                iIntValue = i47;
                                                                c0617Mw5.x = iIntValue;
                                                                i48 = i46;
                                                                c0617Mw5.y = i48;
                                                                c0617Mw5.n = c3271xo3;
                                                                c0617Mw5.c = str;
                                                                c0643Nw = new C0643Nw(c0617Mw5);
                                                            } else {
                                                                if (iG7 == 1682927731) {
                                                                    int i76 = iG6 - 8;
                                                                    byte[] bArr7 = a;
                                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr7, bArr7.length + i76);
                                                                    c2562qX.F(i40 + 8);
                                                                    c2562qX.e(bArrCopyOf, bArr7.length, i76);
                                                                    listQ2 = Ou0.a(bArrCopyOf);
                                                                } else if (iG7 == 1684425825) {
                                                                    byte[] bArr8 = new byte[iG6 - 8];
                                                                    bArr8[0] = 102;
                                                                    bArr8[1] = 76;
                                                                    bArr8[2] = 97;
                                                                    bArr8[3] = 67;
                                                                    c2562qX.F(i40 + 12);
                                                                    c2562qX.e(bArr8, 4, iG6 - 12);
                                                                    listQ2 = AbstractC0985aF.q(bArr8);
                                                                } else {
                                                                    if (iG7 == 1634492771) {
                                                                        int i77 = iG6 - 12;
                                                                        byte[] bArr9 = new byte[i77];
                                                                        c2562qX.F(i40 + 12);
                                                                        c2562qX.e(bArr9, 0, i77);
                                                                        C2562qX c2562qX6 = new C2562qX(bArr9);
                                                                        c2562qX6.F(9);
                                                                        int iU5 = c2562qX6.u();
                                                                        c2562qX6.F(20);
                                                                        Pair pairCreate3 = Pair.create(Integer.valueOf(c2562qX6.x()), Integer.valueOf(iU5));
                                                                        int iIntValue3 = ((Integer) pairCreate3.first).intValue();
                                                                        iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                        listQ = AbstractC0985aF.q(bArr9);
                                                                        i39 = iIntValue3;
                                                                    } else {
                                                                        i48 = i46;
                                                                        iIntValue = i47;
                                                                    }
                                                                    str12 = str13;
                                                                    str14 = str16;
                                                                }
                                                                listQ = listQ2;
                                                                str12 = str13;
                                                                str14 = str16;
                                                                i39 = i46;
                                                                iIntValue = i47;
                                                            }
                                                            i39 = i48;
                                                            iIntValue = iIntValue;
                                                            str12 = str13;
                                                            str14 = str16;
                                                        } else {
                                                            if (i34 > 0) {
                                                                throw C2949uX.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i34, null);
                                                            }
                                                            i39 = i34;
                                                            str12 = str13;
                                                            str14 = str16;
                                                            iIntValue = 2;
                                                        }
                                                    }
                                                }
                                                i39 = i48;
                                                iIntValue = iIntValue;
                                                str12 = str13;
                                                str14 = str16;
                                            } else {
                                                i41 = 1702061171;
                                            }
                                            if (iG7 == i41) {
                                                i42 = c2562qX.b;
                                                if (i42 >= i40) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                AbstractC2506pt.i(null, z9);
                                                while (true) {
                                                    if (i42 - i40 < iG6) {
                                                        str14 = str18;
                                                        i42 = -1;
                                                        break;
                                                    }
                                                    c2562qX.F(i42);
                                                    iG8 = c2562qX.g();
                                                    str14 = str18;
                                                    if (iG8 > 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    AbstractC2506pt.i(str14, z10);
                                                    if (c2562qX.g() == 1702061171) {
                                                        break;
                                                    }
                                                    i42 += iG8;
                                                    str18 = str14;
                                                }
                                            } else {
                                                i42 = i40;
                                                str14 = str18;
                                            }
                                            if (i42 != -1) {
                                                c3209x6A = a(i42, c2562qX);
                                                str15 = (String) c3209x6A.n;
                                                bArr3 = (byte[]) c3209x6A.f1112o;
                                                if (bArr3 != null) {
                                                    if ("audio/mp4a-latm".equals(str15)) {
                                                        FV fvV = AbstractC3409z9.v(new C2084lc(bArr3.length, bArr3), false);
                                                        i44 = fvV.l;
                                                        int i78 = fvV.m;
                                                        str13 = (String) fvV.n;
                                                        i45 = i78;
                                                    } else {
                                                        i44 = i39;
                                                        i45 = iIntValue;
                                                    }
                                                    M60 m60Q2 = AbstractC0985aF.q(bArr3);
                                                    c3209x7 = c3209x6A;
                                                    str11 = str15;
                                                    i39 = i44;
                                                    str12 = str13;
                                                    i43 = i45;
                                                    list3 = m60Q2;
                                                } else {
                                                    c3209x7 = c3209x6A;
                                                    str11 = str15;
                                                    i43 = iIntValue;
                                                    str12 = str13;
                                                    i39 = i39;
                                                    list3 = listQ;
                                                }
                                            } else {
                                                i39 = i39;
                                                i43 = iIntValue;
                                                list3 = listQ;
                                                str12 = str13;
                                            }
                                            listQ = list3;
                                            iIntValue = i43;
                                            i40 += iG6;
                                            str18 = str14;
                                            iG2 = i68;
                                            i13 = i69;
                                            str22 = str22;
                                        }
                                        i40 += iG6;
                                        str18 = str14;
                                        iG2 = i68;
                                        i13 = i69;
                                        str22 = str22;
                                    }
                                    i36 = iG2;
                                    i35 = i13;
                                    String str23 = str12;
                                    int i79 = iIntValue;
                                    int i80 = i39;
                                    if (c0643Nw == null || str11 == null) {
                                        c0643Nw = c0643Nw;
                                    } else {
                                        C0617Mw c0617Mw6 = new C0617Mw();
                                        c0617Mw6.a = Integer.toString(iG10);
                                        c0617Mw6.k = str11;
                                        c0617Mw6.h = str23;
                                        c0617Mw6.x = i79;
                                        c0617Mw6.y = i80;
                                        c0617Mw6.z = i67;
                                        c0617Mw6.m = listQ;
                                        c0617Mw6.n = c3271xo3;
                                        c0617Mw6.c = str;
                                        C3209x6 c3209x9 = c3209x7;
                                        if (c3209x9 != null) {
                                            c0617Mw6.f = Pu0.s(c3209x9.l);
                                            c0617Mw6.g = Pu0.s(c3209x9.m);
                                        }
                                        c0643Nw = new C0643Nw(c0617Mw6);
                                    }
                                    i3 = i37;
                                    iG2 = i36;
                                    i23 = i35;
                                }
                                i38 = -1;
                                i6 = i6;
                                i37 = i3;
                                int i610 = i38;
                                xl0Arr3 = xl0Arr;
                                i39 = i66;
                                iIntValue = i65;
                                i40 = i64;
                                str12 = null;
                                listQ = null;
                                c3209x7 = null;
                                while (i40 - i13 < iG2) {
                                    c2562qX.F(i40);
                                    iG6 = c2562qX.g();
                                    int i611 = iG2;
                                    if (iG6 > 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    AbstractC2506pt.i(str18, z8);
                                    iG7 = c2562qX.g();
                                    int i612 = i13;
                                    if (iG7 == 1835557187) {
                                        int i710 = iG6 - 13;
                                        byte[] bArr10 = new byte[i710];
                                        c2562qX.F(i40 + 13);
                                        c2562qX.e(bArr10, 0, i710);
                                        listQ = AbstractC0985aF.q(bArr10);
                                        str14 = str18;
                                        str22 = str22;
                                        str12 = str12;
                                    } else {
                                        str13 = str12;
                                        if (iG7 == 1702061171) {
                                            if (z2) {
                                            }
                                            iArr = AbstractC0397Ej.d;
                                            iArr2 = AbstractC0397Ej.b;
                                            str16 = str18;
                                            if (iG7 == 1684103987) {
                                                c2562qX.F(i40 + 8);
                                                String string4 = Integer.toString(iG10);
                                                c2084lc2 = new C2084lc();
                                                c2084lc2.o(c2562qX);
                                                int i711 = i39;
                                                int i712 = iArr2[c2084lc2.i(2)];
                                                c2084lc2.s(8);
                                                i52 = iArr[c2084lc2.i(3)];
                                                if (c2084lc2.i(1) != 0) {
                                                    i52++;
                                                }
                                                int i713 = AbstractC0397Ej.e[c2084lc2.i(5)] * 1000;
                                                c2084lc2.c();
                                                c2562qX.F(c2084lc2.f());
                                                C0617Mw c0617Mw7 = new C0617Mw();
                                                c0617Mw7.a = string4;
                                                c0617Mw7.k = str22;
                                                c0617Mw7.x = i52;
                                                c0617Mw7.y = i712;
                                                c0617Mw7.n = c3271xo3;
                                                c0617Mw7.c = str;
                                                c0617Mw7.f = i713;
                                                c0617Mw7.g = i713;
                                                c0643Nw = new C0643Nw(c0617Mw7);
                                                i48 = i711;
                                            } else {
                                                i46 = i39;
                                                if (iG7 == 1684366131) {
                                                    c2562qX.F(i40 + 8);
                                                    String string5 = Integer.toString(iG10);
                                                    c2084lc = new C2084lc();
                                                    c2084lc.o(c2562qX);
                                                    int i714 = c2084lc.i(13) * 1000;
                                                    c2084lc.s(3);
                                                    int i715 = iArr2[c2084lc.i(2)];
                                                    c2084lc.s(10);
                                                    i50 = iArr[c2084lc.i(3)];
                                                    if (c2084lc.i(1) != 0) {
                                                        i50++;
                                                    }
                                                    c2084lc.s(3);
                                                    i51 = c2084lc.i(4);
                                                    c2084lc.s(1);
                                                    if (i51 > 0) {
                                                        c2084lc.s(6);
                                                        if (c2084lc.i(1) != 0) {
                                                            i50 += 2;
                                                        }
                                                        c2084lc.s(1);
                                                    }
                                                    if (c2084lc.b() > 7) {
                                                        c2084lc.s(7);
                                                        if (c2084lc.i(1) != 0) {
                                                            str17 = "audio/eac3-joc";
                                                        } else {
                                                            str17 = "audio/eac3";
                                                        }
                                                    } else {
                                                        str17 = "audio/eac3";
                                                    }
                                                    c2084lc.c();
                                                    c2562qX.F(c2084lc.f());
                                                    C0617Mw c0617Mw8 = new C0617Mw();
                                                    c0617Mw8.a = string5;
                                                    c0617Mw8.k = str17;
                                                    c0617Mw8.x = i50;
                                                    c0617Mw8.y = i715;
                                                    c0617Mw8.n = c3271xo3;
                                                    c0617Mw8.c = str;
                                                    c0617Mw8.g = i714;
                                                    c0643Nw = new C0643Nw(c0617Mw8);
                                                    i48 = i46;
                                                } else {
                                                    i47 = iIntValue;
                                                    str22 = str22;
                                                    if (iG7 == 1684103988) {
                                                        c2562qX.F(i40 + 8);
                                                        String string6 = Integer.toString(iG10);
                                                        c2562qX.G(1);
                                                        if (((c2562qX.u() & 32) >> 5) == 1) {
                                                            i49 = 48000;
                                                        } else {
                                                            i49 = 44100;
                                                        }
                                                        C0617Mw c0617Mw9 = new C0617Mw();
                                                        c0617Mw9.a = string6;
                                                        c0617Mw9.k = "audio/ac4";
                                                        c0617Mw9.x = 2;
                                                        c0617Mw9.y = i49;
                                                        c0617Mw9.n = c3271xo3;
                                                        c0617Mw9.c = str;
                                                        c0643Nw = new C0643Nw(c0617Mw9);
                                                        i48 = i46;
                                                        iIntValue = i47;
                                                        i39 = i48;
                                                        iIntValue = iIntValue;
                                                        str12 = str13;
                                                        str14 = str16;
                                                    } else if (iG7 != 1684892784) {
                                                        if (i34 > 0) {
                                                            throw C2949uX.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i34, null);
                                                        }
                                                        i39 = i34;
                                                        str12 = str13;
                                                        str14 = str16;
                                                        iIntValue = 2;
                                                    } else if (iG7 != 1684305011) {
                                                        C0617Mw c0617Mw10 = new C0617Mw();
                                                        c0617Mw10.a = Integer.toString(iG10);
                                                        c0617Mw10.k = str11;
                                                        iIntValue = i47;
                                                        c0617Mw10.x = iIntValue;
                                                        i48 = i46;
                                                        c0617Mw10.y = i48;
                                                        c0617Mw10.n = c3271xo3;
                                                        c0617Mw10.c = str;
                                                        c0643Nw = new C0643Nw(c0617Mw10);
                                                        i39 = i48;
                                                        iIntValue = iIntValue;
                                                        str12 = str13;
                                                        str14 = str16;
                                                    } else {
                                                        C0617Mw c0617Mw11 = new C0617Mw();
                                                        c0617Mw11.a = Integer.toString(iG10);
                                                        c0617Mw11.k = str11;
                                                        iIntValue = i47;
                                                        c0617Mw11.x = iIntValue;
                                                        i48 = i46;
                                                        c0617Mw11.y = i48;
                                                        c0617Mw11.n = c3271xo3;
                                                        c0617Mw11.c = str;
                                                        c0643Nw = new C0643Nw(c0617Mw11);
                                                        i39 = i48;
                                                        iIntValue = iIntValue;
                                                        str12 = str13;
                                                        str14 = str16;
                                                    }
                                                }
                                            }
                                            i39 = i48;
                                            iIntValue = iIntValue;
                                            str12 = str13;
                                            str14 = str16;
                                        } else {
                                            i41 = 1702061171;
                                        }
                                        if (iG7 == i41) {
                                            i42 = c2562qX.b;
                                            if (i42 >= i40) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            AbstractC2506pt.i(null, z9);
                                            while (true) {
                                                if (i42 - i40 < iG6) {
                                                    str14 = str18;
                                                    i42 = -1;
                                                    break;
                                                }
                                                c2562qX.F(i42);
                                                iG8 = c2562qX.g();
                                                str14 = str18;
                                                if (iG8 > 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                AbstractC2506pt.i(str14, z10);
                                                if (c2562qX.g() == 1702061171) {
                                                    break;
                                                    break;
                                                }
                                                i42 += iG8;
                                                str18 = str14;
                                            }
                                        } else {
                                            i42 = i40;
                                            str14 = str18;
                                        }
                                        if (i42 != -1) {
                                            c3209x6A = a(i42, c2562qX);
                                            str15 = (String) c3209x6A.n;
                                            bArr3 = (byte[]) c3209x6A.f1112o;
                                            if (bArr3 != null) {
                                                if ("audio/mp4a-latm".equals(str15)) {
                                                    FV fvV2 = AbstractC3409z9.v(new C2084lc(bArr3.length, bArr3), false);
                                                    i44 = fvV2.l;
                                                    int i716 = fvV2.m;
                                                    str13 = (String) fvV2.n;
                                                    i45 = i716;
                                                } else {
                                                    i44 = i39;
                                                    i45 = iIntValue;
                                                }
                                                M60 m60Q3 = AbstractC0985aF.q(bArr3);
                                                c3209x7 = c3209x6A;
                                                str11 = str15;
                                                i39 = i44;
                                                str12 = str13;
                                                i43 = i45;
                                                list3 = m60Q3;
                                            } else {
                                                c3209x7 = c3209x6A;
                                                str11 = str15;
                                                i43 = iIntValue;
                                                str12 = str13;
                                                i39 = i39;
                                                list3 = listQ;
                                            }
                                        } else {
                                            i39 = i39;
                                            i43 = iIntValue;
                                            list3 = listQ;
                                            str12 = str13;
                                        }
                                        listQ = list3;
                                        iIntValue = i43;
                                        i40 += iG6;
                                        str18 = str14;
                                        iG2 = i611;
                                        i13 = i612;
                                        str22 = str22;
                                    }
                                    i40 += iG6;
                                    str18 = str14;
                                    iG2 = i611;
                                    i13 = i612;
                                    str22 = str22;
                                }
                                i36 = iG2;
                                i35 = i13;
                                String str24 = str12;
                                int i717 = iIntValue;
                                int i81 = i39;
                                if (c0643Nw == null) {
                                    c0643Nw = c0643Nw;
                                } else {
                                    c0643Nw = c0643Nw;
                                }
                                i3 = i37;
                                iG2 = i36;
                                i23 = i35;
                            } else {
                                if (iG3 == 1414810956 || iG3 == 1954034535 || iG3 == 2004251764 || iG3 == 1937010800 || iG3 == 1664495672) {
                                    c2562qX.F(i13 + 16);
                                    String str25 = "application/ttml+xml";
                                    if (iG3 == 1414810956) {
                                        j5 = Long.MAX_VALUE;
                                        m60Q = null;
                                    } else if (iG3 == 1954034535) {
                                        int i82 = iG2 - 16;
                                        byte[] bArr11 = new byte[i82];
                                        c2562qX.e(bArr11, 0, i82);
                                        m60Q = AbstractC0985aF.q(bArr11);
                                        str25 = "application/x-quicktime-tx3g";
                                        j5 = Long.MAX_VALUE;
                                    } else if (iG3 == 2004251764) {
                                        str25 = "application/x-mp4-vtt";
                                        j5 = Long.MAX_VALUE;
                                        m60Q = null;
                                    } else if (iG3 == 1937010800) {
                                        j5 = 0;
                                        m60Q = null;
                                    } else {
                                        if (iG3 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        str25 = "application/x-mp4-cea-608";
                                        j5 = Long.MAX_VALUE;
                                        m60Q = null;
                                        i7 = 1;
                                    }
                                    C0617Mw c0617Mw12 = new C0617Mw();
                                    c0617Mw12.a = Integer.toString(iG10);
                                    c0617Mw12.k = str25;
                                    c0617Mw12.c = str;
                                    c0617Mw12.f405o = j5;
                                    c0617Mw12.m = m60Q;
                                    c0643Nw = new C0643Nw(c0617Mw12);
                                } else if (iG3 == 1835365492) {
                                    c2562qX.F(i13 + 16);
                                    if (iG3 == 1835365492) {
                                        c2562qX.p();
                                        String strP = c2562qX.p();
                                        if (strP != null) {
                                            C0617Mw c0617Mw13 = new C0617Mw();
                                            c0617Mw13.a = Integer.toString(iG10);
                                            c0617Mw13.k = strP;
                                            c0643Nw = new C0643Nw(c0617Mw13);
                                        }
                                    }
                                } else if (iG3 == 1667329389) {
                                    C0617Mw c0617Mw14 = new C0617Mw();
                                    c0617Mw14.a = Integer.toString(iG10);
                                    c0617Mw14.k = "application/x-camera-motion";
                                    c0643Nw = new C0643Nw(c0617Mw14);
                                }
                                i23 = i13;
                                xl0Arr3 = xl0Arr;
                            }
                            c2562qX.F(i23 + iG2);
                            i6++;
                            i3 = i3;
                            iG = i57;
                            i53 = i58;
                            arrayList2 = arrayList4;
                            j3 = j6;
                            str = str;
                            xl0Arr = xl0Arr3;
                            pairCreate = pairCreate;
                            iG10 = iG10;
                            i = i;
                            c2821t8 = c2821t8;
                            c3271xo = c3271xo;
                        }
                        arrayList = arrayList2;
                        i9 = i53;
                        c2821t7 = c2821t8;
                        j4 = j3;
                        pair = pairCreate;
                        i10 = i;
                        i11 = iG10;
                        xl0Arr2 = xl0Arr;
                        c0643Nw2 = c0643Nw;
                        if (z) {
                            c2821t8 = c2821t7;
                        } else {
                            c2821t8 = c2821t7;
                            c2821t6E = c2821t8.E(1701082227);
                            if (c2821t6E == null) {
                                c2918u6F2 = c2821t6E.F(1701606260);
                                if (c2918u6F2 == null) {
                                    pairCreate2 = null;
                                } else {
                                    c2562qX2 = c2918u6F2.n;
                                    c2562qX2.F(8);
                                    iB2 = AbstractC3015v6.B(c2562qX2.g());
                                    iX = c2562qX2.x();
                                    jArr3 = new long[iX];
                                    jArr4 = new long[iX];
                                    for (i12 = 0; i12 < iX; i12++) {
                                        if (iB2 == 1) {
                                            jV2 = c2562qX2.y();
                                        } else {
                                            jV2 = c2562qX2.v();
                                        }
                                        jArr3[i12] = jV2;
                                        if (iB2 == 1) {
                                            jG = c2562qX2.o();
                                        } else {
                                            jG = c2562qX2.g();
                                        }
                                        jArr4[i12] = jG;
                                        if (c2562qX2.r() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        c2562qX2.G(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (c0643Nw2 == null) {
                                wl0 = null;
                            } else {
                                wl0 = new Wl0(i11, i10, ((Long) pair.first).longValue(), j4, jR, c0643Nw2, i7, xl0Arr2, i8, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (c0643Nw2 == null) {
                            wl0 = null;
                        } else {
                            wl0 = new Wl0(i11, i10, ((Long) pair.first).longValue(), j4, jR, c0643Nw2, i7, xl0Arr2, i8, jArr, jArr2);
                        }
                    } else {
                        i2 = -65536;
                    }
                    if (iG11 == 0 && iG12 == i2) {
                        if (iG13 == 65536 && iG14 == 0) {
                            i3 = 270;
                        } else {
                            i2 = -65536;
                            if (iG11 != i2) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                        }
                    } else if (iG11 != i2 && iG12 == 0 && iG13 == 0 && iG14 == i2) {
                        i3 = 180;
                    } else {
                        i3 = 0;
                    }
                    if (j == -9223372036854775807L) {
                        j2 = jV;
                    } else {
                        j2 = j;
                    }
                    j3 = c(c2918u6F3.n).m;
                    if (j2 != -9223372036854775807L) {
                    }
                    C2821t6 c2821t6E5 = c2821t6E2.E(1835626086);
                    c2821t6E5.getClass();
                    C2821t6 c2821t6E6 = c2821t6E5.E(1937007212);
                    c2821t6E6.getClass();
                    C2918u6 c2918u6F7 = c2821t6E2.F(1835296868);
                    c2918u6F7.getClass();
                    C2562qX c2562qX7 = c2918u6F7.n;
                    c2562qX7.F(8);
                    iB = AbstractC3015v6.B(c2562qX7.g());
                    if (iB == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    c2562qX7.G(i4);
                    long jV6 = c2562qX7.v();
                    if (iB == 0) {
                        i5 = 4;
                    } else {
                        i5 = 8;
                    }
                    c2562qX7.G(i5);
                    int iZ8 = c2562qX7.z();
                    pairCreate = Pair.create(Long.valueOf(jV6), "" + ((char) (((iZ8 >> 10) & 31) + 96)) + ((char) (((iZ8 >> 5) & 31) + 96)) + ((char) ((iZ8 & 31) + 96)));
                    c2918u6F = c2821t6E6.F(1937011556);
                    if (c2918u6F != null) {
                        throw C2949uX.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    str = (String) pairCreate.second;
                    c2562qX = c2918u6F.n;
                    c2562qX.F(12);
                    iG = c2562qX.g();
                    xl0Arr = new Xl0[iG];
                    i6 = 0;
                    c0643Nw = null;
                    i7 = 0;
                    i8 = 0;
                    while (i6 < iG) {
                        int i510 = iG;
                        i13 = c2562qX.b;
                        int i511 = i53;
                        iG2 = c2562qX.g();
                        ArrayList arrayList5 = arrayList2;
                        long j7 = j3;
                        if (iG2 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String str110 = "childAtomSize must be positive";
                        AbstractC2506pt.i("childAtomSize must be positive", z3);
                        iG3 = c2562qX.g();
                        if (iG3 != 1635148593) {
                            i6 = i6;
                            i14 = i3;
                            c2821t8 = c2821t8;
                            pairCreate = pairCreate;
                            xl0Arr3 = xl0Arr;
                            c0643Nw3 = c0643Nw;
                            str2 = "childAtomSize must be positive";
                            c2562qX.F(i13 + 16);
                            c2562qX.G(16);
                            iZ = c2562qX.z();
                            iZ2 = c2562qX.z();
                            c2562qX.G(50);
                            i15 = c2562qX.b;
                            if (iG3 == 1701733238) {
                                i16 = iG2;
                                i17 = i13;
                                pairD = d(c2562qX, i17, i16);
                                if (pairD != null) {
                                    iG3 = ((Integer) pairD.first).intValue();
                                    if (c3271xo == null) {
                                        c3271xoA = null;
                                    } else {
                                        c3271xoA = c3271xo.a(((Xl0) pairD.second).b);
                                    }
                                    xl0Arr3[i6] = (Xl0) pairD.second;
                                } else {
                                    c3271xoA = c3271xo;
                                }
                                c2562qX.F(i15);
                            } else {
                                i16 = iG2;
                                i17 = i13;
                                c3271xoA = c3271xo;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            str = str;
                            c3271xo2 = c3271xoA;
                            str4 = str3;
                            i18 = i8;
                            bArr = null;
                            iC = -1;
                            i19 = -1;
                            str5 = null;
                            byteBufferOrder = null;
                            c3209x6 = null;
                            i20 = -1;
                            z4 = false;
                            list = null;
                            i21 = -1;
                            i22 = i15;
                            fX = 1.0f;
                            while (true) {
                                if (i22 - i17 >= i16) {
                                    bArr2 = bArr;
                                    fX = fX;
                                    break;
                                }
                                c2562qX.F(i22);
                                i26 = c2562qX.b;
                                bArr2 = bArr;
                                iG4 = c2562qX.g();
                                fX = fX;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC2506pt.i(str2, z5);
                                iG5 = c2562qX.g();
                                String str111 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    AbstractC2506pt.i(null, z7);
                                    c2562qX.F(i26 + 8);
                                    c2920u7A = C2920u7.a(c2562qX);
                                    if (z4) {
                                        f3 = c2920u7A.h;
                                    } else {
                                        f3 = fX;
                                    }
                                    i30 = c2920u7A.b;
                                    str9 = "video/avc";
                                    list2 = c2920u7A.a;
                                    str10 = c2920u7A.i;
                                    i31 = c2920u7A.e;
                                    f2 = f3;
                                    i32 = c2920u7A.f;
                                    i33 = c2920u7A.g;
                                } else {
                                    if (iG5 == 1752589123) {
                                        if (str4 == null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        AbstractC2506pt.i(null, z6);
                                        c2562qX.F(i26 + 8);
                                        c2733sBA = C2733sB.a(c2562qX);
                                        if (z4) {
                                            f = c2733sBA.f;
                                        } else {
                                            f = fX;
                                        }
                                        i30 = c2733sBA.b;
                                        str9 = "video/hevc";
                                        list2 = c2733sBA.a;
                                        str10 = c2733sBA.g;
                                        i31 = c2733sBA.c;
                                        f2 = f;
                                        i32 = c2733sBA.d;
                                        i33 = c2733sBA.e;
                                    } else if (iG5 != 1685480259) {
                                        iZ = iZ;
                                        iG3 = iG3;
                                        iZ2 = iZ2;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = iG10;
                                        str7 = str5;
                                        j2E = J2.e(c2562qX);
                                        if (j2E != null) {
                                            str5 = j2E.m;
                                            str4 = "video/dolby-vision";
                                        } else {
                                            str5 = str7;
                                        }
                                        fX = fX;
                                    } else {
                                        iZ = iZ;
                                        iG3 = iG3;
                                        iZ2 = iZ2;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = iG10;
                                        str7 = str5;
                                        j2E = J2.e(c2562qX);
                                        if (j2E != null) {
                                            str5 = j2E.m;
                                            str4 = "video/dolby-vision";
                                        } else {
                                            str5 = str7;
                                        }
                                        fX = fX;
                                    }
                                    i22 += iG4;
                                    bArr = bArr2;
                                    str2 = str111;
                                    iG3 = iG3;
                                    i17 = i27;
                                    i16 = i28;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                    iG10 = i29;
                                }
                                iZ = iZ;
                                iG3 = iG3;
                                iZ2 = iZ2;
                                i27 = i17;
                                i28 = i16;
                                i18 = i30;
                                list = list2;
                                i29 = iG10;
                                int i613 = i32;
                                iC = i33;
                                fX = f2;
                                i20 = i613;
                                String str26 = str10;
                                str4 = str9;
                                i19 = i31;
                                str5 = str26;
                                i22 += iG4;
                                bArr = bArr2;
                                str2 = str111;
                                iG3 = iG3;
                                i17 = i27;
                                i16 = i28;
                                iZ2 = iZ2;
                                iZ = iZ;
                                iG10 = i29;
                            }
                            i23 = i17;
                            iG2 = i16;
                            iG10 = iG10;
                            str6 = str5;
                            if (str4 == null) {
                                i3 = i14;
                                c0643Nw = c0643Nw3;
                            } else {
                                c0617Mw = new C0617Mw();
                                c0617Mw.a = Integer.toString(iG10);
                                c0617Mw.k = str4;
                                c0617Mw.h = str6;
                                c0617Mw.p = i24;
                                c0617Mw.q = iZ2;
                                c0617Mw.t = fX;
                                i3 = i14;
                                c0617Mw.s = i3;
                                c0617Mw.u = bArr2;
                                c0617Mw.v = i21;
                                c0617Mw.m = list;
                                c0617Mw.n = c3271xo2;
                                i25 = i20;
                                if (i19 == -1) {
                                    i24 = iZ;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c0617Mw.w = new C1602gf(i19, i25, iC, bArrArray);
                                } else {
                                    i24 = iZ;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c0617Mw.w = new C1602gf(i19, i25, iC, bArrArray);
                                }
                                if (c3209x6 != null) {
                                    C3209x6 c3209x10 = c3209x6;
                                    c0617Mw.f = Pu0.s(c3209x10.l);
                                    c0617Mw.g = Pu0.s(c3209x10.m);
                                }
                                c0643Nw = new C0643Nw(c0617Mw);
                            }
                            i8 = i18;
                        } else {
                            i6 = i6;
                            i14 = i3;
                            c2821t8 = c2821t8;
                            pairCreate = pairCreate;
                            xl0Arr3 = xl0Arr;
                            c0643Nw3 = c0643Nw;
                            str2 = "childAtomSize must be positive";
                            c2562qX.F(i13 + 16);
                            c2562qX.G(16);
                            iZ = c2562qX.z();
                            iZ2 = c2562qX.z();
                            c2562qX.G(50);
                            i15 = c2562qX.b;
                            if (iG3 == 1701733238) {
                                i16 = iG2;
                                i17 = i13;
                                pairD = d(c2562qX, i17, i16);
                                if (pairD != null) {
                                    iG3 = ((Integer) pairD.first).intValue();
                                    if (c3271xo == null) {
                                        c3271xoA = null;
                                    } else {
                                        c3271xoA = c3271xo.a(((Xl0) pairD.second).b);
                                    }
                                    xl0Arr3[i6] = (Xl0) pairD.second;
                                } else {
                                    c3271xoA = c3271xo;
                                }
                                c2562qX.F(i15);
                            } else {
                                i16 = iG2;
                                i17 = i13;
                                c3271xoA = c3271xo;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            str = str;
                            c3271xo2 = c3271xoA;
                            str4 = str3;
                            i18 = i8;
                            bArr = null;
                            iC = -1;
                            i19 = -1;
                            str5 = null;
                            byteBufferOrder = null;
                            c3209x6 = null;
                            i20 = -1;
                            z4 = false;
                            list = null;
                            i21 = -1;
                            i22 = i15;
                            fX = 1.0f;
                            while (true) {
                                if (i22 - i17 >= i16) {
                                    bArr2 = bArr;
                                    fX = fX;
                                    break;
                                }
                                c2562qX.F(i22);
                                i26 = c2562qX.b;
                                bArr2 = bArr;
                                iG4 = c2562qX.g();
                                fX = fX;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC2506pt.i(str2, z5);
                                iG5 = c2562qX.g();
                                String str112 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    AbstractC2506pt.i(null, z7);
                                    c2562qX.F(i26 + 8);
                                    c2920u7A = C2920u7.a(c2562qX);
                                    if (z4) {
                                        f3 = c2920u7A.h;
                                    } else {
                                        f3 = fX;
                                    }
                                    i30 = c2920u7A.b;
                                    str9 = "video/avc";
                                    list2 = c2920u7A.a;
                                    str10 = c2920u7A.i;
                                    i31 = c2920u7A.e;
                                    f2 = f3;
                                    i32 = c2920u7A.f;
                                    i33 = c2920u7A.g;
                                } else {
                                    if (iG5 == 1752589123) {
                                        if (str4 == null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        AbstractC2506pt.i(null, z6);
                                        c2562qX.F(i26 + 8);
                                        c2733sBA = C2733sB.a(c2562qX);
                                        if (z4) {
                                            f = c2733sBA.f;
                                        } else {
                                            f = fX;
                                        }
                                        i30 = c2733sBA.b;
                                        str9 = "video/hevc";
                                        list2 = c2733sBA.a;
                                        str10 = c2733sBA.g;
                                        i31 = c2733sBA.c;
                                        f2 = f;
                                        i32 = c2733sBA.d;
                                        i33 = c2733sBA.e;
                                    } else if (iG5 != 1685480259) {
                                        iZ = iZ;
                                        iG3 = iG3;
                                        iZ2 = iZ2;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = iG10;
                                        str7 = str5;
                                        j2E = J2.e(c2562qX);
                                        if (j2E != null) {
                                            str5 = j2E.m;
                                            str4 = "video/dolby-vision";
                                        } else {
                                            str5 = str7;
                                        }
                                        fX = fX;
                                    } else {
                                        iZ = iZ;
                                        iG3 = iG3;
                                        iZ2 = iZ2;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = iG10;
                                        str7 = str5;
                                        j2E = J2.e(c2562qX);
                                        if (j2E != null) {
                                            str5 = j2E.m;
                                            str4 = "video/dolby-vision";
                                        } else {
                                            str5 = str7;
                                        }
                                        fX = fX;
                                    }
                                    i22 += iG4;
                                    bArr = bArr2;
                                    str2 = str112;
                                    iG3 = iG3;
                                    i17 = i27;
                                    i16 = i28;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                    iG10 = i29;
                                }
                                iZ = iZ;
                                iG3 = iG3;
                                iZ2 = iZ2;
                                i27 = i17;
                                i28 = i16;
                                i18 = i30;
                                list = list2;
                                i29 = iG10;
                                int i614 = i32;
                                iC = i33;
                                fX = f2;
                                i20 = i614;
                                String str27 = str10;
                                str4 = str9;
                                i19 = i31;
                                str5 = str27;
                                i22 += iG4;
                                bArr = bArr2;
                                str2 = str112;
                                iG3 = iG3;
                                i17 = i27;
                                i16 = i28;
                                iZ2 = iZ2;
                                iZ = iZ;
                                iG10 = i29;
                            }
                            i23 = i17;
                            iG2 = i16;
                            iG10 = iG10;
                            str6 = str5;
                            if (str4 == null) {
                                i3 = i14;
                                c0643Nw = c0643Nw3;
                            } else {
                                c0617Mw = new C0617Mw();
                                c0617Mw.a = Integer.toString(iG10);
                                c0617Mw.k = str4;
                                c0617Mw.h = str6;
                                c0617Mw.p = i24;
                                c0617Mw.q = iZ2;
                                c0617Mw.t = fX;
                                i3 = i14;
                                c0617Mw.s = i3;
                                c0617Mw.u = bArr2;
                                c0617Mw.v = i21;
                                c0617Mw.m = list;
                                c0617Mw.n = c3271xo2;
                                i25 = i20;
                                if (i19 == -1) {
                                    i24 = iZ;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c0617Mw.w = new C1602gf(i19, i25, iC, bArrArray);
                                } else {
                                    i24 = iZ;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c0617Mw.w = new C1602gf(i19, i25, iC, bArrArray);
                                }
                                if (c3209x6 != null) {
                                    C3209x6 c3209x11 = c3209x6;
                                    c0617Mw.f = Pu0.s(c3209x11.l);
                                    c0617Mw.g = Pu0.s(c3209x11.m);
                                }
                                c0643Nw = new C0643Nw(c0617Mw);
                            }
                            i8 = i18;
                        }
                        c2562qX.F(i23 + iG2);
                        i6++;
                        i3 = i3;
                        iG = i510;
                        i53 = i511;
                        arrayList2 = arrayList5;
                        j3 = j7;
                        str = str;
                        xl0Arr = xl0Arr3;
                        pairCreate = pairCreate;
                        iG10 = iG10;
                        i = i;
                        c2821t8 = c2821t8;
                        c3271xo = c3271xo;
                    }
                    arrayList = arrayList2;
                    i9 = i53;
                    c2821t7 = c2821t8;
                    j4 = j3;
                    pair = pairCreate;
                    i10 = i;
                    i11 = iG10;
                    xl0Arr2 = xl0Arr;
                    c0643Nw2 = c0643Nw;
                    if (z) {
                        c2821t8 = c2821t7;
                        c2821t6E = c2821t8.E(1701082227);
                        if (c2821t6E == null) {
                            c2918u6F2 = c2821t6E.F(1701606260);
                            if (c2918u6F2 == null) {
                                pairCreate2 = null;
                            } else {
                                c2562qX2 = c2918u6F2.n;
                                c2562qX2.F(8);
                                iB2 = AbstractC3015v6.B(c2562qX2.g());
                                iX = c2562qX2.x();
                                jArr3 = new long[iX];
                                jArr4 = new long[iX];
                                while (i12 < iX) {
                                    if (iB2 == 1) {
                                        jV2 = c2562qX2.y();
                                    } else {
                                        jV2 = c2562qX2.v();
                                    }
                                    jArr3[i12] = jV2;
                                    if (iB2 == 1) {
                                        jG = c2562qX2.o();
                                    } else {
                                        jG = c2562qX2.g();
                                    }
                                    jArr4[i12] = jG;
                                    if (c2562qX2.r() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c2562qX2.G(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (c0643Nw2 == null) {
                            wl0 = null;
                        } else {
                            wl0 = new Wl0(i11, i10, ((Long) pair.first).longValue(), j4, jR, c0643Nw2, i7, xl0Arr2, i8, jArr, jArr2);
                        }
                    } else {
                        c2821t8 = c2821t7;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (c0643Nw2 == null) {
                        wl0 = null;
                    } else {
                        wl0 = new Wl0(i11, i10, ((Long) pair.first).longValue(), j4, jR, c0643Nw2, i7, xl0Arr2, i8, jArr, jArr2);
                    }
                }
                Wl0 wl1 = (Wl0) interfaceC0671Oy.apply(wl0);
                if (wl1 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2821t6 c2821t6E7 = c2821t8.E(1835297121);
                    c2821t6E7.getClass();
                    C2821t6 c2821t6E8 = c2821t6E7.E(1835626086);
                    c2821t6E8.getClass();
                    C2821t6 c2821t6E9 = c2821t6E8.E(1937007212);
                    c2821t6E9.getClass();
                    C1421em0 c1421em0E = e(wl1, c2821t6E9, c1642gz);
                    arrayList2 = arrayList;
                    arrayList2.add(c1421em0E);
                }
            }
            i53 = i9 + 1;
        }
    }
}
