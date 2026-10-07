package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499Ih extends R7 {
    private final InterfaceC1022ai _context;
    private transient InterfaceC0473Hh<Object> intercepted;

    public AbstractC0499Ih(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1022ai interfaceC1022ai) {
        super(interfaceC0473Hh);
        this._context = interfaceC1022ai;
    }

    @Override // o.InterfaceC0473Hh
    public InterfaceC1022ai g() {
        InterfaceC1022ai interfaceC1022ai = this._context;
        AbstractC1474fG.g(interfaceC1022ai);
        return interfaceC1022ai;
    }

    @Override // o.R7
    public void t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0473Hh<Object> interfaceC0473Hh = this.intercepted;
        if (interfaceC0473Hh != null && interfaceC0473Hh != this) {
            InterfaceC0914Yh interfaceC0914YhQ = g().q(C2691rp.p);
            AbstractC1474fG.g(interfaceC0914YhQ);
            C1520fn c1520fn = (C1520fn) interfaceC0473Hh;
            do {
                atomicReferenceFieldUpdater = C1520fn.s;
            } while (atomicReferenceFieldUpdater.get(c1520fn) == Pu0.b);
            Object obj = atomicReferenceFieldUpdater.get(c1520fn);
            C1692hb c1692hb = obj instanceof C1692hb ? (C1692hb) obj : null;
            if (c1692hb != null) {
                c1692hb.t();
            }
        }
        this.intercepted = C0652Of.m;
    }

    public final InterfaceC0473Hh v() {
        InterfaceC0473Hh<Object> c1520fn = this.intercepted;
        if (c1520fn == null) {
            InterfaceC0525Jh interfaceC0525Jh = (InterfaceC0525Jh) g().q(C2691rp.p);
            c1520fn = interfaceC0525Jh != null ? new C1520fn((AbstractC1217ci) interfaceC0525Jh, this) : this;
            this.intercepted = c1520fn;
        }
        return c1520fn;
    }

    public AbstractC0499Ih(InterfaceC0473Hh interfaceC0473Hh) {
        this(interfaceC0473Hh, interfaceC0473Hh != null ? interfaceC0473Hh.g() : null);
    }
}
