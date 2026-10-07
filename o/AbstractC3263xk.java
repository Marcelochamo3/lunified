package o;

import java.util.Date;

/* JADX INFO: renamed from: o.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3263xk {
    public static final C3166wk b = new C3166wk(Date.class);
    public final Class a;

    public AbstractC3263xk(Class cls) {
        this.a = cls;
    }

    public final InterfaceC3274xp0 a(int i, int i2) {
        W5 w5 = new W5(this, i, i2);
        InterfaceC3274xp0 interfaceC3274xp0 = Hp0.a;
        return new Bp0(this.a, w5);
    }

    public abstract Date b(Date date);
}
