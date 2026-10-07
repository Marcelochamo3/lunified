package o;

/* JADX INFO: renamed from: o.rx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2708rx0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1015o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2708rx0(String str, String str2, String str3, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = str2;
        this.f1015o = str3;
        this.p = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2708rx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2708rx0(this.m, this.n, this.f1015o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        return Lx0.C(this.p, 100, this.m, this.n, this.f1015o, null).a;
    }
}
