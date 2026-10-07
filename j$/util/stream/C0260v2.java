package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0260v2 extends AbstractC0211l2 {
    long b;
    long c;
    final /* synthetic */ C0264w2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0260v2(C0264w2 c0264w2, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = c0264w2;
        this.b = c0264w2.m;
        long j = c0264w2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a.l(AbstractC0274z0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
