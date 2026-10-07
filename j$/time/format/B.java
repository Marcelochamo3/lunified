package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class B {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 2);
    private static final Comparator b = new z();
    private static final B c = new B();
    public static final /* synthetic */ int d = 0;

    private static Object b(j$.time.temporal.p pVar, Locale locale) {
        Object a2;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        int i = 0;
        if (pVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    map3.put(Long.valueOf(j), c(eras[i]));
                }
                i++;
            }
            if (!map2.isEmpty()) {
                map.put(G.FULL, map2);
                map.put(G.SHORT, map2);
                map.put(G.NARROW, map3);
            }
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            j$.com.android.tools.r8.a.d(map, dateFormatSymbols2, locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = ((long) i2) + 1;
                    map4.put(Long.valueOf(j2), months[i2]);
                    map5.put(Long.valueOf(j2), c(months[i2]));
                }
            }
            if (!map4.isEmpty()) {
                map.put(G.FULL, map4);
                map.put(G.NARROW, map5);
            }
            HashMap map6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    map6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                }
                i++;
            }
            if (!map6.isEmpty()) {
                map.put(G.SHORT, map6);
            }
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap map7 = new HashMap();
            String[] weekdays = dateFormatSymbols3.getWeekdays();
            map7.put(1L, weekdays[2]);
            map7.put(2L, weekdays[3]);
            map7.put(3L, weekdays[4]);
            map7.put(4L, weekdays[5]);
            map7.put(5L, weekdays[6]);
            map7.put(6L, weekdays[7]);
            map7.put(7L, weekdays[1]);
            map.put(G.FULL, map7);
            HashMap map8 = new HashMap();
            map8.put(1L, c(weekdays[2]));
            map8.put(2L, c(weekdays[3]));
            map8.put(3L, c(weekdays[4]));
            map8.put(4L, c(weekdays[5]));
            map8.put(5L, c(weekdays[6]));
            map8.put(6L, c(weekdays[7]));
            map8.put(7L, c(weekdays[1]));
            map.put(G.NARROW, map8);
            HashMap map9 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
            map9.put(1L, shortWeekdays[2]);
            map9.put(2L, shortWeekdays[3]);
            map9.put(3L, shortWeekdays[4]);
            map9.put(4L, shortWeekdays[5]);
            map9.put(5L, shortWeekdays[6]);
            map9.put(6L, shortWeekdays[7]);
            map9.put(7L, shortWeekdays[1]);
            map.put(G.SHORT, map9);
            a2 = new A(map);
        } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap map10 = new HashMap();
            HashMap map11 = new HashMap();
            String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j3 = i;
                    map10.put(Long.valueOf(j3), amPmStrings[i]);
                    map11.put(Long.valueOf(j3), c(amPmStrings[i]));
                }
                i++;
            }
            if (!map10.isEmpty()) {
                map.put(G.FULL, map10);
                map.put(G.SHORT, map10);
                map.put(G.NARROW, map11);
            }
            a2 = new A(map);
        } else {
            a2 = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, a2);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    static B d() {
        return c;
    }

    public String e(j$.time.chrono.n nVar, j$.time.temporal.p pVar, long j, G g, Locale locale) {
        if (nVar == j$.time.chrono.u.d || !(pVar instanceof j$.time.temporal.a)) {
            return f(pVar, j, g, locale);
        }
        return null;
    }

    public String f(j$.time.temporal.p pVar, long j, G g, Locale locale) {
        Object objB = b(pVar, locale);
        if (objB instanceof A) {
            return ((A) objB).a(j, g);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.n nVar, j$.time.temporal.p pVar, G g, Locale locale) {
        if (nVar == j$.time.chrono.u.d || !(pVar instanceof j$.time.temporal.a)) {
            return h(pVar, g, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.p pVar, G g, Locale locale) {
        Object objB = b(pVar, locale);
        if (objB instanceof A) {
            return ((A) objB).b(g);
        }
        return null;
    }
}
