package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2671rf implements InterfaceC1022ai, Serializable {
    public final InterfaceC1022ai l;
    public final InterfaceC0914Yh m;

    public C2671rf(InterfaceC0914Yh interfaceC0914Yh, InterfaceC1022ai interfaceC1022ai) {
        AbstractC1474fG.j(interfaceC1022ai, "left");
        AbstractC1474fG.j(interfaceC0914Yh, "element");
        this.l = interfaceC1022ai;
        this.m = interfaceC0914Yh;
    }

    private final Object writeReplace() {
        int iB = b();
        InterfaceC1022ai[] interfaceC1022aiArr = new InterfaceC1022ai[iB];
        C2628r60 c2628r60 = new C2628r60();
        l(C2985uq0.a, new C2575qf(interfaceC1022aiArr, c2628r60));
        if (c2628r60.l == iB) {
            return new C2381of(interfaceC1022aiArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai Q(InterfaceC1022ai interfaceC1022ai) {
        AbstractC1474fG.j(interfaceC1022ai, "context");
        return interfaceC1022ai == C1038aq.l ? this : (InterfaceC1022ai) interfaceC1022ai.l(this, C2478pf.f976o);
    }

    public final int b() {
        int i = 2;
        C2671rf c2671rf = this;
        while (true) {
            InterfaceC1022ai interfaceC1022ai = c2671rf.l;
            c2671rf = interfaceC1022ai instanceof C2671rf ? (C2671rf) interfaceC1022ai : null;
            if (c2671rf == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this != obj) {
            if (!(obj instanceof C2671rf)) {
                return false;
            }
            C2671rf c2671rf = (C2671rf) obj;
            if (c2671rf.b() != b()) {
                return false;
            }
            C2671rf c2671rf2 = this;
            while (true) {
                InterfaceC0914Yh interfaceC0914Yh = c2671rf2.m;
                if (!AbstractC1474fG.b(c2671rf.q(interfaceC0914Yh.getKey()), interfaceC0914Yh)) {
                    zB = false;
                    break;
                }
                InterfaceC1022ai interfaceC1022ai = c2671rf2.l;
                if (!(interfaceC1022ai instanceof C2671rf)) {
                    AbstractC1474fG.h(interfaceC1022ai, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0914Yh interfaceC0914Yh2 = (InterfaceC0914Yh) interfaceC1022ai;
                    zB = AbstractC1474fG.b(c2671rf.q(interfaceC0914Yh2.getKey()), interfaceC0914Yh2);
                    break;
                }
                c2671rf2 = (C2671rf) interfaceC1022ai;
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.m.hashCode() + this.l.hashCode();
    }

    @Override // o.InterfaceC1022ai
    public final Object l(Object obj, InterfaceC0775Sy interfaceC0775Sy) {
        return interfaceC0775Sy.i(this.l.l(obj, interfaceC0775Sy), this.m);
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai p(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        InterfaceC0914Yh interfaceC0914Yh = this.m;
        InterfaceC0914Yh interfaceC0914YhQ = interfaceC0914Yh.q(interfaceC0940Zh);
        InterfaceC1022ai interfaceC1022ai = this.l;
        if (interfaceC0914YhQ != null) {
            return interfaceC1022ai;
        }
        InterfaceC1022ai interfaceC1022aiP = interfaceC1022ai.p(interfaceC0940Zh);
        if (interfaceC1022aiP == interfaceC1022ai) {
            return this;
        }
        return interfaceC1022aiP == C1038aq.l ? interfaceC0914Yh : new C2671rf(interfaceC0914Yh, interfaceC1022aiP);
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC0914Yh q(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        C2671rf c2671rf = this;
        while (true) {
            InterfaceC0914Yh interfaceC0914YhQ = c2671rf.m.q(interfaceC0940Zh);
            if (interfaceC0914YhQ != null) {
                return interfaceC0914YhQ;
            }
            InterfaceC1022ai interfaceC1022ai = c2671rf.l;
            if (!(interfaceC1022ai instanceof C2671rf)) {
                return interfaceC1022ai.q(interfaceC0940Zh);
            }
            c2671rf = (C2671rf) interfaceC1022ai;
        }
    }

    public final String toString() {
        return "[" + ((String) l("", C2478pf.n)) + ']';
    }
}
