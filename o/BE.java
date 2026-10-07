package o;

import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class BE extends H50 {
    private int r;
    private int s;
    private int t;
    private Object u;
    private byte[] v;

    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;

        private a() {
        }
    }

    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        private b() {
        }
    }

    public BE() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0, Rw0 {
        this.r = fl0.j0();
        this.s = fl0.j0();
        this.t = fl0.j0();
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                this.u = fl0.p(1);
            } else if (i == 2) {
                this.u = fl0.p(2);
            } else {
                if (i != 3) {
                    throw new Rw0("invalid gateway type");
                }
                this.u = fl0.d0(c2848tT);
            }
        } else {
            if (!fl0.e0().equals(".")) {
                throw new Ri0("invalid gateway format");
            }
            this.u = null;
        }
        this.v = fl0.Q(false);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = c0474Hi.j();
        this.s = c0474Hi.j();
        this.t = c0474Hi.j();
        int i = this.s;
        if (i == 0) {
            this.u = null;
        } else if (i == 1) {
            this.u = InetAddress.getByAddress(c0474Hi.f(4));
        } else if (i == 2) {
            this.u = InetAddress.getByAddress(c0474Hi.f(16));
        } else {
            if (i != 3) {
                throw new Rw0("invalid gateway type");
            }
            this.u = new C2848tT(c0474Hi);
        }
        if (c0474Hi.k() > 0) {
            this.v = c0474Hi.e();
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        sb.append(this.s);
        sb.append(" ");
        sb.append(this.t);
        sb.append(" ");
        int i = this.s;
        if (i == 0) {
            sb.append(".");
        } else if (i == 1 || i == 2) {
            sb.append(((InetAddress) this.u).getHostAddress());
        } else if (i == 3) {
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(" ");
            sb.append(Cy0.c(this.v));
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.o(this.s);
        c0578Li.o(this.t);
        int i = this.s;
        if (i == 1 || i == 2) {
            c0578Li.i(((InetAddress) this.u).getAddress());
        } else if (i == 3) {
            ((C2848tT) this.u).B(c0578Li, null, z);
        }
        byte[] bArr = this.v;
        if (bArr != null) {
            c0578Li.i(bArr);
        }
    }

    public int U() {
        return this.t;
    }

    public Object V() {
        return this.u;
    }

    public int W() {
        return this.s;
    }

    public byte[] X() {
        return this.v;
    }

    public int Y() {
        return this.r;
    }

    public BE(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, Object obj, byte[] bArr) {
        super(c2848tT, 45, i, j);
        this.r = H50.j("precedence", i2);
        this.s = H50.j("gatewayType", i3);
        this.t = H50.j("algorithmType", i4);
        if (i3 == 0) {
            this.u = null;
        } else if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException("\"gatewayType\" must be between 0 and 3");
                }
                if (!(obj instanceof C2848tT)) {
                    throw new IllegalArgumentException("\"gateway\" must be a DNS name");
                }
                this.u = H50.e("gateway", (C2848tT) obj);
            } else {
                if (!(obj instanceof Inet6Address)) {
                    throw new IllegalArgumentException("\"gateway\" must be an IPv6 address");
                }
                this.u = obj;
            }
        } else {
            if (!(obj instanceof InetAddress)) {
                throw new IllegalArgumentException("\"gateway\" must be an IPv4 address");
            }
            this.u = obj;
        }
        this.v = bArr;
    }
}
