package o;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2187mf extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC1538fw[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f914o;
    public final /* synthetic */ AtomicInteger p;
    public final /* synthetic */ InterfaceC0416Fc q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187mf(InterfaceC1538fw[] interfaceC1538fwArr, int i, AtomicInteger atomicInteger, InterfaceC0416Fc interfaceC0416Fc, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC1538fwArr;
        this.f914o = i;
        this.p = atomicInteger;
        this.q = interfaceC0416Fc;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2187mf) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2187mf(this.n, this.f914o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        AtomicInteger atomicInteger = this.p;
        InterfaceC0416Fc interfaceC0416Fc = this.q;
        try {
            if (i == 0) {
                Jp0.O(obj);
                InterfaceC1538fw[] interfaceC1538fwArr = this.n;
                int i2 = this.f914o;
                InterfaceC1538fw interfaceC1538fw = interfaceC1538fwArr[i2];
                C2090lf c2090lf = new C2090lf(interfaceC0416Fc, i2);
                this.m = 1;
                if (interfaceC1538fw.a(c2090lf, this) == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                interfaceC0416Fc.b(null);
            }
            return C2985uq0.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                interfaceC0416Fc.b(null);
            }
            throw th;
        }
    }
}
