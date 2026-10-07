package io.sentry.config;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public final List a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String strA = ((d) it.next()).a(str);
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.sentry.config.d
    public final Map b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((d) it.next()).b());
        }
        return concurrentHashMap;
    }

    public final Boolean c(String str) {
        String strA = a(str);
        if (strA != null) {
            return Boolean.valueOf(strA);
        }
        return null;
    }

    public final String d() {
        String strA = a("proxy.port");
        return strA != null ? strA : "80";
    }
}
