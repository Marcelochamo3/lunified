package o;

/* JADX INFO: renamed from: o.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1295dW implements InterfaceC1496fb {
    public final WV l;
    public final /* synthetic */ C1490fW m;

    public C1295dW(C1490fW c1490fW, WV wv) {
        this.m = c1490fW;
        this.l = wv;
    }

    @Override // o.InterfaceC1496fb
    public final void cancel() {
        C1490fW c1490fW = this.m;
        M5 m5 = c1490fW.b;
        WV wv = this.l;
        m5.remove(wv);
        if (AbstractC1474fG.b(c1490fW.c, wv)) {
            wv.a();
            c1490fW.c = null;
        }
        wv.getClass();
        wv.b.remove(this);
        InterfaceC0360Cy interfaceC0360Cy = wv.c;
        if (interfaceC0360Cy != null) {
            interfaceC0360Cy.c();
        }
        wv.c = null;
    }
}
