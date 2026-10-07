package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class N2 implements Comparator {
    public final /* synthetic */ int l;

    public /* synthetic */ N2(int i) {
        this.l = i;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = -1;
        switch (this.l) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
            case 2:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 3:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
            case 4:
                String str = (String) obj;
                String str2 = (String) obj2;
                AbstractC1474fG.j(str, "a");
                AbstractC1474fG.j(str2, "b");
                int iMin = Math.min(str.length(), str2.length());
                int i4 = 4;
                while (true) {
                    if (i4 >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                        }
                    } else {
                        char cCharAt = str.charAt(i4);
                        char cCharAt2 = str2.charAt(i4);
                        if (cCharAt == cCharAt2) {
                            i4++;
                        } else if (AbstractC1474fG.k(cCharAt, cCharAt2) >= 0) {
                        }
                    }
                    return i3;
                }
                i3 = 1;
                return i3;
            case 5:
                LinkedHashMap linkedHashMap = C2379oe.d;
                Integer numValueOf = (Integer) linkedHashMap.get(Integer.valueOf(((C2508pu) obj).b));
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(C2379oe.c.size());
                }
                Integer numValueOf2 = (Integer) linkedHashMap.get(Integer.valueOf(((C2508pu) obj2).b));
                if (numValueOf2 == null) {
                    numValueOf2 = Integer.valueOf(C2379oe.c.size());
                }
                return AbstractC1376eG.j(numValueOf, numValueOf2);
            case 6:
                return AbstractC1376eG.j(((C1387eR) obj).b, ((C1387eR) obj2).b);
            case 7:
                WeakHashMap weakHashMap = It0.a;
                float fM = AbstractC3185wt0.m((View) obj);
                float fM2 = AbstractC3185wt0.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 8:
                return ((C0504Im) obj).a - ((C0504Im) obj2).a;
            case 9:
                String str3 = ((C0613Ms) obj).f;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ((C0613Ms) obj2).f;
                return AbstractC1376eG.j(str3, str4 != null ? str4 : "");
            case 10:
                String str5 = ((C1387eR) obj).b;
                Locale locale = Locale.ROOT;
                String lowerCase = str5.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((C1387eR) obj2).b.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase, lowerCase2);
            case 11:
                String str6 = ((C1387eR) obj).b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str6.toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((C1387eR) obj2).b.toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase3, lowerCase4);
            case 12:
                String str7 = ((C2109lo0) obj).b;
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = str7.toLowerCase(locale3);
                AbstractC1474fG.i(lowerCase5, "toLowerCase(...)");
                String lowerCase6 = ((C2109lo0) obj2).b.toLowerCase(locale3);
                AbstractC1474fG.i(lowerCase6, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase5, lowerCase6);
            case 13:
                String str8 = ((Ds0) obj).m;
                Locale locale4 = Locale.ROOT;
                String strI = AbstractC1701hf0.i(locale4, "ROOT", str8, locale4, "toLowerCase(...)");
                if (AbstractC1119bh0.W(strI, "lat", false) || AbstractC1119bh0.W(strI, "latino", false)) {
                    i = 0;
                } else {
                    i = AbstractC1119bh0.W(strI, "sub", false) ? 1 : 2;
                }
                String lowerCase7 = ((Ds0) obj2).m.toLowerCase(locale4);
                AbstractC1474fG.i(lowerCase7, "toLowerCase(...)");
                if (AbstractC1119bh0.W(lowerCase7, "lat", false) || AbstractC1119bh0.W(lowerCase7, "latino", false)) {
                    i2 = 0;
                } else {
                    i2 = AbstractC1119bh0.W(lowerCase7, "sub", false) ? 1 : 2;
                }
                return AbstractC1376eG.j(i, i2);
            case 14:
                Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.l0(((C3176wp) obj).S(), "player-"));
                Integer numValueOf3 = Integer.valueOf(numJ != null ? numJ.intValue() : 0);
                Integer numJ2 = AbstractC1802ih0.J(AbstractC1119bh0.l0(((C3176wp) obj2).S(), "player-"));
                return AbstractC1376eG.j(numValueOf3, Integer.valueOf(numJ2 != null ? numJ2.intValue() : 0));
            case 15:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 16:
                C1446ez c1446ez = (C1446ez) obj;
                C1446ez c1446ez2 = (C1446ez) obj2;
                RecyclerView recyclerView = c1446ez.d;
                if ((recyclerView == null) == (c1446ez2.d == null)) {
                    boolean z = c1446ez.a;
                    if (z == c1446ez2.a) {
                        i3 = c1446ez2.b - c1446ez.b;
                        if (i3 == 0) {
                            int i5 = c1446ez.c - c1446ez2.c;
                            if (i5 != 0) {
                                return i5;
                            }
                            return 0;
                        }
                    } else if (!z) {
                        i3 = 1;
                    }
                } else if (recyclerView == null) {
                    i3 = 1;
                }
                return i3;
            case 17:
                return AbstractC1376eG.j((Integer) ((C1101bX) obj).l, (Integer) ((C1101bX) obj2).l);
            case 18:
                C2123lv0 c2123lv0B = ((InterfaceC2220mv0) obj2).b();
                Long lValueOf = c2123lv0B != null ? Long.valueOf(c2123lv0B.a) : null;
                C2123lv0 c2123lv0B2 = ((InterfaceC2220mv0) obj).b();
                return AbstractC1376eG.j(lValueOf, c2123lv0B2 != null ? Long.valueOf(c2123lv0B2.a) : null);
            case 19:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 20:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 21:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
            case 22:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 23:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
            case 24:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj2).b), Integer.valueOf(((Ma0) obj).b));
            case 25:
                C2132m00 c2132m00 = (C2132m00) obj;
                String str9 = c2132m00.b;
                if (str9 == null) {
                    str9 = c2132m00.a;
                }
                C2132m00 c2132m01 = (C2132m00) obj2;
                String str10 = c2132m01.b;
                if (str10 == null) {
                    str10 = c2132m01.a;
                }
                return AbstractC1376eG.j(str9, str10);
            case 26:
                return AbstractC1376eG.j(Integer.valueOf(((C2713s00) obj2).c), Integer.valueOf(((C2713s00) obj).c));
            case 27:
                S00 s00 = (S00) obj;
                String str11 = s00.d;
                if (str11 == null) {
                    str11 = s00.c;
                }
                S00 s01 = (S00) obj2;
                String str12 = s01.d;
                if (str12 == null) {
                    str12 = s01.c;
                }
                return AbstractC1376eG.j(str11, str12);
            case 28:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            default:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
        }
    }
}
