package o;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2680rj0 extends Ph0 implements InterfaceC0775Sy {
    public C2196mj0 m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1009o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2680rj0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2680rj0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2680rj0(this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x0158  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d3  */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objB;
        C2196mj0 c2196mj0;
        String str;
        String str2;
        Object objJ;
        C2390oj0 c2390oj0;
        OV ov;
        Object objJ2;
        OV ov2;
        Object objJ3;
        C2196mj0 c2196mj1;
        C2390oj0 c2390oj1;
        Js0 js0;
        C2293nj0 c2293nj0B;
        C2293nj0 c2293nj0B2;
        C3084vr0 c3084vr0;
        Object objK;
        C2390oj0 c2390oj2;
        C2196mj0 c2196mj2;
        OV ov3;
        Object objJ4;
        OV ov4;
        Js0 js1;
        C2293nj0 c2293nj0B3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        switch (this.f1009o) {
            case 0:
                Jp0.O(obj);
                C3359yj0 c3359yj0 = C3359yj0.a;
                this.f1009o = 1;
                objB = c3359yj0.b(this);
                if (objB == enumC1706hi) {
                    return enumC1706hi;
                }
                c2196mj0 = (C2196mj0) objB;
                String str3 = C3068vj0.a;
                LinkedHashMap linkedHashMap = C3068vj0.e;
                StringBuilder sb = new StringBuilder("tigo-");
                str = this.p;
                sb.append(str);
                str2 = (String) linkedHashMap.get(sb.toString());
                if (str2 != null) {
                    str = str2;
                }
                this.m = c2196mj0;
                this.f1009o = 2;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2874tj0(AbstractC1119bh0.D0(120, AbstractC1119bh0.E0(str).toString()), null), this);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                c2390oj0 = (C2390oj0) objJ;
                C3084vr0 c3084vr1 = C3084vr0.a;
                if (!C3084vr0.s() || C3084vr0.q()) {
                    NV nvH = AbstractC1370eA.h();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    nvH.e(20L, timeUnit);
                    nvH.i(30L, timeUnit);
                    C3084vr0.b(nvH);
                    ov = new OV(nvH);
                    String str4 = C3068vj0.a;
                    this.m = c2196mj0;
                    this.n = ov;
                    this.f1009o = 3;
                    objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj0, c2196mj0, this.p, ov, null), this);
                    if (objJ2 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    ov2 = ov;
                    js0 = (Js0) objJ2;
                    String str5 = C3068vj0.a;
                    c2293nj0B = C3068vj0.b(js0.l, ov2);
                    if (c2293nj0B.a == 403) {
                        return C3068vj0.c(js0, c2293nj0B.b, c2196mj0);
                    }
                    C3084vr0 c3084vr2 = C3084vr0.a;
                    if (!C3084vr0.s()) {
                        C3084vr0.s = false;
                        C3084vr0.r = null;
                    }
                    throw new IOException("Tigo rechazó la salida regional");
                }
                OV ov5 = C3068vj0.g;
                this.m = c2196mj0;
                this.n = c2390oj0;
                this.f1009o = 4;
                objJ3 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj0, c2196mj0, this.p, ov5, null), this);
                if (objJ3 == enumC1706hi) {
                    return enumC1706hi;
                }
                c2196mj1 = c2196mj0;
                c2390oj1 = c2390oj0;
                Js0 js2 = (Js0) objJ3;
                String str6 = C3068vj0.a;
                c2293nj0B2 = C3068vj0.b(js2.l, C3068vj0.g);
                if (c2293nj0B2.a == 403) {
                    c3084vr0 = C3084vr0.a;
                    if (!C3084vr0.s()) {
                        this.m = c2196mj1;
                        this.n = c2390oj1;
                        this.f1009o = 5;
                        objK = c3084vr0.k(this);
                        if (objK == enumC1706hi) {
                            return enumC1706hi;
                        }
                        c2390oj2 = c2390oj1;
                        c2196mj2 = c2196mj1;
                        if (!((Boolean) objK).booleanValue()) {
                            throw new IOException("No se pudo desbloquear la transmisión");
                        }
                        C3084vr0 c3084vr3 = C3084vr0.a;
                        NV nvH2 = AbstractC1370eA.h();
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        nvH2.e(20L, timeUnit2);
                        nvH2.i(30L, timeUnit2);
                        C3084vr0.b(nvH2);
                        ov3 = new OV(nvH2);
                        String str7 = C3068vj0.a;
                        this.m = c2196mj2;
                        this.n = ov3;
                        this.f1009o = 6;
                        objJ4 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj2, c2196mj2, this.p, ov3, null), this);
                        if (objJ4 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        ov4 = ov3;
                        js1 = (Js0) objJ4;
                        String str8 = C3068vj0.a;
                        c2293nj0B3 = C3068vj0.b(js1.l, ov4);
                        if (c2293nj0B3.a != 403) {
                            return C3068vj0.c(js1, c2293nj0B3.b, c2196mj2);
                        }
                        C3084vr0 c3084vr4 = C3084vr0.a;
                        C3084vr0.s = false;
                        C3084vr0.r = null;
                        throw new IOException("No se pudo desbloquear la transmisión");
                    }
                }
                return C3068vj0.c(js2, c2293nj0B2.b, c2196mj1);
            case 1:
                Jp0.O(obj);
                objB = obj;
                c2196mj0 = (C2196mj0) objB;
                String str9 = C3068vj0.a;
                LinkedHashMap linkedHashMap2 = C3068vj0.e;
                StringBuilder sb2 = new StringBuilder("tigo-");
                str = this.p;
                sb2.append(str);
                str2 = (String) linkedHashMap2.get(sb2.toString());
                if (str2 != null) {
                    str = str2;
                }
                this.m = c2196mj0;
                this.f1009o = 2;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2874tj0(AbstractC1119bh0.D0(120, AbstractC1119bh0.E0(str).toString()), null), this);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                c2390oj0 = (C2390oj0) objJ;
                C3084vr0 c3084vr5 = C3084vr0.a;
                if (C3084vr0.s()) {
                    break;
                }
                NV nvH3 = AbstractC1370eA.h();
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                nvH3.e(20L, timeUnit3);
                nvH3.i(30L, timeUnit3);
                C3084vr0.b(nvH3);
                ov = new OV(nvH3);
                String str10 = C3068vj0.a;
                this.m = c2196mj0;
                this.n = ov;
                this.f1009o = 3;
                objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj0, c2196mj0, this.p, ov, null), this);
                if (objJ2 == enumC1706hi) {
                    return enumC1706hi;
                }
                ov2 = ov;
                js0 = (Js0) objJ2;
                String str11 = C3068vj0.a;
                c2293nj0B = C3068vj0.b(js0.l, ov2);
                if (c2293nj0B.a == 403) {
                    return C3068vj0.c(js0, c2293nj0B.b, c2196mj0);
                }
                C3084vr0 c3084vr6 = C3084vr0.a;
                if (!C3084vr0.s()) {
                    C3084vr0.s = false;
                    C3084vr0.r = null;
                }
                throw new IOException("Tigo rechazó la salida regional");
            case 2:
                c2196mj0 = this.m;
                Jp0.O(obj);
                objJ = obj;
                c2390oj0 = (C2390oj0) objJ;
                C3084vr0 c3084vr7 = C3084vr0.a;
                if (C3084vr0.s()) {
                    break;
                }
                NV nvH4 = AbstractC1370eA.h();
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                nvH4.e(20L, timeUnit4);
                nvH4.i(30L, timeUnit4);
                C3084vr0.b(nvH4);
                ov = new OV(nvH4);
                String str12 = C3068vj0.a;
                this.m = c2196mj0;
                this.n = ov;
                this.f1009o = 3;
                objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj0, c2196mj0, this.p, ov, null), this);
                if (objJ2 == enumC1706hi) {
                    return enumC1706hi;
                }
                ov2 = ov;
                js0 = (Js0) objJ2;
                String str13 = C3068vj0.a;
                c2293nj0B = C3068vj0.b(js0.l, ov2);
                if (c2293nj0B.a == 403) {
                    return C3068vj0.c(js0, c2293nj0B.b, c2196mj0);
                }
                C3084vr0 c3084vr8 = C3084vr0.a;
                if (!C3084vr0.s()) {
                    C3084vr0.s = false;
                    C3084vr0.r = null;
                }
                throw new IOException("Tigo rechazó la salida regional");
            case 3:
                ov2 = (OV) this.n;
                c2196mj0 = this.m;
                Jp0.O(obj);
                objJ2 = obj;
                js0 = (Js0) objJ2;
                String str14 = C3068vj0.a;
                c2293nj0B = C3068vj0.b(js0.l, ov2);
                if (c2293nj0B.a == 403) {
                    return C3068vj0.c(js0, c2293nj0B.b, c2196mj0);
                }
                C3084vr0 c3084vr9 = C3084vr0.a;
                if (!C3084vr0.s()) {
                    C3084vr0.s = false;
                    C3084vr0.r = null;
                }
                throw new IOException("Tigo rechazó la salida regional");
            case 4:
                c2390oj1 = (C2390oj0) this.n;
                c2196mj1 = this.m;
                Jp0.O(obj);
                objJ3 = obj;
                Js0 js3 = (Js0) objJ3;
                String str15 = C3068vj0.a;
                c2293nj0B2 = C3068vj0.b(js3.l, C3068vj0.g);
                if (c2293nj0B2.a == 403) {
                    c3084vr0 = C3084vr0.a;
                    if (!C3084vr0.s()) {
                        this.m = c2196mj1;
                        this.n = c2390oj1;
                        this.f1009o = 5;
                        objK = c3084vr0.k(this);
                        if (objK == enumC1706hi) {
                            return enumC1706hi;
                        }
                        c2390oj2 = c2390oj1;
                        c2196mj2 = c2196mj1;
                        if (!((Boolean) objK).booleanValue()) {
                            throw new IOException("No se pudo desbloquear la transmisión");
                        }
                        C3084vr0 c3084vr10 = C3084vr0.a;
                        NV nvH5 = AbstractC1370eA.h();
                        TimeUnit timeUnit5 = TimeUnit.SECONDS;
                        nvH5.e(20L, timeUnit5);
                        nvH5.i(30L, timeUnit5);
                        C3084vr0.b(nvH5);
                        ov3 = new OV(nvH5);
                        String str16 = C3068vj0.a;
                        this.m = c2196mj2;
                        this.n = ov3;
                        this.f1009o = 6;
                        objJ4 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj2, c2196mj2, this.p, ov3, null), this);
                        if (objJ4 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        ov4 = ov3;
                        js1 = (Js0) objJ4;
                        String str17 = C3068vj0.a;
                        c2293nj0B3 = C3068vj0.b(js1.l, ov4);
                        if (c2293nj0B3.a != 403) {
                            return C3068vj0.c(js1, c2293nj0B3.b, c2196mj2);
                        }
                        C3084vr0 c3084vr11 = C3084vr0.a;
                        C3084vr0.s = false;
                        C3084vr0.r = null;
                        throw new IOException("No se pudo desbloquear la transmisión");
                    }
                }
                return C3068vj0.c(js3, c2293nj0B2.b, c2196mj1);
            case 5:
                c2390oj1 = (C2390oj0) this.n;
                c2196mj1 = this.m;
                Jp0.O(obj);
                objK = obj;
                c2390oj2 = c2390oj1;
                c2196mj2 = c2196mj1;
                if (!((Boolean) objK).booleanValue()) {
                    throw new IOException("No se pudo desbloquear la transmisión");
                }
                C3084vr0 c3084vr12 = C3084vr0.a;
                NV nvH6 = AbstractC1370eA.h();
                TimeUnit timeUnit6 = TimeUnit.SECONDS;
                nvH6.e(20L, timeUnit6);
                nvH6.i(30L, timeUnit6);
                C3084vr0.b(nvH6);
                ov3 = new OV(nvH6);
                String str18 = C3068vj0.a;
                this.m = c2196mj2;
                this.n = ov3;
                this.f1009o = 6;
                objJ4 = AbstractC1376eG.J(AbstractC1910jn.b, new C2971uj0(c2390oj2, c2196mj2, this.p, ov3, null), this);
                if (objJ4 == enumC1706hi) {
                    return enumC1706hi;
                }
                ov4 = ov3;
                js1 = (Js0) objJ4;
                String str19 = C3068vj0.a;
                c2293nj0B3 = C3068vj0.b(js1.l, ov4);
                if (c2293nj0B3.a != 403) {
                    return C3068vj0.c(js1, c2293nj0B3.b, c2196mj2);
                }
                C3084vr0 c3084vr13 = C3084vr0.a;
                C3084vr0.s = false;
                C3084vr0.r = null;
                throw new IOException("No se pudo desbloquear la transmisión");
            case 6:
                ov4 = (OV) this.n;
                c2196mj2 = this.m;
                Jp0.O(obj);
                objJ4 = obj;
                js1 = (Js0) objJ4;
                String str110 = C3068vj0.a;
                c2293nj0B3 = C3068vj0.b(js1.l, ov4);
                if (c2293nj0B3.a != 403) {
                    return C3068vj0.c(js1, c2293nj0B3.b, c2196mj2);
                }
                C3084vr0 c3084vr14 = C3084vr0.a;
                C3084vr0.s = false;
                C3084vr0.r = null;
                throw new IOException("No se pudo desbloquear la transmisión");
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
