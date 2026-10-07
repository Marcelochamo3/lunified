package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0201j2 implements InterfaceC0221n2 {
    protected final InterfaceC0236q2 a;

    public AbstractC0201j2(InterfaceC0236q2 interfaceC0236q2) {
        this.a = (InterfaceC0236q2) Objects.requireNonNull(interfaceC0236q2);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public boolean n() {
        return this.a.n();
    }

    @Override // j$.util.stream.InterfaceC0221n2
    public final /* synthetic */ void p(Double d) {
        AbstractC0274z0.e(this, d);
    }
}
