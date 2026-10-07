package o;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.Date;

/* JADX INFO: renamed from: o.gi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1609gi0 extends H50 {
    private C2848tT r;
    private Instant s;
    private Duration t;
    private byte[] u;
    private int v;
    private int w;
    private byte[] x;

    public C1609gi0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        throw fl0.f("no text format defined for TSIG");
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = new C2848tT(c0474Hi);
        this.s = Instant.ofEpochSecond((((long) c0474Hi.h()) << 32) + c0474Hi.i());
        this.t = Duration.ofSeconds(c0474Hi.h());
        this.u = c0474Hi.f(c0474Hi.h());
        this.v = c0474Hi.h();
        this.w = c0474Hi.h();
        int iH = c0474Hi.h();
        if (iH > 0) {
            this.x = c0474Hi.f(iH);
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
        sb.append(this.s.getEpochSecond());
        sb.append(" ");
        sb.append((int) this.t.getSeconds());
        sb.append(" ");
        sb.append(this.u.length);
        if (EW.a("multiline")) {
            sb.append("\n");
            sb.append(Cy0.a(this.u, 64, "\t", false));
        } else {
            sb.append(" ");
            sb.append(Cy0.c(this.u));
        }
        sb.append(" ");
        sb.append(C2820t50.a(this.w));
        sb.append(" ");
        byte[] bArr = this.x;
        if (bArr == null) {
            sb.append(0);
        } else {
            sb.append(bArr.length);
            if (EW.a("multiline")) {
                sb.append("\n\n\n\t");
            } else {
                sb.append(" ");
            }
            if (this.w == 18) {
                byte[] bArr2 = this.x;
                if (bArr2.length != 6) {
                    sb.append("<invalid BADTIME other data>");
                } else {
                    long j = (((long) (bArr2[0] & 255)) << 40) + (((long) (bArr2[1] & 255)) << 32) + ((long) ((bArr2[2] & 255) << 24)) + ((long) ((bArr2[3] & 255) << 16)) + ((long) ((bArr2[4] & 255) << 8)) + ((long) (bArr2[5] & 255));
                    sb.append("<server time: ");
                    sb.append(Instant.ofEpochSecond(j));
                    sb.append(">");
                }
            } else {
                sb.append("<");
                sb.append(Cy0.c(this.x));
                sb.append(">");
            }
        }
        if (EW.a("multiline")) {
            sb.append(" )");
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, null, z);
        long epochSecond = this.s.getEpochSecond();
        c0578Li.l((int) (epochSecond >> 32));
        c0578Li.n(epochSecond & 4294967295L);
        c0578Li.l((int) this.t.getSeconds());
        c0578Li.l(this.u.length);
        c0578Li.i(this.u);
        c0578Li.l(this.v);
        c0578Li.l(this.w);
        byte[] bArr = this.x;
        if (bArr == null) {
            c0578Li.l(0);
        } else {
            c0578Li.l(bArr.length);
            c0578Li.i(this.x);
        }
    }

    public C2848tT U() {
        return this.r;
    }

    public int V() {
        return this.w;
    }

    public Duration W() {
        return this.t;
    }

    public int X() {
        return this.v;
    }

    public byte[] Y() {
        return this.x;
    }

    public byte[] Z() {
        return this.u;
    }

    public Instant a0() {
        return this.s;
    }

    @Deprecated
    public C1609gi0(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, Date date, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        this(c2848tT, i, j, c2848tT2, DateRetargetClass.toInstant(date), Duration.ofSeconds(i2), bArr, i3, i4, bArr2);
    }

    public C1609gi0(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, Instant instant, Duration duration, byte[] bArr, int i2, int i3, byte[] bArr2) {
        super(c2848tT, C3080vp0.y0, i, j);
        this.r = H50.e("alg", c2848tT2);
        this.s = instant;
        H50.g("fudge", (int) duration.getSeconds());
        this.t = duration;
        this.u = bArr;
        this.v = H50.g("originalID", i2);
        this.w = H50.g("error", i3);
        this.x = bArr2;
    }
}
