package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0161b2 extends W1 implements V1 {
    long b;

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

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
