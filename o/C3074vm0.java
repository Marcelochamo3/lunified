package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.vm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3074vm0 implements Rb0 {
    public final Rb0 a;
    public final InterfaceC0412Ey b;

    public C3074vm0(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(rb0, "sequence");
        this.a = rb0;
        this.b = interfaceC0412Ey;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        return new C2977um0(this);
    }
}
