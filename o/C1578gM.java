package o;

import j$.util.Collection$EL;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.Generated;

/* JADX INFO: renamed from: o.gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1578gM {
    private static H70 C = null;
    private static List<C2848tT> D = null;
    private static Map<Integer, C0388Ea> E = null;
    private static int F = 0;
    private static XC G = null;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    private XC A;
    private H70 a;
    private List<C2848tT> b;
    private int c;
    private C0388Ea d;
    private boolean e;
    private int f;
    private final C2848tT g;
    private final int h;
    private final int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private List<C2848tT> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private H50[] f791o;
    private int p;
    private String q;
    private boolean r;
    private boolean s;
    private String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final int z;

    @Generated
    private static final CL B = DL.d(C1578gM.class);
    private static final C2848tT[] H = new C2848tT[0];

    static {
        r();
    }

    public C1578gM(C2848tT c2848tT, int i, int i2) {
        this.y = true;
        C3080vp0.a(i);
        C0344Ci.a(i2);
        if (!C3080vp0.c(i) && i != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.g = c2848tT;
        this.h = i;
        this.i = i2;
        synchronized (C1578gM.class) {
            this.a = i();
            this.b = j();
            this.d = g(i2);
        }
        this.c = F;
        this.f = 3;
        this.p = -1;
        this.z = Integer.parseInt(System.getProperty("dnsjava.lookup.max_iterations", "16"));
        if (Boolean.parseBoolean(System.getProperty("dnsjava.lookup.use_hosts_file", "true"))) {
            this.A = h();
        }
    }

    public static void A(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Illegal ndots value: "));
        }
        F = i;
    }

    public static synchronized void B(H70 h70) {
        C = h70;
    }

    public static synchronized void C(List<C2848tT> list) {
        D = c(list);
    }

    public static synchronized void D(String... strArr) {
        try {
            if (strArr == null) {
                D = null;
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C2848tT.n(str, C2848tT.v));
            }
            D = arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void E(C2848tT... c2848tTArr) {
        C(Arrays.asList(c2848tTArr));
    }

    public static synchronized void H(VW vw) {
        RU.k(vw);
    }

    private void b() {
        if (!this.l || this.p == -1) {
            StringBuilder sb = new StringBuilder("Lookup of " + this.g + " ");
            int i = this.i;
            if (i != 1) {
                sb.append(C0344Ci.b(i));
                sb.append(" ");
            }
            sb.append(C3080vp0.e(this.h));
            sb.append(" isn't done");
            throw new IllegalStateException(sb.toString());
        }
    }

    private static List<C2848tT> c(List<C2848tT> list) {
        try {
            return (List) Collection$EL.stream(list).map(new C2504ps(8)).collect(Collectors.toList());
        } catch (RuntimeException e) {
            if (e.getCause() instanceof C2945uT) {
                throw new IllegalArgumentException(e.getCause());
            }
            throw e;
        }
    }

    private void d(C2848tT c2848tT, C2848tT c2848tT2) {
        this.k = true;
        this.s = false;
        this.u = false;
        this.v = false;
        this.r = false;
        this.x = false;
        int i = this.j + 1;
        this.j = i;
        if (i >= this.z || c2848tT.equals(c2848tT2)) {
            this.p = 1;
            this.q = "CNAME loop";
            this.l = true;
        } else {
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(c2848tT2);
            o(c2848tT);
        }
    }

    public static synchronized C0388Ea g(int i) {
        C0388Ea c0388Ea;
        C0344Ci.a(i);
        c0388Ea = E.get(Integer.valueOf(i));
        if (c0388Ea == null) {
            c0388Ea = new C0388Ea(i);
            E.put(Integer.valueOf(i), c0388Ea);
        }
        return c0388Ea;
    }

    public static synchronized XC h() {
        return G;
    }

    public static synchronized H70 i() {
        return C;
    }

    public static synchronized List<C2848tT> j() {
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2848tT n(C2848tT c2848tT) {
        try {
            return C2848tT.h(c2848tT, C2848tT.v);
        } catch (C2945uT e) {
            throw new RuntimeException(e);
        }
    }

    private void o(C2848tT c2848tT) {
        if (p(c2848tT)) {
            return;
        }
        Gc0 gc0Y = this.d.y(c2848tT, this.h, this.f);
        CL cl = B;
        cl.f("Lookup for {}/{}, cache answer: {}", c2848tT, C3080vp0.e(this.h), gc0Y);
        q(c2848tT, gc0Y);
        if (this.l || this.m) {
            return;
        }
        AQ aqW = AQ.w(H50.z(c2848tT, this.h, this.i));
        try {
            AQ aqB = this.a.b(aqW);
            int iN = aqB.k().n();
            if (iN != 0 && iN != 3) {
                this.s = true;
                this.t = C2820t50.b(iN);
            } else {
                if (!aqW.n().equals(aqB.n())) {
                    this.s = true;
                    this.t = "response does not match query";
                    return;
                }
                Gc0 gc0C = this.d.c(aqB);
                if (gc0C == null) {
                    gc0C = this.d.y(c2848tT, this.h, this.f);
                }
                cl.f("Queried {}/{}, id={}: {}", c2848tT, C3080vp0.e(this.h), Integer.valueOf(aqB.k().k()), gc0C);
                q(c2848tT, gc0C);
            }
        } catch (IOException e) {
            B.f("Lookup for {}/{}, id={} failed using resolver {}", c2848tT, C3080vp0.e(aqW.n().y()), Integer.valueOf(aqW.k().k()), this.a, e);
            if (e instanceof InterruptedIOException) {
                this.v = true;
            } else {
                this.u = true;
            }
        }
    }

    private boolean p(C2848tT c2848tT) {
        int i;
        XC xc = this.A;
        if (xc != null && ((i = this.h) == 1 || i == 28)) {
            try {
                Optional<InetAddress> optionalC = xc.c(c2848tT, i);
                if (optionalC.isPresent()) {
                    this.p = 0;
                    this.l = true;
                    if (this.h == 1) {
                        this.f791o = new C1837j[]{new C1837j(c2848tT, this.i, 0L, optionalC.get())};
                    } else {
                        this.f791o = new C1545g[]{new C1545g(c2848tT, this.i, 0L, optionalC.get())};
                    }
                    return true;
                }
            } catch (IOException e) {
                B.Q(e);
            }
        }
        return false;
    }

    private void q(C2848tT c2848tT, Gc0 gc0) {
        if (gc0.k()) {
            List<X40> listB = gc0.b();
            ArrayList arrayList = new ArrayList();
            Iterator<X40> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().r(this.y));
            }
            this.p = 0;
            this.f791o = (H50[]) arrayList.toArray(new H50[0]);
            this.l = true;
            return;
        }
        if (gc0.i()) {
            this.r = true;
            this.m = true;
            if (this.j > 0) {
                this.p = 3;
                this.l = true;
                return;
            }
            return;
        }
        if (gc0.j()) {
            this.p = 4;
            this.f791o = null;
            this.l = true;
        } else {
            if (gc0.f()) {
                d(gc0.c().W(), c2848tT);
                return;
            }
            if (!gc0.g()) {
                if (gc0.h()) {
                    this.x = true;
                }
            } else {
                try {
                    d(c2848tT.l(gc0.d()), c2848tT);
                } catch (C2945uT unused) {
                    this.p = 1;
                    this.q = "Invalid DNAME target";
                    this.l = true;
                }
            }
        }
    }

    public static synchronized void r() {
        C = new C3085vs();
        D = I70.c().f();
        E = new HashMap();
        F = I70.c().d();
        G = new XC();
    }

    private void s() {
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = null;
        this.f791o = null;
        this.p = -1;
        this.q = null;
        this.r = false;
        this.s = false;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        if (this.e) {
            this.d.i();
        }
    }

    private void t(C2848tT c2848tT, C2848tT c2848tT2) {
        this.m = false;
        if (c2848tT2 != null) {
            try {
                c2848tT = C2848tT.h(c2848tT, c2848tT2);
            } catch (C2945uT unused) {
                this.w = true;
                return;
            }
        }
        o(c2848tT);
    }

    public static synchronized void y(C0388Ea c0388Ea, int i) {
        C0344Ci.a(i);
        E.put(Integer.valueOf(i), c0388Ea);
    }

    public static synchronized void z(XC xc) {
        G = xc;
    }

    @Generated
    public void F(XC xc) {
        this.A = xc;
    }

    public void G(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Illegal ndots value: "));
        }
        this.c = i;
    }

    public void I(H70 h70) {
        this.a = h70;
    }

    public void J(List<C2848tT> list) {
        this.b = c(list);
    }

    public void K(String... strArr) {
        if (strArr == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C2848tT.n(str, C2848tT.v));
        }
        this.b = arrayList;
    }

    public void L(C2848tT... c2848tTArr) {
        J(Arrays.asList(c2848tTArr));
    }

    public C2848tT[] e() {
        b();
        List<C2848tT> list = this.n;
        return list == null ? H : (C2848tT[]) list.toArray(new C2848tT[0]);
    }

    public H50[] f() {
        b();
        return this.f791o;
    }

    public String k() {
        b();
        String str = this.q;
        if (str != null) {
            return str;
        }
        int i = this.p;
        if (i == 0) {
            return "successful";
        }
        if (i == 1) {
            return "unrecoverable error";
        }
        if (i == 2) {
            return "try again";
        }
        if (i == 3) {
            return "host not found";
        }
        if (i == 4) {
            return "type not found";
        }
        throw new IllegalStateException("unknown result");
    }

    @Generated
    public XC l() {
        return this.A;
    }

    public int m() {
        b();
        return this.p;
    }

    public H50[] u() {
        if (this.l) {
            s();
        }
        if (this.g.q()) {
            t(this.g, null);
        } else if (this.b == null) {
            t(this.g, C2848tT.v);
        } else {
            if (this.g.s() > this.c) {
                t(this.g, C2848tT.v);
            }
            if (this.l) {
                return this.f791o;
            }
            Iterator<C2848tT> it = this.b.iterator();
            while (it.hasNext()) {
                t(this.g, it.next());
                if (this.l) {
                    return this.f791o;
                }
                if (this.k) {
                    break;
                }
            }
            t(this.g, C2848tT.v);
        }
        if (!this.l) {
            if (this.s) {
                this.p = 2;
                this.q = this.t;
                this.l = true;
            } else if (this.v) {
                this.p = 2;
                this.q = "timed out";
                this.l = true;
            } else if (this.u) {
                this.p = 2;
                this.q = "network error";
                this.l = true;
            } else if (this.r) {
                this.p = 3;
                this.l = true;
            } else if (this.x) {
                this.p = 1;
                this.q = "referral";
                this.l = true;
            } else if (this.w) {
                this.p = 1;
                this.q = "name too long";
                this.l = true;
            }
        }
        return this.f791o;
    }

    public void v(C0388Ea c0388Ea) {
        if (c0388Ea == null) {
            this.d = new C0388Ea(this.i);
            this.e = true;
        } else {
            this.d = c0388Ea;
            this.e = false;
        }
    }

    public void w(int i) {
        this.f = i;
    }

    public void x(boolean z) {
        this.y = z;
    }

    public C1578gM(C2848tT c2848tT, int i) {
        this(c2848tT, i, 1);
    }

    public C1578gM(C2848tT c2848tT) {
        this(c2848tT, 1, 1);
    }

    public C1578gM(String str, int i, int i2) {
        this(C2848tT.m(str), i, i2);
    }

    public C1578gM(String str, int i) {
        this(C2848tT.m(str), i, 1);
    }

    public C1578gM(String str) {
        this(C2848tT.m(str), 1, 1);
    }
}
