package o;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: o.us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2988us implements IntUnaryOperator {
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return C3085vs.a.i(i);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
