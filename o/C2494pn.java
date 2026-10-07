package o;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2494pn extends F {
    public final Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0412Ey f978o;
    public final HashSet p;

    public C2494pn(Iterator it, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(it, "source");
        AbstractC1474fG.j(interfaceC0412Ey, "keySelector");
        this.n = it;
        this.f978o = interfaceC0412Ey;
        this.p = new HashSet();
    }

    @Override // o.F
    public final void a() {
        Object next;
        do {
            Iterator it = this.n;
            if (!it.hasNext()) {
                this.l = EnumC2481pg0.n;
                return;
            } else {
                next = it.next();
            }
        } while (!this.p.add(this.f978o.b(next)));
        this.m = next;
        this.l = EnumC2481pg0.l;
    }
}
