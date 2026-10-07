package o;

/* JADX INFO: renamed from: o.xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3260xi0 extends AbstractRunnableC3163wi0 {
    public final Runnable n;

    public C3260xi0(Runnable runnable, long j, C2102ll c2102ll) {
        super(j, c2102ll);
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } finally {
            this.m.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.n;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0397Ej.r(runnable));
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(']');
        return sb.toString();
    }
}
