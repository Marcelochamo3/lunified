package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.dU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1293dU extends AbstractC1976kU {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1293dU(int i, boolean z) {
        super(z);
        this.r = i;
    }

    public static float[] i(String str) {
        AbstractC1474fG.j(str, "value");
        return new float[]{((Number) AbstractC1976kU.i.h(str)).floatValue()};
    }

    public static int[] j(String str) {
        AbstractC1474fG.j(str, "value");
        return new int[]{((Number) AbstractC1976kU.b.h(str)).intValue()};
    }

    public static long[] k(String str) {
        AbstractC1474fG.j(str, "value");
        return new long[]{((Number) AbstractC1976kU.f.h(str)).longValue()};
    }

    public static boolean[] l(String str) {
        AbstractC1474fG.j(str, "value");
        return new boolean[]{((Boolean) AbstractC1976kU.l.h(str)).booleanValue()};
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                return (boolean[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                if (zArr != null) {
                    return X5.Z(zArr);
                }
                return null;
            case 2:
                return (float[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                if (fArr != null) {
                    return X5.V(fArr);
                }
                return null;
            case 4:
                return (int[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                if (iArr != null) {
                    return X5.W(iArr);
                }
                return null;
            case 6:
                return (long[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                if (jArr != null) {
                    return X5.X(jArr);
                }
                return null;
            case 8:
                return (String[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return X5.Y(strArr);
                }
                return null;
        }
    }

    @Override // o.AbstractC1976kU
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // o.AbstractC1976kU
    public final Object c(Object obj, String str) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return l(str);
                }
                boolean[] zArrL = l(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrL, 0, zArrCopyOf, length, 1);
                AbstractC1474fG.g(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                C1390eU c1390eU = AbstractC1976kU.l;
                return list != null ? AbstractC0911Ye.m0(list, AbstractC2506pt.A(c1390eU.h(str))) : AbstractC2506pt.A(c1390eU.h(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return i(str);
                }
                float[] fArrI = i(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrI, 0, fArrCopyOf, length2, 1);
                AbstractC1474fG.g(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                C1390eU c1390eU2 = AbstractC1976kU.i;
                return list2 != null ? AbstractC0911Ye.m0(list2, AbstractC2506pt.A(c1390eU2.h(str))) : AbstractC2506pt.A(c1390eU2.h(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return j(str);
                }
                int[] iArrJ = j(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrJ, 0, iArrCopyOf, length3, 1);
                AbstractC1474fG.g(iArrCopyOf);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                C1390eU c1390eU3 = AbstractC1976kU.b;
                return list3 != null ? AbstractC0911Ye.m0(list3, AbstractC2506pt.A(c1390eU3.h(str))) : AbstractC2506pt.A(c1390eU3.h(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return k(str);
                }
                long[] jArrK = k(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrK, 0, jArrCopyOf, length4, 1);
                AbstractC1474fG.g(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                C1390eU c1390eU4 = AbstractC1976kU.f;
                return list4 != null ? AbstractC0911Ye.m0(list4, AbstractC2506pt.A(c1390eU4.h(str))) : AbstractC2506pt.A(c1390eU4.h(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                AbstractC1474fG.g(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? AbstractC0911Ye.m0(list5, AbstractC2506pt.A(str)) : AbstractC2506pt.A(str);
        }
    }

    @Override // o.AbstractC1976kU
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        switch (this.r) {
            case 0:
                return l(str);
            case 1:
                AbstractC1474fG.j(str, "value");
                return AbstractC2506pt.A(AbstractC1976kU.l.h(str));
            case 2:
                return i(str);
            case 3:
                AbstractC1474fG.j(str, "value");
                return AbstractC2506pt.A(AbstractC1976kU.i.h(str));
            case 4:
                return j(str);
            case 5:
                AbstractC1474fG.j(str, "value");
                return AbstractC2506pt.A(AbstractC1976kU.b.h(str));
            case 6:
                return k(str);
            case 7:
                AbstractC1474fG.j(str, "value");
                return AbstractC2506pt.A(AbstractC1976kU.f.h(str));
            case 8:
                AbstractC1474fG.j(str, "value");
                return new String[]{str};
            default:
                AbstractC1474fG.j(str, "value");
                return AbstractC2506pt.A(str);
        }
    }

    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        float[] fArr;
        long[] jArr;
        switch (this.r) {
            case 0:
                AbstractC1474fG.j(str, "key");
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                AbstractC1474fG.j(str, "key");
                bundle.putBooleanArray(str, list != null ? AbstractC0911Ye.t0(list) : null);
                break;
            case 2:
                AbstractC1474fG.j(str, "key");
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                AbstractC1474fG.j(str, "key");
                if (list2 != null) {
                    fArr = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        fArr[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                } else {
                    fArr = null;
                }
                bundle.putFloatArray(str, fArr);
                break;
            case 4:
                AbstractC1474fG.j(str, "key");
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                AbstractC1474fG.j(str, "key");
                bundle.putIntArray(str, list3 != null ? AbstractC0911Ye.w0(list3) : null);
                break;
            case 6:
                AbstractC1474fG.j(str, "key");
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                AbstractC1474fG.j(str, "key");
                if (list4 != null) {
                    jArr = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        jArr[i2] = ((Number) it2.next()).longValue();
                        i2++;
                    }
                } else {
                    jArr = null;
                }
                bundle.putLongArray(str, jArr);
                break;
            case 8:
                AbstractC1474fG.j(str, "key");
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                AbstractC1474fG.j(str, "key");
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }

    @Override // o.AbstractC1976kU
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        boolArr2[i2] = Boolean.valueOf(zArr2[i2]);
                    }
                }
                return X5.H(boolArr, boolArr2);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return X5.H(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        fArr4[i4] = Float.valueOf(fArr3[i4]);
                    }
                }
                return X5.H(fArr, fArr4);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return X5.H(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i5 = 0; i5 < length5; i5++) {
                        numArr[i5] = Integer.valueOf(iArr[i5]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i6 = 0; i6 < length6; i6++) {
                        numArr2[i6] = Integer.valueOf(iArr2[i6]);
                    }
                }
                return X5.H(numArr, numArr2);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return X5.H(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i7 = 0; i7 < length7; i7++) {
                        lArr[i7] = Long.valueOf(jArr[i7]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i8 = 0; i8 < length8; i8++) {
                        lArr2[i8] = Long.valueOf(jArr2[i8]);
                    }
                }
                return X5.H(lArr, lArr2);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return X5.H(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return X5.H((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return X5.H(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    public final Object h() {
        switch (this.r) {
            case 0:
                return new boolean[0];
            case 1:
                return C1233cq.l;
            case 2:
                return new float[0];
            case 3:
                return C1233cq.l;
            case 4:
                return new int[0];
            case 5:
                return C1233cq.l;
            case 6:
                return new long[0];
            case 7:
                return C1233cq.l;
            case 8:
                return new String[0];
            default:
                return C1233cq.l;
        }
    }

    public final List m(Object obj) {
        switch (this.r) {
            case 0:
                List listZ = X5.Z((boolean[]) obj);
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(listZ, 10));
                Iterator it = listZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                }
                return arrayList;
            case 1:
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                }
                return arrayList2;
            case 2:
                List listV = X5.V((float[]) obj);
                ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(listV, 10));
                Iterator it3 = listV.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                }
                return arrayList3;
            case 3:
                List list2 = (List) obj;
                ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                }
                return arrayList4;
            case 4:
                List listW = X5.W((int[]) obj);
                ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(listW, 10));
                Iterator it5 = listW.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                }
                return arrayList5;
            case 5:
                List list3 = (List) obj;
                ArrayList arrayList6 = new ArrayList(AbstractC1016af.O(list3, 10));
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                }
                return arrayList6;
            case 6:
                List listX = X5.X((long[]) obj);
                ArrayList arrayList7 = new ArrayList(AbstractC1016af.O(listX, 10));
                Iterator it7 = listX.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                }
                return arrayList7;
            case 7:
                List list4 = (List) obj;
                ArrayList arrayList8 = new ArrayList(AbstractC1016af.O(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                }
                return arrayList8;
            case 8:
                String[] strArr = (String[]) obj;
                ArrayList arrayList9 = new ArrayList(strArr.length);
                for (String str : strArr) {
                    arrayList9.add(Uri.encode(str));
                }
                return arrayList9;
            default:
                List list5 = (List) obj;
                ArrayList arrayList10 = new ArrayList(AbstractC1016af.O(list5, 10));
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(Uri.encode((String) it9.next()));
                }
                return arrayList10;
        }
    }
}
