package o;

/* JADX INFO: loaded from: classes.dex */
public final class RI extends AbstractC0499Ih {
    public ZI l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f486o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ZI q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RI(ZI zi, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.q = zi;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.h(null, 0, this);
    }
}
