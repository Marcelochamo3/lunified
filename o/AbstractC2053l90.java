package o;

import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Supplier;

/* JADX INFO: renamed from: o.l90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2053l90 extends H50 {
    public static final int A = 6;

    @Deprecated
    public static final int B = 5;
    private static final h C;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;
    protected int r;
    protected C2848tT s;
    protected final Map<Integer, b> t;

    /* JADX INFO: renamed from: o.l90$b */
    public static abstract class b {
        public static String[] d(String str) {
            return str.split("(?<!\\\\),");
        }

        public abstract void a(String str);

        public abstract void b(byte[] bArr);

        public abstract int c();

        public abstract byte[] e();

        public abstract String toString();
    }

    /* JADX INFO: renamed from: o.l90$c */
    public static class c extends b {
        private byte[] a;

        public c() {
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty base64 value must be specified for ech");
            }
            this.a = Cy0.b(str);
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) {
            this.a = bArr;
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 5;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            return this.a;
        }

        public byte[] f() {
            return this.a;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            return Cy0.c(this.a);
        }

        public c(byte[] bArr) {
            this.a = bArr;
        }
    }

    /* JADX INFO: renamed from: o.l90$d */
    @Deprecated
    public static class d extends b {
        private byte[] a;

        public d() {
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty base64 value must be specified for echconfig");
            }
            this.a = Cy0.b(str);
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) {
            this.a = bArr;
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 5;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            return this.a;
        }

        public byte[] f() {
            return this.a;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            return Cy0.c(this.a);
        }

        public d(byte[] bArr) {
            this.a = bArr;
        }
    }

    /* JADX INFO: renamed from: o.l90$h */
    public static class h extends MQ {
        private final HashMap<Integer, Supplier<b>> k;

        public h() {
            super("SVCB/HTTPS Parameters", 3);
            o("key");
            n(true);
            m(AQ.w);
            this.k = new HashMap<>();
        }

        public void p(int i, String str, Supplier<b> supplier) {
            super.b(i, str);
            this.k.put(Integer.valueOf(i), supplier);
        }

        public Supplier<b> q(int i) {
            return this.k.get(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: o.l90$i */
    public static class i extends b {
        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            if (str != null && !str.isEmpty()) {
                throw new Ri0("No value can be specified for no-default-alpn");
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) throws Rw0 {
            if (bArr.length > 0) {
                throw new Rw0("No value can be specified for no-default-alpn");
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 2;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            return new byte[0];
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            return "";
        }
    }

    /* JADX INFO: renamed from: o.l90$j */
    public static class j extends b {
        private int a;

        public j() {
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            if (str == null || str.isEmpty()) {
                throw new Ri0("Integer value must be specified for port");
            }
            this.a = Integer.parseInt(str);
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) throws Rw0 {
            C0474Hi c0474Hi = new C0474Hi(bArr);
            this.a = c0474Hi.h();
            if (c0474Hi.k() > 0) {
                throw new Rw0("Unexpected number of bytes in port parameter");
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 3;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            C0578Li c0578Li = new C0578Li();
            c0578Li.l(this.a);
            return c0578Li.g();
        }

        public int f() {
            return this.a;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            return Integer.toString(this.a);
        }

        public j(int i) {
            this.a = i;
        }
    }

    static {
        h hVar = new h();
        C = hVar;
        hVar.p(0, "mandatory", new C1504ff(2));
        hVar.p(1, "alpn", new C1504ff(3));
        hVar.p(2, "no-default-alpn", new C1504ff(4));
        hVar.p(3, "port", new C1504ff(5));
        hVar.p(4, "ipv4hint", new C1504ff(6));
        hVar.p(5, "ech", new C1504ff(7));
        hVar.p(6, "ipv6hint", new C1504ff(8));
        hVar.c(5, "echconfig");
    }

    public AbstractC2053l90() {
        this.t = new TreeMap();
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strSubstring;
        String strSubstring2;
        this.r = fl0.h0();
        this.s = fl0.d0(c2848tT);
        this.t.clear();
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                if (this.r == 0 && !this.t.isEmpty()) {
                    throw new Ri0("No parameter values allowed for AliasMode");
                }
                if (!V()) {
                    throw new Ri0("Not all mandatory SvcParams are specified");
                }
                return;
            }
            int iIndexOf = bVarI.d().indexOf(61);
            if (iIndexOf == -1) {
                strSubstring2 = bVarI.d();
                strSubstring = null;
            } else if (iIndexOf == bVarI.d().length() - 1) {
                strSubstring2 = bVarI.d().substring(0, iIndexOf);
                Fl0.b bVarI2 = fl0.i();
                if (!bVarI2.b()) {
                    throw new Ri0(AbstractC1701hf0.u("Expected value for parameter key '", strSubstring2, "'"));
                }
                strSubstring = bVarI2.d();
            } else {
                if (iIndexOf <= 0) {
                    throw new Ri0("Expected valid parameter key=value for '" + bVarI.d() + "'");
                }
                String strSubstring3 = bVarI.d().substring(0, iIndexOf);
                strSubstring = bVarI.d().substring(iIndexOf + 1);
                strSubstring2 = strSubstring3;
            }
            h hVar = C;
            int iG = hVar.g(strSubstring2);
            if (iG == -1) {
                throw new Ri0(AbstractC1701hf0.u("Expected a valid parameter key for '", strSubstring2, "'"));
            }
            if (this.t.containsKey(Integer.valueOf(iG))) {
                throw new Ri0(AbstractC1701hf0.u("Duplicate parameter key for '", strSubstring2, "'"));
            }
            Supplier<b> supplierQ = hVar.q(iG);
            b kVar = supplierQ != null ? supplierQ.get() : new k(iG);
            kVar.a(strSubstring);
            this.t.put(Integer.valueOf(iG), kVar);
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = c0474Hi.h();
        this.s = new C2848tT(c0474Hi);
        this.t.clear();
        while (c0474Hi.k() >= 4) {
            int iH = c0474Hi.h();
            byte[] bArrF = c0474Hi.f(c0474Hi.h());
            Supplier<b> supplierQ = C.q(iH);
            b kVar = supplierQ != null ? supplierQ.get() : new k(iH);
            kVar.b(bArrF);
            this.t.put(Integer.valueOf(iH), kVar);
        }
        if (c0474Hi.k() > 0) {
            throw new Rw0("Record had unexpected number of bytes");
        }
        if (!V()) {
            throw new Rw0("Not all mandatory SvcParams are specified");
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        sb.append(this.s);
        for (Integer num : this.t.keySet()) {
            sb.append(" ");
            sb.append(C.f(num.intValue()));
            String string = this.t.get(num).toString();
            if (string != null && !string.isEmpty()) {
                sb.append("=");
                sb.append(string);
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z2) {
        c0578Li.l(this.r);
        this.s.B(c0578Li, null, z2);
        for (Integer num : this.t.keySet()) {
            c0578Li.l(num.intValue());
            byte[] bArrE = this.t.get(num).e();
            c0578Li.l(bArrE.length);
            c0578Li.i(bArrE);
        }
    }

    public boolean V() {
        g gVar = (g) X(0);
        if (gVar == null) {
            return true;
        }
        Iterator it = gVar.a.iterator();
        while (it.hasNext()) {
            if (X(((Integer) it.next()).intValue()) == null) {
                return false;
            }
        }
        return true;
    }

    public Set<Integer> W() {
        return this.t.keySet();
    }

    public b X(int i2) {
        return this.t.get(Integer.valueOf(i2));
    }

    public int Y() {
        return this.r;
    }

    public C2848tT Z() {
        return this.s;
    }

    /* JADX INFO: renamed from: o.l90$a */
    public static class a extends b {
        private final List<byte[]> a = new ArrayList();

        public a() {
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            this.a.clear();
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty list must be specified for alpn");
            }
            for (String str2 : b.d(str)) {
                this.a.add(H50.b(str2));
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) {
            this.a.clear();
            C0474Hi c0474Hi = new C0474Hi(bArr);
            while (c0474Hi.k() > 0) {
                this.a.add(c0474Hi.g());
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 1;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            C0578Li c0578Li = new C0578Li();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                c0578Li.k(it.next());
            }
            return c0578Li.g();
        }

        public List<String> f() {
            ArrayList arrayList = new ArrayList();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.add(H50.c(it.next(), false));
            }
            return arrayList;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.a) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(H50.c(bArr, false).replaceAll(",", "\\\\,"));
            }
            return sb.toString();
        }

        public a(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.a.add(H50.b(it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: o.l90$e */
    public static class e extends b {
        private final List<byte[]> a;

        public e() {
            this.a = new ArrayList();
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            this.a.clear();
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty IPv4 list must be specified for ipv4hint");
            }
            for (String str2 : str.split(",")) {
                byte[] bArrO = C1062b2.o(str2, 1);
                if (bArrO == null) {
                    throw new Ri0(AbstractC1701hf0.u("Invalid ipv4hint value '", str2, "'"));
                }
                this.a.add(bArrO);
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) throws Rw0 {
            this.a.clear();
            C0474Hi c0474Hi = new C0474Hi(bArr);
            while (c0474Hi.k() >= 4) {
                this.a.add(c0474Hi.f(4));
            }
            if (c0474Hi.k() > 0) {
                throw new Rw0("Unexpected number of bytes in ipv4hint parameter");
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 4;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            C0578Li c0578Li = new C0578Li();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                c0578Li.i(it.next());
            }
            return c0578Li.g();
        }

        public List<Inet4Address> f() throws UnknownHostException {
            LinkedList linkedList = new LinkedList();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                InetAddress byAddress = InetAddress.getByAddress(it.next());
                if (byAddress instanceof Inet4Address) {
                    linkedList.add((Inet4Address) byAddress);
                }
            }
            return linkedList;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.a) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(C1062b2.p(bArr));
            }
            return sb.toString();
        }

        public e(List<Inet4Address> list) {
            this.a = (List) Collection$EL.stream(list).map(new C2504ps(13)).collect(Collectors.toList());
        }
    }

    /* JADX INFO: renamed from: o.l90$f */
    public static class f extends b {
        private final List<byte[]> a;

        public f() {
            this.a = new ArrayList();
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            this.a.clear();
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty IPv6 list must be specified for ipv6hint");
            }
            for (String str2 : str.split(",")) {
                byte[] bArrO = C1062b2.o(str2, 2);
                if (bArrO == null) {
                    throw new Ri0(AbstractC1701hf0.u("Invalid ipv6hint value '", str2, "'"));
                }
                this.a.add(bArrO);
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) throws Rw0 {
            this.a.clear();
            C0474Hi c0474Hi = new C0474Hi(bArr);
            while (c0474Hi.k() >= 16) {
                this.a.add(c0474Hi.f(16));
            }
            if (c0474Hi.k() > 0) {
                throw new Rw0("Unexpected number of bytes in ipv6hint parameter");
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 6;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            C0578Li c0578Li = new C0578Li();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                c0578Li.i(it.next());
            }
            return c0578Li.g();
        }

        public List<Inet6Address> f() throws UnknownHostException {
            LinkedList linkedList = new LinkedList();
            Iterator<byte[]> it = this.a.iterator();
            while (it.hasNext()) {
                InetAddress byAddress = InetAddress.getByAddress(it.next());
                if (byAddress instanceof Inet6Address) {
                    linkedList.add((Inet6Address) byAddress);
                }
            }
            return linkedList;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.a) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                try {
                    sb.append(InetAddress.getByAddress(null, bArr).getHostAddress());
                } catch (UnknownHostException e) {
                    return e.getMessage();
                }
            }
            return sb.toString();
        }

        public f(List<Inet6Address> list) {
            this.a = (List) Collection$EL.stream(list).map(new C2504ps(14)).collect(Collectors.toList());
        }
    }

    /* JADX INFO: renamed from: o.l90$g */
    public static class g extends b {
        private final List<Integer> a;

        public g() {
            this.a = new ArrayList();
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) throws Ri0 {
            this.a.clear();
            if (str == null || str.isEmpty()) {
                throw new Ri0("Non-empty list must be specified for mandatory");
            }
            for (String str2 : b.d(str)) {
                int iG = AbstractC2053l90.C.g(str2);
                if (iG == 0) {
                    throw new Ri0("Key mandatory must not appear in its own list");
                }
                if (this.a.contains(Integer.valueOf(iG))) {
                    throw new Ri0(AbstractC1701hf0.u("Duplicate key ", str2, " not allowed in mandatory list"));
                }
                this.a.add(Integer.valueOf(iG));
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) throws Rw0 {
            this.a.clear();
            C0474Hi c0474Hi = new C0474Hi(bArr);
            while (c0474Hi.k() >= 2) {
                this.a.add(Integer.valueOf(c0474Hi.h()));
            }
            if (c0474Hi.k() > 0) {
                throw new Rw0("Unexpected number of bytes in mandatory parameter");
            }
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return 0;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            C0578Li c0578Li = new C0578Li();
            Iterator<Integer> it = this.a.iterator();
            while (it.hasNext()) {
                c0578Li.l(it.next().intValue());
            }
            return c0578Li.g();
        }

        public List<Integer> g() {
            return this.a;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Integer num : this.a) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(AbstractC2053l90.C.f(num.intValue()));
            }
            return sb.toString();
        }

        public g(List<Integer> list) {
            this.a = list;
        }
    }

    /* JADX INFO: renamed from: o.l90$k */
    public static class k extends b {
        private final int a;
        private byte[] b;

        public k(int i) {
            this.a = i;
            this.b = new byte[0];
        }

        @Override // o.AbstractC2053l90.b
        public void a(String str) {
            if (str == null || str.isEmpty()) {
                this.b = new byte[0];
            } else {
                this.b = H50.b(str);
            }
        }

        @Override // o.AbstractC2053l90.b
        public void b(byte[] bArr) {
            this.b = bArr;
        }

        @Override // o.AbstractC2053l90.b
        public int c() {
            return this.a;
        }

        @Override // o.AbstractC2053l90.b
        public byte[] e() {
            return this.b;
        }

        public byte[] f() {
            return this.b;
        }

        @Override // o.AbstractC2053l90.b
        public String toString() {
            return H50.c(this.b, false);
        }

        public k(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }
    }

    public AbstractC2053l90(C2848tT c2848tT, int i2, int i3, long j2) {
        super(c2848tT, i2, i3, j2);
        this.t = new TreeMap();
    }

    public AbstractC2053l90(C2848tT c2848tT, int i2, int i3, long j2, int i4, C2848tT c2848tT2, List<b> list) {
        super(c2848tT, i2, i3, j2);
        this.r = i4;
        this.s = c2848tT2;
        this.t = new TreeMap();
        for (b bVar : list) {
            if (!this.t.containsKey(Integer.valueOf(bVar.c()))) {
                this.t.put(Integer.valueOf(bVar.c()), bVar);
            } else {
                throw new IllegalArgumentException("Duplicate SvcParam for key " + bVar.c());
            }
        }
    }
}
