package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class F2 implements Executor {
    public final /* synthetic */ int l;
    public final Handler m;

    public F2() {
        this.l = 0;
        this.m = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.l) {
            case 0:
                this.m.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.m;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public F2(Handler handler) {
        this.l = 1;
        this.m = handler;
    }
}
