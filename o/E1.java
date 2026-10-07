package o;

import android.content.Context;
import android.content.ContextWrapper;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public static final E1 n = new E1(1, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E1 f226o = new E1(1, 1);
    public static final E1 p = new E1(1, 2);
    public static final E1 q = new E1(1, 3);
    public static final E1 r = new E1(1, 4);
    public static final E1 s = new E1(1, 5);
    public static final E1 t = new E1(1, 6);
    public static final E1 u = new E1(1, 7);
    public static final E1 v = new E1(1, 8);
    public static final E1 w = new E1(1, 9);
    public static final E1 x = new E1(1, 10);
    public static final E1 y = new E1(1, 11);
    public static final E1 z = new E1(1, 12);
    public static final E1 A = new E1(1, 13);
    public static final E1 B = new E1(1, 14);
    public static final E1 C = new E1(1, 15);
    public static final E1 D = new E1(1, 16);
    public static final E1 E = new E1(1, 17);
    public static final E1 F = new E1(1, 18);
    public static final E1 G = new E1(1, 19);
    public static final E1 H = new E1(1, 20);
    public static final E1 I = new E1(1, 21);
    public static final E1 J = new E1(1, 22);
    public static final E1 K = new E1(1, 23);
    public static final E1 L = new E1(1, 24);
    public static final E1 M = new E1(1, 25);
    public static final E1 N = new E1(1, 26);
    public static final E1 O = new E1(1, 27);
    public static final E1 P = new E1(1, 28);
    public static final E1 Q = new E1(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E1(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        String strValueOf;
        switch (this.m) {
            case 0:
                Context context = (Context) obj;
                AbstractC1474fG.j(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj).byteValue() & 255)}, 1));
            case 2:
                String str = (String) obj;
                AbstractC1474fG.j(str, "line");
                int iD0 = AbstractC1119bh0.d0(str, '\t', 0, false, 6);
                if (iD0 <= 0) {
                    return null;
                }
                String strSubstring = str.substring(0, iD0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(iD0 + 1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                return new C1101bX(strSubstring, strSubstring2);
            case 3:
                C1101bX c1101bX = (C1101bX) obj;
                AbstractC1474fG.j(c1101bX, "<name for destructuring parameter 0>");
                return AbstractC1701hf0.e((String) c1101bX.l, "=", URLEncoder.encode((String) c1101bX.m, "UTF-8"));
            case 4:
                JN jn = (JN) obj;
                AbstractC1474fG.j(jn, "it");
                String lowerCase = AbstractC1899jh0.R((String) ((HN) jn.a()).get(1), "-", "", false).toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 5:
                InterfaceC0914Yh interfaceC0914Yh = (InterfaceC0914Yh) obj;
                if (interfaceC0914Yh instanceof AbstractC1217ci) {
                    return (AbstractC1217ci) interfaceC0914Yh;
                }
                return null;
            case 6:
                TH th = (TH) obj;
                AbstractC1474fG.j(th, "item");
                return AbstractC2506pt.d(th, "_id");
            case 7:
                Object value = ((Map.Entry) obj).getValue();
                AbstractC1474fG.i(value, "<get-value>(...)");
                return AbstractC2506pt.G((QH) value);
            case 8:
                JN jn2 = (JN) obj;
                AbstractC1474fG.j(jn2, "it");
                return (String) jn2.a().get(1);
            case 9:
                JN jn3 = (JN) obj;
                AbstractC1474fG.j(jn3, "it");
                return jn3.c();
            case 10:
                JN jn4 = (JN) obj;
                AbstractC1474fG.j(jn4, "it");
                return "https:".concat(jn4.c());
            case 11:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj).byteValue() & 255)}, 1));
            case 12:
                JN jn5 = (JN) obj;
                AbstractC1474fG.j(jn5, "it");
                return "https://".concat(jn5.c());
            case 13:
                JN jn6 = (JN) obj;
                AbstractC1474fG.j(jn6, "it");
                return jn6.c();
            case 14:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "w");
                if (str2.length() <= 0) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = str2.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    AbstractC1474fG.i(locale, "ROOT");
                    strValueOf = AbstractC3021v9.D(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                String strSubstring3 = str2.substring(1);
                AbstractC1474fG.i(strSubstring3, "substring(...)");
                sb.append(strSubstring3);
                return sb.toString();
            case 15:
                JN jn7 = (JN) obj;
                AbstractC1474fG.j(jn7, "it");
                return (String) jn7.a().get(1);
            case 16:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "word");
                Locale locale2 = Locale.ROOT;
                String strI = AbstractC1701hf0.i(locale2, "ROOT", str3, locale2, "toLowerCase(...)");
                if (strI.length() <= 0) {
                    return strI;
                }
                StringBuilder sb2 = new StringBuilder();
                char cCharAt2 = strI.charAt(0);
                sb2.append((Object) (Character.isLowerCase(cCharAt2) ? AbstractC3021v9.D(cCharAt2, locale2) : String.valueOf(cCharAt2)));
                String strSubstring4 = strI.substring(1);
                AbstractC1474fG.i(strSubstring4, "substring(...)");
                sb2.append(strSubstring4);
                return sb2.toString();
            case 17:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 18:
                AbstractC1474fG.j((AbstractC2484pi) obj, "$this$initializer");
                return new C0437Fx();
            case 19:
                C1101bX c1101bX2 = (C1101bX) obj;
                AbstractC1474fG.j(c1101bX2, "it");
                return (String) c1101bX2.l;
            case 20:
                C3176wp c3176wp = (C3176wp) obj;
                String strM = c3176wp.M();
                return AbstractC1899jh0.O(strM) ? c3176wp.R() : strM;
            case 21:
                JN jn8 = (JN) obj;
                AbstractC1474fG.j(jn8, "match");
                return jn8.a().get(1) + jn8.a().get(2) + AbstractC1119bh0.D0(128, (String) jn8.a().get(3));
            case 22:
                C1387eR c1387eR = (C1387eR) obj;
                AbstractC1474fG.j(c1387eR, "it");
                return c1387eR.a;
            case 23:
                C0882Xb c0882Xb = (C0882Xb) obj;
                AbstractC1474fG.j(c0882Xb, "it");
                return AbstractC0911Ye.U(c0882Xb.b);
            case 24:
                C1387eR c1387eR2 = (C1387eR) obj;
                AbstractC1474fG.j(c1387eR2, "it");
                return c1387eR2.a;
            case 25:
                C1387eR c1387eR3 = (C1387eR) obj;
                AbstractC1474fG.j(c1387eR3, "it");
                return c1387eR3.a;
            case 26:
                return Boolean.valueOf(obj instanceof C1387eR);
            case 27:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 28:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            default:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }
}
