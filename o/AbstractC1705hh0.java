package o;

/* JADX INFO: renamed from: o.hh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1705hh0 extends AbstractC1607gh0 {
    public static Double I(String str) {
        try {
            if (S90.a.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
