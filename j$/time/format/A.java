package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class A {
    private final Map a;
    private final HashMap b;

    A(Map map) {
        this.a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                int i = B.d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, B.b);
            map2.put((G) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, B.b);
        this.b = map2;
    }

    final String a(long j, G g) {
        Map map = (Map) this.a.get(g);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    final Iterator b(G g) {
        List list = (List) this.b.get(g);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
