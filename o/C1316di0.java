package o;

import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: o.di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1316di0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ C1316di0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 0:
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
                return C1511fi0.A(this.b, (Map.Entry) obj);
            default:
                return C1511fi0.y(this.b, (C2848tT) obj);
        }
    }
}
