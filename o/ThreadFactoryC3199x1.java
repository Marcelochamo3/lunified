package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: o.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3199x1 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ThreadFactoryC3199x1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new RunnableC3102w1(0, runnable), "glide-active-resources");
            default:
                return new C1850j6(runnable);
        }
    }
}
