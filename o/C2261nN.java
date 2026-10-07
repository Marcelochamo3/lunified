package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.nN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2261nN extends AbstractC2455pN implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int p;

    public C2261nN(C2552qN c2552qN, int i) {
        this.p = i;
        AbstractC1474fG.j(c2552qN, "map");
        this.f969o = c2552qN;
        this.m = -1;
        this.n = c2552qN.s;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.p) {
            case 0:
                b();
                int i = this.l;
                C2552qN c2552qN = (C2552qN) this.f969o;
                if (i >= c2552qN.q) {
                    throw new NoSuchElementException();
                }
                this.l = i + 1;
                this.m = i;
                C2358oN c2358oN = new C2358oN(c2552qN, i);
                f();
                return c2358oN;
            case 1:
                b();
                int i2 = this.l;
                C2552qN c2552qN2 = (C2552qN) this.f969o;
                if (i2 >= c2552qN2.q) {
                    throw new NoSuchElementException();
                }
                this.l = i2 + 1;
                this.m = i2;
                Object obj = c2552qN2.l[i2];
                f();
                return obj;
            default:
                b();
                int i3 = this.l;
                C2552qN c2552qN3 = (C2552qN) this.f969o;
                if (i3 >= c2552qN3.q) {
                    throw new NoSuchElementException();
                }
                this.l = i3 + 1;
                this.m = i3;
                Object[] objArr = c2552qN3.m;
                AbstractC1474fG.g(objArr);
                Object obj2 = objArr[this.m];
                f();
                return obj2;
        }
    }
}
