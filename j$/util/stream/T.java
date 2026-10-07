package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class T implements K3, L3 {
    private final boolean a;

    protected T(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return EnumC0177e3.r;
    }

    public final void e(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        (this.a ? new U(abstractC0158b, spliterator, this) : new V(abstractC0158b, spliterator, abstractC0158b.S(this))).invoke();
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
