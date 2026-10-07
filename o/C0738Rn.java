package o;

import j$.util.function.BiFunction$CC;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: o.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0738Rn implements BiFunction {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ C0842Vn b;
    public final /* synthetic */ AQ c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ C0738Rn(C0842Vn c0842Vn, AQ aq, String str, byte[] bArr, long j) {
        this.b = c0842Vn;
        this.c = aq;
        this.e = str;
        this.f = bArr;
        this.d = j;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return this.b.D(this.c, (Executor) this.e, this.d, this.f, (C1754i6.a) obj, (Throwable) obj2);
            default:
                return this.b.H(this.c, (String) this.e, (byte[]) this.f, this.d, (C1754i6.a) obj, (Throwable) obj2);
        }
    }

    public /* synthetic */ C0738Rn(C0842Vn c0842Vn, AQ aq, Executor executor, long j, Object obj) {
        this.b = c0842Vn;
        this.c = aq;
        this.e = executor;
        this.d = j;
        this.f = obj;
    }
}
