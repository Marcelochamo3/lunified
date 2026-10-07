package o;

/* JADX INFO: renamed from: o.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2375oc extends C3258xh0 implements Comparable {
    public long v;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2375oc c2375oc = (C2375oc) obj;
        if (j(4) == c2375oc.j(4)) {
            long j = this.q - c2375oc.q;
            if (j == 0) {
                j = this.v - c2375oc.v;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!j(4)) {
            return -1;
        }
        return 1;
    }
}
