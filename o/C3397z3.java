package o;

import android.content.Context;

/* JADX INFO: renamed from: o.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3397z3 extends AbstractC0499Ih {
    public Context l;
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2691rp f1145o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3397z3(C2691rp c2691rp, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f1145o = c2691rp;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1145o.n(null, this);
    }
}
