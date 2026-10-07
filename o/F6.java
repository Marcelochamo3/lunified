package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class F6 implements Iterable, Cloneable {
    public int l = 0;
    public String[] m = new String[3];
    public Object[] n = new Object[3];

    public static boolean q(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final void d(F6 f6) {
        int i = f6.l;
        if (i == 0) {
            return;
        }
        g(this.l + i);
        boolean z = this.l != 0;
        E6 e6 = new E6(f6);
        while (e6.hasNext()) {
            D6 d6 = (D6) e6.next();
            if (z) {
                s(d6);
            } else {
                String str = d6.l;
                String str2 = d6.m;
                if (str2 == null) {
                    str2 = "";
                }
                e(str2, str);
            }
        }
    }

    public final void e(Object obj, String str) {
        g(this.l + 1);
        String[] strArr = this.m;
        int i = this.l;
        strArr[i] = str;
        this.n[i] = obj;
        this.l = i + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F6.class != obj.getClass()) {
            return false;
        }
        F6 f6 = (F6) obj;
        if (this.l != f6.l) {
            return false;
        }
        for (int i = 0; i < this.l; i++) {
            int iO = f6.o(this.m[i]);
            if (iO == -1) {
                return false;
            }
            Object obj2 = this.n[i];
            Object obj3 = f6.n[iO];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        Sr0.s(i >= this.l);
        String[] strArr = this.m;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.l * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.m = (String[]) Arrays.copyOf(strArr, i);
        this.n = Arrays.copyOf(this.n, i);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final F6 clone() {
        try {
            F6 f6 = (F6) super.clone();
            f6.l = this.l;
            f6.m = (String[]) Arrays.copyOf(this.m, this.l);
            f6.n = Arrays.copyOf(this.n, this.l);
            return f6;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n) + (((this.l * 31) + Arrays.hashCode(this.m)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new E6(this);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    public final int j(C2852tX c2852tX) {
        String str;
        int i = 0;
        if (this.l == 0) {
            return 0;
        }
        boolean z = c2852tX.b;
        int i2 = 0;
        while (i < this.m.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.m;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (z && strArr[i].equals(str)) {
                    i2++;
                    t(i4);
                    i4--;
                } else if (!z) {
                    String[] strArr2 = this.m;
                    if (strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                        i2++;
                        t(i4);
                        i4--;
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    public final String k(String str) {
        Object obj;
        int iO = o(str);
        return (iO == -1 || (obj = this.n[iO]) == null) ? "" : (String) obj;
    }

    public final String m(String str) {
        Object obj;
        int iP = p(str);
        return (iP == -1 || (obj = this.n[iP]) == null) ? "" : (String) obj;
    }

    public final void n(Appendable appendable, C0634Nn c0634Nn) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.m[i2])) {
                String strB = D6.b(c0634Nn.s, this.m[i2]);
                if (strB != null) {
                    D6.c(strB, (String) this.n[i2], appendable.append(' '), c0634Nn);
                }
            }
        }
    }

    public final int o(String str) {
        Sr0.w(str);
        for (int i = 0; i < this.l; i++) {
            if (str.equals(this.m[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int p(String str) {
        Sr0.w(str);
        for (int i = 0; i < this.l; i++) {
            if (str.equalsIgnoreCase(this.m[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void r(String str, String str2) {
        Sr0.w(str);
        int iO = o(str);
        if (iO != -1) {
            this.n[iO] = str2;
        } else {
            e(str2, str);
        }
    }

    public final void s(D6 d6) {
        Sr0.w(d6);
        String str = d6.m;
        if (str == null) {
            str = "";
        }
        r(d6.l, str);
        d6.n = this;
    }

    public final void t(int i) {
        int i2 = this.l;
        if (i >= i2) {
            throw new C1629gs0("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.m;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.n;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.l - 1;
        this.l = i5;
        this.m[i5] = null;
        this.n[i5] = null;
    }

    public final String toString() {
        StringBuilder sbB = AbstractC1021ah0.b();
        try {
            n(sbB, new C0660On("").u);
            return AbstractC1021ah0.h(sbB);
        } catch (IOException e) {
            throw new C0730Rf(e);
        }
    }
}
