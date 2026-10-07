package io.sentry.util.thread;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public static final long l = Thread.currentThread().getId();
    public static final b m = new b();

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        return l == Thread.currentThread().getId();
    }
}
