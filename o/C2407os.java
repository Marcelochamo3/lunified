package o;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: renamed from: o.os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2407os implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2407os() {
        this.a = 1;
        this.b = Qi0.class;
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
                return C3085vs.F((H70) this.b, (C3085vs.b) obj);
            default:
                return ((Class) this.b).isInstance((AbstractC1099bV) obj);
        }
    }

    public /* synthetic */ C2407os(H70 h70) {
        this.a = 0;
        this.b = h70;
    }
}
