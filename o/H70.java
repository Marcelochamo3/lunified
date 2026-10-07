package o;

import j$.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface H70 {
    void a(int i);

    AQ b(AQ aq);

    void c(C1511fi0 c1511fi0);

    CompletionStage<AQ> d(AQ aq, Executor executor);

    void e(Duration duration);

    void f(int i, int i2, int i3, AbstractC2304np... abstractC2304npArr);

    void g(int i);

    void h(int i, int i2, int i3, List<AbstractC2304np> list);

    void i(boolean z);

    Duration j();

    CompletionStage<AQ> k(AQ aq);

    @Deprecated
    Object l(AQ aq, L70 l70);

    @Deprecated
    void m(int i);

    @Deprecated
    void n(int i, int i2);

    void o(boolean z);
}
