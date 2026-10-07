package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Generated;

/* JADX INFO: renamed from: o.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0388Ea {

    @Generated
    private static final CL e = DL.d(C0388Ea.class);
    private static final int f = 50000;
    private final a a;
    private int b;
    private int c;
    private int d;

    /* JADX INFO: renamed from: o.Ea$a */
    public static class a extends LinkedHashMap<C2848tT, Object> {
        private int l;

        public a(int i) {
            super(16, 0.75f, true);
            this.l = i;
        }

        public int b() {
            return this.l;
        }

        public void c(int i) {
            this.l = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<C2848tT, Object> entry) {
            return this.l >= 0 && size() > this.l;
        }
    }

    /* JADX INFO: renamed from: o.Ea$c */
    public interface c {
        int a(int i);

        boolean b();

        int getType();
    }

    /* JADX INFO: renamed from: o.Ea$d */
    public static class d implements c {
        int l;
        C2848tT m;
        int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f239o;

        public d(C2848tT c2848tT, int i, C1467f90 c1467f90, int i2, long j) {
            this.m = c2848tT;
            this.l = i;
            long jMin = c1467f90 != null ? Math.min(c1467f90.X(), c1467f90.x()) : 0L;
            this.n = i2;
            this.f239o = C0388Ea.w(jMin, j);
        }

        @Override // o.C0388Ea.c
        public final int a(int i) {
            return this.n - i;
        }

        @Override // o.C0388Ea.c
        public final boolean b() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.f239o;
        }

        @Override // o.C0388Ea.c
        public int getType() {
            return this.l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.l == 0) {
                sb.append("NXDOMAIN ");
                sb.append(this.m);
            } else {
                sb.append("NXRRSET ");
                sb.append(this.m);
                sb.append(" ");
                sb.append(C3080vp0.e(this.l));
            }
            sb.append(" cl = ");
            sb.append(this.n);
            return sb.toString();
        }
    }

    public C0388Ea(int i) {
        this.b = -1;
        this.c = -1;
        this.d = i;
        this.a = new a(f);
    }

    private synchronized c A(C2848tT c2848tT, Object obj, int i, int i2) {
        c cVar;
        try {
            if (i == 255) {
                throw new IllegalArgumentException("oneElement(ANY)");
            }
            if (!(obj instanceof List)) {
                cVar = (c) obj;
                if (cVar.getType() != i) {
                    cVar = null;
                    break;
                }
            } else {
                Iterator it = ((List) obj).iterator();
                do {
                    if (!it.hasNext()) {
                        cVar = null;
                        break;
                    }
                    cVar = (c) it.next();
                } while (cVar.getType() != i);
            }
            if (cVar == null) {
                return null;
            }
            if (cVar.b()) {
                B(c2848tT, i);
                return null;
            }
            if (cVar.a(i2) < 0) {
                return null;
            }
            return cVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void B(C2848tT c2848tT, int i) {
        Object obj = this.a.get(c2848tT);
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((c) list.get(i2)).getType() == i) {
                    list.remove(i2);
                    if (list.size() == 0) {
                        this.a.remove(c2848tT);
                    }
                    return;
                }
            }
        } else if (((c) obj).getType() == i) {
            this.a.remove(c2848tT);
        }
    }

    private synchronized void C(C2848tT c2848tT) {
        this.a.remove(c2848tT);
    }

    private synchronized void b(C2848tT c2848tT, c cVar) {
        Object obj = this.a.get(c2848tT);
        if (obj == null) {
            this.a.put(c2848tT, cVar);
            return;
        }
        int type = cVar.getType();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((c) list.get(i)).getType() == type) {
                    list.set(i, cVar);
                    return;
                }
            }
            list.add(cVar);
        } else {
            c cVar2 = (c) obj;
            if (cVar2.getType() == type) {
                this.a.put(c2848tT, cVar);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(cVar2);
                linkedList.add(cVar);
                this.a.put(c2848tT, linkedList);
            }
        }
    }

    private synchronized c[] h(Object obj) {
        if (!(obj instanceof List)) {
            return new c[]{(c) obj};
        }
        List list = (List) obj;
        return (c[]) list.toArray(new c[list.size()]);
    }

    private synchronized Object j(C2848tT c2848tT) {
        return this.a.get(c2848tT);
    }

    private synchronized c l(C2848tT c2848tT, int i, int i2) {
        Object objJ = j(c2848tT);
        if (objJ == null) {
            return null;
        }
        return A(c2848tT, objJ, i, i2);
    }

    private List<X40> n(C2848tT c2848tT, int i, int i2) {
        Gc0 gc0Y = y(c2848tT, i, i2);
        if (gc0Y.k()) {
            return gc0Y.b();
        }
        return null;
    }

    private int q(int i, boolean z) {
        if (i == 1) {
            return z ? 4 : 3;
        }
        if (i == 2) {
            return z ? 4 : 3;
        }
        if (i == 3) {
            return 1;
        }
        throw new IllegalArgumentException("getCred: invalid section");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > C1707hi0.a) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }

    private static void z(X40 x40, Set<C2848tT> set) {
        if (x40.m().s() == null) {
            return;
        }
        Iterator<H50> it = x40.q().iterator();
        while (it.hasNext()) {
            C2848tT c2848tTS = it.next().s();
            if (c2848tTS != null) {
                set.add(c2848tTS);
            }
        }
    }

    public void D(int i) {
        this.c = i;
    }

    public void E(int i) {
        this.a.c(i);
    }

    public void F(int i) {
        this.b = i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public o.Gc0 c(o.AQ r20) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0388Ea.c(o.AQ):o.Gc0");
    }

    public synchronized void d(C2848tT c2848tT, int i, C1467f90 c1467f90, int i2) {
        long jMin;
        if (c1467f90 != null) {
            try {
                jMin = Math.min(c1467f90.X(), c1467f90.x());
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jMin = 0;
        }
        c cVarL = l(c2848tT, i, 0);
        if (jMin != 0) {
            if (cVarL != null && cVarL.a(i2) <= 0) {
                cVarL = null;
            }
            if (cVarL == null) {
                b(c2848tT, new d(c2848tT, i, c1467f90, i2, this.b));
            }
        } else if (cVarL != null && cVarL.a(i2) <= 0) {
            B(c2848tT, i);
        }
    }

    public synchronized <T extends H50> void e(X40 x40, int i) {
        try {
            long jP = x40.p();
            C2848tT c2848tTO = x40.o();
            int type = x40.getType();
            c cVarL = l(c2848tTO, type, 0);
            if (jP != 0) {
                if (cVarL != null && cVarL.a(i) <= 0) {
                    cVarL = null;
                }
                if (cVarL == null) {
                    b(c2848tTO, x40 instanceof b ? (b) x40 : new b(x40, i, this.c));
                }
            } else if (cVarL != null && cVarL.a(i) <= 0) {
                B(c2848tTO, type);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(H50 h50, int i) {
        try {
            C2848tT c2848tTV = h50.v();
            int iW = h50.w();
            if (C3080vp0.c(iW)) {
                c cVarL = l(c2848tTV, iW, i);
                if (cVarL == null) {
                    e(new b(h50, i, this.c), i);
                } else if (cVarL.a(i) == 0 && (cVarL instanceof b)) {
                    ((b) cVarL).d(h50);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public synchronized void g(H50 h50, int i, Object obj) {
        f(h50, i);
    }

    public synchronized void i() {
        this.a.clear();
    }

    public List<X40> k(C2848tT c2848tT, int i) {
        return n(c2848tT, i, 2);
    }

    public List<X40> m(C2848tT c2848tT, int i) {
        return n(c2848tT, i, 3);
    }

    public void o(C2848tT c2848tT) {
        C(c2848tT);
    }

    public void p(C2848tT c2848tT, int i) {
        B(c2848tT, i);
    }

    public int r() {
        return this.d;
    }

    public int s() {
        return this.c;
    }

    public int t() {
        return this.a.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            try {
                Iterator<Object> it = this.a.values().iterator();
                while (it.hasNext()) {
                    for (c cVar : h(it.next())) {
                        sb.append(cVar);
                        sb.append("\n");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    public int u() {
        return this.b;
    }

    public int v() {
        return this.a.size();
    }

    public synchronized Gc0 x(C2848tT c2848tT, int i, int i2) {
        try {
            int iS = c2848tT.s();
            int i3 = iS;
            while (i3 >= 1) {
                boolean z = i3 == 1;
                boolean z2 = i3 == iS;
                C2848tT c2848tT2 = z ? C2848tT.v : z2 ? c2848tT : new C2848tT(c2848tT, iS - i3);
                Object obj = this.a.get(c2848tT2);
                if (obj != null) {
                    if (z2 && i == 255) {
                        Gc0 gc0 = new Gc0(6);
                        int i4 = 0;
                        for (c cVar : h(obj)) {
                            if (cVar.b()) {
                                B(c2848tT2, cVar.getType());
                            } else if ((cVar instanceof b) && cVar.a(i2) >= 0) {
                                gc0.a((b) cVar);
                                i4++;
                            }
                        }
                        if (i4 > 0) {
                            return gc0;
                        }
                    } else if (z2) {
                        c cVarA = A(c2848tT2, obj, i, i2);
                        if (cVarA instanceof b) {
                            Gc0 gc1 = new Gc0(6);
                            gc1.a((b) cVarA);
                            return gc1;
                        }
                        if (cVarA != null) {
                            return new Gc0(2);
                        }
                        c cVarA2 = A(c2848tT2, obj, 5, i2);
                        if (cVarA2 instanceof b) {
                            return new Gc0(4, (b) cVarA2);
                        }
                    } else {
                        c cVarA3 = A(c2848tT2, obj, 39, i2);
                        if (cVarA3 instanceof b) {
                            return new Gc0(5, (b) cVarA3);
                        }
                    }
                    c cVarA4 = A(c2848tT2, obj, 2, i2);
                    if (cVarA4 instanceof b) {
                        return new Gc0(3, (b) cVarA4);
                    }
                    if (z2 && A(c2848tT2, obj, 0, i2) != null) {
                        return Gc0.m(1);
                    }
                }
                i3--;
            }
            return Gc0.m(0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public Gc0 y(C2848tT c2848tT, int i, int i2) {
        return x(c2848tT, i, i2);
    }

    /* JADX INFO: renamed from: o.Ea$b */
    public static class b extends X40 implements c {
        private static final long serialVersionUID = 5971755205903597024L;
        int p;
        int q;

        public b(H50 h50, int i, long j) {
            this.p = i;
            this.q = C0388Ea.w(h50.x(), j);
            d(h50);
        }

        @Override // o.C0388Ea.c
        public final int a(int i) {
            return this.p - i;
        }

        @Override // o.C0388Ea.c
        public final boolean b() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.q;
        }

        @Override // o.X40
        public String toString() {
            return super.toString() + " cl = " + this.p;
        }

        public b(X40 x40, int i, long j) {
            super(x40);
            this.p = i;
            this.q = C0388Ea.w(x40.p(), j);
        }
    }

    public C0388Ea() {
        this(1);
    }

    public C0388Ea(String str) {
        this.b = -1;
        this.c = -1;
        this.a = new a(f);
        FN fn = new FN(str);
        while (true) {
            try {
                H50 h50K = fn.K();
                if (h50K != null) {
                    f(h50K, 0);
                } else {
                    fn.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fn.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }
}
