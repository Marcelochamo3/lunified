package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.r90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2634r90 extends AbstractC2925u90 implements Iterator {
    public C2731s90 l;
    public C2731s90 m;
    public final /* synthetic */ int n;

    public C2634r90(C2731s90 c2731s90, C2731s90 c2731s91, int i) {
        this.n = i;
        this.l = c2731s91;
        this.m = c2731s90;
    }

    @Override // o.AbstractC2925u90
    public final void a(C2731s90 c2731s90) {
        C2731s90 c2731s90C = null;
        if (this.l == c2731s90 && c2731s90 == this.m) {
            this.m = null;
            this.l = null;
        }
        C2731s90 c2731s91 = this.l;
        if (c2731s91 == c2731s90) {
            this.l = b(c2731s91);
        }
        C2731s90 c2731s92 = this.m;
        if (c2731s92 == c2731s90) {
            C2731s90 c2731s93 = this.l;
            if (c2731s92 != c2731s93 && c2731s93 != null) {
                c2731s90C = c(c2731s92);
            }
            this.m = c2731s90C;
        }
    }

    public final C2731s90 b(C2731s90 c2731s90) {
        switch (this.n) {
            case 0:
                return c2731s90.f1020o;
            default:
                return c2731s90.n;
        }
    }

    public final C2731s90 c(C2731s90 c2731s90) {
        switch (this.n) {
            case 0:
                return c2731s90.n;
            default:
                return c2731s90.f1020o;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2731s90 c2731s90 = this.m;
        C2731s90 c2731s91 = this.l;
        this.m = (c2731s90 == c2731s91 || c2731s91 == null) ? null : c(c2731s90);
        return c2731s90;
    }
}
