package j$.util.stream;

import j$.util.C0142h;
import j$.util.C0143i;
import j$.util.C0145k;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0203k implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0203k(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        switch (this.a) {
            case 5:
                dArr[2] = dArr[2] + 1.0d;
                Collectors.c(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            default:
                Collectors.c(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.c(dArr, dArr2[0]);
                Collectors.c(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 6:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.c(dArr3, dArr4[0]);
                Collectors.c(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 21:
                ((Collection) obj).add(obj2);
                break;
            case 23:
                ((List) obj).add(obj2);
                break;
            default:
                ((j$.util.d0) obj).a((CharSequence) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 21:
                break;
            case 23:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 13:
                break;
            case 15:
                break;
            case 17:
                break;
            case 18:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo4andThen(Function function) {
        switch (this.a) {
            case 3:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 12:
                return AbstractC0274z0.J(j);
            case 13:
            default:
                return AbstractC0274z0.T(j);
            case 14:
                return AbstractC0274z0.S(j);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                Set set = Collectors.a;
                return obj;
            default:
                return ((j$.util.d0) obj).toString();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                Collectors.b(map, (Map) obj2);
                return map;
            case 1:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 2:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 13:
                return new T0((F0) obj, (F0) obj2);
            case 15:
                return new U0((H0) obj, (H0) obj2);
            case 17:
                return new V0((J0) obj, (J0) obj2);
            case 18:
                return new X0((L0) obj, (L0) obj2);
            default:
                j$.util.d0 d0Var = (j$.util.d0) obj;
                d0Var.d((j$.util.d0) obj2);
                return d0Var;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 3:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 8:
                return new I();
            case 9:
                return new J();
            case 10:
                return new K();
            case 11:
                return new L();
            case 20:
                return new C0142h();
            case 22:
                return new ArrayList();
            case 24:
                return new C0143i();
            case 25:
                return new C0145k();
            default:
                return new HashMap();
        }
    }
}
