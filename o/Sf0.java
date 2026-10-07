package o;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class Sf0 {
    public static final boolean a;
    public static final Rf0 b;
    public static final Rf0 c;
    public static final InterfaceC3274xp0 d;
    public static final InterfaceC3274xp0 e;
    public static final InterfaceC3274xp0 f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new Rf0(0, Date.class);
            c = new Rf0(1, Timestamp.class);
            d = Nf0.c;
            e = Nf0.d;
            f = Qf0.c;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
