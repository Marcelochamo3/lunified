package o;

/* JADX INFO: loaded from: classes.dex */
public final class G9 extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ I9 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G9(I9 i9, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = i9;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object objZ = I9.z(this.m, this);
        return objZ == EnumC1706hi.l ? objZ : new C0779Tc(objZ);
    }
}
