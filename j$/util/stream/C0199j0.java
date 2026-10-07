package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0199j0 extends AbstractC0209l0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0199j0(AbstractC0158b abstractC0158b, int i, Object obj, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199j0(AbstractC0158b abstractC0158b, LongConsumer longConsumer) {
        super(abstractC0158b, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new C0194i0(this, interfaceC0236q2);
            case 1:
                return new C0184g0(this, interfaceC0236q2, 5);
            case 2:
                return new C0171d2(this, interfaceC0236q2);
            default:
                return new C0233q(this, interfaceC0236q2, 5);
        }
    }
}
