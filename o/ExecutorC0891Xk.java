package o;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0891Xk extends AbstractC3083vr implements Executor {
    public static final ExecutorC0891Xk n = new ExecutorC0891Xk();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC1217ci f621o;

    static {
        AbstractC1217ci c1868jK;
        C3470zq0 c3470zq0 = C3470zq0.n;
        int i = Vh0.a;
        if (64 >= i) {
            i = 64;
        }
        int I = AbstractC0397Ej.I("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        c3470zq0.getClass();
        if (I < 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(I, "Expected positive parallelism level, but got ").toString());
        }
        if (I < Bi0.d) {
            if (I < 1) {
                throw new IllegalArgumentException(AbstractC1674hK.n(I, "Expected positive parallelism level, but got ").toString());
            }
            c1868jK = new C1868jK(c3470zq0, I);
        }
        c1868jK = c3470zq0;
        f621o = c1868jK;
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        f621o.W(interfaceC1022ai, runnable);
    }

    @Override // o.AbstractC1217ci
    public final void X(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        f621o.X(interfaceC1022ai, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        W(C1038aq.l, runnable);
    }

    @Override // o.AbstractC1217ci
    public final String toString() {
        return "Dispatchers.IO";
    }
}
