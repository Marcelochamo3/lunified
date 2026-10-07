package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0206k2 implements InterfaceC0226o2 {
    protected final InterfaceC0236q2 a;

    public AbstractC0206k2(InterfaceC0236q2 interfaceC0236q2) {
        this.a = (InterfaceC0236q2) Objects.requireNonNull(interfaceC0236q2);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public boolean n() {
        return this.a.n();
    }
}
