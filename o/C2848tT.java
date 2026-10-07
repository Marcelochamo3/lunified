package o;

import java.io.Serializable;
import java.util.Arrays;
import lombok.Generated;

/* JADX INFO: renamed from: o.tT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2848tT implements Comparable<C2848tT>, Serializable {
    private static final C2848tT B;
    private static final int q = 0;
    private static final int r = 192;
    private static final int s = 192;
    private static final long serialVersionUID = -6036624806201621219L;
    public static final C2848tT v;
    public static final C2848tT w;
    private static final int x = 255;
    private static final int y = 63;
    private static final int z = 9;
    private byte[] l;
    private long m;
    private transient int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1043o;

    @Generated
    private static final CL p = DL.d(C2848tT.class);
    private static final byte[] t = {0};
    private static final byte[] u = {1, 42};
    private static final byte[] A = new byte[256];

    static {
        int i = 0;
        while (true) {
            byte[] bArr = A;
            if (i >= bArr.length) {
                C2848tT c2848tT = new C2848tT();
                v = c2848tT;
                c2848tT.l = t;
                c2848tT.f1043o = 1;
                C2848tT c2848tT2 = new C2848tT();
                w = c2848tT2;
                c2848tT2.l = new byte[0];
                C2848tT c2848tT3 = new C2848tT();
                B = c2848tT3;
                c2848tT3.l = u;
                c2848tT3.f1043o = 1;
                return;
            }
            if (i < 65 || i > 90) {
                bArr[i] = (byte) i;
            } else {
                bArr[i] = (byte) (i + 32);
            }
            i++;
        }
    }

    private C2848tT() {
    }

    private void a(byte[] bArr, int i, int i2) throws C2945uT {
        byte[] bArr2 = this.l;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3] + 1;
            i3 += i6;
            i4 += i6;
        }
        int i7 = length + i4;
        if (i7 > 255) {
            throw new C2945uT();
        }
        byte[] bArr3 = this.l;
        byte[] bArrCopyOf = bArr3 != null ? Arrays.copyOf(bArr3, i7) : new byte[i7];
        System.arraycopy(bArr, i, bArrCopyOf, length, i4);
        this.l = bArrCopyOf;
        for (int i8 = 0; i8 < i2 && i8 < 9; i8++) {
            x(this.f1043o + i8, length);
            length += bArrCopyOf[length] + 1;
        }
        this.f1043o += i2;
    }

    private void b(char[] cArr, int i) throws C2945uT {
        int iV = v(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.l[iV + i2] = (byte) cArr[i2];
        }
    }

    private void c(String str, byte[] bArr, int i) throws Ri0 {
        try {
            a(bArr, 0, i);
        } catch (C2945uT unused) {
            throw new Ri0(str, "Name too long");
        }
    }

    private void d(String str, char[] cArr, int i) throws Ri0 {
        try {
            b(cArr, i);
        } catch (C2945uT e) {
            throw new Ri0(str, "Name too long", e);
        }
    }

    private String e(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i + 1;
        int i3 = bArr[i];
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            int i5 = bArr[i4] & 255;
            if (i5 <= 32 || i5 >= 127) {
                sb.append('\\');
                if (i5 < 10) {
                    sb.append("00");
                } else if (i5 < 100) {
                    sb.append('0');
                }
                sb.append(i5);
            } else if (i5 == 34 || i5 == 40 || i5 == 41 || i5 == 46 || i5 == 59 || i5 == 92 || i5 == 64 || i5 == 36) {
                sb.append('\\');
                sb.append((char) i5);
            } else {
                sb.append((char) i5);
            }
        }
        return sb.toString();
    }

    public static C2848tT h(C2848tT c2848tT, C2848tT c2848tT2) throws C2945uT {
        if (c2848tT.q()) {
            return c2848tT;
        }
        C2848tT c2848tT3 = new C2848tT();
        c2848tT3.a(c2848tT.l, 0, c2848tT.f1043o);
        c2848tT3.a(c2848tT2.l, 0, c2848tT2.f1043o);
        return c2848tT3;
    }

    private static void i(C2848tT c2848tT, C2848tT c2848tT2) {
        c2848tT2.l = c2848tT.l;
        c2848tT2.m = c2848tT.m;
        c2848tT2.f1043o = c2848tT.f1043o;
    }

    private boolean j(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1043o; i3++) {
            byte b = this.l[i2];
            if (b != bArr[i]) {
                return false;
            }
            i2++;
            i++;
            int i4 = 0;
            while (i4 < b) {
                byte[] bArr2 = A;
                int i5 = i2 + 1;
                int i6 = i + 1;
                if (bArr2[this.l[i2] & 255] != bArr2[bArr[i] & 255]) {
                    return false;
                }
                i4++;
                i = i6;
                i2 = i5;
            }
        }
        return true;
    }

    public static C2848tT k(String str) {
        try {
            return n(str, null);
        } catch (Ri0 unused) {
            throw new IllegalArgumentException(AbstractC1701hf0.u("Invalid name '", str, "'"));
        }
    }

    public static C2848tT m(String str) {
        return n(str, null);
    }

    public static C2848tT n(String str, C2848tT c2848tT) {
        if (str.equals("@")) {
            return c2848tT != null ? c2848tT : w;
        }
        return str.equals(".") ? v : new C2848tT(str, c2848tT);
    }

    private int u(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 1 || i >= this.f1043o) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 9) {
            return ((int) (this.m >>> ((i - 1) * 8))) & 255;
        }
        int i2 = ((int) (this.m >>> 56)) & 255;
        for (int i3 = 8; i3 < i; i3++) {
            i2 += this.l[i2] + 1;
        }
        return i2;
    }

    private int v(int i) throws C2945uT {
        byte[] bArr = this.l;
        int length = bArr == null ? 0 : bArr.length;
        int i2 = length + 1;
        int i3 = i2 + i;
        if (i3 > 255) {
            throw new C2945uT();
        }
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, i3) : new byte[i3];
        bArrCopyOf[length] = (byte) i;
        this.l = bArrCopyOf;
        x(this.f1043o, length);
        this.f1043o++;
        return i2;
    }

    private void x(int i, int i2) {
        if (i == 0 || i >= 9) {
            return;
        }
        int i3 = (i - 1) * 8;
        this.m = (((long) i2) << i3) | (this.m & (~(255 << i3)));
    }

    public void A(C0578Li c0578Li, C1799ig c1799ig) {
        if (!q()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int i = 0;
        while (i < this.f1043o - 1) {
            C2848tT c2848tT = i == 0 ? this : new C2848tT(this, i);
            int iB = c1799ig != null ? c1799ig.b(c2848tT) : -1;
            if (iB >= 0) {
                c0578Li.l(49152 | iB);
                return;
            }
            if (c1799ig != null) {
                c1799ig.a(c0578Li.b(), c2848tT);
            }
            int iU = u(i);
            byte[] bArr = this.l;
            c0578Li.j(bArr, iU, bArr[iU] + 1);
            i++;
        }
        c0578Li.o(0);
    }

    public void B(C0578Li c0578Li, C1799ig c1799ig, boolean z2) {
        if (z2) {
            D(c0578Li);
        } else {
            A(c0578Li, c1799ig);
        }
    }

    public byte[] C() {
        C0578Li c0578Li = new C0578Li();
        A(c0578Li, null);
        return c0578Li.g();
    }

    public void D(C0578Li c0578Li) {
        c0578Li.i(E());
    }

    public byte[] E() {
        if (this.f1043o == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[this.l.length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1043o; i3++) {
            byte b = this.l[i];
            i++;
            bArr[i2] = b;
            i2++;
            int i4 = 0;
            while (i4 < b) {
                bArr[i2] = A[this.l[i] & 255];
                i4++;
                i2++;
                i++;
            }
        }
        return bArr;
    }

    public C2848tT F(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("must replace 1 or more labels");
        }
        try {
            C2848tT c2848tT = new C2848tT();
            i(B, c2848tT);
            c2848tT.a(this.l, u(i), this.f1043o - i);
            return c2848tT;
        } catch (C2945uT unused) {
            throw new IllegalStateException("Name.wild: concatenate failed");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2848tT)) {
            return false;
        }
        C2848tT c2848tT = (C2848tT) obj;
        if (c2848tT.f1043o == this.f1043o && c2848tT.hashCode() == hashCode()) {
            return j(c2848tT.l, 0);
        }
        return false;
    }

    public C2848tT f() {
        int i = 0;
        for (byte b : this.l) {
            if (A[b & 255] != b) {
                C2848tT c2848tT = new C2848tT();
                c2848tT.m = this.m;
                c2848tT.f1043o = this.f1043o;
                c2848tT.l = new byte[t()];
                while (true) {
                    byte[] bArr = c2848tT.l;
                    if (i >= bArr.length) {
                        return c2848tT;
                    }
                    bArr[i] = A[this.l[i] & 255];
                    i++;
                }
            }
        }
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2848tT c2848tT) {
        if (this == c2848tT) {
            return 0;
        }
        int i = c2848tT.f1043o;
        int iMin = Math.min(this.f1043o, i);
        for (int i2 = 1; i2 <= iMin; i2++) {
            int iU = u(this.f1043o - i2);
            int iU2 = c2848tT.u(i - i2);
            byte b = this.l[iU];
            byte b2 = c2848tT.l[iU2];
            for (int i3 = 0; i3 < b && i3 < b2; i3++) {
                byte[] bArr = A;
                int i4 = (bArr[this.l[(i3 + iU) + 1] & 255] & 255) - (bArr[c2848tT.l[(i3 + iU2) + 1] & 255] & 255);
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b != b2) {
                return b - b2;
            }
        }
        return this.f1043o - i;
    }

    public int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int iU = u(0);
        while (true) {
            byte[] bArr = this.l;
            if (iU >= bArr.length) {
                this.n = i2;
                return i2;
            }
            i2 += (i2 << 3) + (A[bArr[iU] & 255] & 255);
            iU++;
        }
    }

    public C2848tT l(C0448Gi c0448Gi) {
        C2848tT c2848tTV = c0448Gi.v();
        C2848tT c2848tTW = c0448Gi.W();
        if (!y(c2848tTV)) {
            return null;
        }
        int i = this.f1043o - c2848tTV.f1043o;
        int iT = t() - c2848tTV.t();
        int i2 = c2848tTW.f1043o;
        short sT = c2848tTW.t();
        int i3 = iT + sT;
        if (i3 > 255) {
            throw new C2945uT();
        }
        C2848tT c2848tT = new C2848tT();
        int i4 = i + i2;
        c2848tT.f1043o = i4;
        byte[] bArrCopyOf = Arrays.copyOf(this.l, i3);
        c2848tT.l = bArrCopyOf;
        System.arraycopy(c2848tTW.l, 0, bArrCopyOf, iT, sT);
        int i5 = 0;
        for (int i6 = 0; i6 < 9 && i6 < i4; i6++) {
            c2848tT.x(i6, i5);
            i5 += c2848tT.l[i5] + 1;
        }
        return c2848tT;
    }

    public byte[] o(int i) {
        int iU = u(i);
        byte[] bArr = this.l;
        return Arrays.copyOfRange(bArr, iU, ((byte) (bArr[iU] + 1)) + iU);
    }

    public String p(int i) {
        return e(this.l, u(i));
    }

    public boolean q() {
        int i = this.f1043o;
        return i != 0 && this.l[u(i - 1)] == 0;
    }

    public boolean r() {
        if (this.f1043o == 0) {
            return false;
        }
        byte[] bArr = this.l;
        return bArr[0] == 1 && bArr[1] == 42;
    }

    public int s() {
        return this.f1043o;
    }

    public short t() {
        if (this.f1043o == 0) {
            return (short) 0;
        }
        return (short) this.l.length;
    }

    public String toString() {
        return z(false);
    }

    public C2848tT w(C2848tT c2848tT) {
        if (c2848tT == null || !y(c2848tT)) {
            return this;
        }
        C2848tT c2848tT2 = new C2848tT();
        int iT = t() - c2848tT.t();
        c2848tT2.f1043o = this.f1043o - c2848tT.f1043o;
        c2848tT2.m = this.m;
        byte[] bArr = new byte[iT];
        c2848tT2.l = bArr;
        System.arraycopy(this.l, 0, bArr, 0, iT);
        return c2848tT2;
    }

    public boolean y(C2848tT c2848tT) {
        int i = c2848tT.f1043o;
        int i2 = this.f1043o;
        if (i > i2) {
            return false;
        }
        return i == i2 ? equals(c2848tT) : c2848tT.j(this.l, u(i2 - i));
    }

    public String z(boolean z2) {
        int i = this.f1043o;
        if (i == 0) {
            return "@";
        }
        if (i == 1 && this.l[0] == 0) {
            return ".";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1043o; i3++) {
            byte b = this.l[i2];
            if (b == 0) {
                if (!z2) {
                    sb.append('.');
                    break;
                }
                break;
            }
            if (i3 > 0) {
                sb.append('.');
            }
            sb.append(e(this.l, i2));
            i2 += b + 1;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0013  */
    public C2848tT(String str, C2848tT c2848tT) throws Ri0 {
        boolean zQ;
        str.getClass();
        switch (str) {
            case "":
                throw new Ri0("empty name");
            case ".":
                i(v, this);
                return;
            case "@":
                if (c2848tT == null) {
                    i(w, this);
                    return;
                } else {
                    i(c2848tT, this);
                    return;
                }
            default:
                char[] cArr = new char[63];
                int i = 0;
                boolean z2 = false;
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt > 255) {
                        throw new Ri0(str, "Illegal character in name");
                    }
                    if (z2) {
                        if (cCharAt >= '0' && cCharAt <= '9' && i < 3) {
                            i++;
                            i4 = (i4 * 10) + (cCharAt - '0');
                            if (i4 > 255) {
                                throw new Ri0(str, "bad escape");
                            }
                            if (i >= 3) {
                                cCharAt = (char) i4;
                            }
                        } else if (i > 0 && i < 3) {
                            throw new Ri0(str, "bad escape");
                        }
                        if (i3 >= 63) {
                            throw new Ri0(str, "label too long");
                        }
                        cArr[i3] = cCharAt;
                        i2 = i3;
                        z2 = false;
                        i3++;
                    } else if (cCharAt == '\\') {
                        i = 0;
                        z2 = true;
                        i4 = 0;
                    } else if (cCharAt != '.') {
                        i2 = i2 == -1 ? i5 : i2;
                        if (i3 >= 63) {
                            throw new Ri0(str, "label too long");
                        }
                        cArr[i3] = cCharAt;
                        i3++;
                    } else {
                        if (i2 == -1) {
                            throw new Ri0(str, "invalid empty label");
                        }
                        d(str, cArr, i3);
                        i2 = -1;
                        i3 = 0;
                    }
                }
                if ((i > 0 && i < 3) || z2) {
                    throw new Ri0(str, "bad escape");
                }
                if (i2 == -1) {
                    zQ = true;
                    c(str, t, 1);
                } else {
                    d(str, cArr, i3);
                    zQ = false;
                }
                if (c2848tT != null && !zQ) {
                    zQ = c2848tT.q();
                    c(str, c2848tT.l, c2848tT.f1043o);
                }
                if (!zQ && t() == 255) {
                    throw new Ri0(str, "Name too long");
                }
                return;
        }
    }

    public C2848tT(String str) {
        this(str, (C2848tT) null);
    }

    public C2848tT(C0474Hi c0474Hi) throws Rw0 {
        byte[] bArr = new byte[64];
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            int iJ = c0474Hi.j();
            int i = iJ & 192;
            if (i != 0) {
                if (i == 192) {
                    int iJ2 = c0474Hi.j() + ((iJ & (-193)) << 8);
                    CL cl = p;
                    cl.z(Integer.valueOf(c0474Hi.b()), Integer.valueOf(iJ2), "currently {}, pointer to {}");
                    if (iJ2 < c0474Hi.b() - 2) {
                        if (!z3) {
                            c0474Hi.o();
                            z3 = true;
                        }
                        c0474Hi.c(iJ2);
                        cl.z(this, Integer.valueOf(iJ2), "current name '{}', seeking to {}");
                    } else {
                        throw new Rw0("bad compression");
                    }
                } else {
                    throw new Rw0("bad label type");
                }
            } else if (iJ == 0) {
                a(t, 0, 1);
                z2 = true;
            } else {
                bArr[0] = (byte) iJ;
                c0474Hi.d(bArr, 1, iJ);
                a(bArr, 0, 1);
            }
        }
        if (z3) {
            c0474Hi.m();
        }
    }

    public C2848tT(byte[] bArr) {
        this(new C0474Hi(bArr));
    }

    public C2848tT(C2848tT c2848tT, int i) {
        int i2 = c2848tT.f1043o;
        if (i > i2) {
            throw new IllegalArgumentException("attempted to remove too many labels");
        }
        if (i == i2) {
            i(w, this);
            return;
        }
        this.f1043o = i2 - i;
        this.l = Arrays.copyOfRange(c2848tT.l, c2848tT.u(i), c2848tT.l.length);
        int iU = c2848tT.u(i);
        for (int i3 = 1; i3 < 9 && i3 < this.f1043o; i3++) {
            x(i3, c2848tT.u(i3 + i) - iU);
        }
    }
}
