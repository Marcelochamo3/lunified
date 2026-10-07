package o;

import com.skidush.clonex.models.Video$Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2379oe implements Q30 {
    public static final C2379oe b = new C2379oe();
    public static final List c;
    public static final LinkedHashMap d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final Set h;
    public static final Set i;
    public static final LinkedHashMap j;
    public static final Rh0 k;

    static {
        List listK = AbstractC0937Ze.K(1, 7, 14, 16, 8, 9, 10, 6, 11, 12, 4, 13, 15, 2, 3, 90);
        c = listK;
        AF af = new AF(0, new io.sentry.android.replay.f(5, listK));
        int iX = AbstractC3327yN.x(AbstractC1016af.O(af, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iX >= 16 ? iX : 16);
        Iterator it = af.iterator();
        while (true) {
            C0739Ro c0739Ro = (C0739Ro) it;
            if (!c0739Ro.m.hasNext()) {
                d = linkedHashMap;
                e = "EVENTOS";
                f = "https://cdn-icons-png.flaticon.com/512/3097/3097980.png";
                g = "es";
                h = Lc0.T("brazers", "penthouse", "playboy", "sextreme", "venus");
                i = AbstractC1370eA.O("venus media");
                j = new LinkedHashMap();
                k = new Rh0(C2428p3.t);
                return;
            }
            C3416zF c3416zF = (C3416zF) c0739Ro.next();
            linkedHashMap.put(Integer.valueOf(((Number) c3416zF.b).intValue()), Integer.valueOf(c3416zF.a));
        }
    }

    public static final String p(Long l) {
        if (l == null) {
            return "Próximo";
        }
        Date date = new Date(l.longValue());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM", Locale.getDefault());
        String str = new SimpleDateFormat(AbstractC1474fG.b(simpleDateFormat.format(date), simpleDateFormat.format(new Date())) ? "HH:mm" : "dd/MM HH:mm", Locale.getDefault()).format(date);
        AbstractC1474fG.i(str, "format(...)");
        return str;
    }

    public static final C3380yu q() {
        return (C3380yu) k.getValue();
    }

    public static List r(String str) {
        Map map;
        LinkedHashMap linkedHashMap = j;
        C1387eR c1387eR = (C1387eR) linkedHashMap.get(str);
        Object obj = (c1387eR == null || (map = c1387eR.n) == null) ? null : map.get("category");
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            return AbstractC0911Ye.x0(linkedHashMap.values());
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (AbstractC1474fG.b(((C1387eR) obj2).n.get("category"), str2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static boolean u(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        Set set = i;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(lowerCase, (String) it.next(), false)) {
                    return false;
                }
            }
        }
        Set set2 = h;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (AbstractC1119bh0.W(lowerCase, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static C1101bX v(String str) {
        AbstractC1474fG.j(str, "name");
        for (String str2 : AbstractC0937Ze.K(" vs ", " v ", " - ", " – ", " — ", " x ")) {
            int iE0 = AbstractC1119bh0.e0(str, str2, 0, true, 2);
            if (iE0 > 0) {
                String strSubstring = str.substring(0, iE0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                String string = AbstractC1119bh0.E0(strSubstring).toString();
                String strSubstring2 = str.substring(str2.length() + iE0);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                String string2 = AbstractC1119bh0.E0(strSubstring2).toString();
                if ((!AbstractC1899jh0.O(string)) && (!AbstractC1899jh0.O(string2))) {
                    return new C1101bX(string, string2);
                }
            }
        }
        return new C1101bX(AbstractC1119bh0.E0(str).toString(), "");
    }

    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2282ne(str, i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1990ke(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2088le(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return f;
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C1892je(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return e;
    }

    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2420oz(str, "", C1233cq.l);
    }

    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        throw new C1783iV();
    }

    @Override // o.Q30
    public final Object k(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        throw new C1783iV();
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return g;
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2185me(ds0, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[ORIG_RETURN, RETURN] */
    public final C1387eR s(String str) {
        AbstractC1474fG.j(str, "currentId");
        List listR = r(str);
        Iterator it = listR.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (AbstractC1474fG.b(((C1387eR) it.next()).a, str)) {
                if (i2 != -1) {
                    return (C1387eR) listR.get((i2 + 1) % listR.size());
                }
                return null;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return (C1387eR) listR.get((i2 + 1) % listR.size());
        }
        return null;
    }

    public final C1387eR t(String str) {
        AbstractC1474fG.j(str, "currentId");
        List listR = r(str);
        Iterator it = listR.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (AbstractC1474fG.b(((C1387eR) it.next()).a, str)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        int size = i2 - 1;
        if (size < 0) {
            size = listR.size() - 1;
        }
        return (C1387eR) listR.get(size);
    }
}
