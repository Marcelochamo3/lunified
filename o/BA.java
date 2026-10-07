package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class BA {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final C1797ie0 c;
    public final NH d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    public BA() {
        C2986ur c2986ur = C2986ur.q;
        C0330Bu c0330Bu = EnumC0512Iu.l;
        Map mapEmptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        this(c2986ur, c0330Bu, mapEmptyMap, true, true, 1, Collections.emptyList(), EnumC1417ek0.l, EnumC1417ek0.m, Collections.emptyList());
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, Class cls) {
        Object obj;
        Kp0 kp0 = new Kp0(cls);
        if (str == null) {
            obj = null;
        } else {
            WH wh = new WH(new StringReader(str));
            wh.m = this.j;
            Object objD = d(wh, kp0);
            if (objD != null) {
                try {
                    if (wh.j0() != 10) {
                        throw new XH("JSON document was not fully consumed.");
                    }
                } catch (C2164mN e) {
                    throw new XH(e);
                } catch (IOException e2) {
                    throw new RH(e2);
                }
            }
            obj = objD;
        }
        return Nr0.K(cls).cast(obj);
    }

    public final Object c(QH qh, Class cls) {
        Object objD;
        Kp0 kp0 = new Kp0(cls);
        if (qh == null) {
            objD = null;
        } else {
            ZH zh = new ZH(ZH.E);
            zh.A = new Object[32];
            zh.B = 0;
            zh.C = new String[32];
            zh.D = new int[32];
            zh.x0(qh);
            objD = d(zh, kp0);
        }
        return Nr0.K(cls).cast(objD);
    }

    public final Object d(WH wh, Kp0 kp0) {
        boolean z = wh.m;
        boolean z2 = true;
        wh.m = true;
        try {
            try {
                try {
                    try {
                        wh.j0();
                        z2 = false;
                        Object objA = e(kp0).a(wh);
                        wh.m = z;
                        return objA;
                    } catch (IOException e) {
                        throw new XH(e);
                    } catch (AssertionError e2) {
                        throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                    }
                } catch (IllegalStateException e3) {
                    throw new XH(e3);
                }
            } catch (EOFException e4) {
                if (!z2) {
                    throw new XH(e4);
                }
                wh.m = z;
                return null;
            }
        } catch (Throwable th) {
            wh.m = z;
            throw th;
        }
    }

    public final AbstractC3177wp0 e(Kp0 kp0) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        AbstractC3177wp0 abstractC3177wp0 = (AbstractC3177wp0) concurrentHashMap.get(kp0);
        if (abstractC3177wp0 != null) {
            return abstractC3177wp0;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC3177wp0 abstractC3177wp1 = (AbstractC3177wp0) map.get(kp0);
            if (abstractC3177wp1 != null) {
                return abstractC3177wp1;
            }
            z = false;
        }
        try {
            AA aa = new AA();
            AbstractC3177wp0 abstractC3177wp0B = null;
            aa.a = null;
            map.put(kp0, aa);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                abstractC3177wp0B = ((InterfaceC3274xp0) it.next()).b(this, kp0);
                if (abstractC3177wp0B != null) {
                    if (aa.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aa.a = abstractC3177wp0B;
                    map.put(kp0, abstractC3177wp0B);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC3177wp0B != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC3177wp0B;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + kp0);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final AbstractC3177wp0 f(InterfaceC3274xp0 interfaceC3274xp0, Kp0 kp0) {
        List<InterfaceC3274xp0> list = this.e;
        if (!list.contains(interfaceC3274xp0)) {
            interfaceC3274xp0 = this.d;
        }
        boolean z = false;
        for (InterfaceC3274xp0 interfaceC3274xp1 : list) {
            if (z) {
                AbstractC3177wp0 abstractC3177wp0B = interfaceC3274xp1.b(this, kp0);
                if (abstractC3177wp0B != null) {
                    return abstractC3177wp0B;
                }
            } else if (interfaceC3274xp1 == interfaceC3274xp0) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + kp0);
    }

    public final C1183cI g(Writer writer) throws IOException {
        if (this.g) {
            writer.write(")]}'\n");
        }
        C1183cI c1183cI = new C1183cI(writer);
        if (this.i) {
            c1183cI.f712o = "  ";
            c1183cI.p = ": ";
        }
        c1183cI.r = this.h;
        c1183cI.q = this.j;
        c1183cI.t = this.f;
        return c1183cI;
    }

    public final void h(Object obj, Class cls, C1183cI c1183cI) {
        AbstractC3177wp0 abstractC3177wp0E = e(new Kp0(cls));
        boolean z = c1183cI.q;
        c1183cI.q = true;
        boolean z2 = c1183cI.r;
        c1183cI.r = this.h;
        boolean z3 = c1183cI.t;
        c1183cI.t = this.f;
        try {
            try {
                abstractC3177wp0E.b(c1183cI, obj);
                c1183cI.q = z;
                c1183cI.r = z2;
                c1183cI.t = z3;
            } catch (IOException e) {
                throw new RH(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c1183cI.q = z;
            c1183cI.r = z2;
            c1183cI.t = z3;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public BA(C2986ur c2986ur, C0330Bu c0330Bu, Map map, boolean z, boolean z2, int i, List list, C1027ak0 c1027ak0, C1125bk0 c1125bk0, List list2) {
        C3411zA c3411zA;
        InterfaceC3274xp0 interfaceC3274xp0C;
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        C1797ie0 c1797ie0 = new C1797ie0(map, z2, list2);
        this.c = c1797ie0;
        this.f = false;
        this.g = false;
        this.h = z;
        this.i = false;
        this.j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Hp0.A);
        arrayList.add(CV.c(c1027ak0));
        arrayList.add(c2986ur);
        arrayList.addAll(list);
        arrayList.add(Hp0.p);
        arrayList.add(Hp0.g);
        arrayList.add(Hp0.d);
        arrayList.add(Hp0.e);
        arrayList.add(Hp0.f);
        if (i == 1) {
            c3411zA = Hp0.k;
        } else {
            c3411zA = new C3411zA(2);
        }
        arrayList.add(Hp0.a(Long.TYPE, Long.class, c3411zA));
        arrayList.add(Hp0.a(Double.TYPE, Double.class, new C3411zA(0)));
        arrayList.add(Hp0.a(Float.TYPE, Float.class, new C3411zA(1)));
        if (c1125bk0 == EnumC1417ek0.m) {
            interfaceC3274xp0C = C2560qV.b;
        } else {
            interfaceC3274xp0C = C2560qV.c(c1125bk0);
        }
        arrayList.add(interfaceC3274xp0C);
        arrayList.add(Hp0.h);
        arrayList.add(Hp0.i);
        arrayList.add(Hp0.b(AtomicLong.class, new Qf0(new Qf0(c3411zA, 1), 3)));
        arrayList.add(Hp0.b(AtomicLongArray.class, new Qf0(new Qf0(c3411zA, 2), 3)));
        arrayList.add(Hp0.j);
        arrayList.add(Hp0.l);
        arrayList.add(Hp0.q);
        arrayList.add(Hp0.r);
        arrayList.add(Hp0.b(BigDecimal.class, Hp0.m));
        arrayList.add(Hp0.b(BigInteger.class, Hp0.n));
        arrayList.add(Hp0.b(BJ.class, Hp0.f310o));
        arrayList.add(Hp0.s);
        arrayList.add(Hp0.t);
        arrayList.add(Hp0.v);
        arrayList.add(Hp0.w);
        arrayList.add(Hp0.y);
        arrayList.add(Hp0.u);
        arrayList.add(Hp0.b);
        arrayList.add(Nf0.e);
        arrayList.add(Hp0.x);
        if (Sf0.a) {
            arrayList.add(Sf0.e);
            arrayList.add(Sf0.d);
            arrayList.add(Sf0.f);
        }
        arrayList.add(W5.d);
        arrayList.add(Hp0.a);
        arrayList.add(new C0885Xe(c1797ie0));
        arrayList.add(new C2939uN(c1797ie0));
        NH nh = new NH(c1797ie0);
        this.d = nh;
        arrayList.add(nh);
        arrayList.add(Hp0.B);
        arrayList.add(new F60(c1797ie0, c0330Bu, c2986ur, nh, list2));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
