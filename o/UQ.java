package o;

/* JADX INFO: loaded from: classes.dex */
public final class UQ extends AbstractC0499Ih {
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ VQ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f552o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UQ(VQ vq, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = vq;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f552o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
