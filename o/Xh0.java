package o;

import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Xh0 extends H50 {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    public static final int y = 1;
    public static final int z = 2;
    private C2848tT r;
    private Instant s;
    private Instant t;
    private int u;
    private int v;
    private byte[] w;
    private byte[] x;

    public Xh0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        throw fl0.f("no text format defined for TKEY");
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = new C2848tT(c0474Hi);
        this.s = Instant.ofEpochSecond(c0474Hi.i());
        this.t = Instant.ofEpochSecond(c0474Hi.i());
        this.u = c0474Hi.h();
        this.v = c0474Hi.h();
        int iH = c0474Hi.h();
        if (iH > 0) {
            this.w = c0474Hi.f(iH);
        } else {
            this.w = null;
        }
        int iH2 = c0474Hi.h();
        if (iH2 > 0) {
            this.x = c0474Hi.f(iH2);
        } else {
            this.x = null;
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        if (EW.a("multiline")) {
            sb.append("(\n\t");
        }
        sb.append(C0695Pw.a(this.s));
        sb.append(" ");
        sb.append(C0695Pw.a(this.t));
        sb.append(" ");
        sb.append(b0());
        sb.append(" ");
        sb.append(C2820t50.a(this.v));
        if (EW.a("multiline")) {
            sb.append("\n");
            byte[] bArr = this.w;
            if (bArr != null) {
                sb.append(Cy0.a(bArr, 64, "\t", false));
                sb.append("\n");
            }
            byte[] bArr2 = this.x;
            if (bArr2 != null) {
                sb.append(Cy0.a(bArr2, 64, "\t", false));
            }
            sb.append(" )");
        } else {
            sb.append(" ");
            byte[] bArr3 = this.w;
            if (bArr3 != null) {
                sb.append(Cy0.c(bArr3));
                sb.append(" ");
            }
            byte[] bArr4 = this.x;
            if (bArr4 != null) {
                sb.append(Cy0.c(bArr4));
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z2) {
        this.r.B(c0578Li, null, z2);
        c0578Li.n(this.s.getEpochSecond());
        c0578Li.n(this.t.getEpochSecond());
        c0578Li.l(this.u);
        c0578Li.l(this.v);
        byte[] bArr = this.w;
        if (bArr != null) {
            c0578Li.l(bArr.length);
            c0578Li.i(this.w);
        } else {
            c0578Li.l(0);
        }
        byte[] bArr2 = this.x;
        if (bArr2 == null) {
            c0578Li.l(0);
        } else {
            c0578Li.l(bArr2.length);
            c0578Li.i(this.x);
        }
    }

    public C2848tT U() {
        return this.r;
    }

    public int V() {
        return this.v;
    }

    public byte[] W() {
        return this.w;
    }

    public int X() {
        return this.u;
    }

    public byte[] Y() {
        return this.x;
    }

    public Instant Z() {
        return this.t;
    }

    public Instant a0() {
        return this.s;
    }

    public String b0() {
        int i = this.u;
        if (i == 1) {
            return "SERVERASSIGNED";
        }
        if (i == 2) {
            return "DIFFIEHELLMAN";
        }
        if (i == 3) {
            return "GSSAPI";
        }
        if (i != 4) {
            return i != 5 ? Integer.toString(i) : "DELETE";
        }
        return "RESOLVERASSIGNED";
    }

    public Xh0(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, Instant instant, Instant instant2, int i2, int i3, byte[] bArr, byte[] bArr2) {
        super(c2848tT, C3080vp0.x0, i, j);
        this.r = H50.e("alg", c2848tT2);
        this.s = instant;
        this.t = instant2;
        this.u = H50.g("mode", i2);
        this.v = H50.g("error", i3);
        this.w = bArr;
        this.x = bArr2;
    }

    @Deprecated
    public Xh0(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, Date date, Date date2, int i2, int i3, byte[] bArr, byte[] bArr2) {
        this(c2848tT, i, j, c2848tT2, DateRetargetClass.toInstant(date), DateRetargetClass.toInstant(date2), i2, i3, bArr, bArr2);
    }
}
