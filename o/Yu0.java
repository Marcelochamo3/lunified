package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Yu0 extends H50 {
    private byte[] r;
    private int s;
    private int[] t;

    public static class a {
        public static final int A = 28;
        public static final int B = 29;
        public static final int C = 30;
        public static final int D = 31;
        public static final int E = 32;
        public static final int F = 33;
        public static final int G = 62;
        public static final int H = 64;
        public static final int I = 65;
        public static final int J = 66;
        public static final int K = 67;
        public static final int L = 69;
        public static final int M = 71;
        public static final int N = 76;
        public static final int O = 78;
        public static final int P = 79;
        private static final MQ Q;
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 5;
        public static final int e = 6;
        public static final int f = 7;
        public static final int g = 8;
        public static final int h = 9;
        public static final int i = 10;
        public static final int j = 11;
        public static final int k = 12;
        public static final int l = 13;
        public static final int m = 14;
        public static final int n = 15;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f643o = 16;
        public static final int p = 17;
        public static final int q = 18;
        public static final int r = 19;
        public static final int s = 20;
        public static final int t = 21;
        public static final int u = 22;
        public static final int v = 23;
        public static final int w = 24;
        public static final int x = 25;
        public static final int y = 26;
        public static final int z = 27;

        static {
            MQ mq = new MQ("IP protocol", 3);
            Q = mq;
            mq.m(255);
            mq.n(true);
            mq.b(1, "icmp");
            mq.b(2, "igmp");
            mq.b(3, "ggp");
            mq.b(5, "st");
            mq.b(6, "tcp");
            mq.b(7, "ucl");
            mq.b(8, "egp");
            mq.b(9, "igp");
            mq.b(10, "bbn-rcc-mon");
            mq.b(11, "nvp-ii");
            mq.b(12, "pup");
            mq.b(13, "argus");
            mq.b(14, "emcon");
            mq.b(15, "xnet");
            mq.b(16, "chaos");
            mq.b(17, "udp");
            mq.b(18, "mux");
            mq.b(19, "dcn-meas");
            mq.b(20, "hmp");
            mq.b(21, "prm");
            mq.b(22, "xns-idp");
            mq.b(23, "trunk-1");
            mq.b(24, "trunk-2");
            mq.b(25, "leaf-1");
            mq.b(26, "leaf-2");
            mq.b(27, "rdp");
            mq.b(28, "irtp");
            mq.b(29, "iso-tp4");
            mq.b(30, "netblt");
            mq.b(31, "mfe-nsp");
            mq.b(32, "merit-inp");
            mq.b(33, "sep");
            mq.b(62, "cftp");
            mq.b(64, "sat-expak");
            mq.b(65, "mit-subnet");
            mq.b(66, "rvd");
            mq.b(67, "ippc");
            mq.b(69, "sat-mon");
            mq.b(71, "ipcv");
            mq.b(76, "br-sat-mon");
            mq.b(78, "wb-mon");
            mq.b(79, "wb-expak");
        }

        private a() {
        }

        public static String a(int i2) {
            return Q.f(i2);
        }

        public static int b(String str) {
            return Q.g(str);
        }
    }

    public static class b {
        public static final int A = 53;
        public static final int A0 = 245;
        public static final int B = 55;
        private static final MQ B0;
        public static final int C = 61;
        public static final int D = 63;
        public static final int E = 65;
        public static final int F = 67;
        public static final int G = 68;
        public static final int H = 69;
        public static final int I = 71;
        public static final int J = 72;
        public static final int K = 73;
        public static final int L = 74;
        public static final int M = 79;
        public static final int N = 81;
        public static final int O = 89;
        public static final int P = 91;
        public static final int Q = 93;
        public static final int R = 95;
        public static final int S = 97;
        public static final int T = 98;
        public static final int U = 99;
        public static final int V = 101;
        public static final int W = 102;
        public static final int X = 103;
        public static final int Y = 104;
        public static final int Z = 105;
        public static final int a = 5;
        public static final int a0 = 107;
        public static final int b = 7;
        public static final int b0 = 109;
        public static final int c = 9;
        public static final int c0 = 111;
        public static final int d = 11;
        public static final int d0 = 113;
        public static final int e = 13;
        public static final int e0 = 115;
        public static final int f = 17;
        public static final int f0 = 117;
        public static final int g = 19;
        public static final int g0 = 119;
        public static final int h = 20;
        public static final int h0 = 121;
        public static final int i = 21;
        public static final int i0 = 123;
        public static final int j = 23;
        public static final int j0 = 125;
        public static final int k = 25;
        public static final int k0 = 127;
        public static final int l = 27;
        public static final int l0 = 129;
        public static final int m = 29;
        public static final int m0 = 130;
        public static final int n = 31;
        public static final int n0 = 131;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f644o = 33;
        public static final int o0 = 132;
        public static final int p = 37;
        public static final int p0 = 133;
        public static final int q = 39;
        public static final int q0 = 134;
        public static final int r = 41;
        public static final int r0 = 135;
        public static final int s = 42;
        public static final int s0 = 136;
        public static final int t = 43;
        public static final int t0 = 137;
        public static final int u = 44;
        public static final int u0 = 138;
        public static final int v = 45;
        public static final int v0 = 139;
        public static final int w = 46;
        public static final int w0 = 140;
        public static final int x = 47;
        public static final int x0 = 141;
        public static final int y = 49;
        public static final int y0 = 142;
        public static final int z = 51;
        public static final int z0 = 243;

        static {
            MQ mq = new MQ("TCP/UDP service", 3);
            B0 = mq;
            mq.m(AQ.w);
            mq.n(true);
            mq.b(5, "rje");
            mq.b(7, "echo");
            mq.b(9, "discard");
            mq.b(11, "users");
            mq.b(13, "daytime");
            mq.b(17, "quote");
            mq.b(19, "chargen");
            mq.b(20, "ftp-data");
            mq.b(21, "ftp");
            mq.b(23, "telnet");
            mq.b(25, "smtp");
            mq.b(27, "nsw-fe");
            mq.b(29, "msg-icp");
            mq.b(31, "msg-auth");
            mq.b(33, "dsp");
            mq.b(37, "time");
            mq.b(39, "rlp");
            mq.b(41, "graphics");
            mq.b(42, "nameserver");
            mq.b(43, "nicname");
            mq.b(44, "mpm-flags");
            mq.b(45, "mpm");
            mq.b(46, "mpm-snd");
            mq.b(47, "ni-ftp");
            mq.b(49, "login");
            mq.b(51, "la-maint");
            mq.b(53, "domain");
            mq.b(55, "isi-gl");
            mq.b(61, "ni-mail");
            mq.b(63, "via-ftp");
            mq.b(65, "tacacs-ds");
            mq.b(67, "bootps");
            mq.b(68, "bootpc");
            mq.b(69, "tftp");
            mq.b(71, "netrjs-1");
            mq.b(72, "netrjs-2");
            mq.b(73, "netrjs-3");
            mq.b(74, "netrjs-4");
            mq.b(79, "finger");
            mq.b(81, "hosts2-ns");
            mq.b(89, "su-mit-tg");
            mq.b(91, "mit-dov");
            mq.b(93, "dcp");
            mq.b(95, "supdup");
            mq.b(97, "swift-rvf");
            mq.b(98, "tacnews");
            mq.b(99, "metagram");
            mq.b(101, "hostname");
            mq.b(102, "iso-tsap");
            mq.b(103, "x400");
            mq.b(104, "x400-snd");
            mq.b(105, "csnet-ns");
            mq.b(107, "rtelnet");
            mq.b(109, "pop-2");
            mq.b(c0, "sunrpc");
            mq.b(d0, "auth");
            mq.b(e0, "sftp");
            mq.b(f0, "uucp-path");
            mq.b(g0, "nntp");
            mq.b(h0, "erpc");
            mq.b(i0, "ntp");
            mq.b(j0, "locus-map");
            mq.b(k0, "locus-con");
            mq.b(l0, "pwdgen");
            mq.b(m0, "cisco-fna");
            mq.b(n0, "cisco-tna");
            mq.b(o0, "cisco-sys");
            mq.b(p0, "statsrv");
            mq.b(q0, "ingres-net");
            mq.b(r0, "loc-srv");
            mq.b(s0, "profile");
            mq.b(t0, "netbios-ns");
            mq.b(u0, "netbios-dgm");
            mq.b(v0, "netbios-ssn");
            mq.b(w0, "emfis-data");
            mq.b(x0, "emfis-cntl");
            mq.b(y0, "bl-idm");
            mq.b(z0, "sur-meas");
            mq.b(A0, "link");
        }

        private b() {
        }

        public static String a(int i2) {
            return B0.f(i2);
        }

        public static int b(String str) {
            return B0.g(str);
        }
    }

    public Yu0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        byte[] bArrO = C1062b2.o(fl0.e0(), 1);
        this.r = bArrO;
        if (bArrO == null) {
            throw fl0.f("invalid address");
        }
        String strE0 = fl0.e0();
        int iB = a.b(strE0);
        this.s = iB;
        if (iB < 0) {
            throw fl0.f("Invalid IP protocol: " + strE0);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                this.t = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    this.t[i] = ((Integer) arrayList.get(i)).intValue();
                }
                return;
            }
            int iB2 = b.b(bVarI.d());
            if (iB2 < 0) {
                throw fl0.f("Invalid TCP/UDP service: " + bVarI.d());
            }
            arrayList.add(Integer.valueOf(iB2));
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.f(4);
        this.s = c0474Hi.j();
        byte[] bArrE = c0474Hi.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArrE.length; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if ((bArrE[i] & 255 & (1 << (7 - i2))) != 0) {
                    arrayList.add(Integer.valueOf((i * 8) + i2));
                }
            }
        }
        this.t = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.t[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1062b2.p(this.r));
        sb.append(" ");
        sb.append(this.s);
        for (int i : this.t) {
            sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
        c0578Li.o(this.s);
        int[] iArr = this.t;
        byte[] bArr = new byte[(iArr[iArr.length - 1] / 8) + 1];
        for (int i : iArr) {
            int i2 = i / 8;
            bArr[i2] = (byte) ((1 << (7 - (i % 8))) | bArr[i2]);
        }
        c0578Li.i(bArr);
    }

    public InetAddress U() {
        try {
            return InetAddress.getByAddress(this.r);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public int V() {
        return this.s;
    }

    public int[] W() {
        return this.t;
    }

    public Yu0(C2848tT c2848tT, int i, long j, InetAddress inetAddress, int i2, int[] iArr) {
        super(c2848tT, 11, i, j);
        if (C1062b2.c(inetAddress) != 1) {
            throw new IllegalArgumentException("invalid IPv4 address");
        }
        this.r = inetAddress.getAddress();
        this.s = H50.j("protocol", i2);
        for (int i3 : iArr) {
            H50.g("service", i3);
        }
        int[] iArr2 = new int[iArr.length];
        this.t = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        Arrays.sort(this.t);
    }
}
