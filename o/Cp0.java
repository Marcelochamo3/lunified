package o;

/* JADX INFO: loaded from: classes.dex */
final class Cp0 implements InterfaceC3274xp0 {
    public final /* synthetic */ Class l;
    public final /* synthetic */ Class m;
    public final /* synthetic */ AbstractC3177wp0 n;

    public Cp0(Class cls, Class cls2, AbstractC3177wp0 abstractC3177wp0) {
        this.l = cls;
        this.m = cls2;
        this.n = abstractC3177wp0;
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Class cls = kp0.a;
        if (cls == this.l || cls == this.m) {
            return this.n;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.m.getName() + "+" + this.l.getName() + ",adapter=" + this.n + "]";
    }
}
