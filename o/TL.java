package o;

import com.skidush.clonex.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class TL extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f533o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TL(LoginActivity loginActivity, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = loginActivity;
        this.f533o = str;
        this.p = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((TL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new TL(this.n, this.f533o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        JL jl;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            }
            Jp0.O(obj);
            LoginActivity loginActivity = this.n;
            String str = this.f533o;
            String str2 = this.p;
            this.m = 1;
            obj = LoginActivity.E(loginActivity, str, str2, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            jl = (JL) obj;
        } catch (Throwable th) {
            jl = new JL(-1, null, th);
        }
        C3362yl c3362yl = AbstractC1910jn.a;
        EM em = FM.a;
        SL sl = new SL(this.n, jl, this.f533o, this.p, null);
        this.m = 2;
        if (AbstractC1376eG.J(em, sl, this) == enumC1706hi) {
            return enumC1706hi;
        }
        return C2985uq0.a;
    }
}
