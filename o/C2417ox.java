package o;

import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: o.ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2417ox implements J1 {
    public final /* synthetic */ int l;
    public final /* synthetic */ C3289xx m;

    public /* synthetic */ C2417ox(C3289xx c3289xx, int i) {
        this.l = i;
        this.m = c3289xx;
    }

    @Override // o.J1
    public final void c(Object obj) {
        switch (this.l) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                C3289xx c3289xx = this.m;
                C2804sx c2804sx = (C2804sx) c3289xx.E.pollFirst();
                if (c2804sx != null) {
                    c3289xx.c.q(c2804sx.l);
                    break;
                }
                break;
            case 1:
                I1 i1 = (I1) obj;
                C3289xx c3289xx2 = this.m;
                C2804sx c2804sx2 = (C2804sx) c3289xx2.E.pollLast();
                if (c2804sx2 != null) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxQ = c3289xx2.c.q(c2804sx2.l);
                    if (abstractComponentCallbacksC1247cxQ != null) {
                        int i2 = i1.l;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            abstractComponentCallbacksC1247cxQ.toString();
                            Objects.toString(i1.m);
                        }
                        break;
                    }
                }
                break;
            default:
                I1 i3 = (I1) obj;
                C3289xx c3289xx3 = this.m;
                C2804sx c2804sx3 = (C2804sx) c3289xx3.E.pollFirst();
                if (c2804sx3 != null) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxQ2 = c3289xx3.c.q(c2804sx3.l);
                    if (abstractComponentCallbacksC1247cxQ2 != null) {
                        int i4 = i3.l;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            abstractComponentCallbacksC1247cxQ2.toString();
                            Objects.toString(i3.m);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
