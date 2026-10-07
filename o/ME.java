package o;

import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ME extends AP {
    public static final C0633Nm e = new C0633Nm(7);
    public final C0633Nm d;

    public ME(C0633Nm c0633Nm) {
        this.d = c0633Nm;
    }

    public static C3009v3 C(C2562qX c2562qX, int i, int i2) {
        int iP;
        String strConcat;
        int iU = c2562qX.u();
        Charset charsetM = M(iU);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c2562qX.e(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + U9.I(new String(bArr, 0, 3, AbstractC1402ed.b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iP = 2;
        } else {
            iP = P(0, bArr);
            String strI = U9.I(new String(bArr, 0, iP, AbstractC1402ed.b));
            strConcat = strI.indexOf(47) == -1 ? "image/".concat(strI) : strI;
        }
        int i4 = bArr[iP + 1] & 255;
        int i5 = iP + 2;
        int iO = O(bArr, i5, iU);
        String str = new String(bArr, i5, iO - i5, charsetM);
        int iL = L(iU) + iO;
        return new C3009v3(strConcat, str, i4, i3 <= iL ? Lr0.e : Arrays.copyOfRange(bArr, iL, i3));
    }

    public static C0831Vc D(C2562qX c2562qX, int i, int i2, boolean z, int i3, C0633Nm c0633Nm) {
        int i4 = c2562qX.b;
        int iP = P(i4, c2562qX.a);
        String str = new String(c2562qX.a, i4, iP - i4, AbstractC1402ed.b);
        c2562qX.F(iP + 1);
        int iG = c2562qX.g();
        int iG2 = c2562qX.g();
        long jV = c2562qX.v();
        long j = jV == 4294967295L ? -1L : jV;
        long jV2 = c2562qX.v();
        long j2 = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c2562qX.b < i5) {
            NE neG = G(i2, c2562qX, z, i3, c0633Nm);
            if (neG != null) {
                arrayList.add(neG);
            }
        }
        return new C0831Vc(str, iG, iG2, j, j2, (NE[]) arrayList.toArray(new NE[0]));
    }

    public static C0857Wc E(C2562qX c2562qX, int i, int i2, boolean z, int i3, C0633Nm c0633Nm) {
        int i4 = c2562qX.b;
        int iP = P(i4, c2562qX.a);
        String str = new String(c2562qX.a, i4, iP - i4, AbstractC1402ed.b);
        c2562qX.F(iP + 1);
        int iU = c2562qX.u();
        boolean z2 = (iU & 2) != 0;
        boolean z3 = (iU & 1) != 0;
        int iU2 = c2562qX.u();
        String[] strArr = new String[iU2];
        for (int i5 = 0; i5 < iU2; i5++) {
            int i6 = c2562qX.b;
            int iP2 = P(i6, c2562qX.a);
            strArr[i5] = new String(c2562qX.a, i6, iP2 - i6, AbstractC1402ed.b);
            c2562qX.F(iP2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c2562qX.b < i7) {
            NE neG = G(i2, c2562qX, z, i3, c0633Nm);
            if (neG != null) {
                arrayList.add(neG);
            }
        }
        return new C0857Wc(str, z2, z3, strArr, (NE[]) arrayList.toArray(new NE[0]));
    }

    public static C3156wf F(int i, C2562qX c2562qX) {
        if (i < 4) {
            return null;
        }
        int iU = c2562qX.u();
        Charset charsetM = M(iU);
        byte[] bArr = new byte[3];
        c2562qX.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c2562qX.e(bArr2, 0, i2);
        int iO = O(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iO, charsetM);
        int iL = L(iU) + iO;
        return new C3156wf(str, str2, J(bArr2, iL, O(bArr2, iL, iU), charsetM));
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0221  */
    /* JADX WARN: Code duplicated, block: B:154:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0234  */
    /* JADX WARN: Code duplicated, block: B:160:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0264  */
    /* JADX WARN: Code duplicated, block: B:171:0x0271 A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:173:0x0282, B:95:0x0113, B:97:0x013f, B:100:0x0146, B:111:0x016e, B:113:0x019f, B:122:0x01cc, B:124:0x01e0, B:126:0x01e7, B:125:0x01e3, B:135:0x0200, B:146:0x021b, B:153:0x022d, B:159:0x023c, B:164:0x0253, B:170:0x026c, B:171:0x0271), top: B:180:0x0104 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, o.NE] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [o.NE] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    public static NE G(int i, C2562qX c2562qX, boolean z, int i2, C0633Nm c0633Nm) {
        int iX;
        int i3;
        ?? r14;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        JQ jqI;
        C0857Wc c0857WcE;
        C0831Vc c0831VcD;
        Parcelable c3472zr0;
        Li0 li0;
        ?? f8;
        int iU = c2562qX.u();
        int iU2 = c2562qX.u();
        int iU3 = c2562qX.u();
        int iU4 = i >= 3 ? c2562qX.u() : 0;
        if (i == 4) {
            iX = c2562qX.x();
            if (!z) {
                iX = (((iX >> 24) & 255) << 21) | (iX & 255) | (((iX >> 8) & 255) << 7) | (((iX >> 16) & 255) << 14);
            }
        } else {
            iX = i == 3 ? c2562qX.x() : c2562qX.w();
        }
        int i4 = iX;
        int iZ = i >= 3 ? c2562qX.z() : 0;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && i4 == 0 && iZ == 0) {
            c2562qX.F(c2562qX.c);
            return null;
        }
        int i5 = c2562qX.b + i4;
        if (i5 > c2562qX.c) {
            AP.z();
            c2562qX.F(c2562qX.c);
            return null;
        }
        if (c0633Nm != null) {
            i3 = i5;
            r14 = 0;
            if (!c0633Nm.h(i, iU, iU2, iU3, iU4)) {
                c2562qX.F(i3);
                return null;
            }
        } else {
            i3 = i5;
            r14 = 0;
        }
        if (i != 3) {
            int i6 = iZ;
            if (i == 4) {
                boolean z7 = (i6 & 64) != 0;
                boolean z8 = (i6 & 8) != 0;
                boolean z9 = (i6 & 4) != 0;
                z6 = (i6 & 2) != 0;
                boolean z10 = z9;
                z5 = (i6 & 1) != 0;
                z2 = z7;
                z3 = z8;
                z4 = z10;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (!z3 || z4) {
                AP.z();
                c2562qX.F(i3);
                return r14;
            }
            if (z2) {
                i4--;
                c2562qX.G(1);
            }
            if (z5) {
                i4 -= 4;
                c2562qX.G(4);
            }
            int iQ = z6 ? Q(i4, c2562qX) : i4;
            try {
                if (iU == 84 && iU2 == 88 && iU3 == 88 && (i == 2 || iU4 == 88)) {
                    if (iQ < 1) {
                        f8 = r14;
                    } else {
                        int iU5 = c2562qX.u();
                        int i7 = iQ - 1;
                        byte[] bArr = new byte[i7];
                        c2562qX.e(bArr, 0, i7);
                        int iO = O(bArr, 0, iU5);
                        c3472zr0 = new Li0("TXXX", new String(bArr, 0, iO, M(iU5)), K(bArr, iU5, L(iU5) + iO));
                        f8 = c3472zr0;
                    }
                } else if (iU == 84) {
                    String strN = N(i, iU, iU2, iU3, iU4);
                    if (iQ < 1) {
                        f8 = r14;
                    } else {
                        int iU6 = c2562qX.u();
                        int i8 = iQ - 1;
                        byte[] bArr2 = new byte[i8];
                        c2562qX.e(bArr2, 0, i8);
                        li0 = new Li0(strN, r14, K(bArr2, iU6, 0));
                    }
                } else {
                    if (iU == 87 && iU2 == 88 && iU3 == 88 && (i == 2 || iU4 == 88)) {
                        if (iQ < 1) {
                            f8 = r14;
                        } else {
                            int iU7 = c2562qX.u();
                            int i9 = iQ - 1;
                            byte[] bArr3 = new byte[i9];
                            c2562qX.e(bArr3, 0, i9);
                            int iO2 = O(bArr3, 0, iU7);
                            String str = new String(bArr3, 0, iO2, M(iU7));
                            int iL = L(iU7) + iO2;
                            c3472zr0 = new C3472zr0("WXXX", str, J(bArr3, iL, P(iL, bArr3), AbstractC1402ed.b));
                        }
                    } else if (iU == 87) {
                        String strN2 = N(i, iU, iU2, iU3, iU4);
                        byte[] bArr4 = new byte[iQ];
                        c2562qX.e(bArr4, 0, iQ);
                        c3472zr0 = new C3472zr0(strN2, r14, new String(bArr4, 0, P(0, bArr4), AbstractC1402ed.b));
                    } else if (iU == 80 && iU2 == 82 && iU3 == 73 && iU4 == 86) {
                        byte[] bArr5 = new byte[iQ];
                        c2562qX.e(bArr5, 0, iQ);
                        int iP = P(0, bArr5);
                        String str2 = new String(bArr5, 0, iP, AbstractC1402ed.b);
                        int i10 = iP + 1;
                        f8 = new C1943k30(str2, iQ <= i10 ? Lr0.e : Arrays.copyOfRange(bArr5, i10, iQ));
                    } else if (iU == 71 && iU2 == 69 && iU3 == 79 && (iU4 == 66 || i == 2)) {
                        f8 = H(iQ, c2562qX);
                    } else if (i == 2) {
                        if (iU == 80 && iU2 == 73 && iU3 == 67) {
                            f8 = C(c2562qX, iQ, i);
                        } else if (iU != 67 && iU2 == 79 && iU3 == 77 && (iU4 == 77 || i == 2)) {
                            f8 = F(iQ, c2562qX);
                        } else if (iU != 67 && iU2 == 72 && iU3 == 65 && iU4 == 80) {
                            c0831VcD = D(c2562qX, iQ, i, z, i2, c0633Nm);
                        } else if (iU != 67 && iU2 == 84 && iU3 == 79 && iU4 == 67) {
                            c0857WcE = E(c2562qX, iQ, i, z, i2, c0633Nm);
                        } else if (iU != 77 && iU2 == 76 && iU3 == 76 && iU4 == 84) {
                            jqI = I(iQ, c2562qX);
                        } else {
                            String strN3 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr6 = new byte[iQ];
                            c2562qX.e(bArr6, 0, iQ);
                            f8 = new F8(strN3, bArr6);
                        }
                    } else if (iU == 65 && iU2 == 80 && iU3 == 73 && iU4 == 67) {
                        f8 = C(c2562qX, iQ, i);
                    } else if (iU != 67) {
                        if (iU != 67) {
                            if (iU != 67) {
                                if (iU != 77) {
                                    String strN4 = N(i, iU, iU2, iU3, iU4);
                                    byte[] bArr7 = new byte[iQ];
                                    c2562qX.e(bArr7, 0, iQ);
                                    f8 = new F8(strN4, bArr7);
                                } else {
                                    String strN5 = N(i, iU, iU2, iU3, iU4);
                                    byte[] bArr8 = new byte[iQ];
                                    c2562qX.e(bArr8, 0, iQ);
                                    f8 = new F8(strN5, bArr8);
                                }
                            } else if (iU != 77) {
                                String strN6 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr9 = new byte[iQ];
                                c2562qX.e(bArr9, 0, iQ);
                                f8 = new F8(strN6, bArr9);
                            } else {
                                String strN7 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr10 = new byte[iQ];
                                c2562qX.e(bArr10, 0, iQ);
                                f8 = new F8(strN7, bArr10);
                            }
                        } else if (iU != 67) {
                            if (iU != 77) {
                                String strN8 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr11 = new byte[iQ];
                                c2562qX.e(bArr11, 0, iQ);
                                f8 = new F8(strN8, bArr11);
                            } else {
                                String strN9 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr12 = new byte[iQ];
                                c2562qX.e(bArr12, 0, iQ);
                                f8 = new F8(strN9, bArr12);
                            }
                        } else if (iU != 77) {
                            String strN10 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr13 = new byte[iQ];
                            c2562qX.e(bArr13, 0, iQ);
                            f8 = new F8(strN10, bArr13);
                        } else {
                            String strN11 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr14 = new byte[iQ];
                            c2562qX.e(bArr14, 0, iQ);
                            f8 = new F8(strN11, bArr14);
                        }
                    } else if (iU != 67) {
                        if (iU != 67) {
                            if (iU != 77) {
                                String strN12 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr15 = new byte[iQ];
                                c2562qX.e(bArr15, 0, iQ);
                                f8 = new F8(strN12, bArr15);
                            } else {
                                String strN13 = N(i, iU, iU2, iU3, iU4);
                                byte[] bArr16 = new byte[iQ];
                                c2562qX.e(bArr16, 0, iQ);
                                f8 = new F8(strN13, bArr16);
                            }
                        } else if (iU != 77) {
                            String strN14 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr17 = new byte[iQ];
                            c2562qX.e(bArr17, 0, iQ);
                            f8 = new F8(strN14, bArr17);
                        } else {
                            String strN15 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr18 = new byte[iQ];
                            c2562qX.e(bArr18, 0, iQ);
                            f8 = new F8(strN15, bArr18);
                        }
                    } else if (iU != 67) {
                        if (iU != 77) {
                            String strN16 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr19 = new byte[iQ];
                            c2562qX.e(bArr19, 0, iQ);
                            f8 = new F8(strN16, bArr19);
                        } else {
                            String strN17 = N(i, iU, iU2, iU3, iU4);
                            byte[] bArr110 = new byte[iQ];
                            c2562qX.e(bArr110, 0, iQ);
                            f8 = new F8(strN17, bArr110);
                        }
                    } else if (iU != 77) {
                        String strN18 = N(i, iU, iU2, iU3, iU4);
                        byte[] bArr111 = new byte[iQ];
                        c2562qX.e(bArr111, 0, iQ);
                        f8 = new F8(strN18, bArr111);
                    } else {
                        String strN19 = N(i, iU, iU2, iU3, iU4);
                        byte[] bArr112 = new byte[iQ];
                        c2562qX.e(bArr112, 0, iQ);
                        f8 = new F8(strN19, bArr112);
                    }
                    f8 = c3472zr0;
                }
                if (f8 == 0) {
                    f8 = jqI;
                    f8 = c0857WcE;
                    f8 = c0831VcD;
                    f8 = li0;
                    N(i, iU, iU2, iU3, iU4);
                    AP.z();
                }
                f8 = jqI;
                f8 = c0857WcE;
                f8 = c0831VcD;
                f8 = li0;
                c2562qX.F(i3);
                return f8;
            } catch (Throwable th) {
                c2562qX.F(i3);
                throw th;
            }
        }
        int i11 = iZ;
        z3 = (i11 & 128) != 0;
        z4 = (i11 & 64) != 0;
        z2 = (i11 & 32) != 0;
        z5 = z3;
        z6 = false;
        if (z3) {
        }
        AP.z();
        c2562qX.F(i3);
        return r14;
    }

    public static C0620Mz H(int i, C2562qX c2562qX) {
        int iU = c2562qX.u();
        Charset charsetM = M(iU);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2562qX.e(bArr, 0, i2);
        int iP = P(0, bArr);
        String str = new String(bArr, 0, iP, AbstractC1402ed.b);
        int i3 = iP + 1;
        int iO = O(bArr, i3, iU);
        String strJ = J(bArr, i3, iO, charsetM);
        int iL = L(iU) + iO;
        int iO2 = O(bArr, iL, iU);
        String strJ2 = J(bArr, iL, iO2, charsetM);
        int iL2 = L(iU) + iO2;
        return new C0620Mz(str, strJ, strJ2, i2 <= iL2 ? Lr0.e : Arrays.copyOfRange(bArr, iL2, i2));
    }

    public static JQ I(int i, C2562qX c2562qX) {
        int iZ = c2562qX.z();
        int iW = c2562qX.w();
        int iW2 = c2562qX.w();
        int iU = c2562qX.u();
        int iU2 = c2562qX.u();
        C2084lc c2084lc = new C2084lc();
        c2084lc.o(c2562qX);
        int i2 = ((i - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c2084lc.i(iU);
            int i5 = c2084lc.i(iU2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new JQ(iZ, iW, iW2, iArr, iArr2);
    }

    public static String J(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static M60 K(byte[] bArr, int i, int i2) {
        Object[] objArrCopyOf;
        if (i2 >= bArr.length) {
            return AbstractC0985aF.q("");
        }
        XE xe = AbstractC0985aF.m;
        U9.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int iO = O(bArr, i2, i);
        int i3 = 0;
        boolean z = false;
        while (i2 < iO) {
            String str = new String(bArr, i2, iO - i2, M(i));
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArrCopyOf = Arrays.copyOf(objArr, TE.e(objArr.length, i4));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArr.clone();
                }
                objArr[i3] = str;
                int iL = iO + L(i);
                i3++;
                i2 = iL;
                iO = O(bArr, iL, i);
            }
            objArr = objArrCopyOf;
            z = false;
            objArr[i3] = str;
            int iL2 = iO + L(i);
            i3++;
            i2 = iL2;
            iO = O(bArr, iL2, i);
        }
        M60 m60J = AbstractC0985aF.j(i3, objArr);
        return m60J.isEmpty() ? AbstractC0985aF.q("") : m60J;
    }

    public static int L(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset M(int i) {
        if (i == 1) {
            return AbstractC1402ed.f;
        }
        if (i != 2) {
            return i != 3 ? AbstractC1402ed.b : AbstractC1402ed.c;
        }
        return AbstractC1402ed.d;
    }

    public static String N(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int O(byte[] bArr, int i, int i2) {
        int iP = P(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iP;
        }
        while (iP < bArr.length - 1) {
            if ((iP - i) % 2 == 0 && bArr[iP + 1] == 0) {
                return iP;
            }
            iP = P(iP + 1, bArr);
        }
        return bArr.length;
    }

    public static int P(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int Q(int i, C2562qX c2562qX) {
        byte[] bArr = c2562qX.a;
        int i2 = c2562qX.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static boolean R(C2562qX c2562qX, int i, int i2, boolean z) {
        int iW;
        long jW;
        int iZ;
        int i3;
        int i4 = c2562qX.b;
        while (true) {
            try {
                boolean z2 = true;
                if (c2562qX.a() < i2) {
                    c2562qX.F(i4);
                    return true;
                }
                if (i >= 3) {
                    iW = c2562qX.g();
                    jW = c2562qX.v();
                    iZ = c2562qX.z();
                } else {
                    iW = c2562qX.w();
                    jW = c2562qX.w();
                    iZ = 0;
                }
                if (iW == 0 && jW == 0 && iZ == 0) {
                    c2562qX.F(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jW) != 0) {
                        c2562qX.F(i4);
                        return false;
                    }
                    jW = (((jW >> 24) & 255) << 21) | (jW & 255) | (((jW >> 8) & 255) << 7) | (((jW >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iZ & 64) != 0 ? 1 : 0;
                    if ((iZ & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iZ & 32) != 0 ? 1 : 0;
                        if ((iZ & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jW < i3) {
                    c2562qX.F(i4);
                    return false;
                }
                if (c2562qX.a() < jW) {
                    c2562qX.F(i4);
                    return false;
                }
                c2562qX.G((int) jW);
            } catch (Throwable th) {
                c2562qX.F(i4);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[SYNTHETIC] */
    public final CQ B(int i, byte[] bArr) {
        boolean z;
        LE le;
        int i2;
        int i3;
        boolean z2;
        int iQ;
        NE neG;
        boolean z3 = true;
        ArrayList arrayList = new ArrayList();
        C2562qX c2562qX = new C2562qX(i, bArr);
        if (c2562qX.a() < 10) {
            AP.z();
        } else {
            int iW = c2562qX.w();
            if (iW == 4801587) {
                int iU = c2562qX.u();
                c2562qX.G(1);
                int iU2 = c2562qX.u();
                int iT = c2562qX.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iG = c2562qX.g();
                            c2562qX.G(iG);
                            iT -= iG + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT2 = c2562qX.t();
                            c2562qX.G(iT2 - 4);
                            iT -= iT2;
                        }
                        if ((iU2 & 16) != 0) {
                            iT -= 10;
                        }
                    } else {
                        AP.z();
                    }
                    if (iU < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    le = new LE(iU, iT, z);
                } else if ((iU2 & 64) != 0) {
                    AP.z();
                } else {
                    if (iU < 4 || (iU2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    le = new LE(iU, iT, z);
                }
                if (le == null) {
                    return null;
                }
                int i4 = c2562qX.b;
                i2 = le.a;
                i3 = i2 == 2 ? 6 : 10;
                z2 = le.b;
                iQ = le.c;
                if (z2) {
                    iQ = Q(iQ, c2562qX);
                }
                c2562qX.E(i4 + iQ);
                if (R(c2562qX, i2, i3, false)) {
                    z3 = false;
                } else if (i2 == 4 || !R(c2562qX, 4, i3, true)) {
                    AP.z();
                    return null;
                }
                while (c2562qX.a() >= i3) {
                    neG = G(i2, c2562qX, z3, i3, this.d);
                    if (neG != null) {
                        arrayList.add(neG);
                    }
                }
                return new CQ(arrayList);
            }
            "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iW)));
            AP.z();
        }
        le = null;
        if (le == null) {
            return null;
        }
        int i5 = c2562qX.b;
        i2 = le.a;
        if (i2 == 2) {
        }
        z2 = le.b;
        iQ = le.c;
        if (z2) {
            iQ = Q(iQ, c2562qX);
        }
        c2562qX.E(i5 + iQ);
        if (R(c2562qX, i2, i3, false)) {
            if (i2 == 4) {
            }
            AP.z();
            return null;
        }
        z3 = false;
        while (c2562qX.a() >= i3) {
            neG = G(i2, c2562qX, z3, i3, this.d);
            if (neG != null) {
                arrayList.add(neG);
            }
        }
        return new CQ(arrayList);
    }

    @Override // o.AP
    public final CQ e(DQ dq, ByteBuffer byteBuffer) {
        return B(byteBuffer.limit(), byteBuffer.array());
    }
}
