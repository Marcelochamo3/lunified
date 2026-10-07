package o;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J20 implements I20, Serializable {
    private static final long serialVersionUID = 0;
    public final List l;

    public J20(List list) {
        this.l = list;
    }

    @Override // o.I20
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.l;
            if (i >= list.size()) {
                return true;
            }
            if (!((I20) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J20) {
            return this.l.equals(((J20) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.l) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
