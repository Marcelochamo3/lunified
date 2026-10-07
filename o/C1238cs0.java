package o;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: renamed from: o.cs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1238cs0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1531fs0 b;
    public final /* synthetic */ C1369e90 c;
    public final /* synthetic */ AQ d;

    public /* synthetic */ C1238cs0(C1531fs0 c1531fs0, AQ aq, C1369e90 c1369e90) {
        this.a = 2;
        this.b = c1531fs0;
        this.d = aq;
        this.c = c1369e90;
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
                return this.b.X(this.c, this.d, (Void) obj);
            case 1:
                return this.b.Y(this.c, this.d, (Void) obj);
            default:
                return this.b.Z(this.d, this.c, (Void) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ C1238cs0(C1531fs0 c1531fs0, C1369e90 c1369e90, AQ aq, int i) {
        this.a = i;
        this.b = c1531fs0;
        this.c = c1369e90;
        this.d = aq;
    }
}
