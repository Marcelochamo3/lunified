package o;

/* JADX INFO: renamed from: o.f90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1467f90 extends H50 {
    private C2848tT r;
    private C2848tT s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;

    public C1467f90() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.d0(c2848tT);
        this.s = fl0.d0(c2848tT);
        this.t = fl0.i0();
        this.u = fl0.g0();
        this.v = fl0.g0();
        this.w = fl0.g0();
        this.x = fl0.g0();
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = new C2848tT(c0474Hi);
        this.s = new C2848tT(c0474Hi);
        this.t = c0474Hi.i();
        this.u = c0474Hi.i();
        this.v = c0474Hi.i();
        this.w = c0474Hi.i();
        this.x = c0474Hi.i();
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        sb.append(this.s);
        if (EW.a("multiline")) {
            sb.append(" (\n\t\t\t\t\t");
            sb.append(this.t);
            sb.append("\t; serial\n\t\t\t\t\t");
            sb.append(this.u);
            sb.append("\t; refresh\n\t\t\t\t\t");
            sb.append(this.v);
            sb.append("\t; retry\n\t\t\t\t\t");
            sb.append(this.w);
            sb.append("\t; expire\n\t\t\t\t\t");
            sb.append(this.x);
            sb.append(" )\t; minimum");
        } else {
            sb.append(" ");
            sb.append(this.t);
            sb.append(" ");
            sb.append(this.u);
            sb.append(" ");
            sb.append(this.v);
            sb.append(" ");
            sb.append(this.w);
            sb.append(" ");
            sb.append(this.x);
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, c1799ig, z);
        this.s.B(c0578Li, c1799ig, z);
        c0578Li.n(this.t);
        c0578Li.n(this.u);
        c0578Li.n(this.v);
        c0578Li.n(this.w);
        c0578Li.n(this.x);
    }

    public C2848tT U() {
        return this.s;
    }

    public long V() {
        return this.w;
    }

    public C2848tT W() {
        return this.r;
    }

    public long X() {
        return this.x;
    }

    public long Y() {
        return this.u;
    }

    public long Z() {
        return this.v;
    }

    public long a0() {
        return this.t;
    }

    public C1467f90(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, C2848tT c2848tT3, long j2, long j3, long j4, long j5, long j6) {
        super(c2848tT, 6, i, j);
        this.r = H50.e("host", c2848tT2);
        this.s = H50.e("admin", c2848tT3);
        this.t = H50.h("serial", j2);
        this.u = H50.h("refresh", j3);
        this.v = H50.h("retry", j4);
        this.w = H50.h("expire", j5);
        this.x = H50.h("minimum", j6);
    }
}
