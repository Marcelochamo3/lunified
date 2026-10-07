package o;

import java.util.List;

/* JADX INFO: renamed from: o.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539Jv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ds0 f353o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539Jv(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f353o = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0539Jv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0539Jv c0539Jv = new C0539Jv(this.f353o, interfaceC0473Hh);
        c0539Jv.n = obj;
        return c0539Jv;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        Ds0 ds0 = this.f353o;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            C0513Iv c0513Iv = new C0513Iv(ds0, null);
            this.n = interfaceC1608gi;
            this.m = 1;
            obj = Nr0.J(8000L, c0513Iv, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        List list = (List) obj;
        if (list != null) {
            return list;
        }
        String str = ds0.m;
        return C1233cq.l;
    }
}
