package o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1710hk implements Executor {
    public final /* synthetic */ Handler l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.l.post(runnable);
    }
}
