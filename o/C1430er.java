package o;

/* JADX INFO: renamed from: o.er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1430er extends AbstractRunnableC1626gr {
    public final InterfaceC1594gb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1821ir f763o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430er(AbstractC1821ir abstractC1821ir, long j, C1692hb c1692hb) {
        super(j);
        this.f763o = abstractC1821ir;
        this.n = c1692hb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.m(this.f763o);
    }

    @Override // o.AbstractRunnableC1626gr
    public final String toString() {
        return super.toString() + this.n;
    }
}
