package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class P00 extends R00 {
    public static Q00 a() {
        Object next;
        Iterator it = Q00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Q00) next).a());
        Q00 q00 = (Q00) next;
        return q00 == null ? Q00.d : q00;
    }
}
