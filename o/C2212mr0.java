package o;

/* JADX INFO: renamed from: o.mr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2212mr0 extends AbstractC0499Ih {
    public boolean l;
    public Object m;
    public YS n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f922o;
    public final /* synthetic */ C3084vr0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212mr0(C3084vr0 c3084vr0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c3084vr0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f922o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.j(false, this);
    }
}
