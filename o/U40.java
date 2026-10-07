package o;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes.dex */
public final class U40 {
    private static ResourceBundle a;
    private static boolean b;

    private U40() {
    }

    public static String a(String str, Object... objArr) {
        if (b) {
            return b(str, objArr);
        }
        try {
            if (a == null) {
                a = ResourceBundle.getBundle("messages");
            }
            return MessageFormat.format(a.getString(str), objArr);
        } catch (MissingResourceException unused) {
            return b(str, objArr);
        }
    }

    private static String b(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder(str);
        for (Object obj : objArr) {
            sb.append(":");
            sb.append(obj);
        }
        return sb.toString();
    }

    public static void c(ResourceBundle resourceBundle) {
        a = resourceBundle;
    }

    public static void d(boolean z) {
        b = z;
    }
}
