package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class N00 extends R00 {
    public static O00 a() {
        Object next;
        Iterator it = O00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((O00) next).a());
        O00 o00 = (O00) next;
        return o00 == null ? O00.d : o00;
    }
}
