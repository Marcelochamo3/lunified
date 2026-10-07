package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class E00 extends R00 {
    public static F00 a() {
        Object next;
        F00 f00;
        Iterator it = F00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f00 = (F00) next;
            f00.getClass();
        } while (f00.b != AbstractC1459f50.s().d);
        F00 f01 = (F00) next;
        return f01 == null ? F00.d : f01;
    }
}
