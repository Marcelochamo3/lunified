package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Em0 extends Dm0 {
    public final /* synthetic */ S5 a;
    public final /* synthetic */ Fm0 b;

    public Em0(Fm0 fm0, S5 s5) {
        this.b = fm0;
        this.a = s5;
    }

    @Override // o.Dm0, o.Bm0
    public final void f(Cm0 cm0) {
        ((ArrayList) this.a.get(this.b.m)).remove(cm0);
        cm0.E(this);
    }
}
