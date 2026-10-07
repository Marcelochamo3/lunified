package o;

/* JADX INFO: loaded from: classes.dex */
public final class FH extends C1692hb {
    public final JH t;

    public FH(InterfaceC0473Hh interfaceC0473Hh, JH jh) {
        super(1, interfaceC0473Hh);
        this.t = jh;
    }

    @Override // o.C1692hb
    public final String E() {
        return "AwaitContinuation";
    }

    @Override // o.C1692hb
    public final Throwable w(JH jh) {
        Throwable thC;
        Object objO = this.t.O();
        if (!(objO instanceof HH) || (thC = ((HH) objO).c()) == null) {
            return objO instanceof C0678Pf ? ((C0678Pf) objO).a : jh.H();
        }
        return thC;
    }
}
