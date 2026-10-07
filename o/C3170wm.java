package o;

/* JADX INFO: renamed from: o.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3170wm extends RuntimeException {
    public final transient InterfaceC1022ai l;

    public C3170wm(InterfaceC1022ai interfaceC1022ai) {
        this.l = interfaceC1022ai;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.l.toString();
    }
}
