package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.eZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1395eZ implements InterfaceC1181cG {
    public final /* synthetic */ C2446pE a;
    public final /* synthetic */ Map b;

    public /* synthetic */ C1395eZ(C2446pE c2446pE, Map map) {
        this.a = c2446pE;
        this.b = map;
    }

    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) {
        Map map = this.b;
        AbstractC1474fG.j(map, "$headers");
        C1951k70 c1951k70 = d50.e;
        boolean zE = AbstractC2506pt.E(this.a, c1951k70.a);
        C0560Kq c0560KqA = c1951k70.a();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC2506pt.z(str) || zE) {
                c0560KqA.j(str, str2);
            } else {
                c0560KqA.n(str);
            }
        }
        if (!zE) {
            Set setE = c1951k70.c.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setE) {
                if (AbstractC2506pt.z((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0560KqA.n((String) it.next());
            }
        }
        return d50.b(c0560KqA.c());
    }
}
