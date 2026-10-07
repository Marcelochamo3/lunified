package io.sentry;

import java.util.concurrent.ThreadFactory;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final class B implements ThreadFactory {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryHostnameCache-");
                int i = this.b;
                this.b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i2 = this.b;
                this.b = i2 + 1;
                sb2.append(i2);
                Thread thread2 = new Thread(runnable, sb2.toString());
                thread2.setDaemon(true);
                return thread2;
            case 2:
                AbstractC1474fG.j(runnable, "r");
                StringBuilder sb3 = new StringBuilder("SentryReplayRecorder-");
                int i3 = this.b;
                this.b = i3 + 1;
                sb3.append(i3);
                Thread thread3 = new Thread(runnable, sb3.toString());
                thread3.setDaemon(true);
                return thread3;
            case 3:
                AbstractC1474fG.j(runnable, "r");
                StringBuilder sb4 = new StringBuilder("SentryWindowRecorder-");
                int i4 = this.b;
                this.b = i4 + 1;
                sb4.append(i4);
                Thread thread4 = new Thread(runnable, sb4.toString());
                thread4.setDaemon(true);
                return thread4;
            case 4:
                AbstractC1474fG.j(runnable, "r");
                StringBuilder sb5 = new StringBuilder("SentryReplayIntegration-");
                int i5 = this.b;
                this.b = i5 + 1;
                sb5.append(i5);
                Thread thread5 = new Thread(runnable, sb5.toString());
                thread5.setDaemon(true);
                return thread5;
            default:
                StringBuilder sb6 = new StringBuilder("SentryAsyncConnection-");
                int i6 = this.b;
                this.b = i6 + 1;
                sb6.append(i6);
                Thread thread6 = new Thread(runnable, sb6.toString());
                thread6.setDaemon(true);
                return thread6;
        }
    }
}
