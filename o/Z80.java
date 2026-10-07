package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.skidush.clonex.utils.RuntimeSecurityGuard;

/* JADX INFO: loaded from: classes.dex */
public final class Z80 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        RuntimeSecurityGuard.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
        AbstractC1474fG.j(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
    }
}
