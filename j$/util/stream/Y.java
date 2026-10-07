package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC0164c0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC0158b abstractC0158b, int i, Object obj, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC0158b abstractC0158b, IntConsumer intConsumer) {
        super(abstractC0158b, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new X(this, interfaceC0236q2, 1);
            case 1:
                return new X(this, interfaceC0236q2, 2);
            case 2:
                return new C0154a0(this, interfaceC0236q2);
            case 3:
                return new C0233q(this, interfaceC0236q2, 4);
            default:
                return new C0171d2(this, interfaceC0236q2);
        }
    }
}
