package o;

/* JADX INFO: renamed from: o.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1918jr extends AbstractC1217ci {
    public static final /* synthetic */ int q = 0;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f853o;
    public M5 p;

    public final void Z(boolean z) {
        long j = this.n - (z ? 4294967296L : 1L);
        this.n = j;
        if (j <= 0 && this.f853o) {
            shutdown();
        }
    }

    public final void a0(AbstractC1716hn abstractC1716hn) {
        M5 m5 = this.p;
        if (m5 == null) {
            m5 = new M5();
            this.p = m5;
        }
        m5.f(abstractC1716hn);
    }

    public abstract Thread b0();

    public final void c0(boolean z) {
        this.n = (z ? 4294967296L : 1L) + this.n;
        if (z) {
            return;
        }
        this.f853o = true;
    }

    public final boolean d0() {
        return this.n >= 4294967296L;
    }

    public abstract long e0();

    public final boolean f0() {
        M5 m5 = this.p;
        if (m5 == null) {
            return false;
        }
        AbstractC1716hn abstractC1716hn = (AbstractC1716hn) (m5.isEmpty() ? null : m5.l());
        if (abstractC1716hn == null) {
            return false;
        }
        abstractC1716hn.run();
        return true;
    }

    public void g0(long j, AbstractRunnableC1626gr abstractRunnableC1626gr) {
        RunnableC0502Ik.u.k0(j, abstractRunnableC1626gr);
    }

    public abstract void shutdown();
}
