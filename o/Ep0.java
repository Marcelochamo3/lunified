package o;

/* JADX INFO: loaded from: classes.dex */
final class Ep0 implements InterfaceC3274xp0 {
    public final /* synthetic */ Class l;
    public final /* synthetic */ AbstractC3177wp0 m;

    public Ep0(Class cls, AbstractC3177wp0 abstractC3177wp0) {
        this.l = cls;
        this.m = abstractC3177wp0;
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Class<?> cls = kp0.a;
        if (this.l.isAssignableFrom(cls)) {
            return new W5(this, cls);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.l.getName() + ",adapter=" + this.m + "]";
    }
}
