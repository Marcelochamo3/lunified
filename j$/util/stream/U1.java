package j$.util.stream;

import j$.util.C0147m;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class U1 implements V1, InterfaceC0231p2 {
    private boolean a;
    private long b;
    final /* synthetic */ LongBinaryOperator c;

    U1(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
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

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.a) {
            this.a = false;
        } else {
            j = this.c.applyAsLong(this.b, j);
        }
        this.b = j;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        U1 u1 = (U1) v1;
        if (u1.a) {
            return;
        }
        accept(u1.b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C0147m.a() : C0147m.d(this.b);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
