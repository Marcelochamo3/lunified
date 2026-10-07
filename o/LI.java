package o;

/* JADX INFO: loaded from: classes.dex */
public final class LI implements InterfaceC0777Ta {
    public final /* synthetic */ int l;
    public final /* synthetic */ InterfaceC1594gb m;

    public /* synthetic */ LI(C1692hb c1692hb, int i) {
        this.l = i;
        this.m = c1692hb;
    }

    @Override // o.InterfaceC0777Ta
    public final void E(InterfaceC0621Na interfaceC0621Na, C1759i80 c1759i80) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(c1759i80, "response");
                boolean zP = c1759i80.a.p();
                InterfaceC1594gb interfaceC1594gb = this.m;
                if (!zP) {
                    interfaceC1594gb.j(Jp0.k(new C1668hE(c1759i80)));
                } else {
                    Object obj = c1759i80.b;
                    if (obj != null) {
                        interfaceC1594gb.j(obj);
                    } else {
                        Object objCast = C2448pG.class.cast(interfaceC0621Na.i().e.get(C2448pG.class));
                        AbstractC1474fG.g(objCast);
                        C2448pG c2448pG = (C2448pG) objCast;
                        interfaceC1594gb.j(Jp0.k(new NI("Response from " + c2448pG.a.getName() + '.' + c2448pG.c.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            case 1:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(c1759i80, "response");
                boolean zP2 = c1759i80.a.p();
                InterfaceC1594gb interfaceC1594gb2 = this.m;
                if (!zP2) {
                    interfaceC1594gb2.j(Jp0.k(new C1668hE(c1759i80)));
                } else {
                    interfaceC1594gb2.j(c1759i80.b);
                }
                break;
            default:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(c1759i80, "response");
                this.m.j(c1759i80);
                break;
        }
    }

    @Override // o.InterfaceC0777Ta
    public final void w(InterfaceC0621Na interfaceC0621Na, Throwable th) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(th, "t");
                this.m.j(Jp0.k(th));
                break;
            case 1:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(th, "t");
                this.m.j(Jp0.k(th));
                break;
            default:
                AbstractC1474fG.j(interfaceC0621Na, "call");
                AbstractC1474fG.j(th, "t");
                this.m.j(Jp0.k(th));
                break;
        }
    }
}
