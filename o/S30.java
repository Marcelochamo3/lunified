package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class S30 extends AbstractC0499Ih {
    public Context l;
    public /* synthetic */ Object m;
    public final /* synthetic */ O9 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f503o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S30(O9 o9, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = o9;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f503o |= Integer.MIN_VALUE;
        return this.n.D(this);
    }
}
