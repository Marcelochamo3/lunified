package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: o.u70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2921u70 implements ThreadFactory {
    public String a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C2824t70(runnable, this.a, this.b);
    }
}
