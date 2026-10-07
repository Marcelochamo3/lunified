package o;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class U9 {
    public static final J2 c;
    public static final J2 d;
    public static boolean g = true;
    public static Field h;
    public static boolean i;
    public final /* synthetic */ int a;
    public static final InterfaceC0473Hh[] b = new InterfaceC0473Hh[0];
    public static final byte[] e = {112, 114, 111, 0};
    public static final byte[] f = {112, 114, 109, 0};

    static {
        int i2 = 10;
        boolean z = false;
        c = new J2(i2, "REMOVED_TASK", z);
        d = new J2(i2, "CLOSED_EMPTY", z);
    }

    public /* synthetic */ U9(int i2) {
        this.a = i2;
    }

    public static C3073vm[] A(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C3073vm[] c3073vmArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C3073vm[0];
        }
        if (i2 != c3073vmArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC3021v9.A(byteArrayInputStream, 2);
            String str = new String(AbstractC3021v9.y(byteArrayInputStream, (int) AbstractC3021v9.A(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jA = AbstractC3021v9.A(byteArrayInputStream, 4);
            int iA = (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            C3073vm c3073vm = null;
            if (c3073vmArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < c3073vmArr.length; i4++) {
                    if (c3073vmArr[i4].b.equals(strSubstring)) {
                        c3073vm = c3073vmArr[i4];
                        break;
                    }
                }
            }
            if (c3073vm == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c3073vm.d = jA;
            int[] iArrX = x(byteArrayInputStream, iA);
            if (Arrays.equals(bArr, AbstractC0397Ej.m)) {
                c3073vm.e = iA;
                c3073vm.h = iArrX;
            }
        }
        return c3073vmArr;
    }

    public static C3073vm[] B(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0397Ej.j)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iA = (int) AbstractC3021v9.A(fileInputStream, 1);
        byte[] bArrZ = AbstractC3021v9.z(fileInputStream, (int) AbstractC3021v9.A(fileInputStream, 4), (int) AbstractC3021v9.A(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrZ);
        try {
            C3073vm[] c3073vmArrC = C(byteArrayInputStream, str, iA);
            byteArrayInputStream.close();
            return c3073vmArrC;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C3073vm[] C(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C3073vm[0];
        }
        C3073vm[] c3073vmArr = new C3073vm[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            int iA2 = (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            c3073vmArr[i3] = new C3073vm(str, new String(AbstractC3021v9.y(byteArrayInputStream, iA), StandardCharsets.UTF_8), AbstractC3021v9.A(byteArrayInputStream, 4), iA2, (int) AbstractC3021v9.A(byteArrayInputStream, 4), (int) AbstractC3021v9.A(byteArrayInputStream, 4), new int[iA2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C3073vm c3073vm = c3073vmArr[i4];
            int iAvailable = byteArrayInputStream.available() - c3073vm.f;
            int iA3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c3073vm.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iA3 += (int) AbstractC3021v9.A(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iA3), 1);
                for (int iA4 = (int) AbstractC3021v9.A(byteArrayInputStream, 2); iA4 > 0; iA4--) {
                    AbstractC3021v9.A(byteArrayInputStream, 2);
                    int iA5 = (int) AbstractC3021v9.A(byteArrayInputStream, 1);
                    if (iA5 != 6 && iA5 != 7) {
                        while (iA5 > 0) {
                            AbstractC3021v9.A(byteArrayInputStream, 1);
                            for (int iA6 = (int) AbstractC3021v9.A(byteArrayInputStream, 1); iA6 > 0; iA6--) {
                                AbstractC3021v9.A(byteArrayInputStream, 2);
                            }
                            iA5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c3073vm.h = x(byteArrayInputStream, c3073vm.e);
            int i5 = c3073vm.g;
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC3021v9.y(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(t(2, i6, i5)) ? 2 : 0;
                if (bitSetValueOf.get(t(4, i6, i5))) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c3073vmArr;
    }

    public static C1326dn0 D(C1326dn0 c1326dn0, String[] strArr, Map map) {
        int i2 = 0;
        if (c1326dn0 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C1326dn0) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1326dn0 c1326dn1 = new C1326dn0();
                int length = strArr.length;
                while (i2 < length) {
                    c1326dn1.a((C1326dn0) map.get(strArr[i2]));
                    i2++;
                }
                return c1326dn1;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1326dn0.a((C1326dn0) map.get(strArr[0]));
                return c1326dn0;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    c1326dn0.a((C1326dn0) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return c1326dn0;
    }

    public static int E(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static XF H(ZF zf, int i2) {
        AbstractC1474fG.j(zf, "<this>");
        e(i2 > 0, Integer.valueOf(i2));
        if (zf.n <= 0) {
            i2 = -i2;
        }
        return new XF(zf.l, zf.m, i2);
    }

    public static String I(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String J(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean K(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C3073vm[] c3073vmArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC0397Ej.i;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC0397Ej.j;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrK = k(c3073vmArr, bArr3);
                AbstractC3021v9.E(byteArrayOutputStream, c3073vmArr.length, 1);
                AbstractC3021v9.E(byteArrayOutputStream, bArrK.length, 4);
                byte[] bArrF = AbstractC3021v9.f(bArrK);
                AbstractC3021v9.E(byteArrayOutputStream, bArrF.length, 4);
                byteArrayOutputStream.write(bArrF);
                return true;
            }
            byte[] bArr4 = AbstractC0397Ej.l;
            if (Arrays.equals(bArr, bArr4)) {
                AbstractC3021v9.E(byteArrayOutputStream, c3073vmArr.length, 1);
                for (C3073vm c3073vm : c3073vmArr) {
                    int size = c3073vm.i.size() * 4;
                    String strQ = q(bArr4, c3073vm.a, c3073vm.b);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC3021v9.F(byteArrayOutputStream, strQ.getBytes(charset).length);
                    AbstractC3021v9.F(byteArrayOutputStream, c3073vm.h.length);
                    AbstractC3021v9.E(byteArrayOutputStream, size, 4);
                    AbstractC3021v9.E(byteArrayOutputStream, c3073vm.c, 4);
                    byteArrayOutputStream.write(strQ.getBytes(charset));
                    Iterator it = c3073vm.i.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC3021v9.F(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        AbstractC3021v9.F(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c3073vm.h) {
                        AbstractC3021v9.F(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC0397Ej.k;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrK2 = k(c3073vmArr, bArr5);
                AbstractC3021v9.E(byteArrayOutputStream, c3073vmArr.length, 1);
                AbstractC3021v9.E(byteArrayOutputStream, bArrK2.length, 4);
                byte[] bArrF2 = AbstractC3021v9.f(bArrK2);
                AbstractC3021v9.E(byteArrayOutputStream, bArrF2.length, 4);
                byteArrayOutputStream.write(bArrF2);
                return true;
            }
            byte[] bArr6 = AbstractC0397Ej.m;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            AbstractC3021v9.F(byteArrayOutputStream, c3073vmArr.length);
            for (C3073vm c3073vm2 : c3073vmArr) {
                String strQ2 = q(bArr6, c3073vm2.a, c3073vm2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC3021v9.F(byteArrayOutputStream, strQ2.getBytes(charset2).length);
                TreeMap treeMap = c3073vm2.i;
                AbstractC3021v9.F(byteArrayOutputStream, treeMap.size());
                AbstractC3021v9.F(byteArrayOutputStream, c3073vm2.h.length);
                AbstractC3021v9.E(byteArrayOutputStream, c3073vm2.c, 4);
                byteArrayOutputStream.write(strQ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC3021v9.F(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c3073vm2.h) {
                    AbstractC3021v9.F(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC3021v9.F(byteArrayOutputStream2, c3073vmArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C3073vm c3073vm3 : c3073vmArr) {
                AbstractC3021v9.E(byteArrayOutputStream2, c3073vm3.c, 4);
                AbstractC3021v9.E(byteArrayOutputStream2, c3073vm3.d, 4);
                AbstractC3021v9.E(byteArrayOutputStream2, c3073vm3.g, 4);
                String strQ3 = q(bArr2, c3073vm3.a, c3073vm3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strQ3.getBytes(charset3).length;
                AbstractC3021v9.F(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strQ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            Xw0 xw0 = new Xw0(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(xw0);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c3073vmArr.length) {
                try {
                    C3073vm c3073vm4 = c3073vmArr[i7];
                    AbstractC3021v9.F(byteArrayOutputStream3, i7);
                    AbstractC3021v9.F(byteArrayOutputStream3, c3073vm4.e);
                    i8 = i8 + 4 + (c3073vm4.e * 2);
                    int[] iArr = c3073vm4.h;
                    int length3 = iArr.length;
                    int i9 = 0;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        AbstractC3021v9.F(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            Xw0 xw1 = new Xw0(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(xw1);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c3073vmArr.length) {
                try {
                    C3073vm c3073vm5 = c3073vmArr[i11];
                    Iterator it3 = c3073vm5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        N(byteArrayOutputStream5, c3073vm5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            O(byteArrayOutputStream6, c3073vm5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            AbstractC3021v9.F(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            AbstractC3021v9.E(byteArrayOutputStream4, length4, 4);
                            AbstractC3021v9.F(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            Xw0 xw2 = new Xw0(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(xw2);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            int i14 = 4;
            AbstractC3021v9.E(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                Xw0 xw3 = (Xw0) arrayList2.get(i15);
                AbstractC3021v9.E(byteArrayOutputStream, AbstractC1701hf0.b(xw3.a), i14);
                AbstractC3021v9.E(byteArrayOutputStream, size2, i14);
                boolean z = xw3.c;
                byte[] bArr7 = xw3.b;
                if (z) {
                    long length5 = bArr7.length;
                    byte[] bArrF3 = AbstractC3021v9.f(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrF3);
                    AbstractC3021v9.E(byteArrayOutputStream, bArrF3.length, 4);
                    AbstractC3021v9.E(byteArrayOutputStream, length5, 4);
                    length = bArrF3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    AbstractC3021v9.E(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC3021v9.E(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
                i14 = 4;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static ZF L(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new ZF(i2, i3 - 1, 1);
        }
        ZF zf = ZF.f654o;
        return ZF.f654o;
    }

    public static void M(ByteArrayOutputStream byteArrayOutputStream, C3073vm c3073vm, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC3021v9.F(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC3021v9.F(byteArrayOutputStream, c3073vm.e);
        AbstractC3021v9.E(byteArrayOutputStream, c3073vm.f, 4);
        AbstractC3021v9.E(byteArrayOutputStream, c3073vm.c, 4);
        AbstractC3021v9.E(byteArrayOutputStream, c3073vm.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, C3073vm c3073vm) throws IOException {
        byte[] bArr = new byte[(((c3073vm.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3073vm.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i2 = iIntValue2 & 2;
            int i3 = c3073vm.g;
            if (i2 != 0) {
                int iT = t(2, iIntValue, i3);
                int i4 = iT / 8;
                bArr[i4] = (byte) ((1 << (iT % 8)) | bArr[i4]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iT2 = t(4, iIntValue, i3);
                int i5 = iT2 / 8;
                bArr[i5] = (byte) ((1 << (iT2 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, C3073vm c3073vm) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c3073vm.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC3021v9.F(byteArrayOutputStream, iIntValue - i2);
                AbstractC3021v9.F(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static Fh0 a() {
        return new Fh0(null);
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void e(boolean z, Number number) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static long f(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float g(float f2, float f3) {
        if (0.0f <= f3) {
            if (f2 < 0.0f) {
                return 0.0f;
            }
            return f2 > f3 ? f3 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum 0.0.");
    }

    public static int h(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long i(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] j(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static byte[] k(C3073vm[] c3073vmArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C3073vm c3073vm : c3073vmArr) {
            length += ((((c3073vm.g * 2) + 7) & (-8)) / 8) + (c3073vm.e * 2) + q(bArr, c3073vm.a, c3073vm.b).getBytes(StandardCharsets.UTF_8).length + 16 + c3073vm.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC0397Ej.k)) {
            for (C3073vm c3073vm2 : c3073vmArr) {
                M(byteArrayOutputStream, c3073vm2, q(bArr, c3073vm2.a, c3073vm2.b));
                O(byteArrayOutputStream, c3073vm2);
                int[] iArr = c3073vm2.h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    AbstractC3021v9.F(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                N(byteArrayOutputStream, c3073vm2);
            }
        } else {
            for (C3073vm c3073vm3 : c3073vmArr) {
                M(byteArrayOutputStream, c3073vm3, q(bArr, c3073vm3.a, c3073vm3.b));
            }
            for (C3073vm c3073vm4 : c3073vmArr) {
                O(byteArrayOutputStream, c3073vm4);
                int[] iArr2 = c3073vm4.h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    AbstractC3021v9.F(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                N(byteArrayOutputStream, c3073vm4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final void l(C2903ty c2903ty) {
        C3421zK c3421zK = new C3421zK();
        Cursor cursorK = c2903ty.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorK.moveToNext()) {
            try {
                c3421zK.add(cursorK.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(cursorK, th);
                    throw th2;
                }
            }
        }
        AbstractC3409z9.g(cursorK, null);
        ListIterator listIterator = AbstractC2506pt.h(c3421zK).listIterator(0);
        while (true) {
            C3324yK c3324yK = (C3324yK) listIterator;
            if (!c3324yK.hasNext()) {
                return;
            }
            String str = (String) c3324yK.next();
            AbstractC1474fG.i(str, "triggerName");
            if (AbstractC1899jh0.U(str, "room_fts_content_sync_", false)) {
                c2903ty.p("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static C1005aZ m(EnumC1103bZ enumC1103bZ, boolean z) {
        AbstractC1474fG.j(enumC1103bZ, "profile");
        int iOrdinal = enumC1103bZ.ordinal();
        if (iOrdinal == 0) {
            return z ? new C1005aZ(50000, 300000, 2500, 3000) : new C1005aZ(8000, 30000, 1000, 2000);
        }
        if (iOrdinal == 1) {
            return z ? new C1005aZ(20000, 90000, 1500, 2500) : new C1005aZ(8000, 45000, 750, 2000);
        }
        if (iOrdinal == 2) {
            return z ? new C1005aZ(15000, 60000, 1500, 4000) : new C1005aZ(6000, 25000, 750, 2500);
        }
        throw new C0730Rf();
    }

    public static boolean n(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2 && ((c2 = (char) ((cCharAt | ' ') - 97)) >= 26 || c2 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static final YT o(View view) {
        AbstractC1474fG.j(view, "view");
        YT yt = (YT) Vb0.I(Vb0.N(Vb0.K(view, C1182cH.B), C1182cH.C));
        if (yt != null) {
            return yt;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static M60 p(S9 s9, ArrayList arrayList) {
        XE xe = AbstractC0985aF.m;
        d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            T9 t9G = s9.g(bundle);
            t9G.getClass();
            int i4 = i3 + 1;
            if (objArrCopyOf.length < i4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, TE.e(objArrCopyOf.length, i4));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i3] = t9G;
                i2++;
                i3++;
            }
            z = false;
            objArrCopyOf[i3] = t9G;
            i2++;
            i3++;
        }
        return AbstractC0985aF.j(i3, objArrCopyOf);
    }

    public static String q(byte[] bArr, String str, String str2) {
        byte[] bArr2 = AbstractC0397Ej.m;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC0397Ej.l;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AbstractC1701hf0.h(AbstractC1701hf0.k(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static final boolean s(String str) {
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        return string.length() > 0 && !AbstractC1899jh0.N(string, "null", true);
    }

    public static int t(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i4;
        }
        throw new IllegalStateException(AbstractC1674hK.n(i2, "Unexpected flag: "));
    }

    public static QH u(WH wh) {
        boolean z = wh.m;
        wh.m = true;
        try {
            try {
                try {
                    QH qhQ = Pu0.q(wh);
                    wh.m = z;
                    return qhQ;
                } catch (OutOfMemoryError e2) {
                    throw new UH("Failed parsing JSON source: " + wh + " to Json", e2);
                }
            } catch (StackOverflowError e3) {
                throw new UH("Failed parsing JSON source: " + wh + " to Json", e3);
            }
        } catch (Throwable th) {
            wh.m = z;
            throw th;
        }
    }

    public static QH v(String str) {
        try {
            WH wh = new WH(new StringReader(str));
            QH qhU = u(wh);
            qhU.getClass();
            if (!(qhU instanceof SH) && wh.j0() != 10) {
                throw new XH("Did not consume the entire document.");
            }
            return qhU;
        } catch (NumberFormatException e2) {
            throw new XH(e2);
        } catch (C2164mN e3) {
            throw new XH(e3);
        } catch (IOException e4) {
            throw new RH(e4);
        }
    }

    public static final Cursor w(F80 f80, G80 g80) {
        AbstractC1474fG.j(f80, "db");
        AbstractC1474fG.j(g80, "sqLiteQuery");
        return f80.l(g80, null);
    }

    public static int[] x(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iA = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iA += (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            iArr[i3] = iA;
        }
        return iArr;
    }

    public static C3073vm[] y(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C3073vm[] c3073vmArr) throws IOException {
        byte[] bArr3 = AbstractC0397Ej.n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC0397Ej.f244o)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iA = (int) AbstractC3021v9.A(fileInputStream, 2);
            byte[] bArrZ = AbstractC3021v9.z(fileInputStream, (int) AbstractC3021v9.A(fileInputStream, 4), (int) AbstractC3021v9.A(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrZ);
            try {
                C3073vm[] c3073vmArrA = A(byteArrayInputStream, bArr2, iA, c3073vmArr);
                byteArrayInputStream.close();
                return c3073vmArrA;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC0397Ej.i, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iA2 = (int) AbstractC3021v9.A(fileInputStream, 1);
        byte[] bArrZ2 = AbstractC3021v9.z(fileInputStream, (int) AbstractC3021v9.A(fileInputStream, 4), (int) AbstractC3021v9.A(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrZ2);
        try {
            C3073vm[] c3073vmArrZ = z(byteArrayInputStream2, iA2, c3073vmArr);
            byteArrayInputStream2.close();
            return c3073vmArrZ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C3073vm[] z(ByteArrayInputStream byteArrayInputStream, int i2, C3073vm[] c3073vmArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C3073vm[0];
        }
        if (i2 != c3073vmArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            iArr[i3] = (int) AbstractC3021v9.A(byteArrayInputStream, 2);
            strArr[i3] = new String(AbstractC3021v9.y(byteArrayInputStream, iA), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C3073vm c3073vm = c3073vmArr[i4];
            if (!c3073vm.b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c3073vm.e = i5;
            c3073vm.h = x(byteArrayInputStream, i5);
        }
        return c3073vmArr;
    }

    public void F(View view, float f2) {
        if (g) {
            try {
                Au0.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        view.setAlpha(f2);
    }

    public void G(View view, int i2) {
        if (!i) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            i = true;
        }
        Field field = h;
        if (field != null) {
            try {
                h.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 15:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public float r(View view) {
        if (g) {
            try {
                return Au0.a(view);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        return view.getAlpha();
    }

    public String toString() {
        switch (this.a) {
            case 15:
                String strB = AbstractC2822t60.a(getClass()).b();
                AbstractC1474fG.g(strB);
                return strB;
            default:
                return super.toString();
        }
    }
}
