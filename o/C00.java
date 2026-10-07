package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C00 extends R00 {
    public static D00 a() {
        Object next;
        Iterator it = D00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((D00) next).a());
        D00 d00 = (D00) next;
        return d00 == null ? D00.d : d00;
    }
}
