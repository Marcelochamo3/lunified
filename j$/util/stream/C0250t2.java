package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0250t2 extends AbstractC0206k2 {
    long b;
    long c;
    final /* synthetic */ C0255u2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0250t2(C0255u2 c0255u2, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = c0255u2;
        this.b = c0255u2.m;
        long j = c0255u2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a.l(AbstractC0274z0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
