package o;

/* JADX INFO: loaded from: classes.dex */
public final class WJ implements ZJ, InterfaceC1608gi {
    public final C1478fK l;
    public final InterfaceC1022ai m;

    public WJ(C1478fK c1478fK, InterfaceC1022ai interfaceC1022ai) {
        AH ah;
        AbstractC1474fG.j(interfaceC1022ai, "coroutineContext");
        this.l = c1478fK;
        this.m = interfaceC1022ai;
        if (c1478fK.d != TJ.l || (ah = (AH) interfaceC1022ai.q(C2691rp.v)) == null) {
            return;
        }
        ah.f(null);
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        C1478fK c1478fK = this.l;
        if (c1478fK.d.compareTo(TJ.l) <= 0) {
            c1478fK.f(this);
            AH ah = (AH) this.m.q(C2691rp.v);
            if (ah != null) {
                ah.f(null);
            }
        }
    }

    @Override // o.InterfaceC1608gi
    public final InterfaceC1022ai t() {
        return this.m;
    }
}
