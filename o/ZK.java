package o;

/* JADX INFO: loaded from: classes.dex */
public final class ZK {
    public final int a;
    public final long b;

    public /* synthetic */ ZK(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
    }

    public static ZK b(C0554Kk c0554Kk, C2562qX c2562qX) {
        c0554Kk.x(c2562qX.a, 0, 8, false);
        c2562qX.F(0);
        return new ZK(c2562qX.g(), c2562qX.l(), false);
    }

    public boolean a() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public ZK(int i, long j) {
        AbstractC0397Ej.c(j >= 0);
        this.a = i;
        this.b = j;
    }
}
