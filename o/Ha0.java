package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Ha0 extends Ph0 implements InterfaceC0775Sy {
    public Object m;
    public VS n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f304o;
    public La0 p;
    public int q;
    public int r;
    public final /* synthetic */ Q30 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ VS u;
    public final /* synthetic */ List v;
    public final /* synthetic */ int w;
    public final /* synthetic */ La0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ha0(Q30 q30, String str, VS vs, List list, int i, La0 la0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.s = q30;
        this.t = str;
        this.u = vs;
        this.v = list;
        this.w = i;
        this.x = la0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ha0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ha0(this.s, this.t, this.u, this.v, this.w, this.x, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[Catch: Exception -> 0x0041, CancellationException -> 0x0044, TryCatch #4 {CancellationException -> 0x0044, Exception -> 0x0041, blocks: (B:16:0x003d, B:30:0x0064, B:31:0x006f, B:33:0x0075, B:35:0x0080, B:37:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0092, B:43:0x009c, B:44:0x00a5, B:46:0x00a9, B:47:0x00b2, B:21:0x0047, B:27:0x0059, B:24:0x004e), top: B:69:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: Exception -> 0x0041, CancellationException -> 0x0044, TryCatch #4 {CancellationException -> 0x0044, Exception -> 0x0041, blocks: (B:16:0x003d, B:30:0x0064, B:31:0x006f, B:33:0x0075, B:35:0x0080, B:37:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0092, B:43:0x009c, B:44:0x00a5, B:46:0x00a9, B:47:0x00b2, B:21:0x0047, B:27:0x0059, B:24:0x004e), top: B:69:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:78:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x008c A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        X30 x30;
        List list;
        La0 la0;
        int i;
        Object objD;
        VS vs;
        VS vs2;
        Throwable th;
        VS vs3;
        ArrayList<InterfaceC3106w3> arrayList;
        InterfaceC3106w3 interfaceC3106w3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.r;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Q30 q30 = this.s;
        try {
            try {
                if (i2 == 0) {
                    Jp0.O(obj);
                    O9 o9 = O9.x;
                    this.r = 1;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                vs2 = (VS) this.m;
                                try {
                                    Jp0.O(obj);
                                    vs3 = vs2;
                                    ((YS) vs3).e(null);
                                    return c2985uq0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((YS) vs2).e(null);
                                    throw th;
                                }
                            }
                            i = this.q;
                            la0 = this.p;
                            list = this.f304o;
                            VS vs4 = this.n;
                            x30 = (X30) this.m;
                            Jp0.O(obj);
                            vs = vs4;
                            list.set(i, x30);
                            C2771sg0 c2771sg0 = la0.b;
                            Ca0 ca0 = new Ca0(AbstractC0911Ye.x0(list));
                            this.m = vs;
                            this.n = null;
                            this.f304o = null;
                            this.p = null;
                            this.r = 4;
                            c2771sg0.l(ca0, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            vs3 = vs;
                            ((YS) vs3).e(null);
                            return c2985uq0;
                        }
                        Jp0.O(obj);
                        arrayList = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            interfaceC3106w3 = (InterfaceC3106w3) obj2;
                            if (!(interfaceC3106w3 instanceof C1387eR) || (interfaceC3106w3 instanceof C2109lo0)) {
                                arrayList.add(obj2);
                            }
                        }
                        for (InterfaceC3106w3 interfaceC3106w4 : arrayList) {
                            if (interfaceC3106w4 instanceof C1387eR) {
                                ((C1387eR) interfaceC3106w4).t = q30.getName();
                            } else if (interfaceC3106w4 instanceof C2109lo0) {
                                ((C2109lo0) interfaceC3106w4).r = q30.getName();
                            }
                        }
                        x30 = new X30(q30, new W30(arrayList));
                        this.m = x30;
                        VS vs5 = this.u;
                        this.n = vs5;
                        list = this.v;
                        this.f304o = list;
                        la0 = this.x;
                        this.p = la0;
                        i = this.w;
                        this.q = i;
                        this.r = 3;
                        YS ys = (YS) vs5;
                        objD = ys.d(null, this);
                        vs = ys;
                        if (objD == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list.set(i, x30);
                        C2771sg0 c2771sg1 = la0.b;
                        Ca0 ca1 = new Ca0(AbstractC0911Ye.x0(list));
                        this.m = vs;
                        this.n = null;
                        this.f304o = null;
                        this.p = null;
                        this.r = 4;
                        c2771sg1.l(ca1, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        vs3 = vs;
                        ((YS) vs3).e(null);
                        return c2985uq0;
                    }
                    Jp0.O(obj);
                }
                list.set(i, x30);
                C2771sg0 c2771sg2 = la0.b;
                Ca0 ca2 = new Ca0(AbstractC0911Ye.x0(list));
                this.m = vs;
                this.n = null;
                this.f304o = null;
                this.p = null;
                this.r = 4;
                c2771sg2.l(ca2, this);
                if (c2985uq0 == enumC1706hi) {
                    return enumC1706hi;
                }
                vs3 = vs;
                ((YS) vs3).e(null);
                return c2985uq0;
            } catch (Throwable th3) {
                vs2 = vs;
                th = th3;
                ((YS) vs2).e(null);
                throw th;
            }
            String str = this.t;
            this.r = 2;
            obj = q30.a(str, 1, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                interfaceC3106w3 = (InterfaceC3106w3) obj2;
                if (!(interfaceC3106w3 instanceof C1387eR)) {
                }
                arrayList.add(obj2);
            }
            while (r12.hasNext()) {
                if (interfaceC3106w4 instanceof C1387eR) {
                    ((C1387eR) interfaceC3106w4).t = q30.getName();
                } else if (interfaceC3106w4 instanceof C2109lo0) {
                    ((C2109lo0) interfaceC3106w4).r = q30.getName();
                }
            }
            x30 = new X30(q30, new W30(arrayList));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            q30.getClass();
            x30 = new X30(q30, new U30(e2));
        }
        this.m = x30;
        VS vs6 = this.u;
        this.n = vs6;
        list = this.v;
        this.f304o = list;
        la0 = this.x;
        this.p = la0;
        i = this.w;
        this.q = i;
        this.r = 3;
        YS ys2 = (YS) vs6;
        objD = ys2.d(null, this);
        vs = ys2;
        if (objD == enumC1706hi) {
            return enumC1706hi;
        }
    }
}
