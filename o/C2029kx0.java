package o;

import java.util.List;

/* JADX INFO: renamed from: o.kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2029kx0 extends Ph0 implements InterfaceC0775Sy {
    public Jb0 m;
    public C1737hx0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f883o;
    public int p;
    public final /* synthetic */ Jb0 q;
    public final /* synthetic */ C1737hx0 r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2029kx0(List list, InterfaceC0473Hh interfaceC0473Hh, Jb0 jb0, C1737hx0 c1737hx0) {
        super(2, interfaceC0473Hh);
        this.q = jb0;
        this.r = c1737hx0;
        this.s = list;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2029kx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2029kx0(this.s, interfaceC0473Hh, this.q, this.r);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C1737hx0 c1737hx0;
        List list;
        Jb0 jb0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.p;
        if (i == 0) {
            Jp0.O(obj);
            Jb0 jb1 = this.q;
            this.m = jb1;
            c1737hx0 = this.r;
            this.n = c1737hx0;
            List list2 = this.s;
            this.f883o = list2;
            this.p = 1;
            Mb0 mb0 = (Mb0) jb1;
            if (mb0.a(this) == enumC1706hi) {
                return enumC1706hi;
            }
            list = list2;
            jb0 = mb0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f883o;
            c1737hx0 = this.n;
            Jb0 jb2 = this.m;
            Jp0.O(obj);
            jb0 = jb2;
        }
        try {
            Lx0 lx0 = Lx0.b;
            return Lx0.r(c1737hx0.a, list);
        } finally {
            ((Mb0) jb0).c();
        }
    }
}
