package o;

import android.util.Base64;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class C5 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5(String str, int i) {
        super(1);
        this.m = i;
        this.n = str;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        boolean z = true;
        String str = this.n;
        switch (this.m) {
            case 0:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "normalizedKid");
                H5 h5 = H5.b;
                return "{\"kty\":\"oct\",\"k\":\"" + str + "\",\"kid\":\"" + Base64.encodeToString(H5.q(str2), 11) + "\"}";
            case 1:
                JN jn = (JN) obj;
                AbstractC1474fG.j(jn, "it");
                return AbstractC1701hf0.h(new StringBuilder(), str, jn.c());
            case 2:
                C1101bX c1101bX = (C1101bX) obj;
                AbstractC1474fG.j(c1101bX, "it");
                return Boolean.valueOf(AbstractC1474fG.b(c1101bX.l, str));
            case 3:
                I60 i60 = (I60) obj;
                AbstractC1474fG.j(i60, "pattern");
                JN jnB = i60.b(str, 0);
                if (jnB != null) {
                    return (String) AbstractC0911Ye.e0(1, jnB.a());
                }
                return null;
            case 4:
                I60 i61 = (I60) obj;
                AbstractC1474fG.j(i61, "pattern");
                JN jnB2 = i61.b(str, 0);
                if (jnB2 != null) {
                    return (String) AbstractC0911Ye.e0(1, jnB2.a());
                }
                return null;
            case 5:
                String str3 = (String) obj;
                AbstractC1474fG.g(str3);
                Integer numJ = AbstractC1802ih0.J(str3);
                int iIntValue = numJ != null ? numJ.intValue() : 0;
                return new Ma0(str + "/" + iIntValue, iIntValue, AbstractC1674hK.n(iIntValue, "Temporada "), null, null, null, 56);
            case 6:
                Cd0 cd0 = (Cd0) obj;
                AbstractC1474fG.j(cd0, "show");
                return Boolean.valueOf((cd0 instanceof C1387eR) && AbstractC1474fG.b(((C1387eR) cd0).a, str));
            case 7:
                I60 i62 = (I60) obj;
                AbstractC1474fG.j(i62, "pattern");
                JN jnB3 = i62.b(str, 0);
                if (jnB3 != null) {
                    return (String) AbstractC0911Ye.e0(1, jnB3.a());
                }
                return null;
            case 8:
                JN jn2 = (JN) obj;
                AbstractC1474fG.j(jn2, "match");
                I60 i63 = SB.a;
                return SB.e((String) ((HN) jn2.a()).get(1), str);
            case 9:
                Ox0 ox0 = (Ox0) obj;
                AbstractC1474fG.j(ox0, "it");
                Locale locale = Locale.ROOT;
                AbstractC1474fG.i(locale, "ROOT");
                String lowerCase = ox0.b.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (!AbstractC1119bh0.W(lowerCase, str, false)) {
                    String lowerCase2 = ox0.c.toLowerCase(locale);
                    AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                    if (!AbstractC1119bh0.W(lowerCase2, str, false)) {
                        String lowerCase3 = ox0.a.toLowerCase(locale);
                        AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                        if (!AbstractC1119bh0.W(lowerCase3, str, false)) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                I60 i64 = (I60) obj;
                AbstractC1474fG.j(i64, "pattern");
                JN jnB4 = i64.b(str, 0);
                if (jnB4 != null) {
                    return (String) AbstractC0911Ye.e0(1, jnB4.a());
                }
                return null;
        }
    }
}
