package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Xe0 extends AbstractC0499Ih {
    public C1603gf0 l;
    public String m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f619o;
    public List p;
    public /* synthetic */ Object q;
    public final /* synthetic */ C1603gf0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xe0(C1603gf0 c1603gf0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.r = c1603gf0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(null, null, this);
    }
}
