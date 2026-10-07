package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1732hv implements Rb0 {
    public final Rb0 a;
    public final boolean b;
    public final InterfaceC0412Ey c;

    public C1732hv(Rb0 rb0, boolean z, InterfaceC0412Ey interfaceC0412Ey) {
        this.a = rb0;
        this.b = z;
        this.c = interfaceC0412Ey;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        return new C1634gv(this);
    }
}
