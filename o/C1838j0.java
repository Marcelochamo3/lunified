package o;

/* JADX INFO: renamed from: o.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1838j0 extends AbstractC1376eG {
    @Override // o.AbstractC1376eG
    public final void A(C1936k0 c1936k0, Thread thread) {
        c1936k0.a = thread;
    }

    @Override // o.AbstractC1376eG
    public final boolean f(AbstractFutureC2034l0 abstractFutureC2034l0, C1644h0 c1644h0) {
        C1644h0 c1644h1 = C1644h0.b;
        synchronized (abstractFutureC2034l0) {
            try {
                if (abstractFutureC2034l0.b != c1644h0) {
                    return false;
                }
                abstractFutureC2034l0.b = c1644h1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC1376eG
    public final boolean g(AbstractFutureC2034l0 abstractFutureC2034l0, Object obj, Object obj2) {
        synchronized (abstractFutureC2034l0) {
            try {
                if (abstractFutureC2034l0.a != obj) {
                    return false;
                }
                abstractFutureC2034l0.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC1376eG
    public final boolean h(AbstractFutureC2034l0 abstractFutureC2034l0, C1936k0 c1936k0, C1936k0 c1936k1) {
        synchronized (abstractFutureC2034l0) {
            try {
                if (abstractFutureC2034l0.c != c1936k0) {
                    return false;
                }
                abstractFutureC2034l0.c = c1936k1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC1376eG
    public final void z(C1936k0 c1936k0, C1936k0 c1936k1) {
        c1936k0.b = c1936k1;
    }
}
