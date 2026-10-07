package io.sentry.android.core;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C2744sM;

/* JADX INFO: renamed from: io.sentry.android.core.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0020q {
    public final long a;
    public long b;
    public final Object c;

    public C0020q(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public synchronized Object a(Object obj) {
        C2744sM c2744sM;
        c2744sM = (C2744sM) ((LinkedHashMap) this.c).get(obj);
        return c2744sM != null ? c2744sM.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        C2744sM c2744sM = (C2744sM) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new C2744sM(iB, obj2));
        if (c2744sM != null) {
            this.b -= (long) c2744sM.b;
            if (!c2744sM.a.equals(obj2)) {
                c(obj, c2744sM.a);
            }
        }
        e(this.a);
        return c2744sM != null ? c2744sM.a : null;
    }

    public synchronized void e(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C2744sM c2744sM = (C2744sM) entry.getValue();
            this.b -= (long) c2744sM.b;
            Object key = entry.getKey();
            it.remove();
            c(key, c2744sM.a);
        }
    }

    public C0020q(long j, long j2, Date date) {
        this.a = j;
        this.b = j2;
        this.c = date;
    }

    public void c(Object obj, Object obj2) {
    }
}
