package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q90 extends AbstractC3083vr {
    public final ExecutorC1510fi n;

    public Q90(int i, int i2, long j, String str) {
        this.n = new ExecutorC1510fi(i, i2, j, str);
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        ExecutorC1510fi.i(this.n, runnable, false, 6);
    }

    @Override // o.AbstractC1217ci
    public final void X(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        ExecutorC1510fi.i(this.n, runnable, true, 2);
    }
}
