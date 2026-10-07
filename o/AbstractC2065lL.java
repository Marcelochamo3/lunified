package o;

import java.net.URI;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.lL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2065lL {
    public static final AtomicReference a = new AtomicReference(null);

    public static boolean a(String str) {
        String strB;
        AbstractC1474fG.j(str, "value");
        String str2 = (String) a.get();
        if (str2 == null || (strB = b(str)) == null) {
            return false;
        }
        return AbstractC1474fG.b(strB, str2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    public static String b(String str) {
        Object objK;
        int port;
        String rawPath;
        AbstractC1474fG.j(str, "value");
        try {
            int length = str.length();
            if (1 > length || length >= 2049) {
                objK = null;
            } else {
                URI uri = new URI(str);
                if (!AbstractC1899jh0.N(uri.getScheme(), "http", true) || uri.isOpaque() || uri.getUserInfo() != null || uri.getFragment() != null || !AbstractC1474fG.b(uri.getHost(), "127.0.0.1") || 1024 > (port = uri.getPort()) || port >= 65536 || (rawPath = uri.getRawPath()) == null || AbstractC1899jh0.O(rawPath)) {
                    objK = null;
                } else {
                    String rawPath2 = uri.getRawPath();
                    AbstractC1474fG.i(rawPath2, "getRawPath(...)");
                    if (AbstractC1899jh0.U(rawPath2, "/", false)) {
                        objK = uri.toASCIIString();
                    } else {
                        objK = null;
                    }
                }
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return (String) (objK instanceof C2439p80 ? null : objK);
    }
}
