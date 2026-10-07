package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Bc0 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f186o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ InterfaceC1608gi q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bc0(String str, String str2, Context context, InterfaceC1608gi interfaceC1608gi, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.n = str;
        this.f186o = str2;
        this.p = context;
        this.q = interfaceC1608gi;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                Context context = this.p;
                InterfaceC1608gi interfaceC1608gi = this.q;
                return new Bc0(this.n, this.f186o, context, interfaceC1608gi, (InterfaceC0473Hh) obj, 0).r(C2985uq0.a);
            default:
                Context context2 = this.p;
                InterfaceC1608gi interfaceC1608gi2 = this.q;
                return new Bc0(this.n, this.f186o, context2, interfaceC1608gi2, (InterfaceC0473Hh) obj, 1).r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String str = this.n;
        Context context = this.p;
        String str2 = this.f186o;
        switch (this.m) {
            case 0:
                Jp0.O(obj);
                C1791ib0 c1791ib0 = C1791ib0.a;
                return Cc0.w(str, str2, context, C1791ib0.d(false));
            default:
                Jp0.O(obj);
                return Cc0.w(str, str2, context, C1791ib0.a.c());
        }
    }
}
