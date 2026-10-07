package o;

/* JADX INFO: renamed from: o.bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143bt0 extends AbstractC1074b8 {
    public final C2562qX b;
    public final C2562qX c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public C1143bt0(InterfaceC1324dm0 interfaceC1324dm0) {
        super(interfaceC1324dm0);
        this.b = new C2562qX(Ou0.b);
        this.c = new C2562qX(4);
    }

    public final boolean r(C2562qX c2562qX) throws C2775si0 {
        int iU = c2562qX.u();
        int i = (iU >> 4) & 15;
        int i2 = iU & 15;
        if (i2 != 7) {
            throw new C2775si0(AbstractC1674hK.n(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    public final boolean s(long j, C2562qX c2562qX) throws C2949uX {
        int iU = c2562qX.u();
        byte[] bArr = c2562qX.a;
        int i = c2562qX.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        c2562qX.b = i + 3;
        long j2 = (((long) ((bArr[i + 2] & 255) | i2)) * 1000) + j;
        InterfaceC1324dm0 interfaceC1324dm0 = (InterfaceC1324dm0) this.a;
        if (iU == 0 && !this.e) {
            byte[] bArr2 = new byte[c2562qX.a()];
            C2562qX c2562qX2 = new C2562qX(bArr2);
            c2562qX.e(bArr2, 0, c2562qX.a());
            C2920u7 c2920u7A = C2920u7.a(c2562qX2);
            this.d = c2920u7A.b;
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = "video/avc";
            c0617Mw.h = c2920u7A.i;
            c0617Mw.p = c2920u7A.c;
            c0617Mw.q = c2920u7A.d;
            c0617Mw.t = c2920u7A.h;
            c0617Mw.m = c2920u7A.a;
            interfaceC1324dm0.a(new C0643Nw(c0617Mw));
            this.e = true;
            return false;
        }
        if (iU != 1 || !this.e) {
            return false;
        }
        int i3 = this.g == 1 ? 1 : 0;
        if (!this.f && i3 == 0) {
            return false;
        }
        C2562qX c2562qX3 = this.c;
        byte[] bArr3 = c2562qX3.a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i4 = 4 - this.d;
        int i5 = 0;
        while (c2562qX.a() > 0) {
            c2562qX.e(c2562qX3.a, i4, this.d);
            c2562qX3.F(0);
            int iX = c2562qX3.x();
            C2562qX c2562qX4 = this.b;
            c2562qX4.F(0);
            interfaceC1324dm0.e(4, c2562qX4);
            interfaceC1324dm0.e(iX, c2562qX);
            i5 = i5 + 4 + iX;
        }
        ((InterfaceC1324dm0) this.a).d(j2, i3, i5, 0, null);
        this.f = true;
        return true;
    }
}
