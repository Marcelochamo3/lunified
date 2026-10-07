package o;

/* JADX INFO: renamed from: o.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855Wa extends AbstractC0499Ih {
    public InterfaceC2622r30 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0881Xa n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f596o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0855Wa(C0881Xa c0881Xa, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0881Xa;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f596o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
