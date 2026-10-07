package o;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: renamed from: o.jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1870jM implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2260nM b;

    public /* synthetic */ C1870jM(C2260nM c2260nM, int i) {
        this.a = i;
        this.b = c2260nM;
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
                return this.b.B((X40) obj);
            default:
                return this.b.I((AQ) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
