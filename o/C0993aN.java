package o;

import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: renamed from: o.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993aN extends AbstractC0499Ih {
    public MainTvActivity l;
    public /* synthetic */ Object m;
    public final /* synthetic */ MainTvActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f675o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993aN(MainTvActivity mainTvActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = mainTvActivity;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f675o |= Integer.MIN_VALUE;
        return MainTvActivity.x(this.n, false, this);
    }
}
