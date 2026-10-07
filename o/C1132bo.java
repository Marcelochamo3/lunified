package o;

import java.util.List;

/* JADX INFO: renamed from: o.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1132bo extends AbstractC0499Ih {
    public Object l;
    public List m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1424eo f704o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132bo(C1424eo c1424eo, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f704o = c1424eo;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f704o.g(this);
    }
}
