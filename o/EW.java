package o;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class EW {
    private static Map<String, String> a;

    static {
        try {
            d();
        } catch (SecurityException unused) {
        }
    }

    private EW() {
    }

    public static boolean a(String str) {
        Map<String, String> map = a;
        return (map == null || map.get(str.toLowerCase()) == null) ? false : true;
    }

    public static void b() {
        a = null;
    }

    public static int c(String str) {
        String strH = h(str);
        if (strH == null) {
            return -1;
        }
        try {
            int i = Integer.parseInt(strH);
            if (i > 0) {
                return i;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void d() {
        String property = System.getProperty("dnsjava.options");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf == -1) {
                    e(strNextToken);
                } else {
                    f(strNextToken.substring(0, iIndexOf), strNextToken.substring(iIndexOf + 1));
                }
            }
        }
    }

    public static void e(String str) {
        if (a == null) {
            a = new HashMap();
        }
        a.put(str.toLowerCase(), "true");
    }

    public static void f(String str, String str2) {
        if (a == null) {
            a = new HashMap();
        }
        a.put(str.toLowerCase(), str2.toLowerCase());
    }

    public static void g(String str) {
        Map<String, String> map = a;
        if (map == null) {
            return;
        }
        map.remove(str.toLowerCase());
    }

    public static String h(String str) {
        Map<String, String> map = a;
        if (map == null) {
            return null;
        }
        return map.get(str.toLowerCase());
    }
}
