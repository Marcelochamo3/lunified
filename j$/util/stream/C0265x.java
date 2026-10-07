package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0265x extends AbstractC0164c0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0265x(AbstractC0158b abstractC0158b, int i, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new C0252u(this, interfaceC0236q2, 2);
            case 1:
                return interfaceC0236q2;
            case 2:
                return new X(this, interfaceC0236q2, 5);
            default:
                return new C0184g0(this, interfaceC0236q2, 2);
        }
    }
}
