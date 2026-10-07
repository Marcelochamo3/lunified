package o;

import android.content.Context;

/* JADX INFO: renamed from: o.mF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2156mF extends AbstractC0499Ih {
    public Object l;
    public Context m;
    public C1767iF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Exception f911o;
    public /* synthetic */ Object p;
    public final /* synthetic */ C2834tF q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156mF(C2834tF c2834tF, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.q = c2834tF;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(null, null, this);
    }
}
