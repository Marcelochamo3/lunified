package o;

/* JADX INFO: renamed from: o.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2603qt {
    public static final I60 a = new I60("\\bFanatiz\\b", J60.IGNORE_CASE);

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        I60 i60 = a;
        i60.getClass();
        String strReplaceAll = i60.l.matcher(str).replaceAll("LUMIX");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        String string = AbstractC1119bh0.E0(strReplaceAll).toString();
        if (string == null || !(!AbstractC1899jh0.O(string))) {
            return null;
        }
        return string;
    }
}
