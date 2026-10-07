package o;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: o.vw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3094vw0 {
    public AbstractC2997uw0 a;

    public C3094vw0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new C2900tw0(E0.k(i, interpolator, j));
        } else {
            this.a = new C2706rw0(i, interpolator, j);
        }
    }
}
