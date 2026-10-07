package o;

/* JADX INFO: renamed from: o.q20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2524q20 extends AbstractC0499Ih {
    public String l;
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20 f985o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2524q20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f985o = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f985o.c(null, null, this);
    }
}
