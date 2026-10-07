package o;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: o.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1207cd {
    public char[] a;
    public Reader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = -1;
    public String[] h = new String[512];
    public ArrayList i = null;
    public int j = 1;
    public boolean k;
    public String l;
    public int m;

    public C1207cd(Reader reader, int i) {
        Sr0.s(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null && i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    public final void A() {
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iO = o(this.f);
                if (iO == -1) {
                    iO = 0;
                }
                Integer num = (Integer) this.i.get(iO);
                num.getClass();
                this.j += iO;
                this.i.clear();
                this.i.add(num);
            }
            for (int i = this.e; i < this.c; i++) {
                if (this.a[i] == '\n') {
                    this.i.add(Integer.valueOf(this.f + 1 + i));
                }
            }
        }
    }

    public final void B() {
        int i = this.e;
        if (i < 1) {
            throw new C2404oq0(new IOException("WTF: No buffer left to unconsume."));
        }
        this.e = i - 1;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        int i;
        int i2;
        boolean z;
        if (this.k || (i = this.e) < this.d) {
            return;
        }
        int i3 = this.g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.b.skip(j);
            this.b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.b;
                char[] cArr = this.a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.k = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.b.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                Sr0.s(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(i4, 24576);
            }
            A();
            this.l = null;
        } catch (IOException e) {
            throw new C2404oq0(e);
        }
    }

    public final void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } finally {
            this.b = null;
            this.a = null;
            this.h = null;
        }
    }

    public final int e(int i) {
        if (!(this.i != null)) {
            return i + 1;
        }
        int iO = o(i);
        return iO == -1 ? i + 1 : (i - ((Integer) this.i.get(iO)).intValue()) + 1;
    }

    public final char f() {
        b();
        int i = this.e;
        char c = i >= this.c ? (char) 65535 : this.a[i];
        this.e = i + 1;
        return c;
    }

    public final String g(boolean z) {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&' || (c == '\'' && z)) {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String h() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String i() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    public final String j(char c) {
        int i;
        b();
        int i2 = this.e;
        while (true) {
            if (i2 >= this.c) {
                i = -1;
                break;
            }
            if (c == this.a[i2]) {
                i = i2 - this.e;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strC = c(this.a, this.h, this.e, i);
            this.e += i;
            return strC;
        }
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i3 = this.e;
        String strC2 = c(cArr, strArr, i3, this.c - i3);
        this.e = this.c;
        return strC2;
    }

    public final String k(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String l(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final char m() {
        b();
        int i = this.e;
        if (i >= this.c) {
            return (char) 65535;
        }
        return this.a[i];
    }

    public final boolean n() {
        b();
        return this.e >= this.c;
    }

    public final int o(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final int p(int i) {
        if (!(this.i != null)) {
            return 1;
        }
        int iO = o(i);
        return iO == -1 ? this.j : iO + this.j + 1;
    }

    public final boolean q(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.a[this.e + i]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean r(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.a[this.e + i])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean s(char c) {
        return !n() && this.a[this.e] == c;
    }

    public final boolean t(char... cArr) {
        if (n()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    public final boolean u() {
        if (n()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public final boolean v() {
        if (n()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    public final int w(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i = this.e;
        while (i < this.c) {
            if (cCharAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (cCharAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int x() {
        return this.f + this.e;
    }

    public final String y() {
        return p(x()) + ":" + e(x());
    }

    public final void z() {
        int i = this.g;
        if (i == -1) {
            throw new C2404oq0(new IOException("Mark invalid"));
        }
        this.e = i;
        this.g = -1;
    }
}
