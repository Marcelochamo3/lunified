package o;

/* JADX INFO: renamed from: o.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2865tf extends AbstractC2962uf {
    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        for (int i = 0; i < this.c; i++) {
            if (((AbstractC1332dr) this.b.get(i)).b(c3176wp, c3176wp2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC1021ah0.g(", ", this.a);
    }
}
