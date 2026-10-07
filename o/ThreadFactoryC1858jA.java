package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1858jA implements ThreadFactory {
    public final ThreadFactory a;
    public final String b;
    public final C2691rp c;
    public final boolean d;
    public final AtomicInteger e;

    public ThreadFactoryC1858jA(ThreadFactoryC3199x1 threadFactoryC3199x1, String str, boolean z) {
        C2691rp c2691rp = C2691rp.u;
        this.e = new AtomicInteger();
        this.a = threadFactoryC3199x1;
        this.b = str;
        this.c = c2691rp;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(new RunnableC1938k1(this, 6, runnable));
        threadNewThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return threadNewThread;
    }
}
