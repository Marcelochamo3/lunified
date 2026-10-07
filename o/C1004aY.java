package o;

/* JADX INFO: renamed from: o.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004aY extends AbstractC0499Ih {
    public C1590gY l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C1590gY n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f676o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004aY(C1590gY c1590gY, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c1590gY;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f676o |= Integer.MIN_VALUE;
        return this.n.i(0, this);
    }
}
