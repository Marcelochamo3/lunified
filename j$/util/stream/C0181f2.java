package j$.util.stream;

import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0181f2 extends AbstractC0191h2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0181f2(AbstractC0158b abstractC0158b, int i, Function function, int i2) {
        super(abstractC0158b, i, 1);
        this.m = i2;
        this.n = function;
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        switch (this.m) {
            case 0:
                return new C0233q(this, interfaceC0236q2, 3);
            default:
                return new C0228p(this, interfaceC0236q2);
        }
    }
}
