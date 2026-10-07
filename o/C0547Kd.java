package o;

/* JADX INFO: renamed from: o.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0547Kd extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0650Od n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f366o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0547Kd(C0650Od c0650Od, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0650Od;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f366o |= Integer.MIN_VALUE;
        return this.n.e(null, null, this);
    }
}
