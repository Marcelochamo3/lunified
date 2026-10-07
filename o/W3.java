package o;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class W3 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C2356oL b(Configuration configuration) {
        return C2356oL.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(C2356oL c2356oL) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2356oL.a.a()));
    }

    public static void d(Configuration configuration, C2356oL c2356oL) {
        configuration.setLocales(LocaleList.forLanguageTags(c2356oL.a.a()));
    }
}
