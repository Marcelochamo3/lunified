package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2095lh0 extends AbstractC0845Vq {
    public static final Zg0 d = new Zg0(new C1504ff(11), 2);

    @Override // o.AbstractC1332dr
    public final int a() {
        return ((AbstractC1332dr) this.b).a() * 10;
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        C1196cV c1196cV = (C1196cV) d.get();
        if (c1196cV.q.isInstance(c3176wp2)) {
            c1196cV.m = c3176wp2;
        }
        c1196cV.n = c3176wp2;
        c1196cV.f715o = c3176wp2;
        c1196cV.l = c3176wp2;
        c1196cV.p = c3176wp2.B();
        while (c1196cV.hasNext()) {
            c1196cV.a();
            AbstractC1099bV abstractC1099bV = c1196cV.m;
            if (abstractC1099bV == null) {
                throw new NoSuchElementException();
            }
            c1196cV.f715o = c1196cV.n;
            c1196cV.n = abstractC1099bV;
            c1196cV.p = abstractC1099bV.B();
            c1196cV.m = null;
            C3176wp c3176wp3 = (C3176wp) abstractC1099bV;
            if (c3176wp3 != c3176wp2 && ((AbstractC1332dr) this.b).b(c3176wp2, c3176wp3)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", (AbstractC1332dr) this.b);
    }
}
