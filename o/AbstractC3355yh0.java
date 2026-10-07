package o;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3355yh0 {
    public static final Map a = AbstractC3327yN.z(new C1101bX("es", "es"), new C1101bX("spa", "es"), new C1101bX("esp", "es"), new C1101bX("spanish", "es"), new C1101bX("espanol", "es"), new C1101bX("castellano", "es"), new C1101bX("en", "en"), new C1101bX("eng", "en"), new C1101bX("english", "en"), new C1101bX("ingles", "en"), new C1101bX("pt", "pt"), new C1101bX("por", "pt"), new C1101bX("portuguese", "pt"), new C1101bX("portugues", "pt"), new C1101bX("fr", "fr"), new C1101bX("fra", "fr"), new C1101bX("fre", "fr"), new C1101bX("french", "fr"), new C1101bX("frances", "fr"), new C1101bX("de", "de"), new C1101bX("deu", "de"), new C1101bX("ger", "de"), new C1101bX("german", "de"), new C1101bX("aleman", "de"), new C1101bX("it", "it"), new C1101bX("ita", "it"), new C1101bX("italian", "it"), new C1101bX("italiano", "it"), new C1101bX("ru", "ru"), new C1101bX("rus", "ru"), new C1101bX("russian", "ru"), new C1101bX("ruso", "ru"), new C1101bX("ar", "ar"), new C1101bX("ara", "ar"), new C1101bX("arabic", "ar"), new C1101bX("arabe", "ar"), new C1101bX("ja", "ja"), new C1101bX("jpn", "ja"), new C1101bX("japanese", "ja"), new C1101bX("japones", "ja"), new C1101bX("ko", "ko"), new C1101bX("kor", "ko"), new C1101bX("korean", "ko"), new C1101bX("coreano", "ko"), new C1101bX("zh", "zh"), new C1101bX("zho", "zh"), new C1101bX("chi", "zh"), new C1101bX("chinese", "zh"), new C1101bX("chino", "zh"), new C1101bX("nl", "nl"), new C1101bX("nld", "nl"), new C1101bX("dut", "nl"), new C1101bX("dutch", "nl"), new C1101bX("neerlandes", "nl"), new C1101bX("pl", "pl"), new C1101bX("pol", "pl"), new C1101bX("polish", "pl"), new C1101bX("polaco", "pl"), new C1101bX("tr", "tr"), new C1101bX("tur", "tr"), new C1101bX("turkish", "tr"), new C1101bX("turco", "tr"));

    public static final String a(String str) {
        String string;
        String upperCase = null;
        if (str != null && (string = AbstractC1119bh0.E0(str).toString()) != null) {
            String strS = AbstractC1899jh0.S(string, '_', '-');
            if (strS.length() <= 0) {
                strS = null;
            }
            if (strS != null) {
                String string2 = AbstractC1119bh0.E0(strS).toString();
                Locale locale = Locale.ROOT;
                String strNormalize = Normalizer.normalize(AbstractC1701hf0.i(locale, "ROOT", string2, locale, "toLowerCase(...)"), Normalizer.Form.NFD);
                AbstractC1474fG.i(strNormalize, "normalize(...)");
                Pattern patternCompile = Pattern.compile("\\p{Mn}+");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
                AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                Map map = a;
                String str2 = (String) map.get(strReplaceAll);
                if (str2 != null) {
                    return str2;
                }
                List listS0 = AbstractC1119bh0.s0(strReplaceAll, new char[]{'-'}, 0, 6);
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC1119bh0.E0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!AbstractC1899jh0.O((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                String str3 = (String) AbstractC0911Ye.b0(arrayList2);
                String strA0 = AbstractC1119bh0.A0(str3, ' ', str3);
                String string3 = AbstractC1119bh0.E0(AbstractC1119bh0.A0(strA0, '(', strA0)).toString();
                String str4 = (String) map.get(string3);
                if (str4 == null) {
                    if (string3.length() != 2) {
                        string3 = null;
                        break;
                    }
                    for (int i = 0; i < string3.length(); i++) {
                        if (!Character.isLetter(string3.charAt(i))) {
                            string3 = null;
                            break;
                        }
                    }
                    if (string3 == null) {
                        return null;
                    }
                    str4 = string3;
                }
                String str5 = (String) AbstractC0911Ye.e0(1, arrayList2);
                if (str5 != null) {
                    if (str5.length() != 2) {
                        str5 = null;
                        break;
                    }
                    for (int i2 = 0; i2 < str5.length(); i2++) {
                        if (!Character.isLetter(str5.charAt(i2))) {
                            str5 = null;
                            break;
                        }
                    }
                    if (str5 != null) {
                        Locale locale2 = Locale.ROOT;
                        AbstractC1474fG.i(locale2, "ROOT");
                        upperCase = str5.toUpperCase(locale2);
                        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                    }
                }
                return upperCase == null ? str4 : AbstractC1701hf0.e(str4, "-", upperCase);
            }
        }
        return null;
    }

    public static final String b(String str) {
        String string;
        String str2 = null;
        if (str != null && (string = AbstractC1119bh0.E0(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                String strA = a(string);
                if (strA == null) {
                    if (string.length() <= 0) {
                        return string;
                    }
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    sb.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC3021v9.D(cCharAt, new Locale("es")) : String.valueOf(cCharAt)));
                    String strSubstring = string.substring(1);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    return sb.toString();
                }
                String displayLanguage = Locale.forLanguageTag(strA).getDisplayLanguage(new Locale("es"));
                AbstractC1474fG.g(displayLanguage);
                if ((!AbstractC1899jh0.O(displayLanguage)) && !AbstractC1899jh0.N(displayLanguage, strA, true)) {
                    str2 = displayLanguage;
                }
                if (str2 != null) {
                    string = str2;
                }
                if (string.length() <= 0) {
                    return string;
                }
                StringBuilder sb2 = new StringBuilder();
                char cCharAt2 = string.charAt(0);
                sb2.append((Object) (Character.isLowerCase(cCharAt2) ? AbstractC3021v9.D(cCharAt2, new Locale("es")) : String.valueOf(cCharAt2)));
                String strSubstring2 = string.substring(1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                sb2.append(strSubstring2);
                return sb2.toString();
            }
        }
        return null;
    }
}
