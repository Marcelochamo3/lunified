package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 implements Executor {
    public final /* synthetic */ int l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.l) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                Kr0.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
