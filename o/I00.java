package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class I00 extends R00 {
    public static J00 a() {
        Object next;
        Iterator it = J00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((J00) next).a());
        J00 j00 = (J00) next;
        return j00 == null ? J00.d : j00;
    }
}
