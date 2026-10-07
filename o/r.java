package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements InterfaceC0914Yh {
    public final InterfaceC0940Zh l;

    public r(InterfaceC0940Zh interfaceC0940Zh) {
        this.l = interfaceC0940Zh;
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai Q(InterfaceC1022ai interfaceC1022ai) {
        return Sr0.z(this, interfaceC1022ai);
    }

    @Override // o.InterfaceC0914Yh
    public final InterfaceC0940Zh getKey() {
        return this.l;
    }

    @Override // o.InterfaceC1022ai
    public final Object l(Object obj, InterfaceC0775Sy interfaceC0775Sy) {
        return interfaceC0775Sy.i(obj, this);
    }

    @Override // o.InterfaceC1022ai
    public InterfaceC1022ai p(InterfaceC0940Zh interfaceC0940Zh) {
        return Sr0.t(this, interfaceC0940Zh);
    }

    @Override // o.InterfaceC1022ai
    public InterfaceC0914Yh q(InterfaceC0940Zh interfaceC0940Zh) {
        return Sr0.j(this, interfaceC0940Zh);
    }
}
