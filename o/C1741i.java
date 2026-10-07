package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1741i extends H50 {
    private List<b> r;

    /* JADX INFO: renamed from: o.i$b */
    public static class b {
        public final int a;
        public final boolean b;
        public final int c;
        public final Object d;

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d.equals(bVar.d);
        }

        public int hashCode() {
            return this.d.hashCode() + this.c + (this.b ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.b) {
                sb.append("!");
            }
            sb.append(this.a);
            sb.append(":");
            int i = this.a;
            if (i == 1 || i == 2) {
                sb.append(((InetAddress) this.d).getHostAddress());
            } else {
                sb.append(Ay0.b((byte[]) this.d));
            }
            sb.append("/");
            sb.append(this.c);
            return sb.toString();
        }

        private b(int i, boolean z, Object obj, int i2) {
            this.a = i;
            this.b = z;
            this.d = obj;
            this.c = i2;
            if (!C1741i.Y(i, i2)) {
                throw new IllegalArgumentException("invalid prefix length");
            }
        }

        public b(boolean z, InetAddress inetAddress, int i) {
            this(C1062b2.c(inetAddress), z, inetAddress, i);
        }
    }

    public C1741i() {
    }

    private static int V(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] != 0) {
                return length + 1;
            }
        }
        return 0;
    }

    private static byte[] X(byte[] bArr, int i) throws Rw0 {
        if (bArr.length > i) {
            throw new Rw0("invalid address length");
        }
        if (bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y(int i, int i2) {
        if (i2 < 0 || i2 >= 256) {
            return false;
        }
        if (i != 1 || i2 <= 32) {
            return i != 2 || i2 <= 128;
        }
        return false;
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0, UnknownHostException {
        this.r = new ArrayList(1);
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                return;
            }
            String strD = bVarI.d();
            boolean zStartsWith = strD.startsWith("!");
            int iIndexOf = strD.indexOf(58, zStartsWith ? 1 : 0);
            if (iIndexOf < 0) {
                throw fl0.f("invalid address prefix element");
            }
            int iIndexOf2 = strD.indexOf(47, iIndexOf);
            if (iIndexOf2 < 0) {
                throw fl0.f("invalid address prefix element");
            }
            String strSubstring = strD.substring(zStartsWith ? 1 : 0, iIndexOf);
            String strSubstring2 = strD.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring3 = strD.substring(iIndexOf2 + 1);
            try {
                int i = Integer.parseInt(strSubstring);
                if (i != 1 && i != 2) {
                    throw fl0.f("unknown family");
                }
                try {
                    int i2 = Integer.parseInt(strSubstring3);
                    if (!Y(i, i2)) {
                        throw fl0.f("invalid prefix length");
                    }
                    byte[] bArrO = C1062b2.o(strSubstring2, i);
                    if (bArrO == null) {
                        throw fl0.f("invalid IP address " + strSubstring2);
                    }
                    this.r.add(new b(zStartsWith, InetAddress.getByAddress(bArrO), i2));
                } catch (NumberFormatException unused) {
                    throw fl0.f("invalid prefix length");
                }
            } catch (NumberFormatException unused2) {
                throw fl0.f("invalid family");
            }
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = new ArrayList(1);
        while (c0474Hi.k() != 0) {
            int iH = c0474Hi.h();
            int iJ = c0474Hi.j();
            int iJ2 = c0474Hi.j();
            boolean z = (iJ2 & 128) != 0;
            byte[] bArrF = c0474Hi.f(iJ2 & (-129));
            if (!Y(iH, iJ)) {
                throw new Rw0("invalid prefix length");
            }
            this.r.add((iH == 1 || iH == 2) ? new b(z, InetAddress.getByAddress(X(bArrF, C1062b2.b(iH))), iJ) : new b(iH, z, bArrF, iJ));
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        Iterator<b> it = this.r.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        byte[] address;
        int iV;
        for (b bVar : this.r) {
            int i = bVar.a;
            if (i == 1 || i == 2) {
                address = ((InetAddress) bVar.d).getAddress();
                iV = V(address);
            } else {
                address = (byte[]) bVar.d;
                iV = address.length;
            }
            int i2 = bVar.b ? iV | 128 : iV;
            c0578Li.l(bVar.a);
            c0578Li.o(bVar.c);
            c0578Li.o(i2);
            c0578Li.j(address, 0, iV);
        }
    }

    public List<b> W() {
        return this.r;
    }

    public C1741i(C2848tT c2848tT, int i, long j, List<b> list) {
        super(c2848tT, 42, i, j);
        this.r = new ArrayList(list.size());
        for (b bVar : list) {
            int i2 = bVar.a;
            if (i2 != 1 && i2 != 2) {
                throw new IllegalArgumentException("unknown family");
            }
            this.r.add(bVar);
        }
    }
}
