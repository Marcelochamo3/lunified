package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1696hd extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
