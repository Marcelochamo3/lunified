package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    public final Thread l;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.config.a.C(thread, "Thread must be provided.");
        this.l = thread;
        setStackTrace(thread.getStackTrace());
    }
}
