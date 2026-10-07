package o;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FN implements AutoCloseable {
    private C2848tT l;
    private File m;
    private H50 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f257o;
    private FN p;
    private final Fl0 q;
    private int r;
    private int s;
    private long t;
    private boolean u;
    private C1836iz v;
    private List<C1836iz> w;
    private boolean x;
    private boolean y;
    private boolean z;

    public FN(File file, C2848tT c2848tT, long j) {
        this.n = null;
        this.p = null;
        if (c2848tT != null && !c2848tT.q()) {
            throw new U60(c2848tT);
        }
        this.m = file;
        this.q = new Fl0(file);
        this.l = c2848tT;
        this.f257o = j;
    }

    private C2848tT Q(String str, C2848tT c2848tT) throws Ri0 {
        try {
            return C2848tT.n(str, c2848tT);
        } catch (Ri0 e) {
            throw this.q.f(e.getMessage());
        }
    }

    private void R() throws Ri0 {
        boolean z;
        String strE0 = this.q.e0();
        int iC = C0344Ci.c(strE0);
        this.s = iC;
        if (iC >= 0) {
            strE0 = this.q.e0();
            z = true;
        } else {
            z = false;
        }
        this.t = -1L;
        try {
            this.t = C1707hi0.d(strE0);
            strE0 = this.q.e0();
        } catch (NumberFormatException unused) {
            long j = this.f257o;
            if (j >= 0) {
                this.t = j;
            } else {
                H50 h50 = this.n;
                if (h50 != null) {
                    this.t = h50.x();
                }
            }
        }
        if (!z) {
            int iC2 = C0344Ci.c(strE0);
            this.s = iC2;
            if (iC2 >= 0) {
                strE0 = this.q.e0();
            } else {
                this.s = 1;
            }
        }
        int iF = C3080vp0.f(strE0);
        this.r = iF;
        if (iF < 0) {
            throw this.q.f("Invalid type '" + strE0 + "'");
        }
        if (this.t < 0) {
            if (iF != 6) {
                throw this.q.f("missing TTL");
            }
            this.u = true;
            this.t = 0L;
        }
    }

    private long W(String str) {
        if (!Character.isDigit(str.charAt(0))) {
            return -1L;
        }
        try {
            long j = Long.parseLong(str);
            if (j < 0 || j > 4294967295L) {
                return -1L;
            }
            return j;
        } catch (NumberFormatException unused) {
        }
    }

    private void X() throws Ri0 {
        String strSubstring;
        String strA0 = this.q.a0();
        int iIndexOf = strA0.indexOf("-");
        if (iIndexOf < 0) {
            throw this.q.f("Invalid $GENERATE range specifier: ".concat(strA0));
        }
        String strSubstring2 = strA0.substring(0, iIndexOf);
        String strSubstring3 = strA0.substring(iIndexOf + 1);
        int iIndexOf2 = strSubstring3.indexOf("/");
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring3.substring(iIndexOf2 + 1);
            strSubstring3 = strSubstring3.substring(0, iIndexOf2);
        } else {
            strSubstring = null;
        }
        long jW = W(strSubstring2);
        long jW2 = W(strSubstring3);
        long jW3 = strSubstring != null ? W(strSubstring) : 1L;
        if (jW < 0 || jW2 < 0 || jW > jW2 || jW3 <= 0) {
            throw this.q.f("Invalid $GENERATE range specifier: ".concat(strA0));
        }
        String strA1 = this.q.a0();
        R();
        if (!C1836iz.d(this.r)) {
            throw this.q.f("$GENERATE does not support " + C3080vp0.e(this.r) + " records");
        }
        String strA2 = this.q.a0();
        this.q.W();
        this.q.n0();
        this.v = new C1836iz(jW, jW2, jW3, strA1, this.r, this.s, this.t, strA2, this.l);
        if (this.w == null) {
            this.w = new ArrayList(1);
        }
        this.w.add(this.v);
    }

    private H50 a() throws IOException {
        C2848tT c2848tTV;
        FN fn = this.p;
        if (fn != null) {
            H50 h50K = fn.K();
            if (h50K != null) {
                return h50K;
            }
            this.p = null;
        }
        if (this.v != null) {
            H50 h50T = t();
            if (h50T != null) {
                return h50T;
            }
            l();
        }
        while (true) {
            Fl0.b bVarL = this.q.l(true, false);
            if (bVarL.c() == 2) {
                Fl0.b bVarI = this.q.i();
                if (bVarI.c() != 1) {
                    if (bVarI.c() == 0) {
                        return null;
                    }
                    this.q.n0();
                    H50 h50 = this.n;
                    if (h50 == null) {
                        throw this.q.f("no owner");
                    }
                    c2848tTV = h50.v();
                    break;
                }
            } else if (bVarL.c() == 1) {
                continue;
            } else if (bVarL.c() != 0) {
                if (bVarL.d().charAt(0) != '$') {
                    c2848tTV = Q(bVarL.d(), this.l);
                    H50 h51 = this.n;
                    if (h51 == null || !c2848tTV.equals(h51.v())) {
                        break;
                        break;
                    }
                    c2848tTV = this.n.v();
                    break;
                }
                String strD = bVarL.d();
                if (strD.equalsIgnoreCase("$ORIGIN")) {
                    this.l = this.q.d0(C2848tT.v);
                    this.q.W();
                } else if (strD.equalsIgnoreCase("$TTL")) {
                    this.f257o = this.q.f0();
                    this.q.W();
                } else if (strD.equalsIgnoreCase("$INCLUDE")) {
                    if (!this.y) {
                        String strE0 = this.q.e0();
                        File file = new File(strE0);
                        if (!file.isAbsolute()) {
                            if (this.m == null) {
                                throw this.q.f("Cannot $INCLUDE using relative path when parsing from stream");
                            }
                            file = new File(this.m.getParent(), strE0);
                        }
                        C2848tT c2848tTQ = this.l;
                        Fl0.b bVarI2 = this.q.i();
                        if (bVarI2.b()) {
                            c2848tTQ = Q(bVarI2.d(), C2848tT.v);
                            this.q.W();
                        }
                        this.p = new FN(file, c2848tTQ, this.f257o);
                        return K();
                    }
                    if (this.z) {
                        throw this.q.f("$INCLUDE encountered, but processing disabled in strict mode");
                    }
                    this.q.e0();
                    this.q.W();
                } else {
                    if (!strD.equalsIgnoreCase("$GENERATE")) {
                        throw this.q.f("Invalid directive: ".concat(strD));
                    }
                    if (this.v != null) {
                        throw new IllegalStateException("cannot nest $GENERATE");
                    }
                    X();
                    if (!this.x) {
                        return t();
                    }
                    l();
                }
            } else {
                return null;
            }
        }
        C2848tT c2848tT = c2848tTV;
        R();
        H50 h50O = H50.o(c2848tT, this.r, this.s, this.t, this.q, this.l);
        this.n = h50O;
        if (this.u) {
            long jX = ((C1467f90) h50O).X();
            this.n.L(jX);
            this.f257o = jX;
            this.u = false;
        }
        return this.n;
    }

    private void l() throws Ri0 {
        this.q.W();
        this.v = null;
    }

    private H50 t() throws Ri0 {
        try {
            return this.v.b();
        } catch (Ri0 e) {
            throw this.q.f("Parsing $GENERATE: " + e.getMessage());
        }
    }

    public H50 K() {
        try {
            H50 h50A = a();
            if (h50A == null) {
                this.q.close();
            }
            return h50A;
        } catch (Throwable th) {
            this.q.close();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Fl0 fl0 = this.q;
        if (fl0 != null) {
            fl0.close();
        }
    }

    public void f() {
        i(false);
    }

    public void i(boolean z) {
        this.y = true;
        this.z = z;
    }

    public void p(boolean z) {
        this.x = !z;
    }

    public Iterator<C1836iz> q() {
        List<C1836iz> list = this.w;
        return list != null ? Collections.unmodifiableList(list).iterator() : Collections.emptyIterator();
    }

    public FN(String str, C2848tT c2848tT, long j) {
        this(new File(str), c2848tT, j);
    }

    public FN(String str, C2848tT c2848tT) {
        this(new File(str), c2848tT, -1L);
    }

    public FN(String str) {
        this(new File(str), (C2848tT) null, -1L);
    }

    public FN(InputStream inputStream, C2848tT c2848tT, long j) {
        this.n = null;
        this.p = null;
        if (c2848tT != null && !c2848tT.q()) {
            throw new U60(c2848tT);
        }
        this.q = new Fl0(inputStream);
        this.l = c2848tT;
        this.f257o = j;
    }

    public FN(InputStream inputStream, C2848tT c2848tT) {
        this(inputStream, c2848tT, -1L);
    }

    public FN(InputStream inputStream) {
        this(inputStream, (C2848tT) null, -1L);
    }
}
