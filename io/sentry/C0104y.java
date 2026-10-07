package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0104y {
    public static final HashMap g;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public C0001a c = null;
    public C0001a d = null;
    public C0001a e = null;
    public P0 f = null;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final synchronized void a() {
        try {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object b(String str, Class cls) {
        Object obj = this.a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Class cls2 = (Class) g.get(cls.getCanonicalName());
        if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    public final synchronized void c(Object obj, String str) {
        this.a.put(str, obj);
    }
}
