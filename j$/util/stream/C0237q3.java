package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0237q3 implements InterfaceC0226o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C0237q3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC0274z0.a();
                throw null;
            default:
                AbstractC0274z0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                ((V2) this.b).accept(i);
                break;
            default:
                this.b.accept(i);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC0274z0.l();
                throw null;
            default:
                AbstractC0274z0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC0274z0.g(this, num);
                break;
            default:
                AbstractC0274z0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
