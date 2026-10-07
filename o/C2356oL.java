package o;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: o.oL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2356oL {
    public static final C2356oL b = a(new Locale[0]);
    public final InterfaceC2550qL a;

    public C2356oL(InterfaceC2550qL interfaceC2550qL) {
        this.a = interfaceC2550qL;
    }

    public static C2356oL a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C2356oL(new C2646rL(AbstractC2259nL.a(localeArr))) : new C2356oL(new C2453pL(localeArr));
    }

    public static C2356oL b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC2162mL.a(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2356oL) {
            if (this.a.equals(((C2356oL) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
