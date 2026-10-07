package io.sentry.android.core;

import io.sentry.C0039e0;
import io.sentry.U0;

/* JADX INFO: renamed from: io.sentry.android.core.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0010g implements U0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ ActivityLifecycleIntegration m;
    public final /* synthetic */ io.sentry.W n;

    public /* synthetic */ C0010g(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.W w, int i) {
        this.l = i;
        this.m = activityLifecycleIntegration;
        this.n = w;
    }

    @Override // io.sentry.U0
    public final void c(io.sentry.Q q) {
        switch (this.l) {
            case 0:
                this.m.getClass();
                q.n(new C0039e0(this.n, 3, q));
                break;
            default:
                ActivityLifecycleIntegration activityLifecycleIntegration = this.m;
                activityLifecycleIntegration.getClass();
                q.n(new C0011h(activityLifecycleIntegration, q, this.n));
                break;
        }
    }
}
