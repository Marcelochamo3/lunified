package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public abstract class H50 implements Cloneable, Comparable<H50>, Serializable {

    @Generated
    private static final CL p = DL.d(H50.class);
    private static final DecimalFormat q;
    protected C2848tT l;
    protected int m;
    protected int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected long f295o;

    public static class a implements Serializable {
        private static final long serialVersionUID = 1434159920070152561L;
        private final byte[] l;
        private final boolean m;

        public a(H50 h50) {
            boolean z = h50 instanceof C1428eq;
            this.m = z;
            this.l = h50.N(!z ? 1 : 0);
        }

        public Object readResolve() throws InvalidObjectException {
            try {
                return H50.r(this.l, !this.m ? 1 : 0);
            } catch (IOException e) {
                throw new InvalidObjectException(e.getMessage());
            }
        }
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        q = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    public H50() {
    }

    public static H50 A(C2848tT c2848tT, int i, int i2, long j) {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        C3080vp0.a(i);
        C0344Ci.a(i2);
        C1707hi0.a(j);
        return u(c2848tT, i, i2, j, false);
    }

    private static H50 B(C2848tT c2848tT, int i, int i2, long j, int i3, C0474Hi c0474Hi) throws Rw0 {
        H50 h50U = u(c2848tT, i, i2, j, c0474Hi != null);
        if (c0474Hi != null) {
            if (c0474Hi.k() < i3) {
                throw new Rw0("truncated record");
            }
            c0474Hi.q(i3);
            h50U.H(c0474Hi);
            if (c0474Hi.k() > 0) {
                throw new Rw0("invalid record length");
            }
            c0474Hi.a();
        }
        return h50U;
    }

    public static H50 C(C2848tT c2848tT, int i, int i2, long j, int i3, byte[] bArr) {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        C3080vp0.a(i);
        C0344Ci.a(i2);
        C1707hi0.a(j);
        try {
            return B(c2848tT, i, i2, j, i3, bArr != null ? new C0474Hi(bArr) : null);
        } catch (IOException unused) {
            return null;
        }
    }

    public static H50 D(C2848tT c2848tT, int i, int i2, long j, byte[] bArr) {
        return C(c2848tT, i, i2, j, bArr.length, bArr);
    }

    private void O(C0578Li c0578Li, boolean z) {
        this.l.D(c0578Li);
        c0578Li.l(this.m);
        c0578Li.l(this.n);
        if (z) {
            c0578Li.n(0L);
        } else {
            c0578Li.n(this.f295o);
        }
        int iB = c0578Li.b();
        c0578Li.l(0);
        J(c0578Li, null, true);
        c0578Li.m((c0578Li.b() - iB) - 2, iB);
    }

    private byte[] Q(boolean z) {
        C0578Li c0578Li = new C0578Li();
        O(c0578Li, z);
        return c0578Li.g();
    }

    public static String R(byte[] bArr) {
        return "\\# " + bArr.length + " " + Ay0.b(bArr);
    }

    public static byte[] b(String str) throws Ri0 {
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            if (b == 92) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 0;
                boolean z = false;
                int i2 = 0;
                for (byte b2 : bytes) {
                    if (z) {
                        if (b2 >= 48 && b2 <= 57) {
                            i++;
                            i2 = (i2 * 10) + (b2 - 48);
                            if (i2 > 255) {
                                throw new Ri0("bad escape");
                            }
                            if (i >= 3) {
                                b2 = (byte) i2;
                            }
                        } else if (i > 0) {
                            throw new Ri0("bad escape");
                        }
                        byteArrayOutputStream.write(b2);
                        z = false;
                    } else if (b2 == 92) {
                        z = true;
                        i = 0;
                        i2 = 0;
                    } else {
                        byteArrayOutputStream.write(b2);
                    }
                }
                if (i > 0 && i < 3) {
                    throw new Ri0("bad escape");
                }
                if (byteArrayOutputStream.toByteArray().length <= 255) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new Ri0("text string too long");
            }
        }
        if (bytes.length <= 255) {
            return bytes;
        }
        throw new Ri0("text string too long");
    }

    public static String c(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                sb.append('\\');
                sb.append(q.format(i));
            } else if (i == 34 || i == 92) {
                sb.append('\\');
                sb.append((char) i);
            } else {
                sb.append((char) i);
            }
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public static byte[] d(String str, byte[] bArr, int i) {
        if (bArr.length <= 65535) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new IllegalArgumentException("\"" + str + "\" array must have no more than " + i + " elements");
    }

    public static C2848tT e(String str, C2848tT c2848tT) {
        if (c2848tT.q()) {
            return c2848tT;
        }
        throw new U60("'" + c2848tT + "' on field " + str + " is not an absolute name");
    }

    public static int g(String str, int i) {
        if (i >= 0 && i <= 65535) {
            return i;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 16 bit value");
    }

    public static long h(String str, long j) {
        if (j >= 0 && j <= 4294967295L) {
            return j;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + j + " must be an unsigned 32 bit value");
    }

    public static int j(String str, int i) {
        if (i >= 0 && i <= 255) {
            return i;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 8 bit value");
    }

    public static H50 n(C2848tT c2848tT, int i, int i2, long j, String str, C2848tT c2848tT2) {
        return o(c2848tT, i, i2, j, new Fl0(str), c2848tT2);
    }

    public static H50 o(C2848tT c2848tT, int i, int i2, long j, Fl0 fl0, C2848tT c2848tT2) throws Ri0 {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        C3080vp0.a(i);
        C0344Ci.a(i2);
        C1707hi0.a(j);
        Fl0.b bVarI = fl0.i();
        if (bVarI.c() == 3 && bVarI.d().equals("\\#")) {
            int iH0 = fl0.h0();
            byte[] bArrX = fl0.X();
            if (bArrX == null) {
                bArrX = new byte[0];
            }
            if (iH0 == bArrX.length) {
                return B(c2848tT, i, i2, j, iH0, new C0474Hi(bArrX));
            }
            throw fl0.f("invalid unknown RR encoding: length mismatch");
        }
        fl0.n0();
        H50 h50U = u(c2848tT, i, i2, j, true);
        h50U.E(fl0, c2848tT2);
        Fl0.b bVarI2 = fl0.i();
        if (bVarI2.c() == 1 || bVarI2.c() == 0) {
            return h50U;
        }
        throw fl0.f("unexpected tokens at end of record (wanted EOL/EOF, got " + bVarI2 + ")");
    }

    public static H50 p(C0474Hi c0474Hi, int i) {
        return q(c0474Hi, i, false);
    }

    public static H50 q(C0474Hi c0474Hi, int i, boolean z) throws Rw0 {
        C2848tT c2848tT = new C2848tT(c0474Hi);
        int iH = c0474Hi.h();
        int iH2 = c0474Hi.h();
        if (i == 0) {
            return z(c2848tT, iH, iH2);
        }
        long jI = c0474Hi.i();
        int iH3 = c0474Hi.h();
        return (iH3 == 0 && z && (i == 1 || i == 2)) ? A(c2848tT, iH, iH2, jI) : B(c2848tT, iH, iH2, jI, iH3, c0474Hi);
    }

    public static H50 r(byte[] bArr, int i) {
        return q(new C0474Hi(bArr), i, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use RecordSerializationProxy");
    }

    private static H50 u(C2848tT c2848tT, int i, int i2, long j, boolean z) {
        H50 c1428eq;
        if (z) {
            Supplier<H50> supplierB = C3080vp0.b(i);
            c1428eq = supplierB != null ? supplierB.get() : new C1625gq0();
        } else {
            c1428eq = new C1428eq();
        }
        c1428eq.l = c2848tT;
        c1428eq.m = i;
        c1428eq.n = i2;
        c1428eq.f295o = j;
        return c1428eq;
    }

    public static H50 z(C2848tT c2848tT, int i, int i2) {
        return A(c2848tT, i, i2, 0L);
    }

    public abstract void E(Fl0 fl0, C2848tT c2848tT);

    public String F() {
        return I();
    }

    public byte[] G() {
        C0578Li c0578Li = new C0578Li();
        J(c0578Li, null, true);
        return c0578Li.g();
    }

    public abstract void H(C0474Hi c0474Hi);

    public abstract String I();

    public abstract void J(C0578Li c0578Li, C1799ig c1799ig, boolean z);

    public boolean K(H50 h50) {
        return w() == h50.w() && this.n == h50.n && this.l.equals(h50.l);
    }

    public void L(long j) {
        this.f295o = j;
    }

    public void M(C0578Li c0578Li, int i, C1799ig c1799ig) {
        this.l.A(c0578Li, c1799ig);
        c0578Li.l(this.m);
        c0578Li.l(this.n);
        if (i == 0) {
            return;
        }
        c0578Li.n(this.f295o);
        int iB = c0578Li.b();
        c0578Li.l(0);
        J(c0578Li, c1799ig, false);
        c0578Li.m((c0578Li.b() - iB) - 2, iB);
    }

    public byte[] N(int i) {
        C0578Li c0578Li = new C0578Li();
        M(c0578Li, i, null);
        return c0578Li.g();
    }

    public byte[] P() {
        return Q(false);
    }

    public H50 S(int i, long j) {
        H50 h50K = k();
        h50K.n = i;
        h50K.f295o = j;
        return h50K;
    }

    public H50 T(C2848tT c2848tT) {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        H50 h50K = k();
        h50K.l = c2848tT;
        return h50K;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof H50)) {
            return false;
        }
        H50 h50 = (H50) obj;
        if (this.m == h50.m && this.n == h50.n && this.l.equals(h50.l)) {
            return Arrays.equals(G(), h50.G());
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : Q(true)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public H50 k() {
        try {
            return (H50) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(H50 h50) {
        if (this == h50) {
            return 0;
        }
        int iCompareTo = this.l.compareTo(h50.l);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.n - h50.n;
        if (i != 0) {
            return i;
        }
        int i2 = this.m - h50.m;
        if (i2 != 0) {
            return i2;
        }
        byte[] bArrG = G();
        byte[] bArrG2 = h50.G();
        int iMin = Math.min(bArrG.length, bArrG2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            byte b = bArrG[i3];
            byte b2 = bArrG2[i3];
            if (b != b2) {
                return (b & 255) - (b2 & 255);
            }
        }
        return bArrG.length - bArrG2.length;
    }

    public C2848tT s() {
        return null;
    }

    public int t() {
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        if (sb.length() < 8) {
            sb.append("\t");
        }
        if (sb.length() < 16) {
            sb.append("\t");
        }
        sb.append("\t");
        if (EW.a("BINDTTL")) {
            sb.append(C1707hi0.b(this.f295o));
        } else {
            sb.append(this.f295o);
        }
        sb.append("\t");
        if (this.n != 1 || !EW.a("noPrintIN")) {
            sb.append(C0344Ci.b(this.n));
            sb.append("\t");
        }
        sb.append(C3080vp0.e(this.m));
        String strI = I();
        if (!strI.equals("")) {
            sb.append("\t");
            sb.append(strI);
        }
        return sb.toString();
    }

    public C2848tT v() {
        return this.l;
    }

    public int w() {
        return this.m;
    }

    public Object writeReplace() {
        p.v("Creating proxy object for serialization");
        return new a(this);
    }

    public long x() {
        return this.f295o;
    }

    public int y() {
        return this.m;
    }

    public H50(C2848tT c2848tT, int i, int i2, long j) {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        C3080vp0.a(i);
        C0344Ci.a(i2);
        C1707hi0.a(j);
        this.l = c2848tT;
        this.m = i;
        this.n = i2;
        this.f295o = j;
    }
}
