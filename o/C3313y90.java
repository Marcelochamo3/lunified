package o;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: o.y90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3313y90 {
    public final C1562g8 a;
    public final int b;
    public final C2562qX c;
    public C3209x6 d;
    public C3209x6 e;
    public C3209x6 f;
    public long g;

    public C3313y90(C1562g8 c1562g8) {
        this.a = c1562g8;
        int i = c1562g8.c;
        this.b = i;
        this.c = new C2562qX(32);
        C3209x6 c3209x6 = new C3209x6(i, 0L);
        this.d = c3209x6;
        this.e = c3209x6;
        this.f = c3209x6;
    }

    public static C3209x6 d(C3209x6 c3209x6, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c3209x6.m) {
            c3209x6 = (C3209x6) c3209x6.f1112o;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c3209x6.m - j));
            C2813t2 c2813t2 = (C2813t2) c3209x6.n;
            byteBuffer.put(c2813t2.a, ((int) (j - c3209x6.l)) + c2813t2.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c3209x6.m) {
                c3209x6 = (C3209x6) c3209x6.f1112o;
            }
        }
        return c3209x6;
    }

    public static C3209x6 e(C3209x6 c3209x6, long j, byte[] bArr, int i) {
        while (j >= c3209x6.m) {
            c3209x6 = (C3209x6) c3209x6.f1112o;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c3209x6.m - j));
            C2813t2 c2813t2 = (C2813t2) c3209x6.n;
            System.arraycopy(c2813t2.a, ((int) (j - c3209x6.l)) + c2813t2.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c3209x6.m) {
                c3209x6 = (C3209x6) c3209x6.f1112o;
            }
        }
        return c3209x6;
    }

    public static C3209x6 f(C3209x6 c3209x6, C0656Oj c0656Oj, C3410z90 c3410z90, C2562qX c2562qX) {
        int iZ;
        if (c0656Oj.j(1073741824)) {
            long j = c3410z90.b;
            c2562qX.C(1);
            C3209x6 c3209x6E = e(c3209x6, j, c2562qX.a, 1);
            long j2 = j + 1;
            byte b = c2562qX.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            C2968ui c2968ui = c0656Oj.n;
            byte[] bArr = c2968ui.a;
            if (bArr == null) {
                c2968ui.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c3209x6 = e(c3209x6E, j2, c2968ui.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c2562qX.C(2);
                c3209x6 = e(c3209x6, j3, c2562qX.a, 2);
                j3 += 2;
                iZ = c2562qX.z();
            } else {
                iZ = 1;
            }
            int[] iArr = c2968ui.d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = c2968ui.e;
            if (iArr2 == null || iArr2.length < iZ) {
                iArr2 = new int[iZ];
            }
            if (z) {
                int i2 = iZ * 6;
                c2562qX.C(i2);
                c3209x6 = e(c3209x6, j3, c2562qX.a, i2);
                j3 += (long) i2;
                c2562qX.F(0);
                for (int i3 = 0; i3 < iZ; i3++) {
                    iArr[i3] = c2562qX.z();
                    iArr2[i3] = c2562qX.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c3410z90.a - ((int) (j3 - c3410z90.b));
            }
            C1226cm0 c1226cm0 = c3410z90.c;
            int i4 = Lr0.a;
            byte[] bArr2 = c1226cm0.b;
            byte[] bArr3 = c2968ui.a;
            c2968ui.f = iZ;
            c2968ui.d = iArr;
            c2968ui.e = iArr2;
            c2968ui.b = bArr2;
            c2968ui.a = bArr3;
            int i5 = c1226cm0.a;
            c2968ui.c = i5;
            int i6 = c1226cm0.c;
            c2968ui.g = i6;
            int i7 = c1226cm0.d;
            c2968ui.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = c2968ui.i;
            cryptoInfo.numSubSamples = iZ;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (Lr0.a >= 24) {
                C2720s4 c2720s4 = c2968ui.j;
                c2720s4.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c2720s4.n).set(i6, i7);
                ((MediaCodec.CryptoInfo) c2720s4.m).setPattern((MediaCodec.CryptoInfo.Pattern) c2720s4.n);
            }
            long j4 = c3410z90.b;
            int i8 = (int) (j3 - j4);
            c3410z90.b = j4 + ((long) i8);
            c3410z90.a -= i8;
        }
        if (!c0656Oj.j(268435456)) {
            c0656Oj.H(c3410z90.a);
            return d(c3209x6, c3410z90.b, c0656Oj.f439o, c3410z90.a);
        }
        c2562qX.C(4);
        C3209x6 c3209x6E2 = e(c3209x6, c3410z90.b, c2562qX.a, 4);
        int iX = c2562qX.x();
        c3410z90.b += 4;
        c3410z90.a -= 4;
        c0656Oj.H(iX);
        C3209x6 c3209x6D = d(c3209x6E2, c3410z90.b, c0656Oj.f439o, iX);
        c3410z90.b += (long) iX;
        int i9 = c3410z90.a - iX;
        c3410z90.a = i9;
        ByteBuffer byteBuffer = c0656Oj.r;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c0656Oj.r = ByteBuffer.allocate(i9);
        } else {
            c0656Oj.r.clear();
        }
        return d(c3209x6D, c3410z90.b, c0656Oj.r, c3410z90.a);
    }

    public final void a(C3209x6 c3209x6) {
        if (((C2813t2) c3209x6.n) == null) {
            return;
        }
        C1562g8 c1562g8 = this.a;
        synchronized (c1562g8) {
            C3209x6 c3209x7 = c3209x6;
            while (c3209x7 != null) {
                try {
                    C2813t2[] c2813t2Arr = (C2813t2[]) c1562g8.g;
                    int i = c1562g8.f;
                    c1562g8.f = i + 1;
                    C2813t2 c2813t2 = (C2813t2) c3209x7.n;
                    c2813t2.getClass();
                    c2813t2Arr[i] = c2813t2;
                    c1562g8.e--;
                    c3209x7 = (C3209x6) c3209x7.f1112o;
                    if (c3209x7 == null || ((C2813t2) c3209x7.n) == null) {
                        c3209x7 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1562g8.notifyAll();
        }
        c3209x6.n = null;
        c3209x6.f1112o = null;
    }

    public final void b(long j) {
        C3209x6 c3209x6;
        if (j == -1) {
            return;
        }
        while (true) {
            c3209x6 = this.d;
            if (j < c3209x6.m) {
                break;
            }
            C1562g8 c1562g8 = this.a;
            C2813t2 c2813t2 = (C2813t2) c3209x6.n;
            synchronized (c1562g8) {
                C2813t2[] c2813t2Arr = (C2813t2[]) c1562g8.g;
                int i = c1562g8.f;
                c1562g8.f = i + 1;
                c2813t2Arr[i] = c2813t2;
                c1562g8.e--;
                c1562g8.notifyAll();
            }
            C3209x6 c3209x7 = this.d;
            c3209x7.n = null;
            C3209x6 c3209x8 = (C3209x6) c3209x7.f1112o;
            c3209x7.f1112o = null;
            this.d = c3209x8;
        }
        if (this.e.l < c3209x6.l) {
            this.e = c3209x6;
        }
    }

    public final int c(int i) {
        C2813t2 c2813t2;
        C3209x6 c3209x6 = this.f;
        if (((C2813t2) c3209x6.n) == null) {
            C1562g8 c1562g8 = this.a;
            synchronized (c1562g8) {
                try {
                    int i2 = c1562g8.e + 1;
                    c1562g8.e = i2;
                    int i3 = c1562g8.f;
                    if (i3 > 0) {
                        C2813t2[] c2813t2Arr = (C2813t2[]) c1562g8.g;
                        int i4 = i3 - 1;
                        c1562g8.f = i4;
                        c2813t2 = c2813t2Arr[i4];
                        c2813t2.getClass();
                        ((C2813t2[]) c1562g8.g)[c1562g8.f] = null;
                    } else {
                        C2813t2 c2813t3 = new C2813t2(0, new byte[c1562g8.c]);
                        C2813t2[] c2813t2Arr2 = (C2813t2[]) c1562g8.g;
                        if (i2 > c2813t2Arr2.length) {
                            c1562g8.g = (C2813t2[]) Arrays.copyOf(c2813t2Arr2, c2813t2Arr2.length * 2);
                        }
                        c2813t2 = c2813t3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3209x6 c3209x7 = new C3209x6(this.b, this.f.m);
            c3209x6.n = c2813t2;
            c3209x6.f1112o = c3209x7;
        }
        return Math.min(i, (int) (this.f.m - this.g));
    }
}
