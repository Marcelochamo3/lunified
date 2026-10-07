package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NB extends AbstractC1366e8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f409o;
    public final long p;

    public NB(long j, List list) {
        super(0L, list.size() - 1);
        this.p = j;
        this.f409o = list;
    }

    @Override // o.InterfaceC2940uO
    public final long a() {
        b();
        AbstractC0982aC abstractC0982aC = (AbstractC0982aC) this.f409o.get((int) this.n);
        return this.p + abstractC0982aC.p + abstractC0982aC.n;
    }

    @Override // o.InterfaceC2940uO
    public final long d() {
        b();
        return this.p + ((AbstractC0982aC) this.f409o.get((int) this.n)).p;
    }
}
