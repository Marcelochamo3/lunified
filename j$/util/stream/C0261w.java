package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0261w extends C {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261w(AbstractC0158b abstractC0158b, int i, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new C0252u(this, interfaceC0236q2, 1);
            case 1:
                return interfaceC0236q2;
            case 2:
                return new C0252u(this, interfaceC0236q2, 4);
            case 3:
                return new Z(1, interfaceC0236q2);
            case 4:
                return new X(this, interfaceC0236q2, 4);
            case 5:
                return new C0189h0(interfaceC0236q2);
            default:
                return new C0184g0(this, interfaceC0236q2, 3);
        }
    }
}
