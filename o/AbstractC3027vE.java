package o;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: o.vE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3027vE {
    public static final Method a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2930uE.c(AbstractC2930uE.a(AbstractC2930uE.b(locale)));
        }
        try {
            return AbstractC2833tE.a((Locale) a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return AbstractC2833tE.a(locale);
        }
    }
}
