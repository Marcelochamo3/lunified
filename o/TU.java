package o;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TU implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ TU(Object obj, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
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
                return VU.y((InetSocketAddress) this.b, (InetSocketAddress) this.c, (CompletableFuture) this.d, (VU.a) obj);
            default:
                return ((C2260nM) this.b).v((H50) this.c, (List) this.d, (Gc0) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
