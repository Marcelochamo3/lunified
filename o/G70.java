package o;

import j$.time.Duration;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G70 {

    public class a implements L70 {
        final /* synthetic */ CompletableFuture a;
        final /* synthetic */ H70 b;

        public a(H70 h70, CompletableFuture completableFuture) {
            this.b = h70;
            this.a = completableFuture;
        }

        @Override // o.L70
        public void a(Object obj, Exception exc) {
            this.a.completeExceptionally(exc);
        }

        @Override // o.L70
        public void b(Object obj, AQ aq) {
            this.a.complete(aq);
        }
    }

    public static Duration a(H70 h70) {
        return Duration.ofSeconds(10L);
    }

    public static AQ b(H70 h70, AQ aq) throws IOException {
        try {
            return (AQ) h70.k(aq).toCompletableFuture().get(h70.j().toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw new IOException(e2.getCause());
        } catch (TimeoutException e3) {
            throw new IOException("Timed out while trying to resolve " + aq.n().v() + "/" + C3080vp0.e(aq.n().m) + ", id=" + aq.k().k(), e3);
        }
    }

    public static Object c(H70 h70, AQ aq, L70 l70) {
        Object obj = new Object();
        h70.k(aq).handleAsync(new C0790Tn(l70, 1, obj));
        return obj;
    }

    public static CompletionStage d(H70 h70, AQ aq) {
        return h70.d(aq, ForkJoinPool.commonPool());
    }

    public static CompletionStage e(H70 h70, AQ aq, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        h70.l(aq, new a(h70, completableFuture));
        return completableFuture;
    }

    public static void f(H70 h70, int i) {
        h70.h(i, 0, 0, Collections.emptyList());
    }

    public static void g(H70 h70, int i, int i2, int i3, AbstractC2304np... abstractC2304npArr) {
        h70.h(i, i2, i3, abstractC2304npArr == null ? Collections.emptyList() : Arrays.asList(abstractC2304npArr));
    }

    public static void h(H70 h70, int i) {
        h70.e(Duration.ofSeconds(i));
    }

    public static void i(H70 h70, int i, int i2) {
        h70.e(Duration.ofMillis((((long) i) * 1000) + ((long) i2)));
    }

    public static /* synthetic */ Object j(L70 l70, Object obj, AQ aq, Throwable th) {
        if (th != null) {
            l70.a(obj, th instanceof Exception ? (Exception) th : new Exception(th));
            return null;
        }
        l70.b(obj, aq);
        return null;
    }
}
