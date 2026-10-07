package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3440zb0 extends AbstractC2189mg implements InterfaceC1685hV {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1157o = AtomicIntegerFieldUpdater.newUpdater(AbstractC3440zb0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long n;

    public AbstractC3440zb0(long j, AbstractC3440zb0 abstractC3440zb0, int i) {
        super(abstractC3440zb0);
        this.n = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // o.AbstractC2189mg
    public final boolean c() {
        return f1157o.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1157o.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC1022ai interfaceC1022ai);

    public final void h() {
        if (f1157o.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f1157o;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
