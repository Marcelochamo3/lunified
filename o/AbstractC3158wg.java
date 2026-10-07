package o;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: o.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3158wg {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            return version.major() > 2;
        }
        if (version.minor() != 1) {
            return version.minor() > 1;
        }
        return version.patch() >= 0;
    }

    public static boolean b() {
        return C3352yg.d;
    }
}
