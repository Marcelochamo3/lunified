package o;

/* JADX INFO: renamed from: o.h50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1655h50 extends AbstractC0499Ih {
    public C1292dT l;
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1292dT f810o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655h50(C1292dT c1292dT, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f810o = c1292dT;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        C1292dT.h(this.f810o, null, this);
        return EnumC1706hi.l;
    }
}
