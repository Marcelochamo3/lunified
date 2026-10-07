package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0257v extends AbstractC0191h2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0257v(AbstractC0158b abstractC0158b, int i, Object obj, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257v(AbstractC0158b abstractC0158b, Consumer consumer) {
        super(abstractC0158b, 0, 1);
        this.m = 3;
        this.n = consumer;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new C0252u(this, interfaceC0236q2, 0);
            case 1:
                return new X(this, interfaceC0236q2, 0);
            case 2:
                return new C0184g0(this, interfaceC0236q2, 0);
            case 3:
                return new C0233q(this, interfaceC0236q2, 1);
            default:
                return new C0233q(this, interfaceC0236q2, 2);
        }
    }
}
