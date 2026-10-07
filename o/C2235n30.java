package o;

import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: o.n30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2235n30 extends AbstractC0948Zp {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public C2235n30(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        this.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC1474fG.j(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.l + 1;
        processLifecycleOwner.l = i;
        if (i == 1 && processLifecycleOwner.f29o) {
            processLifecycleOwner.q.d(SJ.ON_START);
            processLifecycleOwner.f29o = false;
        }
    }
}
