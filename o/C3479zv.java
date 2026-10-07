package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3479zv implements Rb0 {
    public final Rb0 a;
    public final InterfaceC0412Ey b;
    public final InterfaceC0412Ey c;

    public C3479zv(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey, InterfaceC0412Ey interfaceC0412Ey2) {
        AbstractC1474fG.j(rb0, "sequence");
        AbstractC1474fG.j(interfaceC0412Ey, "transformer");
        this.a = rb0;
        this.b = interfaceC0412Ey;
        this.c = interfaceC0412Ey2;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        return new C3382yv(this);
    }
}
