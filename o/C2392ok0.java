package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.ok0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2392ok0 {
    public static final char[] t;
    public static final int[] u = {8364, Yu0.b.l0, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, Yu0.b.x0, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final C1207cd a;
    public final C2755sX b;
    public final C2101lk0 i;
    public final C2003kk0 j;
    public AbstractC2198mk0 k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f951o;
    public String p;
    public El0 c = El0.l;
    public AbstractC3015v6 d = null;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);
    public final C1613gk0 l = new C1613gk0(5, 4);
    public final C1808ik0 m = new C1808ik0();
    public final C1711hk0 n = new C1711hk0();
    public int q = -1;
    public final int[] r = new int[1];
    public final int[] s = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        t = cArr;
        Arrays.sort(cArr);
    }

    public C2392ok0(Nm0 nm0) {
        C2101lk0 c2101lk0 = new C2101lk0(2, nm0);
        this.i = c2101lk0;
        this.k = c2101lk0;
        this.j = new C2003kk0(3, nm0);
        this.a = nm0.b;
        this.b = (C2755sX) nm0.a.n;
    }

    public final void a(String str, Object... objArr) {
        C2755sX c2755sX = this.b;
        if (c2755sX.d()) {
            c2755sX.add(new C2658rX(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    public final int[] b(Character ch, boolean z) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        String strC;
        char c5;
        int iIntValue;
        int i3;
        char c6;
        C1207cd c1207cd = this.a;
        if (c1207cd.n()) {
            return null;
        }
        if (ch != null && ch.charValue() == c1207cd.m()) {
            return null;
        }
        char[] cArr = t;
        c1207cd.b();
        if (!c1207cd.n() && Arrays.binarySearch(cArr, c1207cd.a[c1207cd.e]) >= 0) {
            return null;
        }
        if (c1207cd.c - c1207cd.e < 1024) {
            c1207cd.d = 0;
        }
        c1207cd.b();
        c1207cd.g = c1207cd.e;
        boolean zQ = c1207cd.q("#");
        char c7 = 'A';
        int[] iArr = this.r;
        if (zQ) {
            boolean zR = c1207cd.r("X");
            if (zR) {
                c1207cd.b();
                int i4 = c1207cd.e;
                while (true) {
                    i3 = c1207cd.e;
                    if (i3 >= c1207cd.c || (((c6 = c1207cd.a[i3]) < '0' || c6 > '9') && ((c6 < c7 || c6 > 'F') && (c6 < 'a' || c6 > 'f')))) {
                        break;
                    }
                    c1207cd.e = i3 + 1;
                    c7 = 'A';
                }
                strC = C1207cd.c(c1207cd.a, c1207cd.h, i4, i3 - i4);
            } else {
                c1207cd.b();
                int i5 = c1207cd.e;
                while (true) {
                    i2 = c1207cd.e;
                    if (i2 >= c1207cd.c || (c5 = c1207cd.a[i2]) < '0' || c5 > '9') {
                        break;
                    }
                    c1207cd.e = i2 + 1;
                }
                strC = C1207cd.c(c1207cd.a, c1207cd.h, i5, i2 - i5);
            }
            if (strC.length() == 0) {
                a("numeric reference with no numerals", new Object[0]);
                c1207cd.z();
                return null;
            }
            c1207cd.g = -1;
            if (!c1207cd.q(";")) {
                a("missing semicolon on [&#%s]", strC);
            }
            try {
                iIntValue = Integer.valueOf(strC, zR ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || iIntValue > 1114111) {
                a("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128 && iIntValue < 160) {
                    a("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                    iIntValue = u[iIntValue - 128];
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        c1207cd.b();
        int i6 = c1207cd.e;
        while (true) {
            int i7 = c1207cd.e;
            if (i7 >= c1207cd.c || (((c4 = c1207cd.a[i7]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                break;
            }
            c1207cd.e++;
        }
        while (true) {
            i = c1207cd.e;
            if (i >= c1207cd.c || (c3 = c1207cd.a[i]) < '0' || c3 > '9') {
                break;
            }
            c1207cd.e = i + 1;
        }
        String strC2 = C1207cd.c(c1207cd.a, c1207cd.h, i6, i - i6);
        boolean zS = c1207cd.s(';');
        char[] cArr2 = AbstractC0300Aq.a;
        EnumC3469zq enumC3469zq = EnumC3469zq.q;
        int iBinarySearch = Arrays.binarySearch(enumC3469zq.l, strC2);
        if ((iBinarySearch >= 0 ? enumC3469zq.m[iBinarySearch] : -1) == -1) {
            EnumC3469zq enumC3469zq2 = EnumC3469zq.r;
            int iBinarySearch2 = Arrays.binarySearch(enumC3469zq2.l, strC2);
            if ((iBinarySearch2 >= 0 ? enumC3469zq2.m[iBinarySearch2] : -1) == -1 || !zS) {
                c1207cd.z();
                if (zS) {
                    a("invalid named reference [%s]", strC2);
                }
                return null;
            }
        }
        if (z && (c1207cd.v() || ((!c1207cd.n() && (c2 = c1207cd.a[c1207cd.e]) >= '0' && c2 <= '9') || c1207cd.t('=', '-', '_')))) {
            c1207cd.z();
            return null;
        }
        c1207cd.g = -1;
        if (!c1207cd.q(";")) {
            a("missing semicolon on [&%s]", strC2);
        }
        String str = (String) AbstractC0300Aq.b.get(strC2);
        int[] iArr2 = this.s;
        if (str != null) {
            iArr2[0] = str.codePointAt(0);
            iArr2[1] = str.codePointAt(1);
            c = 2;
        } else {
            EnumC3469zq enumC3469zq3 = EnumC3469zq.r;
            int iBinarySearch3 = Arrays.binarySearch(enumC3469zq3.l, strC2);
            int i8 = iBinarySearch3 >= 0 ? enumC3469zq3.m[iBinarySearch3] : -1;
            if (i8 != -1) {
                iArr2[0] = i8;
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            iArr[0] = iArr2[0];
            return iArr;
        }
        if (c == 2) {
            return iArr2;
        }
        throw new C1629gs0("Unexpected characters returned for ".concat(strC2));
    }

    public final AbstractC2198mk0 c(boolean z) {
        AbstractC2198mk0 abstractC2198mk0;
        if (z) {
            abstractC2198mk0 = this.i;
            abstractC2198mk0.C();
        } else {
            abstractC2198mk0 = this.j;
            abstractC2198mk0.C();
        }
        this.k = abstractC2198mk0;
        return abstractC2198mk0;
    }

    public final void d() {
        AbstractC3015v6.D(this.h);
    }

    public final void e(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(c);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void f(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(str);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void g(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
        } else {
            StringBuilder sb2 = this.g;
            if (sb2.length() == 0) {
                sb2.append(this.f);
            }
            sb2.append((CharSequence) sb);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void h(AbstractC3015v6 abstractC3015v6) {
        if (this.e) {
            throw new C1629gs0("Must be false");
        }
        this.d = abstractC3015v6;
        this.e = true;
        abstractC3015v6.getClass();
        C1207cd c1207cd = this.a;
        c1207cd.getClass();
        this.q = -1;
        int i = abstractC3015v6.m;
        if (i == 2) {
            this.f951o = ((C2101lk0) abstractC3015v6).n;
            this.p = null;
        } else if (i == 3) {
            C2003kk0 c2003kk0 = (C2003kk0) abstractC3015v6;
            if (c2003kk0.L()) {
                Object[] objArr = {c2003kk0.f921o};
                C2755sX c2755sX = this.b;
                if (c2755sX.d()) {
                    c2755sX.add(new C2658rX(c1207cd, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void i() {
        h(this.n);
    }

    public final void j() {
        h(this.m);
    }

    public final void k() {
        AbstractC2198mk0 abstractC2198mk0 = this.k;
        if (abstractC2198mk0.t) {
            abstractC2198mk0.N();
        }
        h(this.k);
    }

    public final void l(El0 el0) {
        C2755sX c2755sX = this.b;
        if (c2755sX.d()) {
            c2755sX.add(new C2658rX(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{el0}));
        }
    }

    public final void m(El0 el0) {
        C2755sX c2755sX = this.b;
        if (c2755sX.d()) {
            C1207cd c1207cd = this.a;
            c2755sX.add(new C2658rX(c1207cd, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c1207cd.m()), el0}));
        }
    }

    public final boolean n() {
        if (this.f951o != null) {
            AbstractC2198mk0 abstractC2198mk0 = this.k;
            String str = abstractC2198mk0.n;
            if (str == null || str.length() == 0) {
                throw new C1629gs0("Must be false");
            }
            if (abstractC2198mk0.n.equalsIgnoreCase(this.f951o)) {
                return true;
            }
        }
        return false;
    }

    public final void o(El0 el0) {
        int iOrdinal = el0.ordinal();
        C1207cd c1207cd = this.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                c1207cd.x();
            }
        } else if (this.q == -1) {
            this.q = c1207cd.x();
        }
        this.c = el0;
    }
}
