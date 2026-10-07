package o;

/* JADX INFO: renamed from: o.wS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3138wS implements InterfaceC3273xp {
    public final C2562qX a;
    public final C3235xS b;
    public final String c;
    public InterfaceC1324dm0 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public C3138wS(String str) {
        C2562qX c2562qX = new C2562qX(4);
        this.a = c2562qX;
        c2562qX.a[0] = -1;
        this.b = new C3235xS();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) {
        AbstractC0397Ej.g(this.d);
        while (c2562qX.a() > 0) {
            int i = this.f;
            C2562qX c2562qX2 = this.a;
            if (i == 0) {
                byte[] bArr = c2562qX.a;
                int i2 = c2562qX.b;
                int i3 = c2562qX.c;
                while (true) {
                    if (i2 >= i3) {
                        c2562qX.F(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        c2562qX.F(i2 + 1);
                        this.i = false;
                        c2562qX2.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c2562qX.a(), 4 - this.g);
                c2562qX.e(c2562qX2.a, this.g, iMin);
                int i4 = this.g + iMin;
                this.g = i4;
                if (i4 >= 4) {
                    c2562qX2.F(0);
                    int iG = c2562qX2.g();
                    C3235xS c3235xS = this.b;
                    if (c3235xS.a(iG)) {
                        this.k = c3235xS.b;
                        if (!this.h) {
                            long j = ((long) c3235xS.f) * 1000000;
                            int i5 = c3235xS.c;
                            this.j = j / ((long) i5);
                            C0617Mw c0617Mw = new C0617Mw();
                            c0617Mw.a = this.e;
                            c0617Mw.k = (String) c3235xS.g;
                            c0617Mw.l = C1672hI.a.f;
                            c0617Mw.x = c3235xS.d;
                            c0617Mw.y = i5;
                            c0617Mw.c = this.c;
                            this.d.a(new C0643Nw(c0617Mw));
                            this.h = true;
                        }
                        c2562qX2.F(0);
                        this.d.e(4, c2562qX2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c2562qX.a(), this.k - this.g);
                this.d.e(iMin2, c2562qX);
                int i6 = this.g + iMin2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    long j2 = this.l;
                    if (j2 != -9223372036854775807L) {
                        this.d.d(j2, 1, i7, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        ym0.a();
        ym0.b();
        this.e = ym0.e;
        ym0.b();
        this.d = interfaceC0354Cs.s(ym0.d, 1);
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
    }
}
