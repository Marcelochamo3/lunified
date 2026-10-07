package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1935k extends CancellationException {
    public final transient InterfaceC1734hw l;

    public C1935k(InterfaceC1734hw interfaceC1734hw) {
        super("Flow was aborted, no more elements needed");
        this.l = interfaceC1734hw;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
