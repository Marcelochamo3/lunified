package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.L0;

/* JADX INFO: renamed from: io.sentry.android.core.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0005b implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ L0 m;
    public final /* synthetic */ Activity n;

    public /* synthetic */ RunnableC0005b(L0 l0, Activity activity, int i) {
        this.l = i;
        this.m = l0;
        this.n = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ((FrameMetricsAggregator) this.m.a).a.j(this.n);
                break;
            default:
                ((FrameMetricsAggregator) this.m.a).a.C(this.n);
                break;
        }
    }
}
