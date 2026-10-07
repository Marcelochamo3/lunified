package o;

import j$.util.function.BiFunction$CC;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: o.ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2891ts implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3085vs.a b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ C2891ts(C3085vs.a aVar, Executor executor, int i) {
        this.a = i;
        this.b = aVar;
        this.c = executor;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AQ aq = (AQ) obj;
        Throwable th = (Throwable) obj2;
        switch (this.a) {
            case 0:
                return this.b.l(this.c, aq, th);
            default:
                return this.b.h(this.c, aq, th);
        }
    }
}
