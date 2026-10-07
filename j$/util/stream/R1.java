package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class R1 implements V1, InterfaceC0226o2 {
    private boolean a;
    private int b;
    final /* synthetic */ IntBinaryOperator c;

    R1(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
        } else {
            i = this.c.applyAsInt(this.b, i);
        }
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        R1 r1 = (R1) v1;
        if (r1.a) {
            return;
        }
        accept(r1.b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalInt.empty() : OptionalInt.of(this.b);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
