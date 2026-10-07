package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1886jb extends C0678Pf {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C1886jb.class, "_resumed");
    private volatile int _resumed;

    public C1886jb(InterfaceC0473Hh interfaceC0473Hh, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC0473Hh + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }
}
