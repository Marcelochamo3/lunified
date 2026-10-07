package o;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.cI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1183cI implements Closeable, Flushable {
    public static final Pattern u = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] v = new String[128];
    public static final String[] w;
    public final Writer l;
    public int[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f712o;
    public String p;
    public boolean q;
    public boolean r;
    public String s;
    public boolean t;

    static {
        for (int i = 0; i <= 31; i++) {
            v[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1183cI(Writer writer) {
        int[] iArr = new int[32];
        this.m = iArr;
        this.n = 0;
        if (iArr.length == 0) {
            this.m = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.m;
        int i = this.n;
        this.n = i + 1;
        iArr2[i] = 6;
        this.p = ":";
        this.t = true;
        Objects.requireNonNull(writer, "out == null");
        this.l = writer;
    }

    public final void K() throws IOException {
        if (this.f712o == null) {
            return;
        }
        Writer writer = this.l;
        writer.write(10);
        int i = this.n;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f712o);
        }
    }

    public C1183cI Q() throws IOException {
        if (this.s != null) {
            if (!this.t) {
                this.s = null;
                return this;
            }
            d0();
        }
        a();
        this.l.write("null");
        return this;
    }

    public final int R() {
        int i = this.n;
        if (i != 0) {
            return this.m[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void W(String str) throws IOException {
        String str2;
        String[] strArr = this.r ? w : v;
        Writer writer = this.l;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void X(double d) throws IOException {
        d0();
        if (this.q || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a();
            this.l.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void Y(long j) throws IOException {
        d0();
        a();
        this.l.write(Long.toString(j));
    }

    public void Z(Boolean bool) throws IOException {
        if (bool == null) {
            Q();
            return;
        }
        d0();
        a();
        this.l.write(bool.booleanValue() ? "true" : "false");
    }

    public final void a() throws IOException {
        int iR = R();
        if (iR == 1) {
            this.m[this.n - 1] = 2;
            K();
            return;
        }
        Writer writer = this.l;
        if (iR == 2) {
            writer.append(',');
            K();
        } else {
            if (iR == 4) {
                writer.append((CharSequence) this.p);
                this.m[this.n - 1] = 5;
                return;
            }
            if (iR != 6) {
                if (iR != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.q) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.m[this.n - 1] = 7;
        }
    }

    public void a0(Number number) throws IOException {
        if (number == null) {
            Q();
            return;
        }
        d0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !u.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.q) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.l.append((CharSequence) string);
    }

    public void b0(String str) throws IOException {
        if (str == null) {
            Q();
            return;
        }
        d0();
        a();
        W(str);
    }

    public void c0(boolean z) throws IOException {
        d0();
        a();
        this.l.write(z ? "true" : "false");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.l.close();
        int i = this.n;
        if (i > 1 || (i == 1 && this.m[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.n = 0;
    }

    public final void d0() throws IOException {
        if (this.s != null) {
            int iR = R();
            if (iR == 5) {
                this.l.write(44);
            } else if (iR != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            K();
            this.m[this.n - 1] = 4;
            W(this.s);
            this.s = null;
        }
    }

    public void f() throws IOException {
        d0();
        a();
        int i = this.n;
        int[] iArr = this.m;
        if (i == iArr.length) {
            this.m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr2[i2] = 1;
        this.l.write(91);
    }

    public void flush() throws IOException {
        if (this.n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.l.flush();
    }

    public void i() throws IOException {
        d0();
        a();
        int i = this.n;
        int[] iArr = this.m;
        if (i == iArr.length) {
            this.m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr2[i2] = 3;
        this.l.write(Yu0.b.i0);
    }

    public final void l(char c, int i, int i2) throws IOException {
        int iR = R();
        if (iR != i2 && iR != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.s != null) {
            throw new IllegalStateException("Dangling name: " + this.s);
        }
        this.n--;
        if (iR == i2) {
            K();
        }
        this.l.write(c);
    }

    public void p() throws IOException {
        l(']', 1, 2);
    }

    public void q() throws IOException {
        l('}', 3, 5);
    }

    public void t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.s != null) {
            throw new IllegalStateException();
        }
        if (this.n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.s = str;
    }
}
