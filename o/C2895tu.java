package o;

import java.util.Map;

/* JADX INFO: renamed from: o.tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2895tu extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3380yu f1047o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895tu(String str, C3380yu c3380yu, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f1047o = c3380yu;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2895tu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2895tu(this.n, this.f1047o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String str = this.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            try {
                Js0 js0F = C3380yu.f(this.f1047o, str);
                if (js0F != null) {
                    return js0F;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            Hv0 hv0 = new Hv0();
            Map mapZ = AbstractC3327yN.z(new C1101bX("Referer", str), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"));
            this.m = 1;
            obj = hv0.g(str, mapZ, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return obj;
    }
}
