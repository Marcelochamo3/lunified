package o;

/* JADX INFO: loaded from: classes.dex */
final class Ap0 implements InterfaceC3274xp0 {
    public final /* synthetic */ Kp0 l;
    public final /* synthetic */ AbstractC3177wp0 m;

    public Ap0(Kp0 kp0, AbstractC3177wp0 abstractC3177wp0) {
        this.l = kp0;
        this.m = abstractC3177wp0;
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        if (kp0.equals(this.l)) {
            return this.m;
        }
        return null;
    }
}
