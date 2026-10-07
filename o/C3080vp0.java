package o;

import java.util.HashMap;
import java.util.function.Supplier;

/* JADX INFO: renamed from: o.vp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3080vp0 {
    public static final int A = 27;
    public static final int A0 = 252;
    public static final int B = 28;
    public static final int B0 = 253;
    public static final int C = 29;
    public static final int C0 = 254;
    public static final int D = 30;
    public static final int D0 = 255;
    public static final int E = 31;
    public static final int E0 = 256;
    public static final int F = 32;
    public static final int F0 = 257;
    public static final int G = 33;
    public static final int G0 = 258;
    public static final int H = 34;
    public static final int H0 = 259;
    public static final int I = 35;
    public static final int I0 = 260;
    public static final int J = 36;
    public static final int J0 = 32768;
    public static final int K = 37;
    public static final int K0 = 32769;
    public static final int L = 38;
    private static final a L0;
    public static final int M = 39;
    public static final int N = 40;
    public static final int O = 41;
    public static final int P = 42;
    public static final int Q = 43;
    public static final int R = 44;
    public static final int S = 45;
    public static final int T = 46;
    public static final int U = 47;
    public static final int V = 48;
    public static final int W = 49;
    public static final int X = 50;
    public static final int Y = 51;
    public static final int Z = 52;
    public static final int a = 1;
    public static final int a0 = 53;
    public static final int b = 2;
    public static final int b0 = 55;
    public static final int c = 3;
    public static final int c0 = 56;
    public static final int d = 4;
    public static final int d0 = 57;
    public static final int e = 5;
    public static final int e0 = 58;
    public static final int f = 6;
    public static final int f0 = 59;
    public static final int g = 7;
    public static final int g0 = 60;
    public static final int h = 8;
    public static final int h0 = 61;
    public static final int i = 9;
    public static final int i0 = 62;
    public static final int j = 10;
    public static final int j0 = 63;
    public static final int k = 11;
    public static final int k0 = 64;
    public static final int l = 12;
    public static final int l0 = 65;
    public static final int m = 13;
    public static final int m0 = 99;
    public static final int n = 14;
    public static final int n0 = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1082o = 15;
    public static final int o0 = 101;
    public static final int p = 16;
    public static final int p0 = 102;
    public static final int q = 17;
    public static final int q0 = 103;
    public static final int r = 18;
    public static final int r0 = 104;
    public static final int s = 19;
    public static final int s0 = 105;
    public static final int t = 20;
    public static final int t0 = 106;
    public static final int u = 21;
    public static final int u0 = 107;
    public static final int v = 22;
    public static final int v0 = 108;
    public static final int w = 23;
    public static final int w0 = 109;
    public static final int x = 24;
    public static final int x0 = 249;
    public static final int y = 25;
    public static final int y0 = 250;
    public static final int z = 26;
    public static final int z0 = 251;

    /* JADX INFO: renamed from: o.vp0$a */
    public static class a extends MQ {
        private final HashMap<Integer, Supplier<H50>> k;

        public a() {
            super("Type", 2);
            o("TYPE");
            m(AQ.w);
            this.k = new HashMap<>();
        }

        @Override // o.MQ
        public void e(int i) {
            C3080vp0.a(i);
        }

        public void p(int i, String str, Supplier<H50> supplier) {
            super.b(i, str);
            this.k.put(Integer.valueOf(i), supplier);
        }

        public Supplier<H50> q(int i) {
            e(i);
            return this.k.get(Integer.valueOf(i));
        }

        public void r(int i, String str, Supplier<H50> supplier) {
            int iG = g(str);
            if (iG != -1) {
                if (iG != i) {
                    throw new IllegalArgumentException("mnemnonic \"" + str + "\" already used by type " + iG);
                }
                j(i);
                this.k.remove(Integer.valueOf(i));
            }
            p(i, str, supplier);
        }
    }

    static {
        a aVar = new a();
        L0 = aVar;
        aVar.p(1, "A", new C1504ff(12));
        aVar.p(2, "NS", new C1504ff(14));
        aVar.p(3, "MD", new C1504ff(26));
        final int i2 = 8;
        aVar.p(4, "MF", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i2) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i3 = 20;
        aVar.p(5, "CNAME", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i4 = 2;
        aVar.p(6, "SOA", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i4) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i5 = 4;
        aVar.p(7, "MB", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i6 = 5;
        aVar.p(8, "MG", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i6) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i7 = 6;
        aVar.p(9, "MR", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i7) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i8 = 8;
        aVar.p(10, "NULL", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i8) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        aVar.p(11, "WKS", new C1504ff(23));
        final int i9 = 4;
        aVar.p(12, "PTR", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i9) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i10 = 15;
        aVar.p(13, "HINFO", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i11 = 26;
        aVar.p(14, "MINFO", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i12 = 7;
        aVar.p(15, "MX", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i12) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i13 = 9;
        aVar.p(16, "TXT", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i13) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i14 = 10;
        aVar.p(17, "RP", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i14) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i15 = 11;
        aVar.p(18, "AFSDB", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i15) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i16 = 12;
        aVar.p(19, "X25", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i16) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        aVar.p(20, "ISDN", new C1504ff(13));
        aVar.p(21, "RT", new C1504ff(15));
        aVar.p(22, "NSAP", new C1504ff(16));
        aVar.p(23, "NSAP-PTR", new C1504ff(17));
        aVar.p(24, "SIG", new C1504ff(18));
        aVar.p(25, "KEY", new C1504ff(19));
        aVar.p(26, "PX", new C1504ff(20));
        aVar.p(27, "GPOS", new C1504ff(21));
        aVar.p(28, "AAAA", new C1504ff(22));
        aVar.p(29, "LOC", new C1504ff(24));
        aVar.p(30, "NXT", new C1504ff(25));
        aVar.b(31, "EID");
        aVar.b(32, "NIMLOC");
        aVar.p(33, "SRV", new C1504ff(27));
        aVar.b(34, "ATMA");
        aVar.p(35, "NAPTR", new C1504ff(28));
        aVar.p(36, "KX", new C1504ff(29));
        final int i17 = 0;
        aVar.p(37, "CERT", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i17) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i18 = 1;
        aVar.p(38, "A6", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i18) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i19 = 2;
        aVar.p(39, "DNAME", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i19) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        aVar.b(40, "SINK");
        final int i20 = 3;
        aVar.p(41, "OPT", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i20) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i21 = 5;
        aVar.p(42, "APL", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i21) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i22 = 6;
        aVar.p(43, "DS", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i22) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i23 = 7;
        aVar.p(44, "SSHFP", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i23) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i24 = 9;
        aVar.p(45, "IPSECKEY", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i24) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i25 = 10;
        aVar.p(46, "RRSIG", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i25) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i26 = 11;
        aVar.p(47, "NSEC", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i26) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i27 = 12;
        aVar.p(48, "DNSKEY", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i27) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i28 = 13;
        aVar.p(49, "DHCID", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i28) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i29 = 14;
        aVar.p(50, "NSEC3", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i29) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i30 = 16;
        aVar.p(51, "NSEC3PARAM", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i30) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i31 = 17;
        aVar.p(52, "TLSA", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i31) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i32 = 18;
        aVar.p(53, "SMIMEA", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i32) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i33 = 19;
        aVar.p(55, "HIP", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i33) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        aVar.b(56, "NINFO");
        aVar.b(57, "RKEY");
        aVar.b(58, "TALINK");
        final int i34 = 21;
        aVar.p(59, "CDS", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i34) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i35 = 22;
        aVar.p(60, "CDNSKEY", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i35) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i36 = 23;
        aVar.p(61, "OPENPGPKEY", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i36) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        aVar.b(62, "CSYNC");
        aVar.b(63, "ZONEMD");
        final int i37 = 24;
        aVar.p(64, "SVCB", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i37) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i38 = 25;
        aVar.p(65, "HTTPS", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i38) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i39 = 27;
        aVar.p(99, "SPF", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i39) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        aVar.b(100, "UINFO");
        aVar.b(101, "UID");
        aVar.b(102, "GID");
        aVar.b(103, "UNSPEC");
        aVar.b(104, "NID");
        aVar.b(105, "L32");
        aVar.b(t0, "L64");
        aVar.b(107, "LP");
        aVar.b(v0, "EUI48");
        aVar.b(109, "EUI64");
        final int i40 = 28;
        aVar.p(x0, "TKEY", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i40) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        final int i41 = 29;
        aVar.p(y0, "TSIG", new Supplier() { // from class: o.tp0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i41) {
                    case 0:
                        return new C3146wa();
                    case 1:
                        return new C1447f();
                    case 2:
                        return new C0448Gi();
                    case 3:
                        return new C3141wV();
                    case 4:
                        return new RW();
                    case 5:
                        return new C1741i();
                    case 6:
                        return new C0655Oi();
                    case 7:
                        return new C1955k90();
                    case 8:
                        return new C3423zM();
                    case 9:
                        return new BE();
                    case 10:
                        return new W40();
                    case 11:
                        return new C2073lT();
                    case 12:
                        return new C0552Ki();
                    case 13:
                        return new C0396Ei();
                    case 14:
                        return new C1877jT();
                    case 15:
                        return new VA();
                    case 16:
                        return new C1781iT();
                    case 17:
                        return new Yh0();
                    case 18:
                        return new C1272d90();
                    case 19:
                        return new XA();
                    case 20:
                        return new C3243xa();
                    case 21:
                        return new C2952ua();
                    case 22:
                        return new C2855ta();
                    case 23:
                        return new C2947uV();
                    case 24:
                        return new C2150m90();
                    case 25:
                        return new ZA();
                    case 26:
                        return new BM();
                    case 27:
                        return new C1565g90();
                    case 28:
                        return new Xh0();
                    default:
                        return new C1609gi0();
                }
            }
        });
        aVar.b(z0, "IXFR");
        aVar.b(252, "AXFR");
        aVar.b(253, "MAILB");
        aVar.b(254, "MAILA");
        aVar.b(255, "ANY");
        final int i42 = 0;
        aVar.p(256, "URI", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i42) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        final int i43 = 1;
        aVar.p(F0, "CAA", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i43) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
        aVar.b(G0, "AVC");
        aVar.b(H0, "DOA");
        aVar.b(I0, "AMTRELAY");
        aVar.b(32768, "TA");
        final int i44 = 3;
        aVar.p(K0, "DLV", new Supplier() { // from class: o.up0
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i44) {
                    case 0:
                        return new C1723hq0();
                    case 1:
                        return new C2758sa();
                    case 2:
                        return new C1467f90();
                    case 3:
                        return new C0422Fi();
                    case 4:
                        return new C3229xM();
                    case 5:
                        return new AM();
                    case 6:
                        return new CM();
                    case 7:
                        return new DM();
                    case 8:
                        return new C2364oT();
                    case 9:
                        return new C1901ji0();
                    case 10:
                        return new V40();
                    case 11:
                        return new C1643h();
                    default:
                        return new Yw0();
                }
            }
        });
    }

    private C3080vp0() {
    }

    public static void a(int i2) {
        if (i2 < 0 || i2 > 65535) {
            throw new C2060lG(i2);
        }
    }

    public static Supplier<H50> b(int i2) {
        return L0.q(i2);
    }

    public static boolean c(int i2) {
        if (i2 == 41) {
            return false;
        }
        switch (i2) {
            case x0 /* 249 */:
            case y0 /* 250 */:
            case z0 /* 251 */:
            case 252:
            case 253:
            case 254:
            case 255:
                return false;
            default:
                return true;
        }
    }

    public static void d(int i2, String str, Supplier<H50> supplier) {
        L0.r(i2, str, supplier);
    }

    public static String e(int i2) {
        return L0.f(i2);
    }

    public static int f(String str) {
        return g(str, false);
    }

    public static int g(String str, boolean z2) {
        a aVar = L0;
        int iG = aVar.g(str);
        return (iG == -1 && z2) ? aVar.g(AbstractC1701hf0.t("TYPE", str)) : iG;
    }
}
