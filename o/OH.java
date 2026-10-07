package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OH extends QH implements Iterable {
    public final ArrayList l = new ArrayList();

    @Override // o.QH
    public final boolean a() {
        return i().a();
    }

    @Override // o.QH
    public final int d() {
        return i().d();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof OH) && ((OH) obj).l.equals(this.l));
    }

    @Override // o.QH
    public final String h() {
        return i().h();
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final QH i() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        if (size == 1) {
            return (QH) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC1674hK.n(size, "Array must have size 1, but has size "));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.l.iterator();
    }
}
