package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.un0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2979un0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC0471Hf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ds0 f1061o;
    public final /* synthetic */ AtomicReference p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979un0(InterfaceC0471Hf interfaceC0471Hf, Ds0 ds0, AtomicReference atomicReference, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC0471Hf;
        this.f1061o = ds0;
        this.p = atomicReference;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2979un0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2979un0(this.n, this.f1061o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Ds0 ds0 = this.f1061o;
        InterfaceC1022ai interfaceC1022ai = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                if (((JH) interfaceC1022ai).U()) {
                    return c2985uq0;
                }
                C1816io0 c1816io0 = C1816io0.b;
                this.m = 1;
                obj = C1816io0.I(ds0, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            Js0 js0 = (Js0) obj;
            if (!((JH) interfaceC1022ai).U()) {
                ((C0497If) interfaceC1022ai).X(new C2495pn0(js0, ds0));
            }
        } catch (Exception e) {
            this.p.set(e);
        }
        return c2985uq0;
    }
}
