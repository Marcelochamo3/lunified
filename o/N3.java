package o;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class N3 {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
