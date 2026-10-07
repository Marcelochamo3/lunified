package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1792ic extends AbstractC2569qc {
    public final int h;
    public final int i;
    public final int j;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f830o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, Yu0.b.z0, C3080vp0.y0, 97, 98, 99, 100, 101, 102, 103, 104, 105, C3080vp0.t0, 107, C3080vp0.v0, 109, 110, Yu0.b.c0, 112, Yu0.b.d0, 114, Yu0.b.e0, 116, Yu0.b.f0, 118, Yu0.b.g0, 120, Yu0.b.h0, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, C3080vp0.z0};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, C3080vp0.x0, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, Yu0.b.A0, Yu0.b.i0, Yu0.b.j0, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C2562qX g = new C2562qX();
    public final ArrayList l = new ArrayList();
    public C1694hc m = new C1694hc(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public C1792ic(String str, int i) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            AP.z();
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        l(0);
        k();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // o.AbstractC2569qc
    public final C2665rc f() {
        List list = this.n;
        this.f830o = list;
        list.getClass();
        return new C2665rc(0, list);
    }

    @Override // o.AbstractC2569qc, o.InterfaceC0553Kj
    public final void flush() {
        super.flush();
        this.n = null;
        this.f830o = null;
        l(0);
        this.q = 4;
        this.m.h = 4;
        k();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:157:0x0244  */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:159:0x024e  */
    /* JADX WARN: Code duplicated, block: B:161:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // o.AbstractC2569qc
    public final void g(C2375oc c2375oc) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c2375oc.f439o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2562qX c2562qX = this.g;
        c2562qX.D(iLimit, bArrArray);
        boolean z3 = false;
        while (true) {
            int iA = c2562qX.a();
            int i6 = this.h;
            if (iA < i6) {
                if (z3) {
                    int i7 = this.p;
                    if (i7 == 1 || i7 == 3) {
                        this.n = j();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iU = i6 == 2 ? -4 : c2562qX.u();
            int iU2 = c2562qX.u();
            int iU3 = c2562qX.u();
            if ((iU & 2) == 0 && (iU & 1) == this.i) {
                byte b = (byte) (iU2 & Yu0.b.k0);
                byte b2 = (byte) (iU3 & Yu0.b.k0);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((iU & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iU2] && zArr[iU3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.r = z2;
                    if (!z2 || (b & 240) != 16) {
                        this.s = false;
                        if (!z2) {
                            if (1 > b && b <= 15) {
                                this.w = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.w = false;
                                                    break;
                                            }
                                        case 37:
                                        case C3080vp0.L /* 38 */:
                                        case 39:
                                            this.w = true;
                                            break;
                                    }
                                } else {
                                    this.w = true;
                                }
                            }
                            if (this.w) {
                                i = b & 224;
                                if (i == 0) {
                                    this.v = (b >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.m.b();
                                                this.m.a((char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.m.a(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                C1694hc c1694hc = this.m;
                                                c1694hc.a.add(new C1596gc((b2 >> 1) & 7, c1694hc.c.length(), z5));
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i8 = y[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i8++;
                                                }
                                                C1694hc c1694hc2 = this.m;
                                                if (i8 != c1694hc2.d) {
                                                    if (this.p != 1 && !c1694hc2.e()) {
                                                        C1694hc c1694hc3 = new C1694hc(this.p, this.q);
                                                        this.m = c1694hc3;
                                                        this.l.add(c1694hc3);
                                                    }
                                                    this.m.d = i8;
                                                }
                                                boolean z6 = (b2 & 16) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i9 = (b2 >> 1) & 7;
                                                C1694hc c1694hc4 = this.m;
                                                c1694hc4.a.add(new C1596gc(z6 ? 8 : i9, c1694hc4.c.length(), z7));
                                                if (z6) {
                                                    this.m.e = z[i9];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.m.f = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            l(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case C3080vp0.L /* 38 */:
                                                            l(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1 || i5 == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1 && !this.m.e()) {
                                                                                C1694hc c1694hc5 = this.m;
                                                                                arrayList = c1694hc5.b;
                                                                                arrayList.add(c1694hc5.d());
                                                                                c1694hc5.c.setLength(0);
                                                                                c1694hc5.a.clear();
                                                                                iMin = Math.min(c1694hc5.h, c1694hc5.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.n = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.m.a((char) C[b2 & 15]);
                                        }
                                    } else {
                                        C1694hc c1694hc6 = this.m;
                                        iArr = B;
                                        c1694hc6.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.m.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    } else if (this.s && this.t == b && this.u == b2) {
                        this.s = false;
                    } else {
                        this.s = true;
                        this.t = b;
                        this.u = b2;
                        if (!z2) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.w = true;
                                    } else {
                                        this.w = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.w = true;
                                } else {
                                    this.w = true;
                                }
                            }
                            if (this.w) {
                                i = b & 224;
                                if (i == 0) {
                                    this.v = (b >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.q = 2;
                                                                            this.m.h = 2;
                                                                            break;
                                                                        case C3080vp0.L /* 38 */:
                                                                            l(1);
                                                                            this.q = 3;
                                                                            this.m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.q = 4;
                                                                            this.m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.p;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.n = Collections.emptyList();
                                                                                            i5 = this.p;
                                                                                            if (i5 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                C1694hc c1694hc7 = this.m;
                                                                                                arrayList = c1694hc7.b;
                                                                                                arrayList.add(c1694hc7.d());
                                                                                                c1694hc7.c.setLength(0);
                                                                                                c1694hc7.a.clear();
                                                                                                iMin = Math.min(c1694hc7.h, c1694hc7.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.n = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc8 = this.m;
                                                                                            arrayList = c1694hc8.b;
                                                                                            arrayList.add(c1694hc8.d());
                                                                                            c1694hc8.c.setLength(0);
                                                                                            c1694hc8.a.clear();
                                                                                            iMin = Math.min(c1694hc8.h, c1694hc8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc9 = this.m;
                                                                                            arrayList = c1694hc9.b;
                                                                                            arrayList.add(c1694hc9.d());
                                                                                            c1694hc9.c.setLength(0);
                                                                                            c1694hc9.a.clear();
                                                                                            iMin = Math.min(c1694hc9.h, c1694hc9.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc10 = this.m;
                                                                                        arrayList = c1694hc10.b;
                                                                                        arrayList.add(c1694hc10.d());
                                                                                        c1694hc10.c.setLength(0);
                                                                                        c1694hc10.a.clear();
                                                                                        iMin = Math.min(c1694hc10.h, c1694hc10.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc11 = this.m;
                                                                                            arrayList = c1694hc11.b;
                                                                                            arrayList.add(c1694hc11.d());
                                                                                            c1694hc11.c.setLength(0);
                                                                                            c1694hc11.a.clear();
                                                                                            iMin = Math.min(c1694hc11.h, c1694hc11.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc12 = this.m;
                                                                                        arrayList = c1694hc12.b;
                                                                                        arrayList.add(c1694hc12.d());
                                                                                        c1694hc12.c.setLength(0);
                                                                                        c1694hc12.a.clear();
                                                                                        iMin = Math.min(c1694hc12.h, c1694hc12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc13 = this.m;
                                                                                        arrayList = c1694hc13.b;
                                                                                        arrayList.add(c1694hc13.d());
                                                                                        c1694hc13.c.setLength(0);
                                                                                        c1694hc13.a.clear();
                                                                                        iMin = Math.min(c1694hc13.h, c1694hc13.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc14 = this.m;
                                                                                    arrayList = c1694hc14.b;
                                                                                    arrayList.add(c1694hc14.d());
                                                                                    c1694hc14.c.setLength(0);
                                                                                    c1694hc14.a.clear();
                                                                                    iMin = Math.min(c1694hc14.h, c1694hc14.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc15 = this.m;
                                                                                            arrayList = c1694hc15.b;
                                                                                            arrayList.add(c1694hc15.d());
                                                                                            c1694hc15.c.setLength(0);
                                                                                            c1694hc15.a.clear();
                                                                                            iMin = Math.min(c1694hc15.h, c1694hc15.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc16 = this.m;
                                                                                        arrayList = c1694hc16.b;
                                                                                        arrayList.add(c1694hc16.d());
                                                                                        c1694hc16.c.setLength(0);
                                                                                        c1694hc16.a.clear();
                                                                                        iMin = Math.min(c1694hc16.h, c1694hc16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc17 = this.m;
                                                                                        arrayList = c1694hc17.b;
                                                                                        arrayList.add(c1694hc17.d());
                                                                                        c1694hc17.c.setLength(0);
                                                                                        c1694hc17.a.clear();
                                                                                        iMin = Math.min(c1694hc17.h, c1694hc17.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc18 = this.m;
                                                                                    arrayList = c1694hc18.b;
                                                                                    arrayList.add(c1694hc18.d());
                                                                                    c1694hc18.c.setLength(0);
                                                                                    c1694hc18.a.clear();
                                                                                    iMin = Math.min(c1694hc18.h, c1694hc18.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc19 = this.m;
                                                                                        arrayList = c1694hc19.b;
                                                                                        arrayList.add(c1694hc19.d());
                                                                                        c1694hc19.c.setLength(0);
                                                                                        c1694hc19.a.clear();
                                                                                        iMin = Math.min(c1694hc19.h, c1694hc19.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc110 = this.m;
                                                                                    arrayList = c1694hc110.b;
                                                                                    arrayList.add(c1694hc110.d());
                                                                                    c1694hc110.c.setLength(0);
                                                                                    c1694hc110.a.clear();
                                                                                    iMin = Math.min(c1694hc110.h, c1694hc110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc111 = this.m;
                                                                                    arrayList = c1694hc111.b;
                                                                                    arrayList.add(c1694hc111.d());
                                                                                    c1694hc111.c.setLength(0);
                                                                                    c1694hc111.a.clear();
                                                                                    iMin = Math.min(c1694hc111.h, c1694hc111.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            l(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case C3080vp0.L /* 38 */:
                                                            l(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                C1694hc c1694hc112 = this.m;
                                                                                arrayList = c1694hc112.b;
                                                                                arrayList.add(c1694hc112.d());
                                                                                c1694hc112.c.setLength(0);
                                                                                c1694hc112.a.clear();
                                                                                iMin = Math.min(c1694hc112.h, c1694hc112.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.n = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.q = 2;
                                                                            this.m.h = 2;
                                                                            break;
                                                                        case C3080vp0.L /* 38 */:
                                                                            l(1);
                                                                            this.q = 3;
                                                                            this.m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.q = 4;
                                                                            this.m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.p;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.n = Collections.emptyList();
                                                                                            i5 = this.p;
                                                                                            if (i5 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                C1694hc c1694hc113 = this.m;
                                                                                                arrayList = c1694hc113.b;
                                                                                                arrayList.add(c1694hc113.d());
                                                                                                c1694hc113.c.setLength(0);
                                                                                                c1694hc113.a.clear();
                                                                                                iMin = Math.min(c1694hc113.h, c1694hc113.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.n = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc114 = this.m;
                                                                                            arrayList = c1694hc114.b;
                                                                                            arrayList.add(c1694hc114.d());
                                                                                            c1694hc114.c.setLength(0);
                                                                                            c1694hc114.a.clear();
                                                                                            iMin = Math.min(c1694hc114.h, c1694hc114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc115 = this.m;
                                                                                            arrayList = c1694hc115.b;
                                                                                            arrayList.add(c1694hc115.d());
                                                                                            c1694hc115.c.setLength(0);
                                                                                            c1694hc115.a.clear();
                                                                                            iMin = Math.min(c1694hc115.h, c1694hc115.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc116 = this.m;
                                                                                        arrayList = c1694hc116.b;
                                                                                        arrayList.add(c1694hc116.d());
                                                                                        c1694hc116.c.setLength(0);
                                                                                        c1694hc116.a.clear();
                                                                                        iMin = Math.min(c1694hc116.h, c1694hc116.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc117 = this.m;
                                                                                            arrayList = c1694hc117.b;
                                                                                            arrayList.add(c1694hc117.d());
                                                                                            c1694hc117.c.setLength(0);
                                                                                            c1694hc117.a.clear();
                                                                                            iMin = Math.min(c1694hc117.h, c1694hc117.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc118 = this.m;
                                                                                        arrayList = c1694hc118.b;
                                                                                        arrayList.add(c1694hc118.d());
                                                                                        c1694hc118.c.setLength(0);
                                                                                        c1694hc118.a.clear();
                                                                                        iMin = Math.min(c1694hc118.h, c1694hc118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc119 = this.m;
                                                                                        arrayList = c1694hc119.b;
                                                                                        arrayList.add(c1694hc119.d());
                                                                                        c1694hc119.c.setLength(0);
                                                                                        c1694hc119.a.clear();
                                                                                        iMin = Math.min(c1694hc119.h, c1694hc119.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc1110 = this.m;
                                                                                    arrayList = c1694hc1110.b;
                                                                                    arrayList.add(c1694hc1110.d());
                                                                                    c1694hc1110.c.setLength(0);
                                                                                    c1694hc1110.a.clear();
                                                                                    iMin = Math.min(c1694hc1110.h, c1694hc1110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case C3080vp0.L /* 38 */:
                                                                        l(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C1694hc c1694hc1111 = this.m;
                                                                                            arrayList = c1694hc1111.b;
                                                                                            arrayList.add(c1694hc1111.d());
                                                                                            c1694hc1111.c.setLength(0);
                                                                                            c1694hc1111.a.clear();
                                                                                            iMin = Math.min(c1694hc1111.h, c1694hc1111.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc1112 = this.m;
                                                                                        arrayList = c1694hc1112.b;
                                                                                        arrayList.add(c1694hc1112.d());
                                                                                        c1694hc1112.c.setLength(0);
                                                                                        c1694hc1112.a.clear();
                                                                                        iMin = Math.min(c1694hc1112.h, c1694hc1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc1113 = this.m;
                                                                                        arrayList = c1694hc1113.b;
                                                                                        arrayList.add(c1694hc1113.d());
                                                                                        c1694hc1113.c.setLength(0);
                                                                                        c1694hc1113.a.clear();
                                                                                        iMin = Math.min(c1694hc1113.h, c1694hc1113.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc1114 = this.m;
                                                                                    arrayList = c1694hc1114.b;
                                                                                    arrayList.add(c1694hc1114.d());
                                                                                    c1694hc1114.c.setLength(0);
                                                                                    c1694hc1114.a.clear();
                                                                                    iMin = Math.min(c1694hc1114.h, c1694hc1114.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    l(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case C3080vp0.L /* 38 */:
                                                                    l(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C1694hc c1694hc1115 = this.m;
                                                                                        arrayList = c1694hc1115.b;
                                                                                        arrayList.add(c1694hc1115.d());
                                                                                        c1694hc1115.c.setLength(0);
                                                                                        c1694hc1115.a.clear();
                                                                                        iMin = Math.min(c1694hc1115.h, c1694hc1115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc1116 = this.m;
                                                                                    arrayList = c1694hc1116.b;
                                                                                    arrayList.add(c1694hc1116.d());
                                                                                    c1694hc1116.c.setLength(0);
                                                                                    c1694hc1116.a.clear();
                                                                                    iMin = Math.min(c1694hc1116.h, c1694hc1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case C3080vp0.L /* 38 */:
                                                                l(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C1694hc c1694hc1117 = this.m;
                                                                                    arrayList = c1694hc1117.b;
                                                                                    arrayList.add(c1694hc1117.d());
                                                                                    c1694hc1117.c.setLength(0);
                                                                                    c1694hc1117.a.clear();
                                                                                    iMin = Math.min(c1694hc1117.h, c1694hc1117.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.n = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            l(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case C3080vp0.L /* 38 */:
                                                            l(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                C1694hc c1694hc1118 = this.m;
                                                                                arrayList = c1694hc1118.b;
                                                                                arrayList.add(c1694hc1118.d());
                                                                                c1694hc1118.c.setLength(0);
                                                                                c1694hc1118.a.clear();
                                                                                iMin = Math.min(c1694hc1118.h, c1694hc1118.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.n = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C1694hc c1694hc20 = this.m;
                                        iArr = B;
                                        c1694hc20.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.m.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // o.AbstractC2569qc, o.InterfaceC0553Kj
    /* JADX INFO: renamed from: h */
    public final C2472pc d() {
        C2472pc c2472pc;
        C2472pc c2472pcD = super.d();
        if (c2472pcD != null) {
            return c2472pcD;
        }
        long j = this.k;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.x;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (c2472pc = (C2472pc) this.b.pollFirst()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = -9223372036854775807L;
        c2472pc.F(this.e, f(), Long.MAX_VALUE);
        return c2472pc;
    }

    @Override // o.AbstractC2569qc
    public final boolean i() {
        return this.n != this.f830o;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C3162wi c3162wiC = ((C1694hc) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(c3162wiC);
            if (c3162wiC != null) {
                iMin = Math.min(iMin, c3162wiC.t);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3162wi c3162wiC2 = (C3162wi) arrayList2.get(i2);
            if (c3162wiC2 != null) {
                if (c3162wiC2.t != iMin) {
                    c3162wiC2 = ((C1694hc) arrayList.get(i2)).c(iMin);
                    c3162wiC2.getClass();
                }
                arrayList3.add(c3162wiC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C1694hc c1694hc = this.m;
        c1694hc.g = this.p;
        c1694hc.a.clear();
        c1694hc.b.clear();
        c1694hc.c.setLength(0);
        c1694hc.d = 15;
        c1694hc.e = 0;
        c1694hc.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    public final void l(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i != 3) {
            k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C1694hc) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // o.AbstractC2569qc, o.InterfaceC0553Kj
    public final void a() {
    }
}
