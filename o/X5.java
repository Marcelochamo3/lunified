package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class X5 extends AbstractC3409z9 {
    public static List F(Object[] objArr) {
        AbstractC1474fG.j(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC1474fG.i(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static boolean G(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean H(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!H((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!AbstractC1474fG.b(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void I(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        AbstractC1474fG.j(bArr, "<this>");
        AbstractC1474fG.j(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void J(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AbstractC1474fG.j(iArr, "<this>");
        AbstractC1474fG.j(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void K(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC1474fG.j(objArr, "<this>");
        AbstractC1474fG.j(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void L(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        K(0, i, i2, objArr, objArr2);
    }

    public static byte[] M(byte[] bArr, int i, int i2) {
        AbstractC1474fG.j(bArr, "<this>");
        AbstractC3409z9.h(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        AbstractC1474fG.i(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static void N(Object[] objArr, J2 j2, int i, int i2) {
        AbstractC1474fG.j(objArr, "<this>");
        Arrays.fill(objArr, i, i2, j2);
    }

    public static ArrayList P(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int Q(Object[] objArr, Object obj) {
        AbstractC1474fG.j(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (AbstractC1474fG.b(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String R(byte[] bArr, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) interfaceC0412Ey.b(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static String S(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            AbstractC3021v9.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static byte[] T(byte[] bArr, byte[] bArr2) {
        AbstractC1474fG.j(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        AbstractC1474fG.g(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char U(char[] cArr) {
        AbstractC1474fG.j(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List V(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return C1233cq.l;
        }
        if (length == 1) {
            return AbstractC2506pt.A(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List W(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? a0(iArr) : AbstractC2506pt.A(Integer.valueOf(iArr[0]));
        }
        return C1233cq.l;
    }

    public static List X(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return C1233cq.l;
        }
        if (length == 1) {
            return AbstractC2506pt.A(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List Y(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? b0(objArr) : AbstractC2506pt.A(objArr[0]);
        }
        return C1233cq.l;
    }

    public static List Z(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return C1233cq.l;
        }
        if (length == 1) {
            return AbstractC2506pt.A(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList a0(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static ArrayList b0(Object[] objArr) {
        AbstractC1474fG.j(objArr, "<this>");
        return new ArrayList(new L5(objArr, false));
    }
}
