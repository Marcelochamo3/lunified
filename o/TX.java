package o;

/* JADX INFO: loaded from: classes.dex */
public final class TX extends AbstractC0499Ih {
    public C1590gY l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1590gY f535o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TX(C1590gY c1590gY, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f535o = c1590gY;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f535o.h(null, 0, this);
    }
}
