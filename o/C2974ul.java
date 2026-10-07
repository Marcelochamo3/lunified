package o;

/* JADX INFO: renamed from: o.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2974ul {
    public final String a;
    public int b;
    public long c;
    public final CP d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ C3071vl g;

    public C2974ul(C3071vl c3071vl, String str, int i, CP cp) {
        this.g = c3071vl;
        this.a = str;
        this.b = i;
        this.c = cp == null ? -1L : cp.d;
        if (cp == null || !cp.a()) {
            return;
        }
        this.d = cp;
    }

    public final boolean a(C3201x2 c3201x2) {
        CP cp = c3201x2.d;
        if (cp == null) {
            return this.b != c3201x2.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (cp.d > j) {
            return true;
        }
        CP cp2 = this.d;
        if (cp2 == null) {
            return false;
        }
        Fj0 fj0 = c3201x2.b;
        int iB = fj0.b(cp.a);
        int iB2 = fj0.b(cp2.a);
        if (cp.d < cp2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zA = cp.a();
        int i = cp2.b;
        if (!zA) {
            int i2 = cp.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = cp.b;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (cp.c > cp2.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Fj0 fj0, Fj0 fj1) {
        int i = this.b;
        if (i < fj0.p()) {
            C3071vl c3071vl = this.g;
            fj0.o(i, c3071vl.a);
            Ej0 ej0 = c3071vl.a;
            int i2 = ej0.z;
            while (true) {
                if (i2 > ej0.A) {
                    i = -1;
                    break;
                }
                int iB = fj1.b(fj0.m(i2));
                if (iB != -1) {
                    i = fj1.g(iB, c3071vl.b, false).n;
                    break;
                }
                i2++;
            }
        } else if (i >= fj1.p()) {
            i = -1;
            break;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        CP cp = this.d;
        return cp == null || fj1.b(cp.a) != -1;
    }
}
