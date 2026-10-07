package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0081q {
    public final K a;
    public final ILogger b;
    public final long c;
    public final b2 d;

    public AbstractC0081q(K k, ILogger iLogger, long j, int i) {
        this.a = k;
        this.b = iLogger;
        this.c = j;
        this.d = new b2(new C0047h(i));
    }

    public abstract boolean b(String str);

    public abstract void c(File file, C0104y c0104y);
}
