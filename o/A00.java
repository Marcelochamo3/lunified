package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class A00 extends R00 {
    public static B00 a() {
        Object next;
        Iterator it = B00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((B00) next).a());
        B00 b00 = (B00) next;
        return b00 == null ? B00.d : b00;
    }
}
