package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@CU("navigation")
public class XT extends DU {
    public final EU c;

    public XT(EU eu) {
        this.c = eu;
    }

    @Override // o.DU
    public final TT a() {
        return new WT(this);
    }

    @Override // o.DU
    public final void d(List list, C1098bU c1098bU) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DT dt = (DT) it.next();
            TT tt = dt.m;
            AbstractC1474fG.h(tt, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            WT wt = (WT) tt;
            IF r2 = new IF();
            r2.m = dt.b();
            int i = wt.x;
            String str = wt.z;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = wt.s;
                if (i2 != 0) {
                    strValueOf = wt.n;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            TT ttJ = str != null ? wt.j(str, false) : (TT) wt.w.d(i);
            if (ttJ == null) {
                if (wt.y == null) {
                    String strValueOf2 = wt.z;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(wt.x);
                    }
                    wt.y = strValueOf2;
                }
                String str2 = wt.y;
                AbstractC1474fG.g(str2);
                throw new IllegalArgumentException(AbstractC1701hf0.u("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                if (!AbstractC1474fG.b(str, ttJ.t)) {
                    RT rtG = ttJ.g(str);
                    Bundle bundle = rtG != null ? rtG.m : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) r2.m;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        r2.m = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = ttJ.r;
                if (!AbstractC3327yN.B(linkedHashMap).isEmpty()) {
                    ArrayList arrayListU = Nr0.u(AbstractC3327yN.B(linkedHashMap), new io.sentry.android.replay.v(10, r2));
                    if (!arrayListU.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + ttJ + ". Missing required arguments [" + arrayListU + ']').toString());
                    }
                } else {
                    continue;
                }
            }
            DU duB = this.c.b(ttJ.l);
            FT ftB = b();
            Bundle bundleA = ttJ.a((Bundle) r2.m);
            YT yt = ftB.h;
            duB.d(AbstractC2506pt.A(C2743sL.n(yt.a, ttJ, bundleA, yt.k(), yt.f636o)), c1098bU);
        }
    }
}
