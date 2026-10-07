package o;

import com.skidush.clonex.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class UL extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ LoginActivity m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL(LoginActivity loginActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = loginActivity;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return LoginActivity.E(this.m, null, null, this);
    }
}
