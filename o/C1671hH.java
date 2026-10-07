package o;

/* JADX INFO: renamed from: o.hH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1671hH extends AbstractC0499Ih {
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2933uH n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f811o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671hH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f811o |= Integer.MIN_VALUE;
        return this.n.c(null, null, this);
    }
}
