package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class PN implements OnBackAnimationCallback {
    public final /* synthetic */ NN a;
    public final /* synthetic */ QN b;

    public PN(QN qn, NN nn) {
        this.b = qn;
        this.a = nn;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new E7(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new E7(backEvent));
        }
    }
}
