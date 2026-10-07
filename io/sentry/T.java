package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface T {
    boolean d();

    void j(long j);

    Future submit(Runnable runnable);

    Future u(Runnable runnable, long j);
}
