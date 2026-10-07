package o;

/* JADX INFO: renamed from: o.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2958ud {
    public final InterfaceC1324dm0 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public C2958ud(int i, int i2, long j, int i3, InterfaceC1324dm0 interfaceC1324dm0) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        AbstractC0397Ej.c(z);
        this.d = j;
        this.e = i3;
        this.a = interfaceC1324dm0;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final C2858tb0 a(int i) {
        return new C2858tb0(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i]), this.k[i]);
    }

    public final C2568qb0 b(long j) {
        int i = (int) (j / ((this.d * ((long) 1)) / ((long) this.e)));
        int iE = Lr0.e(this.l, i, true, true);
        if (this.l[iE] == i) {
            C2858tb0 c2858tb0A = a(iE);
            return new C2568qb0(c2858tb0A, c2858tb0A);
        }
        C2858tb0 c2858tb0A2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.k.length ? new C2568qb0(c2858tb0A2, a(i2)) : new C2568qb0(c2858tb0A2, c2858tb0A2);
    }
}
