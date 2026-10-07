package o;

import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Vr0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Vr0() {
        this.a = 3;
        this.b = Qi0.class;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo4andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return C1531fs0.U((C1828iv) this.b, (Void) obj);
            case 1:
                return ((C1531fs0) this.b).S((C1369e90) obj);
            case 2:
                return ((C0842Vn) this.b).C((Executor) obj);
            case 3:
                return ((Class) this.b).cast((AbstractC1099bV) obj);
            case 4:
                return C2260nM.u((H50) this.b, (C0388Ea) obj);
            default:
                return C2260nM.M((C2848tT) this.b, (C2848tT) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Vr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
