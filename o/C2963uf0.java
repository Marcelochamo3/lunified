package o;

/* JADX INFO: renamed from: o.uf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2963uf0 extends VF {
    public int l;
    public final /* synthetic */ C2866tf0 m;

    public C2963uf0(C2866tf0 c2866tf0) {
        this.m = c2866tf0;
    }

    @Override // o.VF
    public final int a() {
        int i = this.l;
        this.l = i + 1;
        return this.m.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l < this.m.h();
    }
}
