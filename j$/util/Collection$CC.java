package j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Collection$CC {
    public static boolean a(Collection collection, Predicate predicate) {
        if (DesugarCollections.a.isInstance(collection)) {
            return DesugarCollections.c(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
