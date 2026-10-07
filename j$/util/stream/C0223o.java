package j$.util.stream;

import j$.util.C0142h;
import j$.util.C0143i;
import j$.util.C0145k;
import j$.util.C0146l;
import j$.util.C0147m;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Predicate$CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0223o implements Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, ObjLongConsumer, LongBinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0223o(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        ((C0142h) obj).accept(d);
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 21:
                ((C0143i) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        ((C0145k) obj).accept(j);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 2:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 6:
                ((C0142h) obj).b((C0142h) obj2);
                break;
            case 22:
                ((C0143i) obj).b((C0143i) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 6:
                break;
            case 22:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 9:
                return new Double[i];
            case 16:
                return new Object[i];
            case 17:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 3:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 20:
                return Math.min(i, i2);
            case 23:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return new LinkedHashSet();
            case 4:
                return new double[4];
            case 11:
                return new double[3];
            default:
                return new long[2];
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 12:
                return ((C0146l) obj).c();
            case 13:
                return ((OptionalInt) obj).b();
            case 14:
                return ((C0147m) obj).c();
            default:
                return ((Optional) obj).isPresent();
        }
    }
}
