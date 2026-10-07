package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class A7 extends EH {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(A7.class, Object.class, "_disposer");
    private volatile Object _disposer;
    public final InterfaceC1594gb p;
    public InterfaceC2300nn q;
    public final /* synthetic */ C7 r;

    public A7(C7 c7, C1692hb c1692hb) {
        this.r = c7;
        this.p = c1692hb;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        q((Throwable) obj);
        return C2985uq0.a;
    }

    @Override // o.EH
    public final void q(Throwable th) {
        InterfaceC1594gb interfaceC1594gb = this.p;
        if (th != null) {
            J2 j2S = interfaceC1594gb.s(th);
            if (j2S != null) {
                interfaceC1594gb.u(j2S);
                B7 b7 = (B7) s.get(this);
                if (b7 != null) {
                    b7.d();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C7.b;
        C7 c7 = this.r;
        if (atomicIntegerFieldUpdater.decrementAndGet(c7) == 0) {
            InterfaceC1323dm[] interfaceC1323dmArr = c7.a;
            ArrayList arrayList = new ArrayList(interfaceC1323dmArr.length);
            for (InterfaceC1323dm interfaceC1323dm : interfaceC1323dmArr) {
                arrayList.add(interfaceC1323dm.i());
            }
            interfaceC1594gb.j(arrayList);
        }
    }
}
