package o;

/* JADX INFO: renamed from: o.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1197cW implements ZJ, InterfaceC1496fb {
    public final C1478fK l;
    public final WV m;
    public C1295dW n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1490fW f716o;

    public C1197cW(C1490fW c1490fW, C1478fK c1478fK, WV wv) {
        AbstractC1474fG.j(wv, "onBackPressedCallback");
        this.f716o = c1490fW;
        this.l = c1478fK;
        this.m = wv;
        c1478fK.a(this);
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        if (sj != SJ.ON_START) {
            if (sj != SJ.ON_STOP) {
                if (sj == SJ.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C1295dW c1295dW = this.n;
                if (c1295dW != null) {
                    c1295dW.cancel();
                    return;
                }
                return;
            }
        }
        C1490fW c1490fW = this.f716o;
        c1490fW.getClass();
        WV wv = this.m;
        AbstractC1474fG.j(wv, "onBackPressedCallback");
        c1490fW.b.f(wv);
        C1295dW c1295dW2 = new C1295dW(c1490fW, wv);
        wv.b.add(c1295dW2);
        c1490fW.d();
        wv.c = new C1392eW(0, c1490fW, C1490fW.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.n = c1295dW2;
    }

    @Override // o.InterfaceC1496fb
    public final void cancel() {
        this.l.f(this);
        WV wv = this.m;
        wv.getClass();
        wv.b.remove(this);
        C1295dW c1295dW = this.n;
        if (c1295dW != null) {
            c1295dW.cancel();
        }
        this.n = null;
    }
}
