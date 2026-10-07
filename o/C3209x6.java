package o;

/* JADX INFO: renamed from: o.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3209x6 implements IV {
    public long l;
    public long m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1112o;

    public C3209x6(int i, long j) {
        AbstractC0397Ej.f(((C2813t2) this.n) == null);
        this.l = j;
        this.m = j + ((long) i);
    }

    @Override // o.IV
    public InterfaceC2664rb0 d() {
        AbstractC0397Ej.f(this.l != -1);
        return new C3114w7((C3091vv) this.n, this.l, 1);
    }

    @Override // o.IV
    public long e(C0554Kk c0554Kk) {
        long j = this.m;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.m = -1L;
        return j2;
    }

    @Override // o.IV
    public void k(long j) {
        long[] jArr = (long[]) ((C2994uv) this.f1112o).m;
        this.m = jArr[Lr0.f(jArr, j, true)];
    }

    public C3209x6(String str, byte[] bArr, long j, long j2) {
        this.n = str;
        this.f1112o = bArr;
        this.l = j;
        this.m = j2;
    }
}
