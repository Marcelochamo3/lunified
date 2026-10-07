package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.r00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2616r00 extends AbstractC2810t00 {
    public static final C2616r00 c = new C2616r00();

    public static C2713s00 b() {
        Object next;
        ArrayList arrayList = AbstractC2810t00.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C2713s00) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            next = it.next();
            C2713s00 c2713s00 = (C2713s00) next;
            C1042as c1042as = (C1042as) c2713s00.e;
            c1042as.i0();
            C0643Nw c0643Nw = c1042as.P;
            if (c0643Nw != null && c0643Nw.s == c2713s00.d) {
                return (C2713s00) next;
            }
        }
        next = null;
        return (C2713s00) next;
    }

    @Override // o.AbstractC2810t00
    public final boolean a() {
        ArrayList arrayList = AbstractC2810t00.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C2713s00) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((C2713s00) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2616r00);
    }

    public final int hashCode() {
        return 625471004;
    }

    public final String toString() {
        return "Auto";
    }
}
