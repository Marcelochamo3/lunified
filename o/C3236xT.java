package o;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: o.xT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3236xT implements Comparator, j$.util.Comparator {
    public static final C3236xT m = new C3236xT(0);
    public static final C3236xT n = new C3236xT(1);
    public final /* synthetic */ int l;

    public /* synthetic */ C3236xT(int i) {
        this.l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1474fG.j(comparable, "a");
                AbstractC1474fG.j(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1474fG.j(comparable3, "a");
                AbstractC1474fG.j(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.l) {
            case 0:
                return n;
            default:
                return m;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i = this.l;
        return j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i = this.l;
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i = this.l;
        return j$.util.B.q(this, j$.util.Comparator.CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i = this.l;
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        int i = this.l;
        return j$.util.Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        int i = this.l;
        return j$.util.Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
