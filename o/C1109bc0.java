package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109bc0 implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ Zb0 n;

    public C1109bc0(Zb0 zb0, int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.n = zb0;
                this.m = zb0.c();
                break;
            default:
                this.n = zb0;
                this.m = zb0.c();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.l) {
            case 0:
                return this.m > 0;
            default:
                return this.m > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                Zb0 zb0 = this.n;
                int iC = zb0.c();
                int i = this.m;
                this.m = i - 1;
                return zb0.f(iC - i);
            default:
                Zb0 zb1 = this.n;
                int iC2 = zb1.c();
                int i2 = this.m;
                this.m = i2 - 1;
                return zb1.d(iC2 - i2);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
