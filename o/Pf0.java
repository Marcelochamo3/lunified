package o;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
final class Pf0 implements InterfaceC3274xp0 {
    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        if (kp0.a != Timestamp.class) {
            return null;
        }
        ba.getClass();
        return new Qf0(ba.e(new Kp0(Date.class)), 0);
    }
}
