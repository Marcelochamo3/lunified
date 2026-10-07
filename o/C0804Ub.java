package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0804Ub extends AbstractC0499Ih {
    public C0856Wb l;
    public Serializable m;
    public InterfaceC0412Ey n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f555o;
    public /* synthetic */ Object p;
    public final /* synthetic */ C0856Wb q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0804Ub(C0856Wb c0856Wb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.q = c0856Wb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, false, null, null, this);
    }
}
