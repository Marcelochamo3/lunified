package o;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: o.eX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393eX extends Pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Pu0 g;

    public /* synthetic */ C1393eX(Pu0 pu0, int i) {
        this.f = i;
        this.g = pu0;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        switch (this.f) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.g.a(c2534q70, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.g.a(c2534q70, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
