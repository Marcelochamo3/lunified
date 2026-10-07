package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2580qh0 implements Rb0, InterfaceC0791To {
    public final Rb0 a;
    public final int b;
    public final int c;

    public C2580qh0(Rb0 rb0, int i, int i2) {
        AbstractC1474fG.j(rb0, "sequence");
        this.a = rb0;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1674hK.m(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // o.InterfaceC0791To
    public final Rb0 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return this;
        }
        return new C2580qh0(this.a, i3, i + i3);
    }

    @Override // o.InterfaceC0791To
    public final Rb0 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return C1624gq.a;
        }
        return new C2580qh0(this.a, i3 + i, i2);
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        return new C1934jz(this);
    }
}
