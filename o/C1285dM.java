package o;

/* JADX INFO: renamed from: o.dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1285dM extends C1090bM {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1285dM f736o = new C1285dM(1, 0);

    public C1285dM(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // o.C1090bM
    public final boolean equals(Object obj) {
        if (obj instanceof C1285dM) {
            if (!isEmpty() || !((C1285dM) obj).isEmpty()) {
                C1285dM c1285dM = (C1285dM) obj;
                if (this.l == c1285dM.l) {
                    if (this.m == c1285dM.m) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C1090bM
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.l;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.m;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // o.C1090bM
    public final boolean isEmpty() {
        return this.l > this.m;
    }

    @Override // o.C1090bM
    public final String toString() {
        return this.l + ".." + this.m;
    }
}
