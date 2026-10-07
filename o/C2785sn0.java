package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2785sn0 extends Ph0 implements InterfaceC0775Sy {
    public Iterator m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f1033o;
    public final /* synthetic */ InterfaceC0471Hf p;
    public final /* synthetic */ AtomicReference q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2785sn0(List list, InterfaceC0471Hf interfaceC0471Hf, AtomicReference atomicReference, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f1033o = list;
        this.p = interfaceC0471Hf;
        this.q = atomicReference;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2785sn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2785sn0(this.f1033o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Iterator it;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i == 0) {
            Jp0.O(obj);
            it = this.f1033o.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.m;
            Jp0.O(obj);
        }
        while (it.hasNext()) {
            AH ah = (AH) it.next();
            this.m = it;
            this.n = 1;
            if (((JH) ah).W(this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
        InterfaceC1022ai interfaceC1022ai = this.p;
        if (!((JH) interfaceC1022ai).U()) {
            IOException iOException = new IOException("Todos los extractores del grupo fallaron", (Throwable) this.q.get());
            C0497If c0497If = (C0497If) interfaceC1022ai;
            c0497If.getClass();
            c0497If.X(new C0678Pf(iOException, false));
        }
        return C2985uq0.a;
    }
}
