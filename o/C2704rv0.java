package o;

/* JADX INFO: renamed from: o.rv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2704rv0 implements InterfaceC2608qv0 {
    public final InterfaceC0354Cs a;
    public final InterfaceC1324dm0 b;
    public final A6 c;
    public final C0643Nw d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public C2704rv0(InterfaceC0354Cs interfaceC0354Cs, InterfaceC1324dm0 interfaceC1324dm0, A6 a6, String str, int i) throws C2949uX {
        this.a = interfaceC0354Cs;
        this.b = interfaceC1324dm0;
        this.c = a6;
        int i2 = a6.f163o;
        int i3 = a6.l;
        int i4 = (i2 * i3) / 8;
        int i5 = a6.n;
        if (i5 != i4) {
            throw C2949uX.a("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = a6.m;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.e = iMax;
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = str;
        c0617Mw.f = i8;
        c0617Mw.g = i8;
        c0617Mw.l = iMax;
        c0617Mw.x = i3;
        c0617Mw.y = i6;
        c0617Mw.z = i;
        this.d = new C0643Nw(c0617Mw);
    }

    @Override // o.InterfaceC2608qv0
    public final void a(int i, long j) {
        this.a.i(new C2898tv0(this.c, 1, i, j));
        this.b.a(this.d);
    }

    @Override // o.InterfaceC2608qv0
    public final boolean b(C0554Kk c0554Kk, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iB = this.b.b(c0554Kk, (int) Math.min(i2 - i, j2), true);
            if (iB == -1) {
                j2 = 0;
            } else {
                this.g += iB;
                j2 -= (long) iB;
            }
        }
        A6 a6 = this.c;
        int i3 = a6.n;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long jR = this.f + Lr0.R(this.h, 1000000L, a6.m);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.d(jR, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // o.InterfaceC2608qv0
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
