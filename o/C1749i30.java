package o;

import android.view.View;
import java.util.Comparator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.i30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1749i30 implements Comparator {
    public final /* synthetic */ int l;

    public /* synthetic */ C1749i30(int i) {
        this.l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                return ((C1798if0) obj).m - ((C1798if0) obj2).m;
            case 1:
                String str = ((C1164c40) obj).b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((C1164c40) obj2).b.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase, lowerCase2);
            case 2:
                String str2 = ((C1359e40) obj).b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((C1359e40) obj2).b.toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase3, lowerCase4);
            case 3:
                return AbstractC1376eG.j(((Q30) obj).getName(), ((Q30) obj2).getName());
            case 4:
                C2123lv0 c2123lv0 = ((C0456Gq) obj2).j;
                Long lValueOf = c2123lv0 != null ? Long.valueOf(c2123lv0.a) : null;
                C2123lv0 c2123lv1 = ((C0456Gq) obj).j;
                return AbstractC1376eG.j(lValueOf, c2123lv1 != null ? Long.valueOf(c2123lv1.a) : null);
            case 5:
                C2123lv0 c2123lv2 = ((C0456Gq) obj2).j;
                Long lValueOf2 = c2123lv2 != null ? Long.valueOf(c2123lv2.a) : null;
                C2123lv0 c2123lv3 = ((C0456Gq) obj).j;
                return AbstractC1376eG.j(lValueOf2, c2123lv3 != null ? Long.valueOf(c2123lv3.a) : null);
            case 6:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 7:
                return AbstractC1376eG.j((Integer) ((C1101bX) obj).l, (Integer) ((C1101bX) obj2).l);
            case 8:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 9:
                C2123lv0 c2123lv4 = ((C0456Gq) obj2).j;
                Long lValueOf3 = c2123lv4 != null ? Long.valueOf(c2123lv4.a) : null;
                C2123lv0 c2123lv5 = ((C0456Gq) obj).j;
                return AbstractC1376eG.j(lValueOf3, c2123lv5 != null ? Long.valueOf(c2123lv5.a) : null);
            case 10:
                C2123lv0 c2123lv6 = ((C0456Gq) obj2).j;
                Long lValueOf4 = c2123lv6 != null ? Long.valueOf(c2123lv6.a) : null;
                C2123lv0 c2123lv7 = ((C0456Gq) obj).j;
                return AbstractC1376eG.j(lValueOf4, c2123lv7 != null ? Long.valueOf(c2123lv7.a) : null);
            case 11:
                C2123lv0 c2123lv8 = ((C0456Gq) obj2).j;
                Long lValueOf5 = c2123lv8 != null ? Long.valueOf(c2123lv8.a) : null;
                C2123lv0 c2123lv9 = ((C0456Gq) obj).j;
                return AbstractC1376eG.j(lValueOf5, c2123lv9 != null ? Long.valueOf(c2123lv9.a) : null);
            case 12:
                return AbstractC1376eG.j(Integer.valueOf(((C0456Gq) obj).b), Integer.valueOf(((C0456Gq) obj2).b));
            case 13:
                return AbstractC1376eG.j(Integer.valueOf(((Ma0) obj).b), Integer.valueOf(((Ma0) obj2).b));
            case 14:
                String strOptString = ((JSONObject) obj2).optString("releaseTime");
                AbstractC1474fG.i(strOptString, "optString(...)");
                String strD0 = AbstractC1119bh0.D0(10, strOptString);
                String strOptString2 = ((JSONObject) obj).optString("releaseTime");
                AbstractC1474fG.i(strOptString2, "optString(...)");
                return AbstractC1376eG.j(strD0, AbstractC1119bh0.D0(10, strOptString2));
            case 15:
                return AbstractC1376eG.j(Integer.valueOf(((JSONObject) obj).optInt("serial_number", Integer.MAX_VALUE)), Integer.valueOf(((JSONObject) obj2).optInt("serial_number", Integer.MAX_VALUE)));
            default:
                return AbstractC1376eG.j(Boolean.valueOf(((Ox0) obj).d == null), Boolean.valueOf(((Ox0) obj2).d == null));
        }
    }
}
