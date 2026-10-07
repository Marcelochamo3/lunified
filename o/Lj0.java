package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
class Lj0<T> extends CompletableFuture<T> {

    @Generated
    private static final CL a = DL.d(Lj0.class);
    private static final Method b;

    public static final class a {
        private static final ScheduledThreadPoolExecutor a;

        static {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new Kj0(0));
            a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Thread c(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("dnsjava AsyncSemaphoreTimeoutScheduler");
            return thread;
        }
    }

    static {
        Method method = null;
        if (!System.getProperty("java.version").startsWith("1.")) {
            try {
                method = F70.e().getMethod("orTimeout", Long.TYPE, TimeUnit.class);
            } catch (NoSuchMethodException e) {
                a.F("CompletableFuture.orTimeout method not found in Java 9+, using custom implementation", e);
            }
        }
        b = method;
    }

    public static <T> CompletableFuture<T> d(CompletableFuture<T> completableFuture, long j, TimeUnit timeUnit) {
        Method method = b;
        if (method == null) {
            return g(completableFuture, j, timeUnit);
        }
        try {
            return AbstractC3197x0.D(method.invoke(completableFuture, Long.valueOf(j), timeUnit));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return g(completableFuture, j, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(CompletableFuture completableFuture) {
        if (completableFuture.isDone()) {
            return;
        }
        completableFuture.completeExceptionally(new TimeoutException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(ScheduledFuture scheduledFuture, Object obj, Throwable th) {
        if (th != null || scheduledFuture.isDone()) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    private static <T> CompletableFuture<T> g(CompletableFuture<T> completableFuture, long j, TimeUnit timeUnit) {
        completableFuture.whenComplete((BiConsumer) new SU(1, a.a.schedule(new Jj0(0, completableFuture), j, timeUnit)));
        return completableFuture;
    }

    public CompletableFuture<T> c(long j, TimeUnit timeUnit) {
        return d(this, j, timeUnit);
    }
}
