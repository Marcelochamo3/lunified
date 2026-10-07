package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Ve0 extends AbstractC0499Ih {
    public C1603gf0 l;
    public Iterator m;
    public C1603gf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f578o;
    public final /* synthetic */ C1603gf0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ve0(C1603gf0 c1603gf0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c1603gf0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f578o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(0, this);
    }
}
