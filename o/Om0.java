package o;

/* JADX INFO: loaded from: classes.dex */
final class Om0 implements InterfaceC3274xp0 {
    public final Kp0 l;
    public final boolean m;
    public final Class n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PH f442o;

    public Om0(PH ph, Kp0 kp0, boolean z) {
        this.f442o = ph;
        this.l = kp0;
        this.m = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        boolean zIsAssignableFrom;
        Kp0 kp1 = this.l;
        if (kp1 == null) {
            zIsAssignableFrom = this.n.isAssignableFrom(kp0.a);
        } else if (kp1.equals(kp0)) {
            zIsAssignableFrom = true;
        } else {
            if (this.m) {
                if (kp1.b == kp0.a) {
                    zIsAssignableFrom = true;
                }
            }
            zIsAssignableFrom = false;
        }
        if (zIsAssignableFrom) {
            return new Pm0(this.f442o, ba, kp0, this, true);
        }
        return null;
    }
}
