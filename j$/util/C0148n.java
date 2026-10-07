package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0148n implements DoubleConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C0148n(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(Double.valueOf(d));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
