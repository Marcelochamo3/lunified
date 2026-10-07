package o;

import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class WH implements Closeable {
    public final Reader l;
    public long t;
    public int u;
    public String v;
    public int[] w;
    public String[] y;
    public int[] z;
    public boolean m = false;
    public final char[] n = new char[1024];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f592o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int x = 1;

    static {
        O9.v = new O9(10);
    }

    public WH(Reader reader) {
        int[] iArr = new int[32];
        this.w = iArr;
        iArr[0] = 6;
        this.y = new String[32];
        this.z = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.l = reader;
    }

    public String K() {
        return Q(false);
    }

    public final String Q(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.x;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.w[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.z[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.y[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public String R() {
        return Q(true);
    }

    public boolean W() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 17) ? false : true;
    }

    public final boolean X(char c) throws C2164mN {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case Yu0.b.P /* 91 */:
                        case Yu0.b.Q /* 93 */:
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    final String Y() {
        return " at line " + (this.q + 1) + " column " + ((this.f592o - this.r) + 1) + " path " + K();
    }

    public boolean Z() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.s = 0;
            int[] iArr = this.z;
            int i = this.x - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iL != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC1701hf0.E(j0()) + Y());
        }
        this.s = 0;
        int[] iArr2 = this.z;
        int i2 = this.x - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public void a() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            k0(1);
            this.z[this.x - 1] = 0;
            this.s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC1701hf0.E(j0()) + Y());
        }
    }

    public double a0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.s = 0;
            int[] iArr = this.z;
            int i = this.x - 1;
            iArr[i] = iArr[i] + 1;
            return this.t;
        }
        if (iL == 16) {
            this.v = new String(this.n, this.f592o, this.u);
            this.f592o += this.u;
        } else if (iL == 8 || iL == 9) {
            this.v = g0(iL == 8 ? '\'' : '\"');
        } else if (iL == 10) {
            this.v = i0();
        } else if (iL != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC1701hf0.E(j0()) + Y());
        }
        this.s = 11;
        double d = Double.parseDouble(this.v);
        if (!this.m && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C2164mN("JSON forbids NaN and infinities: " + d + Y());
        }
        this.v = null;
        this.s = 0;
        int[] iArr2 = this.z;
        int i2 = this.x - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int b0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            long j = this.t;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.t + Y());
            }
            this.s = 0;
            int[] iArr = this.z;
            int i2 = this.x - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iL == 16) {
            this.v = new String(this.n, this.f592o, this.u);
            this.f592o += this.u;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC1701hf0.E(j0()) + Y());
            }
            if (iL == 10) {
                this.v = i0();
            } else {
                this.v = g0(iL == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.v);
                this.s = 0;
                int[] iArr2 = this.z;
                int i4 = this.x - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.s = 11;
        double d = Double.parseDouble(this.v);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.v + Y());
        }
        this.v = null;
        this.s = 0;
        int[] iArr3 = this.z;
        int i6 = this.x - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long c0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.s = 0;
            int[] iArr = this.z;
            int i = this.x - 1;
            iArr[i] = iArr[i] + 1;
            return this.t;
        }
        if (iL == 16) {
            this.v = new String(this.n, this.f592o, this.u);
            this.f592o += this.u;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC1701hf0.E(j0()) + Y());
            }
            if (iL == 10) {
                this.v = i0();
            } else {
                this.v = g0(iL == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.v);
                this.s = 0;
                int[] iArr2 = this.z;
                int i2 = this.x - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.s = 11;
        double d = Double.parseDouble(this.v);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.v + Y());
        }
        this.v = null;
        this.s = 0;
        int[] iArr3 = this.z;
        int i3 = this.x - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.s = 0;
        this.w[0] = 8;
        this.x = 1;
        this.l.close();
    }

    public String d0() throws IOException {
        String strG0;
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strG0 = i0();
        } else if (iL == 12) {
            strG0 = g0('\'');
        } else {
            if (iL != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC1701hf0.E(j0()) + Y());
            }
            strG0 = g0('\"');
        }
        this.s = 0;
        this.y[this.x - 1] = strG0;
        return strG0;
    }

    public final int e0(boolean z) throws IOException {
        int i = this.f592o;
        int i2 = this.p;
        while (true) {
            if (i == i2) {
                this.f592o = i;
                if (!t(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + Y());
                }
                i = this.f592o;
                i2 = this.p;
            }
            int i3 = i + 1;
            char[] cArr = this.n;
            char c = cArr[i];
            if (c == '\n') {
                this.q++;
                this.r = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f592o = i3;
                    if (i3 == i2) {
                        this.f592o = i;
                        boolean zT = t(2);
                        this.f592o++;
                        if (!zT) {
                            return c;
                        }
                    }
                    i();
                    int i4 = this.f592o;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f592o = i4 + 1;
                        while (true) {
                            if (this.f592o + 2 > this.p && !t(2)) {
                                q0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f592o;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f592o + 2;
                                        i2 = this.p;
                                        break;
                                    }
                                    if (cArr[this.f592o + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.q++;
                                this.r = i5 + 1;
                            }
                            this.f592o++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f592o = i4 + 1;
                        n0();
                        i = this.f592o;
                        i2 = this.p;
                    }
                } else {
                    if (c != '#') {
                        this.f592o = i3;
                        return c;
                    }
                    this.f592o = i3;
                    i();
                    n0();
                    i = this.f592o;
                    i2 = this.p;
                }
            }
            i = i3;
        }
    }

    public void f() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            k0(3);
            this.s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC1701hf0.E(j0()) + Y());
        }
    }

    public void f0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC1701hf0.E(j0()) + Y());
        }
        this.s = 0;
        int[] iArr = this.z;
        int i = this.x - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String g0(char c) throws C2164mN {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f592o;
            int i3 = this.p;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.n;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.f592o = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f592o = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(l0());
                            i2 = this.f592o;
                            i3 = this.p;
                        } else {
                            if (c2 == '\n') {
                                this.q++;
                                this.r = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.f592o = i2;
        } while (t(1));
        q0("Unterminated string");
        throw null;
    }

    public String h0() throws IOException {
        String str;
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            str = i0();
        } else if (iL == 8) {
            str = g0('\'');
        } else if (iL == 9) {
            str = g0('\"');
        } else if (iL == 11) {
            str = this.v;
            this.v = null;
        } else if (iL == 15) {
            str = Long.toString(this.t);
        } else {
            if (iL != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC1701hf0.E(j0()) + Y());
            }
            str = new String(this.n, this.f592o, this.u);
            this.f592o += this.u;
        }
        this.s = 0;
        int[] iArr = this.z;
        int i = this.x - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void i() throws C2164mN {
        if (this.m) {
            return;
        }
        q0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String i0() throws C2164mN {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f592o;
                int i4 = i3 + i2;
                int i5 = this.p;
                char[] cArr = this.n;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Yu0.b.P /* 91 */:
                                                case Yu0.b.Q /* 93 */:
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f592o, i2);
                    this.f592o += i2;
                    if (!t(1)) {
                    }
                } else if (!t(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(cArr, this.f592o, i);
                } else {
                    sb.append(cArr, this.f592o, i);
                    string = sb.toString();
                }
                this.f592o += i;
                return string;
            }
        }
    }

    public int j0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void k0(int i) {
        int i2 = this.x;
        int[] iArr = this.w;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.w = Arrays.copyOf(iArr, i3);
            this.z = Arrays.copyOf(this.z, i3);
            this.y = (String[]) Arrays.copyOf(this.y, i3);
        }
        int[] iArr2 = this.w;
        int i4 = this.x;
        this.x = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x018c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x019d  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a3 A[PHI: r2 r4
  0x01a3: PHI (r2v49 int) = (r2v48 int), (r2v51 int) binds: [B:118:0x018a, B:125:0x019d] A[DONT_GENERATE, DONT_INLINE]
  0x01a3: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x018a, B:125:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af  */
    /* JADX WARN: Code duplicated, block: B:170:0x021a  */
    /* JADX WARN: Code duplicated, block: B:171:0x021c  */
    /* JADX WARN: Code duplicated, block: B:183:0x023d A[DONT_INVERT, PHI: r1
  0x023d: PHI (r1v64 char) = (r1v63 char), (r1v67 char) binds: [B:169:0x0218, B:175:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0262  */
    /* JADX WARN: Code duplicated, block: B:199:0x0268  */
    /* JADX WARN: Code duplicated, block: B:202:0x026d  */
    /* JADX WARN: Code duplicated, block: B:207:0x027d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x027e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0288  */
    /* JADX WARN: Code duplicated, block: B:212:0x0290  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:275:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    public final int l() throws IOException {
        int iE0;
        int iE1;
        int i;
        String str;
        String str2;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int i5;
        boolean z;
        char c3;
        int i6;
        int i7;
        char c4;
        int[] iArr = this.w;
        boolean z2 = true;
        int i8 = this.x - 1;
        int i9 = iArr[i8];
        char[] cArr = this.n;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iE2 = e0(true);
            if (iE2 != 44) {
                if (iE2 != 59) {
                    if (iE2 == 93) {
                        this.s = 4;
                        return 4;
                    }
                    q0("Unterminated array");
                    throw null;
                }
                i();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iE0 = e0(true)) != 44) {
                    if (iE0 != 59) {
                        if (iE0 == 125) {
                            this.s = 2;
                            return 2;
                        }
                        q0("Unterminated object");
                        throw null;
                    }
                    i();
                }
                int iE3 = e0(true);
                if (iE3 == 34) {
                    this.s = 13;
                    return 13;
                }
                if (iE3 == 39) {
                    i();
                    this.s = 12;
                    return 12;
                }
                if (iE3 == 125) {
                    if (i9 != 5) {
                        this.s = 2;
                        return 2;
                    }
                    q0("Expected name");
                    throw null;
                }
                i();
                this.f592o--;
                if (X((char) iE3)) {
                    this.s = 14;
                    return 14;
                }
                q0("Expected name");
                throw null;
            }
            if (i9 != 4) {
                if (i9 == 6) {
                    if (this.m) {
                        e0(true);
                        int i10 = this.f592o;
                        this.f592o = i10 - 1;
                        if (i10 + 4 <= this.p || t(5)) {
                            int i11 = this.f592o;
                            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                                this.f592o = i11 + 5;
                            }
                        }
                    }
                    this.w[this.x - 1] = 7;
                } else if (i9 == 7) {
                    if (e0(false) == -1) {
                        this.s = 17;
                        return 17;
                    }
                    i();
                    this.f592o--;
                } else if (i9 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                iE1 = e0(true);
                if (iE1 != 34) {
                    this.s = 9;
                    return 9;
                }
                if (iE1 != 39) {
                    i();
                    this.s = 8;
                    return 8;
                }
                if (iE1 != 44 || iE1 == 59) {
                    i = 1;
                } else {
                    if (iE1 == 91) {
                        this.s = 3;
                        return 3;
                    }
                    if (iE1 != 93) {
                        if (iE1 == 123) {
                            this.s = 1;
                            return 1;
                        }
                        int i12 = this.f592o - 1;
                        this.f592o = i12;
                        char c5 = cArr[i12];
                        if (c5 == 't' || c5 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i2 = 5;
                        } else {
                            if (c5 != 'f' && c5 != 'F') {
                                if (c5 != 'n' && c5 != 'N') {
                                    i2 = 0;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i2 = 7;
                                if (i2 != 0) {
                                    return i2;
                                }
                                i3 = this.f592o;
                                i4 = this.p;
                                long j = 0;
                                c2 = 0;
                                i5 = 0;
                                z = true;
                                boolean z3 = false;
                                while (true) {
                                    if (i3 + i5 != i4) {
                                        c3 = cArr[i3 + i5];
                                        if (c3 != '+') {
                                            if (c3 != 'E' || c3 == 'e') {
                                                i6 = i4;
                                                if (c2 != 2 || c2 == 4) {
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z2 = true;
                                                }
                                            } else if (c3 == '-') {
                                                i6 = i4;
                                                if (c2 == 0) {
                                                    c2 = 1;
                                                    z3 = true;
                                                } else {
                                                    if (c2 != 5) {
                                                    }
                                                    c2 = 6;
                                                }
                                                i5++;
                                                i4 = i6;
                                                z2 = true;
                                            } else if (c3 == '.') {
                                                i6 = i4;
                                                if (c2 == 2) {
                                                    c2 = 3;
                                                    i5++;
                                                    i4 = i6;
                                                    z2 = true;
                                                }
                                            } else if (c3 >= '0' && c3 <= '9') {
                                                if (c2 == z2 || c2 == 0) {
                                                    i6 = i4;
                                                    j = -(c3 - '0');
                                                    c2 = 2;
                                                } else if (c2 != 2) {
                                                    i6 = i4;
                                                    if (c2 == 3) {
                                                        c2 = 4;
                                                    } else if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                } else if (j != 0) {
                                                    i6 = i4;
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                                i5++;
                                                i4 = i6;
                                                z2 = true;
                                            } else if (!X(c3)) {
                                                c4 = 2;
                                                if (c2 != 2) {
                                                    if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                        this.u = i5;
                                                        i7 = 16;
                                                        this.s = 16;
                                                    }
                                                } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                    c4 = 2;
                                                    if (c2 != c4) {
                                                    }
                                                    this.u = i5;
                                                    i7 = 16;
                                                    this.s = 16;
                                                } else {
                                                    if (!z3) {
                                                        j = -j;
                                                    }
                                                    this.t = j;
                                                    this.f592o += i5;
                                                    i7 = 15;
                                                    this.s = 15;
                                                }
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (X(cArr[this.f592o])) {
                                                q0("Expected value");
                                                throw null;
                                            }
                                            i();
                                            this.s = 10;
                                            return 10;
                                        }
                                        i6 = i4;
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i5++;
                                        i4 = i6;
                                        z2 = true;
                                    } else if (i5 != cArr.length) {
                                        if (!t(i5 + 1)) {
                                            int i13 = this.f592o;
                                            i4 = this.p;
                                            i3 = i13;
                                            c3 = cArr[i3 + i5];
                                            if (c3 != '+') {
                                                if (c3 != 'E') {
                                                    i6 = i4;
                                                    if (c2 != 2) {
                                                    }
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z2 = true;
                                                } else {
                                                    i6 = i4;
                                                    if (c2 != 2) {
                                                    }
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z2 = true;
                                                }
                                                if (i7 != 0) {
                                                    return i7;
                                                }
                                                if (X(cArr[this.f592o])) {
                                                    q0("Expected value");
                                                    throw null;
                                                }
                                                i();
                                                this.s = 10;
                                                return 10;
                                            }
                                            i6 = i4;
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        }
                                        c4 = 2;
                                        if (c2 != 2) {
                                            if (c2 != c4) {
                                            }
                                            this.u = i5;
                                            i7 = 16;
                                            this.s = 16;
                                        } else {
                                            if (z) {
                                            }
                                            c4 = 2;
                                            if (c2 != c4) {
                                            }
                                            this.u = i5;
                                            i7 = 16;
                                            this.s = 16;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (X(cArr[this.f592o])) {
                                            q0("Expected value");
                                            throw null;
                                        }
                                        i();
                                        this.s = 10;
                                        return 10;
                                    }
                                    i7 = 0;
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (X(cArr[this.f592o])) {
                                        q0("Expected value");
                                        throw null;
                                    }
                                    i();
                                    this.s = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i2 = 6;
                        }
                        int length = str.length();
                        int i14 = 1;
                        while (true) {
                            if (i14 >= length) {
                                if ((this.f592o + length >= this.p && !t(length + 1)) || !X(cArr[this.f592o + length])) {
                                    this.f592o += length;
                                    this.s = i2;
                                    break;
                                }
                                break;
                            }
                            if ((this.f592o + i14 < this.p || t(i14 + 1)) && ((c = cArr[this.f592o + i14]) == str.charAt(i14) || c == str2.charAt(i14))) {
                                i14++;
                            }
                            i2 = 0;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.f592o;
                        i4 = this.p;
                        long j3 = 0;
                        c2 = 0;
                        i5 = 0;
                        z = true;
                        boolean z4 = false;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        i6 = i4;
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i5++;
                                        i4 = i6;
                                        z2 = true;
                                    } else {
                                        i6 = i4;
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i5++;
                                        i4 = i6;
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (X(cArr[this.f592o])) {
                                        q0("Expected value");
                                        throw null;
                                    }
                                    i();
                                    this.s = 10;
                                    return 10;
                                }
                                i6 = i4;
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i5++;
                                i4 = i6;
                                z2 = true;
                            } else if (i5 != cArr.length) {
                                if (!t(i5 + 1)) {
                                    int i15 = this.f592o;
                                    i4 = this.p;
                                    i3 = i15;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        } else {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (X(cArr[this.f592o])) {
                                            q0("Expected value");
                                            throw null;
                                        }
                                        i();
                                        this.s = 10;
                                        return 10;
                                    }
                                    i6 = i4;
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i5++;
                                    i4 = i6;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.u = i5;
                                    i7 = 16;
                                    this.s = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.u = i5;
                                    i7 = 16;
                                    this.s = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (X(cArr[this.f592o])) {
                                    q0("Expected value");
                                    throw null;
                                }
                                i();
                                this.s = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (X(cArr[this.f592o])) {
                                q0("Expected value");
                                throw null;
                            }
                            i();
                            this.s = 10;
                            return 10;
                        }
                    }
                    i = 1;
                    if (i9 == 1) {
                        this.s = 4;
                        return 4;
                    }
                }
                if (i9 == i && i9 != 2) {
                    q0("Unexpected value");
                    throw null;
                }
                i();
                this.f592o -= i;
                this.s = 7;
                return 7;
            }
            iArr[i8] = 5;
            int iE4 = e0(true);
            if (iE4 != 58) {
                if (iE4 != 61) {
                    q0("Expected ':'");
                    throw null;
                }
                i();
                if (this.f592o < this.p || t(1)) {
                    int i16 = this.f592o;
                    if (cArr[i16] == '>') {
                        this.f592o = i16 + 1;
                    }
                }
            }
        }
        iE1 = e0(true);
        if (iE1 != 34) {
            this.s = 9;
            return 9;
        }
        if (iE1 != 39) {
            i();
            this.s = 8;
            return 8;
        }
        if (iE1 != 44) {
            i = 1;
        } else {
            i = 1;
        }
        if (i9 == i) {
        }
        i();
        this.f592o -= i;
        this.s = 7;
        return 7;
    }

    public final char l0() throws C2164mN {
        int i;
        if (this.f592o == this.p && !t(1)) {
            q0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f592o;
        int i3 = i2 + 1;
        this.f592o = i3;
        char[] cArr = this.n;
        char c = cArr[i2];
        if (c == '\n') {
            this.q++;
            this.r = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                q0("Invalid escape sequence");
                throw null;
            }
            if (i2 + 5 > this.p && !t(4)) {
                q0("Unterminated escape sequence");
                throw null;
            }
            int i4 = this.f592o;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = cArr[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f592o, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.f592o += 4;
            return c2;
        }
        return c;
    }

    public final void m0(char c) throws C2164mN {
        do {
            int i = this.f592o;
            int i2 = this.p;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.n[i];
                if (c2 == c) {
                    this.f592o = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f592o = i3;
                    l0();
                    i = this.f592o;
                    i2 = this.p;
                } else {
                    if (c2 == '\n') {
                        this.q++;
                        this.r = i3;
                    }
                    i = i3;
                }
            }
            this.f592o = i;
        } while (t(1));
        q0("Unterminated string");
        throw null;
    }

    public final void n0() {
        char c;
        do {
            if (this.f592o >= this.p && !t(1)) {
                return;
            }
            int i = this.f592o;
            int i2 = i + 1;
            this.f592o = i2;
            c = this.n[i];
            if (c == '\n') {
                this.q++;
                this.r = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void o0() throws C2164mN {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f592o;
                if (i2 + i < this.p) {
                    char c = this.n[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Yu0.b.P /* 91 */:
                                                case Yu0.b.Q /* 93 */:
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        i();
                    }
                    this.f592o += i;
                    return;
                }
                this.f592o = i2 + i;
            }
        } while (t(1));
    }

    public void p() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC1701hf0.E(j0()) + Y());
        }
        int i = this.x;
        this.x = i - 1;
        int[] iArr = this.z;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.s = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void p0() throws IOException {
        int i = 0;
        do {
            int iL = this.s;
            if (iL == 0) {
                iL = l();
            }
            switch (iL) {
                case 1:
                    k0(3);
                    i++;
                    this.s = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.y[this.x - 1] = null;
                    }
                    this.x--;
                    i--;
                    this.s = 0;
                    break;
                case 3:
                    k0(1);
                    i++;
                    this.s = 0;
                    break;
                case 4:
                    this.x--;
                    i--;
                    this.s = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.s = 0;
                    break;
                case 8:
                    m0('\'');
                    this.s = 0;
                    break;
                case 9:
                    m0('\"');
                    this.s = 0;
                    break;
                case 10:
                    o0();
                    this.s = 0;
                    break;
                case 12:
                    m0('\'');
                    if (i == 0) {
                        this.y[this.x - 1] = "<skipped>";
                    }
                    this.s = 0;
                    break;
                case 13:
                    m0('\"');
                    if (i == 0) {
                        this.y[this.x - 1] = "<skipped>";
                    }
                    this.s = 0;
                    break;
                case 14:
                    o0();
                    if (i == 0) {
                        this.y[this.x - 1] = "<skipped>";
                    }
                    this.s = 0;
                    break;
                case 16:
                    this.f592o += this.u;
                    this.s = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.z;
        int i2 = this.x - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public void q() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC1701hf0.E(j0()) + Y());
        }
        int i = this.x;
        int i2 = i - 1;
        this.x = i2;
        this.y[i2] = null;
        int[] iArr = this.z;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.s = 0;
    }

    public final void q0(String str) throws C2164mN {
        StringBuilder sbK = AbstractC1701hf0.k(str);
        sbK.append(Y());
        throw new C2164mN(sbK.toString());
    }

    public final boolean t(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.r;
        int i5 = this.f592o;
        this.r = i4 - i5;
        int i6 = this.p;
        char[] cArr = this.n;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.p = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.p = 0;
        }
        this.f592o = 0;
        do {
            int i8 = this.p;
            int i9 = this.l.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.p + i9;
            this.p = i2;
            if (this.q == 0 && (i3 = this.r) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f592o++;
                this.r = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public String toString() {
        return getClass().getSimpleName() + Y();
    }
}
