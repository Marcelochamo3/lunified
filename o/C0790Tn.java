package o;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: o.Tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0790Tn implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0790Tn(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((C0842Vn) this.b).F((AQ) this.c, obj, (Throwable) obj2);
            default:
                return G70.j((L70) this.b, this.c, (AQ) obj, (Throwable) obj2);
        }
    }
}
