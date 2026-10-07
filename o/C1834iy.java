package o;

/* JADX INFO: renamed from: o.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1834iy {
    public final InterfaceC1324dm0 a;
    public C1421em0 d;
    public C3265xl e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final Yl0 b = new Yl0();
    public final C2562qX c = new C2562qX();
    public final C2562qX j = new C2562qX(1);
    public final C2562qX k = new C2562qX();

    public C1834iy(InterfaceC1324dm0 interfaceC1324dm0, C1421em0 c1421em0, C3265xl c3265xl) {
        this.a = interfaceC1324dm0;
        this.d = c1421em0;
        this.e = c3265xl;
        this.d = c1421em0;
        this.e = c3265xl;
        interfaceC1324dm0.a(c1421em0.a.f);
        d();
    }

    public final Xl0 a() {
        if (!this.l) {
            return null;
        }
        Yl0 yl0 = this.b;
        C3265xl c3265xl = yl0.a;
        int i = Lr0.a;
        int i2 = c3265xl.a;
        Xl0 xl0 = yl0.m;
        if (xl0 == null) {
            Xl0[] xl0Arr = this.d.a.k;
            xl0 = xl0Arr == null ? null : xl0Arr[i2];
        }
        if (xl0 == null || !xl0.a) {
            return null;
        }
        return xl0;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        C2562qX c2562qX;
        Xl0 xl0A = a();
        if (xl0A == null) {
            return 0;
        }
        Yl0 yl0 = this.b;
        int length = xl0A.d;
        if (length != 0) {
            c2562qX = yl0.n;
        } else {
            int i3 = Lr0.a;
            byte[] bArr = xl0A.e;
            int length2 = bArr.length;
            C2562qX c2562qX2 = this.k;
            c2562qX2.D(length2, bArr);
            length = bArr.length;
            c2562qX = c2562qX2;
        }
        boolean z = yl0.k && yl0.l[this.f];
        boolean z2 = z || i2 != 0;
        C2562qX c2562qX3 = this.j;
        c2562qX3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        c2562qX3.F(0);
        InterfaceC1324dm0 interfaceC1324dm0 = this.a;
        interfaceC1324dm0.c(1, c2562qX3);
        interfaceC1324dm0.c(length, c2562qX);
        if (!z2) {
            return length + 1;
        }
        C2562qX c2562qX4 = this.c;
        if (!z) {
            c2562qX4.C(8);
            byte[] bArr2 = c2562qX4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC1324dm0.c(8, c2562qX4);
            return length + 9;
        }
        C2562qX c2562qX5 = yl0.n;
        int iZ = c2562qX5.z();
        c2562qX5.G(-2);
        int i4 = (iZ * 6) + 2;
        if (i2 != 0) {
            c2562qX4.C(i4);
            byte[] bArr3 = c2562qX4.a;
            c2562qX5.e(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            c2562qX4 = c2562qX5;
        }
        interfaceC1324dm0.c(i4, c2562qX4);
        return length + 1 + i4;
    }

    public final void d() {
        Yl0 yl0 = this.b;
        yl0.d = 0;
        yl0.p = 0L;
        yl0.q = false;
        yl0.k = false;
        yl0.f641o = false;
        yl0.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
