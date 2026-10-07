package o;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2181mc extends AbstractC2569qc {
    public final C2562qX g = new C2562qX();
    public final C2084lc h = new C2084lc();
    public int i = -1;
    public final int j;
    public final C1986kc[] k;
    public C1986kc l;
    public List m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2084lc f913o;
    public int p;

    public C2181mc(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new C1986kc[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new C1986kc();
        }
        this.l = this.k[0];
    }

    @Override // o.AbstractC2569qc
    public final C2665rc f() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new C2665rc(0, list);
    }

    @Override // o.AbstractC2569qc, o.InterfaceC0553Kj
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        l();
        this.f913o = null;
    }

    @Override // o.AbstractC2569qc
    public final void g(C2375oc c2375oc) {
        ByteBuffer byteBuffer = c2375oc.f439o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2562qX c2562qX = this.g;
        c2562qX.D(iLimit, bArrArray);
        while (c2562qX.a() >= 3) {
            int iU = c2562qX.u();
            int i = iU & 3;
            boolean z = (iU & 4) == 4;
            byte bU = (byte) c2562qX.u();
            byte bU2 = (byte) c2562qX.u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bU & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            AP.z();
                        }
                        this.i = i2;
                        int i4 = bU & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C2084lc c2084lc = new C2084lc(i2, i4);
                        this.f913o = c2084lc;
                        c2084lc.e = 1;
                        c2084lc.b[0] = bU2;
                    } else {
                        AbstractC0397Ej.c(i == 2);
                        C2084lc c2084lc2 = this.f913o;
                        if (c2084lc2 == null) {
                            AP.f();
                        } else {
                            int i5 = c2084lc2.e;
                            byte[] bArr = c2084lc2.b;
                            bArr[i5] = bU;
                            c2084lc2.e = i5 + 2;
                            bArr[i5 + 1] = bU2;
                        }
                    }
                    C2084lc c2084lc3 = this.f913o;
                    if (c2084lc3.e == (c2084lc3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // o.AbstractC2569qc
    public final boolean i() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x04ff  */
    public final void j() {
        C2084lc c2084lc = this.f913o;
        if (c2084lc == null) {
            return;
        }
        int i = 2;
        if (c2084lc.e != (c2084lc.d * 2) - 1) {
            int i2 = c2084lc.c;
            AP.c();
        }
        C2084lc c2084lc2 = this.f913o;
        byte[] bArr = c2084lc2.b;
        int i3 = c2084lc2.e;
        C2084lc c2084lc3 = this.h;
        c2084lc3.n(i3, bArr);
        boolean z = false;
        while (c2084lc3.b() > 0) {
            int i4 = 3;
            int i5 = c2084lc3.i(3);
            int i6 = c2084lc3.i(5);
            int i7 = 7;
            if (i5 == 7) {
                c2084lc3.s(i);
                i5 = c2084lc3.i(6);
                if (i5 < 7) {
                    AP.z();
                }
            }
            if (i6 == 0) {
                if (i5 != 0) {
                    AP.z();
                }
                if (z) {
                    this.m = k();
                }
                this.f913o = null;
            }
            if (i5 != this.j) {
                c2084lc3.t(i6);
            } else {
                int iG = (i6 * 8) + c2084lc3.g();
                while (c2084lc3.g() < iG) {
                    int i8 = c2084lc3.i(8);
                    if (i8 == 16) {
                        iG = iG;
                        int i9 = c2084lc3.i(8);
                        if (i9 <= 31) {
                            i7 = 7;
                            if (i9 > 7) {
                                if (i9 <= 15) {
                                    c2084lc3.s(8);
                                } else if (i9 <= 23) {
                                    c2084lc3.s(16);
                                } else if (i9 <= 31) {
                                    c2084lc3.s(24);
                                }
                            }
                        } else {
                            i7 = 7;
                            if (i9 <= 127) {
                                if (i9 == 32) {
                                    this.l.a(' ');
                                } else if (i9 == 33) {
                                    this.l.a((char) 160);
                                } else if (i9 == 37) {
                                    this.l.a((char) 8230);
                                } else if (i9 == 42) {
                                    this.l.a((char) 352);
                                } else if (i9 == 44) {
                                    this.l.a((char) 338);
                                } else if (i9 == 63) {
                                    this.l.a((char) 376);
                                } else if (i9 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i9 == 58) {
                                    this.l.a((char) 353);
                                } else if (i9 == 60) {
                                    this.l.a((char) 339);
                                } else if (i9 != 61) {
                                    switch (i9) {
                                        case C3080vp0.V /* 48 */:
                                            this.l.a((char) 9608);
                                            break;
                                        case 49:
                                            this.l.a((char) 8216);
                                            break;
                                        case C3080vp0.X /* 50 */:
                                            this.l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.l.a((char) 8220);
                                            break;
                                        case C3080vp0.Z /* 52 */:
                                            this.l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i9) {
                                                case 118:
                                                    this.l.a((char) 8539);
                                                    break;
                                                case Yu0.b.g0 /* 119 */:
                                                    this.l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.l.a((char) 8541);
                                                    break;
                                                case Yu0.b.h0 /* 121 */:
                                                    this.l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.l.a((char) 9474);
                                                    break;
                                                case Yu0.b.i0 /* 123 */:
                                                    this.l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.l.a((char) 9492);
                                                    break;
                                                case Yu0.b.j0 /* 125 */:
                                                    this.l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.l.a((char) 9496);
                                                    break;
                                                case Yu0.b.k0 /* 127 */:
                                                    this.l.a((char) 9484);
                                                    break;
                                                default:
                                                    AP.z();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                                z = true;
                            } else {
                                if (i9 <= 159) {
                                    if (i9 <= 135) {
                                        c2084lc3.s(32);
                                    } else if (i9 <= 143) {
                                        c2084lc3.s(40);
                                    } else if (i9 <= 159) {
                                        c2084lc3.s(2);
                                        c2084lc3.s(c2084lc3.i(6) * 8);
                                    }
                                } else if (i9 <= 255) {
                                    if (i9 == 160) {
                                        this.l.a((char) 13252);
                                    } else {
                                        AP.z();
                                        this.l.a('_');
                                    }
                                    z = true;
                                } else {
                                    AP.z();
                                }
                                iG = iG;
                                i = 2;
                                i4 = 3;
                            }
                        }
                    } else if (i8 <= 31) {
                        if (i8 != 0) {
                            if (i8 == i4) {
                                this.m = k();
                            } else if (i8 != 8) {
                                switch (i8) {
                                    case 12:
                                        l();
                                        break;
                                    case 13:
                                        this.l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (i8 >= 17 && i8 <= 23) {
                                            AP.z();
                                            c2084lc3.s(8);
                                        } else if (i8 < 24 || i8 > 31) {
                                            AP.z();
                                        } else {
                                            AP.z();
                                            c2084lc3.s(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.l.b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (i8 <= 127) {
                        if (i8 == 127) {
                            this.l.a((char) 9835);
                        } else {
                            this.l.a((char) (i8 & 255));
                        }
                        z = true;
                    } else {
                        if (i8 <= 159) {
                            C1986kc[] c1986kcArr = this.k;
                            switch (i8) {
                                case 128:
                                case Yu0.b.l0 /* 129 */:
                                case Yu0.b.m0 /* 130 */:
                                case Yu0.b.n0 /* 131 */:
                                case Yu0.b.o0 /* 132 */:
                                case Yu0.b.p0 /* 133 */:
                                case Yu0.b.q0 /* 134 */:
                                case Yu0.b.r0 /* 135 */:
                                    iG = iG;
                                    int i10 = i8 - 128;
                                    if (this.p != i10) {
                                        this.p = i10;
                                        this.l = c1986kcArr[i10];
                                    }
                                    break;
                                case Yu0.b.s0 /* 136 */:
                                    iG = iG;
                                    for (int i11 = 1; i11 <= 8; i11++) {
                                        if (c2084lc3.h()) {
                                            C1986kc c1986kc = c1986kcArr[8 - i11];
                                            c1986kc.a.clear();
                                            c1986kc.b.clear();
                                            c1986kc.p = -1;
                                            c1986kc.q = -1;
                                            c1986kc.r = -1;
                                            c1986kc.t = -1;
                                            c1986kc.v = 0;
                                        }
                                    }
                                    break;
                                case Yu0.b.t0 /* 137 */:
                                    iG = iG;
                                    for (int i12 = 1; i12 <= 8; i12++) {
                                        if (c2084lc3.h()) {
                                            c1986kcArr[8 - i12].d = true;
                                        }
                                    }
                                    break;
                                case Yu0.b.u0 /* 138 */:
                                    iG = iG;
                                    for (int i13 = 1; i13 <= 8; i13++) {
                                        if (c2084lc3.h()) {
                                            c1986kcArr[8 - i13].d = false;
                                        }
                                    }
                                    break;
                                case Yu0.b.v0 /* 139 */:
                                    iG = iG;
                                    for (int i14 = 1; i14 <= 8; i14++) {
                                        if (c2084lc3.h()) {
                                            C1986kc c1986kc2 = c1986kcArr[8 - i14];
                                            c1986kc2.d = !c1986kc2.d;
                                        }
                                    }
                                    break;
                                case Yu0.b.w0 /* 140 */:
                                    iG = iG;
                                    for (int i15 = 1; i15 <= 8; i15++) {
                                        if (c2084lc3.h()) {
                                            c1986kcArr[8 - i15].d();
                                        }
                                    }
                                    break;
                                case Yu0.b.x0 /* 141 */:
                                    iG = iG;
                                    c2084lc3.s(8);
                                    break;
                                case Yu0.b.y0 /* 142 */:
                                    iG = iG;
                                    break;
                                case 143:
                                    iG = iG;
                                    l();
                                    break;
                                case 144:
                                    iG = iG;
                                    if (this.l.c) {
                                        c2084lc3.i(4);
                                        c2084lc3.i(2);
                                        c2084lc3.i(2);
                                        boolean zH = c2084lc3.h();
                                        boolean zH2 = c2084lc3.h();
                                        c2084lc3.i(3);
                                        c2084lc3.i(3);
                                        this.l.e(zH, zH2);
                                    } else {
                                        c2084lc3.s(16);
                                    }
                                    break;
                                case 145:
                                    iG = iG;
                                    if (this.l.c) {
                                        int iC = C1986kc.c(c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2));
                                        int iC2 = C1986kc.c(c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2));
                                        c2084lc3.s(2);
                                        C1986kc.c(c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2), 0);
                                        this.l.f(iC, iC2);
                                    } else {
                                        c2084lc3.s(24);
                                    }
                                    break;
                                case 146:
                                    iG = iG;
                                    if (this.l.c) {
                                        c2084lc3.s(4);
                                        int i16 = c2084lc3.i(4);
                                        c2084lc3.s(2);
                                        c2084lc3.i(6);
                                        C1986kc c1986kc3 = this.l;
                                        if (c1986kc3.v != i16) {
                                            c1986kc3.a('\n');
                                        }
                                        c1986kc3.v = i16;
                                    } else {
                                        c2084lc3.s(16);
                                    }
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    AP.z();
                                    iG = iG;
                                    break;
                                case 151:
                                    iG = iG;
                                    if (this.l.c) {
                                        int iC3 = C1986kc.c(c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2));
                                        c2084lc3.i(2);
                                        C1986kc.c(c2084lc3.i(2), c2084lc3.i(2), c2084lc3.i(2), 0);
                                        c2084lc3.h();
                                        c2084lc3.h();
                                        c2084lc3.i(2);
                                        c2084lc3.i(2);
                                        int i17 = c2084lc3.i(2);
                                        c2084lc3.s(8);
                                        C1986kc c1986kc4 = this.l;
                                        c1986kc4.f868o = iC3;
                                        c1986kc4.l = i17;
                                    } else {
                                        c2084lc3.s(32);
                                    }
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i18 = i8 - 152;
                                    C1986kc c1986kc5 = c1986kcArr[i18];
                                    c2084lc3.s(i);
                                    boolean zH3 = c2084lc3.h();
                                    boolean zH4 = c2084lc3.h();
                                    c2084lc3.h();
                                    int i19 = c2084lc3.i(i4);
                                    boolean zH5 = c2084lc3.h();
                                    int i20 = c2084lc3.i(i7);
                                    int i21 = c2084lc3.i(8);
                                    int i22 = c2084lc3.i(4);
                                    int i23 = c2084lc3.i(4);
                                    c2084lc3.s(i);
                                    c2084lc3.i(6);
                                    c2084lc3.s(i);
                                    int i24 = c2084lc3.i(3);
                                    iG = iG;
                                    int i25 = c2084lc3.i(3);
                                    c1986kc5.c = true;
                                    c1986kc5.d = zH3;
                                    c1986kc5.k = zH4;
                                    c1986kc5.e = i19;
                                    c1986kc5.f = zH5;
                                    c1986kc5.g = i20;
                                    c1986kc5.h = i21;
                                    c1986kc5.i = i22;
                                    int i26 = i23 + 1;
                                    if (c1986kc5.j != i26) {
                                        c1986kc5.j = i26;
                                        while (true) {
                                            ArrayList arrayList = c1986kc5.a;
                                            if ((zH4 && arrayList.size() >= c1986kc5.j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i24 != 0 && c1986kc5.m != i24) {
                                        c1986kc5.m = i24;
                                        int i27 = i24 - 1;
                                        int i28 = C1986kc.C[i27];
                                        boolean z2 = C1986kc.B[i27];
                                        int i29 = C1986kc.z[i27];
                                        int i30 = C1986kc.A[i27];
                                        int i31 = C1986kc.y[i27];
                                        c1986kc5.f868o = i28;
                                        c1986kc5.l = i31;
                                    }
                                    if (i25 != 0 && c1986kc5.n != i25) {
                                        c1986kc5.n = i25;
                                        int i32 = i25 - 1;
                                        int i33 = C1986kc.E[i32];
                                        int i34 = C1986kc.D[i32];
                                        c1986kc5.e(false, false);
                                        c1986kc5.f(C1986kc.w, C1986kc.F[i32]);
                                    }
                                    if (this.p != i18) {
                                        this.p = i18;
                                        this.l = c1986kcArr[i18];
                                    }
                                    break;
                            }
                        } else {
                            iG = iG;
                            if (i8 <= 255) {
                                this.l.a((char) (i8 & 255));
                            } else {
                                AP.z();
                            }
                            i7 = 7;
                        }
                        z = true;
                        i7 = 7;
                    }
                    iG = iG;
                    i = 2;
                    i4 = 3;
                }
            }
        }
        if (z) {
            this.m = k();
        }
        this.f913o = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    public final List k() {
        C1888jc c1888jc;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C1986kc[] c1986kcArr = this.k;
            C1986kc c1986kc = c1986kcArr[i];
            if (c1986kc.c && (!c1986kc.a.isEmpty() || c1986kc.b.length() != 0)) {
                C1986kc c1986kc2 = c1986kcArr[i];
                if (c1986kc2.d) {
                    if (c1986kc2.c) {
                        ArrayList arrayList2 = c1986kc2.a;
                        if (arrayList2.isEmpty() && c1986kc2.b.length() == 0) {
                            c1888jc = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) c1986kc2.b());
                            int i3 = c1986kc2.l;
                            if (i3 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + c1986kc2.l);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (c1986kc2.f) {
                                f = c1986kc2.h / 99.0f;
                                f2 = c1986kc2.g / 99.0f;
                            } else {
                                f = c1986kc2.h / 209.0f;
                                f2 = c1986kc2.g / 74.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i4 = c1986kc2.i;
                            int i5 = i4 / 3;
                            int i6 = i5 == 0 ? 0 : i5 == 1 ? 1 : 2;
                            int i7 = i4 % 3;
                            int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = c1986kc2.f868o;
                            c1888jc = new C1888jc(spannableStringBuilder, alignment2, f4, i6, f3, i8, i9 != C1986kc.x, i9, c1986kc2.e);
                        }
                    } else {
                        c1888jc = null;
                    }
                    if (c1888jc != null) {
                        arrayList.add(c1888jc);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C1888jc.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList3.add(((C1888jc) arrayList.get(i10)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
