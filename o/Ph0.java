package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ph0 extends AbstractC0499Ih implements InterfaceC1056az {
    public final int l;

    public Ph0(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.l = i;
    }

    @Override // o.InterfaceC1056az
    public final int e() {
        return this.l;
    }

    @Override // o.R7
    public final String toString() {
        if (p() != null) {
            return super.toString();
        }
        AbstractC2822t60.a.getClass();
        String strA = C3210x60.a(this);
        AbstractC1474fG.i(strA, "renderLambdaToString(...)");
        return strA;
    }
}
