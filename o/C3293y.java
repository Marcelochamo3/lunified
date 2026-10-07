package o;

/* JADX INFO: renamed from: o.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3293y extends AbstractC1370eA {
    @Override // o.AbstractC1370eA
    public final void J(D d, D d2) {
        d.b = d2;
    }

    @Override // o.AbstractC1370eA
    public final void K(D d, Thread thread) {
        d.a = thread;
    }

    @Override // o.AbstractC1370eA
    public final boolean d(E e, Object obj, Object obj2) {
        synchronized (e) {
            try {
                if (e.e != obj) {
                    return false;
                }
                e.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC1370eA
    public final boolean e(E e, D d, D d2) {
        synchronized (e) {
            try {
                if (e.g != d) {
                    return false;
                }
                e.g = d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC1370eA
    public final C3099w o(E e) {
        C3099w c3099w;
        C3099w c3099w2 = C3099w.b;
        synchronized (e) {
            c3099w = e.f;
            if (c3099w != c3099w2) {
                e.f = c3099w2;
            }
        }
        return c3099w;
    }

    @Override // o.AbstractC1370eA
    public final D p(E e) {
        D d;
        D d2 = D.c;
        synchronized (e) {
            d = e.g;
            if (d != d2) {
                e.g = d2;
            }
        }
        return d;
    }
}
