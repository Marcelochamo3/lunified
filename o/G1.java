package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class G1 implements Application.ActivityLifecycleCallbacks {
    public Object l;
    public Activity m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f270o = false;
    public boolean p = false;
    public boolean q = false;

    public G1(Activity activity) {
        this.m = activity;
        this.n = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.m == activity) {
            this.m = null;
            this.p = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.p || this.q || this.f270o) {
            return;
        }
        Object obj = this.l;
        try {
            Object obj2 = H1.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.n) {
                H1.g.postAtFrontOfQueue(new RunnableC1938k1(H1.b.get(activity), obj2, 3, false));
                this.q = true;
                this.l = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.m == activity) {
            this.f270o = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
