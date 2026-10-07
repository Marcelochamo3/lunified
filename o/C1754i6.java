package o;

import j$.time.Duration;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import lombok.Generated;

/* JADX INFO: renamed from: o.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1754i6 {

    @Generated
    private static final CL d = DL.d(C1754i6.class);
    private final Queue<CompletableFuture<a>> a = new ArrayDeque();
    private final a b = new a();
    private volatile int c;

    /* JADX INFO: renamed from: o.i6$a */
    public final class a {
        public a() {
        }

        public void a() {
            synchronized (C1754i6.this.a) {
                try {
                    CompletableFuture completableFutureD = AbstractC3197x0.D(C1754i6.this.a.poll());
                    if (completableFutureD == null) {
                        C1754i6.c(C1754i6.this);
                    } else {
                        completableFutureD.complete(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C1754i6(int i) {
        this.c = i;
    }

    public static /* synthetic */ int c(C1754i6 c1754i6) {
        int i = c1754i6.c;
        c1754i6.c = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Lj0 lj0, a aVar, Throwable th) {
        this.a.remove(lj0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o.h6] */
    public CompletionStage<a> d(Duration duration) {
        synchronized (this.a) {
            try {
                if (this.c > 0) {
                    this.c--;
                    return CompletableFuture.completedFuture(this.b);
                }
                final Lj0 lj0 = new Lj0();
                lj0.c(duration.toNanos(), TimeUnit.NANOSECONDS).whenComplete((BiConsumer) new BiConsumer() { // from class: o.h6
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        this.a.e(lj0, (C1754i6.a) obj, (Throwable) obj2);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
                this.a.add(lj0);
                return lj0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
