package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: o.mB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2152mB implements Iterable, InterfaceC1770iI {
    public final String[] l;

    public C2152mB(String[] strArr) {
        this.l = strArr;
    }

    public final String a(String str) {
        AbstractC1474fG.j(str, "name");
        String[] strArr = this.l;
        int length = strArr.length - 2;
        int iN = Sr0.n(length, 0, -2);
        if (iN <= length) {
            while (!AbstractC1899jh0.N(str, strArr[length], true)) {
                if (length != iN) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String d(int i) {
        return this.l[i * 2];
    }

    public final Set e() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC1474fG.i(comparator, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(d(i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC1474fG.i(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2152mB) {
            if (Arrays.equals(this.l, ((C2152mB) obj).l)) {
                return true;
            }
        }
        return false;
    }

    public final C2112lq f() {
        C2112lq c2112lq = new C2112lq(1);
        ArrayList arrayList = c2112lq.m;
        AbstractC1474fG.j(arrayList, "<this>");
        String[] strArr = this.l;
        AbstractC1474fG.j(strArr, "elements");
        arrayList.addAll(X5.F(strArr));
        return c2112lq;
    }

    public final TreeMap g() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC1474fG.i(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            Locale locale = Locale.US;
            String strI = AbstractC1701hf0.i(locale, "US", strD, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strI);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strI, arrayList);
            }
            arrayList.add(h(i));
        }
        return treeMap;
    }

    public final String h(int i) {
        return this.l[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.l);
    }

    public final List i(String str) {
        AbstractC1474fG.j(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (AbstractC1899jh0.N(str, d(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i));
            }
        }
        if (arrayList == null) {
            return C1233cq.l;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC1474fG.i(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1101bX[] c1101bXArr = new C1101bX[size];
        for (int i = 0; i < size; i++) {
            c1101bXArr[i] = new C1101bX(d(i), h(i));
        }
        return UK.H(c1101bXArr);
    }

    public final int size() {
        return this.l.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            String strH = h(i);
            sb.append(strD);
            sb.append(": ");
            if (Mr0.q(strD)) {
                strH = "██";
            }
            sb.append(strH);
            sb.append("\n");
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
