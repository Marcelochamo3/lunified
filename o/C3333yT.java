package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.yT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3333yT extends HW implements Serializable {
    public static final C3333yT l = new C3333yT();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return l;
    }

    @Override // o.HW
    public final HW a() {
        return C3117w80.l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
