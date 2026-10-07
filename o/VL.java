package o;

import com.skidush.clonex.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class VL extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f571o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VL(LoginActivity loginActivity, String str, String str2, String str3, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.n = loginActivity;
        this.f571o = str;
        this.p = str2;
        this.q = str3;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                String str = this.p;
                String str2 = this.q;
                return new VL(this.n, this.f571o, str, str2, (InterfaceC0473Hh) obj, 0).r(C2985uq0.a);
            default:
                String str3 = this.p;
                String str4 = this.q;
                return new VL(this.n, this.f571o, str3, str4, (InterfaceC0473Hh) obj, 1).r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) {
        OV ovE;
        LoginActivity loginActivity = this.n;
        String str = this.q;
        String str2 = this.p;
        String str3 = this.f571o;
        switch (this.m) {
            case 0:
                Jp0.O(obj);
                C3084vr0 c3084vr0 = C3084vr0.a;
                if (C3084vr0.s()) {
                    C1791ib0 c1791ib0 = C1791ib0.a;
                    ovE = C1791ib0.e();
                } else {
                    ovE = loginActivity.Q;
                    if (ovE == null) {
                        AbstractC1474fG.U("client");
                        throw null;
                    }
                }
                C1951k70 c1951k70F = LoginActivity.F(loginActivity, str3, str2, str);
                C3084vr0.s();
                return LoginActivity.D(loginActivity, ovE, c1951k70F);
            default:
                Jp0.O(obj);
                return LoginActivity.D(loginActivity, C1791ib0.a.c(), LoginActivity.F(loginActivity, str3, str2, str));
        }
    }
}
