package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import o.AbstractC1701hf0;
import o.Yu0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {
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
    public int f152o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int x = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.w = iArr;
        iArr[0] = 6;
        this.y = new String[32];
        this.z = new int[32];
        this.l = reader;
    }

    public final boolean K() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4) ? false : true;
    }

    public final boolean Q(char c) throws d {
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

    public final String R() {
        int i = this.q + 1;
        int i2 = (this.f152o - this.r) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.x;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.w[i4];
            if (i5 == 1 || i5 == 2) {
                sb2.append('[');
                sb2.append(this.z[i4]);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append('.');
                String str = this.y[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final boolean W() throws IOException {
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
            throw new IllegalStateException("Expected a boolean but was " + g0() + R());
        }
        this.s = 0;
        int[] iArr2 = this.z;
        int i2 = this.x - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final double X() throws IOException {
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
            this.v = new String(this.n, this.f152o, this.u);
            this.f152o += this.u;
        } else if (iL == 8 || iL == 9) {
            this.v = d0(iL == 8 ? '\'' : '\"');
        } else if (iL == 10) {
            this.v = f0();
        } else if (iL != 11) {
            throw new IllegalStateException("Expected a double but was " + g0() + R());
        }
        this.s = 11;
        double d = Double.parseDouble(this.v);
        if (!this.m && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + R());
        }
        this.v = null;
        this.s = 0;
        int[] iArr2 = this.z;
        int i2 = this.x - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final int Y() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            long j = this.t;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.t + R());
            }
            this.s = 0;
            int[] iArr = this.z;
            int i2 = this.x - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iL == 16) {
            this.v = new String(this.n, this.f152o, this.u);
            this.f152o += this.u;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected an int but was " + g0() + R());
            }
            if (iL == 10) {
                this.v = f0();
            } else {
                this.v = d0(iL == 8 ? '\'' : '\"');
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
            throw new NumberFormatException("Expected an int but was " + this.v + R());
        }
        this.v = null;
        this.s = 0;
        int[] iArr3 = this.z;
        int i6 = this.x - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final long Z() throws IOException {
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
            this.v = new String(this.n, this.f152o, this.u);
            this.f152o += this.u;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected a long but was " + g0() + R());
            }
            if (iL == 10) {
                this.v = f0();
            } else {
                this.v = d0(iL == 8 ? '\'' : '\"');
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
            throw new NumberFormatException("Expected a long but was " + this.v + R());
        }
        this.v = null;
        this.s = 0;
        int[] iArr3 = this.z;
        int i3 = this.x - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final void a() {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            h0(1);
            this.z[this.x - 1] = 0;
            this.s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + g0() + R());
        }
    }

    public final String a0() throws IOException {
        String strD0;
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strD0 = f0();
        } else if (iL == 12) {
            strD0 = d0('\'');
        } else {
            if (iL != 13) {
                throw new IllegalStateException("Expected a name but was " + g0() + R());
            }
            strD0 = d0('\"');
        }
        this.s = 0;
        this.y[this.x - 1] = strD0;
        return strD0;
    }

    public final int b0(boolean z) throws IOException {
        int i = this.f152o;
        int i2 = this.p;
        while (true) {
            if (i == i2) {
                this.f152o = i;
                if (!t(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + R());
                }
                i = this.f152o;
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
                    this.f152o = i3;
                    if (i3 == i2) {
                        this.f152o = i;
                        boolean zT = t(2);
                        this.f152o++;
                        if (!zT) {
                            return c;
                        }
                    }
                    i();
                    int i4 = this.f152o;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f152o = i4 + 1;
                        while (true) {
                            if (this.f152o + 2 > this.p && !t(2)) {
                                l0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f152o;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f152o + 2;
                                        i2 = this.p;
                                        break;
                                    }
                                    if (cArr[this.f152o + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.q++;
                                this.r = i5 + 1;
                            }
                            this.f152o++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f152o = i4 + 1;
                        k0();
                        i = this.f152o;
                        i2 = this.p;
                    }
                } else {
                    if (c != '#') {
                        this.f152o = i3;
                        return c;
                    }
                    this.f152o = i3;
                    i();
                    k0();
                    i = this.f152o;
                    i2 = this.p;
                }
            }
            i = i3;
        }
    }

    public final void c0() {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 7) {
            throw new IllegalStateException("Expected null but was " + g0() + R());
        }
        this.s = 0;
        int[] iArr = this.z;
        int i = this.x - 1;
        iArr[i] = iArr[i] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.s = 0;
        this.w[0] = 8;
        this.x = 1;
        this.l.close();
    }

    public final String d0(char c) throws d {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f152o;
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
                            this.f152o = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f152o = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(i0());
                            i2 = this.f152o;
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
            this.f152o = i2;
        } while (t(1));
        l0("Unterminated string");
        throw null;
    }

    public final String e0() throws IOException {
        String str;
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            str = f0();
        } else if (iL == 8) {
            str = d0('\'');
        } else if (iL == 9) {
            str = d0('\"');
        } else if (iL == 11) {
            str = this.v;
            this.v = null;
        } else if (iL == 15) {
            str = Long.toString(this.t);
        } else {
            if (iL != 16) {
                throw new IllegalStateException("Expected a string but was " + g0() + R());
            }
            str = new String(this.n, this.f152o, this.u);
            this.f152o += this.u;
        }
        this.s = 0;
        int[] iArr = this.z;
        int i = this.x - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void f() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            h0(3);
            this.s = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + g0() + R());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String f0() throws d {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f152o;
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
                    sb.append(cArr, this.f152o, i2);
                    this.f152o += i2;
                    if (!t(1)) {
                    }
                } else if (!t(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(cArr, this.f152o, i);
                } else {
                    sb.append(cArr, this.f152o, i);
                    string = sb.toString();
                }
                this.f152o += i;
                return string;
            }
        }
    }

    public final b g0() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void h0(int i) {
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

    public final void i() throws d {
        if (this.m) {
            return;
        }
        l0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final char i0() throws d {
        int i;
        if (this.f152o == this.p && !t(1)) {
            l0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f152o;
        int i3 = i2 + 1;
        this.f152o = i3;
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
                l0("Invalid escape sequence");
                throw null;
            }
            if (i2 + 5 > this.p && !t(4)) {
                l0("Unterminated escape sequence");
                throw null;
            }
            int i4 = this.f152o;
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
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f152o, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.f152o += 4;
            return c2;
        }
        return c;
    }

    public final void j0(char c) throws d {
        do {
            int i = this.f152o;
            int i2 = this.p;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.n[i];
                if (c2 == c) {
                    this.f152o = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f152o = i3;
                    i0();
                    i = this.f152o;
                    i2 = this.p;
                } else {
                    if (c2 == '\n') {
                        this.q++;
                        this.r = i3;
                    }
                    i = i3;
                }
            }
            this.f152o = i;
        } while (t(1));
        l0("Unterminated string");
        throw null;
    }

    public final void k0() {
        char c;
        do {
            if (this.f152o >= this.p && !t(1)) {
                return;
            }
            int i = this.f152o;
            int i2 = i + 1;
            this.f152o = i2;
            c = this.n[i];
            if (c == '\n') {
                this.q++;
                this.r = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0190  */
    /* JADX WARN: Code duplicated, block: B:125:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1 A[PHI: r2 r4
  0x01a1: PHI (r2v46 int) = (r2v45 int), (r2v48 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x01a1: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x0216  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:183:0x0239 A[DONT_INVERT, PHI: r1
  0x0239: PHI (r1v64 char) = (r1v63 char), (r1v67 char) binds: [B:169:0x0214, B:175:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023b  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0264  */
    /* JADX WARN: Code duplicated, block: B:202:0x0269  */
    /* JADX WARN: Code duplicated, block: B:207:0x0279 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x027a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0284  */
    /* JADX WARN: Code duplicated, block: B:212:0x028c  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:231:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:275:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    public final int l() throws IOException {
        int iB0;
        int iB1;
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
            int iB2 = b0(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 == 93) {
                        this.s = 4;
                        return 4;
                    }
                    l0("Unterminated array");
                    throw null;
                }
                i();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iB0 = b0(true)) != 44) {
                    if (iB0 != 59) {
                        if (iB0 == 125) {
                            this.s = 2;
                            return 2;
                        }
                        l0("Unterminated object");
                        throw null;
                    }
                    i();
                }
                int iB3 = b0(true);
                if (iB3 == 34) {
                    this.s = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    i();
                    this.s = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i9 != 5) {
                        this.s = 2;
                        return 2;
                    }
                    l0("Expected name");
                    throw null;
                }
                i();
                this.f152o--;
                if (Q((char) iB3)) {
                    this.s = 14;
                    return 14;
                }
                l0("Expected name");
                throw null;
            }
            if (i9 != 4) {
                if (i9 == 6) {
                    if (this.m) {
                        b0(true);
                        int i10 = this.f152o;
                        int i11 = i10 - 1;
                        this.f152o = i11;
                        if ((i10 + 4 <= this.p || t(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                            this.f152o += 5;
                        }
                    }
                    this.w[this.x - 1] = 7;
                } else if (i9 == 7) {
                    if (b0(false) == -1) {
                        this.s = 17;
                        return 17;
                    }
                    i();
                    this.f152o--;
                } else if (i9 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                iB1 = b0(true);
                if (iB1 != 34) {
                    this.s = 9;
                    return 9;
                }
                if (iB1 != 39) {
                    i();
                    this.s = 8;
                    return 8;
                }
                if (iB1 != 44 || iB1 == 59) {
                    i = 1;
                } else {
                    if (iB1 == 91) {
                        this.s = 3;
                        return 3;
                    }
                    if (iB1 != 93) {
                        if (iB1 == 123) {
                            this.s = 1;
                            return 1;
                        }
                        int i12 = this.f152o - 1;
                        this.f152o = i12;
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
                                i3 = this.f152o;
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
                                            } else if (!Q(c3)) {
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
                                                    this.f152o += i5;
                                                    i7 = 15;
                                                    this.s = 15;
                                                }
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (Q(cArr[this.f152o])) {
                                                l0("Expected value");
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
                                            int i13 = this.f152o;
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
                                                if (Q(cArr[this.f152o])) {
                                                    l0("Expected value");
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
                                        if (Q(cArr[this.f152o])) {
                                            l0("Expected value");
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
                                    if (Q(cArr[this.f152o])) {
                                        l0("Expected value");
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
                                if ((this.f152o + length >= this.p && !t(length + 1)) || !Q(cArr[this.f152o + length])) {
                                    this.f152o += length;
                                    this.s = i2;
                                    break;
                                }
                                break;
                            }
                            if ((this.f152o + i14 < this.p || t(i14 + 1)) && ((c = cArr[this.f152o + i14]) == str.charAt(i14) || c == str2.charAt(i14))) {
                                i14++;
                            }
                            i2 = 0;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.f152o;
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
                                    if (Q(cArr[this.f152o])) {
                                        l0("Expected value");
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
                                    int i15 = this.f152o;
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
                                        if (Q(cArr[this.f152o])) {
                                            l0("Expected value");
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
                                if (Q(cArr[this.f152o])) {
                                    l0("Expected value");
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
                            if (Q(cArr[this.f152o])) {
                                l0("Expected value");
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
                    l0("Unexpected value");
                    throw null;
                }
                i();
                this.f152o -= i;
                this.s = 7;
                return 7;
            }
            iArr[i8] = 5;
            int iB4 = b0(true);
            if (iB4 != 58) {
                if (iB4 != 61) {
                    l0("Expected ':'");
                    throw null;
                }
                i();
                if (this.f152o < this.p || t(1)) {
                    int i16 = this.f152o;
                    if (cArr[i16] == '>') {
                        this.f152o = i16 + 1;
                    }
                }
            }
        }
        iB1 = b0(true);
        if (iB1 != 34) {
            this.s = 9;
            return 9;
        }
        if (iB1 != 39) {
            i();
            this.s = 8;
            return 8;
        }
        if (iB1 != 44) {
            i = 1;
        } else {
            i = 1;
        }
        if (i9 == i) {
        }
        i();
        this.f152o -= i;
        this.s = 7;
        return 7;
    }

    public final void l0(String str) throws d {
        StringBuilder sbK = AbstractC1701hf0.k(str);
        sbK.append(R());
        throw new d(sbK.toString());
    }

    public final void p() {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + g0() + R());
        }
        int i = this.x;
        this.x = i - 1;
        int[] iArr = this.z;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.s = 0;
    }

    public final void q() throws IOException {
        int iL = this.s;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + g0() + R());
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

    public final boolean t(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.r;
        int i5 = this.f152o;
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
        this.f152o = 0;
        do {
            int i8 = this.p;
            int i9 = this.l.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.p + i9;
            this.p = i2;
            if (this.q == 0 && (i3 = this.r) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f152o++;
                this.r = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + R();
    }
}
