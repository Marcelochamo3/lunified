package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0258v0 implements InterfaceC0236q2 {
    boolean a;
    boolean b;

    AbstractC0258v0(EnumC0262w0 enumC0262w0) {
        this.b = !enumC0262w0.b;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        return this.a;
    }
}
