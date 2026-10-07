package o;

/* JADX INFO: renamed from: o.fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1528fr extends AbstractRunnableC1626gr {
    public final Runnable n;

    public C1528fr(Runnable runnable, long j) {
        super(j);
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.run();
    }

    @Override // o.AbstractRunnableC1626gr
    public final String toString() {
        return super.toString() + this.n;
    }
}
