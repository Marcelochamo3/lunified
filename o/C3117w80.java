package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.w80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3117w80 extends HW implements Serializable {
    public static final C3117w80 l = new C3117w80();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return l;
    }

    @Override // o.HW
    public final HW a() {
        return C3333yT.l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
