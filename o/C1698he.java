package o;

import java.util.Comparator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1698he implements Comparator {
    public final /* synthetic */ int l;
    public final /* synthetic */ Comparator m;

    public /* synthetic */ C1698he(Comparator comparator, int i) {
        this.l = i;
        this.m = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.l) {
            case 0:
                int iCompare = this.m.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                long j = ((C2508pu) obj).i;
                if (j == null) {
                    j = Long.MAX_VALUE;
                }
                long j2 = ((C2508pu) obj2).i;
                if (j2 == null) {
                    j2 = Long.MAX_VALUE;
                }
                return AbstractC1376eG.j(j, j2);
            case 1:
                int iCompare2 = this.m.compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC1376eG.j(Boolean.valueOf(((C2508pu) obj2).j), Boolean.valueOf(((C2508pu) obj).j));
            case 2:
                int iCompare3 = this.m.compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                Ds0 ds0 = (Ds0) obj;
                StringBuilder sbS = AbstractC1674hK.s(ds0.m, " ");
                sbS.append(ds0.l);
                String string = sbS.toString();
                Locale locale = Locale.ROOT;
                String strI = AbstractC1701hf0.i(locale, "ROOT", string, locale, "toLowerCase(...)");
                if (AbstractC1119bh0.W(strI, "vidhide", false) || AbstractC1119bh0.W(strI, "filemoon", false) || AbstractC1119bh0.W(strI, "streamwish", false) || AbstractC1119bh0.W(strI, "uqload", false)) {
                    i = 0;
                } else {
                    i = (AbstractC1119bh0.W(strI, "voe", false) || AbstractC1119bh0.W(strI, "streamtape", false) || AbstractC1119bh0.W(strI, "dood", false)) ? 1 : 2;
                }
                Ds0 ds1 = (Ds0) obj2;
                StringBuilder sbS2 = AbstractC1674hK.s(ds1.m, " ");
                sbS2.append(ds1.l);
                String lowerCase = sbS2.toString().toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (AbstractC1119bh0.W(lowerCase, "vidhide", false) || AbstractC1119bh0.W(lowerCase, "filemoon", false) || AbstractC1119bh0.W(lowerCase, "streamwish", false) || AbstractC1119bh0.W(lowerCase, "uqload", false)) {
                    i2 = 0;
                } else {
                    i2 = (AbstractC1119bh0.W(lowerCase, "voe", false) || AbstractC1119bh0.W(lowerCase, "streamtape", false) || AbstractC1119bh0.W(lowerCase, "dood", false)) ? 1 : 2;
                }
                return AbstractC1376eG.j(i, i2);
            case 3:
                int iCompare4 = this.m.compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                String strOptString = ((JSONObject) obj).optString("name");
                AbstractC1474fG.i(strOptString, "optString(...)");
                Locale locale2 = Locale.ROOT;
                String strI2 = AbstractC1701hf0.i(locale2, "ROOT", strOptString, locale2, "toLowerCase(...)");
                String strOptString2 = ((JSONObject) obj2).optString("name");
                AbstractC1474fG.i(strOptString2, "optString(...)");
                AbstractC1474fG.i(locale2, "ROOT");
                String lowerCase2 = strOptString2.toLowerCase(locale2);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                return AbstractC1376eG.j(strI2, lowerCase2);
            case 4:
                int iCompare5 = this.m.compare(obj, obj2);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                String strOptString3 = ((JSONObject) obj2).optString("updateTime");
                AbstractC1474fG.i(strOptString3, "optString(...)");
                String strD0 = AbstractC1119bh0.D0(10, strOptString3);
                String strOptString4 = ((JSONObject) obj).optString("updateTime");
                AbstractC1474fG.i(strOptString4, "optString(...)");
                return AbstractC1376eG.j(strD0, AbstractC1119bh0.D0(10, strOptString4));
            case 5:
                int iCompare6 = this.m.compare(obj, obj2);
                if (iCompare6 != 0) {
                    return iCompare6;
                }
                int i3 = ((Ox0) obj).d;
                if (i3 == null) {
                    i3 = Integer.MAX_VALUE;
                }
                int i4 = ((Ox0) obj2).d;
                if (i4 == null) {
                    i4 = Integer.MAX_VALUE;
                }
                return AbstractC1376eG.j(i3, i4);
            default:
                int iCompare7 = this.m.compare(obj, obj2);
                if (iCompare7 != 0) {
                    return iCompare7;
                }
                String str = ((Ox0) obj).b;
                Locale locale3 = Locale.ROOT;
                return AbstractC1376eG.j(AbstractC1701hf0.i(locale3, "ROOT", str, locale3, "toLowerCase(...)"), AbstractC1701hf0.i(locale3, "ROOT", ((Ox0) obj2).b, locale3, "toLowerCase(...)"));
        }
    }
}
