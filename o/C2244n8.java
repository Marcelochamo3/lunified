package o;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.net.InetSocketAddress;
import java.util.function.Predicate;

/* JADX INFO: renamed from: o.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2244n8 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ C2244n8(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractC2341o8.j((InetSocketAddress) obj);
            case 1:
                return Objects.nonNull((C2848tT) obj);
            default:
                return C1531fs0.R((AbstractC2304np) obj);
        }
    }
}
