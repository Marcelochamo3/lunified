package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class L00 extends R00 {
    public static M00 a() {
        Object next;
        Iterator it = M00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((M00) next).a());
        M00 m00 = (M00) next;
        return m00 == null ? M00.d : m00;
    }
}
