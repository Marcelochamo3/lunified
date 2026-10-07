package o;

/* JADX INFO: renamed from: o.Sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0762Sl implements Comparable {
    public final boolean l;
    public final boolean m;

    public C0762Sl(C0643Nw c0643Nw, int i) {
        this.l = (c0643Nw.f421o & 1) != 0;
        this.m = C1128bm.i(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0762Sl c0762Sl = (C0762Sl) obj;
        return AbstractC0393Ef.a.c(this.m, c0762Sl.m).c(this.l, c0762Sl.l).e();
    }
}
