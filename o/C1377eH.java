package o;

/* JADX INFO: renamed from: o.eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1377eH extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2933uH n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f750o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377eH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f750o |= Integer.MIN_VALUE;
        return this.n.q(null, this);
    }
}
