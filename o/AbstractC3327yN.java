package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3327yN extends Pu0 {
    public static Map A(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C1330dq c1330dq = C1330dq.l;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            if (size != 0) {
                return size != 1 ? linkedHashMap : E(linkedHashMap);
            }
            return c1330dq;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c1330dq;
        }
        if (size2 == 1) {
            return y((C1101bX) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x(collection.size()));
        C(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map B(Map map) {
        AbstractC1474fG.j(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? D(map) : E(map);
        }
        return C1330dq.l;
    }

    public static void C(Iterable iterable, LinkedHashMap linkedHashMap) {
        AbstractC1474fG.j(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1101bX c1101bX = (C1101bX) it.next();
            linkedHashMap.put(c1101bX.l, c1101bX.m);
        }
    }

    public static LinkedHashMap D(Map map) {
        AbstractC1474fG.j(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map E(Map map) {
        AbstractC1474fG.j(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC1474fG.i(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static Object w(String str, Map map) {
        AbstractC1474fG.j(map, "<this>");
        Object obj = map.get(str);
        if (obj != null || map.containsKey(str)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + ((Object) str) + " is missing in the map.");
    }

    public static int x(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map y(C1101bX c1101bX) {
        AbstractC1474fG.j(c1101bX, "pair");
        Map mapSingletonMap = Collections.singletonMap(c1101bX.l, c1101bX.m);
        AbstractC1474fG.i(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map z(C1101bX... c1101bXArr) {
        if (c1101bXArr.length <= 0) {
            return C1330dq.l;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x(c1101bXArr.length));
        for (C1101bX c1101bX : c1101bXArr) {
            linkedHashMap.put(c1101bX.l, c1101bX.m);
        }
        return linkedHashMap;
    }
}
