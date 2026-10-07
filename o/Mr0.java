package o;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Mr0 {
    public static final byte[] a;
    public static final C2152mB b = AbstractC1468fA.v(new String[0]);
    public static final E50 c;
    public static final DW d;
    public static final TimeZone e;
    public static final I60 f;
    public static final String g;

    static {
        int i;
        int i2 = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        E9 e9 = new E9();
        e9.d0(bArr, 0, 0);
        long j = 0;
        c = new E50(null, j, e9, 1);
        c(j, j, j);
        C2468pa c2468pa = C2468pa.f972o;
        C2468pa[] c2468paArr = {C2691rp.s("efbbbf"), C2691rp.s("feff"), C2691rp.s("fffe"), C2691rp.s("0000ffff"), C2691rp.s("ffff0000")};
        ArrayList arrayListB0 = X5.b0(c2468paArr);
        if (arrayListB0.size() > 1) {
            Collections.sort(arrayListB0);
        }
        ArrayList arrayList = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            C2468pa c2468pa2 = c2468paArr[i3];
            arrayList.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        ArrayList arrayListL = AbstractC0937Ze.L(Arrays.copyOf(numArr, numArr.length));
        int i4 = 0;
        int i5 = 0;
        while (i4 < 5) {
            C2468pa c2468pa3 = c2468paArr[i4];
            int i6 = i5 + 1;
            int size = arrayListB0.size();
            int size2 = arrayListB0.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC1674hK.p("fromIndex (0) is greater than toIndex (", size, ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 > i7) {
                    i = -(i8 + 1);
                    break;
                }
                i = (i8 + i7) >>> 1;
                int iJ = AbstractC1376eG.j((Comparable) arrayListB0.get(i), c2468pa3);
                if (iJ < 0) {
                    i8 = i + 1;
                } else if (iJ <= 0) {
                    break;
                } else {
                    i7 = i - 1;
                }
            }
            arrayListL.set(i, Integer.valueOf(i5));
            i4++;
            i5 = i6;
        }
        if (((C2468pa) arrayListB0.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i9 = 0;
        while (i9 < arrayListB0.size()) {
            C2468pa c2468pa4 = (C2468pa) arrayListB0.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayListB0.size()) {
                C2468pa c2468pa5 = (C2468pa) arrayListB0.get(i11);
                c2468pa5.getClass();
                AbstractC1474fG.j(c2468pa4, "prefix");
                if (!c2468pa5.i(c2468pa4, c2468pa4.d())) {
                    break;
                }
                if (c2468pa5.d() == c2468pa4.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + c2468pa5).toString());
                }
                if (((Number) arrayListL.get(i11)).intValue() > ((Number) arrayListL.get(i9)).intValue()) {
                    arrayListB0.remove(i11);
                    arrayListL.remove(i11);
                } else {
                    i11++;
                }
            }
            i9 = i10;
        }
        E9 e10 = new E9();
        AbstractC1923jt0.e(0L, e10, 0, arrayListB0, 0, arrayListB0.size(), arrayListL);
        int[] iArr = new int[(int) (e10.m / ((long) 4))];
        while (!e10.D()) {
            iArr[i2] = e10.readInt();
            i2++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(c2468paArr, 5);
        AbstractC1474fG.i(objArrCopyOf, "copyOf(this, size)");
        d = new DW((C2468pa[]) objArrCopyOf, iArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC1474fG.g(timeZone);
        e = timeZone;
        f = new I60("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = AbstractC1119bh0.m0(AbstractC1119bh0.l0(OV.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(C2446pE c2446pE, C2446pE c2446pE2) {
        AbstractC1474fG.j(c2446pE, "<this>");
        AbstractC1474fG.j(c2446pE2, "other");
        return AbstractC1474fG.b(c2446pE.d, c2446pE2.d) && c2446pE.e == c2446pE2.e && AbstractC1474fG.b(c2446pE.a, c2446pE2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > C1707hi0.a) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        AbstractC1474fG.j(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC1474fG.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i2, String str, String str2) {
        AbstractC1474fG.j(str, "<this>");
        while (i < i2) {
            if (AbstractC1119bh0.X(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, char c2, int i, int i2) {
        AbstractC1474fG.j(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean h(InterfaceC2091lf0 interfaceC2091lf0, TimeUnit timeUnit) {
        AbstractC1474fG.j(interfaceC2091lf0, "<this>");
        AbstractC1474fG.j(timeUnit, "timeUnit");
        try {
            return u(interfaceC2091lf0, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        AbstractC1474fG.j(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1474fG.j(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                G gH = UK.H(strArr2);
                while (gH.hasNext()) {
                    if (comparator.compare(str, (String) gH.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(C1855j80 c1855j80) {
        String strA = c1855j80.q.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        AbstractC1474fG.j(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC0937Ze.K(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC1474fG.i(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC1474fG.k(cCharAt, 31) <= 0 || AbstractC1474fG.k(cCharAt, Yu0.b.k0) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(int i, String str, int i2) {
        AbstractC1474fG.j(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(int i, String str, int i2) {
        AbstractC1474fG.j(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1474fG.j(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        AbstractC1474fG.j(str, "name");
        return AbstractC1899jh0.N(str, "Authorization", true) || AbstractC1899jh0.N(str, "Cookie", true) || AbstractC1899jh0.N(str, "Proxy-Authorization", true) || AbstractC1899jh0.N(str, "Set-Cookie", true);
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset s(N9 n9, Charset charset) {
        Charset charsetForName;
        AbstractC1474fG.j(n9, "<this>");
        AbstractC1474fG.j(charset, "default");
        int iT = n9.T(d);
        if (iT == -1) {
            return charset;
        }
        if (iT == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC1474fG.i(charset2, "UTF_8");
            return charset2;
        }
        if (iT == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC1474fG.i(charset3, "UTF_16BE");
            return charset3;
        }
        if (iT == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC1474fG.i(charset4, "UTF_16LE");
            return charset4;
        }
        if (iT == 3) {
            Charset charset5 = AbstractC1305dd.a;
            charsetForName = AbstractC1305dd.d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                AbstractC1474fG.i(charsetForName, "forName(...)");
                AbstractC1305dd.d = charsetForName;
            }
        } else {
            if (iT != 4) {
                throw new AssertionError();
            }
            Charset charset6 = AbstractC1305dd.a;
            charsetForName = AbstractC1305dd.c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                AbstractC1474fG.i(charsetForName, "forName(...)");
                AbstractC1305dd.c = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int t(N9 n9) {
        AbstractC1474fG.j(n9, "<this>");
        return (n9.readByte() & 255) | ((n9.readByte() & 255) << 16) | ((n9.readByte() & 255) << 8);
    }

    public static final boolean u(InterfaceC2091lf0 interfaceC2091lf0, int i, TimeUnit timeUnit) {
        AbstractC1474fG.j(interfaceC2091lf0, "<this>");
        AbstractC1474fG.j(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = interfaceC2091lf0.c().e() ? interfaceC2091lf0.c().c() - jNanoTime : Long.MAX_VALUE;
        interfaceC2091lf0.c().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            E9 e9 = new E9();
            while (interfaceC2091lf0.y(e9, 8192L) != -1) {
                e9.p();
            }
            if (jC == Long.MAX_VALUE) {
                interfaceC2091lf0.c().a();
            } else {
                interfaceC2091lf0.c().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                interfaceC2091lf0.c().a();
            } else {
                interfaceC2091lf0.c().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                interfaceC2091lf0.c().a();
            } else {
                interfaceC2091lf0.c().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final C2152mB v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1957kB c1957kB = (C1957kB) it.next();
            String strK = c1957kB.a.k();
            String strK2 = c1957kB.b.k();
            arrayList.add(strK);
            arrayList.add(AbstractC1119bh0.E0(strK2).toString());
        }
        return new C2152mB((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(C2446pE c2446pE, boolean z) {
        int i;
        AbstractC1474fG.j(c2446pE, "<this>");
        String str = c2446pE.d;
        if (AbstractC1119bh0.W(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i2 = c2446pE.e;
        if (!z) {
            String str2 = c2446pE.a;
            AbstractC1474fG.j(str2, "scheme");
            if (AbstractC1474fG.b(str2, "http")) {
                i = 80;
            } else {
                i = AbstractC1474fG.b(str2, "https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List x(List list) {
        AbstractC1474fG.j(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC0911Ye.y0(list));
        AbstractC1474fG.i(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > C1707hi0.a) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String z(int i, String str, int i2) {
        int iN = n(i, str, i2);
        String strSubstring = str.substring(iN, o(iN, str, i2));
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
