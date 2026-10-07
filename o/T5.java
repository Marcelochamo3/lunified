package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class T5 {
    public final N5 d;
    public C1798if0 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public T5(Na0 na0) {
        this.d = new N5(this, na0);
    }

    public final void a(C2742sK c2742sK, int i) {
        this.d.j(c2742sK.j(i), 1.0f);
        this.d.j(c2742sK.j(i), -1.0f);
    }

    public final void b(C1798if0 c1798if0, C1798if0 c1798if1, C1798if0 c1798if2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(c1798if0, 1.0f);
            this.d.j(c1798if1, -1.0f);
            this.d.j(c1798if2, -1.0f);
        } else {
            this.d.j(c1798if0, -1.0f);
            this.d.j(c1798if1, 1.0f);
            this.d.j(c1798if2, 1.0f);
        }
    }

    public final void c(C1798if0 c1798if0, C1798if0 c1798if1, C1798if0 c1798if2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(c1798if0, 1.0f);
            this.d.j(c1798if1, -1.0f);
            this.d.j(c1798if2, 1.0f);
        } else {
            this.d.j(c1798if0, -1.0f);
            this.d.j(c1798if1, 1.0f);
            this.d.j(c1798if2, -1.0f);
        }
    }

    public C1798if0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final C1798if0 f(boolean[] zArr, C1798if0 c1798if0) {
        int i;
        int iF = this.d.f();
        C1798if0 c1798if1 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iF; i2++) {
            float fH = this.d.h(i2);
            if (fH < 0.0f) {
                C1798if0 c1798if0G = this.d.g(i2);
                if ((zArr == null || !zArr[c1798if0G.m]) && c1798if0G != c1798if0 && (((i = c1798if0G.w) == 3 || i == 4) && fH < f)) {
                    f = fH;
                    c1798if1 = c1798if0G;
                }
            }
        }
        return c1798if1;
    }

    public final void g(C1798if0 c1798if0) {
        C1798if0 c1798if1 = this.a;
        if (c1798if1 != null) {
            this.d.j(c1798if1, -1.0f);
            this.a.n = -1;
            this.a = null;
        }
        float fK = this.d.k(c1798if0, true) * (-1.0f);
        this.a = c1798if0;
        if (fK == 1.0f) {
            return;
        }
        this.b /= fK;
        this.d.d(fK);
    }

    public final void h(C2742sK c2742sK, C1798if0 c1798if0, boolean z) {
        if (c1798if0 == null || !c1798if0.q) {
            return;
        }
        float fE = this.d.e(c1798if0);
        this.b = (c1798if0.p * fE) + this.b;
        this.d.k(c1798if0, z);
        if (z) {
            c1798if0.b(this);
        }
        if (this.d.f() == 0) {
            this.e = true;
            c2742sK.a = true;
        }
    }

    public void i(C2742sK c2742sK, T5 t5, boolean z) {
        float fL = this.d.l(t5, z);
        this.b = (t5.b * fL) + this.b;
        if (z) {
            t5.a.b(this);
        }
        if (this.a == null || this.d.f() != 0) {
            return;
        }
        this.e = true;
        c2742sK.a = true;
    }

    public String toString() {
        boolean z;
        String strD = AbstractC1701hf0.d(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != 0.0f) {
            StringBuilder sbK = AbstractC1701hf0.k(strD);
            sbK.append(this.b);
            strD = sbK.toString();
            z = true;
        } else {
            z = false;
        }
        int iF = this.d.f();
        for (int i = 0; i < iF; i++) {
            C1798if0 c1798if0G = this.d.g(i);
            if (c1798if0G != null) {
                float fH = this.d.h(i);
                if (fH != 0.0f) {
                    String string = c1798if0G.toString();
                    if (z) {
                        if (fH > 0.0f) {
                            strD = AbstractC1701hf0.d(strD, " + ");
                        } else {
                            strD = AbstractC1701hf0.d(strD, " - ");
                            fH *= -1.0f;
                        }
                    } else if (fH < 0.0f) {
                        strD = AbstractC1701hf0.d(strD, "- ");
                        fH *= -1.0f;
                    }
                    strD = fH == 1.0f ? AbstractC1701hf0.d(strD, string) : strD + fH + " " + string;
                    z = true;
                }
            }
        }
        return !z ? AbstractC1701hf0.d(strD, "0.0") : strD;
    }
}
