package o;

/* JADX INFO: renamed from: o.qH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2546qH extends AbstractC0499Ih {
    public C2933uH l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2933uH n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f989o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2546qH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f989o |= Integer.MIN_VALUE;
        return this.n.d(0, this);
    }
}
