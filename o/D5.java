package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D5 extends AbstractC0499Ih {
    public H5 l;
    public ArrayList m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H5 f209o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5(H5 h5, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f209o = h5;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f209o.g(this);
    }
}
