package o;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public class OI extends H50 {
    private static final NumberFormat x;
    private static final NumberFormat y;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        x = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        y = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    public OI() {
    }

    private long a0(Fl0 fl0, String str, boolean z, long j, long j2, long j3) throws Ri0 {
        Fl0.b bVarI = fl0.i();
        if (bVarI.a()) {
            if (!z) {
                fl0.n0();
                return j3;
            }
            throw fl0.f("Invalid LOC " + str);
        }
        String strD = bVarI.d();
        if (strD.length() > 1 && strD.charAt(strD.length() - 1) == 'm') {
            strD = strD.substring(0, strD.length() - 1);
        }
        try {
            long jB0 = (long) (b0(strD) * 100.0d);
            if (jB0 >= j && jB0 <= j2) {
                return jB0;
            }
            throw fl0.f("Invalid LOC " + str);
        } catch (NumberFormatException unused) {
            throw fl0.f("Invalid LOC " + str);
        }
    }

    private double b0(String str) {
        if (str.matches("^-?\\d+$")) {
            return Integer.parseInt(str);
        }
        if (!str.matches("^-?\\d+\\.\\d*$")) {
            throw new NumberFormatException();
        }
        String[] strArrSplit = str.split("\\.");
        double d = Integer.parseInt(strArrSplit[0]);
        double d2 = Integer.parseInt(strArrSplit[1]);
        if (d < 0.0d) {
            d2 *= -1.0d;
        }
        return (d2 / Math.pow(10.0d, strArrSplit[1].length())) + d;
    }

    private static long c0(int i) throws Rw0 {
        long j = i >> 4;
        int i2 = i & 15;
        if (j > 9 || i2 > 9) {
            throw new Rw0("Invalid LOC Encoding");
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return j;
            }
            j *= 10;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    private long d0(Fl0 fl0, String str) throws Ri0 {
        int i;
        double dB0;
        boolean zEquals = str.equals("latitude");
        int iH0 = fl0.h0();
        if (iH0 > 180 || (iH0 > 90 && zEquals)) {
            throw fl0.f("Invalid LOC " + str + " degrees");
        }
        String strE0 = fl0.e0();
        double d = 0.0d;
        try {
            i = Integer.parseInt(strE0);
            try {
                if (i < 0 || i > 59) {
                    throw fl0.f("Invalid LOC " + str + " minutes");
                }
                try {
                    strE0 = fl0.e0();
                    dB0 = b0(strE0);
                    try {
                        if (dB0 < 0.0d || dB0 >= 60.0d) {
                            throw fl0.f("Invalid LOC " + str + " seconds");
                        }
                        strE0 = fl0.e0();
                        if (strE0.length() == 1) {
                            throw fl0.f("Invalid LOC ".concat(str));
                        }
                        long j = (long) ((dB0 + (((((long) iH0) * 60) + ((long) i)) * 60)) * 1000.0d);
                        char upperCase = Character.toUpperCase(strE0.charAt(0));
                        if ((!zEquals && upperCase == 'S') || (!zEquals && upperCase == 'W')) {
                            j = -j;
                        } else if ((zEquals && upperCase != 'N') || (!zEquals && upperCase != 'E')) {
                            throw fl0.f("Invalid LOC ".concat(str));
                        }
                        return j + 2147483648L;
                    } catch (NumberFormatException unused) {
                        d = dB0;
                        dB0 = d;
                    }
                } catch (NumberFormatException unused2) {
                    dB0 = d;
                    if (strE0.length() == 1) {
                        throw fl0.f("Invalid LOC ".concat(str));
                    }
                    long j2 = (long) ((dB0 + (((((long) iH0) * 60) + ((long) i)) * 60)) * 1000.0d);
                    char upperCase2 = Character.toUpperCase(strE0.charAt(0));
                    if (!zEquals) {
                        if (zEquals) {
                            throw fl0.f("Invalid LOC ".concat(str));
                        }
                        throw fl0.f("Invalid LOC ".concat(str));
                    }
                    if (zEquals) {
                        throw fl0.f("Invalid LOC ".concat(str));
                    }
                    throw fl0.f("Invalid LOC ".concat(str));
                    return j2 + 2147483648L;
                }
            } catch (NumberFormatException unused3) {
            }
        } catch (NumberFormatException unused4) {
            i = 0;
        }
    }

    private String e0(long j, char c, char c2) {
        StringBuilder sb = new StringBuilder();
        long j2 = j - 2147483648L;
        if (j2 < 0) {
            j2 = -j2;
            c = c2;
        }
        sb.append(j2 / 3600000);
        long j3 = j2 % 3600000;
        sb.append(" ");
        sb.append(j3 / 60000);
        sb.append(" ");
        f0(sb, y, j3 % 60000, 1000L);
        sb.append(" ");
        sb.append(c);
        return sb.toString();
    }

    private void f0(StringBuilder sb, NumberFormat numberFormat, long j, long j2) {
        sb.append(j / j2);
        long j3 = j % j2;
        if (j3 != 0) {
            sb.append(".");
            sb.append(numberFormat.format(j3));
        }
    }

    private int g0(long j) {
        byte b = 0;
        while (j > 9) {
            b = (byte) (b + 1);
            j /= 10;
        }
        return (int) ((j << 4) + ((long) (b & 255)));
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.u = d0(fl0, "latitude");
        this.v = d0(fl0, "longitude");
        this.w = a0(fl0, "altitude", true, -10000000L, 4284967295L, 0L) + 10000000;
        this.r = a0(fl0, "size", false, 0L, 9000000000L, 100L);
        this.s = a0(fl0, "horizontal precision", false, 0L, 9000000000L, 1000000L);
        this.t = a0(fl0, "vertical precision", false, 0L, 9000000000L, 1000L);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        if (c0474Hi.j() != 0) {
            throw new Rw0("Invalid LOC version");
        }
        this.r = c0(c0474Hi.j());
        this.s = c0(c0474Hi.j());
        this.t = c0(c0474Hi.j());
        this.u = c0474Hi.i();
        this.v = c0474Hi.i();
        this.w = c0474Hi.i();
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(e0(this.u, 'N', 'S'));
        sb.append(" ");
        sb.append(e0(this.v, 'E', 'W'));
        sb.append(" ");
        NumberFormat numberFormat = x;
        f0(sb, numberFormat, this.w - 10000000, 100L);
        sb.append("m ");
        f0(sb, numberFormat, this.r, 100L);
        sb.append("m ");
        f0(sb, numberFormat, this.s, 100L);
        sb.append("m ");
        f0(sb, numberFormat, this.t, 100L);
        sb.append("m");
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(0);
        c0578Li.o(g0(this.r));
        c0578Li.o(g0(this.s));
        c0578Li.o(g0(this.t));
        c0578Li.n(this.u);
        c0578Li.n(this.v);
        c0578Li.n(this.w);
    }

    public double U() {
        return (this.w - 10000000) / 100.0d;
    }

    public double V() {
        return this.s / 100.0d;
    }

    public double W() {
        return (this.u - 2147483648L) / 3600000.0d;
    }

    public double X() {
        return (this.v - 2147483648L) / 3600000.0d;
    }

    public double Y() {
        return this.r / 100.0d;
    }

    public double Z() {
        return this.t / 100.0d;
    }

    public OI(C2848tT c2848tT, int i, long j, double d, double d2, double d3, double d4, double d5, double d6) {
        super(c2848tT, 29, i, j);
        this.u = (long) ((d * 3600.0d * 1000.0d) + 2.147483648E9d);
        this.v = (long) ((3600.0d * d2 * 1000.0d) + 2.147483648E9d);
        this.w = (long) ((d3 + 100000.0d) * 100.0d);
        this.r = (long) (d4 * 100.0d);
        this.s = (long) (d5 * 100.0d);
        this.t = (long) (d6 * 100.0d);
    }
}
