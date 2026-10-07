package o;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Ur0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1531fs0 b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ C1369e90 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ Ur0(C1531fs0 c1531fs0, C1369e90 c1369e90, C2848tT c2848tT, AQ aq) {
        this.a = 2;
        this.b = c1531fs0;
        this.d = c1369e90;
        this.c = c2848tT;
        this.e = aq;
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
                return this.b.e0((C1761i90) this.c, this.d, (AtomicInteger) this.e, (C2643rI) obj);
            case 1:
                return this.b.g0((C1761i90) this.c, this.d, (AtomicInteger) this.e, (C2643rI) obj);
            default:
                return this.b.c0(this.d, (C2848tT) this.c, (AQ) this.e, (Void) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Ur0(C1531fs0 c1531fs0, C1761i90 c1761i90, C1369e90 c1369e90, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = c1531fs0;
        this.c = c1761i90;
        this.d = c1369e90;
        this.e = atomicInteger;
    }
}
