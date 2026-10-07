package o;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: renamed from: o.Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0767Sq implements Predicate {
    public final /* synthetic */ AbstractC1332dr a;
    public final /* synthetic */ C3176wp b;

    public /* synthetic */ C0767Sq(AbstractC1332dr abstractC1332dr, C3176wp c3176wp) {
        this.a = abstractC1332dr;
        this.b = c3176wp;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.a.b(this.b, (C3176wp) obj);
    }
}
