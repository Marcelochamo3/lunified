package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: o.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911Ye extends AbstractC1406ef {
    public static Set A0(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        v0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set B0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        C1722hq c1722hq = C1722hq.l;
        int size = collection.size();
        if (size == 0) {
            return c1722hq;
        }
        if (size == 1) {
            return AbstractC1370eA.O(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3327yN.x(collection.size()));
        v0(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static Y5 U(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        return new Y5(1, iterable);
    }

    public static ArrayList V(int i, List list) {
        ArrayList arrayList;
        Iterator it;
        AbstractC1474fG.j(list, "<this>");
        Jp0.j(i, i);
        if (list instanceof RandomAccess) {
            int size = list.size();
            arrayList = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
            int i2 = 0;
            while (i2 >= 0 && i2 < size) {
                int i3 = size - i2;
                if (i <= i3) {
                    i3 = i;
                }
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList2.add(list.get(i4 + i2));
                }
                arrayList.add(arrayList2);
                i2 += i;
            }
        } else {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            AbstractC1474fG.j(it2, "iterator");
            if (it2.hasNext()) {
                C3446ze0 c3446ze0 = new C3446ze0(i, i, it2, false, true, null);
                Sb0 sb0 = new Sb0();
                sb0.f516o = Ou0.e(sb0, sb0, c3446ze0);
                it = sb0;
            } else {
                it = C1136bq.l;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
        }
        return arrayList;
    }

    public static boolean W(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC1474fG.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                if (AbstractC1474fG.b(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List X(List list) {
        AbstractC1474fG.j(list, "<this>");
        return x0(A0(list));
    }

    public static List Y(int i, List list) {
        AbstractC1474fG.j(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return x0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return C1233cq.l;
        }
        if (size == 1) {
            return AbstractC2506pt.A(i0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList Z(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object a0(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        if (iterable instanceof List) {
            return b0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object b0(List list) {
        AbstractC1474fG.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object c0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object d0(List list) {
        AbstractC1474fG.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object e0(int i, List list) {
        AbstractC1474fG.j(list, "<this>");
        if (i < 0 || i > AbstractC0937Ze.J(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final void f0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(iterable, "<this>");
        AbstractC1474fG.j(charSequence, "separator");
        AbstractC1474fG.j(charSequence2, "prefix");
        AbstractC1474fG.j(charSequence3, "postfix");
        AbstractC1474fG.j(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC3021v9.b(sb, obj, interfaceC0412Ey);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String h0(Iterable iterable, String str, String str2, String str3, InterfaceC0412Ey interfaceC0412Ey, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC0412Ey = null;
        }
        AbstractC1474fG.j(iterable, "<this>");
        AbstractC1474fG.j(str4, "separator");
        AbstractC1474fG.j(str5, "prefix");
        AbstractC1474fG.j(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        f0(iterable, sb, str4, str5, str6, -1, "...", interfaceC0412Ey);
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static Object i0(List list) {
        AbstractC1474fG.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0937Ze.J(list));
    }

    public static Object j0(List list) {
        AbstractC1474fG.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable k0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable l0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList m0(Collection collection, Iterable iterable) {
        AbstractC1474fG.j(collection, "<this>");
        AbstractC1474fG.j(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1406ef.Q(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList n0(Collection collection, Object obj) {
        AbstractC1474fG.j(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object o0(List list, C1947k50 c1947k50) {
        AbstractC1474fG.j(c1947k50, "random");
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return list.get(AbstractC2045l50.m.e(list.size()));
    }

    public static List p0(List list) {
        AbstractC1474fG.j(list, "<this>");
        if (list.size() <= 1) {
            return x0(list);
        }
        List listZ0 = z0(list);
        Collections.reverse(listZ0);
        return listZ0;
    }

    public static List q0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        if (collection.size() <= 1) {
            return x0(collection);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC1474fG.j(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return X5.F(array);
    }

    public static List r0(Iterable iterable, Comparator comparator) {
        AbstractC1474fG.j(iterable, "<this>");
        AbstractC1474fG.j(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listZ0 = z0(iterable);
            if (((ArrayList) listZ0).size() > 1) {
                Collections.sort(listZ0, comparator);
            }
            return listZ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return x0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC1474fG.j(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return X5.F(array);
    }

    public static List s0(int i, List list) {
        AbstractC1474fG.j(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return C1233cq.l;
        }
        if (i >= list.size()) {
            return x0(list);
        }
        if (i == 1) {
            return AbstractC2506pt.A(a0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC0937Ze.M(arrayList);
    }

    public static boolean[] t0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] u0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static void v0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1474fG.j(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] w0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List x0(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC0937Ze.M(z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1233cq.l;
        }
        if (size != 1) {
            return y0(collection);
        }
        return AbstractC2506pt.A(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList y0(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List z0(Iterable iterable) {
        AbstractC1474fG.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return y0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        v0(iterable, arrayList);
        return arrayList;
    }
}
