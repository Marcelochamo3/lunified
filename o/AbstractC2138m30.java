package o;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: o.m30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2138m30 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC1474fG.j(activity, "activity");
        AbstractC1474fG.j(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
