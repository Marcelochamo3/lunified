package o;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: renamed from: o.zT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3430zT {
    public final int a;
    public C1098bU b = null;
    public Bundle c = null;

    public C3430zT(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3430zT)) {
            return false;
        }
        C3430zT c3430zT = (C3430zT) obj;
        if (this.a == c3430zT.a && AbstractC1474fG.b(this.b, c3430zT.b)) {
            if (AbstractC1474fG.b(this.c, c3430zT.c)) {
                return true;
            }
            Bundle bundle = this.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                if (setKeySet.isEmpty()) {
                    return true;
                }
                for (String str : setKeySet) {
                    Bundle bundle2 = this.c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = c3430zT.c;
                    if (!AbstractC1474fG.b(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int i = this.a * 31;
        C1098bU c1098bU = this.b;
        int iHashCode = i + (c1098bU != null ? c1098bU.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i2 = iHashCode * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3430zT.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
