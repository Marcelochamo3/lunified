package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends Y {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // o.AbstractC1058b0
    public final O a() {
        O u;
        O o2 = this.n;
        if (o2 == null) {
            OS os = (OS) this;
            Map map = os.f629o;
            if (map instanceof NavigableMap) {
                u = new Q(os, (NavigableMap) os.f629o);
            } else {
                u = map instanceof SortedMap ? new U(os, (SortedMap) os.f629o) : new O(os, os.f629o);
            }
            o2 = u;
            this.n = o2;
        }
        return o2;
    }

    public final boolean c(Double d, Integer num) {
        Collection collection = (Collection) this.f629o.get(d);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.p++;
            return true;
        }
        List list = (List) ((OS) this).q.get();
        if (!list.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.p++;
        this.f629o.put(d, list);
        return true;
    }

    @Override // o.AbstractC1058b0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
