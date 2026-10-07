package o;

/* JADX INFO: renamed from: o.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2234n3 extends AbstractC0499Ih {
    public C2525q3 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2525q3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f929o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234n3(C2525q3 c2525q3, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2525q3;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f929o |= Integer.MIN_VALUE;
        return this.n.e(null, null, this);
    }
}
