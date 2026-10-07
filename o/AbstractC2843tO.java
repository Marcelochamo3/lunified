package o;

/* JADX INFO: renamed from: o.tO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2843tO extends AbstractC2764sd {
    public final long u;

    public AbstractC2843tO(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, C0643Nw c0643Nw, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC2583qj, c2970uj, 1, c0643Nw, i, obj, j, j2);
        c0643Nw.getClass();
        this.u = j3;
    }

    public long a() {
        long j = this.u;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean c();
}
