package o;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: o.o30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2332o30 extends AbstractC0948Zp {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public C2332o30(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // o.AbstractC0948Zp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC1561g70.m;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1474fG.h(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1561g70) fragmentFindFragmentByTag).l = this.this$0.s;
        }
    }

    @Override // o.AbstractC0948Zp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.m - 1;
        processLifecycleOwner.m = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.p;
            AbstractC1474fG.g(handler);
            handler.postDelayed(processLifecycleOwner.r, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1474fG.j(activity, "activity");
        AbstractC2138m30.a(activity, new C2235n30(this.this$0));
    }

    @Override // o.AbstractC0948Zp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.l - 1;
        processLifecycleOwner.l = i;
        if (i == 0 && processLifecycleOwner.n) {
            processLifecycleOwner.q.d(SJ.ON_STOP);
            processLifecycleOwner.f29o = true;
        }
    }
}
