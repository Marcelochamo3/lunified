package o;

/* JADX INFO: renamed from: o.co0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230co0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f725o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230co0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f725o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1230co0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1230co0 c1230co0 = new C1230co0(this.n, this.f725o, interfaceC0473Hh);
        c1230co0.m = obj;
        return c1230co0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        Jp0.O(obj);
        String str = this.n;
        int i = this.f725o;
        try {
            C1816io0 c1816io0 = C1816io0.b;
            objK = C1816io0.x("/search/" + str + "/" + i + ".json");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            return null;
        }
        return objK;
    }
}
