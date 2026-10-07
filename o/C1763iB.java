package o;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: renamed from: o.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1763iB implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Random f827o = new SecureRandom();
    public static final int p = 12;
    private int l;
    private int m;
    private int[] n;

    public C1763iB(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(AbstractC1674hK.p("DNS message ID ", i, " is out of range"));
        }
        this.n = new int[4];
        this.m = 0;
        this.l = i;
    }

    private static boolean B(int i) {
        return i >= 0 && i <= 15 && C3285xv.a(i);
    }

    private static void b(int i) {
        if (!B(i)) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "invalid flag bit "));
        }
    }

    private void q(StringBuilder sb) {
        for (int i = 0; i < 16; i++) {
            if (B(i) && g(i)) {
                sb.append(C3285xv.b(i));
                sb.append(" ");
            }
        }
    }

    public static int s(int i, int i2, boolean z) {
        b(i2);
        return z ? i | (1 << (15 - i2)) : i & (~(1 << (15 - i2)));
    }

    public void A(int i) {
        b(i);
        this.m = s(this.m, i, false);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1763iB clone() {
        C1763iB c1763iB = (C1763iB) super.clone();
        c1763iB.l = this.l;
        c1763iB.m = this.m;
        int[] iArr = new int[c1763iB.n.length];
        c1763iB.n = iArr;
        int[] iArr2 = this.n;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        return c1763iB;
    }

    public void d(int i) {
        int[] iArr = this.n;
        int i2 = iArr[i];
        if (i2 == 0) {
            throw new IllegalStateException("DNS section count cannot be decremented");
        }
        iArr[i] = i2 - 1;
    }

    public int e(int i) {
        return this.n[i];
    }

    public boolean g(int i) {
        b(i);
        return ((1 << (15 - i)) & this.m) != 0;
    }

    public boolean[] h() {
        boolean[] zArr = new boolean[16];
        for (int i = 0; i < 16; i++) {
            if (B(i)) {
                zArr[i] = g(i);
            }
        }
        return zArr;
    }

    public int j() {
        return this.m;
    }

    public int k() {
        return this.l;
    }

    public int m() {
        return (this.m >> 11) & 15;
    }

    public int n() {
        return this.m & 15;
    }

    public void o(int i) {
        int[] iArr = this.n;
        int i2 = iArr[i];
        if (i2 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = i2 + 1;
    }

    public String p() {
        StringBuilder sb = new StringBuilder();
        q(sb);
        return sb.toString();
    }

    public void r(int i, int i2) {
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException(AbstractC1674hK.p("DNS section count ", i2, " is out of range"));
        }
        this.n[i] = i2;
    }

    public void t(int i) {
        b(i);
        this.m = s(this.m, i, true);
    }

    public String toString() {
        return x(n());
    }

    public void u(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(AbstractC1674hK.p("DNS message ID ", i, " is out of range"));
        }
        this.l = i;
    }

    public void v(int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException(AbstractC1674hK.p("DNS Opcode ", i, "is out of range"));
        }
        this.m = (i << 11) | (this.m & 34815);
    }

    public void w(int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException(AbstractC1674hK.p("DNS Rcode ", i, " is out of range"));
        }
        this.m = i | (this.m & (-16));
    }

    public String x(int i) {
        StringBuilder sbK = AbstractC1701hf0.k(";; ->>HEADER<<- opcode: ");
        sbK.append(C2948uW.a(m()));
        sbK.append(", status: ");
        sbK.append(C2820t50.b(i));
        sbK.append(", id: ");
        sbK.append(k());
        sbK.append("\n;; flags: ");
        q(sbK);
        sbK.append("; ");
        for (int i2 = 0; i2 < 4; i2++) {
            sbK.append(C1399eb0.b(i2));
            sbK.append(": ");
            sbK.append(e(i2));
            sbK.append(" ");
        }
        return sbK.toString();
    }

    public void y(C0578Li c0578Li) {
        c0578Li.l(k());
        c0578Li.l(this.m);
        for (int i : this.n) {
            c0578Li.l(i);
        }
    }

    public byte[] z() {
        C0578Li c0578Li = new C0578Li();
        y(c0578Li);
        return c0578Li.g();
    }

    public C1763iB() {
        this(f827o.nextInt(AQ.w));
    }

    public C1763iB(C0474Hi c0474Hi) {
        this(c0474Hi.h());
        this.m = c0474Hi.h();
        int i = 0;
        while (true) {
            int[] iArr = this.n;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = c0474Hi.h();
            i++;
        }
    }

    public C1763iB(byte[] bArr) {
        this(new C0474Hi(bArr));
    }
}
