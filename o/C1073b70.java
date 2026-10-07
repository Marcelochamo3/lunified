package o;

/* JADX INFO: renamed from: o.b70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1073b70 implements ZJ {
    public final /* synthetic */ SJ l;
    public final /* synthetic */ IF m;
    public final /* synthetic */ InterfaceC1608gi n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SJ f689o;
    public final /* synthetic */ InterfaceC1594gb p;
    public final /* synthetic */ VS q;
    public final /* synthetic */ InterfaceC0775Sy r;

    public C1073b70(SJ sj, IF r2, InterfaceC1608gi interfaceC1608gi, SJ sj2, C1692hb c1692hb, YS ys, InterfaceC0775Sy interfaceC0775Sy) {
        this.l = sj;
        this.m = r2;
        this.n = interfaceC1608gi;
        this.f689o = sj2;
        this.p = c1692hb;
        this.q = ys;
        this.r = interfaceC0775Sy;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        SJ sj2 = this.l;
        IF r0 = this.m;
        if (sj == sj2) {
            r0.m = AbstractC1376eG.w(this.n, null, 0, new C0975a70(this.q, this.r, null), 3);
            return;
        }
        if (sj == this.f689o) {
            AH ah = (AH) r0.m;
            if (ah != null) {
                ah.f(null);
            }
            r0.m = null;
        }
        if (sj == SJ.ON_DESTROY) {
            this.p.j(C2985uq0.a);
        }
    }
}
