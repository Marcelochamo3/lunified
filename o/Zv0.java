package o;

/* JADX INFO: loaded from: classes.dex */
public final class Zv0 implements Comparable {
    public final int l;
    public final Vv0 m;

    public Zv0(int i, Vv0 vv0) {
        this.l = i;
        this.m = vv0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.l, ((Zv0) obj).l);
    }
}
