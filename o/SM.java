package o;

import com.skidush.clonex.activities.main.MainMobileActivity;

/* JADX INFO: loaded from: classes.dex */
public final class SM extends AbstractC0499Ih {
    public MainMobileActivity l;
    public /* synthetic */ Object m;
    public final /* synthetic */ MainMobileActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f511o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SM(MainMobileActivity mainMobileActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = mainMobileActivity;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f511o |= Integer.MIN_VALUE;
        return MainMobileActivity.x(this.n, false, this);
    }
}
