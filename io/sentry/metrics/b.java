package io.sentry.metrics;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC1674hK;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();

    public final HashMap a() {
        HashMap map = new HashMap();
        synchronized (this.a) {
            try {
                for (Map.Entry entry : this.a.entrySet()) {
                    String str = (String) entry.getKey();
                    Objects.requireNonNull(str);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Map) entry.getValue()).values().iterator();
                    if (it.hasNext()) {
                        AbstractC1674hK.w(it.next());
                        throw null;
                    }
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
