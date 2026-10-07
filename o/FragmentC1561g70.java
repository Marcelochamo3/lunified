package o;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: o.g70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC1561g70 extends Fragment {
    public static final /* synthetic */ int m = 0;
    public C0334By l;

    public final void a(SJ sj) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1474fG.i(activity, "activity");
            AbstractC1474fG.m(activity, sj);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(SJ.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(SJ.ON_DESTROY);
        this.l = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(SJ.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0334By c0334By = this.l;
        if (c0334By != null) {
            ((ProcessLifecycleOwner) c0334By.m).b();
        }
        a(SJ.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0334By c0334By = this.l;
        if (c0334By != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c0334By.m;
            int i = processLifecycleOwner.l + 1;
            processLifecycleOwner.l = i;
            if (i == 1 && processLifecycleOwner.f29o) {
                processLifecycleOwner.q.d(SJ.ON_START);
                processLifecycleOwner.f29o = false;
            }
        }
        a(SJ.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(SJ.ON_STOP);
    }
}
