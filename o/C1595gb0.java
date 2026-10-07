package o;

/* JADX INFO: renamed from: o.gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1595gb0 implements Zm0 {
    public final InterfaceC1497fb0 a;
    public final C2562qX b = new C2562qX(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public C1595gb0(InterfaceC1497fb0 interfaceC1497fb0) {
        this.a = interfaceC1497fb0;
    }

    @Override // o.Zm0
    public final void a() {
        this.f = true;
    }

    @Override // o.Zm0
    public final void b(int i, C2562qX c2562qX) {
        int iU;
        boolean z = (i & 1) != 0;
        if (z) {
            iU = c2562qX.b + c2562qX.u();
        } else {
            iU = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            c2562qX.F(iU);
            this.d = 0;
        }
        while (c2562qX.a() > 0) {
            int i2 = this.d;
            C2562qX c2562qX2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iU2 = c2562qX.u();
                    c2562qX.F(c2562qX.b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(c2562qX.a(), 3 - this.d);
                c2562qX.e(c2562qX2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    c2562qX2.F(0);
                    c2562qX2.E(3);
                    c2562qX2.G(1);
                    int iU3 = c2562qX2.u();
                    int iU4 = c2562qX2.u();
                    this.e = (iU3 & 128) != 0;
                    int i4 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.c = i4;
                    byte[] bArr = c2562qX2.a;
                    if (bArr.length < i4) {
                        c2562qX2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c2562qX.a(), this.c - this.d);
                c2562qX.e(c2562qX2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        c2562qX2.E(i6);
                    } else {
                        if (Lr0.m(0, i6, -1, c2562qX2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        c2562qX2.E(this.c - 4);
                    }
                    c2562qX2.F(0);
                    this.a.b(c2562qX2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // o.Zm0
    public final void c(Oj0 oj0, InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        this.a.c(oj0, interfaceC0354Cs, ym0);
        this.f = true;
    }
}
