package o;

/* JADX INFO: renamed from: o.tH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2836tH extends AbstractC0499Ih {
    public C2933uH l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2933uH n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1041o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2836tH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1041o |= Integer.MIN_VALUE;
        return this.n.a(null, 0, this);
    }
}
