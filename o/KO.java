package o;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class KO {
    public final String a;
    public final boolean b;
    public final boolean c;

    public KO(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != KO.class) {
            return false;
        }
        KO ko = (KO) obj;
        return TextUtils.equals(this.a, ko.a) && this.b == ko.b && this.c == ko.c;
    }

    public final int hashCode() {
        return ((AbstractC1674hK.i(31, this.a, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
