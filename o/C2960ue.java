package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2960ue {
    public final HashMap a = new HashMap();
    public final Map b;

    public C2960ue(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            SJ sj = (SJ) entry.getValue();
            List arrayList = (List) this.a.get(sj);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(sj, arrayList);
            }
            arrayList.add((C3057ve) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1283dK interfaceC1283dK, SJ sj, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C3057ve c3057ve = (C3057ve) list.get(size);
                c3057ve.getClass();
                try {
                    int i = c3057ve.a;
                    Method method = c3057ve.b;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC1283dK);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC1283dK, sj);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
