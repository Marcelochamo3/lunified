package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765So implements Rb0, InterfaceC0791To {
    public final /* synthetic */ int a;
    public final Rb0 b;
    public final int c;

    public C0765So(Rb0 rb0, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                AbstractC1474fG.j(rb0, "sequence");
                this.b = rb0;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
            default:
                AbstractC1474fG.j(rb0, "sequence");
                this.b = rb0;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // o.InterfaceC0791To
    public final Rb0 a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new C0765So(this, i, 1) : new C2580qh0(this.b, i2, i3);
            default:
                return i >= this.c ? this : new C0765So(this.b, i, 1);
        }
    }

    @Override // o.InterfaceC0791To
    public final Rb0 b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new C0765So(this, i, 0) : new C0765So(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? C1624gq.a : new C2580qh0(this.b, i, i3);
        }
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C0739Ro(this);
            default:
                return new C0739Ro(this, (byte) 0);
        }
    }
}
