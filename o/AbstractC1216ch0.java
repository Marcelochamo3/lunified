package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.ch0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1216ch0 extends AbstractC3021v9 {
    public static String G(String str) {
        int length;
        AbstractC1474fG.j(str, "<this>");
        List listQ = Vb0.Q(AbstractC1119bh0.i0(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!AbstractC1899jh0.O((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC3021v9.u(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) AbstractC0911Ye.l0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listQ.size();
        int iJ = AbstractC0937Ze.J(listQ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listQ) {
            int i = length + 1;
            String strSubstring = null;
            if (length < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length != 0 && length != iJ) || !AbstractC1899jh0.O(str3)) {
                AbstractC1474fG.j(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(AbstractC1674hK.p("Requested character count ", iIntValue, " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                AbstractC1474fG.i(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0911Ye.f0(arrayList3, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static String H(String str) {
        AbstractC1474fG.j(str, "<this>");
        if (!(!AbstractC1899jh0.O("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listQ = Vb0.Q(AbstractC1119bh0.i0(str));
        int length = str.length();
        listQ.size();
        int iJ = AbstractC0937Ze.J(listQ);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listQ) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iJ) || !AbstractC1899jh0.O(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC3021v9.u(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && AbstractC1899jh0.T(i3, str2, "|", false)) {
                    strSubstring = str2.substring(i3 + 1);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0911Ye.f0(arrayList, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }
}
