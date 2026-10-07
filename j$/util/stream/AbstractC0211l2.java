package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0211l2 implements InterfaceC0231p2 {
    protected final InterfaceC0236q2 a;

    public AbstractC0211l2(InterfaceC0236q2 interfaceC0236q2) {
        this.a = (InterfaceC0236q2) Objects.requireNonNull(interfaceC0236q2);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
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
}
