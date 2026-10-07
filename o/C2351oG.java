package o;

import android.database.sqlite.SQLiteException;
import io.sentry.C0032c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: o.oG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2351oG {
    public static final String[] n = {"UPDATE", "DELETE", "INSERT"};
    public final F80 a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f;
    public volatile boolean g;
    public volatile C3485zy h;
    public final C0032c i;
    public final C3022v90 j;
    public final Object k;
    public final Object l;
    public final RunnableC3102w1 m;

    public C2351oG(F80 f80, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        AbstractC1474fG.j(f80, "database");
        this.a = f80;
        this.b = map;
        this.c = map2;
        this.f = new AtomicBoolean(false);
        this.i = new C0032c(strArr.length);
        AbstractC1474fG.i(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.j = new C3022v90();
        this.k = new Object();
        this.l = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String strI = AbstractC1701hf0.i(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(strI, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strI = lowerCase;
            }
            strArr2[i] = strI;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strI2 = AbstractC1701hf0.i(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(strI2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase2, AbstractC3327yN.w(strI2, linkedHashMap));
            }
        }
        this.m = new RunnableC3102w1(14, this);
    }

    public final void a(C2720s4 c2720s4) {
        Object obj;
        C2254nG c2254nG;
        F80 f80;
        C2903ty c2903ty;
        AbstractC1474fG.j(c2720s4, "observer");
        String[] strArr = (String[]) c2720s4.m;
        Fc0 fc0 = new Fc0();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String strI = AbstractC1701hf0.i(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.c;
            if (map.containsKey(strI)) {
                String lowerCase = str.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                Object obj2 = map.get(lowerCase);
                AbstractC1474fG.g(obj2);
                fc0.addAll((Collection) obj2);
            } else {
                fc0.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC1370eA.c(fc0).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.d;
            Locale locale2 = Locale.US;
            Integer num = (Integer) linkedHashMap.get(AbstractC1701hf0.i(locale2, "US", str2, locale2, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(num);
        }
        int[] iArrW0 = AbstractC0911Ye.w0(arrayList);
        C2254nG c2254nG2 = new C2254nG(c2720s4, iArrW0, strArr2);
        synchronized (this.j) {
            C3022v90 c3022v90 = this.j;
            C2731s90 c2731s90A = c3022v90.a(c2720s4);
            if (c2731s90A != null) {
                obj = c2731s90A.m;
            } else {
                C2731s90 c2731s90 = new C2731s90(c2720s4, c2254nG2);
                c3022v90.f1071o++;
                C2731s90 c2731s91 = c3022v90.m;
                if (c2731s91 == null) {
                    c3022v90.l = c2731s90;
                    c3022v90.m = c2731s90;
                } else {
                    c2731s91.n = c2731s90;
                    c2731s90.f1020o = c2731s91;
                    c3022v90.m = c2731s90;
                }
                obj = null;
            }
            c2254nG = (C2254nG) obj;
        }
        if (c2254nG == null && this.i.s(Arrays.copyOf(iArrW0, iArrW0.length)) && (c2903ty = (f80 = this.a).a) != null && c2903ty.isOpen()) {
            e(f80.g().P());
        }
    }

    public final boolean b() {
        C2903ty c2903ty = this.a.a;
        if (!(c2903ty != null && c2903ty.isOpen())) {
            return false;
        }
        if (!this.g) {
            this.a.g().P();
        }
        return this.g;
    }

    public final void c(C2720s4 c2720s4) {
        C2254nG c2254nG;
        F80 f80;
        C2903ty c2903ty;
        AbstractC1474fG.j(c2720s4, "observer");
        synchronized (this.j) {
            c2254nG = (C2254nG) this.j.d(c2720s4);
        }
        if (c2254nG != null) {
            C0032c c0032c = this.i;
            int[] iArr = c2254nG.b;
            if (c0032c.t(Arrays.copyOf(iArr, iArr.length)) && (c2903ty = (f80 = this.a).a) != null && c2903ty.isOpen()) {
                e(f80.g().P());
            }
        }
    }

    public final void d(C2903ty c2903ty, int i) {
        c2903ty.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        String[] strArr = n;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + zy0.u(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            AbstractC1474fG.i(str3, "StringBuilder().apply(builderAction).toString()");
            c2903ty.p(str3);
        }
    }

    public final void e(C2903ty c2903ty) {
        AbstractC1474fG.j(c2903ty, "database");
        if (c2903ty.q()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.i.readLock();
            AbstractC1474fG.i(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.k) {
                    int[] iArrQ = this.i.q();
                    if (iArrQ == null) {
                        lock.unlock();
                        return;
                    }
                    if (c2903ty.t()) {
                        c2903ty.f();
                    } else {
                        c2903ty.a();
                    }
                    try {
                        int length = iArrQ.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrQ[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                d(c2903ty, i2);
                            } else if (i3 == 2) {
                                String str = this.e[i2];
                                String[] strArr = n;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + zy0.u(str, strArr[i5]);
                                    AbstractC1474fG.i(str2, "StringBuilder().apply(builderAction).toString()");
                                    c2903ty.p(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        c2903ty.W();
                        c2903ty.l();
                        lock.unlock();
                    } catch (Throwable th) {
                        c2903ty.l();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
