package o;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class RA implements InterfaceC3273xp {
    public final Ib0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public InterfaceC1324dm0 j;
    public QA k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final C2161mK d = new C2161mK(7);
    public final C2161mK e = new C2161mK(8);
    public final C2161mK f = new C2161mK(6);
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2562qX f483o = new C2562qX();

    public RA(Ib0 ib0, boolean z, boolean z2) {
        this.a = ib0;
        this.b = z;
        this.c = z2;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        Ou0.d(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        QA qa = this.k;
        if (qa != null) {
            qa.k = false;
            qa.f469o = false;
            PA pa = qa.n;
            pa.b = false;
            pa.a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0239  */
    /* JADX WARN: Code duplicated, block: B:82:0x023b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0252  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        AbstractC0397Ej.g(this.j);
        int i11 = Lr0.a;
        int i12 = c2562qX.b;
        int i13 = c2562qX.c;
        byte[] bArr2 = c2562qX.a;
        this.g += (long) c2562qX.a();
        this.j.e(c2562qX.a(), c2562qX);
        while (true) {
            int i14 = Ou0.i(bArr2, i12, i13, this.h);
            if (i14 == i13) {
                f(bArr2, i12, i13);
                return;
            }
            int i15 = i14 + 3;
            int i16 = bArr2[i15] & 31;
            int i17 = i14 - i12;
            if (i17 > 0) {
                f(bArr2, i12, i14);
            }
            int i18 = i13 - i14;
            long j4 = this.g - ((long) i18);
            int i19 = i17 < 0 ? -i17 : 0;
            long j5 = this.m;
            boolean z2 = this.l;
            C2161mK c2161mK = this.e;
            C2161mK c2161mK2 = this.d;
            if (!z2 || this.k.c) {
                c2161mK2.e(i19);
                c2161mK.e(i19);
                if (this.l) {
                    i = i18;
                    i2 = i13;
                    bArr = bArr2;
                    i3 = i15;
                    i4 = i16;
                    j = j4;
                    if (c2161mK2.d) {
                        C2751sT c2751sTV = Ou0.v((byte[]) c2161mK2.f, 3, c2161mK2.e);
                        this.k.d.append(c2751sTV.d, c2751sTV);
                        c2161mK2.f();
                    } else if (c2161mK.d) {
                        C2084lc c2084lc = new C2084lc((byte[]) c2161mK.f, 4, c2161mK.e);
                        int iL = c2084lc.l();
                        int iL2 = c2084lc.l();
                        c2084lc.r();
                        this.k.e.append(iL, new C2654rT(iL, iL2, c2084lc.h()));
                        c2161mK.f();
                    }
                } else if (c2161mK2.d && c2161mK.d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) c2161mK2.f, c2161mK2.e));
                    arrayList.add(Arrays.copyOf((byte[]) c2161mK.f, c2161mK.e));
                    i2 = i13;
                    C2751sT c2751sTV2 = Ou0.v((byte[]) c2161mK2.f, 3, c2161mK2.e);
                    bArr = bArr2;
                    i3 = i15;
                    C2084lc c2084lc2 = new C2084lc((byte[]) c2161mK.f, 4, c2161mK.e);
                    int iL3 = c2084lc2.l();
                    int iL4 = c2084lc2.l();
                    c2084lc2.r();
                    C2654rT c2654rT = new C2654rT(iL3, iL4, c2084lc2.h());
                    i4 = i16;
                    i = i18;
                    j = j4;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c2751sTV2.a), Integer.valueOf(c2751sTV2.b), Integer.valueOf(c2751sTV2.c));
                    InterfaceC1324dm0 interfaceC1324dm0 = this.j;
                    C0617Mw c0617Mw = new C0617Mw();
                    c0617Mw.a = this.i;
                    c0617Mw.k = "video/avc";
                    c0617Mw.h = str;
                    c0617Mw.p = c2751sTV2.e;
                    c0617Mw.q = c2751sTV2.f;
                    c0617Mw.t = c2751sTV2.g;
                    c0617Mw.m = arrayList;
                    interfaceC1324dm0.a(new C0643Nw(c0617Mw));
                    this.l = true;
                    this.k.d.append(c2751sTV2.d, c2751sTV2);
                    this.k.e.append(iL3, c2654rT);
                    c2161mK2.f();
                    c2161mK.f();
                } else {
                    i = i18;
                    i2 = i13;
                    bArr = bArr2;
                    i3 = i15;
                    i4 = i16;
                    j = j4;
                }
            } else {
                i = i18;
                i2 = i13;
                bArr = bArr2;
                i3 = i15;
                i4 = i16;
                j = j4;
            }
            C2161mK c2161mK3 = this.f;
            if (c2161mK3.e(i19)) {
                int iH = Ou0.H(c2161mK3.e, (byte[]) c2161mK3.f);
                byte[] bArr3 = (byte[]) c2161mK3.f;
                C2562qX c2562qX2 = this.f483o;
                c2562qX2.D(iH, bArr3);
                c2562qX2.F(4);
                Sr0.c(j5, c2562qX2, this.a.c);
            }
            QA qa = this.k;
            boolean z3 = this.l;
            boolean z4 = this.n;
            if (qa.i == 9) {
                if (z3 && qa.f469o) {
                    j2 = qa.j;
                    i5 = i + ((int) (j - j2));
                    j3 = qa.q;
                    if (j3 != -9223372036854775807L) {
                        qa.a.d(j3, qa.r ? 1 : 0, (int) (j2 - qa.p), i5, null);
                    }
                }
                qa.p = qa.j;
                qa.q = qa.l;
                qa.r = false;
                qa.f469o = true;
            } else if (qa.c) {
                PA pa = qa.n;
                PA pa2 = qa.m;
                if (pa.a) {
                    if (pa2.a) {
                        C2751sT c2751sT = pa.c;
                        AbstractC0397Ej.g(c2751sT);
                        C2751sT c2751sT2 = pa2.c;
                        AbstractC0397Ej.g(c2751sT2);
                        if (pa.f == pa2.f && pa.g == pa2.g && pa.h == pa2.h && ((!pa.i || !pa2.i || pa.j == pa2.j) && ((i9 = pa.d) == (i10 = pa2.d) || (i9 != 0 && i10 != 0)))) {
                            int i20 = c2751sT2.k;
                            int i21 = c2751sT.k;
                            if ((i21 == 0 && i20 == 0 && (pa.m != pa2.m || pa.n != pa2.n)) || ((i21 == 1 && i20 == 1 && (pa.f451o != pa2.f451o || pa.p != pa2.p)) || (z = pa.k) != pa2.k || (z && pa.l != pa2.l))) {
                                if (z3) {
                                    j2 = qa.j;
                                    i5 = i + ((int) (j - j2));
                                    j3 = qa.q;
                                    if (j3 != -9223372036854775807L) {
                                        qa.a.d(j3, qa.r ? 1 : 0, (int) (j2 - qa.p), i5, null);
                                    }
                                }
                                qa.p = qa.j;
                                qa.q = qa.l;
                                qa.r = false;
                                qa.f469o = true;
                            }
                        } else {
                            if (z3) {
                                j2 = qa.j;
                                i5 = i + ((int) (j - j2));
                                j3 = qa.q;
                                if (j3 != -9223372036854775807L) {
                                    qa.a.d(j3, qa.r ? 1 : 0, (int) (j2 - qa.p), i5, null);
                                }
                            }
                            qa.p = qa.j;
                            qa.q = qa.l;
                            qa.r = false;
                            qa.f469o = true;
                        }
                    } else {
                        if (z3) {
                            j2 = qa.j;
                            i5 = i + ((int) (j - j2));
                            j3 = qa.q;
                            if (j3 != -9223372036854775807L) {
                                qa.a.d(j3, qa.r ? 1 : 0, (int) (j2 - qa.p), i5, null);
                            }
                        }
                        qa.p = qa.j;
                        qa.q = qa.l;
                        qa.r = false;
                        qa.f469o = true;
                    }
                }
            }
            if (qa.b) {
                PA pa3 = qa.n;
                z4 = pa3.b && ((i8 = pa3.e) == 7 || i8 == 2);
            }
            boolean z5 = qa.r;
            int i22 = qa.i;
            boolean z6 = z5 | (i22 == 5 || (z4 && i22 == 1));
            qa.r = z6;
            if (z6) {
                this.n = false;
            }
            long j6 = this.m;
            if (!this.l || this.k.c) {
                i6 = i4;
                c2161mK2.g(i6);
                c2161mK.g(i6);
            } else {
                i6 = i4;
            }
            c2161mK3.g(i6);
            QA qa2 = this.k;
            qa2.i = i6;
            qa2.l = j6;
            qa2.j = j;
            if (qa2.b) {
                i7 = 1;
                if (i6 == 1) {
                    PA pa4 = qa2.m;
                    qa2.m = qa2.n;
                    qa2.n = pa4;
                    pa4.b = false;
                    pa4.a = false;
                    qa2.h = 0;
                    qa2.k = true;
                }
                i13 = i2;
                bArr2 = bArr;
                i12 = i3;
            } else {
                i7 = 1;
            }
            if (qa2.c) {
                if (i6 != 5 && i6 != i7) {
                    if (i6 == 2) {
                    }
                    i13 = i2;
                    bArr2 = bArr;
                    i12 = i3;
                }
                PA pa5 = qa2.m;
                qa2.m = qa2.n;
                qa2.n = pa5;
                pa5.b = false;
                pa5.a = false;
                qa2.h = 0;
                qa2.k = true;
                i13 = i2;
                bArr2 = bArr;
                i12 = i3;
            }
            i13 = i2;
            bArr2 = bArr;
            i12 = i3;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.i = ym0.e;
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 2);
        this.j = interfaceC1324dm0S;
        this.k = new QA(interfaceC1324dm0S, this.b, this.c);
        this.a.b(interfaceC0354Cs, ym0);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    public final void f(byte[] bArr, int i, int i2) {
        boolean zH;
        boolean zH2;
        boolean z;
        boolean z2;
        int iL;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int iM;
        int iM2;
        int i6;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        QA qa = this.k;
        if (qa.k) {
            int i7 = i2 - i;
            byte[] bArr2 = qa.g;
            int length = bArr2.length;
            int i8 = qa.h + i7;
            if (length < i8) {
                qa.g = Arrays.copyOf(bArr2, i8 * 2);
            }
            System.arraycopy(bArr, i, qa.g, qa.h, i7);
            int i9 = qa.h + i7;
            qa.h = i9;
            byte[] bArr3 = qa.g;
            C2084lc c2084lc = qa.f;
            c2084lc.b = bArr3;
            c2084lc.d = 0;
            c2084lc.c = i9;
            c2084lc.e = 0;
            c2084lc.a();
            if (c2084lc.d(8)) {
                c2084lc.r();
                int i10 = c2084lc.i(2);
                c2084lc.s(5);
                if (c2084lc.e()) {
                    c2084lc.l();
                    if (c2084lc.e()) {
                        int iL2 = c2084lc.l();
                        if (!qa.c) {
                            qa.k = false;
                            PA pa = qa.n;
                            pa.e = iL2;
                            pa.b = true;
                            return;
                        }
                        if (c2084lc.e()) {
                            int iL3 = c2084lc.l();
                            SparseArray sparseArray = qa.e;
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                qa.k = false;
                                return;
                            }
                            C2654rT c2654rT = (C2654rT) sparseArray.get(iL3);
                            C2751sT c2751sT = (C2751sT) qa.d.get(c2654rT.a);
                            if (c2751sT.h) {
                                if (!c2084lc.d(2)) {
                                    return;
                                } else {
                                    c2084lc.s(2);
                                }
                            }
                            int i11 = c2751sT.j;
                            if (c2084lc.d(i11)) {
                                int i12 = c2084lc.i(i11);
                                if (!c2751sT.i) {
                                    if (c2084lc.d(1)) {
                                        zH = c2084lc.h();
                                        if (zH) {
                                            if (!c2084lc.d(1)) {
                                                return;
                                            }
                                            zH2 = c2084lc.h();
                                            z = true;
                                        }
                                        if (qa.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iL = 0;
                                        } else if (!c2084lc.e()) {
                                            return;
                                        } else {
                                            iL = c2084lc.l();
                                        }
                                        z3 = c2654rT.b;
                                        i3 = c2751sT.k;
                                        if (i3 == 0) {
                                            i6 = c2751sT.l;
                                            if (!c2084lc.d(i6)) {
                                                return;
                                            }
                                            i4 = c2084lc.i(i6);
                                            if (z3 || zH) {
                                                i5 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!c2084lc.e()) {
                                                    return;
                                                }
                                                iM2 = c2084lc.m();
                                                i5 = 0;
                                                iM = 0;
                                            }
                                        } else if (i3 == 1 || c2751sT.m) {
                                            i4 = 0;
                                            i5 = 0;
                                            iM = 0;
                                            iM2 = 0;
                                        } else {
                                            if (!c2084lc.e()) {
                                                return;
                                            }
                                            int iM3 = c2084lc.m();
                                            if (!z3 || zH) {
                                                i5 = iM3;
                                                i4 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!c2084lc.e()) {
                                                    return;
                                                }
                                                iM = c2084lc.m();
                                                iM2 = 0;
                                                i5 = iM3;
                                                i4 = 0;
                                            }
                                        }
                                        PA pa2 = qa.n;
                                        pa2.c = c2751sT;
                                        pa2.d = i10;
                                        pa2.e = iL2;
                                        pa2.f = i12;
                                        pa2.g = iL3;
                                        pa2.h = zH;
                                        pa2.i = z;
                                        pa2.j = zH2;
                                        pa2.k = z2;
                                        pa2.l = iL;
                                        pa2.m = i4;
                                        pa2.n = iM2;
                                        pa2.f451o = i5;
                                        pa2.p = iM;
                                        pa2.a = true;
                                        pa2.b = true;
                                        qa.k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z = false;
                                if (qa.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iL = 0;
                                } else if (!c2084lc.e()) {
                                    return;
                                } else {
                                    iL = c2084lc.l();
                                }
                                z3 = c2654rT.b;
                                i3 = c2751sT.k;
                                if (i3 == 0) {
                                    i6 = c2751sT.l;
                                    if (!c2084lc.d(i6)) {
                                        return;
                                    }
                                    i4 = c2084lc.i(i6);
                                    if (z3) {
                                    }
                                    i5 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                } else {
                                    if (i3 == 1) {
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                }
                                PA pa3 = qa.n;
                                pa3.c = c2751sT;
                                pa3.d = i10;
                                pa3.e = iL2;
                                pa3.f = i12;
                                pa3.g = iL3;
                                pa3.h = zH;
                                pa3.i = z;
                                pa3.j = zH2;
                                pa3.k = z2;
                                pa3.l = iL;
                                pa3.m = i4;
                                pa3.n = iM2;
                                pa3.f451o = i5;
                                pa3.p = iM;
                                pa3.a = true;
                                pa3.b = true;
                                qa.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
