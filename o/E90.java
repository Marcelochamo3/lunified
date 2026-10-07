package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class E90 {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final J90 e;

    public E90(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C0782Tf(5, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(E90 e90) {
        AbstractC1474fG.j(e90, "this$0");
        Iterator it = AbstractC3327yN.B(e90.b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = e90.a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return AbstractC1474fG.c(new C1101bX("keys", arrayList), new C1101bX("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleA = ((J90) entry.getValue()).a();
            AbstractC1474fG.j(str2, "key");
            if (bundleA != null) {
                Class[] clsArr = f;
                int i = 0;
                while (true) {
                    if (i >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = clsArr[i];
                    AbstractC1474fG.g(cls);
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj = e90.c.get(str2);
            TS ts = obj instanceof TS ? (TS) obj : null;
            if (ts != null) {
                ts.d(bundleA);
            } else {
                linkedHashMap.put(str2, bundleA);
            }
            US us = (US) e90.d.get(str2);
            if (us != null) {
                ((C2771sg0) us).f(bundleA);
            }
        }
    }

    public E90() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C0782Tf(5, this);
    }
}
