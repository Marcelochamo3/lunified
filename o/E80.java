package o;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class E80 {
    public final Context a;
    public final Class b;
    public final String c;
    public Executor g;
    public Executor h;
    public boolean i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashSet f231o;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int j = 1;
    public final boolean k = true;
    public final long l = -1;
    public final C2938uM m = new C2938uM(2);
    public final LinkedHashSet n = new LinkedHashSet();

    public E80(Context context, Class cls, String str) {
        this.a = context;
        this.b = cls;
        this.c = str;
    }

    public final void a(C1458f5... c1458f5Arr) {
        if (this.f231o == null) {
            this.f231o = new HashSet();
        }
        for (C1458f5 c1458f5 : c1458f5Arr) {
            HashSet hashSet = this.f231o;
            AbstractC1474fG.g(hashSet);
            hashSet.add(Integer.valueOf(c1458f5.a));
            HashSet hashSet2 = this.f231o;
            AbstractC1474fG.g(hashSet2);
            hashSet2.add(Integer.valueOf(c1458f5.b));
        }
        this.m.a((C1458f5[]) Arrays.copyOf(c1458f5Arr, c1458f5Arr.length));
    }

    public final F80 b() {
        int i;
        boolean zContainsKey;
        Executor executor = this.g;
        if (executor == null && this.h == null) {
            I5 i5 = J5.X;
            this.h = i5;
            this.g = i5;
        } else if (executor != null && this.h == null) {
            this.h = executor;
        } else if (executor == null) {
            this.g = this.h;
        }
        HashSet hashSet = this.f231o;
        LinkedHashSet linkedHashSet = this.n;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(iIntValue)))) {
                    throw new IllegalArgumentException(AbstractC1674hK.n(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        C0519Jb c0519Jb = new C0519Jb(24);
        if (this.l > 0) {
            if (this.c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        ArrayList arrayList = this.d;
        boolean z = this.i;
        int i2 = this.j;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.a;
        AbstractC1474fG.j(context, "context");
        if (i2 != 1) {
            i = i2;
        } else {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = this.g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Executor executor3 = this.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C3261xj c3261xj = new C3261xj(context, this.c, c0519Jb, this.m, arrayList, z, i, executor2, executor3, this.k, linkedHashSet, this.e, this.f);
        Class cls = this.b;
        AbstractC1474fG.j(cls, "klass");
        Package r3 = cls.getPackage();
        AbstractC1474fG.g(r3);
        String name = r3.getName();
        String canonicalName = cls.getCanonicalName();
        AbstractC1474fG.g(canonicalName);
        AbstractC1474fG.i(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            AbstractC1474fG.i(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = AbstractC1899jh0.S(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader());
            AbstractC1474fG.h(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            F80 f80 = (F80) cls2.getDeclaredConstructor(null).newInstance(null);
            f80.getClass();
            f80.d = f80.e(c3261xj);
            Set setH = f80.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = f80.h;
                List list = c3261xj.m;
                if (zHasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = list.size() - 1;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    while (true) {
                        int i3 = size - 1;
                        if (cls3.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        if (i3 < 0) {
                            size = -1;
                            break;
                        }
                        size = i3;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls3, list.get(size));
                } else {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                        }
                    }
                    for (C1458f5 c1458f5 : f80.f(linkedHashMap)) {
                        int i6 = c1458f5.a;
                        C2938uM c2938uM = c3261xj.d;
                        LinkedHashMap linkedHashMap2 = c2938uM.m;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                            if (map == null) {
                                map = C1330dq.l;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(c1458f5.b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c2938uM.a(c1458f5);
                        }
                    }
                    f80.g().setWriteAheadLoggingEnabled(c3261xj.g == 3);
                    f80.g = c3261xj.e;
                    f80.b = c3261xj.h;
                    f80.c = new P3(c3261xj.i);
                    f80.f = c3261xj.f;
                    Map mapI = f80.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = c3261xj.l;
                        if (!zHasNext2) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i7 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i7 >= 0) {
                                        size3 = i7;
                                    }
                                }
                            }
                            return f80;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 < 0) {
                                size4 = -1;
                                break;
                            }
                            while (true) {
                                int i8 = size4 - 1;
                                if (cls5.isAssignableFrom(list2.get(size4).getClass())) {
                                    bitSet2.set(size4);
                                    break;
                                }
                                if (i8 < 0) {
                                    size4 = -1;
                                    break;
                                }
                                size4 = i8;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            f80.l.put(cls5, list2.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
