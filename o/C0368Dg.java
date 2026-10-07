package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368Dg implements Rb0 {
    public final AtomicReference a;

    public C0368Dg(Rb0 rb0) {
        this.a = new AtomicReference(rb0);
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        Rb0 rb0 = (Rb0) this.a.getAndSet(null);
        if (rb0 != null) {
            return rb0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
