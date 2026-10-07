package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I5 implements Executor {
    public final /* synthetic */ int l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.l) {
            case 0:
                J5.F().V.W.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
