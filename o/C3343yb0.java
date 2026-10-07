package o;

/* JADX INFO: renamed from: o.yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3343yb0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public C3343yb0 f;
    public C3343yb0 g;

    public C3343yb0() {
        this.a = new byte[C1672hI.a.e];
        this.e = true;
        this.d = false;
    }

    public final C3343yb0 a() {
        C3343yb0 c3343yb0 = this.f;
        if (c3343yb0 == this) {
            c3343yb0 = null;
        }
        C3343yb0 c3343yb1 = this.g;
        AbstractC1474fG.g(c3343yb1);
        c3343yb1.f = this.f;
        C3343yb0 c3343yb2 = this.f;
        AbstractC1474fG.g(c3343yb2);
        c3343yb2.g = this.g;
        this.f = null;
        this.g = null;
        return c3343yb0;
    }

    public final void b(C3343yb0 c3343yb0) {
        c3343yb0.g = this;
        c3343yb0.f = this.f;
        C3343yb0 c3343yb1 = this.f;
        AbstractC1474fG.g(c3343yb1);
        c3343yb1.g = c3343yb0;
        this.f = c3343yb0;
    }

    public final C3343yb0 c() {
        this.d = true;
        return new C3343yb0(this.a, this.b, this.c, true);
    }

    public final void d(C3343yb0 c3343yb0, int i) {
        if (!c3343yb0.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = c3343yb0.c;
        int i3 = i2 + i;
        byte[] bArr = c3343yb0.a;
        if (i3 > 8192) {
            if (c3343yb0.d) {
                throw new IllegalArgumentException();
            }
            int i4 = c3343yb0.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            X5.I(0, i4, i2, bArr, bArr);
            c3343yb0.c -= c3343yb0.b;
            c3343yb0.b = 0;
        }
        int i5 = c3343yb0.c;
        int i6 = this.b;
        X5.I(i5, i6, i6 + i, this.a, bArr);
        c3343yb0.c += i;
        this.b += i;
    }

    public C3343yb0(byte[] bArr, int i, int i2, boolean z) {
        AbstractC1474fG.j(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
