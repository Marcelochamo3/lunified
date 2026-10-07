package o;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class U20 {
    public final int a;
    public final int b;
    public final String c;

    public U20(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.P;
        this.b = preference.Q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U20)) {
            return false;
        }
        U20 u20 = (U20) obj;
        return this.a == u20.a && this.b == u20.b && TextUtils.equals(this.c, u20.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
