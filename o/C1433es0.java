package o;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: o.es0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1433es0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Cloneable c;

    public /* synthetic */ C1433es0(Object obj, Cloneable cloneable, int i) {
        this.a = i;
        this.b = obj;
        this.c = cloneable;
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
                return ((C1531fs0) this.b).a0((AQ) this.c, (C1369e90) obj);
            case 1:
                return ((C2260nM) this.b).s((H50) this.c, (C1774iM) obj);
            default:
                return C2260nM.x((List) this.b, (H50) this.c, (AQ) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
