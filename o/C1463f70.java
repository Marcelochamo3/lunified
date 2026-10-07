package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: o.f70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1463f70 implements Application.ActivityLifecycleCallbacks {
    public static final C1365e70 Companion = new C1365e70();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC1474fG.j(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C1463f70());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        int i = FragmentC1561g70.m;
        AbstractC1474fG.m(activity, SJ.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
        AbstractC1474fG.j(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }
}
