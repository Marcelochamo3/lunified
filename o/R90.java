package o;

/* JADX INFO: loaded from: classes.dex */
public class R90 extends AbstractC2518q implements InterfaceC1803ii {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0473Hh f482o;

    public R90(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1022ai interfaceC1022ai) {
        super(interfaceC1022ai, true);
        this.f482o = interfaceC0473Hh;
    }

    @Override // o.JH
    public final boolean V() {
        return true;
    }

    @Override // o.InterfaceC1803ii
    public final InterfaceC1803ii d() {
        InterfaceC0473Hh interfaceC0473Hh = this.f482o;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.JH
    public void w(Object obj) {
        Pu0.r(Ou0.p(this.f482o), AP.v(obj), null);
    }

    @Override // o.JH
    public void x(Object obj) {
        this.f482o.j(AP.v(obj));
    }
}
