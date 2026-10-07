package o;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class OA implements InterfaceC3273xp {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final Ib0 a;
    public final C2562qX b;
    public final boolean[] c = new boolean[4];
    public final MA d;
    public final C2161mK e;
    public NA f;
    public long g;
    public String h;
    public InterfaceC1324dm0 i;
    public boolean j;
    public long k;

    public OA(Ib0 ib0) {
        this.a = ib0;
        MA ma = new MA();
        ma.e = new byte[128];
        this.d = ma;
        this.k = -9223372036854775807L;
        this.e = new C2161mK(178);
        this.b = new C2562qX();
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        Ou0.d(this.c);
        MA ma = this.d;
        ma.a = false;
        ma.c = 0;
        ma.b = 0;
        NA na = this.f;
        if (na != null) {
            na.b = false;
            na.c = false;
            na.d = false;
            na.e = -1;
        }
        C2161mK c2161mK = this.e;
        if (c2161mK != null) {
            c2161mK.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0271  */
    /* JADX WARN: Code duplicated, block: B:115:0x0273  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0215  */
    /* JADX WARN: Code duplicated, block: B:94:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x022b A[ADDED_TO_REGION] */
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
        long j;
        NA na;
        boolean z;
        boolean z2;
        long j2;
        int i3;
        float f;
        int i4 = 2;
        int i5 = 1;
        AbstractC0397Ej.g(this.f);
        AbstractC0397Ej.g(this.i);
        int i6 = c2562qX.b;
        int i7 = c2562qX.c;
        byte[] bArr = c2562qX.a;
        this.g += (long) c2562qX.a();
        this.i.e(c2562qX.a(), c2562qX);
        while (true) {
            int i8 = Ou0.i(bArr, i6, i7, this.c);
            MA ma = this.d;
            C2161mK c2161mK = this.e;
            if (i8 == i7) {
                if (!this.j) {
                    ma.a(bArr, i6, i7);
                }
                this.f.a(bArr, i6, i7);
                if (c2161mK != null) {
                    c2161mK.a(bArr, i6, i7);
                    return;
                }
                return;
            }
            int i9 = i8 + 3;
            int i10 = c2562qX.a[i9];
            int i11 = i10 & 255;
            int i12 = i8 - i6;
            if (this.j) {
                i = i9;
            } else {
                if (i12 > 0) {
                    ma.a(bArr, i6, i8);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                int i14 = ma.b;
                if (i14 != 0) {
                    i = i9;
                    if (i14 != i5) {
                        if (i14 != i4) {
                            if (i14 != 3) {
                                if (i14 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i11 == 179 || i11 == 181) {
                                    ma.c -= i13;
                                    ma.a = false;
                                    InterfaceC1324dm0 interfaceC1324dm0 = this.i;
                                    int i15 = ma.d;
                                    String str = this.h;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(ma.e, ma.c);
                                    C2084lc c2084lc = new C2084lc(bArrCopyOf.length, bArrCopyOf);
                                    c2084lc.t(i15);
                                    c2084lc.t(4);
                                    c2084lc.r();
                                    c2084lc.s(8);
                                    if (c2084lc.h()) {
                                        c2084lc.s(4);
                                        c2084lc.s(3);
                                    }
                                    int i16 = c2084lc.i(4);
                                    if (i16 == 15) {
                                        int i17 = c2084lc.i(8);
                                        int i18 = c2084lc.i(8);
                                        if (i18 == 0) {
                                            AP.z();
                                            f = 1.0f;
                                        } else {
                                            f = i17 / i18;
                                        }
                                    } else if (i16 < 7) {
                                        f = l[i16];
                                    } else {
                                        AP.z();
                                        f = 1.0f;
                                    }
                                    if (c2084lc.h()) {
                                        c2084lc.s(2);
                                        c2084lc.s(1);
                                        if (c2084lc.h()) {
                                            c2084lc.s(15);
                                            c2084lc.r();
                                            c2084lc.s(15);
                                            c2084lc.r();
                                            c2084lc.s(15);
                                            c2084lc.r();
                                            c2084lc.s(3);
                                            c2084lc.s(11);
                                            c2084lc.r();
                                            c2084lc.s(15);
                                            c2084lc.r();
                                        }
                                    }
                                    if (c2084lc.i(2) != 0) {
                                        AP.z();
                                    }
                                    c2084lc.r();
                                    int i19 = c2084lc.i(16);
                                    c2084lc.r();
                                    if (c2084lc.h()) {
                                        if (i19 == 0) {
                                            AP.z();
                                        } else {
                                            int i20 = 0;
                                            for (int i21 = i19 - 1; i21 > 0; i21 >>= 1) {
                                                i20++;
                                            }
                                            c2084lc.s(i20);
                                        }
                                    }
                                    c2084lc.r();
                                    int i22 = c2084lc.i(13);
                                    c2084lc.r();
                                    int i23 = c2084lc.i(13);
                                    c2084lc.r();
                                    c2084lc.r();
                                    C0617Mw c0617Mw = new C0617Mw();
                                    c0617Mw.a = str;
                                    c0617Mw.k = "video/mp4v-es";
                                    c0617Mw.p = i22;
                                    c0617Mw.q = i23;
                                    c0617Mw.t = f;
                                    c0617Mw.m = Collections.singletonList(bArrCopyOf);
                                    interfaceC1324dm0.a(new C0643Nw(c0617Mw));
                                    this.j = true;
                                }
                                this.f.a(bArr, i6, i8);
                                if (c2161mK != null) {
                                    if (i12 > 0) {
                                        c2161mK.a(bArr, i6, i8);
                                        i3 = 0;
                                    } else {
                                        i3 = -i12;
                                    }
                                    if (c2161mK.e(i3)) {
                                        int iH = Ou0.H(c2161mK.e, (byte[]) c2161mK.f);
                                        int i24 = Lr0.a;
                                        byte[] bArr2 = (byte[]) c2161mK.f;
                                        C2562qX c2562qX2 = this.b;
                                        c2562qX2.D(iH, bArr2);
                                        this.a.a(this.k, c2562qX2);
                                    }
                                    if (i11 == 178) {
                                        if (c2562qX.a[i8 + 2] == 1) {
                                            c2161mK.g(i11);
                                        }
                                    }
                                }
                                i2 = i7 - i8;
                                j = this.g - ((long) i2);
                                na = this.f;
                                boolean z3 = this.j;
                                if (na.e == 182 && z3 && na.b) {
                                    j2 = na.h;
                                    if (j2 != -9223372036854775807L) {
                                        na.a.d(j2, na.d ? 1 : 0, (int) (j - na.g), i2, null);
                                    }
                                }
                                if (na.e != 179) {
                                    na.g = j;
                                }
                                NA na2 = this.f;
                                long j3 = this.k;
                                na2.e = i11;
                                na2.d = false;
                                if (i11 != 182 || i11 == 179) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                na2.b = z;
                                if (i11 == 182) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                na2.c = z2;
                                na2.f = 0;
                                na2.h = j3;
                                i6 = i;
                                i4 = 2;
                                i5 = 1;
                            } else if ((i10 & 240) != 32) {
                                AP.z();
                                ma.a = false;
                                ma.c = 0;
                                ma.b = 0;
                            } else {
                                ma.d = ma.c;
                                ma.b = 4;
                            }
                        } else if (i11 > 31) {
                            AP.z();
                            ma.a = false;
                            ma.c = 0;
                            ma.b = 0;
                        } else {
                            ma.b = 3;
                        }
                    } else if (i11 != 181) {
                        AP.z();
                        ma.a = false;
                        ma.c = 0;
                        ma.b = 0;
                    } else {
                        ma.b = 2;
                    }
                } else {
                    i = i9;
                    if (i11 == 176) {
                        ma.b = 1;
                        ma.a = true;
                    }
                }
                ma.a(MA.f, 0, 3);
                this.f.a(bArr, i6, i8);
                if (c2161mK != null) {
                    if (i12 > 0) {
                        c2161mK.a(bArr, i6, i8);
                        i3 = 0;
                    } else {
                        i3 = -i12;
                    }
                    if (c2161mK.e(i3)) {
                        int iH2 = Ou0.H(c2161mK.e, (byte[]) c2161mK.f);
                        int i25 = Lr0.a;
                        byte[] bArr3 = (byte[]) c2161mK.f;
                        C2562qX c2562qX3 = this.b;
                        c2562qX3.D(iH2, bArr3);
                        this.a.a(this.k, c2562qX3);
                    }
                    if (i11 == 178) {
                        if (c2562qX.a[i8 + 2] == 1) {
                            c2161mK.g(i11);
                        }
                    }
                }
                i2 = i7 - i8;
                j = this.g - ((long) i2);
                na = this.f;
                boolean z4 = this.j;
                if (na.e == 182) {
                    j2 = na.h;
                    if (j2 != -9223372036854775807L) {
                        na.a.d(j2, na.d ? 1 : 0, (int) (j - na.g), i2, null);
                    }
                }
                if (na.e != 179) {
                    na.g = j;
                }
                NA na3 = this.f;
                long j4 = this.k;
                na3.e = i11;
                na3.d = false;
                if (i11 != 182) {
                    z = true;
                } else {
                    z = true;
                }
                na3.b = z;
                if (i11 == 182) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                na3.c = z2;
                na3.f = 0;
                na3.h = j4;
                i6 = i;
                i4 = 2;
                i5 = 1;
            }
            this.f.a(bArr, i6, i8);
            if (c2161mK != null) {
                if (i12 > 0) {
                    c2161mK.a(bArr, i6, i8);
                    i3 = 0;
                } else {
                    i3 = -i12;
                }
                if (c2161mK.e(i3)) {
                    int iH3 = Ou0.H(c2161mK.e, (byte[]) c2161mK.f);
                    int i26 = Lr0.a;
                    byte[] bArr4 = (byte[]) c2161mK.f;
                    C2562qX c2562qX4 = this.b;
                    c2562qX4.D(iH3, bArr4);
                    this.a.a(this.k, c2562qX4);
                }
                if (i11 == 178) {
                    if (c2562qX.a[i8 + 2] == 1) {
                        c2161mK.g(i11);
                    }
                }
            }
            i2 = i7 - i8;
            j = this.g - ((long) i2);
            na = this.f;
            boolean z5 = this.j;
            if (na.e == 182) {
                j2 = na.h;
                if (j2 != -9223372036854775807L) {
                    na.a.d(j2, na.d ? 1 : 0, (int) (j - na.g), i2, null);
                }
            }
            if (na.e != 179) {
                na.g = j;
            }
            NA na4 = this.f;
            long j5 = this.k;
            na4.e = i11;
            na4.d = false;
            if (i11 != 182) {
                z = true;
            } else {
                z = true;
            }
            na4.b = z;
            if (i11 == 182) {
                z2 = true;
            } else {
                z2 = false;
            }
            na4.c = z2;
            na4.f = 0;
            na4.h = j5;
            i6 = i;
            i4 = 2;
            i5 = 1;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.h = ym0.e;
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 2);
        this.i = interfaceC1324dm0S;
        this.f = new NA(interfaceC1324dm0S);
        Ib0 ib0 = this.a;
        if (ib0 != null) {
            ib0.b(interfaceC0354Cs, ym0);
        }
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
