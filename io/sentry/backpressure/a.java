package io.sentry.backpressure;

import io.sentry.AbstractC0031b1;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.T;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, Runnable {
    public final I1 l;
    public int m = 0;

    public a(I1 i1) {
        this.l = i1;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zG = AbstractC0031b1.d().g();
        I1 i1 = this.l;
        if (zG) {
            if (this.m > 0) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.m = 0;
        } else {
            int i = this.m;
            if (i < 10) {
                this.m = i + 1;
                i1.getLogger().h(EnumC0094u1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.m));
            }
        }
        T executorService = i1.getExecutorService();
        if (executorService.d()) {
            return;
        }
        executorService.u(this, 10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        T executorService = this.l.getExecutorService();
        if (executorService.d()) {
            return;
        }
        executorService.u(this, 500);
    }
}
