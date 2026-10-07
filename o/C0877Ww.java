package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877Ww extends L1 {
    public final /* synthetic */ AtomicReference a;

    public C0877Ww(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // o.L1
    public final void a(Object obj) {
        L1 l1 = (L1) this.a.get();
        if (l1 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        l1.a(obj);
    }
}
