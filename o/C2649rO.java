package o;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: o.rO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2649rO implements InterfaceC0302As {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public C2295nk0 C;
    public C2295nk0 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final C0450Gk a;
    public boolean a0;
    public final C1727hs0 b;
    public InterfaceC0354Cs b0;
    public final SparseArray c;
    public final boolean d;
    public final C2562qX e;
    public final C2562qX f;
    public final C2562qX g;
    public final C2562qX h;
    public final C2562qX i;
    public final C2562qX j;
    public final C2562qX k;
    public final C2562qX l;
    public final C2562qX m;
    public final C2562qX n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f1002o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public C2553qO u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = Lr0.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC1402ed.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC1674hK.t(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC1674hK.t(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(map);
    }

    public C2649rO(int i) {
        C0450Gk c0450Gk = new C0450Gk();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = c0450Gk;
        c0450Gk.d = new C0334By(13, this);
        this.d = (i & 1) == 0;
        this.b = new C1727hs0();
        this.c = new SparseArray();
        this.g = new C2562qX(4);
        this.h = new C2562qX(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new C2562qX(4);
        this.e = new C2562qX(Ou0.b);
        this.f = new C2562qX(4);
        this.j = new C2562qX();
        this.k = new C2562qX();
        this.l = new C2562qX(8);
        this.m = new C2562qX();
        this.n = new C2562qX();
        this.L = new int[1];
    }

    public static byte[] i(long j, long j2, String str) {
        AbstractC0397Ej.c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = Lr0.a;
        return str2.getBytes(AbstractC1402ed.c);
    }

    public final void b(int i) {
        if (this.C == null || this.D == null) {
            throw C2949uX.a("Element " + i + " must be in a Cues", null);
        }
    }

    public final void c(int i) {
        if (this.u != null) {
            return;
        }
        throw C2949uX.a("Element " + i + " must be in a TrackEntry", null);
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        C0450Gk c0450Gk = this.a;
        c0450Gk.e = 0;
        c0450Gk.b.clear();
        C1727hs0 c1727hs0 = c0450Gk.c;
        c1727hs0.a = 0;
        c1727hs0.b = 0;
        C1727hs0 c1727hs1 = this.b;
        c1727hs1.a = 0;
        c1727hs1.b = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            Rm0 rm0 = ((C2553qO) sparseArray.valueAt(i)).T;
            if (rm0 != null) {
                rm0.b = false;
                rm0.c = 0;
            }
            i++;
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C2295nk0 c2295nk0 = new C2295nk0(10);
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        long j = c0554Kk.n;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        C2562qX c2562qX = (C2562qX) c2295nk0.n;
        c0554Kk.x(c2562qX.a, 0, 4, false);
        c2295nk0.m = 4;
        for (long jV = c2562qX.v(); jV != 440786851; jV = ((jV << 8) & (-256)) | ((long) (c2562qX.a[0] & 255))) {
            int i2 = c2295nk0.m + 1;
            c2295nk0.m = i2;
            if (i2 == i) {
                return false;
            }
            c0554Kk.x(c2562qX.a, 0, 1, false);
        }
        long jT = c2295nk0.t(c0554Kk);
        long j3 = c2295nk0.m;
        if (jT == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jT >= j) {
            return false;
        }
        while (true) {
            long j4 = c2295nk0.m;
            long j5 = j3 + jT;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (c2295nk0.t(c0554Kk) == Long.MIN_VALUE) {
                return false;
            }
            long jT2 = c2295nk0.t(c0554Kk);
            if (jT2 < 0 || jT2 > C1707hi0.a) {
                return false;
            }
            if (jT2 != 0) {
                int i3 = (int) jT2;
                c0554Kk.b(i3, false);
                c2295nk0.m += i3;
            }
        }
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.b0 = interfaceC0354Cs;
    }

    public final void g(C2553qO c2553qO, long j, int i, int i2, int i3) {
        byte[] bArrI;
        int i4;
        int i5;
        Rm0 rm0 = c2553qO.T;
        if (rm0 != null) {
            rm0.b(c2553qO.X, j, i, i2, i3, c2553qO.j);
        } else {
            if ("S_TEXT/UTF8".equals(c2553qO.b) || "S_TEXT/ASS".equals(c2553qO.b) || "S_TEXT/WEBVTT".equals(c2553qO.b)) {
                if (this.K > 1) {
                    AP.z();
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        AP.z();
                    } else {
                        String str = c2553qO.b;
                        C2562qX c2562qX = this.k;
                        byte[] bArr = c2562qX.a;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        byte b = -1;
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 2;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 0;
                        }
                        if (b == 0) {
                            bArrI = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                            i4 = 21;
                        } else if (b == 1) {
                            bArrI = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                            i4 = 25;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrI = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                            i4 = 19;
                        }
                        System.arraycopy(bArrI, 0, bArr, i4, bArrI.length);
                        for (int i6 = c2562qX.b; i6 < c2562qX.c; i6++) {
                            if (c2562qX.a[i6] == 0) {
                                c2562qX.E(i6);
                                break;
                            }
                        }
                        c2553qO.X.e(c2562qX.c, c2562qX);
                        i5 = i2 + c2562qX.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.K;
                C2562qX c2562qX2 = this.n;
                if (i7 > 1) {
                    c2562qX2.C(0);
                } else {
                    int i8 = c2562qX2.c;
                    c2553qO.X.c(i8, c2562qX2);
                    i5 += i8;
                }
            }
            c2553qO.X.d(j, i, i5, i3, c2553qO.j);
        }
        this.F = true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 50541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // o.InterfaceC0302As
    public final int h(o.InterfaceC0328Bs r41, o.C2800sv r42) {
        /*
            Method dump skipped, instruction units count: 5054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2649rO.h(o.Bs, o.sv):int");
    }

    public final void j(C0554Kk c0554Kk, int i) {
        C2562qX c2562qX = this.g;
        if (c2562qX.c >= i) {
            return;
        }
        byte[] bArr = c2562qX.a;
        if (bArr.length < i) {
            c2562qX.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c2562qX.a;
        int i2 = c2562qX.c;
        c0554Kk.a(bArr2, i2, i - i2, false);
        c2562qX.E(i);
    }

    public final void k() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.C(0);
    }

    public final long l(long j) throws C2949uX {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return Lr0.R(j, j2, 1000L);
        }
        throw C2949uX.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(C0554Kk c0554Kk, C2553qO c2553qO, int i, boolean z) {
        int iB;
        int iB2;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c2553qO.b)) {
            n(c0554Kk, c0, i);
            int i3 = this.T;
            k();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c2553qO.b)) {
            n(c0554Kk, e0, i);
            int i4 = this.T;
            k();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c2553qO.b)) {
            n(c0554Kk, f0, i);
            int i5 = this.T;
            k();
            return i5;
        }
        InterfaceC1324dm0 interfaceC1324dm0 = c2553qO.X;
        boolean z3 = this.V;
        C2562qX c2562qX = this.j;
        if (!z3) {
            boolean z4 = c2553qO.h;
            C2562qX c2562qX2 = this.g;
            if (z4) {
                this.O &= -1073741825;
                if (!this.W) {
                    c0554Kk.a(c2562qX2.a, 0, 1, false);
                    this.S++;
                    byte b = c2562qX2.a[0];
                    if ((b & 128) == 128) {
                        throw C2949uX.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b;
                    this.W = true;
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    boolean z5 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        C2562qX c2562qX3 = this.l;
                        c0554Kk.a(c2562qX3.a, 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        c2562qX2.a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        c2562qX2.F(0);
                        interfaceC1324dm0.c(1, c2562qX2);
                        this.T++;
                        c2562qX3.F(0);
                        interfaceC1324dm0.c(8, c2562qX3);
                        this.T += 8;
                    }
                    if (z5) {
                        if (!this.X) {
                            c0554Kk.a(c2562qX2.a, 0, 1, false);
                            this.S++;
                            c2562qX2.F(0);
                            this.Y = c2562qX2.u();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        c2562qX2.C(i6);
                        c0554Kk.a(c2562qX2.a, 0, i6, false);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f1002o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f1002o = ByteBuffer.allocate(i7);
                        }
                        this.f1002o.position(0);
                        this.f1002o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int iX = c2562qX2.x();
                            if (i8 % 2 == 0) {
                                this.f1002o.putShort((short) (iX - i9));
                            } else {
                                this.f1002o.putInt(iX - i9);
                            }
                            i8++;
                            i9 = iX;
                        }
                        int i10 = (i - this.S) - i9;
                        if (i2 % 2 == 1) {
                            this.f1002o.putInt(i10);
                        } else {
                            this.f1002o.putShort((short) i10);
                            this.f1002o.putInt(0);
                        }
                        byte[] bArrArray = this.f1002o.array();
                        C2562qX c2562qX4 = this.m;
                        c2562qX4.D(i7, bArrArray);
                        interfaceC1324dm0.c(i7, c2562qX4);
                        this.T += i7;
                    }
                }
            } else {
                byte[] bArr = c2553qO.i;
                if (bArr != null) {
                    c2562qX.D(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c2553qO.b)) {
                z2 = z;
            } else {
                z2 = c2553qO.f > 0;
            }
            if (z2) {
                this.O |= 268435456;
                this.n.C(0);
                int i11 = (c2562qX.c + i) - this.S;
                c2562qX2.C(4);
                byte[] bArr2 = c2562qX2.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                interfaceC1324dm0.c(4, c2562qX2);
                this.T += 4;
            }
            this.V = true;
        }
        int i12 = i + c2562qX.c;
        if (!"V_MPEG4/ISO/AVC".equals(c2553qO.b) && !"V_MPEGH/ISO/HEVC".equals(c2553qO.b)) {
            if (c2553qO.T != null) {
                AbstractC0397Ej.f(c2562qX.c == 0);
                c2553qO.T.c(c0554Kk);
            }
            while (true) {
                int i13 = this.S;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = c2562qX.a();
                if (iA > 0) {
                    iB2 = Math.min(i14, iA);
                    interfaceC1324dm0.e(iB2, c2562qX);
                } else {
                    iB2 = interfaceC1324dm0.b(c0554Kk, i14, false);
                }
                this.S += iB2;
                this.T += iB2;
            }
        } else {
            C2562qX c2562qX5 = this.f;
            byte[] bArr3 = c2562qX5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = c2553qO.Y;
            int i16 = 4 - i15;
            while (this.S < i12) {
                int i17 = this.U;
                if (i17 == 0) {
                    int iMin = Math.min(i15, c2562qX.a());
                    c0554Kk.a(bArr3, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        c2562qX.e(bArr3, i16, iMin);
                    }
                    this.S += i15;
                    c2562qX5.F(0);
                    this.U = c2562qX5.x();
                    C2562qX c2562qX6 = this.e;
                    c2562qX6.F(0);
                    interfaceC1324dm0.e(4, c2562qX6);
                    this.T += 4;
                } else {
                    int iA2 = c2562qX.a();
                    if (iA2 > 0) {
                        iB = Math.min(i17, iA2);
                        interfaceC1324dm0.e(iB, c2562qX);
                    } else {
                        iB = interfaceC1324dm0.b(c0554Kk, i17, false);
                    }
                    this.S += iB;
                    this.T += iB;
                    this.U -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(c2553qO.b)) {
            C2562qX c2562qX7 = this.h;
            c2562qX7.F(0);
            interfaceC1324dm0.e(4, c2562qX7);
            this.T += 4;
        }
        int i18 = this.T;
        k();
        return i18;
    }

    public final void n(C0554Kk c0554Kk, byte[] bArr, int i) {
        int length = bArr.length + i;
        C2562qX c2562qX = this.k;
        byte[] bArr2 = c2562qX.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c2562qX.D(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c0554Kk.a(c2562qX.a, bArr.length, i, false);
        c2562qX.F(0);
        c2562qX.E(length);
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
