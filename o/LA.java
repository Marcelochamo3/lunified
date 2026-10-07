package o;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class LA implements InterfaceC3273xp {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public InterfaceC1324dm0 b;
    public final Ib0 c;
    public final C2562qX d;
    public final C2161mK e;
    public final boolean[] f = new boolean[4];
    public final KA g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f376o;
    public boolean p;

    public LA(Ib0 ib0) {
        this.c = ib0;
        KA ka = new KA();
        ka.d = new byte[128];
        this.g = ka;
        if (ib0 != null) {
            this.e = new C2161mK(178);
            this.d = new C2562qX();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        Ou0.d(this.f);
        KA ka = this.g;
        ka.a = false;
        ka.b = 0;
        ka.c = 0;
        C2161mK c2161mK = this.e;
        if (c2161mK != null) {
            c2161mK.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
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
        KA ka;
        C2161mK c2161mK;
        int i;
        int i2;
        boolean z;
        int i3;
        float f;
        long j;
        float f2;
        int i4;
        char c = 4;
        AbstractC0397Ej.g(this.b);
        int i5 = c2562qX.b;
        int i6 = c2562qX.c;
        byte[] bArr = c2562qX.a;
        this.h += (long) c2562qX.a();
        this.b.e(c2562qX.a(), c2562qX);
        while (true) {
            int i7 = Ou0.i(bArr, i5, i6, this.f);
            ka = this.g;
            c2161mK = this.e;
            if (i7 == i6) {
                break;
            }
            int i8 = i7 + 3;
            int i9 = c2562qX.a[i8] & 255;
            int i10 = i7 - i5;
            if (this.j) {
                i = i6;
                i2 = i8;
                i5 = i5;
            } else {
                if (i10 > 0) {
                    ka.a(bArr, i5, i7);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                if (ka.a) {
                    int i12 = ka.b - i11;
                    ka.b = i12;
                    if (ka.c == 0 && i9 == 181) {
                        ka.c = i12;
                        i = i6;
                        i2 = i8;
                        i5 = i5;
                    } else {
                        ka.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(ka.d, ka.b);
                        int i13 = bArrCopyOf[c] & 255;
                        byte b = bArrCopyOf[5];
                        i2 = i8;
                        i = i6;
                        int i14 = ((b & 255) >> 4) | (i13 << 4);
                        int i15 = ((b & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i16 = (bArrCopyOf[7] & 240) >> 4;
                        if (i16 != 2) {
                            if (i16 == 3) {
                                f2 = i15 * 16;
                                i4 = i14 * 9;
                            } else if (i16 != 4) {
                                f = 1.0f;
                            } else {
                                f2 = i15 * Yu0.b.h0;
                                i4 = i14 * 100;
                            }
                            f = f2 / i4;
                        } else {
                            f = (i15 * 4) / (i14 * 3);
                        }
                        C0617Mw c0617Mw = new C0617Mw();
                        c0617Mw.a = str;
                        c0617Mw.k = "video/mpeg2";
                        c0617Mw.p = i14;
                        c0617Mw.q = i15;
                        c0617Mw.t = f;
                        c0617Mw.m = Collections.singletonList(bArrCopyOf);
                        C0643Nw c0643Nw = new C0643Nw(c0617Mw);
                        int i17 = (bArrCopyOf[7] & 15) - 1;
                        if (i17 < 0 || i17 >= 8) {
                            i5 = i5;
                            j = 0;
                        } else {
                            double d = q[i17];
                            byte b2 = bArrCopyOf[ka.c + 9];
                            int i18 = (b2 & 96) >> 5;
                            int i19 = b2 & 31;
                            if (i18 != i19) {
                                d *= (((double) i18) + 1.0d) / ((double) (i19 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(c0643Nw, Long.valueOf(j));
                        this.b.a((C0643Nw) pairCreate.first);
                        this.k = ((Long) pairCreate.second).longValue();
                        this.j = true;
                    }
                } else {
                    i = i6;
                    i2 = i8;
                    i5 = i5;
                    if (i9 == 179) {
                        ka.a = true;
                    }
                }
                ka.a(KA.e, 0, 3);
            }
            if (c2161mK == null) {
                z = true;
            } else {
                if (i10 > 0) {
                    c2161mK.a(bArr, i5, i7);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (c2161mK.e(i3)) {
                    int iH = Ou0.H(c2161mK.e, (byte[]) c2161mK.f);
                    int i20 = Lr0.a;
                    byte[] bArr2 = (byte[]) c2161mK.f;
                    C2562qX c2562qX2 = this.d;
                    c2562qX2.D(iH, bArr2);
                    this.c.a(this.n, c2562qX2);
                }
                if (i9 == 178) {
                    z = true;
                    if (c2562qX.a[i7 + 2] == 1) {
                        c2161mK.g(i9);
                    }
                } else {
                    z = true;
                }
            }
            if (i9 == 0 || i9 == 179) {
                int i21 = i - i7;
                if (this.p && this.j) {
                    long j2 = this.n;
                    if (j2 != -9223372036854775807L) {
                        this.b.d(j2, this.f376o ? 1 : 0, ((int) (this.h - this.m)) - i21, i21, null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - ((long) i21);
                    long j3 = this.l;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.n;
                        j3 = j4 != -9223372036854775807L ? j4 + this.k : -9223372036854775807L;
                    }
                    this.n = j3;
                    this.f376o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                this.p = i9 == 0;
            } else if (i9 == 184) {
                this.f376o = z;
            }
            i6 = i;
            i5 = i2;
            c = 4;
        }
        if (!this.j) {
            ka.a(bArr, i5, i6);
        }
        if (c2161mK != null) {
            c2161mK.a(bArr, i5, i6);
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        this.l = j;
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.a = ym0.e;
        ym0.b();
        this.b = interfaceC0354Cs.s(ym0.d, 2);
        Ib0 ib0 = this.c;
        if (ib0 != null) {
            ib0.b(interfaceC0354Cs, ym0);
        }
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
