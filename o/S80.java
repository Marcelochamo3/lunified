package o;

import java.net.URI;

/* JADX INFO: loaded from: classes.dex */
public abstract class S80 {
    public static final I60 a;
    public static final I60 b;

    static {
        J60 j60 = J60.IGNORE_CASE;
        a = new I60("[\\\"']embedUrl[\\\"']\\s*:\\s*[\\\"']([^\\\"']+)[\\\"']", j60);
        b = new I60("[\\\"']url[\\\"']\\s*:\\s*[\\\"']([^\\\"']*\\.m3u8[^\\\"']*)[\\\"']", j60);
    }

    public static String a(String str, String str2) {
        String str3;
        Object objK;
        JN jnB = a.b(str, 0);
        if (jnB == null || (str3 = (String) AbstractC0911Ye.e0(1, jnB.a())) == null) {
            return null;
        }
        I60 i60 = SB.a;
        String strE = SB.e(str3, str2);
        if (strE == null || !AbstractC1468fA.r(strE, "rumble.com")) {
            return null;
        }
        try {
            objK = new URI(strE).getPath();
            if (objK == null) {
                objK = "";
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (AbstractC1899jh0.U((String) (objK instanceof C2439p80 ? "" : objK), "/embed/", false)) {
            return strE;
        }
        return null;
    }

    public static String b(String str, String str2) {
        Object obj;
        C1634gv c1634gv = new C1634gv(Vb0.N(I60.c(b, str), new C5(str2, 8)));
        while (true) {
            obj = null;
            if (!c1634gv.hasNext()) {
                break;
            }
            Object next = c1634gv.next();
            String str3 = (String) next;
            if (SB.b(14, str3, null, null) && (AbstractC1468fA.r(str3, "rumble.com") || AbstractC1468fA.r(str3, "rumble.cloud"))) {
                obj = next;
                break;
            }
        }
        return (String) obj;
    }
}
