package o;

/* JADX INFO: renamed from: o.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3439zb extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0441Gb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1156o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3439zb(C0441Gb c0441Gb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0441Gb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1156o |= Integer.MIN_VALUE;
        return this.n.x(null, null, null, this);
    }
}
