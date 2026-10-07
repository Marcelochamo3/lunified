package o;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class V3 {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
