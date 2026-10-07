package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Mc0 extends E {
    @Override // o.E, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // o.E, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // o.E, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e instanceof C2808t;
    }

    @Override // o.E, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // o.E, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }
}
