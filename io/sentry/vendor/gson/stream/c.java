package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {
    public static final String[] t = new String[128];
    public final Writer l;
    public int[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f153o;
    public String p;
    public boolean q;
    public String r;
    public final boolean s;

    static {
        for (int i = 0; i <= 31; i++) {
            t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
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
        this.s = true;
        this.l = writer;
    }

    public final void a() throws IOException {
        int iP = p();
        if (iP == 1) {
            this.m[this.n - 1] = 2;
            i();
            return;
        }
        Writer writer = this.l;
        if (iP == 2) {
            writer.append(',');
            i();
        } else {
            if (iP == 4) {
                writer.append((CharSequence) this.p);
                this.m[this.n - 1] = 5;
                return;
            }
            if (iP != 6) {
                if (iP != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.q) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.m[this.n - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l.close();
        int i = this.n;
        if (i > 1 || (i == 1 && this.m[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.n = 0;
    }

    public final void f(char c, int i, int i2) throws IOException {
        int iP = p();
        if (iP != i2 && iP != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.r != null) {
            throw new IllegalStateException("Dangling name: " + this.r);
        }
        this.n--;
        if (iP == i2) {
            i();
        }
        this.l.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.l.flush();
    }

    public final void i() throws IOException {
        if (this.f153o == null) {
            return;
        }
        Writer writer = this.l;
        writer.write(10);
        int i = this.n;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f153o);
        }
    }

    public final void l() throws IOException {
        if (this.r != null) {
            if (!this.s) {
                this.r = null;
                return;
            }
            t();
        }
        a();
        this.l.write("null");
    }

    public final int p() {
        int i = this.n;
        if (i != 0) {
            return this.m[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void q(String str) throws IOException {
        String str2;
        String[] strArr = t;
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

    public final void t() throws IOException {
        if (this.r != null) {
            int iP = p();
            if (iP == 5) {
                this.l.write(44);
            } else if (iP != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.m[this.n - 1] = 4;
            q(this.r);
            this.r = null;
        }
    }
}
