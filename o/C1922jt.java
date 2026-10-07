package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1922jt extends AbstractC0499Ih {
    public List l;
    public Collection m;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f855o;
    public final /* synthetic */ C2409ot p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1922jt(C2409ot c2409ot, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c2409ot;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f855o = obj;
        this.q |= Integer.MIN_VALUE;
        return C2409ot.t(this.p, null, this);
    }
}
