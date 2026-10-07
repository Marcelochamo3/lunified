package o;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class TA implements InterfaceC3273xp {
    public final Ib0 a;
    public String b;
    public InterfaceC1324dm0 c;
    public SA d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final C2161mK g = new C2161mK(32);
    public final C2161mK h = new C2161mK(33);
    public final C2161mK i = new C2161mK(34);
    public final C2161mK j = new C2161mK(39);
    public final C2161mK k = new C2161mK(40);
    public long m = -9223372036854775807L;
    public final C2562qX n = new C2562qX();

    public TA(Ib0 ib0) {
        this.a = ib0;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        Ou0.d(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        SA sa = this.d;
        if (sa != null) {
            sa.f = false;
            sa.g = false;
            sa.h = false;
            sa.i = false;
            sa.j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0176  */
    /* JADX WARN: Code duplicated, block: B:47:0x0183  */
    /* JADX WARN: Code duplicated, block: B:50:0x019e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x021a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0239  */
    /* JADX WARN: Code duplicated, block: B:84:0x023f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0244  */
    /* JADX WARN: Code duplicated, block: B:91:0x024b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0252  */
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
        boolean z;
        C2161mK c2161mK;
        C2161mK c2161mK2;
        C2161mK c2161mK3;
        int i3;
        C2161mK c2161mK4;
        boolean zE;
        Ib0 ib0;
        C2562qX c2562qX2;
        C2161mK c2161mK5;
        boolean z2;
        boolean z3;
        AbstractC0397Ej.g(this.c);
        int i4 = Lr0.a;
        while (c2562qX.a() > 0) {
            int i5 = c2562qX.b;
            int i6 = c2562qX.c;
            byte[] bArr = c2562qX.a;
            this.l += (long) c2562qX.a();
            this.c.e(c2562qX.a(), c2562qX);
            while (i5 < i6) {
                int i7 = Ou0.i(bArr, i5, i6, this.f);
                if (i7 == i6) {
                    f(bArr, i5, i6);
                    return;
                }
                int i8 = i7 + 3;
                int i9 = (bArr[i8] & 126) >> 1;
                int i10 = i7 - i5;
                if (i10 > 0) {
                    f(bArr, i5, i7);
                }
                int i11 = i6 - i7;
                long j = this.l - ((long) i11);
                int i12 = i10 < 0 ? -i10 : 0;
                long j2 = this.m;
                SA sa = this.d;
                boolean z4 = this.e;
                if (sa.j && sa.g) {
                    sa.m = sa.c;
                    sa.j = false;
                } else {
                    if (sa.h || sa.g) {
                        if (z4 && sa.i) {
                            i = i8;
                            long j3 = sa.b;
                            i2 = i12;
                            int i13 = i11 + ((int) (j - j3));
                            long j4 = sa.l;
                            if (j4 != -9223372036854775807L) {
                                sa.a.d(j4, sa.m ? 1 : 0, (int) (j3 - sa.k), i13, null);
                            }
                        } else {
                            i = i8;
                            i2 = i12;
                        }
                        sa.k = sa.b;
                        sa.l = sa.e;
                        sa.m = sa.c;
                        sa.i = true;
                    }
                    z = this.e;
                    c2161mK = this.i;
                    c2161mK2 = this.h;
                    c2161mK3 = this.g;
                    if (z) {
                        i3 = i2;
                    } else {
                        i3 = i2;
                        c2161mK3.e(i3);
                        c2161mK2.e(i3);
                        c2161mK.e(i3);
                        if (!c2161mK3.d && c2161mK2.d && c2161mK.d) {
                            InterfaceC1324dm0 interfaceC1324dm0 = this.c;
                            String str = this.b;
                            int i14 = c2161mK3.e;
                            byte[] bArr2 = new byte[c2161mK2.e + i14 + c2161mK.e];
                            System.arraycopy((byte[]) c2161mK3.f, 0, bArr2, 0, i14);
                            System.arraycopy((byte[]) c2161mK2.f, 0, bArr2, c2161mK3.e, c2161mK2.e);
                            System.arraycopy((byte[]) c2161mK.f, 0, bArr2, c2161mK3.e + c2161mK2.e, c2161mK.e);
                            C2558qT c2558qTU = Ou0.u((byte[]) c2161mK2.f, 3, c2161mK2.e);
                            String strF = AbstractC3045vW.f(c2558qTU.a, c2558qTU.b, c2558qTU.c, c2558qTU.d, c2558qTU.e, c2558qTU.f);
                            C0617Mw c0617Mw = new C0617Mw();
                            c0617Mw.a = str;
                            c0617Mw.k = "video/hevc";
                            c0617Mw.h = strF;
                            c0617Mw.p = c2558qTU.g;
                            c0617Mw.q = c2558qTU.h;
                            c0617Mw.t = c2558qTU.i;
                            c0617Mw.m = Collections.singletonList(bArr2);
                            interfaceC1324dm0.a(new C0643Nw(c0617Mw));
                            this.e = true;
                        }
                    }
                    c2161mK4 = this.j;
                    zE = c2161mK4.e(i3);
                    ib0 = this.a;
                    c2562qX2 = this.n;
                    if (zE) {
                        c2562qX2.D(Ou0.H(c2161mK4.e, (byte[]) c2161mK4.f), (byte[]) c2161mK4.f);
                        c2562qX2.G(5);
                        Sr0.c(j2, c2562qX2, ib0.c);
                    }
                    c2161mK5 = this.k;
                    if (c2161mK5.e(i3)) {
                        c2562qX2.D(Ou0.H(c2161mK5.e, (byte[]) c2161mK5.f), (byte[]) c2161mK5.f);
                        c2562qX2.G(5);
                        Sr0.c(j2, c2562qX2, ib0.c);
                    }
                    long j5 = this.m;
                    SA sa2 = this.d;
                    boolean z5 = this.e;
                    sa2.g = false;
                    sa2.h = false;
                    sa2.e = j5;
                    sa2.d = 0;
                    sa2.b = j;
                    if (i9 < 32 && i9 != 40) {
                        if (sa2.i && !sa2.j) {
                            if (z5) {
                                long j6 = sa2.l;
                                if (j6 != -9223372036854775807L) {
                                    sa2.a.d(j6, sa2.m ? 1 : 0, (int) (j - sa2.k), i11, null);
                                }
                            }
                            sa2.i = false;
                        }
                        if ((32 <= i9 && i9 <= 35) || i9 == 39) {
                            sa2.h = !sa2.j;
                            sa2.j = true;
                        }
                        if (i9 >= 16 || i9 > 21) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        sa2.c = z2;
                        if (!z2 || i9 <= 9) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sa2.f = z3;
                        if (!this.e) {
                            c2161mK3.g(i9);
                            c2161mK2.g(i9);
                            c2161mK.g(i9);
                        }
                        c2161mK4.g(i9);
                        c2161mK5.g(i9);
                        i5 = i;
                        i6 = i6;
                        bArr = bArr;
                    }
                    if (i9 >= 16) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    sa2.c = z2;
                    if (z2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    sa2.f = z3;
                    if (!this.e) {
                        c2161mK3.g(i9);
                        c2161mK2.g(i9);
                        c2161mK.g(i9);
                    }
                    c2161mK4.g(i9);
                    c2161mK5.g(i9);
                    i5 = i;
                    i6 = i6;
                    bArr = bArr;
                }
                i6 = i6;
                bArr = bArr;
                i = i8;
                i2 = i12;
                z = this.e;
                c2161mK = this.i;
                c2161mK2 = this.h;
                c2161mK3 = this.g;
                if (z) {
                    i3 = i2;
                    c2161mK3.e(i3);
                    c2161mK2.e(i3);
                    c2161mK.e(i3);
                    if (!c2161mK3.d) {
                    }
                } else {
                    i3 = i2;
                }
                c2161mK4 = this.j;
                zE = c2161mK4.e(i3);
                ib0 = this.a;
                c2562qX2 = this.n;
                if (zE) {
                    c2562qX2.D(Ou0.H(c2161mK4.e, (byte[]) c2161mK4.f), (byte[]) c2161mK4.f);
                    c2562qX2.G(5);
                    Sr0.c(j2, c2562qX2, ib0.c);
                }
                c2161mK5 = this.k;
                if (c2161mK5.e(i3)) {
                    c2562qX2.D(Ou0.H(c2161mK5.e, (byte[]) c2161mK5.f), (byte[]) c2161mK5.f);
                    c2562qX2.G(5);
                    Sr0.c(j2, c2562qX2, ib0.c);
                }
                long j7 = this.m;
                SA sa3 = this.d;
                boolean z6 = this.e;
                sa3.g = false;
                sa3.h = false;
                sa3.e = j7;
                sa3.d = 0;
                sa3.b = j;
                if (i9 < 32) {
                }
                if (i9 >= 16) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                sa3.c = z2;
                if (z2) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                sa3.f = z3;
                if (!this.e) {
                    c2161mK3.g(i9);
                    c2161mK2.g(i9);
                    c2161mK.g(i9);
                }
                c2161mK4.g(i9);
                c2161mK5.g(i9);
                i5 = i;
                i6 = i6;
                bArr = bArr;
            }
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.b = ym0.e;
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 2);
        this.c = interfaceC1324dm0S;
        this.d = new SA(interfaceC1324dm0S);
        this.a.b(interfaceC0354Cs, ym0);
    }

    public final void f(byte[] bArr, int i, int i2) {
        SA sa = this.d;
        if (sa.f) {
            int i3 = sa.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                sa.g = (bArr[i4] & 128) != 0;
                sa.f = false;
            } else {
                sa.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
