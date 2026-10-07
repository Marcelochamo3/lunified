package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.Pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0678Pf {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C0678Pf.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public C0678Pf(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
