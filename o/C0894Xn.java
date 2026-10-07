package o;

/* JADX INFO: renamed from: o.Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894Xn extends AbstractC0499Ih {
    public C0920Yn l;
    public String m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f623o;
    public /* synthetic */ Object p;
    public final /* synthetic */ C0920Yn q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894Xn(C0920Yn c0920Yn, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.q = c0920Yn;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return C0920Yn.f(this.q, null, this);
    }
}
