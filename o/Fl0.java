package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class Fl0 implements AutoCloseable {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    private static final String v = " \t\n;()\"";
    private static final String w = "\"";
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    private final PushbackInputStream l;
    private boolean m;
    private int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f265o;
    private String p;
    private b q;
    private final StringBuilder r;
    private boolean s;
    private String t;
    private int u;

    public static class b {

        @Deprecated
        public int a;

        @Deprecated
        public String b;

        public boolean a() {
            int i = this.a;
            return i == 1 || i == 0;
        }

        public boolean b() {
            int i = this.a;
            return i == 3 || i == 4;
        }

        public int c() {
            return this.a;
        }

        public String d() {
            return this.b;
        }

        public String toString() {
            int i = this.a;
            if (i == 0) {
                return "<eof>";
            }
            if (i == 1) {
                return "<eol>";
            }
            if (i == 2) {
                return "<whitespace>";
            }
            if (i == 3) {
                return AbstractC1701hf0.h(new StringBuilder("<identifier: "), this.b, ">");
            }
            if (i != 4) {
                return i != 5 ? "<unknown>" : AbstractC1701hf0.h(new StringBuilder("<comment: "), this.b, ">");
            }
            return AbstractC1701hf0.h(new StringBuilder("<quoted_string: "), this.b, ">");
        }

        private b(int i, StringBuilder sb) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            this.a = i;
            this.b = sb == null ? null : sb.toString();
        }
    }

    public Fl0(InputStream inputStream) {
        this.l = new PushbackInputStream(inputStream instanceof BufferedInputStream ? inputStream : new BufferedInputStream(inputStream), 2);
        this.m = false;
        this.n = 0;
        this.f265o = false;
        this.p = v;
        this.r = new StringBuilder();
        this.t = "<none>";
        this.u = 1;
    }

    private int R() throws IOException {
        int i = this.l.read();
        if (i == 13) {
            int i2 = this.l.read();
            if (i2 != 10) {
                this.l.unread(i2);
            }
            i = 10;
        }
        if (i == 10) {
            this.u++;
        }
        return i;
    }

    private void a() throws Ri0 {
        if (this.n > 0) {
            throw f("unbalanced parentheses");
        }
    }

    private String b0(String str) throws Ri0 {
        b bVarI = i();
        if (bVarI.a == 3) {
            return bVarI.b;
        }
        throw f("expected " + str);
    }

    private String k0() {
        StringBuilder sb = null;
        while (true) {
            b bVarI = i();
            if (!bVarI.b()) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(bVarI.b);
        }
        n0();
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }

    private b l0(int i, StringBuilder sb) {
        b bVar = new b(i, sb);
        this.q = bVar;
        return bVar;
    }

    private int m0() throws IOException {
        int iR;
        int i = 0;
        while (true) {
            iR = R();
            if (iR != 32 && iR != 9 && (iR != 10 || this.n <= 0)) {
                break;
            }
            i++;
        }
        o0(iR);
        return i;
    }

    private void o0(int i) throws IOException {
        if (i == -1) {
            return;
        }
        this.l.unread(i);
        if (i == 10) {
            this.u--;
        }
    }

    public byte[] K() {
        return Q(false);
    }

    public byte[] Q(boolean z2) throws Ri0 {
        String strK0 = k0();
        if (strK0 == null) {
            if (z2) {
                throw f("expected base64 encoded string");
            }
            return null;
        }
        byte[] bArrB = Cy0.b(strK0);
        if (bArrB != null) {
            return bArrB;
        }
        throw f("invalid base64 encoding");
    }

    public void W() throws Ri0 {
        int i = i().a;
        if (i != 1 && i != 0) {
            throw f("expected EOL or EOF");
        }
    }

    public byte[] X() {
        return Y(false);
    }

    public byte[] Y(boolean z2) throws Ri0 {
        String strK0 = k0();
        if (strK0 == null) {
            if (z2) {
                throw f("expected hex encoded string");
            }
            return null;
        }
        byte[] bArrA = Ay0.a(strK0);
        if (bArrA != null) {
            return bArrA;
        }
        throw f("invalid hex encoding");
    }

    public byte[] Z() throws Ri0 {
        byte[] bArrA = Ay0.a(b0("a hex string"));
        if (bArrA != null) {
            return bArrA;
        }
        throw f("invalid hex encoding");
    }

    public String a0() {
        return b0("an identifier");
    }

    public long c0() throws Ri0 {
        String strB0 = b0("an integer");
        if (!Character.isDigit(strB0.charAt(0))) {
            throw f("expected an integer");
        }
        try {
            return Long.parseLong(strB0);
        } catch (NumberFormatException unused) {
            throw f("expected an integer");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.s) {
            try {
                this.l.close();
            } catch (IOException unused) {
            }
        }
    }

    public C2848tT d0(C2848tT c2848tT) throws Ri0 {
        try {
            C2848tT c2848tTN = C2848tT.n(b0("a name"), c2848tT);
            if (c2848tTN.q()) {
                return c2848tTN;
            }
            throw new U60(c2848tTN);
        } catch (Ri0 e) {
            throw f(e.getMessage());
        }
    }

    public String e0() throws Ri0 {
        b bVarI = i();
        if (bVarI.b()) {
            return bVarI.b;
        }
        throw f("expected a string");
    }

    public Ri0 f(String str) {
        return new Ri0(this.t + ":" + this.u + ": " + str);
    }

    public long f0() throws Ri0 {
        try {
            return C1707hi0.d(b0("a TTL value"));
        } catch (NumberFormatException unused) {
            throw f("expected a TTL value");
        }
    }

    public long g0() throws Ri0 {
        try {
            return C1707hi0.c(b0("a TTL-like value"), false);
        } catch (NumberFormatException unused) {
            throw f("expected a TTL-like value");
        }
    }

    public int h0() {
        long jC0 = c0();
        if (jC0 < 0 || jC0 > 65535) {
            throw f("expected an 16 bit unsigned integer");
        }
        return (int) jC0;
    }

    public b i() {
        return l(false, false);
    }

    public long i0() throws Ri0 {
        long jC0 = c0();
        if (jC0 < 0 || jC0 > 4294967295L) {
            throw f("expected an 32 bit unsigned integer");
        }
        return jC0;
    }

    public int j0() throws Ri0 {
        long jC0 = c0();
        if (jC0 < 0 || jC0 > 255) {
            throw f("expected an 8 bit unsigned integer");
        }
        return (int) jC0;
    }

    public b l(boolean z2, boolean z3) throws IOException {
        int iR;
        if (this.m) {
            this.m = false;
            b bVar = this.q;
            int i = bVar.a;
            if (i == 2) {
                if (z2) {
                    return bVar;
                }
            } else {
                if (i != 5) {
                    if (i == 1) {
                        this.u++;
                    }
                    return bVar;
                }
                if (z3) {
                    return bVar;
                }
            }
        }
        if (m0() > 0 && z2) {
            return l0(2, null);
        }
        this.r.setLength(0);
        int i2 = 3;
        while (true) {
            int iR2 = R();
            if (iR2 != -1 && this.p.indexOf(iR2) == -1) {
                if (iR2 == 92) {
                    iR2 = R();
                    if (iR2 == -1) {
                        throw f("unterminated escape sequence");
                    }
                    this.r.append('\\');
                } else if (this.f265o && iR2 == 10) {
                    throw f("newline in quoted string");
                }
                this.r.append((char) iR2);
            } else {
                if (iR2 == -1) {
                    if (this.f265o) {
                        throw f("EOF in quoted string");
                    }
                    return this.r.length() == 0 ? l0(0, null) : l0(i2, this.r);
                }
                if (this.r.length() != 0 || i2 == 4) {
                    o0(iR2);
                    if (this.r.length() != 0 || i2 == 4) {
                        return l0(i2, this.r);
                    }
                    a();
                    return l0(0, null);
                }
                if (iR2 == 40) {
                    this.n++;
                    m0();
                } else if (iR2 == 41) {
                    int i3 = this.n;
                    if (i3 <= 0) {
                        throw f("invalid close parenthesis");
                    }
                    this.n = i3 - 1;
                    m0();
                } else if (iR2 == 34) {
                    if (this.f265o) {
                        this.f265o = false;
                        this.p = v;
                        m0();
                    } else {
                        this.f265o = true;
                        this.p = w;
                        i2 = 4;
                    }
                } else {
                    if (iR2 == 10) {
                        return l0(1, null);
                    }
                    if (iR2 != 59) {
                        throw new IllegalStateException();
                    }
                    while (true) {
                        iR = R();
                        if (iR == 10 || iR == -1) {
                            break;
                        }
                        this.r.append((char) iR);
                    }
                    if (z3) {
                        o0(iR);
                        return l0(5, this.r);
                    }
                    if (iR == -1 && i2 != 4) {
                        a();
                        return l0(0, null);
                    }
                    if (this.n <= 0) {
                        return l0(1, null);
                    }
                    m0();
                    this.r.setLength(0);
                }
            }
        }
    }

    public void n0() {
        if (this.m) {
            throw new IllegalStateException("Cannot unget multiple tokens");
        }
        if (this.q.a == 1) {
            this.u--;
        }
        this.m = true;
    }

    public InetAddress p(int i) throws Ri0 {
        try {
            return C1062b2.f(b0("an address"), i);
        } catch (UnknownHostException e) {
            throw f(e.getMessage());
        }
    }

    public byte[] q(int i) throws Ri0 {
        String strB0 = b0("an address");
        byte[] bArrO = C1062b2.o(strB0, i);
        if (bArrO != null) {
            return bArrO;
        }
        throw f("Invalid address: " + strB0);
    }

    public byte[] t(By0 by0) throws Ri0 {
        byte[] bArrB = by0.b(b0("a base32 string"));
        if (bArrB != null) {
            return bArrB;
        }
        throw f("invalid base32 encoding");
    }

    public Fl0(String str) {
        this(new ByteArrayInputStream(str.getBytes()));
    }

    public Fl0(File file) {
        this(new FileInputStream(file));
        this.s = true;
        this.t = file.getName();
    }
}
