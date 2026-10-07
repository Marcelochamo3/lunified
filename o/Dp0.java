package o;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class Dp0 implements InterfaceC3274xp0 {
    public final /* synthetic */ Class l = Calendar.class;
    public final /* synthetic */ Class m = GregorianCalendar.class;
    public final /* synthetic */ AbstractC3177wp0 n;

    public Dp0(C3411zA c3411zA) {
        this.n = c3411zA;
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
        return "Factory[type=" + this.l.getName() + "+" + this.m.getName() + ",adapter=" + this.n + "]";
    }
}
