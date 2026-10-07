package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0009f implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ ActivityLifecycleIntegration m;
    public final /* synthetic */ io.sentry.V n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ io.sentry.V f75o;

    public /* synthetic */ RunnableC0009f(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.V v, io.sentry.V v2, int i) {
        this.l = i;
        this.m = activityLifecycleIntegration;
        this.n = v;
        this.f75o = v2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                this.m.q(this.n, this.f75o);
                break;
            case 1:
                this.m.q(this.n, this.f75o);
                break;
            default:
                this.m.getClass();
                ActivityLifecycleIntegration.f(this.n, this.f75o);
                break;
        }
    }
}
