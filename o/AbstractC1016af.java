package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1016af extends AbstractC0937Ze {
    public static int O(Iterable iterable, int i) {
        AbstractC1474fG.j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList P(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
