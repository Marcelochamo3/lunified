package o;

/* JADX INFO: renamed from: o.o80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2342o80 extends AbstractC2245n80 implements InterfaceC1056az {
    public final int l;

    public AbstractC2342o80(InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.l = 2;
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
