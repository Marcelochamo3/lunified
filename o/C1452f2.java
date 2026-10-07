package o;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: o.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1452f2 implements InterfaceC3273xp {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public InterfaceC1324dm0 f;
    public InterfaceC1324dm0 g;
    public boolean k;
    public boolean l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f767o;
    public boolean p;
    public int r;
    public InterfaceC1324dm0 t;
    public long u;
    public final C2084lc b = new C2084lc(7, new byte[7]);
    public final C2562qX c = new C2562qX(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public C1452f2(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x027a  */
    /* JADX WARN: Code duplicated, block: B:114:0x027c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    /* JADX WARN: Code duplicated, block: B:118:0x0289  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [o.qX] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) throws C2949uX {
        byte[] bArr;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2 = false;
        int i6 = 7;
        int i7 = 2;
        this.f.getClass();
        int i8 = Lr0.a;
        while (c2562qX.a() > 0) {
            int i9 = this.h;
            int i10 = 4;
            C2562qX c2562qX2 = this.c;
            C2084lc c2084lc = this.b;
            if (i9 == 0) {
                byte[] bArr2 = c2562qX.a;
                int i11 = c2562qX.b;
                int i12 = c2562qX.c;
                ?? r2 = z2;
                while (true) {
                    if (i11 < i12) {
                        int i13 = i11 + 1;
                        byte b = bArr2[i11];
                        int i14 = b & 255;
                        if (this.j == 512 && ((65280 | (((byte) i14) & 255)) & 65526) == 65520) {
                            if (!this.l) {
                                int i15 = i11 - 1;
                                c2562qX.F(i11);
                                byte[] bArr3 = c2084lc.b;
                                if (c2562qX.a() < 1) {
                                    bArr = bArr2;
                                } else {
                                    c2562qX.e(bArr3, r2, 1);
                                    c2084lc.p(i10);
                                    int i16 = c2084lc.i(1);
                                    int i17 = this.m;
                                    if (i17 == -1 || i16 == i17) {
                                        if (this.n != -1) {
                                            byte[] bArr4 = c2084lc.b;
                                            if (c2562qX.a() >= 1) {
                                                c2562qX.e(bArr4, r2, 1);
                                                c2084lc.p(i7);
                                                i3 = 4;
                                                if (c2084lc.i(4) != this.n) {
                                                    bArr = bArr2;
                                                } else {
                                                    c2562qX.F(i13);
                                                }
                                            }
                                        } else {
                                            i3 = 4;
                                        }
                                        byte[] bArr5 = c2084lc.b;
                                        if (c2562qX.a() >= i3) {
                                            c2562qX.e(bArr5, r2, i3);
                                            c2084lc.p(14);
                                            int i18 = c2084lc.i(13);
                                            if (i18 < 7) {
                                                bArr = bArr2;
                                            } else {
                                                byte[] bArr6 = c2562qX.a;
                                                int i19 = c2562qX.c;
                                                int i20 = i15 + i18;
                                                if (i20 < i19) {
                                                    byte b2 = bArr6[i20];
                                                    bArr = bArr2;
                                                    if (b2 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b3 = bArr6[i21];
                                                            if (((65280 | (b3 & 255)) & 65526) != 65520 || ((b3 & 8) >> 3) != i16) {
                                                            }
                                                        }
                                                    } else if (b2 == 73 && ((i4 = i20 + 1) == i19 || (bArr6[i4] == 68 && ((i5 = i20 + 2) == i19 || bArr6[i5] == 51)))) {
                                                    }
                                                }
                                                this.f767o = (b & 8) >> 3;
                                                if ((b & 1) == 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                this.k = z;
                                                if (this.l) {
                                                    this.h = 3;
                                                    this.i = 0;
                                                } else {
                                                    this.h = 1;
                                                    this.i = 0;
                                                }
                                                c2562qX.F(i13);
                                            }
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                }
                                i = this.j;
                                i2 = i | i14;
                                if (i2 != 329) {
                                    this.j = 768;
                                } else if (i2 != 511) {
                                    this.j = 512;
                                } else if (i2 != 836) {
                                    this.j = 1024;
                                } else if (i2 != 1075) {
                                    if (i != 256) {
                                        this.j = 256;
                                    }
                                    bArr2 = bArr;
                                    r2 = 0;
                                    i7 = 2;
                                    i10 = 4;
                                } else {
                                    this.h = 2;
                                    this.i = 3;
                                    this.r = 0;
                                    c2562qX2.F(0);
                                    c2562qX.F(i13);
                                }
                                i11 = i13;
                                bArr2 = bArr;
                                r2 = 0;
                                i7 = 2;
                                i10 = 4;
                            }
                            this.f767o = (b & 8) >> 3;
                            if ((b & 1) == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.k = z;
                            if (this.l) {
                                this.h = 1;
                                this.i = 0;
                            } else {
                                this.h = 3;
                                this.i = 0;
                            }
                            c2562qX.F(i13);
                        } else {
                            bArr = bArr2;
                            i = this.j;
                            i2 = i | i14;
                            if (i2 != 329) {
                                this.j = 768;
                            } else if (i2 != 511) {
                                this.j = 512;
                            } else if (i2 != 836) {
                                this.j = 1024;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.j = 256;
                                }
                                bArr2 = bArr;
                                r2 = 0;
                                i7 = 2;
                                i10 = 4;
                            } else {
                                this.h = 2;
                                this.i = 3;
                                this.r = 0;
                                c2562qX2.F(0);
                                c2562qX.F(i13);
                            }
                            i11 = i13;
                            bArr2 = bArr;
                            r2 = 0;
                            i7 = 2;
                            i10 = 4;
                        }
                    } else {
                        c2562qX.F(i11);
                    }
                    z2 = false;
                    i6 = 7;
                    i7 = 2;
                }
            } else if (i9 != 1) {
                if (i9 == i7) {
                    byte[] bArr7 = c2562qX2.a;
                    int iMin = Math.min(c2562qX.a(), 10 - this.i);
                    c2562qX.e(bArr7, this.i, iMin);
                    int i22 = this.i + iMin;
                    this.i = i22;
                    if (i22 == 10) {
                        this.g.e(10, c2562qX2);
                        c2562qX2.F(6);
                        InterfaceC1324dm0 interfaceC1324dm0 = this.g;
                        int iT = c2562qX2.t() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = interfaceC1324dm0;
                        this.u = 0L;
                        this.r = iT;
                    }
                } else if (i9 == 3) {
                    int i23 = this.k ? 7 : 5;
                    byte[] bArr8 = c2084lc.b;
                    int iMin2 = Math.min(c2562qX.a(), i23 - this.i);
                    c2562qX.e(bArr8, this.i, iMin2);
                    int i24 = this.i + iMin2;
                    this.i = i24;
                    if (i24 == i23) {
                        c2084lc.p(z2 ? 1 : 0);
                        if (this.p) {
                            c2084lc.s(10);
                        } else {
                            int i25 = c2084lc.i(i7) + 1;
                            if (i25 != i7) {
                                AP.z();
                                i25 = 2;
                            }
                            c2084lc.s(5);
                            int i26 = c2084lc.i(3);
                            int i27 = this.n;
                            byte b4 = (byte) (((i25 << 3) & 248) | ((i27 >> 1) & i6));
                            byte b5 = (byte) (((i26 << 3) & 120) | ((i27 << i6) & 128));
                            byte[] bArr9 = new byte[i7];
                            bArr9[z2 ? 1 : 0] = b4;
                            bArr9[1] = b5;
                            FV fvV = AbstractC3409z9.v(new C2084lc(i7, bArr9), z2);
                            C0617Mw c0617Mw = new C0617Mw();
                            c0617Mw.a = this.e;
                            c0617Mw.k = "audio/mp4a-latm";
                            c0617Mw.h = (String) fvV.n;
                            c0617Mw.x = fvV.m;
                            c0617Mw.y = fvV.l;
                            c0617Mw.m = Collections.singletonList(bArr9);
                            c0617Mw.c = this.d;
                            C0643Nw c0643Nw = new C0643Nw(c0617Mw);
                            this.q = 1024000000 / ((long) c0643Nw.K);
                            this.f.a(c0643Nw);
                            this.p = true;
                        }
                        c2084lc.s(4);
                        int i28 = c2084lc.i(13);
                        int i29 = i28 - 7;
                        if (this.k) {
                            i29 = i28 - 9;
                        }
                        InterfaceC1324dm0 interfaceC1324dm1 = this.f;
                        long j = this.q;
                        this.h = 4;
                        this.i = z2 ? 1 : 0;
                        this.t = interfaceC1324dm1;
                        this.u = j;
                        this.r = i29;
                    }
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c2562qX.a(), this.r - this.i);
                    this.t.e(iMin3, c2562qX);
                    int i30 = this.i + iMin3;
                    this.i = i30;
                    int i31 = this.r;
                    if (i30 == i31) {
                        long j2 = this.s;
                        if (j2 != -9223372036854775807L) {
                            this.t.d(j2, 1, i31, 0, null);
                            this.s += this.u;
                        }
                        this.h = z2 ? 1 : 0;
                        this.i = z2 ? 1 : 0;
                        this.j = 256;
                    }
                }
            } else if (c2562qX.a() != 0) {
                c2084lc.b[z2 ? 1 : 0] = c2562qX.a[c2562qX.b];
                c2084lc.p(i7);
                int i32 = c2084lc.i(4);
                int i33 = this.n;
                if (i33 == -1 || i32 == i33) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.f767o;
                        this.n = i32;
                    }
                    this.h = 3;
                    this.i = z2 ? 1 : 0;
                } else {
                    this.l = z2;
                    this.h = z2 ? 1 : 0;
                    this.i = z2 ? 1 : 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.e = ym0.e;
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 1);
        this.f = interfaceC1324dm0S;
        this.t = interfaceC1324dm0S;
        if (!this.a) {
            this.g = new C0921Yo();
            return;
        }
        ym0.a();
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S2 = interfaceC0354Cs.s(ym0.d, 5);
        this.g = interfaceC1324dm0S2;
        C0617Mw c0617Mw = new C0617Mw();
        ym0.b();
        c0617Mw.a = ym0.e;
        c0617Mw.k = "application/id3";
        interfaceC1324dm0S2.a(new C0643Nw(c0617Mw));
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
