package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lc0 extends AbstractC1370eA {
    public static LinkedHashSet S(Set set, Object obj) {
        AbstractC1474fG.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3327yN.x(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set T(Object... objArr) {
        int length;
        int length2 = objArr.length;
        C1722hq c1722hq = C1722hq.l;
        if (length2 <= 0 || (length = objArr.length) == 0) {
            return c1722hq;
        }
        if (length == 1) {
            return AbstractC1370eA.O(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3327yN.x(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
