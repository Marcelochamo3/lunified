package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.AbstractC1701hf0;

/* JADX INFO: renamed from: io.sentry.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082q0 {
    public final HashSet a = new HashSet();
    public final int b;

    public C0082q0(int i) {
        this.b = i;
    }

    public final HashMap a(Map map, ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), b(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public final Object b(ILogger iLogger, Object obj) {
        Object string;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.a.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.a.a((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = this.a;
        if (hashSet.contains(obj)) {
            iLogger.h(EnumC0094u1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.b) {
                hashSet.remove(obj);
                iLogger.h(EnumC0094u1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            if (obj.getClass().isArray()) {
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList2 = new ArrayList();
                int length2 = objArr.length;
                while (i < length2) {
                    arrayList2.add(b(iLogger, objArr[i]));
                    i++;
                }
                obj2 = arrayList2;
            } else if (obj instanceof Collection) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    arrayList3.add(b(iLogger, it.next()));
                }
                obj2 = arrayList3;
            } else {
                if (obj instanceof Map) {
                    string = a((Map) obj, iLogger);
                } else {
                    HashMap mapC = c(iLogger, obj);
                    if (mapC.isEmpty()) {
                        string = obj.toString();
                    } else {
                        obj2 = mapC;
                    }
                }
                obj2 = string;
            }
            return obj2;
        } catch (Exception e) {
            iLogger.v(EnumC0094u1.INFO, "Not serializing object due to throwing sub-path.", e);
        } finally {
            hashSet.remove(obj);
        }
    }

    public final HashMap c(ILogger iLogger, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, b(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.h(EnumC0094u1.INFO, AbstractC1701hf0.u("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }
}
