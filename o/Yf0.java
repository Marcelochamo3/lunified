package o;

/* JADX INFO: loaded from: classes.dex */
public final class Yf0 implements InterfaceC0473Hh, InterfaceC1803ii {
    public final InterfaceC0473Hh l;
    public final InterfaceC1022ai m;

    public Yf0(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1022ai interfaceC1022ai) {
        this.l = interfaceC0473Hh;
        this.m = interfaceC1022ai;
    }

    @Override // o.InterfaceC1803ii
    public final InterfaceC1803ii d() {
        InterfaceC0473Hh interfaceC0473Hh = this.l;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return this.m;
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        this.l.j(obj);
    }
}
