package o;

/* JADX INFO: renamed from: o.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0890Xj implements QK {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ C1045at0 m;

    public /* synthetic */ C0890Xj(C3201x2 c3201x2, C1045at0 c1045at0) {
        this.m = c1045at0;
    }

    @Override // o.QK
    public final void b(Object obj) {
        switch (this.l) {
            case 0:
                C2747sP c2747sP = (C2747sP) obj;
                C2613qy c2613qy = c2747sP.f1025o;
                C1045at0 c1045at0 = this.m;
                if (c2613qy != null) {
                    C0643Nw c0643Nw = (C0643Nw) c2613qy.n;
                    if (c0643Nw.C == -1) {
                        C0617Mw c0617MwA = c0643Nw.a();
                        c0617MwA.p = c1045at0.l;
                        c0617MwA.q = c1045at0.m;
                        c2747sP.f1025o = new C2613qy(new C0643Nw(c0617MwA), c2613qy.m, (String) c2613qy.f996o, 7);
                    }
                }
                int i = c1045at0.l;
                break;
            default:
                ((InterfaceC2176mZ) obj).d(this.m);
                break;
        }
    }

    public /* synthetic */ C0890Xj(C1045at0 c1045at0) {
        this.m = c1045at0;
    }
}
