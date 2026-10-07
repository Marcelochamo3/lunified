package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1716hn extends AbstractRunnableC3163wi0 {
    public int n;

    public AbstractC1716hn(int i) {
        super(0L, Bi0.g);
        this.n = i;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0473Hh e();

    public Throwable f(Object obj) {
        C0678Pf c0678Pf = obj instanceof C0678Pf ? (C0678Pf) obj : null;
        if (c0678Pf != null) {
            return c0678Pf.a;
        }
        return null;
    }

    public final void l(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC3409z9.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC1474fG.g(th);
        Pu0.m(e().g(), new C1900ji("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object n();

    @Override // java.lang.Runnable
    public final void run() {
        Object objK = C2985uq0.a;
        C2102ll c2102ll = this.m;
        try {
            InterfaceC0473Hh interfaceC0473HhE = e();
            AbstractC1474fG.h(interfaceC0473HhE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1520fn c1520fn = (C1520fn) interfaceC0473HhE;
            InterfaceC0473Hh interfaceC0473Hh = c1520fn.p;
            Object obj = c1520fn.r;
            InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
            Object objI = Ou0.I(interfaceC1022aiG, obj);
            C2791sq0 c2791sq0K = objI != Ou0.f ? AbstractC1923jt0.K(interfaceC0473Hh, interfaceC1022aiG, objI) : null;
            try {
                InterfaceC1022ai interfaceC1022aiG2 = interfaceC0473Hh.g();
                Object objN = n();
                Throwable thF = f(objN);
                AH ah = (thF == null && AP.k(this.n)) ? (AH) interfaceC1022aiG2.q(C2691rp.v) : null;
                if (ah != null && !ah.a()) {
                    CancellationException cancellationExceptionH = ((JH) ah).H();
                    c(objN, cancellationExceptionH);
                    interfaceC0473Hh.j(Jp0.k(cancellationExceptionH));
                } else if (thF != null) {
                    interfaceC0473Hh.j(Jp0.k(thF));
                } else {
                    interfaceC0473Hh.j(i(objN));
                }
                if (c2791sq0K == null || c2791sq0K.l0()) {
                    Ou0.y(interfaceC1022aiG, objI);
                }
                try {
                    c2102ll.getClass();
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                l(null, C2536q80.a(objK));
            } catch (Throwable th2) {
                if (c2791sq0K == null || c2791sq0K.l0()) {
                    Ou0.y(interfaceC1022aiG, objI);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c2102ll.getClass();
            } catch (Throwable th4) {
                objK = Jp0.k(th4);
            }
            l(th3, C2536q80.a(objK));
        }
    }

    public Object i(Object obj) {
        return obj;
    }
}
