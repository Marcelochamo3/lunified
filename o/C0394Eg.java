package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0394Eg {
    public int b;
    public boolean c;
    public final C0731Rg d;
    public final int e;
    public C0394Eg f;
    public C1798if0 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public C0394Eg(C0731Rg c0731Rg, int i) {
        this.d = c0731Rg;
        this.e = i;
    }

    public final void a(C0394Eg c0394Eg, int i) {
        b(c0394Eg, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0394Eg c0394Eg, int i, int i2, boolean z) {
        if (c0394Eg == null) {
            j();
            return true;
        }
        if (!z && !i(c0394Eg)) {
            return false;
        }
        this.f = c0394Eg;
        if (c0394Eg.a == null) {
            c0394Eg.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C1539fw0 c1539fw0) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0397Ej.l(((C0394Eg) it.next()).d, i, arrayList, c1539fw0);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        C0394Eg c0394Eg;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0394Eg = this.f) == null || c0394Eg.d.g0 != 8) ? this.g : i;
    }

    public final C0394Eg f() {
        int i = this.e;
        int iW = AbstractC1701hf0.w(i);
        C0731Rg c0731Rg = this.d;
        switch (iW) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0731Rg.K;
            case 2:
                return c0731Rg.L;
            case 3:
                return c0731Rg.I;
            case 4:
                return c0731Rg.J;
            default:
                throw new AssertionError(AbstractC1701hf0.v(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0394Eg) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(C0394Eg c0394Eg) {
        if (c0394Eg == null) {
            return false;
        }
        int i = this.e;
        C0731Rg c0731Rg = c0394Eg.d;
        int i2 = c0394Eg.e;
        if (i2 == i) {
            return i != 6 || (c0731Rg.E && this.d.E);
        }
        switch (AbstractC1701hf0.w(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c0731Rg instanceof HA) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c0731Rg instanceof HA) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC1701hf0.v(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0394Eg c0394Eg = this.f;
        if (c0394Eg != null && (hashSet = c0394Eg.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        C1798if0 c1798if0 = this.i;
        if (c1798if0 == null) {
            this.i = new C1798if0(1);
        } else {
            c1798if0.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + AbstractC1701hf0.v(this.e);
    }
}
