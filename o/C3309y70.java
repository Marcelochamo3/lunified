package o;

/* JADX INFO: renamed from: o.y70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3309y70 implements InterfaceC2964ug {
    public final C1797ie0 a;
    public final /* synthetic */ ComponentCallbacks2C3406z70 b;

    public C3309y70(ComponentCallbacks2C3406z70 componentCallbacks2C3406z70, C1797ie0 c1797ie0) {
        this.b = componentCallbacks2C3406z70;
        this.a = c1797ie0;
    }

    @Override // o.InterfaceC2964ug
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                this.a.j();
            }
        }
    }
}
