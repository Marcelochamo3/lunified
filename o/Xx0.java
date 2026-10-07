package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Xx0 extends AbstractC0499Ih {
    public C1152by0 l;
    public ArrayList m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1152by0 f628o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xx0(C1152by0 c1152by0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f628o = c1152by0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return C1152by0.q(this.f628o, this);
    }
}
