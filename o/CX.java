package o;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class CX {
    public char a;
    public final float[] b;

    public CX(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * dSin) + (d3 * dCos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * dSin) + (((double) f3) * dCos)) / d7;
        double d14 = ((d12 * dCos) + (((double) (-f3)) * dSin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d20);
        double d21 = d15 * dSqrt;
        double d22 = dSqrt * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d10 - d2, d8 - d);
        double dAtan3 = Math.atan2(d14 - d2, d13 - d) - dAtan2;
        int i = 0;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * dCos) - (d24 * dSin);
        double d26 = (d24 * dCos) + (d23 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d27 = -d7;
        double d28 = d27 * dCos2;
        double d29 = d9 * dSin2;
        double d30 = (d28 * dSin3) - (d29 * dCos3);
        double d31 = d27 * dSin2;
        double d32 = d9 * dCos2;
        double d33 = (dCos3 * d32) + (dSin3 * d31);
        double d34 = dAtan3 / ((double) iCeil);
        double d35 = dAtan2;
        while (i < iCeil) {
            double d36 = d35 + d34;
            double dSin4 = Math.sin(d36);
            double dCos4 = Math.cos(d36);
            double d37 = d34;
            double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
            double d39 = d25;
            double d40 = (d32 * dSin4) + (d7 * dSin2 * dCos4) + d26;
            double d41 = (d28 * dSin4) - (d29 * dCos4);
            double d42 = (dCos4 * d32) + (dSin4 * d31);
            double d43 = d36 - d35;
            double dTan = Math.tan(d43 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d41)), (float) (d40 - (dSqrt2 * d42)), (float) d38, (float) d40);
            i++;
            d32 = d32;
            d31 = d31;
            iCeil = iCeil;
            dCos2 = dCos2;
            d35 = d36;
            d7 = d7;
            d33 = d42;
            d30 = d41;
            d6 = d38;
            d11 = d40;
            d34 = d37;
            d25 = d39;
        }
    }

    public static void b(CX[] cxArr, Path path) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        CX[] cxArr2 = cxArr;
        float[] fArr = new float[6];
        int length = cxArr2.length;
        char c = 'm';
        int i3 = 0;
        while (i3 < length) {
            CX cx = cxArr2[i3];
            char c2 = cx.a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c2) {
                case 'A':
                case Yu0.b.S /* 97 */:
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case Yu0.b.J /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case Yu0.b.N /* 81 */:
                case 'S':
                case Yu0.b.d0 /* 113 */:
                case Yu0.b.e0 /* 115 */:
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i4 = 0;
            while (true) {
                float[] fArr2 = cx.b;
                if (i4 < fArr2.length) {
                    if (c2 != 'A') {
                        if (c2 != 'C') {
                            if (c2 == 'H') {
                                i2 = i4;
                                c2 = c2;
                                i3 = i3;
                                length = length;
                                cx = cx;
                                path.lineTo(fArr2[i2], f22);
                                f21 = fArr2[i2];
                            } else if (c2 == 'Q') {
                                i2 = i4;
                                float f23 = fArr2[i2];
                                int i5 = i2 + 1;
                                float f24 = fArr2[i5];
                                int i6 = i2 + 2;
                                int i7 = i2 + 3;
                                path.quadTo(f23, f24, fArr2[i6], fArr2[i7]);
                                f = fArr2[i2];
                                f2 = fArr2[i5];
                                f21 = fArr2[i6];
                                f22 = fArr2[i7];
                            } else if (c2 == 'V') {
                                i2 = i4;
                                c2 = c2;
                                i3 = i3;
                                length = length;
                                cx = cx;
                                path.lineTo(f21, fArr2[i2]);
                                f22 = fArr2[i2];
                            } else if (c2 != 'a') {
                                if (c2 != 'c') {
                                    if (c2 != 'h') {
                                        if (c2 == 'q') {
                                            i2 = i4;
                                            float f25 = f22;
                                            float f26 = f21;
                                            int i8 = i2 + 1;
                                            int i9 = i2 + 2;
                                            int i10 = i2 + 3;
                                            path.rQuadTo(fArr2[i2], fArr2[i8], fArr2[i9], fArr2[i10]);
                                            float f27 = f26 + fArr2[i2];
                                            float f28 = fArr2[i8] + f25;
                                            float f29 = f26 + fArr2[i9];
                                            f22 = f25 + fArr2[i10];
                                            f16 = f28;
                                            f15 = f27;
                                            f21 = f29;
                                        } else if (c2 == 'v') {
                                            i2 = i4;
                                            path.rLineTo(0.0f, fArr2[i2]);
                                            f22 += fArr2[i2];
                                        } else if (c2 == 'L') {
                                            i2 = i4;
                                            int i11 = i2 + 1;
                                            path.lineTo(fArr2[i2], fArr2[i11]);
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i11];
                                        } else if (c2 == 'M') {
                                            i2 = i4;
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f21, f22);
                                            } else {
                                                path.moveTo(f21, f22);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c2 == 'S') {
                                            i2 = i4;
                                            float f30 = f22;
                                            float f31 = f21;
                                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                f7 = (f30 * 2.0f) - f16;
                                                f8 = (f31 * 2.0f) - f15;
                                            } else {
                                                f8 = f31;
                                                f7 = f30;
                                            }
                                            int i12 = i2 + 1;
                                            int i13 = i2 + 2;
                                            int i14 = i2 + 3;
                                            path.cubicTo(f8, f7, fArr2[i2], fArr2[i12], fArr2[i13], fArr2[i14]);
                                            float f32 = fArr2[i2];
                                            float f33 = fArr2[i12];
                                            f21 = fArr2[i13];
                                            f22 = fArr2[i14];
                                            f16 = f33;
                                            f15 = f32;
                                        } else if (c2 == 'T') {
                                            i2 = i4;
                                            float f34 = f22;
                                            float f35 = f21;
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f3 = (f35 * 2.0f) - f15;
                                                f4 = (f34 * 2.0f) - f16;
                                            } else {
                                                f3 = f35;
                                                f4 = f34;
                                            }
                                            int i15 = i2 + 1;
                                            path.quadTo(f3, f4, fArr2[i2], fArr2[i15]);
                                            f5 = fArr2[i2];
                                            f6 = fArr2[i15];
                                        } else if (c2 == 'l') {
                                            i2 = i4;
                                            int i16 = i2 + 1;
                                            path.rLineTo(fArr2[i2], fArr2[i16]);
                                            f21 += fArr2[i2];
                                            f22 += fArr2[i16];
                                        } else if (c2 == 'm') {
                                            i2 = i4;
                                            float f36 = fArr2[i2];
                                            f21 += f36;
                                            float f37 = fArr2[i2 + 1];
                                            f22 += f37;
                                            if (i2 > 0) {
                                                path.rLineTo(f36, f37);
                                            } else {
                                                path.rMoveTo(f36, f37);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c2 == 's') {
                                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                float f38 = f21 - f15;
                                                f9 = f22 - f16;
                                                f10 = f38;
                                            } else {
                                                f9 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i17 = i4 + 1;
                                            int i18 = i4 + 2;
                                            int i19 = i4 + 3;
                                            i2 = i4;
                                            float f39 = f22;
                                            float f40 = f21;
                                            path.rCubicTo(f10, f9, fArr2[i4], fArr2[i17], fArr2[i18], fArr2[i19]);
                                            f3 = f40 + fArr2[i2];
                                            f4 = f39 + fArr2[i17];
                                            f5 = f40 + fArr2[i18];
                                            f6 = fArr2[i19] + f39;
                                        } else if (c2 != 't') {
                                            i2 = i4;
                                        } else {
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i20 = i4 + 1;
                                            path.rQuadTo(f11, f12, fArr2[i4], fArr2[i20]);
                                            float f41 = f11 + f21;
                                            float f42 = f12 + f22;
                                            f21 += fArr2[i4];
                                            f22 += fArr2[i20];
                                            f16 = f42;
                                            i2 = i4;
                                            f15 = f41;
                                        }
                                        cx = cx;
                                    } else {
                                        i2 = i4;
                                        path.rLineTo(fArr2[i2], 0.0f);
                                        f21 += fArr2[i2];
                                    }
                                    cx = cx;
                                } else {
                                    i2 = i4;
                                    float f43 = f22;
                                    float f44 = f21;
                                    int i21 = i2 + 2;
                                    int i22 = i2 + 3;
                                    int i23 = i2 + 4;
                                    int i24 = i2 + 5;
                                    path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                                    f3 = f44 + fArr2[i21];
                                    f4 = f43 + fArr2[i22];
                                    f5 = f44 + fArr2[i23];
                                    f6 = fArr2[i24] + f43;
                                }
                                f16 = f4;
                                f15 = f3;
                                f21 = f5;
                                f22 = f6;
                                cx = cx;
                            } else {
                                i2 = i4;
                                float f45 = f22;
                                float f46 = f21;
                                int i25 = i2 + 5;
                                int i26 = i2 + 6;
                                a(path, f46, f45, fArr2[i25] + f46, fArr2[i26] + f45, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                f21 = f46 + fArr2[i25];
                                f22 = f45 + fArr2[i26];
                            }
                            i4 = i2 + i;
                            cx = cx;
                            length = length;
                            c = c2;
                            c2 = c;
                            i3 = i3;
                        } else {
                            i2 = i4;
                            int i27 = i2 + 2;
                            int i28 = i2 + 3;
                            int i29 = i2 + 4;
                            int i30 = i2 + 5;
                            path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                            f21 = fArr2[i29];
                            f22 = fArr2[i30];
                            f = fArr2[i27];
                            f2 = fArr2[i28];
                        }
                        f15 = f;
                        f16 = f2;
                        i4 = i2 + i;
                        cx = cx;
                        length = length;
                        c = c2;
                        c2 = c;
                        i3 = i3;
                    } else {
                        i2 = i4;
                        int i31 = i2 + 5;
                        int i32 = i2 + 6;
                        a(path, f21, f22, fArr2[i31], fArr2[i32], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        f21 = fArr2[i31];
                        f22 = fArr2[i32];
                    }
                    f16 = f22;
                    f15 = f21;
                    i4 = i2 + i;
                    cx = cx;
                    length = length;
                    c = c2;
                    c2 = c;
                    i3 = i3;
                }
            }
            fArr[0] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c = cx.a;
            i3++;
            cxArr2 = cxArr;
            length = length;
        }
    }

    public CX(CX cx) {
        this.a = cx.a;
        float[] fArr = cx.b;
        this.b = zy0.m(fArr, fArr.length);
    }
}
