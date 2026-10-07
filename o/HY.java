package o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class HY extends Rd0 {
    public final C2562qX m = new C2562qX();
    public final C2562qX n = new C2562qX();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GY f302o = new GY();
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    @Override // o.Rd0
    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) {
        C3162wi c3162wi;
        C3162wi c3162wi2;
        C2562qX c2562qX;
        int i2;
        int iU;
        C2562qX c2562qX2;
        int i3;
        int i4;
        int iW;
        C2562qX c2562qX3 = this.m;
        c2562qX3.D(i, bArr);
        if (c2562qX3.a() > 0 && (c2562qX3.a[c2562qX3.b] & 255) == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            Inflater inflater = this.p;
            C2562qX c2562qX4 = this.n;
            if (Lr0.G(c2562qX3, c2562qX4, inflater)) {
                c2562qX3.D(c2562qX4.c, c2562qX4.a);
            }
        }
        GY gy = this.f302o;
        int i5 = 0;
        gy.d = 0;
        gy.e = 0;
        gy.f = 0;
        gy.g = 0;
        gy.h = 0;
        gy.i = 0;
        C2562qX c2562qX5 = gy.a;
        c2562qX5.C(0);
        gy.c = false;
        ArrayList arrayList = new ArrayList();
        while (c2562qX3.a() >= 3) {
            int i6 = c2562qX3.c;
            int iU2 = c2562qX3.u();
            int iZ = c2562qX3.z();
            int i7 = c2562qX3.b + iZ;
            if (i7 > i6) {
                c2562qX3.F(i6);
                c2562qX = c2562qX3;
                c3162wi2 = null;
            } else {
                int[] iArr = gy.b;
                if (iU2 != 128) {
                    switch (iU2) {
                        case 20:
                            if (iZ % 5 == 2) {
                                c2562qX3.G(2);
                                Arrays.fill(iArr, i5);
                                int i8 = iZ / 5;
                                int i9 = 0;
                                while (i9 < i8) {
                                    int iU3 = c2562qX3.u();
                                    double dU = c2562qX3.u();
                                    double dU2 = c2562qX3.u() - 128;
                                    double dU3 = c2562qX3.u() - 128;
                                    iArr[iU3] = (Lr0.j((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (c2562qX3.u() << 24) | (Lr0.j((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8) | Lr0.j((int) ((dU3 * 1.772d) + dU), 0, 255);
                                    i9++;
                                    c2562qX3 = c2562qX3;
                                }
                                c2562qX2 = c2562qX3;
                                gy.c = true;
                            } else {
                                c2562qX2 = c2562qX3;
                            }
                            break;
                        case 21:
                            if (iZ >= 4) {
                                c2562qX3.G(3);
                                int i10 = iZ - 4;
                                if (!((128 & c2562qX3.u()) != 0)) {
                                    i3 = c2562qX5.b;
                                    i4 = c2562qX5.c;
                                    if (i3 < i4 && i10 > 0) {
                                        int iMin = Math.min(i10, i4 - i3);
                                        c2562qX3.e(c2562qX5.a, i3, iMin);
                                        c2562qX5.F(i3 + iMin);
                                    }
                                } else if (i10 >= 7 && (iW = c2562qX3.w()) >= 4) {
                                    gy.h = c2562qX3.z();
                                    gy.i = c2562qX3.z();
                                    c2562qX5.C(iW - 4);
                                    i10 = iZ - 11;
                                    i3 = c2562qX5.b;
                                    i4 = c2562qX5.c;
                                    if (i3 < i4) {
                                        int iMin2 = Math.min(i10, i4 - i3);
                                        c2562qX3.e(c2562qX5.a, i3, iMin2);
                                        c2562qX5.F(i3 + iMin2);
                                    }
                                }
                            }
                            c2562qX2 = c2562qX3;
                            break;
                        case 22:
                            if (iZ >= 19) {
                                gy.d = c2562qX3.z();
                                gy.e = c2562qX3.z();
                                c2562qX3.G(11);
                                gy.f = c2562qX3.z();
                                gy.g = c2562qX3.z();
                            }
                            c2562qX2 = c2562qX3;
                            break;
                        default:
                            c2562qX2 = c2562qX3;
                            break;
                    }
                    c2562qX = c2562qX2;
                    c3162wi2 = null;
                } else {
                    C2562qX c2562qX6 = c2562qX3;
                    if (gy.d == 0 || gy.e == 0 || gy.h == 0 || gy.i == 0 || (i2 = c2562qX5.c) == 0 || c2562qX5.b != i2 || !gy.c) {
                        c3162wi = null;
                    } else {
                        c2562qX5.F(0);
                        int i11 = gy.h * gy.i;
                        int[] iArr2 = new int[i11];
                        int i12 = 0;
                        while (i12 < i11) {
                            int iU4 = c2562qX5.u();
                            if (iU4 != 0) {
                                iU = i12 + 1;
                                iArr2[i12] = iArr[iU4];
                            } else {
                                int iU5 = c2562qX5.u();
                                if (iU5 != 0) {
                                    iU = ((iU5 & 64) == 0 ? iU5 & 63 : ((iU5 & 63) << 8) | c2562qX5.u()) + i12;
                                    Arrays.fill(iArr2, i12, iU, (iU5 & 128) == 0 ? 0 : iArr[c2562qX5.u()]);
                                }
                            }
                            i12 = iU;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, gy.h, gy.i, Bitmap.Config.ARGB_8888);
                        float f = gy.f;
                        float f2 = gy.d;
                        float f3 = f / f2;
                        float f4 = gy.g;
                        float f5 = gy.e;
                        c3162wi = new C3162wi(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, gy.h / f2, gy.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    gy.d = 0;
                    gy.e = 0;
                    gy.f = 0;
                    gy.g = 0;
                    gy.h = 0;
                    gy.i = 0;
                    c2562qX5.C(0);
                    gy.c = false;
                    c3162wi2 = c3162wi;
                    c2562qX = c2562qX6;
                }
                c2562qX.F(i7);
            }
            if (c3162wi2 != null) {
                arrayList.add(c3162wi2);
            }
            c2562qX3 = c2562qX;
            i5 = 0;
        }
        return new C2665rc(3, Collections.unmodifiableList(arrayList));
    }
}
