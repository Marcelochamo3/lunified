package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: o.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1896jg implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ThreadFactoryC1896jg(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, this.b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.b);
        }
    }
}
