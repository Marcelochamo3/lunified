package o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Lm0 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public Lm0(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Lm0)) {
            return false;
        }
        Lm0 lm0 = (Lm0) obj;
        return this.b == lm0.b && this.a.equals(lm0.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbS = AbstractC1674hK.s("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbS.append(this.b);
        sbS.append("\n");
        String strD = AbstractC1701hf0.d(sbS.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strD = strD + "    " + str + ": " + map.get(str) + "\n";
        }
        return strD;
    }
}
