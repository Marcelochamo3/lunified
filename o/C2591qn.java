package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2591qn implements Rb0 {
    public final /* synthetic */ int a;
    public final Rb0 b;
    public final InterfaceC0412Ey c;

    public /* synthetic */ C2591qn(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey, int i) {
        this.a = i;
        this.b = rb0;
        this.c = interfaceC0412Ey;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C2494pn(this.b.iterator(), this.c);
            default:
                return new C1634gv(this);
        }
    }
}
