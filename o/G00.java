package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class G00 extends R00 {
    public static H00 a() {
        Object next;
        Iterator it = H00.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((H00) next).a());
        H00 h00 = (H00) next;
        return h00 == null ? H00.d : h00;
    }
}
